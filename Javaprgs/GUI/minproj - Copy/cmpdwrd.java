import java.awt.* ;

import java.awt.event.* ;

import javax.swing.* ;

import java.awt.FlowLayout.* ;

import java.lang.Math ;

import java.io.* ;

class ques extends JFrame
{
	private String s1 = "" ;
	
	private int[] arr = new int[40] ; 
	
	private int score = 0 , wrong_answers = 0 , i = 0 , flg = 0 , sflg = 0 , setflg = 0 , tflg = 0 , bflg = 0 , cl = 1 , nflg = 0  ; 
	
	private static int cnt = 0 ;

	private String[] str = { "melon","fast","corn","berry","nut","ball","milk","meal","mint","cake","bean","bread","gum","shake","sauce","burger","steak","jack","finger","apple","sprout","fries","candy","pie","juice","dog","chips","sauce","noodles","soup","chicken","meat","coffee","tea","naan","jamun","manchurian","biriyani","flakes","piece" } ; 
	
	private String[] answer = { "water","break","pop","straw","pea","meat","butter","oat","pepper","cup","jelly","garlic","bubble","milk","apple","cheese","beef","cracker","lady","pine","bean","french","cotton","moon","lemon","hot","potato","tomato","egg","vegetable","grill","sweet","honey","lemon","butter","gulab","gobi","prawn","corn","leg" } ;
	
	/*
	
	
	1.watermelon 2.breakfast 3.popcorn 4.strawberry 5.peanut 6.meatball 7.Buttermilk 8.oatmeal 9.peppermint 10.cupcake 
	
	11.jellybean 12.garlicbread 13.Bubblegum 14.milkshake 15.applesauce 16.cheeseburger 17.beef 18.crackjack 19.ladyfinger 20.pineapple
	
	21.beansprout 22.frenchfries 23.cottoncandy 24.moonpie 25.lemonade 26.hotdog 27.potatochips 28.tomatosauce 29.eggnoodles 30.vegetablesoup  
	
	31.grillchicken 32.sweetmeat 33.honeycoffee 34.lemontea 35.butternaan 36.gulabjamun 37.gobimanchurian 38.prawnbiriyani 39.cornflakes 40.legpiece 41.
	
	*/
	
	private JLabel lb1 , lb2 , lb3 , lb4 , lb5 , img , femoji ;
	
	private JTextField tf1 ;
	
	private JButton b1 , clue ;
	
	public Icon right = new ImageIcon( getClass().getResource("correct1.jpg") ) ;
	
	public Icon wrong = new ImageIcon( getClass().getResource("wrong1.jpg") ) ;
	
	public Icon finemoji = new ImageIcon( getClass().getResource( "finemoji.jpg" ) ) ;
	
	//
	
	public Icon img1 = new ImageIcon( getClass().getResource("melon.jpg") ) ;
	
	public Icon img2 = new ImageIcon( getClass().getResource("fast.jpg") ) ;
	
	public Icon img3 = new ImageIcon( getClass().getResource("corn.jpg") ) ;
	
	public Icon img4 = new ImageIcon( getClass().getResource("berry.jpg") ) ;
	
	public Icon img5 = new ImageIcon( getClass().getResource("nut.jpg") ) ;
	
	public Icon img6 = new ImageIcon( getClass().getResource("ball.jpg") ) ;
	
	public Icon img7 = new ImageIcon( getClass().getResource("milk.jpg") ) ;
	
	public Icon img8 = new ImageIcon( getClass().getResource("meal.jpg") ) ;
	
	public Icon img9 = new ImageIcon( getClass().getResource("mint.jpg") ) ;
	
	public Icon img10 = new ImageIcon( getClass().getResource("cake.jpg") ) ;
	
	public Icon img11 = new ImageIcon( getClass().getResource("bean.jpg") ) ;
	
	public Icon img12 = new ImageIcon( getClass().getResource("bread.jpg") ) ;
	
	public Icon img13 = new ImageIcon( getClass().getResource("gum.jpg") ) ;
	
	public Icon img14 = new ImageIcon( getClass().getResource("shake.jpg") ) ;
	
	public Icon img15 = new ImageIcon( getClass().getResource("sauce.jpg") ) ;
	
	public Icon img16 = new ImageIcon( getClass().getResource("burger.jpg") ) ;
	
	public Icon img17 = new ImageIcon( getClass().getResource("steak.jpg") ) ;
	
	public Icon img18 = new ImageIcon( getClass().getResource("jack.jpg") ) ; 
	
	public Icon img19 = new ImageIcon( getClass().getResource("finger.jpg") ) ; 
	
	public Icon img20 = new ImageIcon( getClass().getResource("apple.jpg") ) ; 
	
	public Icon img21 = new ImageIcon( getClass().getResource("sprout.jpg") ) ; 
	
	public Icon img22 = new ImageIcon( getClass().getResource("fries.jpg") ) ; 
	
	public Icon img23 = new ImageIcon( getClass().getResource("candy.jpg") ) ; 
	
	public Icon img24 = new ImageIcon( getClass().getResource("pie.jpg") ) ; 
	
	public Icon img25 = new ImageIcon( getClass().getResource("juice.jpg") ) ; 
	
	public Icon img26 = new ImageIcon( getClass().getResource("dog.jpg") ) ; 
	
	public Icon img27 = new ImageIcon( getClass().getResource("chip.jpg") ) ; 
	
	public Icon img28 = new ImageIcon( getClass().getResource("sauce.jpg") ) ; 
	
	public Icon img29 = new ImageIcon( getClass().getResource("noodle.jpg") ) ; 
	
	public Icon img30 = new ImageIcon( getClass().getResource("soup.jpg") ) ; 
	
	public Icon img31 = new ImageIcon( getClass().getResource("chicken.jpg") ) ; 
	
	public Icon img32 = new ImageIcon( getClass().getResource("meat.jpg") ) ; 
	
	public Icon img33 = new ImageIcon( getClass().getResource("coffee.jpg") ) ; 
	
	public Icon img34 = new ImageIcon( getClass().getResource("tea.jpg") ) ; 
	
	public Icon img35 = new ImageIcon( getClass().getResource("naan.jpg") ) ; 
	
	public Icon img36 = new ImageIcon( getClass().getResource("jamun.jpg") ) ; 
	
	public Icon img37 = new ImageIcon( getClass().getResource("manchu.jpg") ) ; 
	
	public Icon img38 = new ImageIcon( getClass().getResource("biriyani.jpg") ) ; 
	
	public Icon img39 = new ImageIcon( getClass().getResource("flakes.jpg") ) ; 
	
	public Icon img40 = new ImageIcon( getClass().getResource("piece.jpg") ) ; 
	
	
	// Img.setIcon( img1 ) ;
	
	public ques()
	{
		super( "compoundWords game" ) ;
		
		setLayout( new FlowLayout() ) ;
		
		b1 = new JButton( "Begin" ) ;
		
		lb1 = new JLabel( "                    Compound words !                              " ) ;
		
		lb2 = new JLabel("") ;
		
		lb3 = new JLabel("") ;
		
		lb4 = new JLabel("") ;
		
		lb5 = new JLabel("") ;
		
		img = new JLabel("") ;
		
		femoji = new JLabel("") ;
		
		clue = new JButton("clue") ;
		
		tf1 = new JTextField( 8 ) ;
	
		add(lb1) ;	add(b1) ;
		
		add(lb5) ;

		add(tf1) ;		tf1.setVisible( false ) ;
		
		add(lb2) ;		lb2.setVisible( false ) ;
		
		add(lb4) ;		lb4.setVisible( false ) ;	
		
		add(clue) ;		clue.setVisible( false ) ;
		
		add(lb3) ;		lb3.setVisible( false ) ;

		add(img) ;		img.setVisible( false ) ;
		
		add( femoji ) ;	femoji.setVisible( false ) ;
		
		randno( arr ) ;
		
		i = 0 ;

		frmhnd handler = new frmhnd() ;
		
		tf1.addActionListener( handler ) ;
		
		b1.addActionListener( handler ) ;
		
		clue.addActionListener( handler ) ;
	}
	
	private class frmhnd implements ActionListener
	{
		public void actionPerformed( ActionEvent evnt )
		{	
			if( cnt > 9 )
			{
				JOptionPane.showMessageDialog(null,"Good play ! You scored " + score + " points" ) ;
				tf1.setVisible( false ) ;
				lb2.setVisible( false ) ;
				lb4.setVisible( false ) ;	
				clue.setVisible( false ) ;
				img.setVisible( false ) ;
				lb5.setVisible( false ) ;
				b1.setVisible( false ) ;
				clue.setVisible( false ) ;
				femoji.setIcon( finemoji ) ;
				femoji.setVisible( true ) ;
			}
			
			if(bflg == 1)
			{
				tf1.setText("") ;
				lb3.setText("") ;
				img.setVisible( false ) ;
				lb3.setVisible( false ) ;
				clue.setVisible( true ) ;
				bflg = 0 ;
			}
	
			tf1.setEditable( true ) ;
			
			if( arr[cnt] >= 40 )
				arr[cnt] = arr[cnt] - 1 ;
			
			if( (evnt.getSource() == b1) && (setflg == 0)  )
			{
				tf1.setVisible( true ) ;
				lb2.setVisible( true ) ;
				lb4.setVisible( true ) ;
				lb3.setVisible( true ) ;
				clue.setVisible( true ) ;
				add(b1) ;
				b1.setVisible( true ) ;
				img.setVisible( true ) ;
				setflg = 1 ;
			}
			
			if( evnt.getSource() == clue )
			{
				if( (cl % 2 == 0) || (nflg == 1) )
					img.setVisible( false ) ;
				else
					img.setVisible( true ) ;
				
				switch( arr[cnt] )
				{
					case 0 :
							img.setIcon( img1 ) ; 
							break ;
							
					case 1 :
							img.setIcon( img2 ) ; 
							break ;
							
					case 2 :
							img.setIcon( img3 ) ; 
							break ;
							
					case 3 :
							img.setIcon( img4 ) ; 
							break ;
							
					case 4 :
							img.setIcon( img5 ) ; 
							break ;
							
					case 5 :
							img.setIcon( img6 ) ; 
							break ;
							
					case 6 :
							img.setIcon( img7 ) ; 
							break ;
					
					case 7 :
							img.setIcon( img8 ) ; 
							break ;
							
					case 8 :
							img.setIcon( img9 ) ; 
							break ;
							
					case 9 :
							img.setIcon( img10 ) ; 
							break ;
							
					case 10 :
							img.setIcon( img11 ) ; 
							break ;
							
					case 11 :
							img.setIcon( img12 ) ; 
							break ;
							
					case 12 :
							img.setIcon( img13 ) ; 
							break ;
							
					case 13 :
							img.setIcon( img14 ) ; 
							break ;
							
					case 14 :
							img.setIcon( img15 ) ; 
							break ;
							
					case 15 :
							img.setIcon( img16 ) ; 
							break ;
							
					case 16 :
							img.setIcon( img17 ) ; 
							break ;
							
					case 17 :
							img.setIcon( img18 ) ; 
							break ;
							
					case 18 :
							img.setIcon( img19 ) ; 
							break ;
							
					case 19 :
							img.setIcon( img20 ) ; 
							break ;
							
					case 20 :
							img.setIcon( img21 ) ; 
							break ;
							
					case 21 :
							img.setIcon( img22 ) ; 
							break ;
							
					case 22 :
							img.setIcon( img23 ) ; 
							break ;
							
					case 23 :
							img.setIcon( img24 ) ; 
							break ;
							
					case 24 :
							img.setIcon( img25 ) ; 
							break ;
							
					case 25 :
							img.setIcon( img26 ) ; 
							break ;
							
					case 26 :
							img.setIcon( img27 ) ; 
							break ;
							
					case 27 :
							img.setIcon( img28 ) ; 
							break ;
							
					case 28 :
							img.setIcon( img29 ) ; 
							break ;
							
					case 29 :
							img.setIcon( img30 ) ; 
							break ;
							
					case 30 :
							img.setIcon( img31 ) ; 
							break ;
							
					case 31 :
							img.setIcon( img32 ) ; 
							break ;
							
					case 32 :
							img.setIcon( img33 ) ; 
							break ;
							
					case 33 :
							img.setIcon( img34 ) ; 
							break ;
							
					case 34 :
							img.setIcon( img35 ) ; 
							break ;
							
					case 35 :
							img.setIcon( img36 ) ; 
							break ;
							
					case 36 :
							img.setIcon( img37 ) ; 
							break ;
							
					case 37 :
							img.setIcon( img38 ) ; 
							break ;
							
					case 38 :
							img.setIcon( img39 ) ; 
							break ;
							
					case 39 :
							img.setIcon( img40 ) ; 
							break ;
							
					default :
							JOptionPane.showMessageDialog(null,"Error !") ;
				}
				
				cl++ ;	nflg = 0 ;
			}
		
			lb5.setText( "Quetion " + (cnt+1) + " / 10                                                                                                 "  ) ;
			
			if( evnt.getSource() == tf1 )
			{	
				s1 = evnt.getActionCommand() ;
				
				sflg = 1 ;
				
				if( s1.length() < 1 )
				{
					JOptionPane.showMessageDialog(null,"Invalid Attempt !") ;
					sflg = 0 ;
				}
				else
					tflg = 1 ;
				
				//tf1.setText(s1) ;
			}
			
			if( (evnt.getSource() == b1) && (sflg == 1) )
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
							lb3.setVisible( true ) ;
							lb3.setIcon( right ) ;
						}
						else
						{
							wrong_answers++ ;
							lb3.setVisible( true ) ;
							lb3.setIcon( wrong ) ;
						}
						
						flg = 0 ;		sflg = 0 ;
			}
			
			lb4.setText( "          Score : " + score + " / 10         Wrong answers :  " + wrong_answers ) ;
			
			System.out.println("Str : " + str[ arr[cnt] ] + " Arr : " + arr[cnt] ) ;
			
			lb2.setText( " + " + str[ arr[cnt] ] ) ;
			
			b1.setText("Submit") ;

			if( (evnt.getSource() == b1) && (tflg == 1) )
			{
				b1.setText("Next") ;
				img.setVisible( false ) ;
				tf1.setEditable( false ) ;
				clue.setVisible( false ) ;
				cnt++ ;
				tflg = 0 ;
				bflg = 1 ;
				cl = 1 ;
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

class cmpdwrd
{
	public static void main(String args[])	
	{
		ques q = new ques() ;
	
		q.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE ) ;
		
		q.setSize(425,450) ;
		
		q.setVisible( true ) ;
	}
}