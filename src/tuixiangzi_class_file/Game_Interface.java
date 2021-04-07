package tuixiangzi_class_file;

import java.awt.Color;
import java.awt.Container;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import java.awt.BorderLayout;

import javax.swing.JMenuBar;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

public class Game_Interface extends JPanel{
/**
	 * 
	 */
	public static JFrame frame;
	private static Container contentPane;
	private int SetX,SetY,SetH,SetW;
	public static Game_test game_test=new Game_test();
	GameFrame frame_game = new GameFrame();
	public static final int MOVE=50;
	public static int key_up=0,key_down=0,key_left=0,key_right=0;
	//地图的Label
	public static JLabel [][]lblNewLabel;
	public Game_Interface(){
			frame=new JFrame();
			frame.getContentPane().setBackground(new Color(0, 128, 0));
			frame.getContentPane().setForeground(Color.LIGHT_GRAY);
			//frame.setSize(600,600);
			frame.setTitle("疯狂推礼物");
			 frame.setIconImage(new ImageIcon(Game_Interface.class.getResource("/img/1.png")).getImage());
			//frame.setBounds(300,30,520+130,540+150);
			frame.setBounds(300,30,520+130+12+60,540+140);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//			if(JOptionPane.showConfirmDialog(this,"你确定要退出吗？")== JOptionPane.YES_OPTION)
//        		System.exit(0);
			contentPane=frame.getContentPane();
			frame.getContentPane().setLayout(null);
//			Icon img = new ImageIcon(Game_Interface.class.getResource("/img/游戏成功.png"));
//	        JOptionPane.showConfirmDialog(null,"", "是否继续本关？", JOptionPane.YES_NO_OPTION, 0, img);
			JPanel panel = new JPanel();
			panel.setBackground(new Color(0, 128, 0));
			panel.setBounds(655, 0, 61, 652);
			frame.getContentPane().add(panel);
			panel.setLayout(null);
			
			JLabel lblNewLabel_1 = new JLabel("New label");
			lblNewLabel_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if(JOptionPane.showConfirmDialog(null,"你确定要重新开始吗？")== JOptionPane.YES_OPTION)
					{
						for(int i=0;i<Game_test.COX;i++){
			            	for(int j=0;j<Game_test.ROW;j++){
			            		Game_test.coordinate[i][j]=Game_ChooseMap.coordinate_choose_map[i][j];
			            	}
						}
						frame.dispose();
						Game_Interface game_interface=new Game_Interface();
						game_interface.Game_Open();
						//frame.dispose();
					}
				}
			});
			lblNewLabel_1.setIcon(new ImageIcon(Game_Interface.class.getResource("/img/again.png")));
			lblNewLabel_1.setBounds(-3, 141, 70, 150);
			panel.add(lblNewLabel_1);
			
			JLabel lblNewLabel_2 = new JLabel("New label");
			lblNewLabel_2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if(JOptionPane.showConfirmDialog(null,"你确定要回去吗？")== JOptionPane.YES_OPTION)
					{
						game_test.initGame();
						game_test.aim1=0;
						load_map(0,0,0,0);
						frame_game.setVisible(true);
						frame.dispose();
					}
					
					
				}
			});
			lblNewLabel_2.setIcon(new ImageIcon(Game_Interface.class.getResource("/img/back.png")));
			lblNewLabel_2.setBounds(-3, 445, 70, 150);
			panel.add(lblNewLabel_2);

			
			/*init_map();//初始化地图
			init();
			load_map();
			frame.requestFocus();
			frame.setVisible(true);*/
}
	public void Game_Open()
	{
		init_map();//初始化地图
		init(game_test.coordinate);
		load_map(key_up,key_down,key_left,key_right);
		//frame.requestFocus();
		frame.setVisible(true);
		frame.setResizable(false);
	}
	private static void init(final int coordinate[][]) {
				// TODO Auto-generated method stub
				contentPane.setLayout(null);
//				final JLabel btnNewButton = new JLabel();
//				//btnNewButton.setIcon(new ImageIcon(Game_Interface.class.getResource("/img/1.png")));
//				btnNewButton.setBounds(350,300,50,50);
//				SetX=btnNewButton.getX();
//				SetY=btnNewButton.getY();
//				SetH=btnNewButton.getHeight();
//				SetW=btnNewButton.getWidth();
//				frame.getContentPane().add(btnNewButton);
				frame.addKeyListener(new KeyAdapter()
				{
					public void keyPressed(KeyEvent e)
					{
						if(e.getKeyCode()==e.VK_UP){
							key_up=1;key_down=0;key_left=0;key_right=0;
							game_test.show(game_test.coordinate);
							System.out.println("");
							//game_test.show(Game_ChooseMap.coordinate_choose_map);
							if(game_test.Judge_Move(game_test.pi,game_test.pj,"up",game_test.coordinate))
	        				{
								if(game_test.Judge_Aim1(game_test.pi,game_test.pj,"up",game_test.coordinate))
								{
									//把aim1赋值为1
									System.out.println("aimx="+game_test.aim1);
								}
								else
								{
									if(1==game_test.aim1)
									{
										if(-2==coordinate[game_test.pi-1][game_test.pj])
										{
											game_test.Judge_Aim2("up",game_test.coordinate);
										}
										else
										{
											game_test.aim1=0;
											coordinate[game_test.pi-1][game_test.pj]=1;
											System.out.println("pi="+game_test.pi);
											coordinate[game_test.aim1x][game_test.aim1y]=-1;
											System.out.println("aim1x="+game_test.aim1x+" aim1="+game_test.aim1);
										}
									}
									else
									{
										if(game_test.Judge_Aim2("up",game_test.coordinate))
										{
											
										}
										else
										{		//正常移动
												coordinate[game_test.pi][game_test.pj]=0;
												coordinate[game_test.pi-1][game_test.pj]=1;
												game_test.aim2=0;
										}
									}
									
								}
	        				}
							if(game_test.Judge_Push(game_test.pi,game_test.pj,"up",game_test.coordinate))
	        				{
								if(-1==coordinate[game_test.pi-2][game_test.pj])
								{
									coordinate[game_test.pi-1][game_test.pj]=0;
									coordinate[game_test.pi-2][game_test.pj]=-2;
								}
								else
								{
									System.out.println("出现2了出现2了出现2了出现2了");
									coordinate[game_test.pi-1][game_test.pj]=0;
									coordinate[game_test.pi-2][game_test.pj]=2;
								}
	        				}
							load_map(key_up,key_down,key_left,key_right);
						}
						//System.out.println("实现监听");
						if(e.getKeyCode()==e.VK_DOWN){
							key_up=0;key_down=1;key_left=0;key_right=0;
							game_test.show(game_test.coordinate);
							if(game_test.Judge_Move(game_test.pi,game_test.pj,"down",game_test.coordinate))
	        				{
								if(game_test.Judge_Aim1(game_test.pi,game_test.pj,"down",game_test.coordinate))
								{
									
								}
								else
								{
									if(1==game_test.aim1)
									{
										if(-2==coordinate[game_test.pi+1][game_test.pj])
										{//-2收到礼物 2礼物 -1没收到礼物
											game_test.Judge_Aim2("down",game_test.coordinate);
										}
										else
										{
											game_test.aim1=0;
											coordinate[game_test.pi+1][game_test.pj]=1;
											System.out.println("pi="+game_test.pi);
											coordinate[game_test.aim1x][game_test.aim1y]=-1;
											System.out.println("aim1x="+game_test.aim1x+" aim1="+game_test.aim1);
										}
									}
									else
									{
										if(game_test.Judge_Aim2("down",game_test.coordinate))
										{
											
										}
										else
										{
												coordinate[game_test.pi][game_test.pj]=0;
												coordinate[game_test.pi+1][game_test.pj]=1;
												game_test.aim2=0;
										}
									}
									
								}
	        				}
							if(game_test.Judge_Push(game_test.pi,game_test.pj,"down",game_test.coordinate))
	        				{
								if(-1==coordinate[game_test.pi+2][game_test.pj])
								{
									coordinate[game_test.pi+1][game_test.pj]=0;
									coordinate[game_test.pi+2][game_test.pj]=-2;
								}
								else
								{
									System.out.println("出现2了出现2了出现2了出现2了");
									coordinate[game_test.pi+1][game_test.pj]=0;
									coordinate[game_test.pi+2][game_test.pj]=2;
								}
	        				}
							load_map(key_up,key_down,key_left,key_right);
						}
						//System.out.println("实现监听");
						if(e.getKeyCode()==e.VK_RIGHT){
							key_up=0;key_down=0;key_left=0;key_right=1;
							game_test.show(game_test.coordinate);
							if(game_test.Judge_Move(game_test.pi,game_test.pj,"right",game_test.coordinate))
	        				{
								if(game_test.Judge_Aim1(game_test.pi,game_test.pj,"right",game_test.coordinate))
								{
									
								}
								else
								{
									if(1==game_test.aim1)
									{
										if(-2==coordinate[game_test.pi][game_test.pj+1])
										{
											game_test.Judge_Aim2("right",game_test.coordinate);
										}
										else
										{
											game_test.aim1=0;
											coordinate[game_test.pi][game_test.pj+1]=1;
											System.out.println("pi="+game_test.pi);
											coordinate[game_test.aim1x][game_test.aim1y]=-1;
											System.out.println("aim1x="+game_test.aim1x+" aim1="+game_test.aim1);
										}
									}
									else
									{
										if(game_test.Judge_Aim2("right",game_test.coordinate))
										{
											
										}
										else
										{
												coordinate[game_test.pi][game_test.pj]=0;
												coordinate[game_test.pi][game_test.pj+1]=1;
												game_test.aim2=0;
										}
									}
									
								}
	        				}
							if(game_test.Judge_Push(game_test.pi,game_test.pj,"right",game_test.coordinate))
	        				{
								if(-1==coordinate[game_test.pi][game_test.pj+2])
								{
									coordinate[game_test.pi][game_test.pj+1]=0;
									coordinate[game_test.pi][game_test.pj+2]=-2;
								}
								else
								{
									System.out.println("出现2了出现2了出现2了出现2了");
									coordinate[game_test.pi][game_test.pj+1]=0;
									coordinate[game_test.pi][game_test.pj+2]=2;
								}
	        				}
							load_map(key_up,key_down,key_left,key_right);
						}
						//System.out.println("实现监听");
						if(e.getKeyCode()==e.VK_LEFT){
							key_up=0;key_down=0;key_left=1;key_right=0;
							game_test.show(game_test.coordinate);
							if(game_test.Judge_Move(game_test.pi,game_test.pj,"left",game_test.coordinate))
	        				{
								if(game_test.Judge_Aim1(game_test.pi,game_test.pj,"left",game_test.coordinate))
								{
									
								}
								else
								{
									if(1==game_test.aim1)
									{
										if(-2==coordinate[game_test.pi][game_test.pj-1])
										{
											game_test.Judge_Aim2("left",game_test.coordinate);
										}
										else
										{
											game_test.aim1=0;
											coordinate[game_test.pi][game_test.pj-1]=1;
											System.out.println("pi="+game_test.pi);
											coordinate[game_test.aim1x][game_test.aim1y]=-1;
											System.out.println("aim1x="+game_test.aim1x+" aim1="+game_test.aim1);
										}
									}
									else
									{
										if(game_test.Judge_Aim2("left",game_test.coordinate))
										{
											
										}
										else
										{
												coordinate[game_test.pi][game_test.pj]=0;
												coordinate[game_test.pi][game_test.pj-1]=1;
												game_test.aim2=0;
										}
									}
									
								}
	        				}
							if(game_test.Judge_Push(game_test.pi,game_test.pj,"left",game_test.coordinate))
	        				{
								if(-1==coordinate[game_test.pi][game_test.pj-2])
								{
									coordinate[game_test.pi][game_test.pj-1]=0;
									coordinate[game_test.pi][game_test.pj-2]=-2;
								}
								else
								{
									System.out.println("出现2了出现2了出现2了出现2了");
									coordinate[game_test.pi][game_test.pj-1]=0;
									coordinate[game_test.pi][game_test.pj-2]=2;
								}
	        				}
							load_map(key_up,key_down,key_left,key_right);
						}
						int all=Game_test.Judge_All(game_test.coordinate);
						if(game_test.Judge_Success(game_test.coordinate,all))
				        {
				        	System.out.println("成功过关！！！");
			        
				        	Icon img = new ImageIcon(Game_Interface.class.getResource("/img/game_success.png"));
				        	JOptionPane.showConfirmDialog(null,"", "挑战成功", JOptionPane.CLOSED_OPTION, 0, img);
				        	Game_ChooseMap frame2;
							try {
								frame2 = new Game_ChooseMap();
								frame2.setVisible(true);
								frame.dispose();
							} catch (IOException e2) {
								// TODO 自动生成的 catch 块
								e2.printStackTrace();
							}
//				        	int i=JOptionPane.showConfirmDialog(null,"", "是否开始下一关？", JOptionPane.YES_NO_OPTION, 0, img);
//				        	 if(i== JOptionPane.NO_OPTION)
//						        {
//						        	game_test.gift=0;
//						            game_test.initGame();
//									game_test.aim1=0;
//									game_test.gift=0;
//									load_map(0,0,0,0);
//									game_test.gift=0;
//						        }
//					        if(i== JOptionPane.YES_OPTION)
//					        {
//					        	System.out.println("wwww");
//								game_test.gift=0;
//								game_test.guanka++;
//								game_test.initGame();
//								game_test.aim1=0;
//								load_map(0,0,0,0);
//					        }

				        }
						System.out.println("！！！");
					}
				});
	}
/**
 * 初始化地图
 */
	public void init_map()
	{
		//game_test.show();
		lblNewLabel = new JLabel[game_test.ROW][game_test.COX];
		game_test=new Game_test();
		game_test.initGame();
		for(int i=0;i<Game_test.ROW;i++)
			for(int j=0;j<Game_test.COX;j++)
			{
				//根据 Game_test 里面的 数组coordinate 的值 往 对应的Label 放相应的图片
				lblNewLabel[i][j]=new JLabel();
				lblNewLabel[i][j].setBounds(i*MOVE, j*MOVE, 50, 50);
				lblNewLabel[i][j].setText(i+j+"");
			//	lblNewLabel[i][j].setIcon(new ImageIcon(Game_Interface.class.getResource("/img/湖.png")));
				this.frame.getContentPane().add(lblNewLabel[i][j]);
			}
		
	}
	
	/**
	 * 更新地图
	 */
	/*public void load_map()
	{
		for(int i=0;i<Game_test.ROW;i++)
			for(int j=0;j<Game_test.COX;j++)
			{
				if(Game_test.coordinate[j][i]==1)//判断玩家的位置
				{
					lblNewLabel[i][j].setIcon(new ImageIcon(Game_Interface.class.getResource("/img/1.png")));
					System.out.println("i="+i);
				}
				if(Game_test.coordinate[j][i]==0)//判断是否为可走路径
				{
					//lblNewLabel[i][j].setIcon(new ImageIcon(Game_Interface.class.getResource("/img/石板2.png")));
				}
				if(Game_test.coordinate[j][i]==-2)//判断是否为障碍物
				{
					//lblNewLabel[i][j].setIcon(new ImageIcon(Game_Interface.class.getResource("/img/湖.png")));
				}
			}
	}*/
	public static void load_map(int up,int down,int left,int right)
	{
		for(int i=0;i<Game_test.ROW;i++)
			for(int j=0;j<Game_test.COX;j++)
			{
				if(Game_test.coordinate[j][i]==1)
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
				if(Game_test.coordinate[j][i]==0)
				{
					lblNewLabel[i][j].setIcon(new ImageIcon(Game_Interface.class.getResource("/img/road.png")));
				}
				if(Game_test.coordinate[j][i]==2)
				{
					lblNewLabel[i][j].setIcon(new ImageIcon(Game_Interface.class.getResource("/img/gift.png")));
				}
				if(Game_test.coordinate[j][i]==-1)
				{
					lblNewLabel[i][j].setIcon(new ImageIcon(Game_Interface.class.getResource("/img/gift_beg.gif")));
				}
				if(Game_test.coordinate[j][i]==-2)
				{
					lblNewLabel[i][j].setIcon(new ImageIcon(Game_Interface.class.getResource("/img/gift_end.gif")));
				}
				if(Game_test.coordinate[j][i]==3)
				{
					lblNewLabel[i][j].setIcon(new ImageIcon(Game_Interface.class.getResource("/img/lake.png")));
				}
				if(Game_test.coordinate[j][i]==-3)
				{
					lblNewLabel[i][j].setIcon(new ImageIcon(Game_Interface.class.getResource("/img/flower.gif")));
				}
				if(Game_test.coordinate[j][i]==4)
				{
					lblNewLabel[i][j].setIcon(new ImageIcon(Game_Interface.class.getResource("/img/slate.png")));
				}
			}
	}
	
	public static void main(String[] args) {
		Game_Interface game_interface=new Game_Interface();
		game_interface.Game_Open();
	}
}
