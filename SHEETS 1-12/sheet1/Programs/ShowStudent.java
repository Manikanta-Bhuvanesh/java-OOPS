class Student{
	String str;
	double credit,points;
	  void setId(String s){
		str=s;
	}
	void setCredit(int c){
		credit=c;
	}
	void setPoints(int p){
		points=p;
	}
	void average(){
		double a = points/credit;
		System.out.println("The Student of Id " + str + " has " + credit + " credits with " + points + " points with average " + a + ".");
	}
}

public class ShowStudent{
	public static void main(String[] args) {
		Student st = new Student();
		st.setId("19BCD7110");
		st.setCredit(24);
		st.setPoints(200);
		st.average();
	}
}