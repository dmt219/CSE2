//Duc Tran
//CSE 2
//The program will print out a simple “twist” on the screen.

import java.util.Scanner;

public class TwistGenerator{
    public static void main(String[]args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please input the length of the twist");
        
        int length = myScanner.nextInt();
        int a = 0;
      
        int c=0;
        int d=0;
       
        
        
        
        while(a<length){
            System.out.print("\\ ");
            System.out.print("/");
            a=a+1;
        }
       
        System.out.println("");
        while(c<length){
            System.out.print(" X ");
            c=c+1;
        }
        System.out.println("");
        while(d<length){
            System.out.print("/ ");
            System.out.print("\\");
            d=d+1;
        }
       
        System.out.println("");
        
        
        }
}
