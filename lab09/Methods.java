//Duc Tran
//CSE 2
//A program that generates random basic words

import java.util.Random;

public class Methods{
    
    public static int nextInt() {
    Random randomGenerator = new Random();
    int randomInt = randomGenerator.nextInt(10);
    return randomInt;
    }
    
    public static String printAdjectives(){
        String a = "";
        int x = nextInt();
        switch(x/11){
            case 1:
                a ="red";
                break;
            case 2:
                a="blue";
                break;
            case 3:
                a ="orange";
                break;
            case 4:
                a ="yellow";
                break;
            case 5:
                a ="purple";
                break;
            case 6:
                a ="white";
                break;
            case 7:
                a ="blue";
                break;
            case 8:
                a ="red";
                break;
            case 9:
                a ="red";
                break;
            case 10:
                a ="red";
                break;
                
        }
        return a;
    }
    
    public static void main(String[]args){
    String b = printAdjectives();
    System.out.print(b);
    }
    

}