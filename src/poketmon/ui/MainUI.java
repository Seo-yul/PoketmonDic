package poketmon.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;				

public class MainUI extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JButton usermode;
	private JButton managermode;
	private JFrame m;

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
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(screenSize.width / 2  - 640/2, screenSize.height / 2 - 370/2, 640, 370);
		setTitle("Let's go Poketmon!");
		Image img = kit.getImage("poketmon.png");
		setIconImage(img);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);
		usermode = new JButton("사용자 모드");
		usermode.addActionListener(this);
		usermode.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 215, 0), null, null, null));
		usermode.setBackground(Color.ORANGE);
		usermode.setFont(new Font("HY나무B", Font.BOLD, 23));
		usermode.setBounds(212, 100, 211, 60);
		contentPane.add(usermode);
		
		managermode = new JButton("관리자 모드");
		managermode.addActionListener(this);
		managermode.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 215, 0), null, null, null));
		managermode.setBackground(Color.ORANGE);
		managermode.setFont(new Font("HY나무B", Font.BOLD, 23));
		managermode.setBounds(212, 229, 211, 60);
		contentPane.add(managermode);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0,-11, 650,370 );
	
		lblNewLabel.setIcon(new ImageIcon(MainUI.class.getResource("/pokemon-1.jpg")));
		contentPane.add(lblNewLabel);
		
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == usermode) {
			PoketmonUserUI ui1 = new PoketmonUserUI();
			ui1.setVisible(true);
			dispose();
		} 
		
		if (e.getSource() == managermode) {
			
			LoginUI ui2 = new LoginUI();
			ui2.setVisible(true);
			dispose();
		}
	}
}
