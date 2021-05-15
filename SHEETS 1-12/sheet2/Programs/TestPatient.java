public class TestPatient{
	public static void main(String[] args) {
		Patient p1 = new Patient();
		Patient p2 = new Patient(152685,48,"B","-");
		System.out.println("Details of Default Patient");
		p1.getId();
		p1.getage();
		p1.getBlood();
		p1.getRh();
		System.out.println("\n Details of Patient");
		p2.getId();
		p2.getage();
		p2.getBlood();
		p2.getRh();
	}
}