//Duc Tran
//CSE 2
//A program that prints out Fibonacci numbers

import java.util.Scanner;
public class Fibonacci{
    public static void main(String[]args){
        Scanner myScanner= new Scanner(System.in);
        System.out.println("Enter the first number of the sequence");
        while(! myScanner.hasNextInt() ){
            System.out.print("Please enter positive integer: ");
            myScanner.next();    
        }
        int a1 = myScanner.nextInt();
        System.out.println("Enter the second number of the sequence");
        while(! myScanner.hasNextInt() ){
            System.out.print("Please enter positive integer: ");
            myScanner.next();    
        }
        int a2 = myScanner.nextInt();
        System.out.println("How many custom Fibonacci numbers should be printed?");
        while(! myScanner.hasNextInt() ){
            System.out.print("Please enter positive integer: ");
            myScanner.next();    
        }
        int n = myScanner.nextInt();
     
        int a3 = 0;
    
        int x = 0;
        System.out.print("The numbers are: " + a1 + ", " + a2 + ", ");
        while(x < n-2 ){
            a3= a1+a2;
           System.out.print(a3 +", ");
           a1 = a2;
           a2 = a3;
           x++;
           
            
            
        }
        
        
        }
        
    }
