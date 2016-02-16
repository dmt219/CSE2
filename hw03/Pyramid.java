//02/15/2016
//CSE 2
//a program that calculate the volume of a pyramid

import java.util.Scanner;
public class Pyramid {
    //main method required for java program
    public static void main(String[]args) { //java program class
    
    Scanner myScanner = new Scanner (System.in);//declare an instance of the scanner object
    System.out.print("The square side of the pyramid is: "); //user input the square side of the pyramid
    double Side  = myScanner.nextDouble();//accept user input
    System.out.print("The height of the pyramid is: "); //user input the height of the pyramid
    double Height = myScanner.nextDouble(); //accept user input
    double baseArea = Side*Side;
    double Volume = baseArea*Height/3;
    
    System.out.printf("The volume inside the pyramid is: %.2f\n", Volume);
    
    
    }
}