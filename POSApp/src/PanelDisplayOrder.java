import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JScrollPane;

public class PanelDisplayOrder extends JPanel {
	//private JTable table;
	private final JScrollPane scrollPane = new JScrollPane();

	/**
	 * Create the panel.
	 */
	public PanelDisplayOrder() {
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
		
		
		/*
		table = new JTable();
		table.setBounds(0, 0, 331, 494);
		panel.add(table);
		
		table.setModel(new DefaultTableModel(new Object[][] {},new String[]{"NAME","QTY"}));
		setVisible(true);
		*/

	}
}
