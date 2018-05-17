package poketmon.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageInputStream;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import poketmon.dao.PoketmonDAO;
import poketmon.vo.Poketmon;
import javax.swing.JScrollPane;
import javax.swing.JList;
import java.awt.Component;
import java.awt.Point;

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
	private PoketmonDAO dao = new PoketmonDAO();
	private Poketmon poketmon = new Poketmon();
	private JPanel panel_5;
	private JPanel panel_15;
	ArrayList<String> arr = new ArrayList<>();
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnMain;
	private JScrollPane scrollPane;
	private JList list;
	ArrayList<Poketmon> arrPoketmon;
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

		arrPoketmon = new ArrayList<>();
		arrPoketmon = dao.selectAll();


		setBackground(Color.WHITE);
		setResizable(false);
		setTitle("Poketmon");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		setBounds(screenSize.width / 2 - 900 / 2, screenSize.height / 2 - 600 / 2, 900, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		Image img = kit.getImage("poketmon.png");
		setIconImage(img);

		panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		btnMain = new JButton("Main");
		btnMain.addActionListener(this);
		btnMain.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		btnMain.setPreferredSize(new Dimension(60, 40));
		btnMain.setBorder(new LineBorder(new Color(147, 112, 219), 1, true));
		btnMain.setBackground(new Color(147, 112, 219));
		panel.add(btnMain);

		panel_5 = new JPanel();
		panel_5.setPreferredSize(new Dimension(700, 40));
		panel_5.setBackground(new Color(255, 153, 0));
		panel.add(panel_5);

		textField = new JTextField();
		textField.setFont(new Font("SansSerif", Font.PLAIN, 17));
		panel_5.add(textField);
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		textField.setBackground(Color.WHITE);
		textField.setPreferredSize(new Dimension(6, 30));
		textField.setMinimumSize(new Dimension(6, 25));
		textField.setBorder(null);
		textField.setColumns(48);

		btnNewButton = new JButton("검색");
		btnNewButton.setPreferredSize(new Dimension(57, 30));
		btnNewButton.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		panel_5.add(btnNewButton);
		btnNewButton.addActionListener(this);
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setBorder(new LineBorder(Color.ORANGE));

		panel_2 = new JPanel();
		
		
		panel_1 = new JPanel();
		panel_1.setPreferredSize(new Dimension(340, 10));
		panel_1.setBackground(Color.ORANGE);
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));

		panel_6 = new JPanel();
		panel_6.setBackground(new Color(64, 224, 208));
		panel_1.add(panel_6, BorderLayout.NORTH);
		panel_6.setLayout(new GridLayout(0, 2, 0, 0));

		panel_13 = new JPanel();
		panel_13.setBackground(Color.ORANGE);
		panel_6.add(panel_13);
		panel_13.setLayout(new GridLayout(2, 0, 0, 0));

		lblNewLabel_18 = new JTextField("한국이름");
		lblNewLabel_18.setBackground(Color.ORANGE);
		lblNewLabel_18.setBorder(new LineBorder(Color.WHITE, 1, true));
		lblNewLabel_18.setForeground(Color.BLACK);
		lblNewLabel_18.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		lblNewLabel_18.setHorizontalAlignment(SwingConstants.CENTER);
		panel_13.add(lblNewLabel_18);

		lblNewLabel_19 = new JTextField("일본이름");
		lblNewLabel_19.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_19.setBorder(new LineBorder(Color.WHITE, 1, true));
		lblNewLabel_19.setBackground(Color.ORANGE);
		lblNewLabel_19.setForeground(new Color(0, 0, 0));
		lblNewLabel_19.setFont(new Font("Arial Unicode MS", Font.BOLD, 17));

		lblNewLabel_19.setForeground(new Color(25, 25, 112));

		panel_13.add(lblNewLabel_19);

		panel_14 = new JPanel();
		panel_14.setBackground(Color.WHITE);
		panel_6.add(panel_14);
		panel_14.setLayout(new BorderLayout(0, 0));

		lblNewLabel_20 = new JTextField("No. 000");
		lblNewLabel_20.setBorder(new LineBorder(new Color(220, 220, 220)));

		lblNewLabel_20.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_20.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		panel_14.add(lblNewLabel_20);

		panel_7 = new JPanel();
		panel_7.setBackground(Color.WHITE);
		panel_1.add(panel_7, BorderLayout.CENTER);
		panel_7.setLayout(new BorderLayout(0, 0));
		lblNewLabel_21 = new JLabel(new ImageIcon("poketlogo.png"));
		lblNewLabel_21.setHorizontalTextPosition(SwingConstants.CENTER);
		panel_7.add(lblNewLabel_21);
		panel_2.setBackground(Color.ORANGE);
		contentPane.add(panel_2, BorderLayout.WEST);
		
		listSeting();
		
		

		panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(Color.ORANGE, 1, true));
		panel_3.setPreferredSize(new Dimension(430, 10));
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
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		lblNewLabel.setBackground(Color.ORANGE);
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);

		lblNewLabel.setBorder(new LineBorder(Color.WHITE, 1, true));
		panel_8.add(lblNewLabel);

		lblNewLabel_1 = new JLabel("몸무게");
		lblNewLabel_1.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		lblNewLabel_1.setBackground(Color.ORANGE);
		lblNewLabel_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBorder(new LineBorder(Color.WHITE, 1, true));
		panel_8.add(lblNewLabel_1);

		lblNewLabel_2 = new JTextField();
		lblNewLabel_2.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBorder(new LineBorder(new Color(211, 211, 211), 1, true));
		lblNewLabel_2.setBackground(Color.WHITE);
		lblNewLabel_2.setColumns(10);
		panel_8.add(lblNewLabel_2);

		lblNewLabel_3 = new JTextField("");
		lblNewLabel_3.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBorder(new LineBorder(new Color(211, 211, 211), 1, true));
		lblNewLabel_3.setBackground(Color.WHITE);
		lblNewLabel_3.setColumns(10);
		panel_8.add(lblNewLabel_3);

		panel_9 = new JPanel();
		panel_9.setBackground(Color.ORANGE);
		panel_9.setBorder(new LineBorder(Color.WHITE, 1, true));
		panel_3.add(panel_9);
		panel_9.setLayout(new GridLayout(2, 2, 0, 0));

		lblNewLabel_4 = new JLabel("포획률");
		lblNewLabel_4.setBackground(Color.ORANGE);
		lblNewLabel_4.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_4.setBorder(new LineBorder(Color.WHITE, 1, true));
		panel_9.add(lblNewLabel_4);

		lblNewLabel_5 = new JLabel("성비");
		lblNewLabel_5.setBackground(Color.ORANGE);
		lblNewLabel_5.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		lblNewLabel_5.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBorder(new LineBorder(Color.WHITE, 1, true));
		panel_9.add(lblNewLabel_5);

		lblNewLabel_6 = new JTextField();
		lblNewLabel_6.setFont(new Font("SansSerif", Font.BOLD, 13));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBorder(new LineBorder(new Color(211, 211, 211), 1, true));
		lblNewLabel_6.setBackground(Color.WHITE);
		lblNewLabel_6.setColumns(10);
		panel_9.add(lblNewLabel_6);

		lblNewLabel_7 = new JTextField();
		lblNewLabel_7.setFont(new Font("SansSerif", Font.BOLD, 13));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBorder(new LineBorder(new Color(211, 211, 211), 1, true));
		lblNewLabel_7.setBackground(Color.WHITE);
		lblNewLabel_7.setColumns(10);
		panel_9.add(lblNewLabel_7);

		panel_10 = new JPanel();
		panel_10.setBackground(Color.ORANGE);
		panel_10.setBorder(new LineBorder(Color.WHITE, 1, true));
		panel_3.add(panel_10);
		panel_10.setLayout(new GridLayout(2, 2, 0, 0));

		lblNewLabel_16 = new JLabel("LV.100 경험치");
		lblNewLabel_16.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		panel_10.add(lblNewLabel_16);
		lblNewLabel_16.setBackground(Color.ORANGE);
		lblNewLabel_16.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_16.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_16.setBorder(new LineBorder(Color.WHITE, 1, true));

		lblNewLabel_9 = new JLabel("분류");
		lblNewLabel_9.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		lblNewLabel_9.setBackground(Color.ORANGE);
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_9.setBorder(new LineBorder(Color.WHITE, 1, true));
		panel_10.add(lblNewLabel_9);

		lblNewLabel_17 = new JTextField();
		lblNewLabel_17.setFont(new Font("SansSerif", Font.BOLD, 13));
		panel_10.add(lblNewLabel_17);
		lblNewLabel_17.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_17.setBorder(new LineBorder(new Color(211, 211, 211), 1, true));
		lblNewLabel_17.setBackground(Color.WHITE);
		lblNewLabel_17.setColumns(10);

		lblNewLabel_11 = new JTextField();
		lblNewLabel_11.setFont(new Font("SansSerif", Font.BOLD, 13));
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11.setBorder(new LineBorder(new Color(211, 211, 211), 1, true));
		lblNewLabel_11.setBackground(Color.WHITE);
		lblNewLabel_11.setColumns(10);
		panel_10.add(lblNewLabel_11);

		panel_11 = new JPanel();
		panel_11.setBackground(Color.ORANGE);
		panel_11.setBorder(new LineBorder(Color.WHITE, 1, true));
		panel_3.add(panel_11);
		panel_11.setLayout(new GridLayout(2, 2, 0, 0));

		lblNewLabel_12 = new JLabel("특성");
		lblNewLabel_12.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		lblNewLabel_12.setBackground(Color.ORANGE);
		lblNewLabel_12.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12.setBorder(new LineBorder(Color.WHITE, 1, true));
		panel_11.add(lblNewLabel_12);

		lblNewLabel_13 = new JLabel("숨겨진 특성");
		lblNewLabel_13.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		lblNewLabel_13.setBackground(Color.ORANGE);
		lblNewLabel_13.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_13.setBorder(new LineBorder(Color.WHITE, 1, true));
		panel_11.add(lblNewLabel_13);

		lblNewLabel_14 = new JTextField();
		lblNewLabel_14.setFont(new Font("SansSerif", Font.BOLD, 13));
		lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_14.setBorder(new LineBorder(new Color(211, 211, 211), 1, true));
		lblNewLabel_14.setBackground(Color.WHITE);
		lblNewLabel_14.setColumns(10);
		panel_11.add(lblNewLabel_14);

		lblNewLabel_15 = new JTextField();
		lblNewLabel_15.setFont(new Font("SansSerif", Font.BOLD, 13));
		lblNewLabel_15.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_15.setBorder(new LineBorder(new Color(211, 211, 211), 1, true));
		lblNewLabel_15.setBackground(Color.WHITE);
		lblNewLabel_15.setColumns(10);
		panel_11.add(lblNewLabel_15);

		panel_12 = new JPanel();
		panel_12.setBackground(Color.ORANGE);
		panel_12.setBorder(new LineBorder(Color.WHITE, 1, true));
		panel_3.add(panel_12);
		panel_12.setLayout(new GridLayout(2, 0, 0, 0));

		lblNewLabel_8 = new JLabel("타입");
		lblNewLabel_8.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		panel_12.add(lblNewLabel_8);
		lblNewLabel_8.setBackground(Color.ORANGE);
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_8.setBorder(new LineBorder(Color.WHITE, 1, true));

		lblNewLabel_10 = new JTextField();
		lblNewLabel_10.setFont(new Font("SansSerif", Font.BOLD, 13));
		panel_12.add(lblNewLabel_10);
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10.setBorder(new LineBorder(new Color(211, 211, 211), 1, true));
		lblNewLabel_10.setBackground(Color.WHITE);
		lblNewLabel_10.setColumns(10);

		panel_15 = new JPanel();
		panel_15.setBackground(Color.ORANGE);
		contentPane.add(panel_15, BorderLayout.SOUTH);

		panel_4 = new JPanel();
		panel_15.add(panel_4);
		panel_4.setBackground(Color.ORANGE);

		btnNewButton_1 = new JButton("등록");
		btnNewButton_1.setBorder(new LineBorder(new Color(255, 165, 0)));
		btnNewButton_1.setPreferredSize(new Dimension(57, 30));
		btnNewButton_1.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		btnNewButton_1.addActionListener(this);

		btnNewButton_4 = new JButton("사진등록/수정");
		btnNewButton_4.setPreferredSize(new Dimension(110, 30));
		btnNewButton_4.setBorder(new LineBorder(new Color(255, 165, 0)));
		btnNewButton_4.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		btnNewButton_4.setBackground(new Color(255, 165, 0));
		btnNewButton_4.addActionListener(this);
		panel_4.add(btnNewButton_4);
		btnNewButton_1.setBackground(new Color(255, 165, 0));
		btnNewButton_1.setMargin(new Insets(2, 20, 2, 20));
		panel_4.add(btnNewButton_1);

		btnNewButton_2 = new JButton("수정");
		btnNewButton_2.setPreferredSize(new Dimension(57, 30));
		btnNewButton_2.setBorder(new LineBorder(new Color(255, 165, 0)));
		btnNewButton_2.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		btnNewButton_2.addActionListener(this);
		btnNewButton_2.setBackground(new Color(255, 165, 0));
		btnNewButton_2.setMargin(new Insets(2, 20, 2, 20));
		panel_4.add(btnNewButton_2);

		btnNewButton_3 = new JButton("삭제");
		btnNewButton_3.setBorder(new LineBorder(new Color(255, 165, 0)));
		btnNewButton_3.setPreferredSize(new Dimension(57, 30));
		btnNewButton_3.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		btnNewButton_3.addActionListener(this);
		btnNewButton_3.setBackground(new Color(255, 165, 0));
		btnNewButton_3.setMargin(new Insets(2, 20, 2, 20));
		panel_4.add(btnNewButton_3);

		btnNewButton_5 = new JButton("갱신");
		btnNewButton_5.setPreferredSize(new Dimension(57, 30));
		btnNewButton_5.setBorder(new LineBorder(new Color(255, 165, 0)));
		btnNewButton_5.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		btnNewButton_5.setBackground(new Color(255, 165, 0));
		btnNewButton_5.addActionListener(this);
		panel_4.add(btnNewButton_5);
	}

	public void actionPerformed(ActionEvent e) {

		JButton jb = (JButton) e.getSource();
		String getText = textField.getText();
		boolean result = true;

		if (jb == btnNewButton) {
			if (getText == null) {
				result = false;
				// dao.getWikidata(getText);
				// dao.getWikiPhoto(getText);
			} else {
				if (getText.codePointAt(0) >= 44032 && getText.codePointAt(0) <= 55215) {
					System.out.println("한글");
					poketmon = dao.findPoketmon(getText);
					if (poketmon == null) {
						result = false;
					}
				} else {
					System.out.println("일어");
					poketmon = dao.findPoketmon2(getText);
					if (poketmon == null) {
						result = false;
					}
				}

			}

			if (result) {
				lblNewLabel_20.setText(poketmon.getNo());
				lblNewLabel_18.setText(poketmon.getKor_name());
				lblNewLabel_19.setText(poketmon.getJap_name());
				lblNewLabel_2.setText(poketmon.getHeight());
				lblNewLabel_3.setText(poketmon.getWeight());
				lblNewLabel_6.setText("" + poketmon.getC_rate());
				lblNewLabel_7.setText(poketmon.getG_rate());
				lblNewLabel_10.setText(poketmon.getType());
				lblNewLabel_11.setText(poketmon.getSort());
				lblNewLabel_14.setText(poketmon.getCharacter());
				lblNewLabel_15.setText(poketmon.getH_character());
				lblNewLabel_17.setText(poketmon.getE_point());
			}

			if (!result) {
				// 경고창
				Warning w = new Warning("존재하지 않습니다!");
				w.setVisible(true);
			}
		}

		if (jb == btnNewButton_1) {
			if (dao.findPoketmon(lblNewLabel_18.getText()) != null) {
				result = false;
			}
			if (result) {
				poketmon.setNo(lblNewLabel_20.getText());
				poketmon.setKor_name(lblNewLabel_18.getText());
				poketmon.setJap_name(lblNewLabel_19.getText());
				poketmon.setHeight(lblNewLabel_2.getText());
				poketmon.setWeight(lblNewLabel_3.getText());
				poketmon.setC_rate(Integer.parseInt(lblNewLabel_6.getText()));
				poketmon.setG_rate(lblNewLabel_7.getText());
				poketmon.setType(lblNewLabel_10.getText());
				poketmon.setSort(lblNewLabel_11.getText());
				poketmon.setCharacter(lblNewLabel_14.getText());
				poketmon.setH_character(lblNewLabel_15.getText());
				poketmon.setE_point(lblNewLabel_17.getText());
				result = dao.insertPoketmon(poketmon);
				if(result) {
					Warning w = new Warning("등록성공");
					w.setVisible(true);
				}
			}
			if (!result) {
				// 경고창
				Warning w = new Warning("등록할 수 없습니다.");
				w.setVisible(true);
			}
		}
		if (jb == btnNewButton_2) {
			if (dao.findPoketmon(lblNewLabel_18.getText()) == null) {
				result = false;
			}
			if (result) {
				poketmon.setNo(lblNewLabel_20.getText());
				poketmon.setKor_name(lblNewLabel_18.getText());
				poketmon.setJap_name(lblNewLabel_19.getText());
				poketmon.setHeight(lblNewLabel_2.getText());
				poketmon.setWeight(lblNewLabel_3.getText());
				poketmon.setC_rate(Integer.parseInt(lblNewLabel_6.getText()));
				poketmon.setG_rate(lblNewLabel_7.getText());
				poketmon.setType(lblNewLabel_10.getText());
				poketmon.setSort(lblNewLabel_11.getText());
				poketmon.setCharacter(lblNewLabel_14.getText());
				poketmon.setH_character(lblNewLabel_15.getText());
				poketmon.setE_point(lblNewLabel_17.getText());
				result = dao.updatePoketmon(poketmon);
			}
			if (!result) {
				// 경고창
				Warning w = new Warning("수정할 수 없습니다.");
				w.setVisible(true);
			} else {
				Warning w = new Warning("수정 성공");
				w.setVisible(true);
			}

		}

		if (jb == btnNewButton_4) {
			String name = null;
			JFileChooser fc = new JFileChooser();
			fc.showOpenDialog(this);
			File ofile = fc.getSelectedFile();
			try {
				FileImageInputStream fis = new FileImageInputStream(ofile);
				name = lblNewLabel_18.getText();
				System.out.println(name);
				File sfile = new File("images\\" + name + ".png");
				OutputStream os = new FileOutputStream(sfile);
				byte[] b = new byte[2048];
				int length = 0;

				while ((length = fis.read(b)) != -1) {
					os.write(b, 0, length);
				}

				fis.close();
				os.close();

				Runtime.getRuntime().gc();
				Warning w = new Warning("사진등록 성공!");
				w.setVisible(true);

			} catch (FileNotFoundException e1) {
				// e1.printStackTrace();
			} catch (IOException e1) {
				// e1.printStackTrace();
			}

		}

		if (jb == btnNewButton_5) {
			init();
			for (String s : arr) {
				getText = s;
				System.out.println(getText + " 데이터 확인 중..");

				if (dao.findPoketmon(getText) == null) {
					result = dao.getWikidata(getText);
				}
				dao.getWikiPhoto(getText);
			}

			if (result) {
				// 경고창
				Warning w = new Warning("갱신 성공!");
				w.setVisible(true);
			}
		}

		if (jb == btnNewButton_3) {
			if (dao.findPoketmon(lblNewLabel_18.getText()) == null) {
				result = false;
			}
			if (result) {
				dao.deletePoketmon(lblNewLabel_18.getText());
				// Icon icon = new ImageIcon("");
				// lblNewLabel_21.setIcon(icon);
				lblNewLabel_20.setText("");
				lblNewLabel_18.setText("");
				lblNewLabel_19.setText("");
				lblNewLabel_2.setText("");
				lblNewLabel_3.setText("");
				lblNewLabel_6.setText("");
				lblNewLabel_7.setText("");
				lblNewLabel_10.setText("");
				lblNewLabel_11.setText("");
				lblNewLabel_14.setText("");
				lblNewLabel_15.setText("");
				lblNewLabel_17.setText("");
			}
			if (!result) {
				// 경고창
				Warning w = new Warning("삭제할 수 없습니다.");
				w.setVisible(true);
			} else {
				poketmon = new Poketmon();
				Warning w = new Warning("삭제 성공");
				w.setVisible(true);
			}
		}
		
		Image image1 = null;
		
		try {
			if (poketmon != null) {
				File sourceimage = new File("images\\" + poketmon.getKor_name() + ".png");
				image1 = ImageIO.read(sourceimage);
			}
			
		} catch (Exception e1) {
			try {
				File sourceimage = new File("images\\" + lblNewLabel_18.getText() + ".png");
				image1 = ImageIO.read(sourceimage);
				Icon icon = new ImageIcon(image1);
				lblNewLabel_21.setIcon(icon);
			} catch (Exception e2) {
				Icon icon = new ImageIcon("poketlogo.png");
				lblNewLabel_21.setIcon(icon);
			}
		}
		
		panel_2.remove(scrollPane);
		listSeting();
		
		repaint();
		validate();

		if (jb == btnMain) {
			MainUI m = new MainUI();
			m.setVisible(true);
			this.dispose();
		}

	}

	public ArrayList<String> init() {
		String initUrl = "http://ko.pokemon.wikia.com/wiki/%EA%B5%AD%EA%B0%80%EB%B3%84_%ED%8F%AC%EC%BC%93%EB%AA%AC_%EC%9D%B4%EB%A6%84_%EB%AA%A9%EB%A1%9D";
		Connection con = Jsoup.connect(initUrl);
		Elements els = null;
		int count = 0;
		try {
			Document doc = con.get();
			els = doc.select("a.mw-redirect");
			for (Element ee : els) {
				arr.add(ee.text());
				count++;
				if (count == 807)
					break;
			}

		} catch (IOException e) {
			// e.printStackTrace();
		} finally {
			//
		}
		return arr;
	}
	
	public void listSeting() {
		
		arrPoketmon = dao.selectAll();
		list = new JList(toArrayString(arrPoketmon));
		list.setFont(new Font("SansSerif", list.getFont().getStyle(), list.getFont().getSize()));
		list.addListSelectionListener(new ListSelectionListener() {

            @Override
            public void valueChanged(ListSelectionEvent levent) {
                if (!levent.getValueIsAdjusting()) {                	
                	int i = list.getSelectedIndex();
                	lblNewLabel_20.setText(arrPoketmon.get(i).getNo());
    				lblNewLabel_18.setText(arrPoketmon.get(i).getKor_name());
    				lblNewLabel_19.setText(arrPoketmon.get(i).getJap_name());
    				lblNewLabel_2.setText(arrPoketmon.get(i).getHeight());
    				lblNewLabel_3.setText(arrPoketmon.get(i).getWeight());
    				lblNewLabel_6.setText(""+ arrPoketmon.get(i).getC_rate());
    				lblNewLabel_7.setText(arrPoketmon.get(i).getG_rate());
    				lblNewLabel_10.setText(arrPoketmon.get(i).getType());
    				lblNewLabel_11.setText(arrPoketmon.get(i).getSort());
    				lblNewLabel_14.setText(arrPoketmon.get(i).getCharacter());
    				lblNewLabel_15.setText(arrPoketmon.get(i).getH_character());
    				lblNewLabel_17.setText(arrPoketmon.get(i).getE_point());
    				
    				Image image1 = null;
    				File sourceimage = new File("images\\" + arrPoketmon.get(i).getKor_name() + ".png");
    				try {
    					if (arrPoketmon.get(i) != null)
    						image1 = ImageIO.read(sourceimage);
    					try {
    						Icon icon = new ImageIcon(image1);
    						lblNewLabel_21.setIcon(icon);
    					} catch (Exception e2) {
    						Icon icon = new ImageIcon("poketlogo.png");
    						lblNewLabel_21.setIcon(icon);
    					}
    				} catch (IOException e1) {
    					Icon icon = new ImageIcon("poketlogo.png");
    					lblNewLabel_21.setIcon(icon);
    				}
                }
                repaint();
        		validate();
            }
        });
		
		
		
		scrollPane = new JScrollPane(list);
		scrollPane.setPreferredSize(new Dimension(170, 455));
		panel_2.add(scrollPane);
		
		
	}
	
	
public String[] toArrayString (ArrayList<Poketmon> p) {
	String[] str = new String [p.size()];
	for(int i =0; i<p.size();i++)
		str[i]=p.get(i).getNo()+" "+p.get(i).getKor_name();
	return str;

}	
	
}
