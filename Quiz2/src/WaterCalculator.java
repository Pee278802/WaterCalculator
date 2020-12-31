import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class WaterCalculator {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WaterCalculator window = new WaterCalculator();
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
	public WaterCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblMyWeightkg = new JLabel("My weight (kg):");
		lblMyWeightkg.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblMyWeightkg.setBounds(72, 74, 125, 25);
		frame.getContentPane().add(lblMyWeightkg);
		
		JLabel lblHowMuchWater = new JLabel("How much water should I drink?");
		lblHowMuchWater.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblHowMuchWater.setBounds(60, 13, 318, 33);
		frame.getContentPane().add(lblHowMuchWater);
		
		JButton btnTellMe = new JButton("Tell Me");
		btnTellMe.setForeground(Color.RED);
		btnTellMe.setFont(new Font("Sitka Heading", Font.BOLD, 22));
		btnTellMe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Double weight;
				try {
					weight = Double.parseDouble (textField.getText());
					weight = weight * 0.033;
			JOptionPane.showMessageDialog(null, "Buddy you should drink " + weight +" L of water a day!");
				} catch(Exception e) {
			}
		}
		});
		btnTellMe.setBounds(137, 143, 140, 49);
		frame.getContentPane().add(btnTellMe);
		
		textField = new JTextField();
		textField.setBounds(209, 75, 125, 24);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	}
}
