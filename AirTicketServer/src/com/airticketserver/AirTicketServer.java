/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airticketserver;

import com.airticketserver.service.ServiceIFC;
import com.airticketserver.service.ServiceIMP;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author green
 */
public class AirTicketServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try{
            Registry reg=LocateRegistry.createRegistry(6550);
            ServiceIFC serv=new ServiceIMP();
            reg.rebind("airTicketService", serv);
            
            System.out.println("server is startd..........");
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
}
