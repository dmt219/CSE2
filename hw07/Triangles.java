//Duc Tran
//CSE 2
//The program will print out number triangles.
import java.util.Scanner;

public class Triangles{
    public static void main(String[]args){
        
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter an integer between 5 and 30 ");
        while(! myScanner.hasNextInt() ){
            System.out.println("Invalid input, enter again! ");
            myScanner.next();    
        }
        int i = myScanner.nextInt();
        while(i<5 || i>30){
            System.out.println("Invalid input, enter again! ");
            while(! myScanner.hasNextInt() ){
                System.out.println("Invalid input, enter again! ");
                myScanner.next();    
             }
            i = myScanner.nextInt();
            
        }
        //for loop
        System.out.println("Using for loop");
        for(int j=1; j<=(2*i-1); j++){
            if(j<=i){
                //inner loop 1
                for(int k =0; k<j; k++){
                    System.out.print(j);
                }
                System.out.println("");
                
            }
            if (j>i){
                //inner loop 2
                for (int q =0; q<i*2-j; q++){
                System.out.print(i*2-j);
            }
            System.out.println(""); 
        }
    }
    
        
        //while loop
        System.out.println("\n\nUsing while loop");
        
        int j =1; //counter for line
        
        while(j<= 2*i-1){
        if (j<=i){
            int k=0; //counter for character
            while(k<j){
            System.out.print(j);
            k++;
        }
        System.out.println("");
       
        }
        
        else{
            int k=0;
            while(k<i*2-j){
                
        
        
            
            System.out.print(i*2-j);
         
            k++;
        }
        System.out.println("");
        
        }
          j++;
        }
        
         
         
        
         
           
         
                 
         
         
//do-while loop
         System.out.println("\n\nUsing do-while loop");
int q=1;

 
        do{
        if (q<=i){
            int k=0; //counter for character
            do{
            System.out.print(q);
            k++;
        }while(k<q);
        System.out.println("");
       
        }
        
        else{
            int k=0;
            do{
            System.out.print(i*2-q);
            k++;
        }while(k<i*2-q);
        System.out.println("");
        
        }
          q++;
        }while(q<= 2*i-1);
        
    }
         }