public class DemoPoems
{
public static void main(String[] args)
{
Poem p1 = new Poem("You Forget Me", 84);
Couplet p2 = new Couplet("Phenomenal Woman");
Limerick p3 = new Limerick("Still I Rise");
Haiku p4 = new Haiku("The Road Not Taken");
System.out.println("Poem: " + p1.getPoemName() +" Lines: " + p1.getLines());
System.out.println("Poem: " + p2.getPoemName() +" Lines: " + p2.getLines());
System.out.println("Poem: " + p3.getPoemName() +" Lines: " + p3.getLines());
System.out.println("Poem: " + p4.getPoemName() +" Lines: " + p4.getLines());
}
}
