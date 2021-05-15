import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class MyWindowAdapter extends WindowAdapter{
  public void windowClosing(WindowEvent we) {
    System.exit(0);
  }
  
}
class CheckMeListener implements ItemListener {
	JCheckBox hb,pb,db,vb;
	JTextField disp;
	public void itemStateChanged(ItemEvent e){
		Object source=e.getSource();
		int select=e.getStateChange();
		if(source==hb){
			if(select==ItemEvent.SELECTED){
				disp.setText("HMO costs $200 per month");
			}
			else{
				disp.setText("");
				}
		}
		else if(source==pb){
			if(select==ItemEvent.SELECTED){
				disp.setText("PPO costs $600 per month");
			}
			else{
				disp.setText("");
			}
		}
		else if(source==db){
			if(select==ItemEvent.SELECTED){
				disp.setText("dental coverage adds $75 per month");
			}
			else{
				disp.setText("");
			}
		}
		else if(source== vb){
			if(select==ItemEvent.SELECTED){
				disp.setText("vision care adds $20 per month");
			}
			else{
				disp.setText("");
			}
		}
		else{
			disp.setText("");
		}
		
	}
}
public class FXInsurance{
	public static void main(String[] args) {
		CheckMeListener y=new CheckMeListener();
		JFrame f = new JFrame("Amount displayer");
        f.setSize(400,150);
        Panel p = new Panel();
        p.setLayout(new FlowLayout());
        y.hb=new JCheckBox("HMO");
        y.pb=new JCheckBox("PPO");
        y.db=new JCheckBox("Dental");
        y.vb=new JCheckBox("Vision");
        y.disp=new JTextField("displayer",20);
        ButtonGroup bg=new ButtonGroup();
		bg.add(y.hb);
		bg.add(y.pb);
		p.add(new JLabel("Select one type of insurance"));
		p.add(y.hb);
		p.add(y.pb);
		p.add(new JLabel("Select one or both or neither of them"));
		p.add(y.db);
		p.add(y.vb);
		p.add(y.disp);
		y.hb.addItemListener(y);
		y.pb.addItemListener(y);
		y.db.addItemListener(y);
		y.vb.addItemListener(y);
		f.add(p);
	    f.addWindowListener(new MyWindowAdapter());
	    f.setVisible(true);
	}
}