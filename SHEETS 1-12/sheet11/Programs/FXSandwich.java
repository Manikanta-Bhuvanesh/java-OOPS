import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
class MyWindowAdapter extends WindowAdapter{
  public void windowClosing(WindowEvent we) {
    System.exit(0);
  }
  
}
class Listener implements ListSelectionListener {
	int ing,bread;
	JList ingl,breads;
	JTextField total;
	 public void valueChanged(ListSelectionEvent e){
	 	int indexing = ingl.getSelectedIndex();
		int indexbread = breads.getSelectedIndex();
		if(indexing==0){
			ing=200;
		}
		else if(indexing==1){
			ing=180;
		}
		else if(indexing==2){
			ing=118;
		}
		else{
			ing=0;
		}
		if(indexbread==0){
			bread=30;
		}
		else if(indexbread==1){
			bread=50;
		}
		else if(indexbread==2){
			bread=70;
		}
		else{
			bread=0;
		}
		double sum= ing+bread;
		total.setText("Total price $"+sum);
	 }

}
public class FXSandwich{
	public static void main(String[] args) {
	String Ingredients [] = {"Panner", "Mushroom", "Potato"};
	String breadTypes[] = {"Wheat", "Rye", "Brioche"};
	Listener y = new Listener();
    Frame f = new JFrame("Sublime Sandwich Shop");
    f.setSize(350,160);
    Panel p = new Panel();
    p.setLayout(new FlowLayout());	
    y.total=new JTextField(15);
    y.ingl = new JList<String>(Ingredients);
    y.breads = new JList<String>(breadTypes);
    p.add(new JLabel("Choose Ingredients"));
    p.add(y.ingl);
    p.add(new JLabel("Choose Bread"));
    p.add(y.breads);
    p.add(y.total);
    y.ingl.addListSelectionListener(y);
    y.breads.addListSelectionListener(y);
    f.add(p);
    f.addWindowListener(new MyWindowAdapter());
    f.setVisible(true);
	}
}