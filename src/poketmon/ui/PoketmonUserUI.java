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

		
		h2_panel = new JPanel();
		height_panel.add(h2_panel);
		h2_panel.setLayout(new BorderLayout(0, 0));
		
		lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		h2_panel.add(lblNewLabel_1);
		
		weight_panel = new JPanel();
		top_panel.add(weight_panel);
		weight_panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		w_panel = new JPanel();
		weight_panel.add(w_panel);
		
		w2_panel = new JPanel();
		weight_panel.add(w2_panel);
		
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
