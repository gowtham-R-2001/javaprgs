import java.awt.* ;

import java.awt.event.* ;

import javax.swing.* ;

import java.awt.FlowLayout.* ;

import java.lang.Math ;

import java.io.* ;

class ques1 extends JFrame
{
	private String s1 = "" ;
	
	private int[] arr = new int[41] ; 
	
	private int score = 0 , wrong_answers = 0 , i = 0 , flg = 0 , sflg = 0 , setflg = 0 , tflg = 0 , bflg = 0 , mflg = 0 ; 
	
	private static int cnt = 0 ;

	private String[] str = { "melon","fast","corn","berry","nut","ball","milk","meal","mint","cake","bean","bread","gum","shake","sauce","burger","steak","jack","finger","apple","sprout","fries","candy","pie","ade","dog","chips","sauce","noodles","soup","chicken","meat","coffee","tea","naan","jamun","manchurian","biriyani","flakes","piece" } ; 
	
	private String[] answer = { "water","break","pop","straw","pea","meat","butter","oat","pepper","cup","jelly","garlic","bubble","milk","apple","cheese","beef","cracker","lady","pine","bean","french","cotton","moon","lemon","hot","potato","tomato","egg","vegetable","grill","sweet","honey","lemon","butter","gulab","gobi","prawn","corn","leg" } ;
	
	/*
	
	
	1.watermelon 2.breakfast 3.popcorn 4.strawberry 5.peanut 6.meatball 7.Buttermilk 8.oatmeal 9.peppermint 10.cupcake 
	
	11.jellybean 12.garlicbread 13.Bubblegum 14.milkshake 15.applesauce 16.cheeseburger 17.beef 18.crackjack 19.ladyfinger 20.pineapple
	
	21.beansprout 22.frenchfries 23.cottoncandy 24.moonpie 25.lemonade 26.hotdog 27.potatochips 28.tomatosauce 29.eggnoodles 30.vegetablesoup  
	
	31.grillchicken 32.sweetmeat 33.honeycoffee 34.lemontea 35.butternaan 36.gulabjamun 37.gobimanchurian 38.prawnbiriyani 39.cornflakes 40.legpiece 41.
	
	*/
	
	private JLabel lb1 , lb2 , lb3 , lb4 , lb5 ;
	
	private JTextField tf1 ;
	
	private JButton b1 ;
	
	public ques1()
	{
		super( "compoundWords game" ) ;
		
		setLayout( new FlowLayout() ) ;
		
		b1 = new JButton( "Begin" ) ;
		
		lb1 = new JLabel( "                    Compound words !                              " ) ;
		
		lb2 = new JLabel("") ;
		
		lb3 = new JLabel("") ;
		
		lb4 = new JLabel("") ;
		
		lb5 = new JLabel("") ;
		
		tf1 = new JTextField( 8 ) ;
	
		add(lb1) ;	add(lb2) ;	add(b1) ;
		
		randno( arr ) ;
		
		i = 0 ;
		
		frmhnd handler = new frmhnd() ;
		
		tf1.addActionListener( handler ) ;
		
		b1.addActionListener( handler ) ;
	}
	
	private class frmhnd implements ActionListener
	{
		public void actionPerformed( ActionEvent evnt )
		{
			if( (evnt.getSource() == b1) )
			{
				if( setflg == 0 )
				{
					add(lb5) ;	add(tf1) ;	add(lb2) ;
				
					add(b1) ;	add(lb4) ;	add(lb3) ;
					
					setflg = 1 ;
				}
				
				b1.setText( "Submit" ) ;
				
				lb5.setText( "Quetion " + (cnt+1) + " / 10                                                                       "  ) ;
				
				if( sflg == 0 && mflg == 1 )
				{
					if( (arr[cnt] == 0 )  )
						{
							if( s1.equalsIgnoreCase( answer[ arr[cnt] ] ) )
								flg = 1 ;
						}
						else if( (arr[cnt]  == 1 )  )
						{
							if( s1.equalsIgnoreCase( answer[ arr[cnt] ] ) )
								flg = 1 ;
						}
						else if( ( arr[cnt] == 2 )  )
						{
							if( s1.equalsIgnoreCase( answer[ arr[cnt] ] ) )
								flg = 1 ; 
						}
						else if( arr[cnt] == 3 )
						{
							if( s1.equalsIgnoreCase( answer[ arr[cnt] ]  ) )
								flg = 1 ;
						}
						else if( arr[cnt] == 4 )
						{
							if( s1.equalsIgnoreCase( answer[ arr[cnt] ] ) )
								flg = 1 ;
						}
						else if( arr[cnt] == 5 )
						{
							if( s1.equalsIgnoreCase( answer[ arr[cnt] ] ) )
								flg = 1 ;
						}
						else if( arr[cnt] == 6 )
						{
							if( s1.equalsIgnoreCase( answer[ arr[cnt] ] ) )
								flg = 1 ;
						}
						else if( arr[cnt] == 7 )
						{
							if( s1.equalsIgnoreCase( answer[ arr[cnt] ] ) )
								flg = 1 ; 
						}
						else if( arr[cnt] == 8 )
						{
							if( s1.equalsIgnoreCase( answer[ arr[cnt] ] ) )
								flg = 1 ;
						}
						else if( arr[cnt] == 9 )
						{
							if( s1.equalsIgnoreCase( answer[ arr[cnt] ] ) )
								flg = 1 ;
						}
						else if( arr[cnt] == 10 )
						{
							if( s1.equalsIgnoreCase( answer[ arr[cnt] ] ) )
								flg = 1 ;
						}
						else if( arr[cnt] == 11 )
						{
							if( s1.equalsIgnoreCase( answer[ arr[cnt] ] ) )
								flg = 1 ; 
						}
						else if( arr[cnt] == 12 )
						{
							if( s1.equalsIgnoreCase( answer[ arr[cnt] ] ) )
								flg = 1 ;
						}
						else if( arr[cnt] == 13 )
						{
							if( s1.equalsIgnoreCase( answer[ arr[cnt] ] ) )
								flg = 1 ;
						}
						else if( arr[cnt] == 14 )
						{
							if( s1.equalsIgnoreCase( answer[ arr[cnt] ] ) )
								flg = 1 ;	
						}
						else if( arr[cnt] == 15 )
						{
							if( s1.equalsIgnoreCase( answer[ arr[cnt] ] ) )
								flg = 1 ;
						}
						else if( arr[cnt] == 16 )
						{
							if( s1.equalsIgnoreCase( answer[ arr[cnt] ] ) )
								flg = 1 ;
						}
						else if( arr[cnt] == 17 )
						{
							if( s1.equalsIgnoreCase( answer[ arr[cnt] ] ) )
								flg = 1 ; 
						}
						else if( arr[cnt] == 18 )
						{
							if( s1.equalsIgnoreCase( answer[ arr[cnt] ] ) )
								flg = 1 ; 
						}
						else if( arr[cnt] == 19 )
						{
							if( s1.equalsIgnoreCase( answer[ arr[cnt] ] ) )
								flg = 1 ; 
						}
						else if( arr[cnt] == 20 )
						{
							if( s1.equalsIgnoreCase( answer[ arr[cnt] ] ) )
								flg = 1 ; 						
						}
						else if( arr[cnt] == 21 )
						{
							if( s1.equalsIgnoreCase( answer[ arr[cnt] ] ) )
								flg = 1 ; 
						}
						else if( arr[cnt] == 22 )
						{
							if( s1.equalsIgnoreCase( answer[ arr[cnt] ] ) )
								flg = 1 ;
						}
						else if( arr[cnt] == 23 )
						{
							if( s1.equalsIgnoreCase( answer[ arr[cnt] ] ) )
								flg = 1 ;
						}
						else if( arr[cnt] == 24 )
						{
							if( s1.equalsIgnoreCase( answer[ arr[cnt] ] ) )
								flg = 1 ;
						}
						else if( arr[cnt] == 25 )
						{
							if( s1.equalsIgnoreCase( answer[ arr[cnt] ] ) )
								flg = 1 ;
						}
						else if( arr[cnt] == 26 )
						{
							if( s1.equalsIgnoreCase( answer[ arr[cnt] ]  ) )
								flg = 1 ;
						}
						else if( arr[cnt] == 27 )
						{
							if( s1.equalsIgnoreCase(  answer[ arr[cnt] ]  ) )
								flg = 1 ; 
						}
						else if( arr[cnt] == 28 )
						{
							if( s1.equalsIgnoreCase( answer[ arr[cnt] ] ) )
								flg = 1 ;
						}
						else if( arr[cnt] == 29)
						{
							if( s1.equalsIgnoreCase( answer[ arr[cnt] ] ) )
								flg = 1 ; 
						}
						else if( arr[cnt] == 30)
						{
							if( s1.equalsIgnoreCase( answer[ arr[cnt] ] ) )
								flg = 1 ;
						}
						else if( arr[cnt] == 31)
						{
							if( s1.equalsIgnoreCase( answer[ arr[cnt] ] ) )
								flg = 1 ;
						}
						else if( arr[cnt] == 32)
						{
							if( s1.equalsIgnoreCase( answer[ arr[cnt] ] ) )
								flg = 1 ;
						}
						else if( arr[cnt] == 33)
						{
							if( s1.equalsIgnoreCase( answer[ arr[cnt] ] ) )
								flg = 1 ;
						}
						else if( arr[cnt] == 34)
						{
							if( s1.equalsIgnoreCase( answer[ arr[cnt] ] ) )
								flg = 1 ;
						}
						else if( arr[cnt] == 35)
						{
							if( s1.equalsIgnoreCase( answer[ arr[cnt] ] ) )
								flg = 1 ;
						}
						else if( arr[cnt] == 36)
						{
							if( s1.equalsIgnoreCase( answer[ arr[cnt] ] ) )
								flg = 1 ;
						}
						else if( arr[cnt] == 37)
						{
							if( s1.equalsIgnoreCase( answer[ arr[cnt] ] ) )
								flg = 1 ;
						}
						else if( arr[cnt] == 38)
						{
							if( s1.equalsIgnoreCase( answer[ arr[cnt] ] ) )
								flg = 1 ;
						}
						else if( arr[cnt] == 39)
						{
							if( s1.equalsIgnoreCase( answer[ arr[cnt] ] ) )
								flg = 1 ;
						}
				
						if( flg == 1 )
						{
							score++ ;
							tf1.setText( "RIGHT" ) ;
						}
						else
						{
							wrong_answers++ ;
							tf1.setText( "WRONG" ) ;
						}
						
						b1.setText( "Next" ) ;
						
					
					sflg = 1 ;  	flg = 0 ;	
				}
			}
			
			//
			
			lb4.setText( "          Score : " + score + " / 10         Wrong answers :  " + wrong_answers ) ;
			
			lb2.setText( " + " + str[ arr[cnt] ] ) ;

			//
			
			if( evnt.getSource() == tf1 )
			{	
				s1 = tf1.getText() ;
				
				//sflg = 1 ;
				
				if( s1.length() < 1 )
				{
					JOptionPane.showMessageDialog(null,"Invalid Attempt !") ;
					sflg = 1 ;
				}
				else
				{
					sflg = 0 ;
					tflg = 1 ;
				}
				
				mflg = 1 ;
					
			}
		}
	
	}
	
	public static int[] randno(int[] arr)
	{
		int i = 0 , j = 0 , k = 0 ;
		
		for(i = 0 ; i < 40 ; ++i)
			arr[i] = (int)( Math.random() * 40 ) + 1 ;
		
		for(i = 0 ; i < 40 ; ++i)
		{
			for(j = i+1 ; j < 40 ; ++j )
			{
				if( (arr[i] == arr[j]) && (arr[i] != -1 ) ) 
					arr[j] = -1 ;
			}
		}
	
		for(i = 0 ; i < 40 ; i++)
		{	
			if( arr[i] != -1 )
				arr[k++] = arr[i] ;
		}
		
		return(arr) ;
	}
}

class bkup
{
	public static void main(String args[])	
	{
		ques1 q = new ques1() ;
	
		q.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE ) ;
		
		q.setSize(350,350) ;
		
		q.setVisible( true ) ;
	}
}