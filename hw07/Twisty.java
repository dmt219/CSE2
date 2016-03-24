//Duc Tran
//CSE 2
//The program will print out a “twist” on the screen.

import java.util.Scanner;

public class Twisty{
    public static void main(String[]args){
        
        
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter the Length of the twist: ");
        while(! myScanner.hasNextInt() ){
            System.out.println("Invalid input, enter again! ");
            myScanner.next();    
        }
        int Length = myScanner.nextInt();
        while(Length< 1 || Length>80){
            System.out.println("Invalid input, enter again! ");
            while(! myScanner.hasNextInt() ){
                System.out.println("Invalid input, enter again! ");
                myScanner.next();    
             }
            Length = myScanner.nextInt();
            
        }
        
        System.out.println("Please enter the Width of the twist: ");
        while(! myScanner.hasNextInt() ){
            System.out.println("Invalid input, enter again! ");
            myScanner.next();    
        }
        int Width = myScanner.nextInt();
        while(Width< 1 ||  Width>Length){
            System.out.println("Invalid input, enter again! ");
            while(! myScanner.hasNextInt() ){
                System.out.println("Invalid input, enter again! ");
                myScanner.next();    
             }
            Width = myScanner.nextInt();
            
        }
        for(int i=0; i<Width; i++){
            for (int j =0; j<Length; j++){
                int mod = j%Width;
                int rem=j/Width;
                if (mod==i){
                    if (rem%2==0){
                        System.out.print("#");
                    }
                    else{
                        System.out.print("\\");
                    }
                        
                }
                
                else if (mod+i==Width-1){
                    if (rem%2==0){
                        System.out.print("/");
                    }
                    else {
                        System.out.print("#");
                    }
                }
                else System.out.print(" ");
                }
                System.out.println("");
                        
                    }
                
            
  }
  
}
        
        
    
