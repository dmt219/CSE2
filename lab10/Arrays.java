//Duc Tran  
//CSE 2
//A program that generates array of strings

import java.util.Scanner;

public class Arrays{
    public static void main(String[] args){
        int a =0;
        
        int length =  (int) (Math.random()*5)+5;
        
        
        String [] students = new String[length];
        int [] midterm = new int[length];
        System.out.println("Please enter the name of the student: ");
        
        for (a=0; a <=length-5; a++){
            
            Scanner myScanner = new Scanner(System.in);
            String name = myScanner.nextLine();
            students[a] = name;
            midterm[a]= (int) (Math.random()*99)+1;
            System.out.println(students[a] + " : " +  midterm[a]);
                
            
            
        }
        
        
        
        
        
    }
}
