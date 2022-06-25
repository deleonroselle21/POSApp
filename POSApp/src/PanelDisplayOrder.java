import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.JButton;
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

public class PanelDisplayOrder extends JPanel {
	
	public JPanel panel;
	public JLabel label1;
	
	
	 String data[][] = {{"Vinod","MCA","Computer"},
			   {"Deepak","PGDCA","History"},
			   {"Ranjan","M.SC.","Biology"},
			   {"Radha","BCA","Computer"}};
			  String col[] = {"Name","Course","Subject"};
			  private JButton btnNewButton;
			  
			  
	DefaultTableModel model=new DefaultTableModel(data,col);
	 
	
	public JTable table=new JTable(model);
	public JScrollPane pane = new JScrollPane(table);
	private JLabel samlabel;
	
	public PanelDisplayOrder(String[] lab) {
		
		table.setBackground(Color.GREEN);
		  setLayout(null);
		
		//JFrame frame = new JFrame("Changing Column Name!");
		 // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  panel = new JPanel();
		  panel.setBackground(Color.YELLOW);
		 // panel.setBounds(161,5,1,1);
		  add(panel);
		  
		 
		  //model = new DefaultTableModel(data,col);
		  model.addRow(lab);
		  
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
		    		
		    		model = (DefaultTableModel) table.getModel();
	        		 model.addRow(new String[] { "cccfgf", "bago", "cccfggf", "cccfgh" });
	        		 System.out.println(model.getRowCount());
		    		
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
		  
		  
		  
		  
		
	
		//	model.addRow(new String[] { "ccc", "ccc", "ccc"});
			//panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		
		/*
		JPanel panel = new JPanel();
		setBorder(new LineBorder(Color.RED));
		setLayout(null);
		setBounds(0, 0, 331, 494);
		add(panel);
		panel.setLayout(null);
		table_1.setFillsViewportHeight(true);
		table_1.setBounds(0,0,331,494);
		
		//JPanel panel = new JPanel();
		scrollPane.setBounds(0, 0, 331, 494);
		panel.add(scrollPane);
		scrollPane.setViewportView(table_1);
		
		
		DefaultTableModel model=(DefaultTableModel) table_1.getModel();
		table_1.setModel(new DefaultTableModel(new Object[][] {null,null},new String[]{"NAMEgb","QTY"}));
		model.addRow(new String[] {"gbdbdf","sdfds"});
		setVisible(true);
		*/
		/*
		
		setBorder(new LineBorder(Color.RED));
		setLayout(null);
		setBounds(0, 0, 331, 494);
		setVisible(true);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.RED));
		panel.setBounds(0, 0, 331, 494);
		add(panel);
		panel.setLayout(null);
		//JTable table = new JTable(new DefaultTableModel(new Object[]{"Column1", "Column2"}));
		
		table = new JTable(model);
		table.setFillsViewportHeight(true);
		table.setBounds(0, 0, 331, 494);
		panel.add(table);
		
		
		
		
		//DefaultTableModel model = new DefaultTableModel(); 
		//JTable table = new JTable(model); 

		// Create a couple of columns 
		
		//table.setModel(new DefaultTableModel(new Object[][] {},new String[]{"NAME","QTY"}));
	//	model.addRow(new String[] {"gbdbdf","sdfds"});
		
		
		//DefaultTableModel model = (DefaultTableModel) table.getModel();
		//model.addRow(new Object[]{"Column 1", "Column 2", "Column 3"});
		//panel.add(table_1);
		setVisible(true);
	
		/*
		setBorder(new LineBorder(Color.RED));
		setLayout(null);
		setBounds(0, 0, 331, 494);
		//setVisible(true);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.RED));
		panel.setBounds(0, 0, 331, 494);
		add(panel);
		panel.setLayout(null);
		scrollPane.setBounds(0, 0, 331, 494);
		panel.add(scrollPane);
		
		*/
		//table = new JTable();
		/*
		model.addColumn("Col1"); 
		model.addColumn("Col2"); 

		// Append a row 
		model.addRow(new Object[]{"name", "v2"});
		
		//addRow(name);
		
		
		//table.setModel(new DefaultTableModel(new String[][] {},new String[]{"NAME","QTY"}));
		
		//addRow(table,"aasd");
		/*
		table = new JTable();
		table.setBounds(0, 0, 331, 494);
		panel.add(table);
		
		
		setVisible(true);
		*/
		
		
		
	
	}
	
	/*
	public void addrow(String name) {
		
		
		
		setBorder(new LineBorder(Color.RED));
		setLayout(null);
		setBounds(0, 0, 331, 494);
		setVisible(true);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.RED));
		panel.setBounds(0, 0, 331, 494);
		add(panel);
		panel.setLayout(null);
	
		
		
		DefaultTableModel model=(DefaultTableModel) table.getModel();
		
		table = new JTable(model);
		table.setBounds(0, 0, 331, 494);
		panel.add(table);
		setVisible(true);
		
		
		
		model.addColumn("Col1"); 
		model.addColumn("Col2"); 
model.setRowCount(0);

		//model.addRow(new Object[]{name, "v2"});
		 JOptionPane.showMessageDialog(this,name);
		
		
	}
	*/
	public void ChangeName(JTable table, int col_index, String col_name){
		  table.getColumnModel().getColumn(col_index).setHeaderValue(col_name);
		  }
	
	
	public void addcell(JPanel panel1, Object[] dataRow) throws ClassNotFoundException, SQLException {
		// model = new DefaultTableModel(data,col);
	//	table = new JTable(model);
		
		 model = (DefaultTableModel)table.getModel();
		 RestMain rm=new RestMain();
	        model.addRow(dataRow);
	       
	       
	     // model.addRow(dataRow);
	       // panel.setVisible(false);
	       // rm.panel_1.add(table);
	       // System.out.println(table.getBounds());
	        table.setVisible(true);
	        //.setBounds(0,6,331,494);
	        
	        
	       // model = new DefaultTableModel(data,col);
			 
			 //frame.getRootPane().setWindowDecorationStyle(JRootPane.PLAIN_DIALOG);
			//  panel.setBounds(0,6,331,494);
			
	        //table=new JTable(model);
			  //table.setModel(model);
	       System.out.println(model.getRowCount());
	       System.out.println(table.getValueAt(5, 2));
	       System.out.println(table.getColumnCount());
	       //
	     //  panel1.setBorder(new LineBorder(Color.RED));
	       panel.setBackground(Color.BLUE);
	       System.out.println(panel.getBackground());
	       panel1.setBounds(0,0,331,440);
	       panel1.setVisible(true);
	       System.out.println(panel1.getBounds());
	       //panel.add(table);
	       //this.setVisible(true);
	       //rm.panel_1.add(panel);
	       //panel.setVisible(true);
	       System.out.println(rm.panel_1.getBounds());
	       //table.setBounds(0, 0, 331, 494);
	       System.out.println(panel.getBounds());
	      // System.out.println(model.getValueAt(4, 2));
		
					 JOptionPane.showMessageDialog(this,dataRow);
	}
	}

