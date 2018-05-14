package poketmon.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import java.io.File;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import poketmon.dao.PoketmonDAO;
import poketmon.vo.Poketmon;

import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PoketmonAdminUI extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JPanel panel;
	private JPanel panel_2;
	private JPanel panel_1;
	private JPanel panel_3;
	private JPanel panel_4;
	private JTextField textField;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JPanel panel_6;
	private JPanel panel_7;
	private JPanel panel_8;
	private JPanel panel_9;
	private JPanel panel_10;
	private JPanel panel_11;
	private JPanel panel_12;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField lblNewLabel_2;
	private JTextField lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JTextField lblNewLabel_6;
	private JTextField lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JTextField lblNewLabel_10;
	private JTextField lblNewLabel_11;
	private JLabel lblNewLabel_12;
	private JLabel lblNewLabel_13;
	private JTextField lblNewLabel_14;
	private JTextField lblNewLabel_15;
	private JLabel lblNewLabel_16;
	private JTextField lblNewLabel_17;
	private JPanel panel_13;
	private JPanel panel_14;
	private JTextField lblNewLabel_18;
	private JTextField lblNewLabel_19;
	private JTextField lblNewLabel_20;
	private JLabel lblNewLabel_21;
	private JTextField textField_1;
	private PoketmonDAO dao = new PoketmonDAO();
	private Poketmon poketmon = new Poketmon();
	private JPanel panel_5;
	private JPanel panel_15;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PoketmonAdminUI frame = new PoketmonAdminUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public PoketmonAdminUI() {
		setBackground(Color.WHITE);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 500);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		panel_5 = new JPanel();
		panel_5.setBackground(new Color(255, 153, 0));
		panel.add(panel_5);
		
		textField = new JTextField();
		panel_5.add(textField);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBackground(Color.WHITE);
		textField.setPreferredSize(new Dimension(6, 25));
		textField.setMinimumSize(new Dimension(6, 25));
		textField.setBorder(null);
		textField.setColumns(30);
		
		btnNewButton = new JButton("검색");
		panel_5.add(btnNewButton);
		btnNewButton.addActionListener(this);
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setBorder(UIManager.getBorder("Button.border"));
		
		
		panel_2 = new JPanel();
		
		panel_1 = new JPanel();
		panel_1.setPreferredSize(new Dimension(360, 10));
		panel_1.setBackground(Color.ORANGE);
		contentPane.add(panel_1, BorderLayout.WEST);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		panel_6 = new JPanel();
		panel_6.setBackground(new Color(64, 224, 208));
		panel_1.add(panel_6, BorderLayout.NORTH);
		panel_6.setLayout(new GridLayout(0, 2, 0, 0));
		
		panel_13 = new JPanel();
		panel_13.setBackground(Color.ORANGE);
		panel_6.add(panel_13);
		panel_13.setLayout(new GridLayout(2, 0, 0, 0));
		
		lblNewLabel_18 = new JTextField("한국_이름");
		lblNewLabel_18.setBorder(new LineBorder(new Color(171, 173, 179)));
		lblNewLabel_18.setBackground(Color.ORANGE);
		lblNewLabel_18.setForeground(new Color(25, 25, 112));
		lblNewLabel_18.setFont(new Font("SansSerif", lblNewLabel_18.getFont().getStyle() | Font.BOLD, 25));
		lblNewLabel_18.setHorizontalAlignment(SwingConstants.CENTER);
		panel_13.add(lblNewLabel_18);
		
		lblNewLabel_19 = new JTextField("일본어_이름");
		lblNewLabel_19.setBorder(new LineBorder(new Color(171, 173, 179)));
		lblNewLabel_19.setBackground(Color.ORANGE);
		lblNewLabel_19.setForeground(new Color(25, 25, 112));
		lblNewLabel_19.setFont(new Font("SansSerif", lblNewLabel_19.getFont().getStyle(), lblNewLabel_19.getFont().getSize()));
		lblNewLabel_19.setHorizontalAlignment(SwingConstants.CENTER);
		panel_13.add(lblNewLabel_19);
		
		panel_14 = new JPanel();
		panel_14.setBackground(Color.WHITE);
		panel_6.add(panel_14);
		panel_14.setLayout(new BorderLayout(0, 0));
		
		lblNewLabel_20 = new JTextField("No. 000");
		lblNewLabel_20.setBorder(new LineBorder(new Color(171, 173, 179)));
		lblNewLabel_20.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_20.setFont(new Font("SansSerif", lblNewLabel_20.getFont().getStyle() | Font.BOLD, 25));
		panel_14.add(lblNewLabel_20);
		
		panel_7 = new JPanel();
		panel_7.setBackground(Color.WHITE);
		panel_1.add(panel_7, BorderLayout.CENTER);
		panel_7.setLayout(new BorderLayout(0, 0));
		lblNewLabel_21 = new JLabel(new ImageIcon("images\\.png"));
		lblNewLabel_21.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_21.setHorizontalTextPosition(SwingConstants.CENTER);
		panel_7.add(lblNewLabel_21, BorderLayout.CENTER);
		panel_2.setBackground(Color.ORANGE);
		contentPane.add(panel_2, BorderLayout.CENTER);
		
		String path = null;
		
		panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(Color.ORANGE, 1, true));
		panel_3.setPreferredSize(new Dimension(260, 10));
		panel_3.setBackground(Color.ORANGE);
		contentPane.add(panel_3, BorderLayout.EAST);
		panel_3.setLayout(new GridLayout(5, 0, 0, 0));
		
		panel_8 = new JPanel();
		panel_8.setPreferredSize(new Dimension(15, 10));
		panel_8.setBackground(Color.ORANGE);
		panel_8.setBorder(new LineBorder(Color.WHITE, 1, true));
		panel_3.add(panel_8);
		panel_8.setLayout(new GridLayout(2, 2, 0, 0));
		
		lblNewLabel = new JLabel("키");
		lblNewLabel.setFont(new Font("SansSerif", lblNewLabel.getFont().getStyle() | Font.BOLD, 18));
		lblNewLabel.setBackground(Color.ORANGE);
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblNewLabel.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, true));
		panel_8.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("몸무게");
		lblNewLabel_1.setFont(new Font("SansSerif", lblNewLabel.getFont().getStyle() | Font.BOLD, 18));
		lblNewLabel_1.setBackground(Color.ORANGE);
		lblNewLabel_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, true));
		panel_8.add(lblNewLabel_1);
		
		
		lblNewLabel_2 = new JTextField();
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, true));
		lblNewLabel_2.setBackground(Color.WHITE);
		lblNewLabel_2.setColumns(10);
		panel_8.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JTextField("");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, true));
		lblNewLabel_3.setBackground(Color.WHITE);
		lblNewLabel_3.setColumns(10);
		panel_8.add(lblNewLabel_3);
		
		panel_9 = new JPanel();
		panel_9.setBackground(Color.ORANGE);
		panel_9.setBorder(new LineBorder(Color.WHITE, 1, true));
		panel_3.add(panel_9);
		panel_9.setLayout(new GridLayout(2, 2, 0, 0));
		
		lblNewLabel_4 = new JLabel("포획률");
		lblNewLabel_4.setFont(new Font("SansSerif", lblNewLabel.getFont().getStyle() | Font.BOLD, 18));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_4.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, true));
		panel_9.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("성비");
		lblNewLabel_5.setFont(new Font("SansSerif", lblNewLabel.getFont().getStyle() | Font.BOLD, 18));
		lblNewLabel_5.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, true));
		panel_9.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JTextField();
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, true));
		lblNewLabel_6.setBackground(Color.WHITE);
		lblNewLabel_6.setColumns(10);
		panel_9.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JTextField();
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, true));
		lblNewLabel_7.setBackground(Color.WHITE);
		lblNewLabel_7.setColumns(10);
		panel_9.add(lblNewLabel_7);
		
		panel_10 = new JPanel();
		panel_10.setBackground(Color.ORANGE);
		panel_10.setBorder(new LineBorder(Color.WHITE, 1, true));
		panel_3.add(panel_10);
		panel_10.setLayout(new GridLayout(2, 2, 0, 0));
		
		lblNewLabel_8 = new JLabel("타입");
		lblNewLabel_8.setFont(new Font("SansSerif", lblNewLabel.getFont().getStyle() | Font.BOLD, 18));
		lblNewLabel_8.setBackground(Color.ORANGE);
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_8.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, true));
		panel_10.add(lblNewLabel_8);
		
		lblNewLabel_9 = new JLabel("분류");
		lblNewLabel_9.setFont(new Font("SansSerif", lblNewLabel.getFont().getStyle() | Font.BOLD, 18));
		lblNewLabel_9.setBackground(Color.ORANGE);
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_9.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, true));
		panel_10.add(lblNewLabel_9);
		
		lblNewLabel_10 = new JTextField();
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, true));
		lblNewLabel_10.setBackground(Color.WHITE);
		lblNewLabel_10.setColumns(10);
		panel_10.add(lblNewLabel_10);
		
		lblNewLabel_11 = new JTextField();
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, true));
		lblNewLabel_11.setBackground(Color.WHITE);
		lblNewLabel_11.setColumns(10);
		panel_10.add(lblNewLabel_11);
		
		panel_11 = new JPanel();
		panel_11.setBackground(Color.ORANGE);
		panel_11.setBorder(new LineBorder(Color.WHITE, 1, true));
		panel_3.add(panel_11);
		panel_11.setLayout(new GridLayout(2, 2, 0, 0));
		
		lblNewLabel_12 = new JLabel("특성");
		lblNewLabel_12.setFont(new Font("SansSerif", lblNewLabel.getFont().getStyle() | Font.BOLD, 18));
		lblNewLabel_12.setBackground(Color.ORANGE);
		lblNewLabel_12.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, true));
		panel_11.add(lblNewLabel_12);
		
		lblNewLabel_13 = new JLabel("숨겨진 특성");
		lblNewLabel_13.setFont(new Font("SansSerif", lblNewLabel.getFont().getStyle() | Font.BOLD, 18));
		lblNewLabel_13.setBackground(Color.ORANGE);
		lblNewLabel_13.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_13.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, true));
		panel_11.add(lblNewLabel_13);
		
		lblNewLabel_14 = new JTextField();
		lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_14.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, true));
		lblNewLabel_14.setBackground(Color.WHITE);
		lblNewLabel_14.setColumns(10);
		panel_11.add(lblNewLabel_14);
		
		lblNewLabel_15 = new JTextField();
		lblNewLabel_15.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_15.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, true));
		lblNewLabel_15.setBackground(Color.WHITE);
		lblNewLabel_15.setColumns(10);
		panel_11.add(lblNewLabel_15);
		
		panel_12 = new JPanel();
		panel_12.setBackground(Color.ORANGE);
		panel_12.setBorder(new LineBorder(Color.WHITE, 1, true));
		panel_3.add(panel_12);
		panel_12.setLayout(new GridLayout(2, 0, 0, 0));
		
		lblNewLabel_16 = new JLabel("Lv.100 경험치량");
		lblNewLabel_16.setFont(new Font("SansSerif", lblNewLabel.getFont().getStyle() | Font.BOLD, 18));
		lblNewLabel_16.setBackground(Color.ORANGE);
		lblNewLabel_16.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_16.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_16.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, true));
		panel_12.add(lblNewLabel_16);
		
		lblNewLabel_17 = new JTextField();
		lblNewLabel_17.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_17.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, true));
		lblNewLabel_17.setBackground(Color.WHITE);
		lblNewLabel_17.setColumns(10);
		panel_12.add(lblNewLabel_17);
		
		panel_15 = new JPanel();
		panel_15.setBackground(Color.ORANGE);
		contentPane.add(panel_15, BorderLayout.SOUTH);
		
		panel_4 = new JPanel();
		panel_15.add(panel_4);
		panel_4.setBackground(new Color(255, 153, 0));
		
		btnNewButton_1 = new JButton("등록");
		btnNewButton_1.addActionListener(this);
		btnNewButton_1.setBackground(Color.ORANGE);
		btnNewButton_1.setMargin(new Insets(2, 20, 2, 20));
		panel_4.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("수정");
		btnNewButton_2.addActionListener(this);
		btnNewButton_2.setBackground(Color.ORANGE);
		btnNewButton_2.setMargin(new Insets(2, 20, 2, 20));
		panel_4.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("삭제");
		btnNewButton_3.addActionListener(this);
		btnNewButton_3.setBackground(Color.ORANGE);
		btnNewButton_3.setMargin(new Insets(2, 20, 2, 20));
		panel_4.add(btnNewButton_3);
	}

	public void actionPerformed(ActionEvent e) {
		JButton jb = (JButton)e.getSource();
		String getText = null;
		if(jb==btnNewButton) {
			getText = textField.getText();
			if(dao.findPoketmon(getText)==null) {
				dao.getWikidata(getText);
				dao.getWikiPhoto(getText);
				
			}
				poketmon = dao.findPoketmon(getText);
				lblNewLabel_20.setText(poketmon.getNo());
				lblNewLabel_18.setText(poketmon.getKor_name());
				lblNewLabel_19.setText(poketmon.getJap_name());
				lblNewLabel_2.setText(poketmon.getHeight());
				lblNewLabel_3.setText(poketmon.getWeight());
				lblNewLabel_6.setText(""+poketmon.getC_rate());
				lblNewLabel_7.setText(poketmon.getG_rate());
				lblNewLabel_10.setText(poketmon.getType());
				lblNewLabel_11.setText(poketmon.getSort());
				lblNewLabel_14.setText(poketmon.getCharacter());
				lblNewLabel_15.setText(poketmon.getH_character());
				lblNewLabel_17.setText(poketmon.getE_point());
				Icon icon =new ImageIcon("images\\"+getText+".png");
				lblNewLabel_21.setIcon(icon);
				panel_7.add(lblNewLabel_21, BorderLayout.CENTER);
			
			
		}
		if(jb==btnNewButton) {}
		if(jb==btnNewButton) {}
		if(jb==btnNewButton) {}
		repaint();
	}
}
