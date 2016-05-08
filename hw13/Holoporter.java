//Duc Tran
//CSE 2
//hw12
import java.util.*;
public class Holoporter{
    
    public static void main (String[]args){
        String [][][] a = soRandom();
        String [][][] b = soRandom();
        String [][][] y = holoport(a,b);
       print(y);
        sampling(y); 
        percentage(a,y);
        frankenstein(y);
        
        
    }
    
    public static String [][][] soRandom(){
        String [][][] x = new String [(int) ((Math.random()*9)+1)][][];
        for (int i=0; i<x.length;i++){
            x[i] = new String [(int) ((Math.random()*9)+1)][];
            for (int j=0; j < x[i].length;j++){
                x[i][j] =  new String [(int) ((Math.random()*9)+1)];
                for(int k=0; k<x[i][j].length; k++){
                    x[i][j][k] = coder();
                }
            }
        
            
        }
       return x; 
    }
    
    public static String coder () {;
    String z ="";
    String t ="";
    
    int a = (int)(Math.random()*25);
    int b = (int)(Math.random()*25);
    
    switch(a)
      {
        case 0:
        z= "A";
        break;
        case 1:
        z= "B";
        break;
        case 2:
        z= "C";
        break;
        case 3:
        z= "D";
        break;
        case 4:
        z= "E";
        break;
        case 5:
        z= "F";
        break;
         case 6:
        z= "G";
        break;
        case 7:
        z= "H";
        break;
        case 8:
        z= "I";
        break;
        case 9:
        z= "J";
        break;
        case 10:
        z= "K";
        break;
        case 11:
        z= "L";
        break;
         case 12:
        z= "M";
        break;
        case 13:
        z= "N";
        break;
        case 14:
        z= "O";
        break;
        case 15:
        z= "P";
        break;
        case 16:
        z= "Q";
        break;
        case 17:
        z= "R";
        break;
         case 18:
        z= "S";
        break;
        case 19:
        z= "T";
        break;
        case 20:
        z= "U";
        break;
        case 21:
        z= "V";
        break;
        case 22:
        z= "W";
        break;
        case 23:
        z= "X";
        break;
        case 24:
        z= "Y";
        break;
        case 25:
        z= "Z";
        break;
       
       }
       
       switch(b)
       {
        case 0:
        t= "A";
        break;
        case 1:
        t= "B";
        break;
        case 2:
        t= "C";
        break;
        case 3:
        t= "D";
        break;
        case 4:
        t= "E";
        break;
        case 5:
        t= "F";
        break;
         case 6:
        t= "G";
        break;
        case 7:
        t= "H";
        break;
        case 8:
        t= "I";
        break;
        case 9:
        t= "J";
        break;
        case 10:
        t= "K";
        break;
        case 11:
        t= "L";
        break;
         case 12:
        t= "M";
        break;
        case 13:
        t= "N";
        break;
        case 14:
        t= "O";
        break;
        case 15:
        t= "P";
        break;
        case 16:
        t= "Q";
        break;
        case 17:
        t= "R";
        break;
         case 18:
        t= "S";
        break;
        case 19:
        t= "T";
        break;
        case 20:
        t= "U";
        break;
        case 21:
        t= "V";
        break;
        case 22:
        t= "W";
        break;
        case 23:
        t= "X";
        break;
        case 24:
        t= "Y";
        break;
        case 25:
        t= "Z";
        break;
       
       }
    
    
    
    String v = t+ z + (int)(Math.random()*9) +(int)(Math.random()*9) +(int)(Math.random()*9)+ (int)(Math.random()*9);
    return v;
        
    }   
    
    public static void print(String [][][]x){
         for (int i=0; i<x.length;i++){
            
            for (int j=0; j < x[i].length;j++){
                if (j==x[i].length-1){System.out.print("--- ");}
         
                for(int k=0; k<x[i][j].length; k++){
                    if (k==0) {System.out.print("[");}
                    if (k<x[i][j].length-1){
                    System.out.print(x[i][j][k] + ",");
                    }
                    if (k==x[i][j].length-1) {
                        if (i==(x.length-1))  {System.out.print(x[i][j][k] + "] ");}
                        else {System.out.print(x[i][j][k] +"] | ");}
                }
                }
            }
        
            
        }
         }
         
    public static String [][][] holoport(String [][][] x, String [][][] y){
        
        for (int i=0 ; i< y.length; i++){
            for (int j =0; j< y[i].length;j++){
                for (int k=0; k<y[i][j].length; k++){
                    y[i][j][k] = ("$$$$$$");
                }
            }
        }
        for (int i=0 ; i< (x.length & y.length) ; i++) {
            y[i]=x[i];
            
                }
            
        
        return y;
    }
    
    public static int sampling(String [][][] x){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("\n Enter the code to search: ");
        
        while (true){
            String a = myScanner.nextLine();
            for (int i=0 ; i< x.length; i++){
            for (int j =0; j< x[i].length;j++){
                for (int k=0; k<x[i][j].length; k++){
                if (a.equals(x[i][j][k])){
                    System.out.println(i+","+j +","+k);
                    return -1;
                }
                else {
                    System.out.println("Code not found, enter again");
                    myScanner.next();
                }   
                }
            }
            }
        }
        
    }
    
    public static void percentage(String [][][] a, String [][][]y){
     int count_1=1;
     int count_2=1;
        for (int i=0; i<a.length;i++){
            for (int j=0; j < a[i].length;j++){
                for(int k=0; k<a[i][j].length; k++){
                    count_1++;
                }
            }
        
            
        }
        
        for (int i=0; i<y.length;i++){
            for (int j=0; j < y[i].length;j++){
                for(int k=0; k<y[i][j].length; k++){
                    count_2++;
                }
            }
        
            
        }
        
        
        double percent= (count_2-count_1)/count_1;
        
        System.out.println("The percentage is : " + percent + "%" );
    }
        
    public static void frankenstein(String [][][]y){
        String[][][] a = selectionSort(y);
        String[][][] b = rearranged(a);
        
        print(b);
        
        
        
    }
    
    public static String [] [] [] selectionSort(String [] [][]y){
         for (int i=0; i<y.length;i++){
            for (int j=0; j < y[i].length;j++){
                for(int k=0; k<y[i][j].length; k++){
                    for (int l=k+1 ; l<y[i][j].length; l++)
                        if(y[i][j][l].compareTo(y[i][j][k])<0){
                        
                        String temp= y[i][j][k];
                        y[i][j][k]= y[i][j][l]; 
                        y[i][j][l]=temp;
}

         }
     }
        }
        return y;

    }
                    
             
    public static String [][][] rearranged(String [][][]x){
        for(int m =0; m< x.length;m++){
            for(int i=0; i <x[m].length;i++){
            for(int j=i; j<x[m].length;j++){
                if (x[m][j].length < x[m][i].length){
                    String [] temp = x[m][i];
                    x[m][i]=x[m][j];
                    x[m][j]=temp;
                }
            }
        }
                
               
        
    }
    return x;
    
}
}

