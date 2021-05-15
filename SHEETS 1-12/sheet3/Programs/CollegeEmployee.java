class CollegeEmployee extends Person{
	int sn;
	double a;
	String dept;
	CollegeEmployee(String firstName,String lastName,String address,int pincode,long phonenum,int n,double b,String dept){
		super(firstName,lastName,address,pincode,phonenum);
		this.sn=n;
		this.a=b;
		this.dept=dept;		
	}
	void setSnum(int n){
		this.sn=n;
	}
	void setAsal(double b){
		this.a=b;
	}
	void setdept(String dept){
		this.dept=dept;
	}

	public String toString(){
		String str = super.toString();
        System.out.println(str);
		return "His Security number is "+this.sn+" and Annual salary is "+this.a+". He belongs to Department of "+this.dept+".";
	}

}