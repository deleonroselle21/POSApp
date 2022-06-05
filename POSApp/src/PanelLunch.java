import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class PanelLunch extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelLunch() {
		setBackground(Color.LIGHT_GRAY);
		setBounds(0,0,652,397);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.BLACK));
		panel.setBounds(0, 0, 217, 79);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("HONEY SESAME SHRIMP");
		lblNewLabel.setBounds(36, 29, 148, 16);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(Color.BLACK));
		panel_1.setBounds(217, 0, 217, 79);
		add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("TRIPLE DELIGHT");
		lblNewLabel_1.setBounds(58, 30, 100, 16);
		panel_1.add(lblNewLabel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(435, 0, 217, 79);
		add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 80, 217, 79);
		add(panel_3);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(217, 80, 217, 79);
		add(panel_1_1);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBounds(435, 80, 217, 79);
		add(panel_2_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(0, 160, 217, 79);
		add(panel_4);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBounds(217, 160, 217, 79);
		add(panel_1_2);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setBounds(435, 160, 217, 79);
		add(panel_2_2);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(0, 240, 217, 79);
		add(panel_5);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setBounds(217, 240, 217, 79);
		add(panel_1_3);
		
		JPanel panel_2_3 = new JPanel();
		panel_2_3.setBounds(435, 240, 217, 79);
		add(panel_2_3);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(0, 318, 217, 79);
		add(panel_6);
		
		JPanel panel_1_4 = new JPanel();
		panel_1_4.setBounds(217, 318, 217, 79);
		add(panel_1_4);
		
		JPanel panel_2_4 = new JPanel();
		panel_2_4.setBounds(435, 318, 217, 79);
		add(panel_2_4);

	}

}
