import java.util.Scanner;

public class HelloWorld{
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println( "input 3 integers");
	int a = scan.nextInt();
	int b = scan.nextInt();
	int c = scan.nextInt();
	int d = (b * b) - (4 * a * c);

	if( d == 0 ){
		solve(b,a);
	}
	if( d < 0 ){
		solve();
	}
	if( d > 0 ){
		solve(a,b,c);
	}





}

public static String  solve( int b , int a) {
    System.out.println("Discriminant is zero"); 
    System.out.println("Solution is 0");
    return ;




}

public static String solve () {
    System.out.printf("Discriminant is negative\n");
    System.out.printf("Solutions are not real\n");    
    return ;
    



}

public static String solve( int a, int b , int c) {
	System.out.printf("Discriminant is positive");
	int d = (b * b) - (4 * a * c);
	double s1 = (-b + Math.sqrt(d)) / (2 * a);
	double s2 = (-b - Math.sqrt(d)) / (2 * a);
	System.out.printf("Solutions are %f and %f\n", s1, s2);

	return ;
}

}