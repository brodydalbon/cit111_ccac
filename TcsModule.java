/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tractioncontrolsystem;
import java.util.Random;
/**
 *
 * @author brody
 */
public class TcsModule {
    private boolean tcsStatus;
    boolean roadWet;
    int carSpeed;
    int currentEngineTorque;
    
    
    
    public boolean getRandomRoadWet(){
        Random rand = new Random();
        boolean roadWetness = rand.nextBoolean();
        
        roadWet = roadWetness;
        return roadWetness;
        
    }//close getRandomRoadWet method
    
    
    public int getRandomCarSpeed(){
        
        Random rand = new Random();
        int randSpeed = rand.nextInt(10);
        
        carSpeed = randSpeed;
        return 0;
        
    }//clsoe getRandomCarSpeed method
    
    
        public int getRandomCurrentEngineTorque(){
        Random rand = new Random ();
        int engineTorque = rand.nextInt(10);
        
        currentEngineTorque = engineTorque;
        return 0;
        
    }//close getRandomCurrentEngineTorque



}//close class
