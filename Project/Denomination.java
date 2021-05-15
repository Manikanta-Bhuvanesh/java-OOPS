import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class MyWindowAdapter extends WindowAdapter{
  public void windowClosing(WindowEvent we) {
    System.exit(0);
  }
  
}
class DataType {
  JTextField t1,t2,t3,t4,t5,Total;
  JButton m;
}
class ClickMeListener extends DataType implements ActionListener{
  public void actionPerformed(ActionEvent o) {
    String [] s = new String [5];
      int [] a = new int [5];
      s[0] = t1.getText();
    s[1] = t2.getText();
    s[2] = t3.getText();
    s[3] = t4.getText();
    s[4] = t5.getText();
    for(int i = 0;i<5;i++) {
      if (s[i].equals("")) {
        a[i]=0;
      }
      else {
        a[i]= Integer.parseInt(s[i]);
      }
    }
    
        String result=String.valueOf(a[0]*2000+a[1]*500+a[2]*100+a[3]*50+a[4]*10);  
        Total.setText(result);  
  }
}
public class Denomination  {
  public static void main(String args[]) {
     ClickMeListener y = new ClickMeListener();
    JFrame f = new JFrame("Denomination calculator");
    f.setSize(400,360);
    Panel p = new Panel();
    p.setLayout(new GridLayout(6,2));
    JLabel l1 = new JLabel("Number of 2000 Rs notes");
    p.add(l1);
    y.t1 = new JTextField();
    p.add(y.t1);
    JLabel l2 = new JLabel("Number of 500 Rs notes");
    p.add(l2);
    y.t2 = new JTextField();
    p.add(y.t2);
    JLabel l3 = new JLabel("Number of 100 Rs notes");
    p.add(l3);
    y.t3 = new JTextField();
    p.add(y.t3);
    JLabel l4 = new JLabel("Number of 50 Rs notes");
    p.add(l4);
    y.t4 = new JTextField();
    p.add(y.t4);
    JLabel l5 = new JLabel("Number of 10 Rs notes");
    p.add(l5);
    y.t5 = new JTextField();
    p.add(y.t5);
        y.m = new JButton("Total Denomination");
       
    y.m.addActionListener(y);
    p.add(y.m);
    y.Total = new JTextField();
    p.add(y.Total);
    f.add(p);
    
    f.addWindowListener(new MyWindowAdapter());
    f.setVisible(true);
  }
}