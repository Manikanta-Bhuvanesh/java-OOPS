class BloodData{
	String Blood,Rh;
	BloodData(){
		this.Blood = "O";
		this.Rh = "+";
	}
	BloodData(String Blood,String Rh){
		this.Blood=Blood;
		this.Rh=Rh;
	}
	void setBlood(String Blood){
		this.Blood=Blood;
	}
	void setRh(String Rh){
		this.Rh=Rh;
	}
	void getBlood(){
		System.out.println("Blood type is " + this.Blood);
	}
	void getRh(){
		System.out.println("Rh factor of Blood " + this.Blood + " is " + this.Rh);
	}
}