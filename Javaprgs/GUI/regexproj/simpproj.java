import java.awt.* ;

import javax.swing.* ;

import java.awt.Color.* ;

import java.awt.event.* ;

import java.awt.Font.* ;

import java.util.regex.* ;

class grammer extends JFrame
{
	private String regexpat = "(.*)(they is|i is|they was|he were|she were|it were|i were|he are|she are|it are|i are|he am|she am|it am|they am)( .*)" ;
	
	private String s = "" ;
	
	private boolean result ;
	
	int gatherflg = 0 ;
	
	private JTextField gatherText , tf1, tf2 , tf3 ;
	
	private JButton he , she , it , they , i ;
	
	private JButton is , was , were , are , am ;
	
	private JButton begin , submit , revert ;
	
	private JButton playing , swimming , sleeping , running , flying , studying , eating , walking , watching , talking ;
	
	private JButton gather ;
	
	public Font f = new Font("ARIAL",Font.BOLD,15) ;
	
	public Font f1 = new Font("ARIAL",Font.BOLD,14) ;
	
	public grammer()
	{
		super("Grammer") ;
		
		setLayout( null ) ;
		
		this.getContentPane().setBackground(Color.WHITE) ;
		
		
		begin = new JButton("Begin") ;
		
		begin.setBounds(220,220,130,40) ;
		
		begin.setFont(f) ;
		
		
		submit = new JButton("Submit") ;
		
		submit.setBounds(200,580,100,25) ;
		
		submit.setVisible(false) ;
		
		submit.setFont(f) ;
		
		
		he = new JButton("He") ;		he.setVisible(false) ;		he.setBounds(90,95,80,30) ;
		
		he.setFont(f1) ;
		
		she = new JButton("She") ;		she.setVisible(false) ;		she.setBounds(90,145,80,30) ;
		
		she.setFont(f1) ;
		
		it = new JButton("It") ;		it.setVisible(false) ;		it.setBounds(90,195,80,30) ;
		
		it.setFont(f1) ;

		they = new JButton("They") ;	they.setVisible(false) ;	they.setBounds(90,245,80,30) ;
		
		they.setFont(f1) ;
		
		i = new JButton("I") ;	i.setVisible(false) ;	i.setBounds(90,295,80,30) ;
		
		i.setFont(f1) ;
		
		
		
		
		is = new JButton("is") ;		is.setVisible(false) ;		is.setBounds(220,95,80,30) ;
		
		is.setFont(f1) ;
		
		was = new JButton("was") ;		was.setVisible(false) ;		was.setBounds(220,145,80,30) ;
		
		was.setFont(f1) ;
		
		are = new JButton("are") ;		are.setVisible(false) ;		are.setBounds(220,195,80,30) ;
		
		are.setFont(f1) ;
		
		were = new JButton("were") ;	were.setVisible(false) ;	were.setBounds(220,245,80,30) ;
		
		were.setFont(f1) ;
		
		am = new JButton("am") ;	am.setVisible(false) ;	am.setBounds(220,295,80,30) ;
		
		am.setFont(f1) ;
		
		
		
		
		playing = new JButton("playing") ;		playing.setVisible(false) ;		playing.setBounds(350,15,110,30) ;
		
		playing.setFont(f1) ;
		
		swimming = new JButton("swimming") ;	swimming.setVisible(false) ;	swimming.setBounds(350,55,110,30) ;
		
		swimming.setFont(f1) ;
		
		sleeping = new JButton("sleeping") ;	sleeping.setVisible(false) ;	sleeping.setBounds(350,95,110,30) ;
		
		sleeping.setFont(f1) ;
		
		running = new JButton("running") ;		running.setVisible(false) ;		running.setBounds(350,135,110,30) ;
		
		running.setFont(f1) ;
		
		flying = new JButton("flying") ;		flying.setVisible(false) ;		flying.setBounds(350,175,110,30) ;
		
		flying.setFont(f1) ;
		
		studying = new JButton("studying") ;	studying.setVisible(false) ;	studying.setBounds(350,215,110,30) ;
		
		studying.setFont(f1) ;
		
		eating = new JButton("eating") ;		eating.setVisible(false) ;		eating.setBounds(350,255,110,30) ;
		
		eating.setFont(f1) ;
		
		walking = new JButton("walking") ;		walking.setVisible(false) ;     walking.setBounds(350,295,110,30) ;
		
		walking.setFont(f1) ;
		
		watching = new JButton("watching") ;	watching.setVisible(false) ;	watching.setBounds(350,335,110,30) ;
		
		watching.setFont(f1) ;
		
		talking = new JButton("talking") ;		talking.setVisible(false) ;		talking.setBounds(350,375,110,30) ;
		
		talking.setFont(f1) ;
		
		
		tf1 = new JTextField(20) ;		tf1.setBounds(40,460,110,25) ;		tf1.setVisible(false) ;
		
		tf1.setFont(f1) ;
		
		tf2 = new JTextField(20) ;		tf2.setBounds(180,460,110,25) ;		tf2.setVisible(false) ;
		
		tf2.setFont(f1) ;
		
		tf3 = new JTextField(20) ;		tf3.setBounds(320,460,110,25) ;		tf3.setVisible(false) ;
		
		tf3.setFont(f1) ;
		
		
		
		gather = new JButton("Gather") ;	gather.setBounds(460,460,100,25) ;	gather.setVisible(false) ;
		
		gather.setFont(f1) ;
		
		gatherText = new JTextField(30) ;	gatherText.setBounds(10,525,560,25) ;	gatherText.setVisible(false) ;
		
		gatherText.setFont(f1) ;
		
		gatherText.setBackground(Color.WHITE) ;		gatherText.setForeground(Color.BLACK) ;
		
		gatherText.setEditable(false) ;
		
		
		revert = new JButton("Revert <-") ;			revert.setFont(f) ;		revert.setBounds(330,580,100,25) ;
		
		revert.setVisible(false) ;
		
		
		
		add(begin) ;	add(he) ;	add(she) ;	add(it)	;	add(they) ;		add(i) ;
		
		add(is) ;	add(was) ;	add(were) ;		add(are) ;	add(am) ;
		
		add(playing) ;		add(swimming) ;		add(sleeping) ;		add(running) ;		add(flying) ;		
		
		add(studying) ;		add(eating) ;		add(walking) ;		add(watching) ;		add(talking) ;
		
		add(tf1) ;		add(tf2) ;		add(tf3) ;	add(gather) ;	add(gatherText) ;	add(submit) ;
		
		add(revert) ;
		
		
		
		frmhnd handler = new frmhnd() ;
		
		begin.addActionListener( handler ) ;
		
		he.addActionListener( handler ) ;	she.addActionListener( handler ) ;
		
		it.addActionListener( handler ) ;	they.addActionListener( handler ) ;		i.addActionListener(handler) ;//
		
		is.addActionListener( handler ) ;	was.addActionListener( handler ) ;
		
		are.addActionListener( handler ) ;	were.addActionListener( handler ) ;		am.addActionListener(handler) ;//
		
		playing.addActionListener( handler ) ;	swimming.addActionListener( handler ) ;	
		
		sleeping.addActionListener( handler ) ;	running.addActionListener( handler ) ;	
		
		flying.addActionListener( handler ) ;	studying.addActionListener( handler ) ;	
		
		eating.addActionListener( handler ) ;	walking.addActionListener( handler ) ;	
		
		watching.addActionListener( handler ) ;	talking.addActionListener( handler ) ;//
		
		gather.addActionListener(handler) ;
		
		submit.addActionListener(handler) ;
		
		revert.addActionListener(handler) ;
	}
	
	private class frmhnd implements ActionListener
	{
		public void actionPerformed(ActionEvent evnt)
		{
			if( evnt.getSource() == begin )
			{
				begin.setVisible(false) ;
				
				he.setVisible(true) ;			she.setVisible(true) ;
				
				it.setVisible(true) ;			they.setVisible(true) ;		i.setVisible(true) ;//
				
				is.setVisible(true) ;			was.setVisible(true) ;
				
				are.setVisible(true) ;			were.setVisible(true) ;		am.setVisible(true);//
				
				playing.setVisible(true) ;		swimming.setVisible(true) ;	
				
				sleeping.setVisible(true) ;		running.setVisible(true) ;
				
				flying.setVisible(true) ;		studying.setVisible(true) ;	
				
				eating.setVisible(true) ;		walking.setVisible(true) ;		
				
				watching.setVisible(true) ;		talking.setVisible(true) ;	//

				tf1.setVisible(true) ;			tf2.setVisible(true) ;		tf3.setVisible(true) ;	
				
				gather.setVisible(true) ;		gatherText.setVisible(true) ;
				
				submit.setVisible(true) ;		revert.setVisible(true) ;
			}
			
			if( (evnt.getSource() == he) || (evnt.getSource() == she) || (evnt.getSource() == it) || (evnt.getSource() == they) || (evnt.getSource() == i) )
			{
				gatherText.setBackground(Color.WHITE) ;
				gatherText.setForeground(Color.BLACK) ;
				gatherText.setText("") ;
				tf1.setText( evnt.getActionCommand() ) ;
			}
			
			if( (evnt.getSource() == is) || (evnt.getSource() == was) || (evnt.getSource() == are) || (evnt.getSource() == were) || (evnt.getSource() == am) )
			{
				gatherText.setBackground(Color.WHITE) ;
				gatherText.setForeground(Color.BLACK) ;
				gatherText.setText("") ;
				tf2.setText( evnt.getActionCommand() ) ;
			}
				
			
			if( (evnt.getSource() == playing) || (evnt.getSource() == swimming) || (evnt.getSource() == sleeping) || (evnt.getSource() == running) || (evnt.getSource() == flying) )
			{
				gatherText.setBackground(Color.WHITE) ;
				gatherText.setForeground(Color.BLACK) ;
				gatherText.setText("") ;
				tf3.setText( evnt.getActionCommand() ) ;
			}
			
			else if( (evnt.getSource() == studying) || (evnt.getSource() == eating) || (evnt.getSource() == walking) || (evnt.getSource() == watching) || (evnt.getSource() == talking) )
			{
				gatherText.setBackground(Color.WHITE) ;
				gatherText.setForeground(Color.BLACK) ;
				gatherText.setText("") ;
				tf3.setText( evnt.getActionCommand() ) ;
			}
			
			if( evnt.getSource() == gather )
			{
				String s1 = tf1.getText() ;
				String s2 = tf2.getText() ;
				String s3 = tf3.getText() ;
				
				if( (!s1.isEmpty()) && (!s2.isEmpty()) && (!s3.isEmpty()) )
				{
					gatherText.setText( "                                                        " + tf1.getText() + " " + tf2.getText() + " " + tf3.getText() + "." ) ;
					s = tf1.getText() + " " + tf2.getText() + " " + tf3.getText() ;
					gatherflg = 1 ;
					s1 = s2 = s3 = "" ;
				}
			}

			if( evnt.getSource() == submit )
			{
				String s1 = tf1.getText() ;
				String s2 = tf2.getText() ;
				String s3 = tf3.getText() ;
				
				if( (!s1.isEmpty()) && (!s2.isEmpty()) && (!s3.isEmpty()) && (gatherflg == 1) )
				{
					Pattern p = Pattern.compile(regexpat,Pattern.CASE_INSENSITIVE) ;

					Matcher m = p.matcher(s) ;

					result = m.matches() ;

					if(result)
					{
						gatherText.setBackground(Color.RED) ;
						gatherText.setForeground(Color.WHITE) ;
					}
  
					else
					{					
						gatherText.setBackground(Color.GREEN) ;
						gatherText.setForeground(Color.BLACK) ;
					}
					s = "" ;	gatherflg = 0 ;		s1 = s2 = s3 = "" ;
				}
				
			}
			
			if(evnt.getSource() == revert )
			{
				tf1.setText("") ;
				tf2.setText("") ;
				tf3.setText("") ;
				gatherText.setText("") ;
				gatherText.setBackground(Color.WHITE) ;
			}
		}
	}
}

class simpproj
{
	public static void main(String args[])	
	{
		grammer g = new grammer() ;
		
		g.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE ) ;
		
		g.setSize(600,650) ;
		
		g.setVisible( true ) ;
	}
}