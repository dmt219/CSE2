//Duc Tran
//02/12/2016
//CSE 2 
//  a program that uses the Scanner class to obtain from the user the original cost of the check, the percentage tip they wish to pay, and the number of ways the check will be split, then determine how much each person in the group needs to spend in order to pay the check.

import java.util.Scanner;
public class Check{
   // main method required for every Java program
  public static void main(String[] args) { //Java program class
      
      
    Scanner myScanner = new Scanner (System.in); //declare an instance of the Scanner object 
    System.out.print("Enter the original cost of the check in the form xx.xx: "); //user input original cost of the check
double checkCost = myScanner.nextDouble(); //accept user input
    System.out.print("Enter the percentage tip you wish to pay as a whole number:"); // user input percentage tip
double tipPercent = myScanner.nextDouble();//accept user input
tipPercent /= 100; //We want to convert the percentage into a decimal value
System.out.print("Enter the number of people:"); //user input number of people
int numPeople = myScanner.nextInt();//accept user input
double totalCost;
double costPerPerson;
int dollars;
int dimes;
int pennies;
totalCost=checkCost*(1+tipPercent);
costPerPerson=totalCost/numPeople;
dollars=(int)costPerPerson;
dimes=(int)(costPerPerson * 10) % 10;
pennies=(int)(costPerPerson * 100) % 10;
System.out.println("Each person in the group owes $" + dollars + "." + dimes + pennies);

}  //end of main method   
      } //end of class

