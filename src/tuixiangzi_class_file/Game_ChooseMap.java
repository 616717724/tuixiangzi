package tuixiangzi_class_file;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.MouseInputListener;
import java.awt.Color;

public class Game_ChooseMap extends JFrame {

	private JPanel contentPane;
	JLabel[][] lbl_map_pic,lbl_map_name;
	int x=0,y=0,z=1,page_sight=1,page_all,lbl_pic_number=0,btn_next_number=0,z2;
	int [] z0=new int[100];
	String str_name;
	static int[][] coordinate_choose_map=new int[Game_test.COX][Game_test.ROW];
//////
	//用于 public void Get_pic_file()
	String path="./data/map";
	  File file=new File(path);
	  File[] tempList = file.listFiles();
	  String s;
//////
	  JLabel lblNewLabel_1 = new JLabel("\u5171\u591A\u5C11\u9875");
	  JLabel lblNewLabel_2 = new JLabel("\u5F53\u524D\u7B2C\u51E0\u9875");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Game_ChooseMap frame = new Game_ChooseMap();
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
	public Game_ChooseMap() throws IOException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300,30,520+130+12+60,540+140);
		setTitle("疯狂推礼物关卡选择界面");
		setResizable(false);
		setIconImage(new ImageIcon(Game_Interface.class.getResource("/img/1.png")).getImage());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JButton btnNewButton = new JButton("\u4E0A\u4E00\u9875");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				//btn_next_number
				if(page_sight!=1){
					//System.out.println("z0="+z0);
					//z=(z0-(22*btn_next_number));
					//z=1;
					z=z0[btn_next_number-1];
					lbl_pic_number=0;
					btn_next_number--;
					page_sight--;
					Lab_Clrean();
					try {
						Get_pic_file();
					} catch (IOException e1) {
						// TODO 自动生成的 catch 块
						e1.printStackTrace();
					}
				}
				else{
					page_sight=1;
				}
				lblNewLabel_2.setText("当前第"+page_sight+"页");
				System.out.println("page_all="+page_all+" page_sight="+page_sight+" btn_next_number="+btn_next_number);
				System.out.println("z2="+z2);
			}
		});
		btnNewButton.setBounds(194, 568, 90, 60);
		contentPane.add(btnNewButton);
		JButton btnNewButton_1 = new JButton("\u4E0B\u4E00\u9875");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//Lab_Clrean();
				if(page_sight<page_all){
					//System.out.println("z0="+z0);
					lbl_pic_number=0;
					page_sight++;
					btn_next_number++;
					Lab_Clrean();
					try {
						Get_pic_file();
						for(y=0;y<3;y++){
							  for(x=0;x<4;x++){
								  if(lbl_map_name[x][y].getText().toString().equals("")){
									  System.out.println("setSiza(0,0)");
									  lbl_map_name[x][y].setSize(0,0);
									  lbl_map_pic[x][y].setSize(0,0);
									  System.out.println("getSiza="+lbl_map_pic[x][y].getSize());
								  }
							  }
						}
					} catch (IOException e1) {
						// TODO 自动生成的 catch 块
						e1.printStackTrace();
					}
					System.out.println("page_all="+page_all+" page_sight="+page_sight+" btn_next_number="+btn_next_number);
					System.out.println("z2="+z2);
				}
				else{
					page_sight=page_all;
				}
				//System.out.println("page_all="+page_all+" page_sight="+page_sight+" btn_next_number="+btn_next_number);
				lblNewLabel_2.setText("当前第"+page_sight+"页");
			}
		});
		btnNewButton_1.setBounds(430, 568, 90, 60);
		contentPane.add(btnNewButton_1);
		
		lblNewLabel_1.setBounds(294, 613, 54, 15);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2.setBounds(354, 613, 74, 15);
		contentPane.add(lblNewLabel_2);
		//
		///
		///
		//
		for(int i=0;i<Game_test.COX;i++)
			for(int j=0;j<Game_test.ROW;j++)
			{
				coordinate_choose_map[i][j]=0;
			}
		//
		//
		//init_map();
		Get_pic_file();
	}
	
	
	//
	//
	//
	//
	//
	private void init_map2() throws IOException
	{
		//Get_pic_file();
		lbl_map_pic = new JLabel[4][3];
		for(x=0;x<4;x++)
			for(y=0;y<3;y++)
			{
				//根据 Game_test 里面的 数组coordinate 的值 往 对应的Label 放相应的图片
				lbl_map_pic[x][y]=new JLabel();
				lbl_map_pic[x][y].setBounds(50+x*175,60+y*180, 98, 68);
				//lbl_map_pic[x][y].setText("["+x+"]["+y+"]");
				lbl_map_pic[x][y].setText("");
				//str_name=lbl_map_pic[x][y].getText();
				//lbl_map_pic[x][y].setName("lbl_map_pic"+str_name);
				//lbl_map_pic[x][y].setName("lbl_map_pic"+"["+x+"]["+y+"]");
				lbl_map_pic[x][y].setName(x+""+y);
				//lbl_map_pic[x][y].setIcon(new ImageIcon(Game_Interface.class.getResource("/img/保存提示.png")));
				//lbl_map_pic[x][y].setIcon(new ImageIcon(Game_Interface.class.getResource("/1.png")));
				lbl_map_pic[x][y].addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent e) {
						System.out.println(e.getComponent().getName()+"的点击事件");
						String s=e.getComponent().getName().substring(0,e.getComponent().getName().length()-1);
						int i=Integer.parseInt(s);
						s=e.getComponent().getName().substring(1,e.getComponent().getName().length());
						int j=Integer.parseInt(s);
						System.out.println("s="+s+" i="+i+" j="+j);
						System.out.println("lbl_map_name[i][j].getText()="+lbl_map_name[i][j].getText());
						int tempchar,i2=0,j2=0,fuhao=0;
			            try {
			            	String path_txt="\"./data/map/"+lbl_map_name[i][j].getText()+"\".data";
			            	String regexp = "\"";
				            path_txt=path_txt.replaceAll(regexp,"");
			            	Reader reader = new InputStreamReader(new FileInputStream(new File(path_txt)));
							while ((tempchar = reader.read()) != -1) {
							    // 对于windows下，\r\n这两个字符在一起时，表示一个换行。
							    // 但如果这两个字符分开显示时，会换两次行。
							    // 因此，屏蔽掉\r，或者屏蔽\n。否则，将会多出很多空行。
							    if (((char) tempchar) != '\r') {
							        System.out.print((char) tempchar);
							        if(i2<Game_test.COX&&(char) tempchar!=' '){
							        	if(j2<Game_test.ROW){
							        		if((char) tempchar=='-')
							        		{
							        			fuhao=1;
							        			continue;
							        		}
							        		if(fuhao==1)
							        		{
							        			coordinate_choose_map[i2][j2]=-(tempchar-48);
							        			fuhao=0;
							        		}
							        		else
							        		{
							        			coordinate_choose_map[i2][j2]=tempchar-48;
							        		}
							        		j2++;
							        	}
							        	else
							        	{
							        		j2=0;
							        		i2++;
							        	}
							        }
							    }
							}
							reader.close();
							System.out.println("\n"+"\r"+"coordinate_choose_map[i]= ");
				            for(i=0;i<Game_test.COX;i++){
				            	for(j=0;j<Game_test.ROW;j++){
				                	System.out.print(coordinate_choose_map[i][j]+" ");
				                	Game_test.coordinate[i][j]=coordinate_choose_map[i][j];
				                	//Game_test.coordinate[i][j]=0;
				                }
				            	System.out.println();
				            }//for
				            Game_Interface frame = new Game_Interface();
							frame.setVisible(true);
							frame.Game_Open();
							dispose();
						} catch (IOException e1) {
							// TODO 自动生成的 catch 块
							e1.printStackTrace();
						}
					}
				});
				getContentPane().add(lbl_map_pic[x][y]);
			}
		lbl_map_name = new JLabel[4][3];
		for(int i=0;i<4;i++)
			for(int j=0;j<3;j++)
			{
				//根据 Game_test 里面的 数组coordinate 的值 往 对应的Label 放相应的图片
				lbl_map_name[i][j]=new JLabel();
				lbl_map_name[i][j].setBounds(50+i*175,160+j*180, 135, 15);
				//lbl_map_name[i][j].setText(i+j+"");
				lbl_map_name[i][j].setText("");
				//lbl_map_pic[i][j].setIcon(new ImageIcon(Game_Interface.class.getResource("/img/保存提示.png")));
				getContentPane().add(lbl_map_name[i][j]);
			}
	}
	//
	//
	//
	//
	//
	//
	private void Get_pic_file() throws IOException{
		z0[btn_next_number]=z;
		init_map2();
		  System.out.println("该目录下对象个数："+tempList.length);
//		  for (int i = 0; i < tempList.length; i++) {
//		   if (tempList[i].isFile())
//		   {
//			   System.out.println("文     件："+tempList[i].toString().substring(path.length()+1, tempList[i].toString().length()));
//			   System.out.println("文     件路径："+tempList[i]);
//			   s=tempList[i].getCanonicalPath().toString();
//			   System.out.println("文     件路径：s "+s);
//			   //lbl_map_pic[0][0].setIcon(new ImageIcon(s));
//		   }
//		   		if (tempList[i].isDirectory()) {
//		   			System.out.println("文件夹："+tempList[i].toString().substring(path.length()+1, tempList[i].toString().length()));
//		   		}
//		  }//for
		  for(y=0;y<3;y++){
			  if(-1==z2){
				  System.out.println("z2之前为-1");
				  z2=z;
				  break;  
			  }
			  for(x=0;x<4;x++){
					lbl_map_pic[x][y].setIcon(new ImageIcon(tempList[z].getCanonicalPath().toString()));
					lbl_map_name[x][y].setText(tempList[z-1].toString().substring(path.length()+1,tempList[z-1].toString().length()-5));
					lbl_pic_number++;
					if(lbl_pic_number>=12){
						System.out.println("lbl_pic_number="+lbl_pic_number);
						System.out.println("x="+x+" y="+y+" z="+z);
						break;
					}
					System.out.println("x="+x+" y="+y+" z="+z);
					System.out.println("lbl_pic_number="+lbl_pic_number);
					if(z+2<tempList.length)
						z=z+2;
					else{
						z2=-1;
						break;
					}
				}  
		  }
		  if(((tempList.length/2)%12)!=0){
			  lblNewLabel_1.setText("共"+((tempList.length/2)/12+1)+"页");
			  page_all=((tempList.length/2)/12+1);
		  }
		  else{
			  lblNewLabel_1.setText("共"+((tempList.length/2)/12)+"页");
			  page_all=((tempList.length/2)/12);
		  }
		  lblNewLabel_2.setText("当前第"+page_sight+"页");
	}
	private void Lab_Clrean(){
		for(y=0;y<3;y++){
			  for(x=0;x<4;x++){
				  lbl_map_pic[x][y].setIcon(new ImageIcon());
					lbl_map_name[x][y].setText("");
				  }
			  }
		
	}
}
