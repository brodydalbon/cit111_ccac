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
    private boolean tcsStatus;
    boolean roadWet;
    int carSpeed;
    int currentEngineTorque;
    
    
    public int getRandomCarSpeed(){
        Random rand = new Random();
      int randSpeed  =rand.nextInt(10);
        System.out.println(randSpeed);
        carSpeed = randSpeed;
        return 0;
        }
    
    
   
    
    
    
    
}//close TcsModule
