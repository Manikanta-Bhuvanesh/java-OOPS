public class TestBloodData{
	public static void main(String[] args) {
	BloodData b1 = new BloodData();
	BloodData b2 = new BloodData("AB","-");
	b1.getBlood();
	b1.getRh();
	b2.getBlood();
	b2.getRh();
	b1.setBlood("A");
	b1.setRh("-");
	System.out.println("After using set methods");
	b1.getBlood();
	b1.getRh();	
}
}