//Duc Tran
//CSE 2

import java.util.Scanner;

public class Bowtie{
    public static void main(String[]args){
        Scanner myScanner = new Scanner(System.in);
        
        int nStars =9;
        for (int i = 0; i<= nStars/2; i++ ){
            for (int j =0; j<= nStars; j++){
                if (i<j && i+j<= nStars){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
                } System.out.println("");
                }
            }
        }
    