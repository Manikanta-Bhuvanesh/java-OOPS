public class Billing{
	static double computeBill(double a){
		return a*1.08;
	}
	static double computeBill(double a,double b){
		return(a*b)*1.08;
	}
	static double computeBill(double a, double b,double c){
		double n = (a*b)-c;
		return n*1.08;
	}
	public static void main(String[] args) {
		double k = computeBill(20);
		double l = computeBill(40,80);
		double m = computeBill(50,60,100);
		System.out.println("Price of one photo book after adding 8% tax is " + k + "Rs.");
		System.out.println("Price of photo book after computing quality and adding 8% tax is " + l + "Rs.");
		System.out.println("Price of photo book after computing quality,removeing cupon value and adding 8% tax is " + m + "Rs.");
	}

}