/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tractioncontrolsystem;



/**
 *
 * @author brody.dalbon
 */
public class Road {
    public static void main(String[] args){
       
        System.out.println("-----------------------------------------");
        System.out.println("Traction Control Light");
        System.out.println("false = off");
        System.out.println("true = on");
        System.out.println("-----------------------------------------");
        System.out.println("Testing the system...");
        System.out.println("");
        
        
        
        
        boolean currentStatus;
        
        
        TcsModule firstTcs = new TcsModule();
        currentStatus = firstTcs.getTcsStatus();
      
        System.out.println("");
        System.out.println("Final light status: " + currentStatus);
             
      
        //sets up the display window before testing random results
        
        
        
        
    }//close main
}//close class
