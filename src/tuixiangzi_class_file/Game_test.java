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
	//pi,pj���ڼ�¼���������
	static int all=0; 
	public static final int COX=13,ROW=13;//����ĺ���
	
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
	//��һ��
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
	
//	0 ��ʾ ·
//	1 ��ʾ ���
//	2 ��ʾ ���ӣ����
//	-1 ��ʾ Ŀ��㣨������
//	-2��ʾ  �õ�����
//	3 ��ʾ ��
//	-3 ��ʾ ��
//	4 ��ʾ ǽ

	//�ڶ���
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
	//�����������������ְ�
	//
	//
//
//	public static void main(String[] args) throws IOException {
//		// TODO �Զ����ɵķ������
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
//	        	System.out.println("�ɹ����أ�����");
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
					pj=j;//��ȡ����1������
				}
				System.out.print(coordinate[i][j]+"  ");
				if(ROW-1==j)
					System.out.println();
			}
	}
	/*
	 * �ж�������ƶ�
	 */
	public static Boolean Judge_Move(int x,int y,String s,int[][] coordinate)
	{
		if(s.equals("up")&&0>x-1)		 //�ж����ƽ���
			return false;
		//�ж������ϰ���
		if(s.equals("up")&&(3==coordinate[x-1][y]||-3==coordinate[x-1][y]||4==coordinate[x-1][y]||2==coordinate[x-1][y]))
			return false;
		if(s.equals("down")&&COX-1<x+1)	 //�ж����ƽ���
		{
			System.out.println("��down����");
			return false;
		}
		//�ж������ϰ���
		if(s.equals("down")&&(3==coordinate[x+1][y]||-3==coordinate[x+1][y]||4==coordinate[x+1][y]||2==coordinate[x+1][y]))
		{
			System.out.println("��down�ϰ���"+" coordinate[x+1][y]="+coordinate[x+1][y]);
			return false;
		}
		if(s.equals("left")&&0>y-1)		 //�ж����ƽ���
			return false;
		//�ж������ϰ���
		if(s.equals("left")&&(3==coordinate[x][y-1]||-3==coordinate[x][y-1]||4==coordinate[x][y-1]||2==coordinate[x][y-1]))
			return false;
		if(s.equals("right")&&ROW-1<y+1)	 //�ж����ƽ���
			return false;
		//�ж������ϰ���
		if(s.equals("right")&&(3==coordinate[x][y+1]||-3==coordinate[x][y+1]||4==coordinate[x][y+1]||2==coordinate[x][y+1]))
			return false;
		return true;
	}
	/*
	 * �ж�����������
	 */
	public static Boolean Judge_Push(int x,int y,String s,int[][] coordinate)
	{
		//�ж����ƽ���
		if(s.equals("up")&&(0>x-2))
			return false;
		//�ж������ϰ���
		if(s.equals("up")&&(2==coordinate[x-1][y]))
			if(s.equals("up")&&(-3==coordinate[x-2][y]||3==coordinate[x-2][y]||4==coordinate[x-2][y]||-2==coordinate[x-2][y]||2==coordinate[x-2][y]))
			{
				//System.out.println("x="+x+" y="+y);
				return false;
			}
			else return true;
		
		//�ж����ƽ���
		if(s.equals("down")&&(COX-1<x+2))
		{
			System.out.println("��down_����");
			return false;
		}
		//�ж������ϰ���
		if(s.equals("down")&&(2==coordinate[x+1][y]))
			if(s.equals("down")&&(-3==coordinate[x+1][y]||-3==coordinate[x+2][y]||3==coordinate[x+1][y]||3==coordinate[x+2][y]||4==coordinate[x+1][y]||4==coordinate[x+2][y]||2==coordinate[x+2][y]||-2==coordinate[x+2][y]))
			{
				System.out.println("��down_�ϰ���"+"x="+x+" y="+y);
				return false;
			}
			else {
				System.out.println("��down_�ɹ�"+"x="+x+" y="+y);
				return true;
			}
		//�ж����ƽ���
		if(s.equals("left")&&(0>y-2))
			return false;
		//�ж������ϰ���
		if(s.equals("left")&&(2==coordinate[x][y-1]))
			if(s.equals("left")&&(-3==coordinate[x][y-2]||3==coordinate[x][y-2]||4==coordinate[x][y-2]||2==coordinate[x][y-2]||-2==coordinate[x][y-2]))
			{
				//System.out.println("x="+x+" y="+y);
				return false;
			}
			else return true;
		//�ж����ƽ���
		if(s.equals("right")&&(ROW-1<y+2))
			return false;
		//�ж������ϰ���
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
	 * �ж��Ƿ�����Ŀ���
	 */
	public static Boolean Judge_Aim1(int x,int y,String s,int[][] coordinate)
	{
		//�ж���
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
		//�ж���
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
		//�ж���
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
	 * �ж��Ƿ������Ѿ��յ�����ĵ�
	 */
	public static Boolean Judge_Aim2(String s,int[][] coordinate)
	{
		//�ж���
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
		//�ж���
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
		//�ж���
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
		//�ж���
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
	 * �ж���Ϸ�ɹ�
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
