package tuixiangzi_class_file;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.File;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Game_ChooseMap_test extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Game_ChooseMap_test frame = new Game_ChooseMap_test();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	public Game_ChooseMap_test() throws IOException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300,30,520+130+12+60,540+140);
		setTitle("疯狂推礼物关卡选择界面");
		setResizable(false);
		setIconImage(new ImageIcon(Game_Interface.class.getResource("/img/1.png")).getImage());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_pic01 = new JLabel("New label");
		//lbl_pic01.setIcon(new ImageIcon("G:\\eclipse-standard-kepler-SR2-win32\\eclipse\\workspace\\\u63A8\u7BB1\u5B502.0\\data\\map\\file_name.png"));
		
		lbl_pic01.setBounds(50, 60, 95, 68);
		contentPane.add(lbl_pic01);
		
		JLabel lbl_pic02 = new JLabel("New label");
		lbl_pic02.setBounds(225, 60, 95, 68);
		contentPane.add(lbl_pic02);
		
		JLabel lbl_pic03 = new JLabel("New label");
		lbl_pic03.setBounds(400, 60, 95, 68);
		contentPane.add(lbl_pic03);
		
		JLabel lbl_pic04 = new JLabel("New label");
		lbl_pic04.setBounds(575, 60, 95, 68);
		contentPane.add(lbl_pic04);
		
		JLabel lbl_pic05 = new JLabel("New label");
		lbl_pic05.setBounds(50, 240, 95, 68);
		contentPane.add(lbl_pic05);
		
		JLabel lbl_pic06 = new JLabel("New label");
		lbl_pic06.setBounds(225, 240, 95, 68);
		contentPane.add(lbl_pic06);
		
		JLabel lbl_pic07 = new JLabel("New label");
		lbl_pic07.setBounds(400, 240, 95, 68);
		contentPane.add(lbl_pic07);
		
		JLabel lbl_pic08 = new JLabel("New label");
		lbl_pic08.setBounds(575, 240, 95, 68);
		contentPane.add(lbl_pic08);
		
		JLabel lbl_pic09 = new JLabel("New label");
		lbl_pic09.setBounds(50, 420, 95, 68);
		contentPane.add(lbl_pic09);
		
		JLabel lbl_pic10 = new JLabel("New label");
		lbl_pic10.setBounds(225, 420, 95, 68);
		contentPane.add(lbl_pic10);
		
		JLabel lbl_pic11 = new JLabel("New label");
		lbl_pic11.setBounds(400, 420, 95, 68);
		contentPane.add(lbl_pic11);
		
		JLabel lbl_pic12 = new JLabel("New label");
		lbl_pic12.setBounds(575, 420, 95, 68);
		contentPane.add(lbl_pic12);
		
		JButton btnNewButton = new JButton("\u4E0A\u4E00\u9875");
		btnNewButton.setBounds(194, 568, 90, 60);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u4E0B\u4E00\u9875");
		btnNewButton_1.setBounds(430, 568, 90, 60);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("\u5171\u591A\u5C11\u9875");
		lblNewLabel_1.setBounds(294, 613, 54, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u5F53\u524D\u7B2C\u51E0\u9875");
		lblNewLabel_2.setBounds(354, 613, 74, 15);
		contentPane.add(lblNewLabel_2);
		
		JLabel lbl_name01 = new JLabel("New label");
		lbl_name01.setBounds(50, 160, 135, 15);
		contentPane.add(lbl_name01);
		
		JLabel lbl_name02 = new JLabel("New label");
		lbl_name02.setBounds(225, 160, 135, 15);
		contentPane.add(lbl_name02);
		
		JLabel lbl_name03 = new JLabel("New label");
		lbl_name03.setBounds(400, 160, 135, 15);
		contentPane.add(lbl_name03);
		
		JLabel lbl_name04 = new JLabel("New label");
		lbl_name04.setBounds(575, 160, 135, 15);
		contentPane.add(lbl_name04);
		
		JLabel label_3 = new JLabel("New label");
		label_3.setBounds(575, 340, 135, 15);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("New label");
		label_4.setBounds(50, 340, 135, 15);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("New label");
		label_5.setBounds(225, 340, 135, 15);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("New label");
		label_6.setBounds(400, 340, 135, 15);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("New label");
		label_7.setBounds(575, 520, 135, 15);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("New label");
		label_8.setBounds(400, 520, 135, 15);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("New label");
		label_9.setBounds(225, 520, 135, 15);
		contentPane.add(label_9);
		
		JLabel label_10 = new JLabel("New label");
		label_10.setBounds(50, 520, 135, 15);
		contentPane.add(label_10);
		String path="./data/map";
		  File file=new File(path);
		  File[] tempList = file.listFiles();
		  System.out.println("该目录下对象个数："+tempList.length);
		  String s;
		  for (int i = 0; i < tempList.length; i++) {
		   if (tempList[i].isFile())
				   //==true&&tempList[i].toString().substring(tempList[i].toString().length()-5,tempList[i].toString().length()).equals(".data"))
		   {
			   System.out.println("文     件："+tempList[i].toString().substring(path.length()+1, tempList[i].toString().length()));
			   System.out.println("文     件路径："+tempList[i]);
			   s=tempList[i].getCanonicalPath().toString();
			   System.out.println("文     件路径：i="+i+" s "+s);
			   //lbl_pic01.setIcon(new ImageIcon(tempList[i].getCanonicalPath().toString()));
			   lbl_pic01.setIcon(new ImageIcon(s));
//			   String n=tempList[i].toString().substring(path.length()+1, tempList[i].toString().length());
//			   System.out.println("n="+n);
			   //lbl_name01.setText(n);
		   }
		   		if (tempList[i].isDirectory()) {
		   			System.out.println("文件夹："+tempList[i].toString().substring(path.length()+1, tempList[i].toString().length()));
		   		}
		  }//for
		  lbl_name01.setText(tempList[0].toString().substring(path.length()+1,tempList[0].toString().length()-5));
	}
}
