//Duc Tran
//02/15/2016
//CSE 2
//a program that converts meters to inches, which are stored in doubles

import java.util.Scanner;
public class Convert {
    //main method required for java program
    public static void main(String[]args) { //java program class
    
    Scanner myScanner = new Scanner (System.in);//declare an instance of the scanner object
    System.out.print("Enter the distance in meters in the form of xx.xx: ");//user input the distance in meters
    double distanceInMeters = myScanner.nextDouble();//accept user input
    double inchPerMeter = 39.3700787;// 1 meter = 39.37 inches
    double times10000distanceInInchesinitial = inchPerMeter*distanceInMeters*10000;//calculate distance in inches *10000 in doubles
    int times10000distanceinInchesfinal= (int) times10000distanceInInchesinitial; // convert 10000 times the distance to integer
    double distanceInInches = times10000distanceinInchesfinal/10000.000; // the distance in inches 
    
    
    System.out.println(distanceInMeters + " meters is " + distanceInInches + " inches");
    }
}
    
    
    
    
    
