import java.util.*;

public class Percentages2{
	static void computePercent(double a, double b){
		System.out.println(a+" is "+(a*100/b)+"% of "+b);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first value");
		double a  = sc.nextDouble();
		System.out.println("Enter second value");
		double b = sc.nextDouble();
		computePercent(a,b);
		computePercent(b,a);
	}

}	