package poketmon.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Warning extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JPanel panel;
	private JPanel warn_panel;
	private JPanel ok_panel;
	private JLabel lblNewLabel;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Warning frame = new Warning("");
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
	public Warning(String text) {
		setResizable(false);
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		setBounds(screenSize.width / 2  - 250/2, screenSize.height / 2 - 150/2, 250, 150);
		
		setTitle("Check the message!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setBounds(700, 400, 250, 150);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		warn_panel = new JPanel();
		panel.add(warn_panel);
		warn_panel.setLayout(new BorderLayout(0, 0));
		
		lblNewLabel = new JLabel(text);
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		warn_panel.add(lblNewLabel);
		
		ok_panel = new JPanel();
		panel.add(ok_panel);
		
		btnNewButton = new JButton("확인");
		btnNewButton.addActionListener(this);
		ok_panel.add(btnNewButton);
		
		
	}

	public void actionPerformed(ActionEvent e) {
		dispose();
	}
}
