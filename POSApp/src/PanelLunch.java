import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.*;

import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;


public class PanelLunch extends JPanel {
	
	
	
	 JPanel panel;
	
	 DatabaseQuery db;
	 JTable tab=PanelDisplayOrder.table;
	 
	RestMain rm;

	

	/**
	 * Create the panel.
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	
	// PanelDisplayOrder displayorder;
	 public PanelLunch() throws ClassNotFoundException, SQLException  {

		 
			
		 
		 
		 
		setBackground(Color.LIGHT_GRAY);
		setBounds(0,0,652,397);
		panel = new JPanel();
		setLayout(null);
		panel.setBounds(0, 0, 652, 397);
		add(panel);
	
	
		DatabaseQuery db=new DatabaseQuery();
		int count=db.ConnectionCount("LUNCH");
		
		ArrayList<JButton> buttons = new ArrayList<JButton>();
		
	
	ArrayList<String> name=new ArrayList<>();

		for(int i=0;i<count;i++) {
			
			
			buttons.add(new JButton());
			name.add(db.MenuName("LUNCH").get(i));
			
		
		
		}
		
	
		panel.setLayout(new GridLayout(3,3));
		
		JButton b=new JButton();
		ArrayList<String> nameCollection=new ArrayList<String>();
		String name1="";
		int initialcount=0;
		
		while(initialcount<count) {
			name1=db.MenuName("LUNCH").get(initialcount);
			
			
			//System.out.println(name1);
			//panel.add(b);
			nameCollection.add(name1);
			//b.setText(name1);
		
			
		
			
			initialcount++;
	
	}
		
		int i=0;
		for(JButton button:buttons) {
			
			

			button.setText(String.valueOf(nameCollection.get(i)));
			panel.add(button);
			
			
			 
			button.addActionListener(new ActionListener() {
		         public void actionPerformed(ActionEvent e) {
		        	   
		        	 
		        	 try {
						String price=String.valueOf(db.getPrice(button.getText()));
						 String []data= new String[] { button.getText(),price, "1"};
							
							
			        
								
								DefaultTableModel model = (DefaultTableModel) tab.getModel();
								model.addRow(data);
								
								
								double total=0;
								
								
								for(int i=0;i<tab.getRowCount();i++) {
									
									total+=Double.parseDouble((String) tab.getValueAt(i, 1))*Double.valueOf((String)tab.getValueAt(i, 2));
									
									
								}
								
								System.out.println(total);
								PanelDisplayOrder.priceDisplay.setText(String.format("%.2f",Double.parseDouble(String.valueOf(total))));
								
								
								
					} catch (ClassNotFoundException | SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
		        	 
		        	
						
		        	
		         }
		      });
			
			i++;
		}
		
	
		
		panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

	}
	 
	 
	 
	
}
