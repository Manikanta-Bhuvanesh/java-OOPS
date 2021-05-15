class Person{
	String firstName;
	String lastName;
	String address;
	int pincode;
	long phonenum;
	Person(String firstName,String lastName,String address,int pincode,long phonenum){
		this.firstName= firstName;
		this.lastName=lastName;
		this.address = address;
		this.pincode = pincode;
		this.phonenum= phonenum;

	}
	void setFirstName(String firstName){
		this.firstName= firstName;
	}
	void setLastName(String lastName){
		this.lastName=lastName;
	}
	void setAddress(String address){
		this.address = address;
	}
	void setPincode(int pincode){
		this.pincode = pincode;
	}
	void setphonenum(long phonenum){
		this.phonenum= phonenum;
	}
	public String toString(){
		System.out.println();
		return this.firstName + " " + this.lastName + "'s " + "Address is " + this.address + "," + this.pincode + ".Mobile number is " + this.phonenum; 
	}


}