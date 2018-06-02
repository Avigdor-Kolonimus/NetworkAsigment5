/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment5;
//libraries
import java.io.IOException;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CyclicBarrier;
/**
 * class for Port scanning
 * @author Alexey Titov
 * @version 1
 */
public class Scanning {
    //variables
    public static final int MIN_PORTS_PER_THREAD = 20;      //ports for one therad
    public static final int MAX_THREADS = 0xFF;             //number of threads
    public static InetAddress inetAddress;
    public static List<Integer> allPorts;                          //ports for scanning
    public static List<Integer> allOpenPorts = new ArrayList<Integer>();   //list of open ports
    public static List<Integer> allClosePorts = new ArrayList<Integer>();  //list of close ports
    public static List<PortScanWorker> workers = new ArrayList<PortScanWorker>(MAX_THREADS);
    //scanning
    public static List<PORT> scanning(String arg1,int arg2,int arg3) 
    {
        List<PORT> tmp=new ArrayList<>();
        processArgs(arg1,arg2);
        if (allPorts.size()/MIN_PORTS_PER_THREAD > MAX_THREADS ) {
            final int PORTS_PER_THREAD = allPorts.size()/MAX_THREADS;
 
            List<Integer> threadPorts = new ArrayList<>();
            for (int i=0,counter=0; i<allPorts.size();i++,counter++) {
                if (counter<PORTS_PER_THREAD) {
                    threadPorts.add(allPorts.get(i));
                } else {
                    PortScanWorker psw = new PortScanWorker();
                    psw.setInetAddress(inetAddress);
                    if (arg3>0 && arg2==1)
                        psw.setSleep(arg3);
                    psw.setPorts(new ArrayList<>(threadPorts));
                    workers.add(psw);
                    threadPorts.clear();
                    counter=0;
                }
            }
            PortScanWorker psw = new PortScanWorker();
            psw.setInetAddress(inetAddress);
            if (arg3>0 && arg2==1)
                psw.setSleep(arg3);
            psw.setPorts(new ArrayList<>(threadPorts));
            workers.add(psw);
        } else {
            List<Integer> threadPorts = new ArrayList<>();
            for (int i=0,counter=0; i<allPorts.size();i++,counter++) {
                if (counter<MIN_PORTS_PER_THREAD) {
                    threadPorts.add(allPorts.get(i));
                } else {
                    PortScanWorker psw = new PortScanWorker();
                    psw.setInetAddress(inetAddress);
                    if (arg3>0 && arg2==1)
                        psw.setSleep(arg3);
                    psw.setPorts(new ArrayList<>(threadPorts));
                    workers.add(psw);
                    threadPorts.clear();
                    counter=0;
                }
            }
            PortScanWorker psw = new PortScanWorker();
            psw.setInetAddress(inetAddress);
            if (arg3>0 && arg2==1)
                psw.setSleep(arg3);
            psw.setPorts(new ArrayList<>(threadPorts));
            workers.add(psw);                         
        }
 
        Runnable summarizer = new Runnable() {
            public void run()
            {
                for (PortScanWorker psw : workers) {
                    List<Integer> openPorts = psw.getOpenPorts();
                    List<Integer> closePorts = psw.getClosePorts();
                    allOpenPorts.addAll(openPorts);
                    allClosePorts.addAll(closePorts);
                }
                //sort lists
                Collections.sort(allOpenPorts);
                Collections.sort(allClosePorts);
            }
        };
 
        CyclicBarrier barrier = new CyclicBarrier(workers.size(),summarizer);
 
        for (PortScanWorker psw : workers) {
            psw.setBarrier(barrier);
        }
        //start of threads
        List<Thread> threads = new ArrayList<>();
        for (PortScanWorker psw : workers) {
            threads.add(new Thread(psw));
        }
        for (Thread thread: threads) {
            thread.start();
        }
        //waiting for the end of all threads
        for (Thread thread: threads) {
            try {
                thread.join();
            } catch (InterruptedException ex) {
            }
        }
        //foreach for open ports
       for (Integer open : allOpenPorts) {
           tmp.add(new PORT(open,"OPEN"));
       }
               
       //foreach for close ports
       for (Integer close : allClosePorts) {
           tmp.add(new PORT(close,"Close"));
       }
       return tmp;
    }
    /**
     * choose method
     * @param arg IP
     * @param method that user choose
     */
	public static void processArgs(String arg,int method) {
        if (arg.length() < 1) {
            System.exit(1);
        }
        String host = arg;
        try {
            inetAddress = InetAddress.getByName(host);
        } catch (IOException ioe) {
            System.out.println("Error when resolving host!");
            System.exit(2);
        }
 
        int minPort = 0;
        int maxPort = 0x10000-1;
 
        if (method==3) {
            allPorts = new ArrayList<>();
            allPorts.add(22); 	allPorts.add(25);	 allPorts.add(53);	 allPorts.add(69);	 allPorts.add(22);
            allPorts.add(80);	allPorts.add(110);	 allPorts.add(123);	 allPorts.add(135);	 allPorts.add(137);
            allPorts.add(443);  allPorts.add(700);	 allPorts.add(1010); allPorts.add(1052); allPorts.add(1433);
            allPorts.add(3389);		allPorts.add(5353);
            return;
        }
        allPorts = new ArrayList<>(maxPort-minPort+1);
        for (int i=minPort; i<=maxPort; i++) {
            allPorts.add(i);
        }        
    } 
}
