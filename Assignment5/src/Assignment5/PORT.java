/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment5;

/**
 * class for Port scanning
 * @author Alexey Titov
 * @version 1
 */
public class PORT {
    //variables
    private int port;
    private String status;
    /*
     * Constructor
     */
    public PORT(int Port,String Status)
    {
        this.port=Port;
        this.status=Status;
    }
    /**
     * getters
     * @return	port
     */
    public int getPort()
    {
        return this.port;
    }
    /**
     * setters
     * @param Port for save
     */
    public void setPort(int Port)
    {
        this.port=Port;
    }
    /**
     * getters
     * @return status
     */
    public String getStatus()
    {
        return this.status;
    }
    /**
     * setters
     * @param Status for save
     */
    public void setStatus(String Status)
    {
        this.status=Status;
    }
    @Override
    public String toString()
    {
        return this.port+","+this.status+",";
    }
}
