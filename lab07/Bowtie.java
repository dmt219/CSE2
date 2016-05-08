//Duc Tran
//CSE 2

import java.util.Scanner;

public class Bowtie{
    public static void main(String[]args){
        Scanner myScanner = new Scanner(System.in);
        
        String answer;
       
     do{   
        
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
        
        //for loop
        
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
        
        
        //while loop
        
        // int i =0;
        // int q =(int) nStars/2 + 1;
        
        // while(i<=nStars/2){
        //     int j =0;
        //     while(j<=nStars){
        //         if(i<j && i+j<=nStars){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
                
        //         j++;
        //         }
        //         System.out.println();
        //         i++;
        //     }
        // while(q<nStars){
        //     int p=0;
        //     while(p<=nStars){
        //         if(q+p<nStars || (q<=p-2)){
        //             System.out.print(" ");
        //         }
        //         else{
        //             System.out.print("*");
        //         }
        //         p++;
        // }
        //     System.out.println();
        
        //     q++;
        
        // } 
        
        
        //do-while loop
        
        // int i =0,j,p;
        // int q=(int)nStars/2 + 1;
        
        // do{
        //     j=0;
        //     do{if (i<j && i+j<= nStars){
        //             System.out.print("*");
        //         }else {
        //             System.out.print(" ");
        //         }
        //         j++;
        //     }while(j<=nStars);
        //     System.out.println();
        //     i++;
            
        // }while(i<=nStars/2);
           
        //   do{
        //       p=0;
        //       do{
        //           if(q+p<nStars|| (q<=p-2)){
        //                 System.out.print(" ");
        //         }
        //         else{
        //             System.out.print("*");
        //         }
        //           p++;
        //       }while(p<=nStars);
        //       System.out.println();
        //       q++;
        //   }while(q<nStars);
           
           
    System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
  	answer=myScanner.next();
	}while(answer.equals("Y") || answer.equals("y"));    
           
    }
}
    

        


    