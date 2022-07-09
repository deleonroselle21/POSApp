import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Payment extends JPanel {

	/**
	 * Create the panel.
	 */
	
	JPanel panel=new JPanel();
	public Payment() throws ClassNotFoundException, SQLException {
		
	
		setBackground(Color.LIGHT_GRAY);
		setBounds(0,0,682,494);
		setLayout(null);
		panel.setBounds(0, 0, 682, 494);
		add(panel);
		panel.setLayout(null);
		setVisible(true);
		
		
		
		
		ArrayList<JButton> buttons = new ArrayList<JButton>();
		DatabaseQuery db=new DatabaseQuery();
		int count=db.countPayment();
		
		ArrayList<String> name=new ArrayList<>();

			for(int i=0;i<count;i++) {
				
				
				buttons.add(new JButton());
				name.add(db.PaymentType().get(i));
				
				
			
			
			}
		
		
		panel.setLayout(new GridLayout(3,3));
		
		JButton b=new JButton();
		ArrayList<String> nameCollection=new ArrayList<String>();
		String name1="";
		int initialcount=0;
		
		while(initialcount<count) {
			name1=db.PaymentType().get(initialcount);
			
			
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
		        	   
		        	 
		        	CashFrame cash;
					try {
						cash = new CashFrame();
					  	cash.setVisible(true);
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


