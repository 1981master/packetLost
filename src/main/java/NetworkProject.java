import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class NetworkProject extends JFrame {

	private JPanel contentPane;
	//JPanel drawingBorder;
	Graphics g;
	static DrawCable dc;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		int w = 600;
		int h = 400;
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NetworkProject frame = new NetworkProject();
				    dc = new DrawCable(100,200);
					frame.setTitle("Network Project");
					//frame.getContentPane().add(dc);
					frame.add(dc);
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
					
		
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public NetworkProject() {
		//get panel Garaphics
		 //g = drawingBorder.getGraphics();
		 //set Graphic Object
		// drawingBorder.paintComponents(g);
		 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 582, 368);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Start");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(413, 11, 63, 23);
		contentPane.add(btnNewButton);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"100 packet/s", "300 packet/s", "500 packet/s"}));
		comboBox.setBounds(83, 11, 100, 22);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel = new JLabel("Emission rate");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel.setBounds(10, 13, 89, 18);
		contentPane.add(lblNewLabel);
		
		JLabel lblTransmissionRate = new JLabel("Transmission rate");
		lblTransmissionRate.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblTransmissionRate.setBounds(193, 13, 100, 18);
		contentPane.add(lblTransmissionRate);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnReset.setBounds(482, 11, 74, 23);
		contentPane.add(btnReset);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"300 packet/s", "500 packet/s", "800 packet/s"}));
		comboBox_1.setBounds(303, 11, 100, 22);
		contentPane.add(comboBox_1);
		
		JLabel lblNewLabel_1 = new JLabel(" msec");
		lblNewLabel_1.setForeground(new Color(199, 21, 133));
		lblNewLabel_1.setBounds(79, 268, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel(" packets dropped out of ");
		lblNewLabel_2.setForeground(new Color(199, 21, 133));
		lblNewLabel_2.setBounds(79, 293, 138, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("0");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1.setForeground(new Color(199, 21, 133));
		lblNewLabel_1_1.setBounds(31, 268, 46, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("0");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2.setForeground(new Color(199, 21, 133));
		lblNewLabel_1_2.setBounds(31, 293, 46, 14);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("0");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_3.setForeground(new Color(199, 21, 133));
		lblNewLabel_1_3.setBounds(221, 293, 46, 14);
		contentPane.add(lblNewLabel_1_3);
		
		JPanel drawingBorder = new JPanel();
		drawingBorder.setBackground(new Color(255, 255, 255));
		drawingBorder.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		drawingBorder.setBounds(10, 42, 546, 226);
		contentPane.add(drawingBorder);
	}
}
