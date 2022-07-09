import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.sql.SQLException;

import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;

public class PanelDisplayOrder extends JPanel {
	static JTable table;
	JLabel label;
	
	public String bagtext="";
	//DefaultTableModel model;
	
	
	public JPanel panel;
	public JLabel label1;
	
	JComboBox<String> comboBox = new JComboBox<>();
	TableColumn testColumn;
	static JLabel priceDisplay;
	private JLabel lblNewLabel_1;
	
	public PanelDisplayOrder() {
		
		String data[][] = {};
				  String col[] = {"Name","Price","Quantiy"};
				
				comboBox.addItem("1"); 
				comboBox.addItem("2");
				comboBox.addItem("3");
				comboBox.addItem("4");  
				comboBox.addItem("5"); 
				comboBox.addItem("6"); 
				comboBox.addItem("7"); 
				comboBox.addItem("8");
				comboBox.addItem("9"); 
				comboBox.addItem("10"); 
				
				 comboBox.addActionListener(actionListenerComboBox);
		DefaultTableModel model=new DefaultTableModel(data,col) {
			
			boolean[] canEdit = new boolean[]{
                    false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
			
			
			
		};
		 
		
		table=new JTable(model);
		JScrollPane pane = new JScrollPane(table);
		
		
		
		table.setBackground(Color.GREEN);
		  setLayout(null);
		  table.getColumnModel().getColumn(0).setPreferredWidth(240);

		  panel = new JPanel();
		  panel.setBackground(Color.YELLOW);
		 
		  add(panel);
		  testColumn = table.getColumnModel().getColumn(2);
		  testColumn.setCellEditor(new DefaultCellEditor(comboBox));
		
		  
		  
		
		  panel.setLayout(null);
		 
		  panel.setBounds(0,0,331,494);
		  
		
		    JTableHeader header = table.getTableHeader();
		   
		    pane.setBounds(0, 0, 331, 440);
		    panel.add(pane);
		    
		    priceDisplay = new JLabel("0");
		    priceDisplay.setBounds(264, 448, 61, 16);
		    panel.add(priceDisplay);
		    
		    lblNewLabel_1 = new JLabel("TOTAL");
		    lblNewLabel_1.setBounds(6, 448, 61, 16);
		    panel.add(lblNewLabel_1);
		    
		  pane.setVisible(true);
		  
		  
		 
		 
			  
	
	}
	
	
	public void displayPrice() {
		
		//System.out.println(":FGhfgh");
		// return (PropertyChangeListener) table.getValueAt(0, 1);
		  
		
		
	}
	
	 ActionListener actionListenerComboBox = new ActionListener() {
	      public void actionPerformed(ActionEvent actionEvent) {
	      // CambiojComboBox();
	    	  
	    	 // System.out.println("Dfg");
	    	  double total=0;
				
				
				for(int i=0;i<table.getRowCount();i++) {
					
					total+=Double.parseDouble((String) table.getValueAt(i, 1))*Double.valueOf((String)table.getValueAt(i, 2));
					
					
				}
				
				System.out.println(total);
				PanelDisplayOrder.priceDisplay.setText(String.valueOf(total));
				
	    	  
	      }
	    };
	
	
	}
	
	
	
	
	
	
	

