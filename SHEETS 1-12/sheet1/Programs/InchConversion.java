import java.util.*;
public class InchConversion{
	static void InchtoFeet(double a){
		System.out.println("The measurement of "+ a +" inches in feet is "+ a/12);
	} 
	static void InchtoYards(double b){
		System.out.println("The measurement of "+ b +" inches in yards is "+ b/36);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of inches");
		double a  = sc.nextDouble();
		InchtoFeet(a);
		InchtoYards(a);
	}
}