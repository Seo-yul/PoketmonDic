package poketmon.ui;


import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.BorderLayout;
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
import javax.swing.border.LineBorder;

import poketmon.dao.PoketmonDAO;
import poketmon.vo.Poketmon;

import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class PoketmonUserUI extends JFrame implements ActionListener {

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
	private JPanel e_point_panel;
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
	private JPanel tp_panel;
	private JPanel h_panel;
	private JLabel h_lbl;
	private JPanel h2_panel;
	private JLabel hv_lbl;
	private JPanel center_panel;
	private JPanel w_panel;
	private JPanel w2_panel;
	private JLabel w_lbl;
	private JLabel wv_lbl;
	private JPanel tp2_panel;
	private JLabel tp_lbl;
	private JLabel tpv_lbl;
	private JPanel c_panel;
	private JPanel c2_lbl;
	private JLabel c_lbl;
	private JLabel cv_lbl;
	private JPanel e_panel;
	private JPanel ev_panel;
	private JPanel g_panel;
	private JPanel g2_panel;
	private JLabel g_lbl;
	private JLabel gv_lbl;
	private JLabel e_lbl;
	private JLabel ev_lbl;
	private JPanel s_panel;
	private JPanel s2_panel;
	private JLabel s_lbl;
	private JLabel sv_lbl;
	private JPanel ch_panel;
	private JPanel ch2_panel;
	private JLabel ch_lbl;
	private JLabel chv_lbl;
	private JPanel hch_panel;
	private JPanel hch2_panel;
	private JLabel hch_lbl;
	private JLabel hchv_lbl;
	private PoketmonDAO dao = new PoketmonDAO();
	private JButton main_btn;
	
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
	
	public PoketmonUserUI() {
		setResizable(false);
		setTitle("Poketmon");
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		setBounds(screenSize.width / 2  - 800/2, screenSize.height / 2 - 500/2, 800, 500);
		
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		Image img = kit.getImage("poketmon.png");
		setIconImage(img);
		
		find_panel = new JPanel();
		find_panel.setBackground(Color.ORANGE);
		contentPane.add(find_panel, BorderLayout.NORTH);
		
		main_btn = new JButton("Main");
		main_btn.addActionListener(this);
		main_btn.setPreferredSize(new Dimension(60, 40));
		main_btn.setBorder(new LineBorder(new Color(147, 112, 219), 1, true));
		find_panel.add(main_btn);
		main_btn.setBackground(new Color(147, 112, 219));
		main_btn.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		
		insert_panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) insert_panel.getLayout();
		insert_panel.setBackground(new Color(255, 165, 0));
		insert_panel.setPreferredSize(new Dimension(600, 40));
		find_panel.add(insert_panel);
		
		insert_tf = new JTextField(43);
		insert_tf.setPreferredSize(new Dimension(200, 30));
		insert_tf.setFont(new Font("SansSerif", insert_tf.getFont().getStyle(), 17));
		insert_panel.add(insert_tf);
		
		insert_btn = new JButton("검색");
		insert_btn.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		insert_btn.addActionListener(this);
		insert_btn.setBorder(new LineBorder(new Color(255, 165, 0), 1, true));
		insert_btn.setPreferredSize(new Dimension(60, 40));
		insert_btn.setHorizontalTextPosition(SwingConstants.CENTER);
		insert_btn.setForeground(Color.BLACK);
		insert_btn.setBackground(new Color(255, 165, 0));
		

		find_panel.add(insert_btn);
		
		left_panel = new JPanel();
		contentPane.add(left_panel, BorderLayout.WEST);
		left_panel.setPreferredSize(new Dimension(340, 300));
		left_panel.setLayout(new BorderLayout(0, 0));
		
		basic_panel = new JPanel();
		basic_panel.setBorder(new LineBorder(Color.WHITE, 1, true));
		basic_panel.setBackground(Color.ORANGE);
		left_panel.add(basic_panel, BorderLayout.NORTH);
		basic_panel.setLayout(new GridLayout(0, 2, 0, 0));
		basic_panel.setPreferredSize(new Dimension(220, 100));
		
		name_panel = new JPanel();
		name_panel.setBorder(new LineBorder(Color.WHITE, 1, true));
		basic_panel.add(name_panel);
		name_panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		ko_name_panel = new JPanel();
		ko_name_panel.setBorder(new LineBorder(Color.WHITE, 1, true));
		ko_name_panel.setBackground(Color.ORANGE);
		name_panel.add(ko_name_panel);
		ko_name_panel.setLayout(new BorderLayout(0, 0));
		
		ko_name_lbl = new JLabel("???");
		ko_name_lbl.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		ko_name_lbl.setBorder(new LineBorder(Color.WHITE, 1, true));
		ko_name_lbl.setPreferredSize(new Dimension(30, 30));
		ko_name_lbl.setHorizontalTextPosition(SwingConstants.CENTER);
		ko_name_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		ko_name_panel.add(ko_name_lbl);
		
		jp_name_panel = new JPanel();
		jp_name_panel.setBorder(new LineBorder(Color.WHITE, 1, true));
		jp_name_panel.setBackground(Color.ORANGE);
		name_panel.add(jp_name_panel);
		jp_name_panel.setLayout(new BorderLayout(0, 0));
		
		jp_name_lbl = new JLabel("???");
		jp_name_lbl.setFont(new Font("Arial Unicode MS", Font.BOLD, 15));
		jp_name_lbl.setBorder(new LineBorder(Color.WHITE, 1, true));
		jp_name_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		jp_name_lbl.setHorizontalTextPosition(SwingConstants.CENTER);
		jp_name_panel.add(jp_name_lbl);
		
		num_panel = new JPanel();
		num_panel.setBackground(Color.ORANGE);
		basic_panel.add(num_panel);
		num_panel.setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		num_panel.add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		num_lbl = new JLabel("No. ???");
		num_lbl.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		num_lbl.setBorder(new LineBorder(SystemColor.controlHighlight, 1, true));
		num_lbl.setHorizontalTextPosition(SwingConstants.CENTER);
		num_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(num_lbl);
		
		image_panel = new JPanel();
		
		image_panel.setBackground(Color.WHITE);
		left_panel.add(image_panel);
		image_panel.setLayout(new BorderLayout(0, 0));
		
		image_lbl = new JLabel(new ImageIcon("poketlogo.png"));
		image_lbl.setBorder(new LineBorder(Color.WHITE, 1, true));
		image_lbl.setHorizontalTextPosition(SwingConstants.CENTER);
		image_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		image_panel.add(image_lbl);
		image_panel.setPreferredSize(new Dimension(220, 280));
		right_panel = new JPanel();
		right_panel.setBorder(new LineBorder(Color.ORANGE, 1, true));
		right_panel.setBackground(new Color(255, 200, 0));
		right_panel.setPreferredSize(new Dimension(430, 280));
		contentPane.add(right_panel, BorderLayout.EAST);
		right_panel.setLayout(new BorderLayout(0, 0));
		
		top_panel = new JPanel();
		top_panel.setBackground(Color.ORANGE);
		right_panel.add(top_panel, BorderLayout.CENTER);
		top_panel.setLayout(new GridLayout(0, 2, 2, 2));
		
		height_panel = new JPanel();
		height_panel.setBorder(new LineBorder(Color.WHITE, 1, true));
		top_panel.add(height_panel);
		height_panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		h_panel = new JPanel();
		h_panel.setBackground(Color.ORANGE);
		height_panel.add(h_panel);
		h_panel.setLayout(new BorderLayout(0, 0));
		
		h_lbl = new JLabel("키");
		h_lbl.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		h_lbl.setBorder(new LineBorder(Color.ORANGE, 1, true));
		h_lbl.setHorizontalTextPosition(SwingConstants.CENTER);
		h_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		h_panel.add(h_lbl);
		
		h2_panel = new JPanel();
		h2_panel.setBackground(Color.WHITE);
		height_panel.add(h2_panel);
		h2_panel.setLayout(new BorderLayout(0, 0));
		
		hv_lbl = new JLabel("?");
		hv_lbl.setFont(new Font("SansSerif", hv_lbl.getFont().getStyle(), 13));
		hv_lbl.setBorder(new LineBorder(Color.WHITE, 1, true));
		hv_lbl.setBackground(Color.WHITE);
		hv_lbl.setHorizontalTextPosition(SwingConstants.CENTER);
		hv_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		h2_panel.add(hv_lbl);
		
		weight_panel = new JPanel();
		weight_panel.setBorder(new LineBorder(Color.WHITE, 1, true));
		top_panel.add(weight_panel);
		weight_panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		w_panel = new JPanel();
		w_panel.setBackground(Color.ORANGE);
		weight_panel.add(w_panel);
		w_panel.setLayout(new BorderLayout(0, 0));
		
		w_lbl = new JLabel("몸무게");
		w_lbl.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		w_lbl.setBorder(new LineBorder(Color.ORANGE, 1, true));
		w_lbl.setHorizontalTextPosition(SwingConstants.CENTER);
		w_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		w_panel.add(w_lbl);
		
		w2_panel = new JPanel();
		w2_panel.setBackground(Color.WHITE);
		weight_panel.add(w2_panel);
		w2_panel.setLayout(new BorderLayout(0, 0));
		
		wv_lbl = new JLabel("?");
		wv_lbl.setFont(new Font("SansSerif", wv_lbl.getFont().getStyle(), 13));
		wv_lbl.setBackground(Color.WHITE);
		wv_lbl.setBorder(new LineBorder(Color.WHITE, 1, true));
		wv_lbl.setHorizontalTextPosition(SwingConstants.CENTER);
		wv_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		w2_panel.add(wv_lbl);
		
		c_rate_panel = new JPanel();
		c_rate_panel.setBorder(new LineBorder(Color.WHITE, 1, true));
		top_panel.add(c_rate_panel);
		c_rate_panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		c_panel = new JPanel();
		c_panel.setBackground(Color.ORANGE);
		c_rate_panel.add(c_panel);
		c_panel.setLayout(new BorderLayout(0, 0));
		
		c_lbl = new JLabel("포획률");
		c_lbl.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		c_lbl.setBorder(new LineBorder(Color.ORANGE, 1, true));
		c_lbl.setHorizontalTextPosition(SwingConstants.CENTER);
		c_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		c_panel.add(c_lbl);
		
		c2_lbl = new JPanel();
		c2_lbl.setBackground(Color.WHITE);
		c_rate_panel.add(c2_lbl);
		c2_lbl.setLayout(new BorderLayout(0, 0));
		
		cv_lbl = new JLabel("?");
		cv_lbl.setFont(new Font("SansSerif", cv_lbl.getFont().getStyle(), 13));
		cv_lbl.setBackground(Color.WHITE);
		cv_lbl.setBorder(new LineBorder(Color.WHITE, 1, true));
		cv_lbl.setHorizontalTextPosition(SwingConstants.CENTER);
		cv_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		c2_lbl.add(cv_lbl);
		
		g_rate_panel = new JPanel();
		g_rate_panel.setBorder(new LineBorder(Color.WHITE, 1, true));
		top_panel.add(g_rate_panel);
		g_rate_panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		g_panel = new JPanel();
		g_panel.setBackground(Color.ORANGE);
		g_rate_panel.add(g_panel);
		g_panel.setLayout(new BorderLayout(0, 0));
		
		g_lbl = new JLabel("성비");
		g_lbl.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		g_lbl.setBorder(new LineBorder(Color.ORANGE, 1, true));
		g_lbl.setHorizontalTextPosition(SwingConstants.CENTER);
		g_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		g_panel.add(g_lbl);
		
		g2_panel = new JPanel();
		g2_panel.setBackground(Color.WHITE);
		g_rate_panel.add(g2_panel);
		g2_panel.setLayout(new BorderLayout(0, 0));
		
		gv_lbl = new JLabel("?");
		gv_lbl.setFont(new Font("SansSerif", gv_lbl.getFont().getStyle(), 13));
		gv_lbl.setBackground(Color.WHITE);
		gv_lbl.setBorder(new LineBorder(Color.WHITE, 1, true));
		gv_lbl.setHorizontalTextPosition(SwingConstants.CENTER);
		gv_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		g2_panel.add(gv_lbl);
		
		e_point_panel = new JPanel();
		e_point_panel.setBorder(new LineBorder(Color.WHITE, 1, true));
		top_panel.add(e_point_panel);
		e_point_panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		e_panel = new JPanel();
		e_panel.setBackground(Color.ORANGE);
		e_point_panel.add(e_panel);
		e_panel.setLayout(new BorderLayout(0, 0));
		
		e_lbl = new JLabel("LV.100 경험치");
		e_lbl.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		e_lbl.setBorder(new LineBorder(Color.ORANGE, 1, true));
		e_lbl.setHorizontalTextPosition(SwingConstants.CENTER);
		e_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		e_panel.add(e_lbl);
		
		ev_panel = new JPanel();
		ev_panel.setBackground(Color.WHITE);
		e_point_panel.add(ev_panel);
		ev_panel.setLayout(new BorderLayout(0, 0));
		
		ev_lbl = new JLabel("?");
		ev_lbl.setFont(new Font("SansSerif", ev_lbl.getFont().getStyle(), 13));
		ev_lbl.setBorder(new LineBorder(Color.WHITE, 1, true));
		ev_lbl.setBackground(Color.WHITE);
		ev_lbl.setHorizontalTextPosition(SwingConstants.CENTER);
		ev_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		ev_panel.add(ev_lbl);
		
		sort_panel = new JPanel();
		sort_panel.setBorder(new LineBorder(Color.WHITE, 1, true));
		top_panel.add(sort_panel);
		sort_panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		s_panel = new JPanel();
		s_panel.setBackground(Color.ORANGE);
		sort_panel.add(s_panel);
		s_panel.setLayout(new BorderLayout(0, 0));
		
		s_lbl = new JLabel("분류");
		s_lbl.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		s_lbl.setBorder(new LineBorder(Color.ORANGE, 1, true));
		s_lbl.setHorizontalTextPosition(SwingConstants.CENTER);
		s_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		s_panel.add(s_lbl);
		
		s2_panel = new JPanel();
		s2_panel.setBackground(Color.WHITE);
		sort_panel.add(s2_panel);
		s2_panel.setLayout(new BorderLayout(0, 0));
		
		sv_lbl = new JLabel("?");
		sv_lbl.setFont(new Font("SansSerif", sv_lbl.getFont().getStyle(), 15));
		sv_lbl.setBorder(new LineBorder(Color.WHITE, 1, true));
		sv_lbl.setBackground(Color.WHITE);
		sv_lbl.setHorizontalTextPosition(SwingConstants.CENTER);
		sv_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		s2_panel.add(sv_lbl);
		
		character_panel = new JPanel();
		character_panel.setBorder(new LineBorder(Color.WHITE, 1, true));
		top_panel.add(character_panel);
		character_panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		ch_panel = new JPanel();
		ch_panel.setBackground(Color.ORANGE);
		character_panel.add(ch_panel);
		ch_panel.setLayout(new BorderLayout(0, 0));
		
		ch_lbl = new JLabel("특성");
		ch_lbl.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		ch_lbl.setHorizontalTextPosition(SwingConstants.CENTER);
		ch_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		ch_panel.add(ch_lbl);
		
		ch2_panel = new JPanel();
		ch2_panel.setBorder(new LineBorder(Color.WHITE, 1, true));
		ch2_panel.setBackground(Color.WHITE);
		character_panel.add(ch2_panel);
		ch2_panel.setLayout(new BorderLayout(0, 0));
		
		chv_lbl = new JLabel("?");
		chv_lbl.setFont(new Font("SansSerif", chv_lbl.getFont().getStyle(), 13));
		chv_lbl.setHorizontalTextPosition(SwingConstants.CENTER);
		chv_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		chv_lbl.setBorder(new LineBorder(Color.WHITE, 1, true));
		chv_lbl.setBackground(Color.WHITE);
		ch2_panel.add(chv_lbl);
		
		h_character_panel = new JPanel();
		h_character_panel.setBorder(new LineBorder(Color.WHITE, 1, true));
		top_panel.add(h_character_panel);
		h_character_panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		hch_panel = new JPanel();
		hch_panel.setBackground(Color.ORANGE);
		h_character_panel.add(hch_panel);
		hch_panel.setLayout(new BorderLayout(0, 0));
		
		hch_lbl = new JLabel("숨겨진 특성");
		hch_lbl.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		hch_lbl.setHorizontalTextPosition(SwingConstants.CENTER);
		hch_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		hch_panel.add(hch_lbl);
		
		hch2_panel = new JPanel();
		hch2_panel.setBorder(new LineBorder(Color.WHITE, 1, true));
		hch2_panel.setBackground(Color.WHITE);
		h_character_panel.add(hch2_panel);
		hch2_panel.setLayout(new BorderLayout(0, 0));
		
		hchv_lbl = new JLabel("?");
		hchv_lbl.setFont(new Font("SansSerif", hchv_lbl.getFont().getStyle(), 13));
		hchv_lbl.setHorizontalTextPosition(SwingConstants.CENTER);
		hchv_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		hchv_lbl.setBorder(new LineBorder(Color.WHITE, 1, true));
		hchv_lbl.setBackground(Color.WHITE);
		hch2_panel.add(hchv_lbl);
		
		bottom_panel = new JPanel();
		bottom_panel.setBorder(new LineBorder(Color.WHITE, 1, true));
		right_panel.add(bottom_panel, BorderLayout.SOUTH);
		bottom_panel.setLayout(new BorderLayout(0, 0));
		
		tp_panel = new JPanel();
		tp_panel.setBorder(new LineBorder(Color.ORANGE, 1, true));
		tp_panel.setBackground(Color.ORANGE);
		bottom_panel.add(tp_panel, BorderLayout.NORTH);
		
		tp_lbl = new JLabel("타입");
		tp_lbl.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		tp_lbl.setHorizontalTextPosition(SwingConstants.CENTER);
		tp_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		tp_panel.add(tp_lbl);
		
		tp2_panel = new JPanel();
		tp2_panel.setBorder(new LineBorder(Color.WHITE, 1, true));
		tp2_panel.setBackground(Color.WHITE);
		bottom_panel.add(tp2_panel, BorderLayout.SOUTH);
		
		tpv_lbl = new JLabel("?");
		tpv_lbl.setFont(new Font("SansSerif", tpv_lbl.getFont().getStyle(), 13));
		tpv_lbl.setHorizontalTextPosition(SwingConstants.CENTER);
		tpv_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		tp2_panel.add(tpv_lbl);
		
		center_panel = new JPanel();
		center_panel.setBackground(Color.ORANGE);
		center_panel.setEnabled(false);
		center_panel.setAlignmentY(Component.TOP_ALIGNMENT);
		center_panel.setAlignmentX(Component.LEFT_ALIGNMENT);
		center_panel.setPreferredSize(new Dimension(1, 1));
		contentPane.add(center_panel, BorderLayout.CENTER);
		center_panel.setLayout(new BorderLayout(0, 0));
		
		
	}


	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand() == insert_btn.getActionCommand()) {
			boolean result = true;
			String name = insert_tf.getText();
			
			
			if (dao.findPoketmon(name) == null) {
				//result = dao.getWikidata(name);
				result = false;
			} 
			
			if (result) {
			dao.getWikiPhoto(name);
			num_lbl.setText(dao.findPoketmon(name).getNo());
			ko_name_lbl.setText(dao.findPoketmon(name).getKor_name());
			jp_name_lbl.setText(dao.findPoketmon(name).getJap_name());
			hv_lbl.setText(dao.findPoketmon(name).getHeight());
			wv_lbl.setText(dao.findPoketmon(name).getWeight());
			cv_lbl.setText(Integer.toString(dao.findPoketmon(name).getC_rate()));
			gv_lbl.setText(dao.findPoketmon(name).getG_rate());
			tpv_lbl.setText(dao.findPoketmon(name).getType());
			sv_lbl.setText(dao.findPoketmon(name).getSort());
			chv_lbl.setText(dao.findPoketmon(name).getCharacter());
			hchv_lbl.setText(dao.findPoketmon(name).getH_character());
			ev_lbl.setText(dao.findPoketmon(name).getE_point());
			Icon icon =new ImageIcon("images\\"+name+".png");
			image_lbl.setIcon(icon);
			}
			
			if (!result) {
				Warning w = new Warning("찾는 포켓몬이 없습니다!");
				w.setVisible(true);
			}
			
		}
		
		if (e.getActionCommand() == main_btn.getActionCommand()) {
			MainUI ui = new MainUI();
			ui.setVisible(true);
			dispose();
		}
		
		this.repaint();
	}
}