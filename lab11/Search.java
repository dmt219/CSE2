//Duc Tran
//CSE 2
//a program that searches arrays

import java.util.Arrays;
import java.util.Scanner;

public class Search{
    public static void main(String[]args){
        Scanner myScanner = new Scanner(System.in);
        int [] array1 = new int [50];
        int [] array2 = new int [50];
        int max1 =array1[0];
        int min1 = 100;
        int max2 =array2[0];
        
        
        array1[0] = (int) (Math.random() *100);
        
        for (int i =1; i<array1.length; i++){
            array1[i] = (int) (Math.random() *100);
            if (array1[i] > max1){
                max1 = array1[i];
               
            }
            if (array1[i] < min1){
                min1 = array1[i];
              
            }
        }
        
        array2[0] = (int) (Math.random() *100);
        int min2 = array2[0];
        
        for (int i=1; i < array2.length; i++){
            array2[i]= array2[i-1] + (int) (Math.random() *100);
            if (array2[i] > max2){
                max2 = array2[i];
               
            }
            if (array2[i] < min2){
                min2 = array2[i];
              
            }
        }
        
        
        
        
        System.out.println("Array1: " + Arrays.toString(array1));
        System.out.println("The maximum of array1 is:" + max1);
        System.out.println("The minimum of array1 is:" + min1);
        
        System.out.println("Array2: " + Arrays.toString(array2));
        System.out.println("The maximum of array2 is:" + max2);
        System.out.println("The minimum of array2 is:" + min2);
        
        
         //binary search
        
        System.out.println("Enter the grade to search for: ");
        int y = myScanner.nextInt();
         int high =array2.length-1;
        int low = 0;
        
        while(high>=low){
            int mid = (low+high)/2;
            if(y<array2[mid]){
                high=mid-1;
            }
            else if (y==array2[mid]){
                System.out.println(y + " was found");
            }
            else{
                low=mid+1;
                
            }
        }
        int m = array2[high];
        int n = array2[low];
        
        System.out.println(y + " was not found in array2");
        System.out.println(n + " is above the number");
        System.out.println(m + " is below the number");
            
        }
    }
    
    