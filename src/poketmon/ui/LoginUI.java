package poketmon.ui;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import poketmon.dao.PoketmonDAO;
import poketmon.vo.Manager;

public class LoginUI extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JPasswordField passwordField;
	private JButton confirm;
	private JButton cancel;
	private PoketmonDAO dao = new PoketmonDAO();
	private JLabel lblNewLabel_1;
	private JTextField name_tf;
	private JLabel lblNewLabel_2;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginUI frame = new LoginUI();
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
	public LoginUI() {
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Image img = kit.getImage("poketmon.png");
		setIconImage(img);
		setBounds(screenSize.width / 2  - 250/2, screenSize.height / 2 - 200/2, 250, 200);
		setTitle("Admin Login");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Password");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("돋움", Font.BOLD, 13));
		lblNewLabel.setBounds(12, 75, 86, 22);
		contentPane.add(lblNewLabel);
		
		passwordField = new JPasswordField(10);
		passwordField.setBounds(110, 76, 112,21);
		contentPane.add(passwordField);
		
		confirm = new JButton("확인");
		confirm.addActionListener(this);
		confirm.setBounds(42, 119, 72, 22);
		contentPane.add(confirm);
		
		cancel = new JButton("취소");
		cancel.addActionListener(this);
		cancel.setBounds(122, 119, 70, 23);
		contentPane.add(cancel);
		
		lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("돋움", Font.BOLD, 13));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(12, 50, 57, 15);
		contentPane.add(lblNewLabel_1);
		
		name_tf = new JTextField();
		name_tf.setBounds(110, 45, 112, 21);
		contentPane.add(name_tf);
		name_tf.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Admin Login");
		lblNewLabel_2.setFont(new Font("Arial Unicode MS", Font.BOLD, 14));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(58, 15, 120, 25);
		contentPane.add(lblNewLabel_2);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == confirm) {
			String name = name_tf.getText();
			String pwd = String.valueOf(passwordField.getPassword());
			
			
			Manager m = dao.checkPassword(name);
			if (m != null) {
			if (name.equals(m.getName()) && pwd.equals(m.getPwd())) {
				PoketmonAdminUI ui = new PoketmonAdminUI();
				ui.setVisible(true);
				dispose();
			} else {
				Warning w = new Warning("비밀번호가 틀렸습니다!");
				w.setVisible(true);
			}
			
			
		} else {
			Warning w = new Warning("없는 관리자 입니다!");
			w.setVisible(true);
		}
		}
		
		if (e.getSource() == cancel) {
			MainUI ui = new MainUI();
			ui.setVisible(true);
			dispose();
		}
		
	}
}
