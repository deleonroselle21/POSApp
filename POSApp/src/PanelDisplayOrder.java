import javax.swing.JPanel;
import javax.swing.JTable;

public class PanelDisplayOrder extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public PanelDisplayOrder() {
		setLayout(null);
		
		table = new JTable();
		table.setBounds(0, 0, 328, 494);
		add(table);
		

	}

}
