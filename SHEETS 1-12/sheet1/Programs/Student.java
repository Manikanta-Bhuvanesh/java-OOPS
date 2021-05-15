public class Student{
	static String str;
	static double credit,points;
	 static void setId(String s){
		str=s;
	}
	static void setCredit(int c){
		credit=c;
	}
	static void setPoints(int p){
		points=p;
	}
	static void average(){
		double a = points/credit;
		System.out.println("The Student of Id " + str + " has " + credit + " credits with " + points + " points with average " + a + ".");
	} 
	public static void main(String[] args) {
		setId("19BCD7088");
		setCredit(24);
		setPoints(211);
		average();
	}
}