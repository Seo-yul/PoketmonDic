package poketmon.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.FlowLayout;

public class MainUI extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JButton btnNewButton;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainUI frame = new MainUI();
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
	public MainUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setTitle("Let's go Poketmon!");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		panel_1 = new JPanel();
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		btnNewButton = new JButton("사용자 모드");
		btnNewButton.setBounds(136, 25, 150, 80);
		
		panel_1.add(btnNewButton);
		
		panel_2 = new JPanel();
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		btnNewButton_1 = new JButton("관리자 모드");
		btnNewButton_1.setBounds(137, 22, 150, 80);
		panel_2.add(btnNewButton_1);
		
		
	}
}
