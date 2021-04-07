package tuixiangzi_class_file;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.MessageContext;
import javax.swing.JLabel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;

public class GameFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	static GameFrame frame = new GameFrame();
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

	/**
	 * Create the frame.
	 */
	public GameFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300,30,520+130+12,540+150);
		setResizable(false);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		 this.setIconImage(new ImageIcon(Game_Interface.class.getResource("/img/1.png")).getImage());
		 this.setTitle("·è¿ñÍÆÀñÎï");
			//Game_test.guanka=1;
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Game_Help winframe=new Game_Help();
				winframe.setVisible(true);
			}
		});
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(137, 350, 127, 145);
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
//			Game_Interface frame = new Game_Interface();
//				frame.setVisible(true);
//				frame.Game_Open();
//				dispose();
				Game_Mod frame = new Game_Mod();
				frame.setVisible(true);
				dispose();
				
				
			}
		});
		contentPane.add(lblNewLabel_2);
	
		lblNewLabel_3.setIcon(new ImageIcon(GameFrame.class.getResource("/img/rule.png")));
		lblNewLabel_3.setBounds(480, 96, 77, 117);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		
		
		lblNewLabel.setBounds(0, 0, 656, 661);
		lblNewLabel.setIcon(new ImageIcon(Game_Interface.class.getResource("/img/main_pic.png")));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(0, 147, 64, 90);
lblNewLabel_1.addMouseListener(new MouseAdapter() {
			
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});
		contentPane.add(lblNewLabel_1);
	}
}
