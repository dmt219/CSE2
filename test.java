import java.util.Scanner;
public class test{
    public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		int x = s.nextInt();
		doubleEntry(x);
        System.out.println("Double of x:"+x);
}
public static void doubleEntry(int x){
		x = x * 2 ; 
		return;
}

}