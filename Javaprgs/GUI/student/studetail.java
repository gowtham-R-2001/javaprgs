import java.awt.* ;

import javax.swing.* ;

import java.awt.event.* ;

import java.awt.Color.* ; 

import java.awt.Font.* ;

import java.awt.Color.* ;

class details extends JFrame
{
	private String[][] s = new String[50][10] ;
	
	//
	
	public JTabbedPane tb = new JTabbedPane() ;
	
	public JPanel pnl1 = new JPanel() ;
	
	public JPanel pnl2 = new JPanel() ;
	
	
	
	/*private JLabel name , roll , tamil , english , maths , science , social , g1 , g2 , g3 , g4 , g5 ;
	
	private JTextField tf1 , tam , eng , mat , sci , soc , rolltf ; */
	
	
	
	
	private JLabel name1 , roll1 , tamil1 , english1 , maths1 , science1 , social1 , g11 , g21 , g31 , g41 , g51 ;
	
	private JTextField tf11 , tam1 , eng1 , mat1 , sci1 , soc1 , rolltf1 ;
	
	
	
	//private JButton revert  , showgrade ;
	
	private JButton revert1  , showgrade2 , begin ;
	
	
	private int i = 0 , x = 0 , flg1 = 0 , flg2 = 0 , flg3 = 0 , flg4 = 0 , flg5 = 0 , rollno = 101 ;
	
	
	public details()
	{
		super("student details") ;
	
		setLayout( null ) ;
		
		//
		
		pnl1.setBackground( Color.YELLOW ) ;
		
		pnl2.setBackground( Color.WHITE ) ;
	
		//
		
		/*roll = new JLabel("Roll") ;			roll.setBounds(30,3,120,50) ;
		
		rolltf = new JTextField( 20 ) ;		rolltf.setBounds(100,20,80,20) ;
		
		rolltf.setText("" + rollno ) ;
		
		rolltf.setEditable( false ) ; &*/
		
		
		roll1 = new JLabel("Roll") ;			roll1.setBounds(30,3,120,50) ;
		
		rolltf1 = new JTextField( 20 ) ;		rolltf1.setBounds(100,20,80,20) ;
		
		rolltf1.setText("" + rollno ) ;
		
		rolltf1.setEditable( false ) ;
		
		
		//
		
		
		/*name = new JLabel("Name ") ;	    name.setBounds(30,38,120,50) ;
		
		tf1 = new JTextField(20) ;			tf1.setBounds(100,55,80,20) ; */
		
		
		
		name1 = new JLabel("Name ") ;	    name1.setBounds(30,38,120,50) ;
		
		tf11 = new JTextField(20) ;			tf11.setBounds(100,55,80,20) ;
		
		//
		
		/*tamil = new JLabel("Tamil marks ") ;		tamil.setBounds(10,80,120,50) ;

		tam = new JTextField(2) ;	 				tam.setBounds(100,97,80,20) ; */
		
		
		tamil1 = new JLabel("Tamil marks ") ;		tamil1.setBounds(10,80,120,50) ;

		tam1 = new JTextField(2) ;	 				tam1.setBounds(100,97,80,20) ;
		
		//
		
		/*english = new JLabel("English marks ") ;	  english.setBounds(10,125,120,50) ;
		
		eng = new JTextField(2) ;	 				  eng.setBounds(100,142,80,20) ; */
		
		
		english1 = new JLabel("English marks ") ;	  english1.setBounds(10,125,120,50) ;
		
		eng1 = new JTextField(2) ;	 				  eng1.setBounds(100,142,80,20) ;
		
		//
		
		/*maths = new JLabel("Maths marks ") ;		maths.setBounds(10,170,120,50) ;

		mat = new JTextField(2) ;            		mat.setBounds(100,187,80,20) ;	*/
		
		
		maths1 = new JLabel("Maths marks ") ;		maths1.setBounds(10,170,120,50) ;

		mat1 = new JTextField(2) ;            		mat1.setBounds(100,187,80,20) ;
		
		//
		
		/*science = new JLabel("Science marks ") ;	science.setBounds(10,215,120,50) ;
		
		sci = new JTextField(2) ;	 				sci.setBounds(100,232,80,20) ; */
		
		
		science1 = new JLabel("Science marks ") ;	science1.setBounds(10,215,120,50) ;
		
		sci1 = new JTextField(2) ;	 				sci1.setBounds(100,232,80,20) ;
		
		//
		
		/* social = new JLabel("Social marks ") ;		social.setBounds(10,260,120,50) ;
		
		soc = new JTextField(2) ;	 				soc.setBounds(100,277,80,20) ; */
		
		
		social1 = new JLabel("Social marks ") ;		social1.setBounds(10,260,120,50) ;
		
		soc1 = new JTextField(2) ;	 				soc1.setBounds(100,277,80,20) ;
		
		//
		
		/*g1 = new JLabel("") ;		g1.setBounds(190,83,100,50) ;
		
		g2 = new JLabel("") ;		g2.setBounds(190,128,100,50) ;
		
		g3 = new JLabel("") ;		g3.setBounds(190,173,100,50) ;
		
		g4 = new JLabel("") ;		g4.setBounds(190,213,100,50) ;
		
		g5 = new JLabel("") ;		g5.setBounds(190,263,100,50) ;	*/
		
		
		g11 = new JLabel("") ;		g11.setBounds(190,83,100,50) ;
		
		g21 = new JLabel("") ;		g21.setBounds(190,128,100,50) ;
		
		g31 = new JLabel("") ;		g31.setBounds(190,173,100,50) ;
		
		g41 = new JLabel("") ;		g41.setBounds(190,213,100,50) ;
		
		g51 = new JLabel("") ;		g51.setBounds(190,263,100,50) ;	

		//
		
		showgrade = new JButton("Show Grade") ;		showgrade.setBounds(10,317,120,20) ;
		
		revert = new JButton(" Revert <-- ") ;		revert.setBounds(150,317,120,20) ;
		
		//

		/*add(name) ;		add(roll) ;   add(tamil) ;	add(english) ;	add(maths) ;	add(science) ; 	add(social) ;

		add(tf1) ; 		add(rolltf) ;	 add(tam) ; 		add(eng) ;		add(mat) ;	add(sci) ;	add(soc) ;

		add(g1) ; add(g2) ; add(g3) ; add(g4) ; add(g5) ;

		add(showgrade) ;	add(revert) ; */

		//
		
		pnl1.add(roll1) ;  pnl1.add(rolltf1) ; 		pnl1.add(name1) ;	pnl1.add(tf11) ;		
		
		pnl1.add(tamil1) ;	pnl1.add(tam1) ;		pnl1.add(english1) ;		pnl1.add(eng1) ;
		
		pnl1.add(maths1) ;	pnl1.add(mat1) ;		pnl1.add(science1) ;		pnl1.add(sci1) ;
		
		pnl1.add(social1) ;	
		
		pnl1.add(soc1) ;	
	
		//pnl1.add(revert1) ;
		
		
		
		/*pnl2.add(  ) ;
		
		pnl2.add(  ) ;

		pnl2.add(  ) ; */
		
		//

		tb.addTab( "Panel 1 ", null , pnl1 , "Input Panel" ) ;

		tb.addTab( "Panel 2 ", null , pnl2 , "Grade Panel" ) ;

		add(tb) ;		tb.setBounds(390,90,400,400) ;

		//

		frmhnd handler = new frmhnd()  ;

		//tf1.addActionListener( handler ) ;
		
		tf11.addActionListener( handler ) ;

		//tam.addActionListener( handler ) ;

		tam1.addActionListener( handler ) ;

		//eng.addActionListener( handler ) ;		
		
		eng1.addActionListener( handler ) ;

		//mat.addActionListener( handler ) ;	

		mat1.addActionListener( handler ) ;

		//sci.addActionListener( handler ) ;		
		
		sci1.addActionListener( handler ) ;

		//soc.addActionListener( handler ) ;	

		soc1.addActionListener( handler ) ;

		showgrade.addActionListener( handler ) ;	//showgrade1.addActionListener( handler ) ;

		revert.addActionListener( handler ) ;
		
		//showgrade2.addActionListener( handler ) ;
	}

	private class frmhnd implements ActionListener
	{
			public void actionPerformed( ActionEvent evnt )
			{
				if( evnt.getSource() == tf1 )
					s[i][0] = tf1.getText() ;
			
				if( evnt.getSource() == tam )
				{
					s[i][1] = tam.getText() ;
					flg1 = 1 ;
				}

				if( evnt.getSource() == eng )
				{
					s[i][2] =  eng.getText() ;
					flg2 = 1 ;
				}
			
				if( evnt.getSource() == mat )
				{
					s[i][3] = mat.getText() ;
					flg3 = 1 ;
				}
				

				if( evnt.getSource() == sci )
				{
					s[i][4] = sci.getText() ;
					flg4 = 1 ;
				}

				if( evnt.getSource() == soc )
				{
					s[i][5] = soc.getText() ;
					flg5 = 1 ;
				}

				if( (evnt.getSource() == showgrade) && (flg1 == 1) && (flg2 == 1) && (flg3 == 1) && (flg4 == 1) && (flg5 == 1) )
				{
					x = Integer.parseInt( s[i][1] ) ;
					setcolor( grade(x),g1 ) ;
					
					x = Integer.parseInt( s[i][2] ) ;
					setcolor( grade(x),g2 ) ;
					
					x = Integer.parseInt( s[i][3] ) ;
					setcolor( grade(x),g3 ) ;
					
					x = Integer.parseInt( s[i][4] ) ;
					setcolor( grade(x),g4 ) ;
					
					x = Integer.parseInt( s[i][5] ) ;
					setcolor( grade(x),g5 ) ;
					
					s[i][6] = rolltf.getText() ;
				}
				
				if( evnt.getSource() == revert )
				{
					tf1.setText("") ;
					tam.setText("") ;
					eng.setText("") ;
					mat.setText("") ;
					sci.setText("") ;
					soc.setText("") ;
					//
					g1.setText("") ;
					g2.setText("") ;
					g3.setText("") ;
					g4.setText("") ;
					g5.setText("") ;
					
					if( flg1 == 1 && flg2 == 1 && flg3 == 1  && flg4 == 1 && flg5 == 1 )
					{
						i++ ;
						flg1 = flg2 = flg3 = flg4 = flg5 = 0 ;
						rolltf.setText("" + (rollno + i) ) ;
					}
				}
			}

			public void setcolor(int z,JLabel g)
			{
				if( z == 1 )
				{
					g.setForeground( Color.GREEN ) ;
					g.setText( "O Grade" ) ;
				}
				else if( z == 2 )
				{
					g.setForeground( Color.BLUE ) ;
					g.setText("A Grade") ;
				}
				else if( z == 3 )
				{
					g.setForeground(new java.awt.Color(255,20,147) ) ;
					g.setText("B Grade") ;
				}
				else if( z == 4 )
				{
					g.setForeground( new java.awt.Color(51,0,0) ) ;
					g.setText("C Grade") ;
				}
				else
				{
					g.setForeground( Color.RED ) ;
					g.setText("RA") ;
				}
			}	
	}

	public static int grade(int x)
	{
		int y = 0 ;
		
		if( (x >= 90) && (x <= 100) )
			y = 1 ;
		
		else if( x >= 80 )
			y = 2 ;
		
		else if( x >= 70 )
			y = 3 ;
		
		else if( x >= 60 )
			y = 4 ;
		 
		else
			y = 5 ;
		
		return(y) ;
	}
}

class studetail
{
	public static void main( String args[] )	
	{
		details d = new details() ;
		
		d.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE ) ;
		
		d.setSize(425,450) ;
		
		d.setVisible(true) ;
	}
}

