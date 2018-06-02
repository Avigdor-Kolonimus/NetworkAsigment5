package Assignment5;
//libraries
import java.net.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
/**
 * class for Port scanning
 * @author Alexey Titov
 * @version 1
 */
public class PortScanWorker implements Runnable {
    //variables
    static int globalId = 1;            //id of thread
    private int id;                     //private id
    private List<Integer> ports;        //list of ports
    private List<Integer> openPorts;    //list open ports
    private List<Integer> closePorts;   //list close ports
    private InetAddress inetAddress;    //hostname
    private int team=10;                //team of ports
    private int sleep=0;                //sleep for thread
    private int timeout = 200;          //timeout for socket
    CyclicBarrier barrier;
    /**
     * Constructor
     */
    public PortScanWorker() {
        id = globalId++;
    }
    /**
     * get id of thread
     * @return id of thread
     */
    public int getId() {
        return id;
    }
 
    public void setBarrier(CyclicBarrier barrier) {
        this.barrier = barrier;
    }
    /**
     * get timeout of socket
     * @return timeout
     */
    public int getTimeout() {
        return timeout;
    }
    /**
     * set new timeout of socket
     * @param timeout for scan
     */
    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }
    /**
     * set sleep for thread
     * @param s number of millisecond for sleep
     */
    public void setSleep(int s) {
        this.sleep = s;
    }     
    /**
     * get list openports
     * @return list open ports
     */
    public List<Integer> getOpenPorts() {
        return openPorts;
    }
    /**
     * get list close ports
     * @return list close ports
     */
    public List<Integer> getClosePorts() {
        return closePorts;
    }
    /**
     * set ip
     * @param inetAddress IP
     */
    public void setInetAddress(InetAddress inetAddress) {
        this.inetAddress = inetAddress;
    }
    /**
     * list ports for check
     * @param ports set list ports
     */
    public void setPorts(List<Integer> ports) {
        this.ports = ports;
    }
    /**
     * run
     */
    public void run() {
        System.out.println("Started thread with id = " + id);
        scan(inetAddress);
        try {
            barrier.await(); 
        } catch (InterruptedException | BrokenBarrierException ex) { 
            return; 
        }
    }
 
    public void scan(InetAddress inetAddress) {
        openPorts = new ArrayList<>();
        closePorts = new ArrayList<>();
        for (Integer port : ports) {
            if (team==0 && sleep!=0)
            {
                team=0;
                try {
                    TimeUnit.MILLISECONDS.sleep(this.sleep);
                } catch (InterruptedException ex) {
                }
            }
            try {
                InetSocketAddress isa = new InetSocketAddress(inetAddress,port);
                Socket socket = new Socket();
                socket.connect(isa,timeout);
                openPorts.add(port);
                socket.close();
            } catch (IOException ioe) {       
                closePorts.add(port);
            }
            team--;
        }
        System.out.println("FINISH, id = " + id);
    }    
}
