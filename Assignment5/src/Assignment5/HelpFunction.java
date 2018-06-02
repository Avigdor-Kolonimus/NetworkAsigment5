/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment5;
//libraries
import com.csvreader.CsvWriter;
import java.awt.HeadlessException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * class for Port scanning
 * @author Alexey Titov
 * @version 1
 */
public class HelpFunction {
    //the function scanning ports
    public List<PORT> Scanning(int method,String IP,int sleep)
    {
        if (method==2 && sleep<1)
            return null;
        return Scanning.scanning(IP,method,sleep);
    }
    /**
     * the function write csv file
     * @param list list of data for csv file
     * @param IP of comp that was scanning
     */
    public void WriteCSV(List<PORT> list,String IP)
    {
        //variable
        String OUTcsvFile="";                                  //output csv file
        //select the location of the file
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.CSV","*.*");
        JFileChooser fc = new JFileChooser();
        fc.setFileFilter(filter);
        if ( fc.showSaveDialog(null) == JFileChooser.APPROVE_OPTION ) {
            try {
                //user wrote at the end csv
                if (fc.getSelectedFile().getAbsolutePath().substring(fc.getSelectedFile().getAbsolutePath().length()-4).equals(".csv"))
                    OUTcsvFile=fc.getSelectedFile().getAbsolutePath();
                else    //user did not wrote at the end csv
                    OUTcsvFile=fc.getSelectedFile().getAbsolutePath()+".csv";
            }catch (Exception e ) {
                JOptionPane.showMessageDialog(null, "an error occurred, the file was not saved.\ngoodbye");
                return;
            }
        }
        else    //user did not select a file to save
        {
            JOptionPane.showMessageDialog(null, "you did not select a file to save,\ngoodbye");
            return;
        }
        try {
            //use FileWriter constructor that specifies open for appending
            CsvWriter csvOutput = new CsvWriter(new FileWriter(OUTcsvFile, false), ',');
            //headers for first row
            csvOutput.write("IP");  csvOutput.write("PORT");    csvOutput.write("STATUS");
            csvOutput.endRecord();
            //write out a few rows
            for(int i=0;i<list.size();i++)              //write rows of data scaning
            {
                String[] tmp={IP,String.valueOf(list.get(i).getPort()),list.get(i).getStatus()};
                csvOutput.writeRecord(tmp);
            }
            csvOutput.close();
            JOptionPane.showMessageDialog(null, "csv record saved");
        } catch (IOException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "csv record not saved");
        }
    }
    /**
     * the function does brute force and return username and password
     * @param users-path to user dictionary
     * @param passwords-path to password dictionary
     * @param host IP
     * @param port that be open
     * @return username:password
     */
    public String BruteForce(String users,String passwords,String host,String port)
    {
        String args[]={host,port,users,passwords};
        SSHBRUTE tmp=new SSHBRUTE();
        return tmp.BFssh(args);
    }
}
