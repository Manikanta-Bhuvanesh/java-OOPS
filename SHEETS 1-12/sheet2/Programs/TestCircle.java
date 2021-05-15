public class TestCircle{
	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		Circle c3 = new Circle();
		c1.setRadius(10);
		c2.setRadius(50);
		System.out.println("Values of small radius circle.");
		c1.getRadius();
		System.out.println("\nValues of larger radius circle.");
		c2.getRadius();
		System.out.println("\nValues of default constructed circle.");
		c3.getRadius();		
	}
}