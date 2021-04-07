package tuixiangzi_class_file;

import java.awt.AWTException;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Robot;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.MouseInputListener;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;

import java.awt.Font;

import javax.swing.JButton;






import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.event.MouseMotionAdapter;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.UIManager;

public class Game_CreateMap extends JFrame {

	private static JPanel contentPane;
	//static JLabel [][]lblNewLabel;
	public static final int MOVE=50;
	public static Game_test game_test=new Game_test();
	public static JLabel [][]lblNewLabel;//地图label
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_0;
	private JLabel label_f1;
	private JLabel label_f2;
	private JLabel label_f3;
	private JLabel label_4;
	private JLabel label;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel lblNewLabel_1;
	private JLabel label_7;
	private JLabel label_8;
	private JLabel label_9;
	private JLabel label_10;
	private JLabel label_11;
	private JLabel label_12;
	public static int key_up=0,key_down=0,key_left=0,key_right=0;
	private static int[][] coordinate_test;
	private static int[][] coordinate_save=new int[13][13];
//	private JFrame frame_choose;
	static int begx,begy,endx,endy,orgx,orgy;
	static int the_game_test=1;//用于设计地图的标记
	static int cdnx,cdny;
	static int save_sight=0;
	BufferedImage image,image2;
//	File name=new File("./data/map/test_picture.jpg");
    String number,file_name;
    private JTextField textField;
    int try_sight=0;
    Point framexy;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Game_CreateMap  game_choosemap= new Game_CreateMap();
//					game_choosemap.requestFocus();
					game_choosemap.Open();
					game_choosemap.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	protected void Open() {
		// TODO 自动生成的方法存根
		//coordinate_test=Game_test.coordinate_2;
		init_map();
		load_map(Game_Interface.key_up,Game_Interface.key_down,Game_Interface.key_left,Game_Interface.key_right);
		init(coordinate_test);
		
	}

	/**
	 * Create the frame.
	 */
	public Game_CreateMap() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300,30,950,680);
		setTitle("疯狂推礼物编辑界面");
		setResizable(false);
		setIconImage(new ImageIcon(Game_Interface.class.getResource("/img/1.png")).getImage());
		contentPane = new JPanel();
		contentPane.setBackground(new Color(154, 205, 50));
		contentPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//contentPane.requestFocus();
				System.out.println("contentPane.requestFocus();");
			}
		});
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtrIiIiIi = new JTextArea();
		txtrIiIiIi.setEditable(false);
		txtrIiIiIi.setText("IIII\r\nIIII\r\nIIII\r\nIIII\r\nIIII\r\nIIII\r\nIIII\r\nIIII\r\nIIII\r\nIIII\r\nIIII\r\nIIII\r\nIIII\r\nIIII\r\nIIII\r\nIIII\r\nIIII\r\nIIII\r\nIIII\r\nIIII\r\nIIII\r\nIIII\r\nIIII\r\nIIII\r\nIIII\r\nIIII\r\nIIII\r\nIIII\r\nIIII\r\nIIII\r\nIIII\r\nIIII\r\nIIII\r\nIIII\r\nIIII\r\nIIII\r\nIIII\r\nIIII\r\nIIII\r\nIIII\r\nIIII\r\nIIII\r\nIIII\r\nIIII\r\nIIII\r\nIIII\r\nIIII\r\nIIII\r\nIIII\r\nIIII\r\nIIII\r\nIIII\r\nIIII\r\nIIII\r\nIIII\r\nIIII\r\nIIII\r\nIIII\r\nIIII\r\nIIII\r\nIIII\r\nIIII\r\nIIII\r\nIIII\r\nIIII\r\nIIII\r\nIIII\r\nIIII\r\nIIII\r\nIIII\r\nIIII\r\nIIII\r\nIIII\r\nIIII\r\nIIII");
		txtrIiIiIi.setBounds(651, 10, 10, 631);
		contentPane.add(txtrIiIiIi);
		
		label_1 = new JLabel("New label");
		label_1.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				Point point=label_1.getLocation();
				label_1.setLocation(point.x+(e.getX()-begx),point.y+(e.getY()-begy));
				endx=point.x+e.getX()-begx;
				endy=point.y+e.getY()-begy;
				System.out.println("endx="+endx+" endy="+endy);
			}
		});
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				begx=e.getX();
				begy=e.getY();
				System.out.println("begx="+begx+" begy="+begy);
				save_sight=0;
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				Point point=label_1.getLocation();
				endx=point.x+e.getX()-begx;
				endy=point.y+e.getY()-begy;
				label_1.setBounds(680, 30, 50, 50);
				System.out.println("begx="+begx+" begy="+begy);
				if(set_map())
				{
					coordinate_test[cdnx][cdny]=1;
					load_map(key_up,key_down,key_left,key_right);
				}
			}
		});
		label_1.setIcon(new ImageIcon(Game_CreateMap.class.getResource("/img/1.png")));
		label_1.setBounds(680, 30, 50, 50);
		contentPane.add(label_1);
		
		label_2 = new JLabel("New label");
		label_2.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				Point point=label_2.getLocation();
				label_2.setLocation(point.x+(e.getX()-begx),point.y+(e.getY()-begy));
				endx=point.x+e.getX()-begx;
				endy=point.y+e.getY()-begy;
				System.out.println("endx="+endx+" endy="+endy);
			}
		});
		label_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				begx=e.getX();
				begy=e.getY();
				System.out.println("begx="+begx+" begy="+begy);
				save_sight=0;
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				Point point=label_2.getLocation();
				endx=point.x+e.getX()-begx;
				endy=point.y+e.getY()-begy;
				label_2.setBounds(780, 30, 50, 50);
				System.out.println("begx="+begx+" begy="+begy);
				if(set_map())
				{
					coordinate_test[cdnx][cdny]=2;
					load_map(key_up,key_down,key_left,key_right);
				}
			}
		});
		label_2.setIcon(new ImageIcon(Game_CreateMap.class.getResource("/img/gift.png")));
		label_2.setBounds(780, 30, 50, 50);
		contentPane.add(label_2);
		
		label_3 = new JLabel("New label");
		label_3.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				Point point=label_3.getLocation();
				label_3.setLocation(point.x+(e.getX()-begx),point.y+(e.getY()-begy));
				endx=point.x+e.getX()-begx;
				endy=point.y+e.getY()-begy;
				System.out.println("endx="+endx+" endy="+endy);
			}
		});
		label_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				begx=e.getX();
				begy=e.getY();
				System.out.println("begx="+begx+" begy="+begy);
				save_sight=0;
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				Point point=label_3.getLocation();
				endx=point.x+e.getX()-begx;
				endy=point.y+e.getY()-begy;
				label_3.setBounds(880, 30, 50, 50);
				System.out.println("begx="+begx+" begy="+begy);
				if(set_map())
				{
					coordinate_test[cdnx][cdny]=3;
					load_map(key_up,key_down,key_left,key_right);
				}
				
			}
		});
		label_3.setIcon(new ImageIcon(Game_CreateMap.class.getResource("/img/lake.png")));
		label_3.setBounds(880, 30, 50, 50);
		contentPane.add(label_3);
		
		label_0 = new JLabel("New label");
		label_0.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				Point point=label_0.getLocation();
				label_0.setLocation(point.x+(e.getX()-begx),point.y+(e.getY()-begy));
				endx=point.x+e.getX()-begx;
				endy=point.y+e.getY()-begy;
				System.out.println("endx="+endx+" endy="+endy);
			}
		});
		label_0.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				begx=e.getX();
				begy=e.getY();
				System.out.println("begx="+begx+" begy="+begy);
				save_sight=0;
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				Point point=label_0.getLocation();
				endx=point.x+e.getX()-begx;
				endy=point.y+e.getY()-begy;
				label_0.setBounds(680, 170, 50, 50);
				System.out.println("begx="+begx+" begy="+begy);
				if(set_map())
				{
					coordinate_test[cdnx][cdny]=0;
					load_map(key_up,key_down,key_left,key_right);
				}
			}
		});
		label_0.setIcon(new ImageIcon(Game_CreateMap.class.getResource("/img/road.png")));
		label_0.setBounds(680, 170, 50, 50);
		contentPane.add(label_0);
		
		label_f1 = new JLabel("New label");
		label_f1.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				Point point=label_f1.getLocation();
				label_f1.setLocation(point.x+(e.getX()-begx),point.y+(e.getY()-begy));
				endx=point.x+e.getX()-begx;
				endy=point.y+e.getY()-begy;
				System.out.println("endx="+endx+" endy="+endy);
			}
		});
		label_f1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				begx=e.getX();
				begy=e.getY();
				System.out.println("begx="+begx+" begy="+begy);
				save_sight=0;
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				Point point=label_f1.getLocation();
				endx=point.x+e.getX()-begx;
				endy=point.y+e.getY()-begy;
				label_f1.setBounds(780, 170, 50, 50);
				System.out.println("begx="+begx+" begy="+begy);
				if(set_map())
				{
					coordinate_test[cdnx][cdny]=-1;
					load_map(key_up,key_down,key_left,key_right);
				}
			}
		});
		label_f1.setIcon(new ImageIcon(Game_CreateMap.class.getResource("/img/gift_beg.png")));
		label_f1.setBounds(780, 170, 50, 50);
		contentPane.add(label_f1);
		
		label_f2 = new JLabel("New label");
		label_f2.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				Point point=label_f2.getLocation();
				label_f2.setLocation(point.x+(e.getX()-begx),point.y+(e.getY()-begy));
				endx=point.x+e.getX()-begx;
				endy=point.y+e.getY()-begy;
				System.out.println("endx="+endx+" endy="+endy);
			}
		});
		label_f2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				begx=e.getX();
				begy=e.getY();
				System.out.println("begx="+begx+" begy="+begy);
				save_sight=0;
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				Point point=label_f2.getLocation();
				endx=point.x+e.getX()-begx;
				endy=point.y+e.getY()-begy;
				label_f2.setBounds(880, 170, 50, 50);
				System.out.println("begx="+begx+" begy="+begy);
				if(set_map())
				{
					coordinate_test[cdnx][cdny]=-2;
					load_map(key_up,key_down,key_left,key_right);
				}
			}
		});
		label_f2.setIcon(new ImageIcon(Game_CreateMap.class.getResource("/img/gift_end.png")));
		label_f2.setBounds(880, 170, 50, 50);
		contentPane.add(label_f2);
		
		label_f3 = new JLabel("New label");
		label_f3.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				Point point=label_f3.getLocation();
				label_f3.setLocation(point.x+(e.getX()-begx),point.y+(e.getY()-begy));
				endx=point.x+e.getX()-begx;
				endy=point.y+e.getY()-begy;
				System.out.println("endx="+endx+" endy="+endy);
			}
		});
		label_f3.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				begx=e.getX();
				begy=e.getY();
				System.out.println("begx="+begx+" begy="+begy);
				save_sight=0;
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				Point point=label_f3.getLocation();
				endx=point.x+e.getX()-begx;
				endy=point.y+e.getY()-begy;
				label_f3.setBounds(680, 310, 50, 50);
				System.out.println("begx="+begx+" begy="+begy);
				if(set_map())
				{
					coordinate_test[cdnx][cdny]=-3;
					load_map(key_up,key_down,key_left,key_right);
				}
			}
		});
		label_f3.setIcon(new ImageIcon(Game_CreateMap.class.getResource("/img/flower.png")));
		label_f3.setBounds(680, 310, 50, 50);
		contentPane.add(label_f3);
		
		label_4 = new JLabel("New label");
		label_4.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				Point point=label_4.getLocation();
				label_4.setLocation(point.x+(e.getX()-begx),point.y+(e.getY()-begy));
				endx=point.x+e.getX()-begx;
				endy=point.y+e.getY()-begy;
				System.out.println("endx="+endx+" endy="+endy);
			}
		});
		label_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				begx=e.getX();
				begy=e.getY();
				System.out.println("begx="+begx+" begy="+begy);
				save_sight=0;
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				Point point=label_4.getLocation();
				endx=point.x+e.getX()-begx;
				endy=point.y+e.getY()-begy;
				label_4.setBounds(780, 310, 50, 50);
				System.out.println("begx="+begx+" begy="+begy);
				if(set_map())
				{
					coordinate_test[cdnx][cdny]=4;
					load_map(key_up,key_down,key_left,key_right);
				}
			}
		});
		label_4.setIcon(new ImageIcon(Game_CreateMap.class.getResource("/img/slate2.png")));
		label_4.setBounds(780, 310, 50, 50);
		contentPane.add(label_4);
		
		label = new JLabel("\u4EBA\u7269");
		label.setFont(new Font("宋体", Font.BOLD, 12));
		label.setBounds(692, 103, 37, 15);
		contentPane.add(label);
		
		label_5 = new JLabel("\u793C\u7269");
		label_5.setFont(new Font("宋体", Font.BOLD, 12));
		label_5.setBounds(793, 103, 54, 15);
		contentPane.add(label_5);
		
		label_6 = new JLabel("\u6CB3\u6D41");
		label_6.setFont(new Font("宋体", Font.BOLD, 12));
		label_6.setBounds(890, 103, 54, 15);
		contentPane.add(label_6);
		
		lblNewLabel_1 = new JLabel("\u8349\u5730");
		lblNewLabel_1.setFont(new Font("宋体", Font.BOLD, 12));
		lblNewLabel_1.setBounds(692, 242, 37, 15);
		contentPane.add(lblNewLabel_1);
		
		label_7 = new JLabel("\u6811\u61D2");
		label_7.setFont(new Font("宋体", Font.BOLD, 12));
		label_7.setBounds(790, 230, 30, 42);
		contentPane.add(label_7);
		
		label_8 = new JLabel("\uFF08\u65E0\u793C\u7269\uFF09");
		label_8.setFont(new Font("宋体", Font.BOLD, 12));
		label_8.setBounds(770, 266, 70, 15);
		contentPane.add(label_8);
		
		label_9 = new JLabel("\uFF08\u6709\u793C\u7269\uFF09");
		label_9.setFont(new Font("宋体", Font.BOLD, 12));
		label_9.setBounds(874, 266, 70, 15);
		contentPane.add(label_9);
		
		label_10 = new JLabel("\u6811\u61D2");
		label_10.setFont(new Font("宋体", Font.BOLD, 12));
		label_10.setBounds(894, 230, 30, 42);
		contentPane.add(label_10);
		
		label_11 = new JLabel("\u82B1\u5703");
		label_11.setFont(new Font("宋体", Font.BOLD, 12));
		label_11.setBounds(692, 380, 54, 15);
		contentPane.add(label_11);
		
		label_12 = new JLabel("\u5CA9\u77F3");
		label_12.setFont(new Font("宋体", Font.BOLD, 12));
		label_12.setBounds(793, 380, 54, 15);
		contentPane.add(label_12);
		//
		///
		///获取焦点
		//
		//测试button的点击事件
		//
		JButton button = new JButton("\u6D4B\u8BD5");
		GetFrameXY getframexy=new GetFrameXY(this);
		button.addMouseListener(getframexy);
		button.addMouseMotionListener(getframexy);
		button.setFont(new Font("宋体", Font.BOLD, 20));
		button.setBounds(669, 495, 90, 90);
		contentPane.add(button);
		
		JButton button_1 = new JButton("\u4FDD\u5B58");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(1==save_sight)
				{
					System.out.println("！！开始保存！！");
					save_sight=0; 
		            //file_name="file_name2.txt";
		            //file_name=textField.getText()+".txt";
					file_name=textField.getText();
					//String path_txt="\"./data/map/"+file_name+"\".txt";
					String path_txt="\"./data/map/"+file_name+"\".data";
//		            String path="./data/map/file_name.txt";
		            String regexp = "\"";
		            path_txt=path_txt.replaceAll(regexp,"");
		            System.out.println(path_txt);
		            File file = new File("./data/map");
		            file.mkdirs();
		            String path_pic="\"./data/map/"+file_name+"\".png";
		            path_pic=path_pic.replaceAll(regexp,"");
		            File picture_path=new File(path_pic);
		            //File picture_path=new File("./data/map/file_name.png");
		            Icon img = new ImageIcon(Game_Interface.class.getResource("/img/1.png"));
		            try {
						ImageIO.write(image2, "png", picture_path);//"png"并没什么用
						JOptionPane.showConfirmDialog(null,"保存成功", "保存成功", JOptionPane.CLOSED_OPTION, 0,img);
					} catch (IOException e1_ImageIO) {
						// TODO 自动生成的 catch 块
						e1_ImageIO.printStackTrace();
						System.out.println("生成图片失败_ImageIO");
						JOptionPane.showConfirmDialog(null,"保存失败", "保存失败", JOptionPane.CLOSED_OPTION, 0,img);
					}
		            //number=(char)coordinate_1[i][j];
		            try{
						FileOutputStream out = new FileOutputStream(new File(path_txt));  
		            	for (int i = 0; i <13; i++) 
			            {
			            	for(int j=0;j<13;j++)
			                {   
			                	number=coordinate_save[i][j]+" ";
			                    out.write(number.getBytes());   
			                }
			            	out.write("\r\n".getBytes());
			            }
			            out.close(); 
		            }
		            catch(Exception e2) {   
		                e2.printStackTrace();   
		            }
				}
				else
				{
					Icon img = new ImageIcon(Game_Interface.class.getResource("/img/save_tip.png"));
		        	JOptionPane.showConfirmDialog(null,"", "请挑战成功后再对关卡进行保存", JOptionPane.CLOSED_OPTION, 0, img);
		        	save_sight=0;
				}
			}
		});
		button_1.setFont(new Font("宋体", Font.BOLD, 20));
		button_1.setBounds(795, 495, 90, 90);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("\u8FD4\u56DE\u4E3B\u9875");
		button_2.setFont(new Font("宋体", Font.BOLD, 15));
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(JOptionPane.showConfirmDialog(null,"你确定要回去吗？")== JOptionPane.YES_OPTION)
				{
//					game_test.initGame();
//					game_test.aim1=0;
//					load_map(0,0,0,0);
					new GameFrame().setVisible(true);
					dispose();
				}
			}
		});
		button_2.setBounds(717, 600, 126, 30);
		contentPane.add(button_2);
		
		textField = new JTextField();
		textField.setText("\u8BF7\u8F93\u5165\u5730\u56FE\u540D\u5B57");
		textField.setBounds(680, 445, 205, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel label_13 = new JLabel("\u8BB0\u4F4F\u5148\u4FEE\u6539\u5730\u56FE\u540D\u5B57\u54E6");
		label_13.setFont(new Font("宋体", Font.BOLD, 17));
		label_13.setForeground(Color.RED);
		label_13.setBounds(694, 405, 180, 42);
		contentPane.add(label_13);
		coordinate_test=new int[Game_test.COX][Game_test.ROW];
		//
		//
		//初始化地图数组coordinate_test
		//
		//
		for(int i=0;i<Game_test.COX;i++)
			for(int j=0;j<Game_test.ROW;j++)
			{
				coordinate_test[i][j]=0;
			}
		//coordinate_test[3][3]=1;
		
	}
	//
	//init_map()
	//
	public void init_map()
	{
		//game_test.show();
		lblNewLabel = new JLabel[game_test.ROW][game_test.COX];
		for(int i=0;i<Game_test.ROW;i++)
			for(int j=0;j<Game_test.COX;j++)
			{
				//根据 Game_test 里面的 数组coordinate 的值 往 对应的Label 放相应的图片
				lblNewLabel[i][j]=new JLabel();
				lblNewLabel[i][j].setBounds(i*MOVE, j*MOVE, 50, 50);
				lblNewLabel[i][j].setText(i+j+"");
			//	lblNewLabel[i][j].setIcon(new ImageIcon(Game_Interface.class.getResource("/img/湖.png")));
				contentPane.add(lblNewLabel[i][j]);
				System.out.print(" lblNewlabel["+i+']'+'['+j+']'+'='+lblNewLabel[i][j].getX());
			}
		
	}
	//
	//load_map
	//
	public static void load_map(int up,int down,int left,int right)
	{
		for(int i=0;i<Game_test.ROW;i++)
			for(int j=0;j<Game_test.COX;j++)
			{
				if(coordinate_test[j][i]==1)
				{
					lblNewLabel[i][j].setIcon(new ImageIcon(Game_Interface.class.getResource("/img/11.gif")));
					System.out.println("i="+i);
					if(1==up)
						lblNewLabel[i][j].setIcon(new ImageIcon(Game_Interface.class.getResource("/img/fox_up.gif")));
					if(1==down)
						lblNewLabel[i][j].setIcon(new ImageIcon(Game_Interface.class.getResource("/img/11.gif")));
					if(1==left)
						lblNewLabel[i][j].setIcon(new ImageIcon(Game_Interface.class.getResource("/img/fox_left.gif")));
					if(1==right)
						lblNewLabel[i][j].setIcon(new ImageIcon(Game_Interface.class.getResource("/img/fox_right.gif")));
				}
				if(coordinate_test[j][i]==0)
				{
					lblNewLabel[i][j].setIcon(new ImageIcon(Game_Interface.class.getResource("/img/road2.png")));
				}
				if(coordinate_test[j][i]==2)
				{
					lblNewLabel[i][j].setIcon(new ImageIcon(Game_Interface.class.getResource("/img/gift2.png")));
				}
				if(coordinate_test[j][i]==-1)
				{
					lblNewLabel[i][j].setIcon(new ImageIcon(Game_Interface.class.getResource("/img/gift_beg.gif")));
				}
				if(coordinate_test[j][i]==-2)
				{
					lblNewLabel[i][j].setIcon(new ImageIcon(Game_Interface.class.getResource("/img/gift_end.gif")));
				}
				if(coordinate_test[j][i]==3)
				{
					lblNewLabel[i][j].setIcon(new ImageIcon(Game_Interface.class.getResource("/img/lake.png")));
				}
				if(coordinate_test[j][i]==-3)
				{
					lblNewLabel[i][j].setIcon(new ImageIcon(Game_Interface.class.getResource("/img/flower.gif")));
				}
				if(coordinate_test[j][i]==4)
				{
					lblNewLabel[i][j].setIcon(new ImageIcon(Game_Interface.class.getResource("/img/slate.png")));
				}
			}
	}
	//
	//init()
	//
	//游戏控制移动和胜利代码
	//
	//
	public static void init(final int coordinate[][]) {
		// TODO Auto-generated method stub
		contentPane.setLayout(null);//设置布局
		contentPane.addKeyListener(new KeyAdapter()
		{
			public void keyPressed(KeyEvent e)
			{
				System.out.println("contentPane.keyPressed");
				if(e.getKeyCode()==e.VK_UP){
					key_up=1;key_down=0;key_left=0;key_right=0;
					game_test.show(coordinate_test);
					if(game_test.Judge_Move(game_test.pi,game_test.pj,"up",coordinate_test))
    				{
						if(game_test.Judge_Aim1(game_test.pi,game_test.pj,"up",coordinate_test))
						{
							//把aim1赋值为1
							System.out.println("aimx="+game_test.aim1);
						}
						else
						{
							if(1==game_test.aim1)
							{
								if(-2==coordinate_test[game_test.pi-1][game_test.pj])
								{
									game_test.Judge_Aim2("up",coordinate_test);
								}
								else
								{
									game_test.aim1=0;
									coordinate_test[game_test.pi-1][game_test.pj]=1;
									System.out.println("pi="+game_test.pi);
									coordinate_test[game_test.aim1x][game_test.aim1y]=-1;
									System.out.println("aim1x="+game_test.aim1x+" aim1="+game_test.aim1);
								}
							}
							else
							{
								if(game_test.Judge_Aim2("up",coordinate_test))
								{
									
								}
								else
								{		//正常移动
									coordinate_test[game_test.pi][game_test.pj]=0;
									coordinate_test[game_test.pi-1][game_test.pj]=1;
										game_test.aim2=0;
								}
							}
							
						}
    				}
					if(game_test.Judge_Push(game_test.pi,game_test.pj,"up",coordinate_test))
    				{
						if(-1==coordinate_test[game_test.pi-2][game_test.pj])
						{
							coordinate_test[game_test.pi-1][game_test.pj]=0;
							coordinate_test[game_test.pi-2][game_test.pj]=-2;
						}
						else
						{
							System.out.println("出现2了出现2了出现2了出现2了");
							coordinate_test[game_test.pi-1][game_test.pj]=0;
							coordinate_test[game_test.pi-2][game_test.pj]=2;
						}
    				}
					load_map(key_up,key_down,key_left,key_right);
				}
				//System.out.println("实现监听");
				if(e.getKeyCode()==e.VK_DOWN){
					key_up=0;key_down=1;key_left=0;key_right=0;
					game_test.show(coordinate_test);
					if(game_test.Judge_Move(game_test.pi,game_test.pj,"down",coordinate_test))
    				{
						if(game_test.Judge_Aim1(game_test.pi,game_test.pj,"down",coordinate_test))
						{
							
						}
						else
						{
							if(1==game_test.aim1)
							{
								if(-2==coordinate_test[game_test.pi+1][game_test.pj])
								{//-2收到礼物 2礼物 -1没收到礼物
									game_test.Judge_Aim2("down",coordinate_test);
								}
								else
								{
									game_test.aim1=0;
									coordinate_test[game_test.pi+1][game_test.pj]=1;
									System.out.println("pi="+game_test.pi);
									coordinate_test[game_test.aim1x][game_test.aim1y]=-1;
									System.out.println("aim1x="+game_test.aim1x+" aim1="+game_test.aim1);
								}
							}
							else
							{
								if(game_test.Judge_Aim2("down",coordinate_test))
								{
									
								}
								else
								{
									coordinate_test[game_test.pi][game_test.pj]=0;
									coordinate_test[game_test.pi+1][game_test.pj]=1;
										game_test.aim2=0;
								}
							}
							
						}
    				}
					if(game_test.Judge_Push(game_test.pi,game_test.pj,"down",coordinate_test))
    				{
						if(-1==coordinate_test[game_test.pi+2][game_test.pj])
						{
							coordinate_test[game_test.pi+1][game_test.pj]=0;
							coordinate_test[game_test.pi+2][game_test.pj]=-2;
						}
						else
						{
							System.out.println("出现2了出现2了出现2了出现2了");
							coordinate_test[game_test.pi+1][game_test.pj]=0;
							coordinate_test[game_test.pi+2][game_test.pj]=2;
						}
    				}
					load_map(key_up,key_down,key_left,key_right);
				}
				//System.out.println("实现监听");
				if(e.getKeyCode()==e.VK_RIGHT){
					key_up=0;key_down=0;key_left=0;key_right=1;
					game_test.show(coordinate_test);
					if(game_test.Judge_Move(game_test.pi,game_test.pj,"right",coordinate_test))
    				{
						if(game_test.Judge_Aim1(game_test.pi,game_test.pj,"right",coordinate_test))
						{
							
						}
						else
						{
							if(1==game_test.aim1)
							{
								if(-2==coordinate_test[game_test.pi][game_test.pj+1])
								{
									game_test.Judge_Aim2("right",coordinate_test);
								}
								else
								{
									game_test.aim1=0;
									coordinate_test[game_test.pi][game_test.pj+1]=1;
									System.out.println("pi="+game_test.pi);
									coordinate_test[game_test.aim1x][game_test.aim1y]=-1;
									System.out.println("aim1x="+game_test.aim1x+" aim1="+game_test.aim1);
								}
							}
							else
							{
								if(game_test.Judge_Aim2("right",coordinate_test))
								{
									
								}
								else
								{
									coordinate_test[game_test.pi][game_test.pj]=0;
									coordinate_test[game_test.pi][game_test.pj+1]=1;
										game_test.aim2=0;
								}
							}
							
						}
    				}
					if(game_test.Judge_Push(game_test.pi,game_test.pj,"right",coordinate_test))
    				{
						if(-1==coordinate_test[game_test.pi][game_test.pj+2])
						{
							coordinate_test[game_test.pi][game_test.pj+1]=0;
							coordinate_test[game_test.pi][game_test.pj+2]=-2;
						}
						else
						{
							System.out.println("出现2了出现2了出现2了出现2了");
							coordinate_test[game_test.pi][game_test.pj+1]=0;
							coordinate_test[game_test.pi][game_test.pj+2]=2;
						}
    				}
					load_map(key_up,key_down,key_left,key_right);
				}
				//System.out.println("实现监听");
				if(e.getKeyCode()==e.VK_LEFT){
					key_up=0;key_down=0;key_left=1;key_right=0;
					game_test.show(coordinate_test);
					if(game_test.Judge_Move(game_test.pi,game_test.pj,"left",coordinate_test))
    				{
						if(game_test.Judge_Aim1(game_test.pi,game_test.pj,"left",coordinate_test))
						{
							
						}
						else
						{
							if(1==game_test.aim1)
							{
								if(-2==coordinate_test[game_test.pi][game_test.pj-1])
								{
									game_test.Judge_Aim2("left",coordinate_test);
								}
								else
								{
									game_test.aim1=0;
									coordinate_test[game_test.pi][game_test.pj-1]=1;
									System.out.println("pi="+game_test.pi);
									coordinate_test[game_test.aim1x][game_test.aim1y]=-1;
									System.out.println("aim1x="+game_test.aim1x+" aim1="+game_test.aim1);
								}
							}
							else
							{
								if(game_test.Judge_Aim2("left",coordinate_test))
								{
									
								}
								else
								{
									coordinate_test[game_test.pi][game_test.pj]=0;
									coordinate_test[game_test.pi][game_test.pj-1]=1;
										game_test.aim2=0;
								}
							}
							
						}
    				}
					if(game_test.Judge_Push(game_test.pi,game_test.pj,"left",coordinate_test))
    				{
						if(-1==coordinate_test[game_test.pi][game_test.pj-2])
						{
							coordinate_test[game_test.pi][game_test.pj-1]=0;
							coordinate_test[game_test.pi][game_test.pj-2]=-2;
						}
						else
						{
							System.out.println("出现2了出现2了出现2了出现2了");
							coordinate_test[game_test.pi][game_test.pj-1]=0;
							coordinate_test[game_test.pi][game_test.pj-2]=2;
						}
    				}
					load_map(key_up,key_down,key_left,key_right);
				}
				int all=Game_test.Judge_All(coordinate_test);
				if(game_test.Judge_Success(coordinate_test,all))
		        {
					System.out.println("成功过关！！！");
			        
		        	Icon img = new ImageIcon(Game_Interface.class.getResource("/img/game_success.png"));
		        	JOptionPane.showConfirmDialog(null,"保存以前请勿进行任何操作", "成功过关，可以对关卡进行保存", JOptionPane.CLOSED_OPTION, 0, img);
		        	save_sight=1;
		        }
				else save_sight=0;
				System.out.println("！！！");
			}
		});
}
	//
	//
	//设置地图代码
	//
	//
	static Boolean set_map(){
			for(int i=0;i<Game_test.ROW;i++){
				for(int j=0;j<Game_test.COX;j++){
					System.out.println("while for begin");
					if(lblNewLabel[i][j].getX()-30<endx&&endx<lblNewLabel[i][j].getX()+30
							&&lblNewLabel[i][j].getY()-30<endy&&endy<lblNewLabel[i][j].getY()+30)
					{
						System.out.println("lblNewLabel["+i+"]["+j+"].getXY()==endxy");
						System.out.println("lblNewLabel["+i+"]["+j+"].getX()="+lblNewLabel[i][j].getX()+" endx="+endx);
						System.out.println("lblNewLabel["+i+"]["+j+"].getY()="+lblNewLabel[i][j].getY()+" endy="+endy);
						cdnx=j;cdny=i;
						return true;
					}
					else{
						System.out.println("lblNewLabel["+i+"]["+j+"].getXY()!!!=endxy");
						System.out.println("lblNewLabel["+i+"]["+j+"].getX()="+lblNewLabel[i][j].getX()+" endx="+endx);
						System.out.println("lblNewLabel["+i+"]["+j+"].getY()="+lblNewLabel[i][j].getY()+" endy="+endy);
					}
					
				}
			}
			return false;
	}
	class GetFrameXY implements MouseInputListener{
        	Point origin;
        	//鼠标拖拽想要移动的目标组件
        	Game_CreateMap frame;
        	public GetFrameXY(Game_CreateMap frame) {
        		this.frame = frame;
        		framexy = this.frame.getLocation();
        	}
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO 自动生成的方法存根
				contentPane.requestFocus();
				Game_test.show(coordinate_test);
				for(int i=0;i<Game_test.COX;i++)
					for(int j=0;j<Game_test.ROW;j++)
						coordinate_save[i][j]=coordinate_test[i][j];
				//coordinate_save=coordinate_test;
				framexy = this.frame.getLocation();
				//
				//
				//生成图片
				//
				//
//				if(0==try_sight){
					System.out.println("if  try");
					try{
						File file = new File("./data/map");
			            file.mkdirs();
						Robot robot=new Robot();
						FileOutputStream pictrue;
		    	     	long beg = System.currentTimeMillis();  
		    	     	Point p =getLocation();
		    	     	long end = System.currentTimeMillis();
		    	     	System.out.println("BufferedOutputStream执行耗时:"+(end-beg) + "豪秒");
		    	     	int width=getWidth(),height=getHeight();
		    	     	image = robot.createScreenCapture(new Rectangle(framexy.x,framexy.y+24,width-300,height-30));
		    	     	width*=0.1;
		    	     	height*=0.1;
		    	     	image2=new BufferedImage (width,height,BufferedImage.TYPE_INT_BGR);
		    	     	image2.getGraphics().drawImage(image, 0, 0, width, height, null);
//		    	     	ImageIO.write(image2, "png", name);
//		    	     	try_sight=1;
					}
					catch (AWTException e2) {
						// TODO 自动生成的 catch 块
						e2.printStackTrace();
						System.out.println("生成图片失败");
					}
//				}
				//
				//避免try catch给coordinate_test数组造成混乱
				//
					for(int i=0;i<Game_test.COX;i++)
						for(int j=0;j<Game_test.ROW;j++)
							coordinate_save[i][j]=coordinate_test[i][j];
				//coordinate_test=coordinate_save;
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO 自动生成的方法存根
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO 自动生成的方法存根
				
			}
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO 自动生成的方法存根
				
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO 自动生成的方法存根
				
			}
			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO 自动生成的方法存根
				
			}
			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO 自动生成的方法存根
				
			}
	}
}
