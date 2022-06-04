import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
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
	private JTable table;

	/**
	 * Launch the application.
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		
		Connection conn=null;
		String databaseName="Restaurant";
		String url="jdbc:mysql://localhost:3306/"+databaseName;
		
		String username="root";
		String password="Malolos_21!";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn=DriverManager.getConnection(url,username,password);
		
		
		
		PreparedStatement ps=conn.prepareStatement("insert into food values (4,'sdf','sdf','fhfgh');");
		ps.executeUpdate();
		
		
		
		
		
		
		
		
		
		
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
		frame.setBounds(100, 100, 973, 543);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(315, 132, 124, 65);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_4 = new JButton("New button");
		btnNewButton_4.setBounds(437, 132, 124, 65);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("New button");
		btnNewButton_5.setBounds(560, 132, 124, 65);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(315, 194, 124, 65);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_4_1 = new JButton("New button");
		btnNewButton_4_1.setBounds(437, 194, 124, 65);
		frame.getContentPane().add(btnNewButton_4_1);
		
		JButton btnNewButton_5_1 = new JButton("New button");
		btnNewButton_5_1.setBounds(560, 194, 124, 65);
		frame.getContentPane().add(btnNewButton_5_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(315, 257, 124, 65);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_4_2 = new JButton("New button");
		btnNewButton_4_2.setBounds(437, 257, 124, 65);
		frame.getContentPane().add(btnNewButton_4_2);
		
		JButton btnNewButton_5_2 = new JButton("New button");
		btnNewButton_5_2.setBounds(560, 257, 124, 65);
		frame.getContentPane().add(btnNewButton_5_2);
		
		JButton btnNewButton_3 = new JButton("Chicken");
		btnNewButton_3.setBounds(315, 47, 124, 44);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4_3 = new JButton("Pork");
		btnNewButton_4_3.setBounds(432, 47, 143, 44);
		frame.getContentPane().add(btnNewButton_4_3);
		
		JButton btnNewButton_5_3 = new JButton("Fish");
		btnNewButton_5_3.setBounds(574, 47, 150, 44);
		frame.getContentPane().add(btnNewButton_5_3);
		
		table = new JTable();
		table.setBounds(24, 38, 264, 415);
		frame.getContentPane().add(table);
		
		JLabel lblNewLabel = new JLabel("TOTAL");
		lblNewLabel.setBounds(24, 455, 61, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_6 = new JButton("Proceed to Payment");
		btnNewButton_6.setBounds(338, 391, 223, 62);
		frame.getContentPane().add(btnNewButton_6);
	}
}
