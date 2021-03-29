import java.awt.* ;

import java.awt.event.* ;

import javax.swing.* ;

class details extends JFrame
{
	private String[][] s = new String[10][10] ;
	
	private String s1 = "" ;
	
	private int num = 0 ;
	
	
	public JTabbedPane tb = new JTabbedPane() ;
	
	public JPanel pnl1 = new JPanel() ;
	
	public JPanel pnl2 = new JPanel() ;
	

	
	private JLabel name , roll , tamil , english , maths , science , social , name1 ,tam1 , eng1 , mat1 , sci1 , soc1 , tot1 , g1 , g2 , g3 , g4 , g5 , total ;
	private JTextField tf1 , tam , eng , mat , sci , soc , rolltf , gradetf , tot ;
	
	
	private JButton revert , showgrade , begin , submit ;
	
	
	private int i = 0 , x = 0 , flg = 0 , flg1 = 0 , flg2 = 0 , flg3 = 0 , flg4 = 0 , flg5 = 0 , rollno = 101 , gflg = 0 , z = 0 , gflg1 = 0  ;
	
	
	public details()
	{
		super("Student-Grade") ;
		
		setLayout( null ) ;
		
		pnl1.setLayout( null ) ;
		
		pnl2.setLayout( null ) ;
		
		pnl1.setBackground( Color.YELLOW ) ;
		
		pnl2.setBackground( Color.WHITE ) ;
		
		
		
		gradetf = new JTextField(20) ;
		gradetf.setBounds(90,20,110,20) ;
		
		roll = new JLabel("Roll") ;			roll.setBounds(30,3,120,50) ;
		rolltf = new JTextField( 20 ) ;		rolltf.setBounds(100,20,80,20) ;

		rolltf.setText("" + rollno ) ;
		rolltf.setEditable( false ) ;
		
		
		name = new JLabel("Name ") ;	  		    name.setBounds(30,38,120,50) ;
		
		tf1 = new JTextField(20) ;					tf1.setBounds(100,55,80,20) ;

		
		tamil = new JLabel("Tamil marks ") ;		tamil.setBounds(10,80,120,50) ;

		tam = new JTextField(2) ;	 				tam.setBounds(100,97,80,20) ;
		
		
		english = new JLabel("English marks ") ;	  english.setBounds(10,125,120,50) ;
		
		eng = new JTextField(2) ;	 				  eng.setBounds(100,142,80,20) ;
		
		
		maths = new JLabel("Maths marks ") ;		maths.setBounds(10,170,120,50) ;

		mat = new JTextField(2) ;            		mat.setBounds(100,187,80,20) ;	
		
		
		science = new JLabel("Science marks ") ;	science.setBounds(10,215,120,50) ;
		
		sci = new JTextField(2) ;	 				sci.setBounds(100,232,80,20) ;
		
		
		social = new JLabel("Social marks ") ;		social.setBounds(10,260,120,50) ;
		
		soc = new JTextField(2) ;	 				soc.setBounds(100,277,80,20) ;
		
		
		total  = new JLabel("Total ") ;				total.setBounds(30,305,120,50) ;
		
		tot = new JTextField(2) ;					tot.setBounds(100,322,80,20) ;
		
		tot.setEditable( false ) ;
		
		
		
		name1 = new JLabel("") ;	    name1.setBounds(90,50,200,50) ;
		
		tam1 = new JLabel("") ; 		tam1.setBounds(90,90,120,50) ;
		
		eng1 = new JLabel("") ;			eng1.setBounds(90,130,120,50) ;

		mat1 = new JLabel("") ; 		mat1.setBounds(90,170,120,50) ;
		
		sci1 = new JLabel("") ;			sci1.setBounds(90,210,120,50) ;
		
		soc1 = new JLabel("") ;			soc1.setBounds(90,250,120,50) ;
		
		tot1 = new JLabel("") ;			tot1.setBounds(90,290,120,50) ;
		
		
		g1 = new JLabel("") ;				g1.setBounds(230,90,100,50)  ;
		
		g2 = new JLabel("") ;				g2.setBounds(230,130,100,50) ;
		
		g3 = new JLabel("") ;				g3.setBounds(230,170,100,50) ;
		
		g4 = new JLabel("") ;				g4.setBounds(230,210,100,50) ;
		
		g5 = new JLabel("") ;				g5.setBounds(230,250,100,50) ;
		
		
		
		revert = new JButton(" Revert <-- ") ;		revert.setBounds(200,357,100,20) ;
		
		begin = new JButton("Begin") ;				begin.setBounds(160,150,80,25) ;
		
		showgrade = new JButton("ShowGrade") ;		showgrade.setBounds(220,20,110,20) ;

		submit = new JButton("Submit") ;			submit.setBounds(80,357,80,20) ;
		
		showgrade.setVisible(false) ;		gradetf.setVisible( false ) ;		
		
		name1.setVisible(false) ;			tam1.setVisible(false) ;

		eng1.setVisible(false) ; 			mat1.setVisible(false) ;	

		sci1.setVisible(false) ;			soc1.setVisible(false) ; 		

		tot1.setVisible(false) ;
		
		
		pnl1.add(roll) ;    pnl1.add(rolltf) ; 		pnl1.add(name) ;	    pnl1.add(tf1) ;		
		
		pnl1.add(tamil) ;	pnl1.add(tam) ;		    pnl1.add(english) ;		pnl1.add(eng) ;
		
		pnl1.add(maths) ;	pnl1.add(mat) ;		    pnl1.add(science) ;		pnl1.add(sci) ;
		
		pnl1.add(social) ;	pnl1.add(tot) ;		    pnl1.add(total) ;
		
		pnl1.add(soc) ;	
	
		pnl1.add(submit) ;  pnl1.add(revert) ;
		
		
		
		pnl2.add(begin) ;		pnl2.add(gradetf) ;		pnl2.add(showgrade) ;
		
		pnl2.add(name1) ;	
		
		pnl2.add(tam1) ;	pnl2.add(eng1) ;	pnl2.add(mat1) ;	pnl2.add(sci1) ;	pnl2.add(soc1) ;
		
		pnl2.add(tot1) ;
		
		pnl2.add(g1) ;	pnl2.add(g2) ;	pnl2.add(g3) ;	pnl2.add(g4) ;	pnl2.add(g5) ;

		
		
		tb.addTab("Input Panel",null,pnl1,"panel 1 ") ;
		
		tb.addTab("Grade Panel",null,pnl2,"panel 2 ") ;
		
		add(tb) ;
		
		

		tb.setBounds(0,0,425,450) ;
		
		i = 0 ;
		
	
	
		frmhnd handler = new frmhnd() ;

		rolltf.addActionListener( handler ) ;

		tf1.addActionListener( handler ) ;

		tam.addActionListener( handler ) ;

		eng.addActionListener( handler ) ;

		mat.addActionListener( handler ) ;

		sci.addActionListener( handler ) ;

		soc.addActionListener( handler ) ;

		submit.addActionListener( handler ) ;

		revert.addActionListener( handler ) ;

		begin.addActionListener( handler ) ; 

		gradetf.addActionListener( handler ) ;

		showgrade.addActionListener( handler ) ;
	}
	
	private class frmhnd implements ActionListener
	{
		public void actionPerformed(ActionEvent evnt)
		{
				if( evnt.getSource() == tf1 )
				{
					s[i][0] = tf1.getText() ;
					flg = 1 ;
				}

			
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
				
				if( (flg == 1) && (flg1 == 1) && flg2 == 1 && flg3 == 1  && flg4 == 1 && flg5 == 1 )
				{
					tot.setText( "" + ( Integer.parseInt( s[i][1] ) + Integer.parseInt(s[i][2]) + Integer.parseInt(s[i][3]) + Integer.parseInt(s[i][4]) + Integer.parseInt(s[i][5])  ) ) ;
					s[i][7] = tot.getText() ;
				}
				
				if( evnt.getSource() == revert )
				{
					tf1.setText("") ;
					tam.setText("") ;
					eng.setText("") ;
					mat.setText("") ;
					sci.setText("") ;
					soc.setText("") ;
					tot.setText("") ;
					flg = flg1 = flg2 = flg3 = flg4 = flg5 = 0 ;
				}
		
				if( evnt.getSource() == submit )
				{
					if( (flg == 1) && (flg1 == 1) && (flg2 == 1) && (flg3 == 1)  && (flg4 == 1) && (flg5 == 1) )
					{
						flg = flg1 = flg2 = flg3 = flg4 = flg5 = 0 ;

						s[i][6] = rolltf.getText() ;
						i++ ;
						rolltf.setText("" + (rollno + i) ) ;
						tf1.setText("") ;

						tam.setText("") ;
						eng.setText("") ;
						mat.setText("") ;
						sci.setText("") ;
						soc.setText("") ;
						tot.setText("") ;
					}
				}
				
				if( evnt.getSource() == begin )
				{
					begin.setVisible(false) ;		gradetf.setVisible(true) ;
					
					showgrade.setVisible(true) ;	name1.setVisible(true) ;
					
					tam1.setVisible(true) ;			eng1.setVisible(true) ; 
					
					mat1.setVisible(true) ;			sci1.setVisible(true) ; 
					
					soc1.setVisible(true) ;			tot1.setVisible(true) ; 
				}
				
				if( evnt.getSource() == gradetf )
				{
					s1 = gradetf.getText() ;
					showgrade.setText( "ShowGrade" ) ;
				}
				
				if( evnt.getSource() == showgrade )
				{
					if( s1.isEmpty() )
					{
						if( (s[z][0] != null) && (s[z][1] != null) && (s[z][2] != null) && (s[z][3] != null) && (s[z][4] != null) && (s[z][5] != null) )
						{
							showgrade.setText("Next") ;
						
							name1.setText("Name             " + s[z][0] ) ;
						
							tam1.setText("Tamil              " + s[z][1] ) ;

							eng1.setText("English          " + s[z][2] ) ;

							mat1.setText("Maths             " + s[z][3] ) ;

							sci1.setText("Science         " + s[z][4] ) ;

							soc1.setText("Social            " + s[z][5] ) ;

							x = Integer.parseInt( s[z][1] ) ;
								setcolor( grade(x),g1 ) ;

							x = Integer.parseInt( s[z][2] ) ;
								setcolor( grade(x),g2 ) ;

							x = Integer.parseInt( s[z][3] ) ;
								setcolor( grade(x),g3 ) ;

							x = Integer.parseInt( s[z][4] ) ;
								setcolor( grade(x),g4 ) ;

							x = Integer.parseInt( s[z][5] ) ;
								setcolor( grade(x),g5 ) ;

							tot1.setText( "Total            " + s[z][7] ) ;
							
							gflg = 1 ;

							z++ ;
						}
						
						else
							JOptionPane.showMessageDialog(null,"Database empty") ;
					}

					else
					{
							showgrade.setText("ShowGrade") ;
							num = Integer.parseInt( s1 ) ;
							
							for( z = 0 ; z < i ; z++ )
							{
								if( num == Integer.parseInt(s[z][6]) )
								{
									name1.setText("Name             " + s[z][0] ) ;

									tam1.setText("Tamil              " + s[z][1] ) ;

									eng1.setText("English          " + s[z][2] ) ;

									mat1.setText("Maths             " + s[z][3] ) ;

									sci1.setText("Science         " + s[z][4] ) ;

									soc1.setText("Social            " + s[z][5] ) ;

									tot1.setText( "Total            " + s[z][7] ) ;

									x = Integer.parseInt( s[z][1] ) ;
									setcolor( grade(x),g1 ) ;

									x = Integer.parseInt( s[z][2] ) ;
									setcolor( grade(x),g2 ) ;

									x = Integer.parseInt( s[z][3] ) ;
									setcolor( grade(x),g3 ) ;

									x = Integer.parseInt( s[z][4] ) ;
									setcolor( grade(x),g4 ) ;

									x = Integer.parseInt( s[z][5] ) ;
									setcolor( grade(x),g5 ) ;

									gflg1 = 1 ;

									break ;
								}
							}

							if(gflg1 == 0 )
								JOptionPane.showMessageDialog(null,"Not found in our database") ;

							gflg1 = 0 ;
					}
				}
		}

			public void setcolor(int y,JLabel g)
			{
				if( y == 1 )
				{
					g.setForeground( Color.GREEN ) ;
					g.setText( " O Grade" ) ;
				}
				else if( y == 2 )
				{
					g.setForeground( Color.BLUE ) ;
					g.setText("A Grade") ;
				}
				else if( y == 3 )
				{
					g.setForeground(new java.awt.Color(255,20,147) ) ;
					g.setText("B Grade") ;
				}
				else if( y == 4 )
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


class studetail1
{
	public static void main(String args[])
	{
		details d = new details() ;
		
		d.setSize(425,450) ;
		
		d.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE ) ;
		
		d.setVisible(true) ;
	}
}
