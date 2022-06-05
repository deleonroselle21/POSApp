import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
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
		
		panel.setVisible(true);
		
	}
	
	
	/**
	 * Create the application.
	 */
	public RestMain() {
		initialize();
		 
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
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
		
		
		
		JPanel panel = new JPanel();
		panel.setBounds(342, 6, 682, 494);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
	
		
		
		
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
		
		
		
	}
}
