package tuixiangzi_class_file;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Game_test {
	static int i=0,j=0,pi=0,pj=0,gift=0,aim1=0,aim2=0,aim1x,aim1y;
	//pi,pj用于记录人物的坐标
	static int all=0; 
	public static final int COX=13,ROW=13;//坐标的横纵
	
	static int guanka=2;
	//public static int[][] coordinate=new int [COX][ROW];
	public static int[][] coordinate=new int[13][13];
//	public static int[][] coordinate={
//		{3,4,-3,-3,4,4,-3,-3,4,4,3,4,4 },//1}
//		{3,3,4,4,0,0,0,0,0,-3,3,3,3, } ,//2}
//		{4,0,0,0,-1,4,4,4,0,4,-3,-3,3, } ,//3}
//		{4,0,4,0,4,0,0,0,0,4,-3,-3,-3, } ,//4}
//		{4,0,4,0,2,0,2,4,-1,0,4,-3,4, } ,//5}
//		{4,0,4,0,0,-2,0,0,4,0,4,-3,4, } ,//6}
//		{4,0,-1,4,2,0,2,0,4,0,4,-3,4, } ,//7}
//		{4,-3,0,0,0,0,4,0,4,0,4,4,4, } ,//8}
//		{4,-3,0,0,0,0,0,0,0,0,1,0,-3, } ,//9}
//		{-3,-3,0,4,4,4,-1,0,0,0,0,0,-3, } ,//10}
//		{-3,3,0,0,0,0,0,4,4,0,0,0,-3, }, //11}
//		{3,3,-3,-3,4,4,4,3,-3,4,4,-3,-3, } ,//12}
//		{-3,4,4,4,-3,-3,4,4,4,-3,-3,-3,4, } //13}	
//		
//	};
	//第一关
	public static final int[][] coordinate_1={
		{3,4,-3,-3,4,4,-3,-3,4,4,3,4,4 },//1}
		{3,3,4,4,0,0,0,0,0,-3,3,3,3, } ,//2}
		{4,0,0,0,-1,4,4,4,0,4,-3,-3,3, } ,//3}
		{4,0,4,0,4,0,0,0,0,4,-3,-3,-3, } ,//4}
		{4,0,4,0,2,0,2,4,-1,0,4,-3,4, } ,//5}
		{4,0,4,0,0,-2,0,0,4,0,4,-3,4, } ,//6}
		{4,0,-1,4,2,0,2,0,4,0,4,-3,4, } ,//7}
		{4,-3,0,0,0,0,4,0,4,0,4,4,4, } ,//8}
		{4,-3,0,0,0,0,0,0,0,0,1,0,-3, } ,//9}
		{-3,-3,0,4,4,4,-1,0,0,0,0,0,-3, } ,//10}
		{-3,3,0,0,0,0,0,4,4,0,0,0,-3, }, //11}
		{3,3,-3,-3,4,4,4,3,-3,4,4,-3,-3, } ,//12}
		{-3,4,4,4,-3,-3,4,4,4,-3,-3,-3,4, } //13}	
		
	};
	
//	0 表示 路
//	1 表示 玩家
//	2 表示 箱子（礼物）
//	-1 表示 目标点（树懒）
//	-2表示  拿到礼物
//	3 表示 湖
//	-3 表示 花
//	4 表示 墙

	//第二关
	public static final int[][] coordinate_2={
		{0,0,0,0,0,0,0,0,0,0,0,0,0},
		{3,-3,-3,-3,-3,3,3,-3,-3,-3,3,3,3},
		{-3,-3,4,4,4,-3,-3,4,4,4,4,-3,-3},
		{4,-3,4,0,0,4,4,0,0,0,4,-3,-3},
		{4,-3,4,2,0,0,0,0,2,0,4,-3,4},
		{-3,-3,4,0,0,4,4,4,0,2,4,-3,4},
		{4,4,4,0,4,-1,-1,-1,4,0,4,-3,-3},
		{4,4,4,0,4,-1,0,0,0,0,0,0,0},
		{4,4,0,2,0,0,0,0,0,0,0,0,0},
		{-3,4,0,0,0,0,0,0,0,1,0,0,0},
		{-3,-3,4,4,4,0,0,0,0,0,0,0,0},
		{3,-3,-3,-3,0,0,0,0,0,0,0,0,0},
		{3,3,3,-3,4,0,0,0,0,0,0,0,0}
	};
	public Game_test(){
		
	}
	public static void initGame()
	{
		//coordinate=Game_ChooseMap.coordinate_choose_map;
//		switch (guanka)
//		{
//		case 1:
//			for(int i=0;i<COX;i++)
//				for(int j=0;j<ROW;j++)
//				{
//					coordinate[i][j]=coordinate_1[i][j];
//				}
//			break;
//		case 2:
//			for(int i=0;i<COX;i++)
//				for(int j=0;j<ROW;j++)
//				{
//					coordinate[i][j]=coordinate_2[i][j];
//				}
//			break;
//			default:
//				break;
//		}
	}
//
	//
	//
	//主函数用于运行数字版
	//
	//
//
//	public static void main(String[] args) throws IOException {
//		// TODO 自动生成的方法存根
//		Game_test game_test=new Game_test();
//		game_test.initGame();
//		while(gift==0)
//		{
//			show();
//			//char move = (char) System.in.read();
//			Scanner in=new Scanner(System.in);
//			char move=in.nextLine().charAt(0);
//	        //System.out.println(x+" "+move);
//	        switch(move)
//	        {
//	        	case 'w': 	
//	        				/*if(0>pi-1)
//	        					pi+=1;*/
//	        				if(Judge_Move(pi,pj,"up"))
//	        				{
//	        					coordinate[pi][pj]=0;
//	        					coordinate[pi-1][pj]=1;
//	        				}
//	        				if(Judge_Push(pi,pj,"up"))
//	        				{
//	        					coordinate[pi-1][pj]=0;
//	        					coordinate[pi-2][pj]=2;
//	        				}
//	        		//System.out.println("w");
//	        				break;
//	        	case 's':
//    						/*if(COX-1<pi+1)
//    							pi-=1;*/
//	        				if(Judge_Move(pi,pj,"down"))
//	        				{
//	        					coordinate[pi][pj]=0;
//  			  			 		coordinate[pi+1][pj]=1;
//	        				}
//	        				if(Judge_Push(pi,pj,"down"))
//	        				{
//	        					coordinate[pi+1][pj]=0;
//	        					coordinate[pi+2][pj]=2;
//	        				}
//	        		//System.out.println("s");
//	        				break;
//	        	case 'a'://judge();
//	        				/*if(0>pj-1)
//	        					pj+=1;*/
//	        				if(Judge_Move(pi,pj,"left"))
//	        				{
//	        					coordinate[pi][pj]=0;
//	     			  			coordinate[pi][pj-1]=1;
//	        				}
//	        				if(Judge_Push(pi,pj,"left"))
//	        				{
//	        					coordinate[pi][pj-1]=0;
//	        					coordinate[pi][pj-2]=2;
//	        				}
//	        		//System.out.println("a");
//	        				break;
//	        	case 'd'://judge();
//	        				/*if(ROW-1<pj+1)
//	        					pj-=1;*/
//	        				if(Judge_Move(pi,pj,"right"))
//	        				{
//	        					coordinate[pi][pj]=0;
//	     			  			coordinate[pi][pj+1]=1;
//	        				}
//	        				if(Judge_Push(pi,pj,"right"))
//	        				{
//	        					coordinate[pi][pj+1]=0;
//	        					coordinate[pi][pj+2]=2;
//	        				}
//	        		//System.out.println("d");
//	        				break;
//	        }
//	        /*if(Judge_Success())
//	        {
//	        	System.out.println("成功过关！！！");
//	        	break;
//	        }
//	        System.out.println("gift="+gift);*/
//		}
//			
//		//new test();
//	}//main 
	static void show(int[][] coordinate)
	{
		for(i=0;i<COX;i++)
			for(j=0;j<ROW;j++)
			{
				if(coordinate[i][j]==1)
				{
					pi=i;
					pj=j;//获取人物1的坐标
				}
				System.out.print(coordinate[i][j]+"  ");
				if(ROW-1==j)
					System.out.println();
			}
	}
	/*
	 * 判断人物的移动
	 */
	public static Boolean Judge_Move(int x,int y,String s,int[][] coordinate)
	{
		if(s.equals("up")&&0>x-1)		 //判断上移界限
			return false;
		//判断上移障碍物
		if(s.equals("up")&&(3==coordinate[x-1][y]||-3==coordinate[x-1][y]||4==coordinate[x-1][y]||2==coordinate[x-1][y]))
			return false;
		if(s.equals("down")&&COX-1<x+1)	 //判断下移界限
		{
			System.out.println("移down界限");
			return false;
		}
		//判断下移障碍物
		if(s.equals("down")&&(3==coordinate[x+1][y]||-3==coordinate[x+1][y]||4==coordinate[x+1][y]||2==coordinate[x+1][y]))
		{
			System.out.println("移down障碍物"+" coordinate[x+1][y]="+coordinate[x+1][y]);
			return false;
		}
		if(s.equals("left")&&0>y-1)		 //判断左移界限
			return false;
		//判断左移障碍物
		if(s.equals("left")&&(3==coordinate[x][y-1]||-3==coordinate[x][y-1]||4==coordinate[x][y-1]||2==coordinate[x][y-1]))
			return false;
		if(s.equals("right")&&ROW-1<y+1)	 //判断右移界限
			return false;
		//判断右移障碍物
		if(s.equals("right")&&(3==coordinate[x][y+1]||-3==coordinate[x][y+1]||4==coordinate[x][y+1]||2==coordinate[x][y+1]))
			return false;
		return true;
	}
	/*
	 * 判断人物推箱子
	 */
	public static Boolean Judge_Push(int x,int y,String s,int[][] coordinate)
	{
		//判断上移界限
		if(s.equals("up")&&(0>x-2))
			return false;
		//判断上移障碍物
		if(s.equals("up")&&(2==coordinate[x-1][y]))
			if(s.equals("up")&&(-3==coordinate[x-2][y]||3==coordinate[x-2][y]||4==coordinate[x-2][y]||-2==coordinate[x-2][y]||2==coordinate[x-2][y]))
			{
				//System.out.println("x="+x+" y="+y);
				return false;
			}
			else return true;
		
		//判断下移界限
		if(s.equals("down")&&(COX-1<x+2))
		{
			System.out.println("推down_界限");
			return false;
		}
		//判断下移障碍物
		if(s.equals("down")&&(2==coordinate[x+1][y]))
			if(s.equals("down")&&(-3==coordinate[x+1][y]||-3==coordinate[x+2][y]||3==coordinate[x+1][y]||3==coordinate[x+2][y]||4==coordinate[x+1][y]||4==coordinate[x+2][y]||2==coordinate[x+2][y]||-2==coordinate[x+2][y]))
			{
				System.out.println("推down_障碍物"+"x="+x+" y="+y);
				return false;
			}
			else {
				System.out.println("推down_成功"+"x="+x+" y="+y);
				return true;
			}
		//判断左移界限
		if(s.equals("left")&&(0>y-2))
			return false;
		//判断左移障碍物
		if(s.equals("left")&&(2==coordinate[x][y-1]))
			if(s.equals("left")&&(-3==coordinate[x][y-2]||3==coordinate[x][y-2]||4==coordinate[x][y-2]||2==coordinate[x][y-2]||-2==coordinate[x][y-2]))
			{
				//System.out.println("x="+x+" y="+y);
				return false;
			}
			else return true;
		//判断右移界限
		if(s.equals("right")&&(ROW-1<y+2))
			return false;
		//判断右移障碍物
		if(s.equals("right")&&(2==coordinate[x][y+1]))
			if(s.equals("right")&&(-3==coordinate[x][y+2]||3==coordinate[x][y+2]||4==coordinate[x][y+2]||2==coordinate[x][y+2]||-2==coordinate[x][y+2]))
			{
				//System.out.println("x="+x+" y="+y);
				return false;
			}
			else return true;
		
		return false;
	}
	/*
	 * 判断是否碰到目标点
	 */
	public static Boolean Judge_Aim1(int x,int y,String s,int[][] coordinate)
	{
		//判断上
		if(s.equals("up")&&-1==coordinate[x-1][y])
		{
			//System.out.println("aim1="+game_test.aim1);
			aim1x=x-1;
			aim1y=y;
			if(1==aim1)
			{
				aim1=1;
				coordinate[pi][pj]=-1;
				coordinate[pi-1][pj]=1;
			}
			else
			{
				aim1=1;
				coordinate[pi][pj]=0;
				coordinate[pi-1][pj]=1;
			}
			return true;
		}
		//判断下
		if(s.equals("down")&&-1==coordinate[x+1][y])
		{
			//System.out.println("aim1="+game_test.aim1);
			aim1x=x+1;
			aim1y=y;
			if(1==aim1)
			{
				aim1=1;
				coordinate[pi][pj]=-1;
				coordinate[pi+1][pj]=1;
			}
			else
			{
				aim1=1;
				coordinate[pi][pj]=0;
				coordinate[pi+1][pj]=1;
			}
			return true;
		}
		//判断上
		if(s.equals("left")&&-1==coordinate[x][y-1])
		{
			//System.out.println("aim1="+game_test.aim1);
			aim1x=x;
			aim1y=y-1;
			if(1==aim1)
			{
				aim1=1;
				coordinate[pi][pj]=-1;
				coordinate[pi][pj-1]=1;
			}
			else
			{
				aim1=1;
				coordinate[pi][pj]=0;
				coordinate[pi][pj-1]=1;
			}
			return true;
		}
		if(s.equals("right")&&-1==coordinate[x][y+1])
		{
			//System.out.println("aim1="+game_test.aim1);
			aim1x=x;
			aim1y=y+1;
			if(1==aim1)
			{
				aim1=1;
				coordinate[pi][pj]=-1;
				coordinate[pi][pj+1]=1;
			}
			else
			{
				aim1=1;
				coordinate[pi][pj]=0;
				coordinate[pi][pj+1]=1;
			}
			return true;
		}
		return false;
	}
	/*
	 * 判断是否碰到已经收到礼物的点
	 */
	public static Boolean Judge_Aim2(String s,int[][] coordinate)
	{
		//判断上
		if((s.equals("up")&&-2==coordinate[pi-1][pj]))
			if(s.equals("up")&&(3!=coordinate[pi-2][pj]&&-3!=coordinate[pi-2][pj]&&4!=coordinate[pi-2][pj]&&2!=coordinate[pi-2][pj]&&-2!=coordinate[pi-2][pj]))
			{
				if(-1==coordinate[pi-2][pj])
				{
					coordinate[pi-2][pj]=-2;
					coordinate[pi-1][pj]=-1;
				}
				else
				{
					coordinate[pi-2][pj]=2;
					coordinate[pi-1][pj]=-1;
				}
				return true;
			}
			else
			{
				//System.out.println("aim1="+game_test.aim1);
					System.out.println("if1");
					System.out.println("coordinate[pi-2][pj]="+coordinate[pi-2][pj]);
					return true;
			}
		//判断下
		if((s.equals("down")&&-2==coordinate[pi+1][pj]))
			if(s.equals("down")&&3!=coordinate[pi+2][pj]&&-3!=coordinate[pi+2][pj]&&4!=coordinate[pi+2][pj]&&2!=coordinate[pi+2][pj]&&-2!=coordinate[pi+2][pj])
			{
				if(-1==coordinate[pi+2][pj])
				{
					coordinate[pi+2][pj]=-2;
					coordinate[pi+1][pj]=-1;
				}
				else
				{
					coordinate[pi+2][pj]=2;
					coordinate[pi+1][pj]=-1;
				}
				return true;
			}
			else
			{
					return true;
			}
		//判断左
		if(s.equals("left")&&(-2==coordinate[pi][pj-1]))
			if(s.equals("left")&&3!=coordinate[pi][pj-2]&&-3!=coordinate[pi][pj-2]&&4!=coordinate[pi][pj-2]&&2!=coordinate[pi][pj-2]&&-2!=coordinate[pi][pj-2])
			{
				if(-1==coordinate[pi][pj-2])
				{
					coordinate[pi][pj-2]=-2;
					coordinate[pi][pj-1]=-1;
				}
				else
				{
					coordinate[pi][pj-2]=2;
					coordinate[pi][pj-1]=-1;
				}
				return true;
			}
			else
			{
					return true;
			}
		//判断右
		if(s.equals("right")&&(-2==coordinate[pi][pj+1]))
			if(s.equals("right")&&3!=coordinate[pi][pj+2]&&-3!=coordinate[pi][pj+2]&&4!=coordinate[pi][pj+2]&&2!=coordinate[pi][pj+2]&&-2!=coordinate[pi][pj+2])
			{
				if(-1==coordinate[pi][pj+2])
				{
					coordinate[pi][pj+2]=-2;
					coordinate[pi][pj+1]=-1;
				}
				else
				{
					coordinate[pi][pj+2]=2;
					coordinate[pi][pj+1]=-1;
				}
				return true;
			}
			else
			{
					return true;
			}
		return false;
	}
	/*
	 * 判断游戏成功
	 */
	public static Boolean Judge_Success(int[][] coordinate,int all)
	{
		gift=0;
		for(int i=0;i<COX;i++)
			for(int j=0;j<ROW;j++)
			{
				if(-2==coordinate[i][j])
					gift++;
			}
		System.out.println("all="+all+" gift="+gift+" guanka="+guanka+" aim1="+aim1);
		if(all==gift&&aim1!=1)
			return true;
			
		return false;
		
	}
	public static int Judge_All(int[][] coordinate)
	{
		all=0;
		for(int i=0;i<COX;i++)
			for(int j=0;j<ROW;j++)
			{
				if(-1==coordinate[i][j]||-2==coordinate[i][j])
					all++;
			}
		return all;
	}
	
}//class
