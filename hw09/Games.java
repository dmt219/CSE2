//Duc Tran
//CSE 2
//A program that generates a game

import java.util.Random;
import java.util.Scanner;

public class Games{
    public static void main(String[] args){
        System.out.println("Welcome to Duc Tran's game center");
        System.out.println("Please choose one of these games: guessTheBox, spinTheWheel, or scrambler");
        String a = "guessTheBox";
        String b = "spinTheWheel";
        String c = "scrambler";
        Scanner myScanner = new Scanner (System.in);
       
        
        String input = myScanner.nextLine();
        //check if user enter a right name
        while (!input.equals(a) && !input.equals(b) && !input.equals(c)  ){
            System.out.println("Enter again!");
            input = myScanner.nextLine();
        }
        
        //call correct method
        if (input.equals(a)){
            guessTheBox();
        }
        if (input.equals(b)){
            spinTheWheel();
        }
        if (input.equals(c)){
            scrambler();
        }
        }
        
    
    public static void guessTheBox(){
        
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please choose box 1, 2 or 3");
        while(! myScanner.hasNextInt() ){
            System.out.println("Invalid input, enter again! ");
            myScanner.next();    
        }
        int number = myScanner.nextInt();
        while(number< 1 || number>3){
            System.out.println("Invalid input, enter again! ");
            while(! myScanner.hasNextInt() ){
                System.out.println("Invalid input, enter again! ");
                myScanner.next();    
             }
            number = myScanner.nextInt();
        }
            int x = (int) (Math.random()*2)+1;
            System.out.println(x);
            if(number == x){
                System.out.println("Congratulations! You have won the prize");
            }
            else{System.out.println("Sorry! You chose the wrong box");
            }
    
    }
    
    public static void spinTheWheel(){
        String u = "red";
        String q ="black";
        String o = "Red";
        String p = "Black";
        String e ="";
        
        int y = (int) (Math.random()*4)+1; //random number for input number
        int z = (int)(Math.random()*4);//random number for color
        
        if ((z/4) ==1){ e = u;} 
        else if (z/4==2){ e=q;}
        else if (z/4==3){ e = o;}
        else if (z/4==0){ e = p;}


        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please input a color");
        
        String color = myScanner.nextLine();
        //check if user enter a right name
        while (!color.equals(u) && !color.equals(q) && !color.equals(o) && !color.equals(p)){
            System.out.println("Enter the color again!");
            color = myScanner.nextLine();
        }
        
        System.out.println("Please input a number");
        
         while(! myScanner.hasNextInt() ){
            System.out.println("Invalid input, enter again! ");
            myScanner.next();    
        }
        int m = myScanner.nextInt();
        while(m< 1 || m>5){
            System.out.println("Invalid input, enter again! ");
            while(! myScanner.hasNextInt() ){
                System.out.println("Invalid input, enter again! ");
                myScanner.next();    
             }
            m = myScanner.nextInt();
        }
        System.out.println(e+y);
            
        if (m == y && color.equals(e)){
            System.out.println("Congratulations!");
        }
        else{System.out.println("Sorry please try again!");
        }
        
                }
                
        
    public static String scrambler(){
        
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please input a word");
        
        String str = myScanner.nextLine();
        
        int len=str.length();
        char[] arr = str.toCharArray(); //turn string into char array
        for (int i = 0; i<50; i++){
            int w = 1 + (int) (Math.random()*(len-1)); //swap first character (at index 0) with a random character after
            char temp = arr[0];
            arr[0] = arr[w];
            arr[w] = temp;
            }
            String res = new String(arr); //store result from char array
            System.out.println(res);
            return res;
            
            
    }

        
        
    
    
}