//Duc Tran
//CSE 2
// A program that generates 2D array

import java.util.Scanner;
import java.util.Arrays;

public class Arrays_2{
    public static void main(String[]args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please input the size of the outer array: ");
        
        int input = myScanner.nextInt();
        int [] [] array = new int[input][];
        System.out.println("\n\t Before sort: ");
        for(int i =0; i< array.length;i++){
            array[i]=new int[(int)((Math.random()*input)+1)];
            for(int j=0; j<array[i].length;j++){
                array[i][j]= (int)(Math.random() *20);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("\n\t After sort: ");
        int [][] y= selectionSort(array);
        
         for(int i =0; i< array.length;i++){
            for(int j=0; j<array[i].length;j++){
                System.out.print(y[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("\n\t Rearranged: ");
        int [][]z = rearranged(y);
        for(int i =0; i< z.length;i++){
            for(int j=0; j<z[i].length;j++){
                System.out.print(z[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("\n\t Please input the number you want to search :");
        int a= myScanner.nextInt();
        int j = search(z,a);
        if (j==-1){
            System.out.println("The number cannot be found");
            
        }
        
        
    }
    
    public static int [] [] selectionSort(int[][]x){
        for (int i=0;i<x.length;i++){
            for (int p=0;p<x[i].length;p++){
                for (int q =p; q<x[i].length;q++){
                    int temp = x[i][p];
                    if (x[i][q]< x[i][p]){
                        x[i][p]=x[i][q];
                        x[i][q]=temp;
                    }
                }
                
            }
        }
          return x;
    }
    
    public static int [][] rearranged(int [][]x){
        for(int i =0; i< x.length;i++){
            for(int j=i; j<x.length;j++){
                if (x[j].length < x[i].length){
                    int [] temp = x[i];
                    x[i]=x[j];
                    x[j]=temp;
                }
            }
        }
                
        return x;       
        
    }
    
    public static int search(int [][] z , int a){
        for(int i =0; i< z.length;i++){
            for(int j=0; j<z[i].length;j++){
                if (a==z[i][j]){
                    
                    System.out.println("Column "+ (j+1) + " Row " + (i+1));
                    return 1;
                }
               
            }
           
        }
        return -1;
        
    }
}