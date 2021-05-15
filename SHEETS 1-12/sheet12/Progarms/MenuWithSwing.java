import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
public class MenuWithSwing implements ActionListener{
	static JFrame f;
	static Panel p;
	static JMenuBar mb;
	static JMenu country,font,name,type,size,colour;
	static JMenuItem times,dia,sansserif,courier,bold,italic,size12,size14,size16,size18,india,aus,brazil,germ,ice,mal,rus,blu,bro,gray,green,org,red,yel,clc,exit;
	static JLabel disp;
	static JPopupMenu pop;
	public static void main(String[] args) {
		MenuWithSwing m = new MenuWithSwing();
		f = new JFrame("Photo price calculator");
        f.setSize(150,250);
        Panel p = new Panel();
        p.setLayout(new FlowLayout());
        pop =new JPopupMenu();
        clc=new JMenuItem("Clear");
        clc.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, KeyEvent.CTRL_MASK));
        exit=new JMenuItem("Exit");
        exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, KeyEvent.CTRL_MASK));
        pop.add(clc);
        clc.addActionListener(m);
        pop.add(exit);
        exit.addActionListener(m);
        mb = new JMenuBar();
        country =new JMenu("Country");
        font = new JMenu("Font");        
        colour = new JMenu("Colour");       
        name = new JMenu("Name");       
        type = new JMenu("Type");
        size = new JMenu("Size");
        country.setMnemonic('C');
        font.setMnemonic('F');
        colour.setMnemonic('L');
        name.setMnemonic('N');
        type.setMnemonic('T');
       size.setMnemonic('S');
        times=new JMenuItem("TimesRoman");
        dia=new JMenuItem("Dialog");
        sansserif = new JMenuItem("SansSerif");
        courier=new JMenuItem("Courier");
        bold = new JMenuItem("Bold");
        italic = new JMenuItem("Italic");
        size12 = new JMenuItem("Size 12");
        size14 = new JMenuItem("Size 14");
        size16 = new JMenuItem("Size 16");
        size18 = new JMenuItem("Size 18");
        india = new JMenuItem("India");
        aus =new JMenuItem("Australia");
        brazil = new JMenuItem("Brazil");
        germ = new JMenuItem("Germany");
        ice = new JMenuItem("Iceland");
        mal = new JMenuItem("Malaysia");
        rus = new JMenuItem("Russia");
        blu = new JMenuItem("Blue");
        bro =new JMenuItem("Brown");
        gray = new JMenuItem("Gray");
        green = new JMenuItem("Green");
        org = new JMenuItem("Orange");
        red = new JMenuItem("Red");
        yel=new JMenuItem("Yellow");
        times.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, KeyEvent.CTRL_MASK));
        dia.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, KeyEvent.CTRL_MASK));
        sansserif.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, KeyEvent.CTRL_MASK));
        courier.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U, KeyEvent.CTRL_MASK));
        bold.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, KeyEvent.CTRL_MASK));
        italic.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, KeyEvent.CTRL_MASK));
        size12.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F2, 0));
        size14.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, 0));
        size16.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F6, 0));
        size18.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F8, 0));
        india.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, KeyEvent.CTRL_MASK));
        aus.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, KeyEvent.CTRL_MASK));
        brazil.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_J, KeyEvent.CTRL_MASK));
        germ.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K, KeyEvent.CTRL_MASK));
        ice.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, KeyEvent.CTRL_MASK));
        mal.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, KeyEvent.CTRL_MASK));
        rus.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, KeyEvent.CTRL_MASK));
        blu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, KeyEvent.CTRL_MASK));
        bro.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, KeyEvent.CTRL_MASK));
        gray.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, KeyEvent.CTRL_MASK));
        green.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Y, KeyEvent.CTRL_MASK));
        org.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, KeyEvent.CTRL_MASK));
        red.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0));
        yel.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F3, 0));
        disp = new JLabel();
        country.add(india);
        country.add(aus);
        country.add(brazil);
        country.add(germ);
        country.add(ice);
        country.add(mal);
        country.add(rus);
        mb.add(country);
        name.add(times);
        name.add(dia);
        name.add(sansserif);
        name.add(courier);
        font.add(name);
        type.add(bold);
        type.add(italic);
        font.add(type);
        size.add(size12);
        size.add(size14);
        size.add(size16);
        size.add(size18);
        font.add(size);
        mb.add(font);
        colour.add(blu);
        colour.add(bro);
        colour.add(gray);
        colour.add(green);
        colour.add(org);
        colour.add(red);
        colour.add(yel);
        mb.add(colour);
        india.addActionListener(m);
        aus.addActionListener(m);
        brazil.addActionListener(m);
        germ.addActionListener(m);
        ice.addActionListener(m);
        mal.addActionListener(m);
        rus.addActionListener(m);
        times.addActionListener(m);
        dia.addActionListener(m);
        sansserif.addActionListener(m);
        courier.addActionListener(m);
        bold.addActionListener(m);
        italic.addActionListener(m);
        size12.addActionListener(m);
        size14.addActionListener(m);
        size16.addActionListener(m);
        size18.addActionListener(m);
        blu.addActionListener(m);
        bro.addActionListener(m);
        gray.addActionListener(m);
        green.addActionListener(m);
        org.addActionListener(m);
        red.addActionListener(m);
        yel.addActionListener(m);
        p.addMouseListener(new MouseAdapter() {  
            public void mouseClicked(MouseEvent e) {              
                pop.show(p , e.getX(), e.getY());
            }                 
         });
        p.add(mb);
        p.add(disp);
        p.add(pop);
        f.add(p);
        f.setVisible(true);
	}
	public void actionPerformed(ActionEvent o) {
		if(o.getSource()==clc){
			disp.setText("");
		}
		if(o.getSource()==exit){
			System.exit(0);
		}
		if(o.getSource()==times){
			disp.setFont(new Font("TimesRoman",disp.getFont().getStyle(),disp.getFont().getSize()));
		}
		if(o.getSource()==dia){
			disp.setFont(new Font("Dialog",disp.getFont().getStyle(),disp.getFont().getSize()));
		}
		if(o.getSource()==sansserif){
			disp.setFont(new Font("SansSerif",disp.getFont().getStyle(),disp.getFont().getSize()));
		}
		if(o.getSource()==courier){
			disp.setFont(new Font("Courier",disp.getFont().getStyle(),disp.getFont().getSize()));
		}
		if(o.getSource()==bold){
			disp.setFont(new Font(disp.getFont().getName(),Font.BOLD,disp.getFont().getSize()));
		}
		if(o.getSource()==italic){
			disp.setFont(new Font(disp.getFont().getName(),Font.ITALIC,disp.getFont().getSize()));
		}
		if(o.getSource()==size12){
			disp.setFont(new Font(disp.getFont().getName(),disp.getFont().getStyle(),12));
		}
		if(o.getSource()==size14){
			disp.setFont(new Font(disp.getFont().getName(),disp.getFont().getStyle(),14));
		}
		if(o.getSource()==size16){
			disp.setFont(new Font(disp.getFont().getName(),disp.getFont().getStyle(),16));
		}
		if(o.getSource()==size18){
			disp.setFont(new Font(disp.getFont().getName(),disp.getFont().getStyle(),18));
		}
		if(o.getSource()==blu){
			disp.setForeground(new Color(0,0,255));
		}
		if(o.getSource()==bro){
			disp.setForeground(new Color(165,42,42));
		}
		if(o.getSource()==gray){
			disp.setForeground(new Color(128,128,128));
		}
		if(o.getSource()==green){
			disp.setForeground(new Color(0,255,0));
		}
		if(o.getSource()==org){
			disp.setForeground(new Color(255,165,0));
		}
		if(o.getSource()==red){
			disp.setForeground(new Color(255,0,0));
		}
		if(o.getSource()==yel){
			disp.setForeground(new Color(255,255,0));
		}
	if(o.getSource()==india||o.getSource()==aus||o.getSource()==brazil||o.getSource()==germ||o.getSource()==ice||o.getSource()==mal||o.getSource()==rus){
		disp.setText(o.getActionCommand());
	}
	}

}