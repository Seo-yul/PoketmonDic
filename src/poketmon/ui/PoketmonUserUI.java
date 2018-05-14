package poketmon.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.UIManager;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JSplitPane;
import javax.swing.JTextPane;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Component;

public class PoketmonUserUI extends JFrame {

	private JPanel contentPane;
	private JPanel find_panel;
	private JPanel insert_panel;
	private JTextField insert_tf;
	private JButton insert_btn;
	private JPanel left_panel;
	private JPanel right_panel;
	private JPanel top_panel;
	private JPanel bottom_panel;
	private JPanel height_panel;
	private JPanel weight_panel;
	private JPanel c_rate_panel;
	private JPanel g_rate_panel;
	private JPanel type_panel;
	private JPanel sort_panel;
	private JPanel character_panel;
	private JPanel h_character_panel;
	private JPanel basic_panel;
	private JPanel image_panel;
	private JPanel name_panel;
	private JPanel num_panel;
	private JPanel ko_name_panel;
	private JPanel jp_name_panel;
	private JLabel ko_name_lbl;
	private JLabel jp_name_lbl;
	private JLabel image_lbl;
	private JPanel panel;
	private JLabel num_lbl;
	private JPanel e_point_panel;
	private JPanel h_panel;
	private JLabel lblNewLabel;
	private JPanel h2_panel;
	private JLabel lblNewLabel_1;
	private JPanel center_panel;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PoketmonUserUI frame = new PoketmonUserUI();
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
	public PoketmonUserUI() {
		setBackground(Color.WHITE);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500,400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		Toolkit kit = Toolkit.getDefaultToolkit();
		Image img = kit.getImage("poketmon.png");
		setIconImage(img);
		
		find_panel = new JPanel();
		contentPane.add(find_panel, BorderLayout.NORTH);
		
		insert_panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) insert_panel.getLayout();
		insert_panel.setBackground(Color.ORANGE);
		insert_panel.setPreferredSize(new Dimension(410, 30));
		find_panel.add(insert_panel);
		
		insert_tf = new JTextField(25);
		insert_panel.add(insert_tf);
		
		//insert_tf.setColumns(10);
		//insert_tf.setPreferredSize(new Dimension(50, 20));
		insert_btn = new JButton("검색");
		insert_btn.setForeground(Color.BLACK);
		insert_btn.setBackground(Color.ORANGE);
		

		find_panel.add(insert_btn);
		
		left_panel = new JPanel();
		contentPane.add(left_panel, BorderLayout.WEST);
		left_panel.setPreferredSize(new Dimension(220, 300));
		left_panel.setLayout(new BorderLayout(0, 0));
		
		basic_panel = new JPanel();
		basic_panel.setBackground(Color.ORANGE);
		left_panel.add(basic_panel, BorderLayout.NORTH);
		basic_panel.setLayout(new GridLayout(0, 2, 0, 0));
		basic_panel.setPreferredSize(new Dimension(220, 100));
		
		name_panel = new JPanel();
		basic_panel.add(name_panel);
		name_panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		ko_name_panel = new JPanel();
		//ko_name_panel.setPreferredSize(new Dimension(80, 40));
		ko_name_panel.setBackground(Color.ORANGE);
		name_panel.add(ko_name_panel);
		ko_name_panel.setLayout(new BorderLayout(0, 0));
		
		ko_name_lbl = new JLabel("한국이름");
		ko_name_lbl.setPreferredSize(new Dimension(30, 30));
		ko_name_lbl.setHorizontalTextPosition(SwingConstants.CENTER);
		ko_name_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		ko_name_panel.add(ko_name_lbl);
		
		jp_name_panel = new JPanel();
		jp_name_panel.setBackground(Color.ORANGE);
		name_panel.add(jp_name_panel);
		jp_name_panel.setLayout(new BorderLayout(0, 0));
		
		jp_name_lbl = new JLabel("일본이름");
		jp_name_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		jp_name_lbl.setHorizontalTextPosition(SwingConstants.CENTER);
		jp_name_panel.add(jp_name_lbl);
		
		num_panel = new JPanel();
		//num_panel.setPreferredSize(new Dimension(80, 80));
		num_panel.setBackground(Color.ORANGE);
		basic_panel.add(num_panel);
		num_panel.setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		num_panel.add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		num_lbl = new JLabel("No. 000");
		num_lbl.setHorizontalTextPosition(SwingConstants.CENTER);
		num_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(num_lbl);
		
		image_panel = new JPanel();
		left_panel.add(image_panel);
		image_panel.setLayout(new BorderLayout(0, 0));
		
		image_lbl = new JLabel("New label");
		image_lbl.setHorizontalTextPosition(SwingConstants.CENTER);
		image_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		image_panel.add(image_lbl);
		image_panel.setPreferredSize(new Dimension(220, 280));
		right_panel = new JPanel();
		right_panel.setPreferredSize(new Dimension(250, 280));
		contentPane.add(right_panel, BorderLayout.EAST);
		right_panel.setLayout(new BorderLayout(0, 0));
		
		top_panel = new JPanel();
		right_panel.add(top_panel, BorderLayout.CENTER);
		top_panel.setLayout(new GridLayout(0, 2, 2, 2));
		
		height_panel = new JPanel();
		top_panel.add(height_panel);
		height_panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		h_panel = new JPanel();
		h_panel.setBackground(Color.ORANGE);
		height_panel.add(h_panel);
		h_panel.setLayout(new BorderLayout(0, 0));
		
		lblNewLabel = new JLabel("키");
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		h_panel.add(lblNewLabel);
		
		h2_panel = new JPanel();
		height_panel.add(h2_panel);
		h2_panel.setLayout(new BorderLayout(0, 0));
		
		lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		h2_panel.add(lblNewLabel_1);
		
		weight_panel = new JPanel();
		top_panel.add(weight_panel);
		
		c_rate_panel = new JPanel();
		top_panel.add(c_rate_panel);
		
		g_rate_panel = new JPanel();
		top_panel.add(g_rate_panel);
		
		type_panel = new JPanel();
		top_panel.add(type_panel);
		
		sort_panel = new JPanel();
		top_panel.add(sort_panel);
		
		character_panel = new JPanel();
		top_panel.add(character_panel);
		
		h_character_panel = new JPanel();
		top_panel.add(h_character_panel);
		
		bottom_panel = new JPanel();
		right_panel.add(bottom_panel, BorderLayout.SOUTH);
		bottom_panel.setLayout(new BorderLayout(0, 0));
		
		e_point_panel = new JPanel();
		bottom_panel.add(e_point_panel, BorderLayout.NORTH);
		
		center_panel = new JPanel();
		center_panel.setEnabled(false);
		center_panel.setAlignmentY(Component.TOP_ALIGNMENT);
		center_panel.setAlignmentX(Component.LEFT_ALIGNMENT);
		center_panel.setPreferredSize(new Dimension(1, 1));
		contentPane.add(center_panel, BorderLayout.CENTER);
		center_panel.setLayout(new BorderLayout(0, 0));
		
		
	}

}
