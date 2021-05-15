class Patient{
	int Id,age;
	String Blood,Rh;
	Patient(){
		this.Id = 0;
		this.age =0;
		this.Rh="+";
		this.Blood = "O";
	}
	Patient(int Id,int age,String Blood,String Rh){
		this.Id = Id;
		this.age=age;
		this.Rh=Rh;
		this.Blood = Blood;
	}
	void getId(){
		System.out.println("Patient Id number is " + this.Id);
	}
	void getage(){
		System.out.println("Age of thr Patient is " + this.age + " years old");
	}
	void getBlood(){
		System.out.println("Blood type is " + this.Blood);
	}
	void getRh(){
		System.out.println("Rh factor of Blood is " + this.Rh);
	}
}