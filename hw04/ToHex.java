//Duc Tran  
//CSE 002
// A program that convert Decimal to Hexadecimal

import java.util.Scanner;
public class ToHex {
    //main class required for every java program
    public static void main(String[]args){ //java program class
    Scanner myScanner = new Scanner (System.in);//declare an instance of the scanner object
    String r1 = "";// string to present remainder of the first number
    String d1 = "";// string to present divider of the first number
    String r2 ="";// ...2nd number
    String d2 ="";// ...2nd number
    String r3 = "";// ...3rd number
    String d3 ="";//...3rd number
   
    String result = "";
    
    System.out.print("Please enter three numbers representing RGB values: ");//prompt user to input the three integers
    if (myScanner.hasNextInt()) {
      int number1 = myScanner.nextInt();//accept user input
      
      int number2 = myScanner.nextInt();//accept user input
      int number3 = myScanner.nextInt();//accept user input
      if (number1 < 0 || number1>255) {
        System.out.println("Sorry, you must enter values between 0-255.");
        System.exit(0); //exit if the integer is improper
      }
      if (number2 < 0 || number2>255) {
        System.out.println("Sorry, you must enter values between 0-255.");
        System.exit(0);//exit if the integer is improper
      }
      if (number3 < 0 || number3>255) {
        System.out.println("Sorry, you must enter values between 0-255.");
        System.exit(0);//exit if the integer is improper
      }   
       //prompt user to input integers within range 
        
        if (0<= number1/16 && number1/16 <=9){
    d1 =""+ number1/16;
}  //0<= divider <= 9
else {
 switch(number1/16) //divider >= 9
       {
        case 10:
        d1 = "A";
        break;
        case 11:
        d1 = "B";
        break;
        case 12:
        d1 = "C";
        break;
        case 13:
        d1 = "D";
        break;
        case 14:
        d1 = "E";
        break;
        case 15:
        d1 = "F";
        break;
       
       }
}

   if (0<= number2/16 && number2/16 <=9){
    d2 =""+ number2/16;
}
else {
 switch(number2/16)
       {
        case 10:
        d2 = "A";
        break;
        case 11:
        d2 = "B";
        break;
        case 12:
        d2 = "C";
        break;
        case 13:
        d2 = "D";
        break;
        case 14:
        d2 = "E";
        break;
        case 15:
        d2 = "F";
        break;
       
       }
}
  
    if (0<= number3/16 && number3/16 <=9){
    d3 += number3/16;
}
else {
 switch(number3/16)
       {
        case 10:
        d3 = "A";
        break;
        case 11:
        d3 = "B";
        break;
        case 12:
        d3 = "C";
        break;
        case 13:
        d3 = "D";
        break;
        case 14:
        d3 = "E";
        break;
        case 15:
        d3 = "F";
        break;
       
       }
}
  
       if (0<= number1%16 && number1%16 <=9){
    r1=""+number1%16;
} // 0<= remainder <=9
else {
 switch(number1%16) //remainder >=9
       {
        case 10:
        r1 = "A";
        break;
        case 11:
        r1 = "B";
        break;
        case 12:
        r1 = "C";
        break;
        case 13:
        r1 = "D";
        break;
        case 14:
        r1 = "E";
        break;
        case 15:
        r1 = "F";
        break;
        
       
        
       }
        
      }
      
      if (0<= number2%16 && number2%16 <=9){
    r2+=number2%16;
}
else {
 switch(number2%16)
       {
        case 10:
        r2 = "A";
        break;
        case 11:
        r2 = "B";
        break;
        case 12:
        r2 = "C";
        break;
        case 13:
        r2 = "D";
        break;
        case 14:
        r2 = "E";
        break;
        case 15:
        r2 = "F";
        break;
}
}


 if (0<= number3%16 && number3%16 <=9){
    r3+=number3%16;
}
else {
 switch(number3%16)
       {
        case 10:
        r3 = "A";
        break;
        case 11:
        r3 = "B";
        break;
        case 12:
        r3 = "C";
        break;
        case 13:
        r3 = "D";
        break;
        case 14:
        r3 = "E";
        break;
        case 15:
        r3 = "F";
        break;
        
       
        
       }
        
      }
      
      
System.out.println( "The decimal numbers R:" + number1 + ", G:" + number2 + ", B:" + number3+ " is represented in hexadecimal as: "+ d1+r1+d2+r2+d3+r3);
    }
    else {
      System.out.println("Sorry, your input must consist of integers.");
      System.exit(0);
    }
    
   

 

            
 }
}