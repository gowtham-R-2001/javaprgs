import java.awt.* ;

import java.awt.event.* ;

import javax.swing.* ;

import java.lang.Math ;

import java.awt.Color.* ;

import java.awt.Font.* ;

class proj extends JFrame
{
	private String[] str = { "I ate 4 ____" , "Ladies and gentlemen. Here ____ the news." , "Further information ____ available in the office. " , "The stairs ____ over there, Sir." , "The cat is sitting on my ____ " , "There are five ____ on my desk. " , "I have two ____." , "They are riding their ____." , "We have a ____." , "How many ____ do you have in your bag? " , "My mother has a new ____. " , "There are three windows in the ____. " , "Susan has four ____. " , "There is one ____ on the floor. " } ;
	
	private String[] right = { "Mangoes","is","is","are","Bed","Pencils","Sisters","Bikes","Dog","Books","Computer","Room","Posters","Pen" } ;

	private String[] wrong = { "Mango","are","are","is","Beds","Pencil","Sister","Bike","Dogs","Book","Computers","Rooms","Poster","Pens" } ;
	
	private int[] arr = new int[14] ;
	
	private int[] quesrand = new int[8] ;
	
	private String s1 = "" , s2 = "" ;
	
	/*1.
	
			1.mangoes 2.is 3.is 4.are 5.bed 6.pencils 7.sisters 8.bikes 9.dog 10.books
			
			11.computer 12.room 13.posters 14.pen 15.
	*/
	
	public Font f = new Font( "Arial", Font.BOLD , 15 ) ;
	
	public Font fb = new Font( "Arial", Font.BOLD , 12 ) ;
	
	public Icon begpic = new ImageIcon( getClass().getResource("plural-singular.jpg") ) ;
	
	private JLabel start , ques , quesnum , score , score1 , quesnum1 ;
	
	private JTextField tf1 ;
	
	private JButton b1 , opt1 , opt2 , submit , next ;
	
	private int cnt = 0 , setflg = 0 , bflg = 0 , scr = 0 , scrflg = 0 , opt1flg = 0 , opt2flg = 0 , subflg = 0 ;
	
	public proj()
	{
		super("singular-plural game") ;
		
		this.getContentPane().setBackground( Color.WHITE ) ;
		
		setLayout( null ) ;
		
		start = new JLabel("") ;
		
		start.setBounds(50,10,300,150) ;
		
		//
		
		b1 = new JButton("Click here to start >>>") ;
		
		b1.setFont( f ) ;
		
		b1.setBackground( Color.BLUE ) ;	b1.setForeground( Color.WHITE ) ;
		
		b1.setBounds(130,200,200,30) ;
		
		//
		
		score = new JLabel("Score : " ) ;
		
		score.setBounds( 330,10,100,20 ) ;
		
		score.setFont( f ) ;
	
		score.setForeground( new java.awt.Color(34,139,34) ) ;	//forest GREEN
		
		//
		
		score1 = new JLabel( "" + scr ) ;
		
		score1.setBounds(385,10,80,20 ) ;
		
		score1.setFont( f ) ;
		
		score1.setForeground( Color.RED ) ;
		
		//
		
		quesnum = new JLabel("") ;
		
		quesnum.setForeground( Color.BLUE ) ;
		
		quesnum.setBounds(10,40,150,30) ;
		
		//
		
		quesnum1 = new JLabel("") ;
		
		quesnum1.setForeground( Color.RED ) ;
		
		quesnum1.setFont(f) ;
		
		quesnum1.setBounds(80,40,40,30) ;
		
		//
		
		ques = new JLabel("") ;
		
		ques.setFont( f ) ;
		
		ques.setBounds(10,90,400,40) ;
		
		ques.setForeground( Color.BLACK ) ;
		
		//
		
		opt1 = new JButton("") ;		opt1.setBounds(120,160,100,30) ;
		
		opt1.setFont(fb) ;

		opt2 = new JButton("") ;		opt2.setBounds(230,160,100,30) ;
		
		opt2.setFont(fb) ;
		
		tf1 = new JTextField( 20 ) ;	tf1.setBounds(10,220,415,20) ;
		
		tf1.setBackground( Color.WHITE ) ;
		
		tf1.setFont( f ) ;
		
		next = new JButton("Next >>>") ;
		
		submit = new JButton("Submit") ;
		
		add(start) ;	start.setIcon( begpic ) ;
		
		add(b1) ;
		
		add(score) ;	score.setVisible( false ) ;
		
		add(score1) ;	score1.setVisible( false ) ;
		
		add(quesnum) ;  quesnum.setVisible(false) ;
		
		add(quesnum1) ;	quesnum1.setVisible( false ) ;
		
		add(ques) ; 	ques.setVisible(false) ;
		
		add(opt1) ;		opt1.setVisible(false) ;
		
		add(opt2) ;		opt2.setVisible(false) ;
		
		add(tf1) ;		tf1.setVisible(false) ;
		
		tf1.setEditable(false) ;
		
		add(submit) ;	submit.setVisible(false) ;
		
		add(next) ;		next.setVisible(false) ;
		
		next.setBounds(170,270,100,30) ;
		
		submit.setBounds(170,270,100,30) ;
		
		randno(arr) ;
		
		for(int i = 0 ; i < 8 ; i++)
			quesrand[i] = (int)( Math.random() * 2 ) ;

		for(int i = 0 ; i < 8 ; i++)
			System.out.println( quesrand[i] ) ;

		frmhnd handler = new frmhnd() ;

		b1.addActionListener( handler ) ;

		opt1.addActionListener( handler ) ;

		opt2.addActionListener( handler ) ;

		next.addActionListener( handler ) ;

		submit.addActionListener( handler ) ;
	}
	
	private class frmhnd implements ActionListener
	{
		public void actionPerformed(ActionEvent evnt)
		{
			if( (evnt.getSource() == b1) && (setflg == 0) )
			{
				quesnum.setVisible(true)  ;		b1.setVisible(false) ;
			    start.setVisible(false)   ;		tf1.setVisible(true) ;
				ques.setVisible(true)     ;		opt1.setVisible(true) ;
				opt2.setVisible(true)     ;		tf1.setVisible(true) ;
				submit.setVisible(true)   ;		score.setVisible( true ) ;
				score1.setVisible( true ) ;		quesnum1.setVisible(true) ;
				
				if( quesrand[cnt] == 0 )
				{
					opt1.setText( right[ arr[cnt] ] ) ;
					
					opt2.setText( wrong[ arr[cnt] ] ) ;
				}
				
				else
				{
					opt2.setText( right[ arr[cnt] ] ) ;
					
					opt1.setText( wrong[ arr[cnt] ] ) ;
				}
				
				quesnum.setText("Question ") ;
				
				quesnum1.setText( (cnt+1) + " / 10") ;

				quesnum.setFont( f ) ;
				
				opt1.setBackground( new java.awt.Color(255,255,153) ) ;
				
				opt2.setBackground( new java.awt.Color(255,255,153) ) ;

				ques.setText( (cnt+1) + " . " + str[ arr[cnt] ] ) ;

				setflg = 1 ;	bflg = 1 ;
			}
			
			//
			
			if( evnt.getSource() == opt1 && subflg == 0 )
			{
				s1 = opt1.getText() ;
					
				tf1.setText( "                                              " + s1 ) ;
				
				opt1flg = 1 ;	opt2flg = 0 ;	 bflg = 0 ;
			}
			
			if( evnt.getSource() == opt2 && subflg == 0 )
			{
				s1 = opt2.getText() ;
					
				tf1.setText( "                                              " + s1 ) ;
				
				opt2flg = 1 ; 	opt1flg = 0 ;	bflg = 0 ;
			}
			
			if( (evnt.getSource() == submit) && (bflg == 0) ) 
			{
				if( opt1flg == 1 )
				{
					if( quesrand[cnt] == 0 )
					{
						opt1.setBackground( Color.GREEN ) ;
					
						opt1.setForeground( Color.BLACK ) ;
						
						//
						
						opt2.setBackground( Color.RED ) ;

						opt2.setForeground( Color.WHITE ) ;

						tf1.setBackground( Color.GREEN ) ;

						tf1.setForeground( Color.BLACK ) ;
						
						if(scrflg == 0)
							scr++ ;

						scrflg = 1 ;
					}
					
					else //if( quesrand[cnt] == 1 )
					{
						opt1.setBackground( Color.RED ) ;

						opt1.setForeground( Color.WHITE ) ;

						//

						opt2.setBackground( Color.GREEN ) ;

						opt2.setForeground( Color.BLACK ) ;

						tf1.setBackground( Color.RED ) ;

						tf1.setForeground( Color.WHITE ) ;
					}
					
				}
				
				if( opt2flg == 1 )
				{
					if( quesrand[cnt] == 1 )
					{
						opt2.setBackground( Color.GREEN ) ;
					
						opt2.setForeground( Color.BLACK ) ;
						
						//
						
						opt1.setBackground( Color.RED ) ;
						
						opt1.setForeground( Color.WHITE ) ;
						
						tf1.setBackground( Color.GREEN ) ;
						
						tf1.setForeground( Color.BLACK ) ;
						
						if(scrflg == 0)
							scr++ ;
						
						System.out.println("SCR : "  + scr ) ;
					
						scrflg = 1 ;
					}
					
					else //if( quesrand[cnt] == 0 )
					{
						opt2.setBackground( Color.RED ) ;
					
						opt2.setForeground( Color.WHITE ) ;
					
						//
					
						opt1.setBackground( Color.GREEN ) ;

						opt1.setForeground( Color.BLACK ) ;

						tf1.setBackground( Color.RED ) ;

						tf1.setForeground( Color.WHITE ) ;
					}
				}
		
				submit.setVisible(false) ;
				
				next.setVisible(true) ;
				
				opt1flg = 0 ;	opt2flg = 0 ;	bflg = 1 ;	subflg = 1 ;
			}
			
			if( evnt.getSource() == next )
			{
				tf1.setText("") ;

				opt1.setBackground( new java.awt.Color(255,255,153) ) ;

				opt2.setBackground( new java.awt.Color(255,255,153) ) ;

				tf1.setBackground( Color.WHITE ) ;
				
				tf1.setForeground( Color.BLACK ) ;

				opt1.setForeground( Color.BLACK ) ;

				opt2.setForeground( Color.BLACK ) ;

				cnt++ ;

				ques.setText(  (cnt+1) + " . " + str[ arr[cnt] ] ) ;

				quesnum.setText("Question ") ;

				quesnum1.setText( (cnt+1) + " / 10") ;

				if( quesrand[cnt] == 0 )
				{
					opt1.setText( right[ arr[cnt] ] ) ;

					opt2.setText( wrong[ arr[cnt] ] ) ;
				}
				
				else
				{
					opt2.setText( right[ arr[cnt] ] ) ;

					opt1.setText( wrong[ arr[cnt] ] ) ;
				}
				
				scrflg = 0 ;	subflg = 0 ;
				
				submit.setVisible(true) ;
				
				next.setVisible(false) ;
				
				if( cnt > 5 )
				{
					quesnum.setVisible(false) ;
					ques.setVisible(false) ;
					score.setVisible( false ) ;
					opt2.setVisible(false) ;
					opt1.setVisible(false) ;
					next.setVisible(false) ;
					submit.setVisible(false) ;
					tf1.setVisible(false)  ;
					quesnum1.setVisible(false) ;
					score1.setVisible(false) ;
					JOptionPane.showMessageDialog(null,"Good play !") ;
				}
			}
			
			score.setText( "Score : " ) ;
			
			score1.setText( " " + scr ) ;
		}

	}

	public static int[] randno(int[] arr)
	{
		int k = 0 ;
		
		for(int i = 0 ; i < 14 ; ++i)
			arr[i] = (int)( Math.random() * 14 ) ;
		
		for(int i = 0 ; i < 14 ; ++i)
		{
			for(int j = i+1 ; j < 14 ; ++j )
			{
				if( (arr[i] == arr[j]) && (arr[i] != -1 ) ) 
					arr[j] = -1 ;
			}
		}
	
		for(int i = 0 ; i < 14 ; i++)
		{
			if( arr[i] != -1 )
				arr[k++] = arr[i] ;
		}
		
		return(arr) ;
	}
	
}

class sinplu
{
	public static void main(String args[])
	{
		proj p = new proj() ;
		
		p.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE ) ;
		
		p.setSize(425,450) ;
		
		p.setVisible(true) ;
	}
}