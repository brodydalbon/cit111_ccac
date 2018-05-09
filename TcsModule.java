/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tractioncontrolsystem;

import java.util.Random;

/**
 *
 * @author brody.dalbon
 */
public class TcsModule {
    boolean tcsStatus;
    boolean roadWet;
    int carSpeed;
    int currentEngineTorque;
    
    public boolean getRandomRoadWet(){
        Random rand = new Random();
        boolean roadWetness = rand.nextBoolean();
        //randomize the roadWet output
        roadWet = roadWetness;
        System.out.println("Inside getRandomRoadWet: " + roadWet);
        return roadWetness;
        
    }//close getRandomRoadWet method
    
    
    public int getRandomCarSpeed(){
        
        Random rand = new Random();
        int randSpeed = rand.nextInt(10);
        //randomize the ouput of carSpeed
        carSpeed = randSpeed;
        System.out.println("Inside getRandomCarSpeed: " + carSpeed);
        return randSpeed;
        
    }//clsoe getRandomCarSpeed method
    
    
        public int getRandomCurrentEngineTorque(){
        Random rand = new Random();
        int engineTorque = rand.nextInt(10);
        //randomize the output of currentEngineTorque
        currentEngineTorque = engineTorque;
        System.out.println("Inside getRandomCurrentEngineTorque: " + currentEngineTorque);
        return engineTorque;
        
        }//close getRandomCurrentEngineTorque
        
        
        public boolean getTcsStatus(){
            if(getRandomRoadWet()){
                tcsStatus = true;
            } else if (getRandomCurrentEngineTorque() > 5 && getRandomCarSpeed() > 5){
                tcsStatus = true;
                
            } else {
                tcsStatus = false;
                    }
            return tcsStatus; 
        }//close method
            
        
}
            
            
        //close getTcsStatus method   
            
        
            
            
        
        
   

    
    
    
   
    

