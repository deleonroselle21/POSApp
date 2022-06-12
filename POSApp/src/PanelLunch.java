import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.*;

import javax.swing.border.LineBorder;

public class PanelLunch extends JPanel {
	private final JPanel panel = new JPanel();

	/**
	 * Create the panel.
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public PanelLunch() throws ClassNotFoundException, SQLException {
		setBackground(Color.LIGHT_GRAY);
		setBounds(0,0,652,397);
		setLayout(null);
		panel.setBounds(0, 0, 652, 397);
		add(panel);
		//Connection();
		DatabaseQuery db=new DatabaseQuery();
		int count=db.ConnectionCount();
		/*
		JButton button2=new JButton();
		JButton button3=new JButton();
		JButton button4=new JButton();
		JButton button5=new JButton();
		JButton button6=new JButton();
		*/
		ArrayList<JButton> buttons = new ArrayList<JButton>();
		
		
	//System.out.println(db.MenuName());
		/*
		buttons.add(button2);
		buttons.add(button3);
		buttons.add(button4);
		buttons.add(button5);
		buttons.add(button6);
		*/
	ArrayList<String> name=new ArrayList<>();;
	//System.out.println(db.MenuName());
		for(int i=0;i<count;i++) {
			
			
			buttons.add(new JButton());
			name.add(db.MenuName().get(i));
		
		
		
		}
		
		//System.out.println(name);
		
		//buttons.add(button2);
		panel.setLayout(new GridLayout(3,3));
		JButton b=new JButton();
		ArrayList<String> nameCollection=new ArrayList<String>();
		String name1="";
		int initialcount=0;
		
		while(initialcount<count) {
			name1=db.MenuName().get(initialcount);
			
			
			System.out.println(name1);
			//panel.add(b);
			nameCollection.add(name1);
			//b.setText(name1);
		
			
		
			
			initialcount++;
	
	}
		
		int i=0;
		for(JButton button:buttons) {
			
			
			//buttons.add(button);
			button.setText(String.valueOf(nameCollection.get(i)));
			panel.add(button);
			
			i++;
		}
		
		/*
		for(JButton button:buttons) {
			//buttons.add(button);
			//System.out.println(name);
			//String query="select `menu_name` from `menu` where `menu_category`='LUNCH'";
			
			
			
				//System.out.println(db.MenuName());
			button.setText(name.get(4));
			//buttons.add(button6);
			
	        //button.setBounds(0,count*50,50,30);\
			
			
			
			
			
			
			
	        panel.add(button);
	      
		  
		}
		*/
		
		/*
		JButton button2=new JButton("jdfg");
		JButton button3=new JButton("fgh");
		JButton button4=new JButton("cb?");
		JButton button5=new JButton("cb?");
		JButton button6=new JButton("cb?");
		panel.add(button5);
		panel.add(button6);
		panel.add(button1);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		*/
		
		panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

	}
	
}
