import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JTextField;

public class CashFrame extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumber;
	JPanel okPanel;

	/**
	 * Launch the application.
	 */
	
	/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CashFrame frame = new CashFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	*/

	/**
	 * Create the frame.
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public CashFrame() throws ClassNotFoundException, SQLException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		 setLocationRelativeTo(null); 
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		DatabaseQuery db=new DatabaseQuery();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel okLabel=new JLabel();
		okLabel.setText("OK");
		JLabel cancelLabel=new JLabel();
		cancelLabel.setText("CANCEL");
		
		JPanel panel = new JPanel();
		panel.setBounds(6, 86, 438, 380);
		contentPane.add(panel);
		
		txtNumber = new JTextField();
		txtNumber.setBounds(6, 0, 438, 80);
		contentPane.add(txtNumber);
		txtNumber.setColumns(10);
		
		
		okPanel=new JPanel();
		okPanel.setBackground(new Color(0,153,76));
		okPanel.add(okLabel);
		JPanel cancelPanel=new JPanel();
		cancelPanel.setBackground(new Color(204,0,0));
		cancelPanel.add(cancelLabel);
		
		
	
		okPanel.addMouseListener(new PanelButtonMouseAdapter(okPanel){
			
			
			
			
			@Override
			public void mouseClicked(MouseEvent e) {
			menuClicked("Ok",txtNumber.getText());
				//JOptionPane.showInternalMessageDialog(this,"ok button");  
			}
			
			
		});
		
		cancelPanel.addMouseListener(new PanelButtonMouseAdapter(cancelPanel){
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked("cancel",null);
				
			}
			
			
		});
		
		JPanel option=new JPanel();
		option.setBounds(0,0,146,16);
		option.setVisible(true);
		option.setBackground(Color.red);
		
		
		ArrayList<JButton> buttons = new ArrayList<JButton>();
		ArrayList<String> number= new ArrayList<String>();;
		number.add("1");
		number.add("2");
		number.add("3");
		number.add("4");
		number.add("5");
		number.add("6");
		number.add("7");
		number.add("8");
		number.add("9");
		number.add(".");
		number.add("0");
		
		//number.add("OK");
		
		
		//DatabaseQuery db=new DatabaseQuery();
		//int count=db.countPayment();
		
		ArrayList<String> name=new ArrayList<>();

			for(int i=0;i<number.size();i++) {
				
				
				buttons.add(new JButton());
				name.add(number.get(i));
				
				
			
			
			}
			
		
		
		panel.setLayout(new GridLayout(4,4));
		
		JButton b=new JButton();
		ArrayList<String> nameCollection=new ArrayList<String>();
		String name1="";
		int initialcount=0;
		
		while(initialcount<number.size()) {
			name1=number.get(initialcount);
			
			
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
		        	   
		        	 
		        	
		        	txtNumber.setText(txtNumber.getText()+button.getText());

		         }
		      });
			
			i++;
		}
		
	option.setLayout(new GridLayout(2,1));
	option.add(okPanel);
	option.add(cancelPanel);
	
		panel.add(option);
		
		
		panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

		
		
	}
private class PanelButtonMouseAdapter extends MouseAdapter{
		
		JPanel panel;
		
		public PanelButtonMouseAdapter(JPanel panel) {
			
			this.panel=panel;
		}
		@Override
		public void mouseEntered(MouseEvent e) {
			if(panel.equals(okPanel))
			panel.setBackground(new Color(0,153,76));
			else
			
				panel.setBackground(new Color(204,0,0));
		}
		@Override
		public void mouseExited(MouseEvent e) {
			if(panel.equals(okPanel))
			panel.setBackground(new Color(0,153,76));
			else
				
				panel.setBackground(new Color(204,0,0));
			
		}
		
		@Override
		public void mousePressed(MouseEvent e) {
			if(panel.equals(okPanel))
			panel.setBackground(new Color(0,153,76));
			else
				
				panel.setBackground(new Color(204,0,0));
			//menuClicked(pChicken);
		}
		@Override
		public void mouseReleased(MouseEvent e) {
			if(panel.equals(okPanel))
				
			panel.setBackground(new Color(0,153,76));
			else
				
				panel.setBackground(new Color(204,0,0));
			
		}
		
		
	}

public void menuClicked(String message,String amount) {
	
	 if(message.equals("Ok")) {
		 
		 double change;
		 
		// System.out.println(PanelDisplayOrder.priceDisplay.getText());
		 
		 
		 change=(Double.parseDouble(amount))-(Double.parseDouble(PanelDisplayOrder.priceDisplay.getText()));
		 JOptionPane.showMessageDialog(this, "Change: $"+String.format("%.2f",change));
		 
		 
		 
	 }
	 else
		
		 
		 if(txtNumber.getText().equals(""))
		 this.setVisible(false);
		 
		 else
		 {
			
			 txtNumber.setText(txtNumber.getText().substring(0, txtNumber.getText().length()-1));
	 
		 }
}

	
	
	
}
