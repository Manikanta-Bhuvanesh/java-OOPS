import javafx.application.Application; 
import javafx.scene.Scene; 
import javafx.scene.control.Label; 
import javafx.scene.layout.*; 
import javafx.event.ActionEvent; 
import javafx.event.EventHandler; 
import javafx.scene.control.*; 
import javafx.stage.Stage;
import javafx.scene.text.*;
import javafx.scene.text.FontWeight;
import javafx.scene.paint.*;
import javafx.scene.input.*;
public class MenuWithJavaFX extends Application{
	MenuBar mb;
	Menu country,font,name,type,size,colour;
	MenuItem times,dia,sansserif,courier,bold,italic,size12,size14,size16,size18,india,aus,brazil,germ,ice,mal,rus,blu,bro,gray,green,org,red,yel,clc,exit;
	Label disp;
	ContextMenu pop;
	public static void main(String  args[]){
		launch(args);
	}
	public void start(Stage s){
		s.setTitle("creating MenuBar");
		pop= new ContextMenu();
		clc=new MenuItem("Clear");
		clc.setAccelerator(new KeyCodeCombination(KeyCode.C, KeyCombination.CONTROL_DOWN));
		exit=new MenuItem("Exit");
		exit.setAccelerator(new KeyCodeCombination(KeyCode.E, KeyCombination.CONTROL_DOWN));
		pop.getItems().addAll(clc,exit);
		mb = new MenuBar();
        country =new Menu("Country");
        country.setAccelerator(new KeyCodeCombination(KeyCode.C, KeyCombination.ALT_DOWN));
        font = new Menu("Font");
        font.setAccelerator(new KeyCodeCombination(KeyCode.F, KeyCombination.ALT_DOWN));        
        colour = new Menu("Colour");  
        colour.setAccelerator(new KeyCodeCombination(KeyCode.L, KeyCombination.ALT_DOWN));     
        name = new Menu("Name"); 
        name.setAccelerator(new KeyCodeCombination(KeyCode.N, KeyCombination.ALT_DOWN));      
        type = new Menu("Type");
        type.setAccelerator(new KeyCodeCombination(KeyCode.T, KeyCombination.ALT_DOWN));
        size = new Menu("Size");
        size.setAccelerator(new KeyCodeCombination(KeyCode.S, KeyCombination.ALT_DOWN));
        times=new MenuItem("TimesRoman");
        dia=new MenuItem("Dialog");
        sansserif = new MenuItem("SansSerif");
        courier=new MenuItem("Courier");
        bold = new MenuItem("Bold");
        italic = new MenuItem("Italic");
        size12 = new MenuItem("Size 12");
        size14 = new MenuItem("Size 14");
        size16 = new MenuItem("Size 16");
        size18 = new MenuItem("Size 18");
        india = new MenuItem("India");
        aus =new MenuItem("Australia");
        brazil = new MenuItem("Brazil");
        germ = new MenuItem("Germany");
        ice = new MenuItem("Iceland");
        mal = new MenuItem("Malaysia");
        rus = new MenuItem("Russia");
        blu = new MenuItem("Blue");
        bro =new MenuItem("Brown");
        gray = new MenuItem("Gray");
        green = new MenuItem("Green");
        org = new MenuItem("Orange");
        red = new MenuItem("Red");
        yel=new MenuItem("Yellow");
        disp = new Label();
        times.setAccelerator(new KeyCodeCombination(KeyCode.I, KeyCombination.CONTROL_DOWN));
        dia.setAccelerator(new KeyCodeCombination(KeyCode.D, KeyCombination.CONTROL_DOWN));
        sansserif.setAccelerator(new KeyCodeCombination(KeyCode.A, KeyCombination.CONTROL_DOWN));
        courier.setAccelerator(new KeyCodeCombination(KeyCode.U, KeyCombination.CONTROL_DOWN));
        bold.setAccelerator(new KeyCodeCombination(KeyCode.B, KeyCombination.CONTROL_DOWN));
        italic.setAccelerator(new KeyCodeCombination(KeyCode.R, KeyCombination.CONTROL_DOWN));
        size12.setAccelerator(new KeyCodeCombination(KeyCode.F2));
        size14.setAccelerator(new KeyCodeCombination(KeyCode.F4));
        size16.setAccelerator(new KeyCodeCombination(KeyCode.F6));
        size18.setAccelerator(new KeyCodeCombination(KeyCode.F8));
        india.setAccelerator(new KeyCodeCombination(KeyCode.G, KeyCombination.CONTROL_DOWN));
        aus.setAccelerator(new KeyCodeCombination(KeyCode.H, KeyCombination.CONTROL_DOWN));
        brazil.setAccelerator(new KeyCodeCombination(KeyCode.J, KeyCombination.CONTROL_DOWN));
        germ.setAccelerator(new KeyCodeCombination(KeyCode.K, KeyCombination.CONTROL_DOWN));
        ice.setAccelerator(new KeyCodeCombination(KeyCode.M, KeyCombination.CONTROL_DOWN));
        mal.setAccelerator(new KeyCodeCombination(KeyCode.P, KeyCombination.CONTROL_DOWN));
        rus.setAccelerator(new KeyCodeCombination(KeyCode.Q, KeyCombination.CONTROL_DOWN));
        blu.setAccelerator(new KeyCodeCombination(KeyCode.V, KeyCombination.CONTROL_DOWN));
        bro.setAccelerator(new KeyCodeCombination(KeyCode.W, KeyCombination.CONTROL_DOWN));
        gray.setAccelerator(new KeyCodeCombination(KeyCode.X, KeyCombination.CONTROL_DOWN));
        green.setAccelerator(new KeyCodeCombination(KeyCode.Y, KeyCombination.CONTROL_DOWN));
        org.setAccelerator(new KeyCodeCombination(KeyCode.Z, KeyCombination.CONTROL_DOWN));
        red.setAccelerator(new KeyCodeCombination(KeyCode.F1));
        yel.setAccelerator(new KeyCodeCombination(KeyCode.F3));
        country.getItems().add(india);
        country.getItems().add(aus);
        country.getItems().add(brazil);
        country.getItems().add(germ);
        country.getItems().add(ice);
        country.getItems().add(mal);
        country.getItems().add(rus);
        mb.getMenus().add(country);
        name.getItems().add(times);
        name.getItems().add(dia);
        name.getItems().add(sansserif);
        name.getItems().add(courier);
        font.getItems().add(name);
        type.getItems().add(bold);
        type.getItems().add(italic);
        font.getItems().add(type);
        size.getItems().add(size12);
        size.getItems().add(size14);
        size.getItems().add(size16);
        size.getItems().add(size18);
        font.getItems().add(size);
        mb.getMenus().add(font);
        colour.getItems().add(blu);
        colour.getItems().add(bro);
        colour.getItems().add(gray);
        colour.getItems().add(green);
        colour.getItems().add(org);
        colour.getItems().add(red);
        colour.getItems().add(yel);
        mb.getMenus().add(colour);
        EventHandler<ActionEvent> m = new EventHandler<ActionEvent>() { 
        	Font font;
        	FontWeight fw;
        	FontPosture fw1;
            public void handle(ActionEvent o) 
            { 
            	if(o.getSource()==clc){
				disp.setText("");
			}
			if(o.getSource()==exit){
				System.exit(0);
			}
                 if(o.getSource()==times){
                 	FontPosture str = FontPosture.findByName(disp.getFont().getStyle());
			    FontWeight str1=FontWeight.findByName(disp.getFont().getStyle());
                	font=Font.font("TimesRoman",str1,str,disp.getFont().getSize());
				disp.setFont(font);
			}
			if(o.getSource()==dia){
				FontPosture str = FontPosture.findByName(disp.getFont().getStyle());
			    FontWeight str1=FontWeight.findByName(disp.getFont().getStyle());
				font=Font.font("Dialog",str1,str,disp.getFont().getSize());
				disp.setFont(font);
			}
			if(o.getSource()==sansserif){
				FontPosture str = FontPosture.findByName(disp.getFont().getStyle());
			    FontWeight str1=FontWeight.findByName(disp.getFont().getStyle());
				font=Font.font("SansSerif",str1,str,disp.getFont().getSize());
				disp.setFont(font);
			}
			if(o.getSource()==courier){
				 FontPosture str = FontPosture.findByName(disp.getFont().getStyle());
			    FontWeight str1=FontWeight.findByName(disp.getFont().getStyle());
				font=Font.font("Courier",str1,str,disp.getFont().getSize());
				disp.setFont(font);
			}
			if(o.getSource()==bold){
				fw=FontWeight.EXTRA_BOLD;
				disp.setFont(Font.font(disp.getFont().getName(),fw,disp.getFont().getSize()));
			}
			if(o.getSource()==italic){
				fw1=FontPosture.ITALIC;
				disp.setFont(Font.font(disp.getFont().getName(),fw1,disp.getFont().getSize()));
			}
			if(o.getSource()==size12){
				 FontPosture str = FontPosture.findByName(disp.getFont().getStyle());
			    FontWeight str1=FontWeight.findByName(disp.getFont().getStyle());
				disp.setFont(Font.font(disp.getFont().getName(),str1,str,12));
			}
			if(o.getSource()==size14){
				 FontPosture str = FontPosture.findByName(disp.getFont().getStyle());
			    FontWeight str1=FontWeight.findByName(disp.getFont().getStyle());
				disp.setFont(Font.font(disp.getFont().getName(),str1,str,14));
			}
			if(o.getSource()==size16){
				 FontPosture str = FontPosture.findByName(disp.getFont().getStyle());
			    FontWeight str1=FontWeight.findByName(disp.getFont().getStyle());
				disp.setFont(Font.font(disp.getFont().getName(),str1,str,16));
			}
			if(o.getSource()==size18){
				 FontPosture str = FontPosture.findByName(disp.getFont().getStyle());
			    FontWeight str1=FontWeight.findByName(disp.getFont().getStyle());
				disp.setFont(Font.font(disp.getFont().getName(),str1,str,18));
			}
			if(o.getSource()==blu){
				disp.setTextFill(Color.web("#0000FF"));
			}
			if(o.getSource()==bro){
				disp.setTextFill(Color.web("#A52A2A"));
			}
			if(o.getSource()==gray){
				disp.setTextFill(Color.web("#808080"));
			}
			if(o.getSource()==green){
				disp.setTextFill(Color.web("#008000"));
			}
			if(o.getSource()==org){
				disp.setTextFill(Color.web("#FFA500"));
			}
			if(o.getSource()==red){
				disp.setTextFill(Color.web("#FF0000"));
			}
			if(o.getSource()==yel){
				disp.setTextFill(Color.web("#FFFF00"));
			}
			if(o.getSource()==india||o.getSource()==aus||o.getSource()==brazil||o.getSource()==germ||o.getSource()==ice||o.getSource()==mal||o.getSource()==rus){
				disp.setText(((MenuItem)o.getSource()).getText());
			}
            } 
        }; 
        india.setOnAction(m);
        aus.setOnAction(m);
        brazil.setOnAction(m);
        germ.setOnAction(m);
        ice.setOnAction(m);
        mal.setOnAction(m);
        rus.setOnAction(m);
        times.setOnAction(m);
        dia.setOnAction(m);
        sansserif.setOnAction(m);
        courier.setOnAction(m);
        bold.setOnAction(m);
        italic.setOnAction(m);
        size12.setOnAction(m);
        size14.setOnAction(m);
        size16.setOnAction(m);
        size18.setOnAction(m);
        blu.setOnAction(m);
        bro.setOnAction(m);
        gray.setOnAction(m);
        green.setOnAction(m);
        org.setOnAction(m);
        red.setOnAction(m);
        yel.setOnAction(m);
        clc.setOnAction(m);
        exit.setOnAction(m);
        TilePane tilePane = new TilePane(mb);
        mb.setContextMenu(pop);
        VBox vb = new VBox(mb,disp,tilePane);
        Scene sc = new Scene(vb, 300, 200);
        //sc.setContextMenu(pop);
        s.setScene(sc);
        s.show(); 
	}
}