/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;
import java.util.Scanner;
/**
 *
 * @author brody.dalbon 
 * This code simulates whether or not depending on how much gas you have left in your tank that you 
 * will able to make it to the next gas station.
 * 
 */
public class EnoughGas {
    public static void main(String[] args){
        // beginning statement
        System.out.println("*******Will I Make It?********");
        Scanner userInputScanner = new Scanner(System.in);
        
                // these are my variables with mpg being a final value along with miles left being zero.
                double mpg = 28;
                double gasLeft; 
                double milesLeft = 0;
               // printing the question 
                System.out.println("How many gallons of gas remain in your tank?");
                //Grabs the info from the keyboard
                 gasLeft = userInputScanner.nextDouble();
                // printing another question
                System.out.println("How many miles to the next gas station?");
                //Grabs the info from the keyboard
                milesLeft = userInputScanner.nextDouble();
                
                // storing the info from above to the variables and placing it inside this if equation. 
                if(gasLeft * mpg >= milesLeft){
                    // statement telling you that since you do have enough gas you can make it to the gas staion. 
                    System.out.println("You'll make it to the next gas station!");
                }
                // else statment stating that you wont be making it to the gas station due to how many gallons of gas you have left and how far you need to go.S
                else{ 
                    System.out.println("Your not going to make it....");
                    
                }
        
        
        
        
        
        
        
        
    }
}


            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            

