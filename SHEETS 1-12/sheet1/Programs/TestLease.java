import java.util.*;
class Lease{
	String str;
	int a,r,m;
	void setName(String s){
		this.str=s;
	}
	void setAptNum(int a){
		this.a=a;
	}
	void setRent(int r){
		this.r=r;
	}
	void setMonth(int m){
		this.m=m;
	}
	void getName(){
		System.out.println("Apartment tenant’s name is " + this.str);	
	}
	void getAptNum(){
		System.out.println("Apartment Number is " + this.a);
	}
	void getMonth(){
		System.out.println("Term of the lease in months " + this.m);
	}
	void getRent(){
		System.out.println("Monthly rent amount is  $" + this.r);
	}
	void addPetFee(){
		this.r= this.r+10;
	}
	Lease getData(){
		Scanner sc = new Scanner(System.in);
		Lease temp = new Lease();
		System.out.println("Enter Apartment tenant’s name");
		String e = sc.nextLine();
		System.out.println("Enter Apartment Number");
		int k =sc.nextInt();
		System.out.println("Enter Number of Months");
		int o = sc.nextInt();
		System.out.println("Enter Monthly rent amount");
		int l = sc.nextInt();
		temp.str=e;
		temp.a=k;
		temp.r=l;
		temp.m=o;
		return temp;

	}
	void showValues(){
		getName();
		getAptNum();
		getMonth();
		getRent();
		System.out.println("\n\n");
	}
	static void explainPetPolicy(){
		System.out.println("If there is any pet then 10$ will be added to rent.");
	}
}
public class TestLease{
	public static void main(String[] args) {
		Lease l1 = new Lease();
		Lease l2 = new Lease();
		Lease l3 = new Lease();
		Lease l4 = new Lease();
		l1=l1.getData();
		l2=l2.getData();
		l3=l3.getData();
		l1.showValues();
		l1.addPetFee();
		l1.explainPetPolicy();
		l1.showValues();
		l2.showValues();
		l3.showValues();
		l4.showValues();
	}
}