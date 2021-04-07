package tuixiangzi_class_file;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

public class Game_Mod extends JFrame{
	private JPanel contentPane;
	static Game_Mod frame = new Game_Mod();
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Game_Mod() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300,30,520+130+12,540+150);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label_challenge = new JLabel("");
		label_challenge.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Game_ChooseMap frame;
				try {
					frame = new Game_ChooseMap();
					frame.setVisible(true);
					dispose();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
		});
		label_challenge.setIcon(null);
		label_challenge.setBounds(169, 344, 145, 43);
		contentPane.add(label_challenge);
		
		JLabel label_creat = new JLabel("");
		label_creat.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Game_CreateMap frame = new Game_CreateMap();
				frame.Open();
				frame.setVisible(true);
				dispose();
			}
		});
		label_creat.setBounds(364, 344, 126, 43);
		contentPane.add(label_creat);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Game_Mod.class.getResource("/img/mod2.png")));
		lblNewLabel_1.setBounds(-39, 10, 708, 604);
		contentPane.add(lblNewLabel_1);
		 this.setIconImage(new ImageIcon(Game_Interface.class.getResource("/img/1.png")).getImage());
		 this.setTitle("疯狂推礼物");
	}
}
