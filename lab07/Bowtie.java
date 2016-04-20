//Duc Tran
//CSE 2

import java.util.Scanner;

public class Bowtie{
    public static void main(String[]args){
        Scanner myScanner = new Scanner(System.in);
        
        
       
        
        
        System.out.println("Please input an odd integer between 3 and 33");
        while(! myScanner.hasNextInt()){
            System.out.println("Invalid input, enter again");
            myScanner.next();
        }
        int nStars = myScanner.nextInt();
        
        while (nStars<3 || nStars/2==0 || nStars>33){
            System.out.println("Invalid input, enter again");
            while (! myScanner.hasNextInt()){
                System.out.println("Invalid input, enter again");
                myScanner.next();
            }
            nStars = myScanner.nextInt();
        }
        for (int i = 0; i<= nStars/2; i++ ){
            for (int j =0; j<= nStars; j++){
                if (i<j && i+j<= nStars){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
                } System.out.println("");
                }
        for (int i= (int) nStars/2 + 1; i<nStars;i++){
            for(int j=0; j <=nStars; j++){
                if(i+j<nStars || (i<=j-2) ){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
                }
                System.out.println("");
            }
        }
    }
    

        


    