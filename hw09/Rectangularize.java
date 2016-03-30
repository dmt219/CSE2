//Duc Tran
//CSE 2
//A program that generates rectangular

import java.util.Scanner;

public class Rectangularize{
    
    
    public static void main(String[] args){
        System.out.println("Please enter an input");
        Scanner myScanner = new Scanner (System.in);
        String a ="";
        int b =0;
        if (myScanner.hasNextInt()){
        b = myScanner.nextInt();
        rectangular(b);
        }
        else {
        a = myScanner.nextLine();
        rectangular(a);
        }
        
        
        
    }
    
    public static void rectangular(int b){
        for (int i=0; i<b; i++){
            for (int j=0; j<b; j++){
                System.out.print("%");
            }
            System.out.println("");
            
        }
    }
        
        
        
    
    public static void rectangular(String a){
        System.out.println();
        int len = a.length();
        for (int i=0; i< len;i++ ){
            System.out.println(a);
            
    }
    }
}