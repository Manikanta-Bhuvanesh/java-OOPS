class Data{
	String str;
	int a,r,m;
	Data(String str,int a ,int r, int m){
		this.str=str;
		this.a=a;
		this.r=r;
		this.m=m;
	}
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
		System.out.println("Apartment tenant’s name " + this.str);	
	}
	void getAptNum(){
		System.out.println("Apartment Number " + this.a);
	}
	void getMonth(){
		System.out.println("Term of the lease in months " + this.m);
	}
	void getRent(){
		System.out.println("Monthly rent amount $" + this.r);
	}
	void addPetFee(){
		this.r= this.r+10;
	}
	static void explainPetPolicy(){
		System.out.println("If there is any pet then 10$ will be added to rent.");
	}

}
public class Lease{
	public static void main(String[] args) {
		Data d = new Data("XXXZ",0,1000,12);
		d.getName();
		d.getAptNum();
		d.getMonth();
		d.getRent();
		d.explainPetPolicy();
		d.addPetFee();
		d.getRent();
		

	}
}