//Duc Tran
//CSE 2
// A program that search students' grades

import java.util.Arrays;
import java.util.Scanner;

public class CSE2Linear{
    public static void main(String[]args){
        int [] finalGrade= new int[15];
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please input final grades of 15 students: ");
        
        //Enter number with index 0 first
        while(! myScanner.hasNextInt()){
                System.out.println("Wrong input, enter again!");
                myScanner.next();
        }
            finalGrade[0] = myScanner.nextInt();
        while(finalGrade[0]<0 || finalGrade[0]>100){
            System.out.println("Wrong input, enter again!");
            myScanner.next();
            while(! myScanner.hasNextInt()){
                System.out.println("Wrong input, enter again!");
                myScanner.next();
            }
                finalGrade[0] = myScanner.nextInt();
        }
        
        
        
        //the loop to create arrays starting from index 1
        
        for (int i = 1; i<finalGrade.length; i++){      
            while(! myScanner.hasNextInt()){
                System.out.println("Wrong input, enter again!");
                myScanner.next();
            }
            finalGrade[i] = myScanner.nextInt();
            while(finalGrade[i]<0 || finalGrade[i]>100){
                System.out.println("Wrong input, enter again!");
                myScanner.next();
                while(! myScanner.hasNextInt()){
                    System.out.println("Wrong input, enter again!");
                    myScanner.next();
                }
                finalGrade[i] = myScanner.nextInt();
            }
            while(finalGrade[i]< finalGrade[i-1]){
                System.out.println("Input larger number than the last one");
                myScanner.next();
                    while(finalGrade[i]<0 || finalGrade[i]>100){
                    System.out.println("Wrong input, enter again!");
                    myScanner.next();
                        while(! myScanner.hasNextInt()){
                        System.out.println("Wrong input, enter again!");
                        myScanner.next();
                }
                finalGrade[i] = myScanner.nextInt();
                }
                finalGrade[i]=myScanner.nextInt();
            }
                
                
        }
        System.out.println("Grade: " + Arrays.toString(finalGrade));
        
        //binary search
        
        System.out.println("Enter the grade to search for: ");
        int y = myScanner.nextInt();
        int count1=binarySearch(finalGrade, y);
        
        if(count1==-1){
            System.out.println(y + " was not found in the list");
        }
        else{
            System.out.println(y + " was found with " + count1 + " iterations");
        }
        
        
         // random scrambling
        
        int [] scrambled = Scramble(finalGrade);
        
        //linear search
        
        System.out.println("Enter the grade to search for: ");
        int x = myScanner.nextInt();
        
        int count2 = linearSearch(scrambled, x);
        if(count2> scrambled.length){
            System.out.println(x + " was not found in the list");
        }
        else if(count2<=scrambled.length){
            System.out.println(x + " was found with " + count2 + " iterations");
        }
        
       
        
        
        
        
    }
    
    
    //method for linear search
    public static int linearSearch(int [] list, int a){  
        int count = 1;
        for (int i = 0 ; i < list.length;i++){
            if (a==list[i]){
                return count;
            }
            count++;
            
        }
        return count;
    }
    
    //method for random scrambling
    public static int [] Scramble(int [] list){
        for ( int i = list.length-1; i>=0; i--){
            int j = (int) (Math.random()*i);
            int temp = list[i];
            list[i]=list[j];
            list[j]=temp;
        }
        System.out.println("Scrambled: " + Arrays.toString(list));
        return list;
    }
    
    //method for binary search
    public static int binarySearch(int []list , int b){
        int high =list.length-1;
        int low = 0;
        
        while(high>=low){
            int mid = (low+high)/2;
            if(b<list[mid]){
                high=mid-1;
            }
            else if (b==list[mid]){
                return mid;
            }
            else{
                low=mid+1;
            }
        }
        return -1; //not found
        
    }
    
    
}
        