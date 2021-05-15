class Student{
	String str;
	double credit,points;
	Student(String s,int c,int p){
		str=s;
		credit=c;
		points=p;
	}
	void mean(){
		double a = points/credit;
		System.out.println("The Student of Id " + str + " has " + credit + " credits with " + points + " points with average " + a + ".");
	}
}
public class ShowStudent2{
	public static void main(String[] args) {
	Student st = new Student("9999",3,12);
	st.mean();
}

}