/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7;
import java.util.Scanner;

/**
 *
 * @author brody.dalbon
 */
public class MysteryDoors {
    public static void main(String[] args){
       int numberSelected;
       
        
        
        
        System.out.println("    Whats inside the trash cans?");
        System.out.println("-------- GRAND PRIZE OR TRASH --------");
        
        System.out.println(" \\           /  \\           /  \\           /     ");
        System.out.println("  \\    1    /    \\    2    /    \\    3    /      ");
        System.out.println("   \\       /      \\       /      \\       /       ");
        System.out.println("    \\_____/        \\_____/        \\_____/        ");
        
        
        Scanner inputScanner = new Scanner (System.in);
        
        System.out.println("Enter the number of the trash can that you would like to rummage through.");
        
        numberSelected = inputScanner.nextInt();
        
        switch(numberSelected){
            case 1:
                openDoorNumber1();
                break;
            case 2:
                openDoorNumber2();
                break;
            case 3:
                openDoorNumber3();
                break;
            default:
                System.out.println("Unknown selection...");
            
                   
        }
        
        
            
      
             
        
    }//closes class
    
    //storage of three methods
    
        public static void openDoorNumber1 (){
            System.out.println("Congrats you just found a winning million dollar lottery ticket!!!");
            
            
            
        }//closes method doorNumber1
    
        public static void openDoorNumber2 (){
            System.out.println("Sorry... you found a banana peel. ");
            
            
        }//closes method doornumber2
    
        public static void openDoorNumber3 (){
            System.out.println("You pulled out a empty coffee cup. Better luck next time.");
            
            
            
        }//closes method doorNumber3
    
}//closes main
