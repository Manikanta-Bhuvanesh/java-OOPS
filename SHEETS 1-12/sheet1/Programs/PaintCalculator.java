import java.util.*;

public class PaintCalculator{
	static double area (double l,double b,double h){
		return ((2*l*h)+(2*b*h));
	}
	static double gallons(double q){
		return q/350;
	}
	static double price(double g){
		return g*32;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of the room");
		double l  = sc.nextDouble();
		System.out.println("Enter  of width the room");
		double b  = sc.nextDouble();
		System.out.println("Enter height of the room");
		double h  = sc.nextDouble();
		double a = area(l,b,h);
		double gallon = gallons(a);
		double rate = price(gallon);
		System.out.println("The cost to paint a " + l + "-by-" + b + "-foot room with " + h + "-foot ceilings is $" + rate + ".");
	}
}