//Duc Tran
//CSE 2
//A program that prints out factorial of the input number

import java.util.Scanner;
public class RunFactorial{
    public static void main(String[]args){
        Scanner myScanner= new Scanner(System.in);
        System.out.println("Please enter an integer that is between 9 and 16: ");
        while(! myScanner.hasNextInt() ){
            System.out.println("Invalid input, enter again! ");
            myScanner.next();    
        }
        int a1 = myScanner.nextInt();
        while(a1< 9 || a1>16){
            System.out.println("Invalid input, enter again! ");
            while(! myScanner.hasNextInt() ){
                System.out.println("Invalid input, enter again! ");
                myScanner.next();    
             }
            a1 = myScanner.nextInt();
            
        }
        
        int x =1;
        while(a1>=1){
            x*=a1;
            a1=a1-1;
            
            
        }
        System.out.println("Input accepted: " + x);
            
    }
}