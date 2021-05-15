import java.util.*;
public class JobPricing{
	static double computetion (double m,double h,double t){
		return m+(h*35)+(t*12);		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter job title");
		String str = sc.nextLine();
		System.out.println("Enter the cost of material");
		double m  = sc.nextDouble();
		System.out.println("Enter number of hours he/she worked");
		double h  = sc.nextDouble();
		System.out.println("Enter number of hours he/she traveled");        
		double t  = sc.nextDouble();
		double n = computetion(m,h,t);
		System.out.println("Estimated price of " + str + " is " + n);
	}
}