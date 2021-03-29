import java.io.* ;
import java.awt.* ;
import java.awt.event.* ;
import javax.swing.* ;
import java.awt.Color.* ;
import java.awt.Font.* ;
import java.sql.* ;

class guidb extends JFrame
{
	JSQL obj = new JSQL() ;

	private String s1 = "" , s = "" ;

	private String[] str = new String[8] ;

	private JLabel name , roll , tamil , english , maths , science , social , total; //, result ;
	private JLabel roll1 , name1 , tam1, eng1 , mat1 , sci1 , soc1 , tot1 , g1 , g2 , g3 , g4 , g5 ;
	private JTextField tf1 , tam , eng , mat , sci , soc , rolltf , tot , gradetf ;
	private JButton revert , showgrade , submit ;

	public JTabbedPane tb = new JTabbedPane() ;
	public JPanel pnl1 = new JPanel() ;
	public JPanel pnl2 = new JPanel() ;

	public Font f = new Font("Arial",Font.BOLD,14) ;

	public int droll = 0 , dm1 = 0 , dm2 = 0 , dm3 = 0 , dm4 = 0 , dm5 = 0 , dtot = 0 , x = 0;
	public String dname = "" ;

	private int rollno = 0 , flg = 0 , flg1 = 0 , flg2 = 0 , flg3 = 0 , flg4 = 0 , flg5 = 0 , rollflg = 0 , gflg = 0 ;

	public guidb()
	{
		super("student-DB") ;

		setLayout(null) ;
		pnl1.setLayout(null) ;
		pnl2.setLayout(null) ;
		
		try
		{
			rollno += obj.rollret()+100 ;
		}
		catch(Exception e)
		{
			System.err.println( e.getClass().getName() + "-" + e.getMessage() ) ;
		}

		pnl1.setBackground(Color.YELLOW) ;
		pnl2.setBackground(Color.WHITE) ;

		gradetf = new JTextField(20) ;
		gradetf.setBounds(90,20,110,20) ;
		showgrade = new JButton("ShowGrade") ;
		showgrade.setBounds(220,20,130,20) ;
		showgrade.setFont(f) ;

		roll = new JLabel("Roll") ;
		roll.setFont(f) ;
		roll.setBounds(30,3,120,50) ;
		rolltf = new JTextField( 20 ) ;				
		rolltf.setBounds(130,20,80,20) ;
		rolltf.setText("" + rollno ) ;
		//rolltf.setFont(f) ;
		rolltf.setEditable(false) ;

		name = new JLabel("Name") ;
		name.setFont(f) ;
		name.setBounds(27,38,120,50) ;
		tf1 = new JTextField(20) ;
		tf1.setBounds(130,55,80,20) ;

		tamil = new JLabel("Tamil marks ") ;
		tamil.setFont(f) ;
		tamil.setBounds(10,80,120,50) ;
		tam = new JTextField(2) ;	 				
		tam.setBounds(130,97,80,20) ;

		english = new JLabel("English marks ") ;	
		english.setFont(f) ;
		english.setBounds(10,125,120,50) ;
		eng = new JTextField(2) ;	 			   
		eng.setBounds(130,142,80,20) ;

		maths = new JLabel("Maths marks ") ;
		maths.setFont(f) ;
		maths.setBounds(10,170,120,50) ;
		mat = new JTextField(2) ;            		
		mat.setBounds(130,187,80,20) ;	

		science = new JLabel("Science marks ") ;
		science.setFont(f) ;
		science.setBounds(10,215,120,50) ;
		sci = new JTextField(2) ;	 				
		sci.setBounds(130,232,80,20) ;

		social = new JLabel("Social marks ") ;
		social.setFont(f) ;
		social.setBounds(10,260,120,50) ;
		soc = new JTextField(2) ;	 				
		soc.setBounds(130,277,80,20) ;

		total  = new JLabel("Total ") ;
		total.setFont(f) ;
		total.setBounds(30,305,120,50) ;
		tot = new JTextField(2) ;					
		tot.setBounds(130,322,80,20) ;
		tot.setEditable( false ) ;

		submit = new JButton("Submit") ;			submit.setBounds(60,367,130,20) ;
		submit.setFont(f) ;
		revert = new JButton(" Revert <-- ") ;		revert.setBounds(200,367,130,20) ;
		revert.setFont(f) ;
		//show = new JButton("Display") ;				show.setBounds(160,150,80,25) ;

		/*biglb = new JLabel("Roll       Name                      Tam      Eng      Mat      Sci      Soc      Tot") ;
		biglb.setBounds(10,40,400,60) ;*/
		
		/*result = new JLabel("") ;
		result.setBounds(10,80,400,60) ;*/
		roll1 = new JLabel("") ;	    roll1.setBounds(90,50,200,50) ;
		name1 = new JLabel("") ;	    name1.setBounds(90,90,200,50) ;
		tam1 = new JLabel("") ; 		tam1.setBounds(90,130,200,50) ;
		eng1 = new JLabel("") ;			eng1.setBounds(90,170,200,50) ;
		mat1 = new JLabel("") ; 		mat1.setBounds(90,210,200,50) ;
		sci1 = new JLabel("") ;			sci1.setBounds(90,250,200,50) ;
		soc1 = new JLabel("") ;			soc1.setBounds(90,290,200,50) ;
		tot1 = new JLabel("") ;			tot1.setBounds(90,330,200,50) ;

		g1 = new JLabel("") ;				g1.setBounds(240,130,100,50)  ;
		g1.setFont(f) ;
		g2 = new JLabel("") ;				g2.setBounds(240,170,100,50) ;
		g2.setFont(f) ;
		g3 = new JLabel("") ;				g3.setBounds(240,210,100,50) ;
		g3.setFont(f) ;
		g4 = new JLabel("") ;				g4.setBounds(240,250,100,50) ;
		g4.setFont(f) ;
		g5 = new JLabel("") ;				g5.setBounds(240,290,100,50) ;
		g5.setFont(f) ;

		pnl1.add(roll) ;  	    pnl1.add(rolltf) ; 		pnl1.add(name) ;	    pnl1.add(tf1) ;		
		pnl1.add(tamil) ;		pnl1.add(tam) ;		    pnl1.add(english) ;		pnl1.add(eng) ;
		pnl1.add(maths) ;		pnl1.add(mat) ;		    pnl1.add(science) ;		pnl1.add(sci) ;
		pnl1.add(social) ;		pnl1.add(tot) ;		    pnl1.add(total) ;
		pnl1.add(soc) ;
		pnl1.add(submit) ; 	    pnl1.add(revert) ;

		pnl2.add(roll1) ; 		pnl2.add(name1) ;		pnl2.add(tam1) ;		pnl2.add(eng1) ;	pnl2.add(mat1) ;
		pnl2.add(sci1) ;		pnl2.add(soc1) ;		pnl2.add(tot1) ;	pnl2.add(g1) ;
		pnl2.add(g2) ;			pnl2.add(g3) ;			pnl2.add(g4) ;		pnl2.add(g5) ;
		pnl2.add(gradetf) ; 	pnl2.add(showgrade) ;	//pnl2.add(biglb) ;
		//pnl2.add(result) ;

		tb.addTab("Input panel",null,pnl1,"panel 1") ;
		tb.addTab("Display panel",null,pnl2,"panel 2") ;

		tb.setBounds(0,0,415,435) ;
		add(tb) ;

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
		gradetf.addActionListener( handler ) ;
		showgrade.addActionListener( handler ) ;
	}

	private class frmhnd implements ActionListener	
	{
		public void actionPerformed(ActionEvent evnt)
		{
			if(evnt.getSource() == rolltf )	
			{
				try
				{
					droll = Integer.parseInt(evnt.getActionCommand()) ;
					rollflg = 1 ;
				}
				catch(Exception e)
				{
					rolltf.setText("") ;
				}
			}
			if( evnt.getSource() == tf1 )	
			{
				dname = evnt.getActionCommand() ;
				flg = 1 ;
			}
			if( evnt.getSource() == tam )	
			{
				try
				{
					dm1 = Integer.parseInt(evnt.getActionCommand()) ;
					flg1 = 1 ;
				}
				catch(Exception e)
				{
					tam.setText("") ;
				}
			}
			if( evnt.getSource() == eng )
			{
				try
				{
					dm2 = Integer.parseInt(evnt.getActionCommand()) ;
					flg2 = 1 ;
				}
				catch(Exception e)
				{
					eng.setText("") ;
				}

			}		
			if( evnt.getSource() == mat )
			{
				try
				{
					dm3 = Integer.parseInt(evnt.getActionCommand()) ;
					flg3 = 1 ;
				}
				catch(Exception e)
				{
					mat.setText("") ;
				}
			}
			if( evnt.getSource() == sci )
			{
				try
				{
					dm4 = Integer.parseInt(evnt.getActionCommand()) ;
					flg4 = 1 ;
				}
				catch(Exception e)
				{
					sci.setText("") ;
				}
			}
			if( evnt.getSource() == soc )
			{
				try
				{
					dm5 = Integer.parseInt(evnt.getActionCommand()) ;
					flg5 = 1 ;
				}
				catch(Exception e)
				{
					soc.setText("") ;
				}
			}		
			if( (flg == 1) && (flg1 == 1) && (flg2 == 1) && (flg3 == 1)  && (flg4 == 1) && (flg5 == 1) )
			{
				tot.setText( "" + (dm1+dm2+dm3+dm4+dm5) )  ;
				dtot = Integer.parseInt(tot.getText()) ;
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
			if(evnt.getSource() == submit)
			{
				if( (flg == 1) && (flg1 == 1) && (flg2 == 1) && (flg3 == 1)  && (flg4 == 1) && (flg5 == 1) )
				{
						flg = flg1 = flg2 = flg3 = flg4 = flg5 = rollflg = 0 ;						
						droll = Integer.parseInt(rolltf.getText()) ;
						try
						{
							obj.data(droll,dname,dm1,dm2,dm3,dm4,dm5,dtot) ;	

							rollno++ ;
							rolltf.setText( "" + (rollno) ) ;
							tf1.setText("") ;
							tam.setText("") ;
							eng.setText("") ;
							mat.setText("") ;
							sci.setText("") ;
							soc.setText("") ;
							tot.setText("") ;

							dname = "" ;
							dm1 = dm2 = dm3 = dm4 = dm5 = dtot = droll = 0 ;
						}
						catch(Exception e)
						{
							System.err.println(e.getClass().getName() + " - " + e.getMessage() ) ;
							JOptionPane.showMessageDialog(null,"Roll Number is already present") ;
						}
				}
			}
			if(evnt.getSource() == gradetf )
			{
				try
				{
					int num = Integer.parseInt( evnt.getActionCommand() ) ;
					s = obj.resultret(num) ;
					gflg = 1 ;
				}
				catch(Exception e)
				{
					JOptionPane.showMessageDialog(null,"Invalid") ;
					gflg = 0 ;
				}
			}
			if(evnt.getSource() == showgrade )
			{
				if(gflg == 1)
				{
					/*result.setFont(f) ;
					result.setText("" + s) ;
					result.setForeground(Color.BLUE) ;*/
					str = s.split("_") ;
					roll1.setText("Roll                 " + str[0]) ;	roll1.setFont(f) ;
					name1.setText("Name             "+ str[1]);			name1.setFont(f) ;
					tam1.setText("Tamil               " + str[2]) ;		tam1.setFont(f) ;
					eng1.setText("English            " + str[3]) ;		eng1.setFont(f) ;
					mat1.setText("Maths               " + str[4]) ;		mat1.setFont(f) ;
					sci1.setText("Science           " + str[5]) ;		sci1.setFont(f) ;
					soc1.setText("Social               " + str[6]) ;	soc1.setFont(f) ;
					tot1.setText("Total               " + str[7]) ;		tot1.setFont(f) ;
					
					x = Integer.parseInt( str[2] ) ;
					setcolor( grade(x),g1 ) ;

					x = Integer.parseInt( str[3] ) ;
					setcolor( grade(x),g2 ) ;

					x = Integer.parseInt( str[4] ) ;
	     			setcolor( grade(x),g3 ) ;

					x = Integer.parseInt( str[5] ) ;
					setcolor( grade(x),g4 ) ;

					x = Integer.parseInt( str[6] ) ;
     				setcolor( grade(x),g5 ) ;
					
					s = "" ;	gflg = 0 ;
				}
			}
		}
			public void setcolor(int y,JLabel g)
			{
				if( y == 1 )
				{
					g.setForeground( Color.GREEN ) ;
					g.setText( "O Grade" ) ;
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
