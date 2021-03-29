import java.io.* ;
import java.awt.* ;
import java.awt.event.* ;
import javax.swing.* ;
import java.awt.Color.* ;
import java.sql.* ;
import java.util.regex.* ;

class dbGUI extends JFrame
{
	SQLclass obj = new SQLclass() ;

	private String[] s1 = {"PNo"} ;
	private String[] s2 = new String[10] ;

	public JTextArea ta = new JTextArea() ;
	public JScrollPane sp = new JScrollPane(ta) ;
	public JTabbedPane tb = new JTabbedPane() ;

	public JPanel pnl1 , pnl2 , pnl3 , pnl4 ;

	public Font f = new Font("Arial",Font.BOLD,15) ;
	public Font taf = new Font("courier new",Font.BOLD,15) ;
	public Font ff = new Font("Arial",Font.BOLD,17) ;

	private JLabel goodslb ;
	private JTextField p1 , p2 , p3 , p4 ;
	private JButton submit ;

	private int prdno = 0 , totprd = 0 , rpp = 0 ;
	private String prdname = "" , sx = "\n    PNo               PNAME               TOTPRD               RPP\n\n" , x = "" ;
	private int p1flg = 0 , p2flg = 0 , p3flg = 0 , p4flg = 0 ;

	private JLabel cusname , billno , tc , date;
	private JTextField cusnametf , billnotf , totproduct , tctf , datetf ;
	private JButton b1 , nextbill ;
	private JComboBox<String> pno = new JComboBox<>(s1) ;
	private int cnt = 0 ;

	public JTextArea ta2 = new JTextArea() ;
	public JScrollPane sp2 = new JScrollPane(ta2) ;

	private String customer = "" ,m = "" , s = "" ;
	private int tp = 0 , pr = 0 , bn = 0 , fintotal = 0 ;
	private int uflg = 0 , cflg = 0 , bill = 0, tpflg = 0 , pflg = 0 , flg = 0 , bflg = 0 ;

	private String regexpat = "^(([1-9])|([1-3][1-9]))([-])(([1-9])|([1][0-2]))([-])([2][0][2][0-9])$" ,dateinput = "" ;
	int dflg = 0 ;
	float no = 0.01f ;
	int totalcost = 0 ;

	private JLabel prname , plb;
	private JTextField getname , pradd ;
	private JButton enter,add ;
	private JTextArea ta3 = new JTextArea() ;

	private int si3 = 0 ;
	private int getnewpr = 0 ;
	private int gflg = 0 , prflg = 0 , eflg = 0 , aflg = 0 ;
	private String tx = "" ;
	private String[] s3 = new String[3] ;
	
	private JLabel datelb ;
	private JTextField datetf4 ;
	private JButton show ;
	private JTextArea ta4 = new JTextArea() ;
	private JScrollPane sp4 = new JScrollPane(ta4) ;
	private String disstr = "" , getdate = "" ;
	private int dateflg = 0 ;

	public dbGUI()
	{
		super("Shop Database") ;

		this.getContentPane().setBackground(Color.WHITE) ;
		try
		{
			/*obj.display() ;
			obj.goodsdisplay() ; */
			bn = obj.BillNoReturn() ;
			no = obj.noReturn() ;
			obj.DailyCollectDisplay() ;
			System.out.println("No : " +no ) ;
		}
		catch(Exception e )
		{
			bn = 001 ;
			no = 0.01f ;
			System.err.println( "BILL NO" + e.getClass().getName() + "-" + e.getMessage() ) ;
		}

		pnl1 = new JPanel() ;
		pnl2 = new JPanel() ;
		pnl3 = new JPanel() ;
		pnl4 = new JPanel() ;

		pnl1.setLayout(null) ;
		pnl2.setLayout(null) ;
		pnl3.setLayout(null) ;
		pnl4.setLayout(null) ;

		pnl1.setBackground( Color.ORANGE ) ; 
		pnl2.setBackground( Color.ORANGE ) ;
		pnl3.setBackground( Color.ORANGE ) ;
		pnl4.setBackground( Color.ORANGE ) ;

		sp.setSize(300,300) ;
		sp.setBounds(170,220,600,300) ;
		ta.setFont(taf) ;
		ta.setText(sx) ;
		ta.setEditable(false) ;

		goodslb = new JLabel("Product no             Product Name             Total product               RPP") ;
		goodslb.setBounds(200,10,500,100) ;
		goodslb.setFont(f) ;
		goodslb.setForeground(Color.BLACK) ;

		p1 = new JTextField(10) ;	p1.setBounds(216,100,60,30) ;
		p1.setFont(f) ;
		p2 = new JTextField(10) ;	p2.setBounds(335,100,110,30) ;
		p2.setFont(f) ;
		p3 = new JTextField(10) ;	p3.setBounds(514,100,60,30) ;
		p3.setFont(f) ;
		p4 = new JTextField(10) ;	p4.setBounds(640,100,60,30) ;
		p4.setFont(f) ;

		submit = new JButton("Submit") ;
		submit.setFont(f) ;
		submit.setBounds(430,170,90,30) ;
		//submit.setBackground(Color.GREEN) ;

		//

		cusname = new JLabel("Customer Name  : ") ;		
		cusname.setBounds(200,40,180,30) ;
		cusname.setFont(f) ;

		cusnametf = new JTextField(20) ;
		cusnametf.setBounds(360,40,140,30) ;

		billno = new JLabel("Bill No  : ") ;
		billno.setBounds(230,100,180,30) ;
		billno.setFont(f) ;

		billnotf = new JTextField(20) ;
		billnotf.setBounds(360,100,80,30) ;
		billnotf.setText( "00"+Integer.toString(bn) ) ;
		billnotf.setFont(f) ;
		billnotf.setBackground(Color.WHITE) ;
		billnotf.setEditable(false) ;

		date = new JLabel("Date :") ;
		date.setBounds(760,35,180,30) ;
		date.setFont(f) ;
		datetf = new JTextField(20) ;

		datetf.setBounds(810,35,90,30) ;
		datetf.setFont(f) ;
		ListUpdate() ;

		pno.setBounds(320,190,60,30) ;
		pno.setBackground(Color.CYAN) ;
		pno.setForeground(Color.BLACK) ;
		totproduct = new JTextField(20) ;	totproduct.setBounds(430,190,60,30) ;
		totproduct.setFont(f) ;
		b1 = new JButton("Add") ;
		b1.setBackground(Color.GREEN) ;
		b1.setBounds(560,190,60,30) ;

		sp2.setSize(300,300) ;
		sp2.setBounds(130,250,600,250) ;
		ta2.setFont(taf) ;
		ta2.setText("\n     PNo       PNAME       TOTPRD       RPP       COST\n") ;
		s = "\n     PNo       PNAME       TOTPRD       RPP       COST\n\n" ;
		ta2.setEditable(false) ;

		tc = new JLabel("Total Cost : ") ;	//tc.setBounds(520,515,180,30) ;
		tc.setBounds(730,515,180,30) ;
		tc.setFont(f) ;
		tctf = new JTextField(20) ;			//tctf.setBounds(650,515,70,30) ;
		tctf.setBounds(830,515,70,30) ;
		tctf.setBackground(Color.WHITE) ;
		tctf.setFont(f) ;
		tctf.setEditable(false) ;

		nextbill = new JButton("next bill") ;
		nextbill.setBounds(20,515,100,30) ;
		nextbill.setFont(f) ;
		
		ta3.setBounds(220,190,440,150) ;
		ta3.setEditable(false) ;
		ta3.setBackground( Color.WHITE ) ;
		ta3.setFont(f) ;

		prname = new JLabel("Product Number : ") ;		
		prname.setFont(f) ;
		prname.setBounds(270,100,140,30) ;
 		getname = new JTextField(20) ;
		getname.setBounds(420,100,80,30) ;
		enter = new JButton("Enter") ;
		enter.setBounds(530,100,80,30) ;
		plb = new JLabel("") ;
		plb.setBounds(380,395,90,30) ;
		plb.setFont(f) ;
		pradd = new JTextField(20) ;
		pradd.setBounds(430,395,60,30) ;
		pradd.setFont(f) ;
		add = new JButton("add") ;
		add.setBounds(500,395,80,30) ;
		add.setFont(f) ;

		datelb = new JLabel("Enter Date : ") ;
		datelb.setBounds(300,100,140,30) ;
		datelb.setFont(f) ;
		datetf4 = new JTextField(20) ;
		datetf4.setBounds(420,100,80,30) ;
		show = new JButton("Show") ;
		show.setBounds(530,100,80,30) ;
		sp4.setSize(300,300) ;
		sp4.setBounds(220,190,500,260) ;
		ta4.setEditable(false) ;
		ta4.setFont(taf) ;

		pnl1.add(goodslb) ;
		pnl1.add(p1) ;	pnl1.add(p2) ;	pnl1.add(p3) ;	pnl1.add(p4) ;
		pnl1.add(submit) ;
		pnl1.add(sp) ;

		pnl2.add(pno) ;
		pnl2.add(b1) ;			pnl2.add(cusname) ;	pnl2.add(cusnametf) ;	pnl2.add(billno) ;
		pnl2.add(billnotf) ;	pnl2.add(date) ; 	pnl2.add(datetf) ;
		pnl2.add(totproduct) ;	pnl2.add(sp2) ;		pnl2.add(tc) ;		pnl2.add(tctf) ;
		pnl2.add(nextbill) ;

		pnl3.add(prname) ;		pnl3.add(getname) ;			pnl3.add(enter) ;	
		pnl3.add(ta3) ;			pnl3.add(add) ;				pnl3.add(pradd) ;
		pnl3.add(plb) ;

		pnl4.add(datelb) ;		pnl4.add(datetf4) ;		pnl4.add(show) ;
		pnl4.add(sp4) ;

		tb.addTab("Stock Entry",null,pnl1,"Stock") ;
		tb.addTab("Billing",null,pnl2,"Bill") ;
		tb.addTab("Stock adder",null,pnl3,"Stock adder") ;
		tb.addTab("Display Panel",null,pnl4,"Display") ;

		tb.setBounds(0,0,650,550) ;
		add(tb) ;

		/*try{
			obj.DeleteData(136) ;
		}
		catch(Exception e){
			System.err.println( e.getClass().getName() + " - " + e.getMessage() ) ;
		}*/

		frmhnd handler = new frmhnd() ;
		p1.addActionListener(handler) ;
		p2.addActionListener(handler) ;
		p3.addActionListener(handler) ;
		p4.addActionListener(handler) ;
		submit.addActionListener(handler) ;
		cusnametf.addActionListener(handler) ;
		totproduct.addActionListener(handler) ;
		b1.addActionListener(handler) ;
		pno.addActionListener(handler) ;
		nextbill.addActionListener(handler) ;
		datetf.addActionListener(handler) ;
		getname.addActionListener(handler) ;
		enter.addActionListener(handler) ;
		pradd.addActionListener(handler) ;
		add.addActionListener(handler) ;
		datetf4.addActionListener(handler) ;
		show.addActionListener(handler) ;
	}

	public void ListUpdate()
	{
		int cnt = 0 , checkflg = 0;
		String z = "" ;

		while(true)
		{
			try
			{
				z = obj.ReturnProductNo(cnt) ;

				if( z.equals("") )
				{
					cnt = 0 ;
					uflg = 1 ;
					break ;
				}
				else
				{
					pno.addItem(z) ;
					cnt++ ;
				}
			}
			catch(Exception e)
			{
				cnt = 0 ;
				System.err.println( "ERROR : " + e.getClass().getName() + " - " + e.getMessage() ) ;							uflg = 1 ;
				break ;
			}
		}
	}

	private class frmhnd implements ActionListener
	{
		public void actionPerformed(ActionEvent evnt)
		{
			if( evnt.getSource() == p1 )
			{
				try
				{
					prdno = Integer.parseInt( evnt.getActionCommand() ) ;
					if( obj.CheckPno(prdno) == 1 )
					{
						p1flg = 0 ;
						JOptionPane.showMessageDialog(null,""+prdno+" Already Exists") ;
						prdno = 0 ;
						p1.setText("") ;
					}
					else
						p1flg = 1 ;
				}
				catch(Exception e)
				{
					JOptionPane.showMessageDialog( null,"Invalid ! Enter as a number" ) ;
					p1.setText("") ;
					p1flg = 0 ;
				}
			}
			if( evnt.getSource() == p2 )
			{
				try
				{
					prdname = evnt.getActionCommand() ;
					if( prdname.isEmpty() )
						p2flg = 0 ;
					else
						p2flg = 1 ;
				}
				catch(Exception e)
				{
					JOptionPane.showMessageDialog( null,"Invalid !" ) ;
					p2.setText("") ;
					p2flg = 0 ;
				}
			}
			if( evnt.getSource() == p3 )
			{
				try{
					totprd = Integer.parseInt( evnt.getActionCommand() ) ;
					p3flg = 1 ;
				}
				catch(Exception e)
				{
					p3.setText("") ;
					JOptionPane.showMessageDialog( null,"Invalid ! Enter as a number" ) ;
					p3flg = 0 ;
				}
			}
			if( evnt.getSource() == p4 )
			{
				try
				{
					rpp = Integer.parseInt( evnt.getActionCommand() ) ;
					p4flg = 1 ;
				}
				catch(Exception e)
				{
					p4.setText("") ;
					JOptionPane.showMessageDialog( null,"Invalid ! Enter as a number" ) ;
					p4flg = 0 ;
				}
			}

			if( evnt.getSource() == submit )
			{
				if( (p1flg == 1) && (p2flg == 1) && (p3flg == 1) && (p4flg == 1) )
				{
					try
					{
						obj.AddData(prdno,prdname,totprd,rpp) ;
						//x = "                       " + Integer.toString(prdno) +"         "+ prdname +"         "+ Integer.toString(totprd) +"            "+ Integer.toString(rpp) ;
						sx = sx +"    "+ Integer.toString(prdno) ;

						for(int i = 1 ; i <= 19-(Integer.toString(prdno).length()) ; i++ )
							sx = sx + " " ;
						sx = sx + prdname ;

						for(int i = 1 ; i < 20-prdname.length() ; i++ )
							sx = sx + " " ;
						sx = sx +  Integer.toString(totprd) ;

						for(int i = 1 ; i < 20-Integer.toString(totprd).length() ; i++ )
							sx = sx + " " ;
						sx = sx + Integer.toString(rpp) ;

						sx = sx + "\n\n" ;

						pno.addItem( Integer.toString(prdno) ) ;
						p1.setText("") ;
						ta.setText(sx)  ;

						p2.setText("") ;
						p3.setText("") ;
						p4.setText("") ;
						p1flg = p2flg = p3flg = p4flg = 0 ;
					}
					catch(Exception e)
					{
						System.err.println( e.getClass().getName() + " - " + e.getMessage() ) ;
						System.out.println("Sorry *.* Error Occurred !") ;
					}
				}
			}

			if(evnt.getSource() == cusnametf)
			{
				customer = evnt.getActionCommand() ;
				if( customer.length() >= 2 )
					cflg = 1 ;
				else
				{
					customer = "" ;
					cflg = 0 ;
				}
			}

			if( evnt.getSource() == datetf )
			{
				dateinput = evnt.getActionCommand() ;
				Pattern p = Pattern.compile(regexpat) ;
				Matcher m = p.matcher(dateinput) ;
				boolean result = m.matches() ;
				if(result)
				{
					//System.out.println("Match Success....") ;
					dflg = 1 ;
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Invalid Date Format !") ;
					dflg = 0 ;
				}
			}

			if( evnt.getSource() == totproduct )
			{
				try
				{
					tp = Integer.parseInt( evnt.getActionCommand() ) ;
					
					if( tp <= 0 )
						throw new Exception("") ;
					else
						tpflg = 1 ;
				}
				catch(Exception e)
				{
					tpflg = 0 ;
					JOptionPane.showMessageDialog(null,"Invalid *.*") ;
					totproduct.setText("") ;
				}
			}

			if( evnt.getSource() == pno  )
			{
				m = (String)pno.getSelectedItem() ;

				if( m.equals("PNo") )
				{
					m = "" ;
					pflg = 0 ;
				}
				else
				{
					pr = Integer.parseInt( "" + m ) ;
					pflg = 1 ;
				}
			}

			if( evnt.getSource() == b1 )
			{
				if( (cflg == 1) && (tpflg == 1) && (pflg == 1) && (dflg == 1) )
				{
					try
					{
						String f = "" ;
						f = obj.getData( Integer.parseInt(m) ) ;
						s2 = f.split("_") ;

						int ret = obj.ProductReduce(pr,tp) ;

						if(ret == 0)
						{
							totalcost = tp * Integer.parseInt( s2[1] ) ;
							fintotal += totalcost ;
							tctf.setText( Integer.toString(fintotal) ) ;
							obj.AddBill( dateinput,customer,Integer.toString(bn),pr,s2[0],tp,Integer.parseInt(s2[1]),totalcost,flg) ;
							s = s + "     " +Integer.toString(pr) +"           "+s2[0] +"           "+Integer.toString(tp)+"           "+s2[1]+"           "+Integer.toString(totalcost) +"\n\n" ;
							
							
							try
							{
								obj.AddDailyCollection(dateinput,pr,s2[0],tp,totalcost,no,0) ;
							}
							catch(Exception e)
							{
								System.err.println( e.getClass().getName() + " - " + e.getMessage()) ;
								obj.AddDailyCollection(dateinput,pr,s2[0],tp,totalcost,no,1) ;
								no+=0.01 ;
							}
							obj.DailyCollectDisplay() ;
							flg = 1  ;
							bflg = 1 ;
						}
						else
						{
							JOptionPane.showMessageDialog(null,"Only "+ret+" items are available") ;
							//fintotal -= totalcost ;
						}
					}
					catch(Exception e)
					{
						System.err.println( e.getClass().getName() + " - " + e.getMessage()) ;
						System.exit(0) ;
					}
				}
			}
			ta2.setText(s) ;
			if( evnt.getSource() == nextbill )
			{
				if(bflg == 1)
				{
					bn++ ;
					cflg = tpflg = pflg = 0 ;					
					pno.setSelectedItem("PNo") ;
					cusnametf.setText("") ;
					totproduct.setText("") ;
					tctf.setText("") ;
					s = "\n                                 PNo       PNAME       TOTPRD       RPP       COST\n\n" ;
					ta2.setText(s) ;
					fintotal = 0 ;
					flg = 0 ;
					billnotf.setText( Integer.toString(bn) ) ;
					bflg = 0 ;
					datetf.setText("") ;
				}
				dflg = 0 ;
			}
			if( evnt.getSource() == getname )
			{
				try
				{
					si3 = Integer.parseInt( evnt.getActionCommand() ) ;
					obj.CheckGoods(si3) ;
					gflg = 1 ;
				}
				catch(Exception e)
				{
					System.err.println( e.getClass().getName() + " - " + e.getMessage()) ;
					ta3.setText("") ;
					pradd.setText("") ;
					plb.setText("") ;
					JOptionPane.showMessageDialog(null,"Product doesn't exist.") ;
					gflg = 0 ;
				}
			}
			if(evnt.getSource() == enter )
			{
				if(gflg == 1)
				{
					try
					{
						s3 = obj.getResult(si3).split("_") ;
					}
					catch(Exception e)
					{
						JOptionPane.showMessageDialog(null,"Error Occured !") ;
					}
					tx = "\n\t      Product Name   :     "  ;
					tx += s3[1] +" \n\n  " ;
					tx += "\t      Product No.       :     " ;
					tx += s3[0] +" \n\n  " ;
					tx += "\t      Total Product   :     " ;
					tx += s3[2] +" \n\n  "  ;
					plb.setText(s3[2]+" + ") ;
					ta3.setText(tx) ;
					eflg = 1 ;
				}
				else
					eflg = 0 ;
			}
			if( evnt.getSource() == pradd )
			{
				if( (gflg == 1) && (eflg == 1) )
				{
					try
					{
						getnewpr = Integer.parseInt( evnt.getActionCommand() ) ;
						getnewpr += Integer.parseInt(s3[2]) ;
						prflg = 1 ;
					}
					catch(Exception e)
					{
						JOptionPane.showMessageDialog(null,"Invalid") ;
						prflg = 0 ;
					}
				}
				else
					JOptionPane.showMessageDialog(null,"Enter the Product No. first") ;
			}
			if( evnt.getSource() == add )
			{
				if( (gflg == 1) && (eflg == 1) && (prflg == 1) )
				{
					try
					{
						obj.SetNewData(si3,getnewpr) ;
						getname.setText( Integer.toString(si3) ) ;
						pradd.setText("") ;
						enter.doClick() ;
						JOptionPane.showMessageDialog(null,"Stock Update Success") ;
					}
					catch(Exception e)
					{
						JOptionPane.showMessageDialog(null,"Error Occured !") ; 
						prflg = 0 ;
					}
				}
			}
			
			if( evnt.getSource() == datetf4 )
			{
				getdate = evnt.getActionCommand() ;
				Pattern p = Pattern.compile(regexpat) ;
				Matcher m = p.matcher(getdate) ;
				boolean result = m.matches() ;
				if(result)
					dateflg = 1 ;
				else
				{
					JOptionPane.showMessageDialog(null,"Invalid Input") ;
					dateflg = 0 ;
				}
			}
			
			if( evnt.getSource() == show )
			{
				if( dateflg == 1 )
				{
					try
					{
						disstr = obj.DateResultReturn(getdate) ;
						ta4.setText(""+disstr) ;
					}
					catch(Exception e)
					{
						JOptionPane.showMessageDialog(null,"Error Occured !") ;
					}
				}
			}
		}
	}
	//java -classpath ".;sqlite-JDBC-3.8.11.2.jar" maincls
}