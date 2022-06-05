import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;

public class PanelChicken extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelChicken() {
		setBackground(Color.MAGENTA);
		setBounds(0,0,652,397);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CHICKEN");
		lblNewLabel.setBackground(Color.ORANGE);
		lblNewLabel.setBounds(209, 106, 61, 16);
		add(lblNewLabel);

	}

}
