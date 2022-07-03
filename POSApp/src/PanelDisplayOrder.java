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
	
	public PanelDisplayOrder() {
		
		String data[][] = {};
				  String col[] = {"Name","Price","Quantiy"};
				JButton btnNewButton;
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
		JLabel samlabel;
		
		
		table.setBackground(Color.GREEN);
		  setLayout(null);
		  table.getColumnModel().getColumn(0).setPreferredWidth(240);

		//JFrame frame = new JFrame("Changing Column Name!");
		 // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  panel = new JPanel();
		  panel.setBackground(Color.YELLOW);
		 // panel.setBounds(161,5,1,1);
		  add(panel);
		  testColumn = table.getColumnModel().getColumn(2);
		  testColumn.setCellEditor(new DefaultCellEditor(comboBox));
		  //model = new DefaultTableModel(data,col);
		 // model.addRow(lab);
		  
		 // header.setBackground(Color.yellow);
		  panel.setLayout(null);
		  //panel.add(table);
		  //frame.add(panel);
		 
		 //frame.getRootPane().setWindowDecorationStyle(JRootPane.PLAIN_DIALOG);
		 // panel.setBounds(0,0,331,490);
		  panel.setBounds(0,0,331,494);
		  
		  //table = new JTable(model);
		   // ChangeName(table,0,"Stu_name");
		    //ChangeName(table,2,"Paper");
		    JTableHeader header = table.getTableHeader();
		   
		    pane.setBounds(0, 0, 331, 440);
		    panel.add(pane);
		    /*
		    samlabel = new JLabel("New label");
		    pane.setRowHeaderView(samlabel);
		    */
		    //samlabel.setText(lab);
		    
		  
		    
		    
		    btnNewButton = new JButton("New button");
		    btnNewButton.addActionListener(new ActionListener() {
		    	public void actionPerformed(ActionEvent e) {
		    		/*
		    		model = (DefaultTableModel) table.getModel();
	        		 model.addRow(new String[] { "cccfgf", "bago", "cccfggf", "cccfgh" });
	        		 System.out.println(model.getRowCount());
		    		*/
		    	}
		    });
		    btnNewButton.setBounds(78, 452, 117, 29);
		    panel.add(btnNewButton);
		    /*
		    label1 = new JLabel("New label");
		    label1.setBounds(207, 452, 61, 16);
		   /// label1.setText(lab);
		    System.out.println("label"+label1.getText());
		    
		    panel.add(label1);
		    */
		  pane.setVisible(true);
		  //add(panel);
		  
		  
		  
		
		
		/*
		
		setBounds(0,0,331,494);
		
		JScrollPane pane = new JScrollPane(table);
		
		String data[][] = {{"Vinod","MCA","Computer"},
				   {"Deepak","PGDCA","History"},
				   {"Ranjan","M.SC.","Biology"},
				   {"Radha","BCA","Computer"}};
				   
				   
				  String col[] = {"Name","Course","Subject"};
			
				  
	     pane.setBounds(0, 0, 331, 440);	 
	     add(pane);
		model=new DefaultTableModel(data,col);
				
		setLayout(null);
		table = new JTable(model);
		table.setBounds(0, 0, 331, 400);
		//table.setBounds(6, 55, 312, 242);
		
		
		add(table);
		
		label = new JLabel("New label");
		label.setBounds(115,420 , 61, 16);
		add(label);
		
		pane.setVisible(true);
		
		*/
			  
	
	}
	
	public PanelDisplayOrder(DefaultTableModel model) {
		
setBounds(0,0,331,494);
		
		
		String data[][] = {{"Vinod","MCA","Computer"},
				   {"Deepak","PGDCA","History"},
				   {"Ranjan","M.SC.","Biology"},
				   {"Radha","BCA","Computer"}};
				   
				   
				  String col[] = {"Name","Course","Subject"};
			
				  
				  
		model=new DefaultTableModel(data,col);
		setLayout(null);
		table = new JTable(model);
		table.setBounds(0, 0, 331, 400);
		//table.setBounds(6, 55, 312, 242);
		add(table);
		
		label = new JLabel("New label");
		label.setBounds(246, 29, 61, 16);
		add(label);
		
		
		
		
	}
	
	
	public PanelDisplayOrder(String text) {
		//label = new JLabel("New label");
		this.bagtext=text;
		
		
		
	}
	
	
	public String displayTable(String hay) {
		
		
		
		label = new JLabel(bagtext);
		label.setText(hay);
		add(label);
		//System.out.println(label.getText());
		return hay;
		
		
	}
	
	
	
	}
	
	
	
	
	
	
	

