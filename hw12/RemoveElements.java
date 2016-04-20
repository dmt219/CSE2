//Duc Tran
//CSE 2
// A program that delete some elements of an array

import java.util.Scanner;
import java.util.Random;


public class RemoveElements{
  public static void main(String [] args){
	Scanner scan=new Scanner(System.in);
int num[]=new int[10];
int newArray1[];
int newArray2[];
int index,target;
	String answer="";
	do{
  	System.out.print("Random input 10 ints [0-9]");
  	num = randomInput();
  	String out = "The original array is:";
  	out += listArray(num);
  	System.out.println(out);
 
  	System.out.print("Enter the index ");
  	index = scan.nextInt();
  	newArray1 = delete(num,index);
  	String out1="The output array is ";
  	out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out1);
 
      System.out.print("Enter the target value ");
  	target = scan.nextInt();
  	newArray2 = remove(num,target);
  	String out2="The output array is ";
  	out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out2);
  	 
  	System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
  	answer=scan.next();
	}while(answer.equals("Y") || answer.equals("y"));
  }
 
  public static String listArray(int num[]){
	String out="{";
	for(int j=0;j<num.length;j++){
  	if(j>0){
    	out+=", ";
  	}
  	out+=num[j];
	}
	out+="} ";
	return out;
  }
  
  
  //method for random array
   public static int [] randomInput() {
    int [] randomArray = new int[10];
    for (int i =0; i<randomArray.length; i++){
        randomArray[i]= (int) (Math.random()*8)+1;
    }
    return randomArray;
    }
    
    //method to delete an element
    public static int[] delete( int [] list , int pos){
        int[] result = new int [list.length -1];
        for (int i=0; i <result.length; i ++){
            if(i < pos){
                result[i]= list[i];
            }
            else {
                result[i]=list[i+1];
            }
            
        }
        return result;
    }
    
    //method to delete all targets
    
    public static int[] remove(int [] list, int target){
        int [] result = new int [list.length-target];
        for(int i =0; i < result.length; i ++){
            if(list[i]!=list[target] ){
                result[i]=list[i];
            }
        }
    
        return result;
    }

    
}
