import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PanelPork extends JPanel {

	/**
	 * Create the panel.
	 */
	private final JPanel panel = new JPanel();
	JTable tab=PanelDisplayOrder.table;
	public PanelPork() throws ClassNotFoundException, SQLException {
		setBackground(Color.LIGHT_GRAY);
		setBounds(0,0,652,397);
		setLayout(null);
		panel.setBounds(0, 0, 652, 397);
		add(panel);
		
		DatabaseQuery db=new DatabaseQuery();
		int count=db.ConnectionCount("PORK");
		
		ArrayList<JButton> buttons = new ArrayList<JButton>();
		
	
	ArrayList<String> name=new ArrayList<>();;

		for(int i=0;i<count;i++) {
			
			
			buttons.add(new JButton());
			name.add(db.MenuName("PORK").get(i));
		
		
		
		}
		
		
		panel.setLayout(new GridLayout(3,3));
		JButton b=new JButton();
		ArrayList<String> nameCollection=new ArrayList<String>();
		String name1="";
		int initialcount=0;
		
		while(initialcount<count) {
			name1=db.MenuName("PORK").get(initialcount);
			
			
			//System.out.println(name1);
		
			nameCollection.add(name1);
	
		
			
		
			
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
								
								
				        	 
				        	 
								
								//System.out.println(tab.getBounds());
								//System.out.println(tab.getRowCount());
									
									DefaultTableModel model = (DefaultTableModel) tab.getModel();
									model.addRow(data);
									
									
									double total=0;
									
									
									for(int i=0;i<tab.getRowCount();i++) {
										
										total+=Double.parseDouble((String) tab.getValueAt(i, 1))*Double.valueOf((String)tab.getValueAt(i, 2));
										
										
									}
									
									System.out.println(total);
									PanelDisplayOrder.priceDisplay.setText(String.valueOf(total));
									
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
