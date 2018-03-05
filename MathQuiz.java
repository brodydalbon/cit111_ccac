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
 */
public class MathQuiz {
    public static void main(String[] args){
        int answer = 2;
        int userAnswer;
        int numLoops = 0;
        
        
        System.out.println("**Math Checker**");
        
        
        Scanner userInputScanner = new Scanner(System.in);
        while(numLoops < 3){
            System.out.println("Find the value of X:  (4x+2=10)");
           
            
            userAnswer = userInputScanner.nextInt();
            
            // compare the anwser to the user answer
            if (answer == userAnswer){
                System.out.println("Correct");
                break;
            } else {
                System.out.println("Incorrect");
               
            }//closes if/else
            
            
            
            numLoops = numLoops + 1;
            
        }//close while 
        System.out.println("****** The correct anwser is ******");
        System.out.println(" 4*2+2=10 ");
        
    }//closes method
}//closes class
