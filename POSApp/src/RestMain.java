import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RestMain {

	private JFrame frame;

	/**
	 * Launch the application.
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 */
	
	
	private PanelLunch plunch;
	private PanelChicken pChicken;
	private PanelPork  pPork;
	private PanelFish pFish;
	private PanelDisplayOrder displayorder;
	private JTable table;
	public JPanel panel_1;
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		
		Connection conn=null;
		String databaseName="Restaurant";
		String url="jdbc:mysql://localhost:3306/"+databaseName;
		
		String username="root";
		String password="Malolos_21!";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn=DriverManager.getConnection(url,username,password);
		
		
		
		
		
		//PreparedStatement ps=conn.prepareStatement("insert into food values (4,'sdf','sdf','fhfgh');");
		//ps.executeUpdate();
		
		
		
		
		
		
		
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RestMain window = new RestMain();
					window.frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	
	
	
	private class PanelButtonMouseAdapter extends MouseAdapter{
		
		JPanel panel;
		
		public PanelButtonMouseAdapter(JPanel panel) {
			
			this.panel=panel;
		}
		@Override
		public void mouseEntered(MouseEvent e) {
			
			panel.setBackground(new Color(112,128,144));
			
			
		}
		@Override
		public void mouseExited(MouseEvent e) {
			
			panel.setBackground(new Color(47,79,79));
			
		}
		
		@Override
		public void mousePressed(MouseEvent e) {
			panel.setBackground(new Color(60,179,113));
			//menuClicked(pChicken);
		}
		@Override
		public void mouseReleased(MouseEvent e) {
			
			panel.setBackground(new Color(112,128,144));
			
		}
		
		
	}
	
	public void menuClicked(JPanel panel) {
		
		plunch.setVisible(false);
		pChicken.setVisible(false);
		pPork.setVisible(false);
		pFish.setVisible(false);
	//	displayorder.setVisible(true);
		panel.setVisible(true);
		
	}
	
	public void addrow(String name) {
		DefaultTableModel model=(DefaultTableModel) table.getModel();
		model.addColumn("Col1"); 
		model.addColumn("Col2"); 

		// Append a row 
		model.addRow(new Object[]{name, "v2"});
		
		
		DatabaseQuery db=new DatabaseQuery();
		//db.MenuName();
		//System.out.println(name);
	
		
	}
	/**
	 * Create the application.
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public RestMain() throws ClassNotFoundException, SQLException {
		initialize();
		
		 
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	private void initialize() throws ClassNotFoundException, SQLException {
		frame = new JFrame();
		
		frame.getContentPane().addContainerListener(new ContainerAdapter() {
			@Override
			public void componentAdded(ContainerEvent e) {
			}
		});
	   
		frame.setBounds(100, 100, 1047, 618);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		pPork=new PanelPork();
		pPork.setLocation(0, 0);
		pFish=new PanelFish();
		pFish.setLocation(0, 0);
		plunch=new PanelLunch();
		plunch.setLocation(0, 0);
		pChicken=new PanelChicken();
		pChicken.setLocation(0,0);
		
		displayorder=new PanelDisplayOrder(null);
		displayorder.setBackground(Color.RED);
		displayorder.setSize(331, 494);
		//displayorder.setSize(331, 494);
		//displayorder.setSize(331, 494);
		//displayorder.setSize(331, 494);
		displayorder.setLocation(0,0);
		
		
		
		
		JPanel panel = new JPanel();
		panel.setBounds(342, 6, 682, 494);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
	
	
		//displayorder.setVisible(true);
		
		JPanel panelLunch = new JPanel();
		panelLunch.addMouseListener(new PanelButtonMouseAdapter(panelLunch) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(plunch);
				
			}
			
			
		});
		panelLunch.setBounds(17, 20, 155, 41);
		panel.add(panelLunch);
		
	
		
		
		
		JLabel lblNewLabel = new JLabel("LUNCH SPECIAL");
		panelLunch.add(lblNewLabel);
		
		JPanel panelChicken = new JPanel();
		panelChicken.addMouseListener(new PanelButtonMouseAdapter(panelChicken){
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(pChicken);
				
				
			}
			
			
		});
		panelChicken.setBounds(180, 20, 155, 41);
		panel.add(panelChicken);
		
		JLabel lblChicken = new JLabel("CHICKEN");
		panelChicken.add(lblChicken);
		
		JPanel panelPork = new JPanel();
		panelPork.addMouseListener(new PanelButtonMouseAdapter(panelPork){
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(pPork);
				
			}
			
			
		});
		panelPork.setBounds(347, 20, 155, 41);
		panel.add(panelPork);
		
		JLabel lblPoork = new JLabel("PORK");
		panelPork.add(lblPoork);
		
		JPanel panelFish = new JPanel();
		panelFish.addMouseListener(new PanelButtonMouseAdapter(panelFish){
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(pFish);
				
			}
			
			
		});
		panelFish.setBounds(514, 20, 155, 41);
		panel.add(panelFish);
		
		JLabel lblFish = new JLabel("FISH");
		panelFish.add(lblFish);
		
		JPanel panelMainContent = new JPanel();
		panelMainContent.setBounds(17, 73, 652, 397);
		panel.add(panelMainContent);
		panelMainContent.setLayout(null);
		
		panelMainContent.add(pChicken);
		panelMainContent.add(pPork);
		panelMainContent.add(pFish);
		panelMainContent.add(plunch);
		
		
		
		
		
		menuClicked(plunch);
		
		panel_1 = new JPanel();
		//panel_1.setBounds(0, 0, 324, 494);
		//panel_1.setBounds(0, 0, 331, 494);
		frame.getContentPane().add(panel_1);
		
		//JPanel panelDisplay = new JPanel();
		panel_1.setBounds(0, 0, 331, 494);
		//frame.getContentPane().add(panelDisplay);
		panel_1.setLayout(null);
		
		//table = new JTable();
		//table.setBounds(6, 6, 319, 482);
		panel_1.add(displayorder);
		
		
		
		JButton btnNewButton = new JButton("New button");
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String []data= new String[] { "cccrdgf", "cccsdfdf", "cccdgd"};
				
				
				
				//displayorder=new PanelDisplayOrder(null);
				
				
				DefaultTableModel model = (DefaultTableModel) displayorder.table.getModel();
				model.addRow(data);
				
				//new String[] { "cccrdgf", "cccsdfdf", "cccdgd"}
				//model.addRow();
				System.out.println(model.getRowCount());
				
				displayorder.setBackground(Color.RED);
				//displayorder.setSize(331, 494);
				//displayorder.setSize(331, 494);
				//displayorder.setSize(331, 494);
				//displayorder.setSize(331, 494);
				//displayorder.setLocation(0,0);
				panel_1.add(displayorder);
				System.out.println(displayorder.getBounds());
				//PanelDisplayOrder dp=new PanelDisplayOrder("fgbf");
				//panel_1.setSize(null);
				//panel_1.setBounds(0, 0, 331, 494);
				
				//panel_1.add(displayorder);
				//displayorder.setVisible(true);
				//dp.table.setBackground(Color.red);
				//panel_1.remove(dp.panel);
				
				
				//System.out.println(dp.table.getBackground());
			//	panel_1.add(dp);
				
		//		System.out.println(panel_1.getBounds());
				//dp.pane.setVisible(false);
				//dp.table.setVisible(false);
				//PanelDisplayOrder dp=new PanelDisplayOrder("testing");
				//dp.label1.setText("jghh");
				//panel_1.add(dp);
				//dp.setVisible(true);
				//dp.label1.setText("DFGDF");
				//dp.getRootPane().setVisible(true);
				
				
				//dp.label1.setText("testing");
				/*
				Res
				
				PanelDisplayOrder display=new PanelDisplayOrder();
				System.out.println(display.table.getColumnCount());
        		DefaultTableModel model = (DefaultTableModel) display.table.getModel();
        		 model.addRow(new String[] { "cccrdgf", "cccsdfdf", "cccdgd"});
        		//scrollPane.setViewportView(table);
        	
        		//display.addRow(button.getText());
        		 panel_1.add(display.table);
        	 */
				
				
			}
		});
		btnNewButton.setBounds(214, 533, 117, 29);
		frame.getContentPane().add(btnNewButton);
		
		//panel_1.add(displayorder);
		
		//menuClicked(displayorder);
		//displayorder.setVisible(true);
		
		//displayorder.setBounds(0,0,331,494);
		
		//new PanelDisplayOrder();
		
	///	panelDisplay.add(displayorder);
		//addrow("sample");
		
		//JPanel panelDisplay = new JPanel();
		//panelDisplay.setBounds(6, 6, 328, 494);
		
		//frame.getContentPane().add(panelDisplay);
		
		//JPanel DisplayOrder = new JPanel();
		//DisplayOrder.setBounds(6, 6, 328, 494);
		//frame.getContentPane().add(DisplayOrder);
		
		
		
		
		
		
		
}
}
