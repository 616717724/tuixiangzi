package tuixiangzi_class_file;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Font;

import javax.swing.ImageIcon;

import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JTextField;
import javax.swing.DropMode;
import javax.swing.JTextArea;

public class Game_Help extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Game_Help frame = new Game_Help();
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
	public Game_Help() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setIconImage(new ImageIcon(Game_Interface.class.getResource("/img/1.png")).getImage());
		this.setTitle("”Œœ∑∞Ô÷˙");
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
//				GameFrame dianji=new GameFrame();
//				dianji.setVisible(true);
				dispose();
			}
		});
		setBounds(400,180, 397, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("ÀŒÃÂ", Font.BOLD | Font.ITALIC, 16));
		textArea.setEditable(false);
		textArea.setText("\u6E38\u620F\u89C4\u5219\uFF1A\u79FB\u52A8\u72D0\u72F8\u628A\u793C\u7269\u63A8\u7ED9\u6811\u61D2\uFF0C\r\n         \u6240\u6709\u7684\u6811\u61D2\u6536\u5230\u793C\u7269\u7740\u901A\u5173\u3002\r\n\r\n\u64CD\u4F5C\u65B9\u5F0F\uFF1A\u2191\uFF0C\u2193\uFF0C\u2190\uFF0C\u2192\uFF0C\u64CD\u4F5C\u4EBA\u7269\u79FB\u52A8\u3002");
		textArea.setBounds(10, 61, 357, 170);
		contentPane.add(textArea);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Game_Help.class.getResource("/img/help.jpg")));
		lblNewLabel.setToolTipText("");
		lblNewLabel.setBounds(5, 5, 367, 260);
		contentPane.add(lblNewLabel);
	}
}
