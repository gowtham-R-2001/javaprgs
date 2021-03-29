import java.io.* ;
import java.awt.* ;
import java.awt.event.* ;
import javax.swing.* ;
import java.awt.Color.* ;

class shopgui extends JFrame
{
	public JTabbedPane tb = new JTabbedPane() ;
	public JPanel pnl1 , pnl2 , pnl3 ;

	public Font f = new Font("Arial",Font.BOLD,15) ;
	public Font ff = new Font("Arial",Font.BOLD,17) ;

	private JLabel goodslb ;
	private JTextField p11 , p12 , p13 , p14 ;
	private JTextField p21 , p22 , p23 , p24 ;
	private JTextField p31 , p32 , p33 , p34 ;
	private JTextField p41 , p42 , p43 , p44 ;
	private JTextField p51 , p52 , p53 , p54 ;

	private JLabel cusname , billno , billhdr ;
	private JLabel b1 , b2 , b3 , b4 , b5 ;
	private JTextField cusnametf , billnotf , prdno , totprd ;
	private JButton ok , c1 , c2 , c3 , c4 , c5 ;

	private JLabel alb ;
	private JTextField ap11 , ap12 , ap13 , ap14 ;
	private JTextField ap21 , ap22 , ap23 , ap24 ;
	private JTextField ap31 , ap32 , ap33 , ap34 ;
	private JTextField ap41 , ap42 , ap43 , ap44 ;
	private JTextField ap51 , ap52 , ap53 , ap54 ;

	public shopgui()
	{
		super("Shop Database") ;
		pnl1 = new JPanel() ;
		pnl2 = new JPanel() ;
		pnl3 = new JPanel() ;
		pnl1.setLayout(null) ;
		pnl2.setLayout(null) ;
		pnl3.setLayout(null) ;

		goodslb = new JLabel("Product no             Product Name             Total product               RPP") ;
		goodslb.setBounds(70,10,500,100) ;
		goodslb.setFont(f) ;
		goodslb.setForeground(Color.BLACK) ;

		p11 = new JTextField(10) ;	p11.setBounds(76,100,60,30) ;
		p12 = new JTextField(10) ;	p12.setBounds(205,100,110,30) ;
		p13 = new JTextField(10) ;	p13.setBounds(384,100,60,30) ;
		p14 = new JTextField(10) ;	p14.setBounds(510,100,60,30) ;

		p21 = new JTextField(10) ;	p21.setBounds(76,160,60,30) ;
		p22 = new JTextField(10) ;	p22.setBounds(205,160,110,30) ;
		p23 = new JTextField(10) ;	p23.setBounds(384,160,60,30) ;
		p24 = new JTextField(10) ;	p24.setBounds(510,160,60,30) ;

		p31 = new JTextField(10) ;	p31.setBounds(76,220,60,30) ;
		p32 = new JTextField(10) ;	p32.setBounds(205,220,110,30) ;
		p33 = new JTextField(10) ;	p33.setBounds(384,220,60,30) ;
		p34 = new JTextField(10) ;	p34.setBounds(510,220,60,30) ;

		p41 = new JTextField(10) ;	p41.setBounds(76,280,60,30) ;
		p42 = new JTextField(10) ;	p42.setBounds(205,280,110,30) ;
		p43 = new JTextField(10) ;	p43.setBounds(384,280,60,30) ;
		p44 = new JTextField(10) ;	p44.setBounds(510,280,60,30) ;

		p51 = new JTextField(10) ;	p51.setBounds(76,340,60,30) ;
		p52 = new JTextField(10) ;	p52.setBounds(205,340,110,30) ;
		p53 = new JTextField(10) ;	p53.setBounds(384,340,60,30) ;
		p54 = new JTextField(10) ;	p54.setBounds(510,340,60,30) ;


		cusname = new JLabel("Customer Name  : ") ;		
		cusname.setBounds(150,40,180,30) ;
		cusname.setFont(f) ;

		cusnametf = new JTextField(20) ;			
		cusnametf.setBounds(310,40,140,30) ;

		billno = new JLabel("Bill No  : ") ;		
		billno.setBounds(220,100,180,30) ;
		billno.setFont(f) ;

		billnotf = new JTextField(20) ;
		billnotf.setBounds(310,100,80,30) ;
		billnotf.setBackground(Color.WHITE) ;
		billnotf.setEditable(false) ;

 		billhdr = new JLabel("Product No               Total Product") ;
		billhdr.setBounds(190,180,250,20) ;
		billhdr.setFont(f) ;

		prdno = new JTextField(20) ;	prdno.setBounds(210,220,60,30) ;
		totprd = new JTextField(20) ;	totprd.setBounds(350,220,60,30) ;
		ok = new JButton("Ok") ;		ok.setBounds(460,220,60,30) ;
		ok.setFont(f) ;

		b1 = new JLabel("101        Soap                4        27        108") ;
		b1.setBounds(120,320,350,20) ;
		b1.setFont(ff) ;

		c1 = new JButton("x") ;
		c1.setBounds(470,321,50,20) ;
		c1.setFont(ff) ;
		c1.setForeground(Color.WHITE) ;
		c1.setBackground(Color.RED) ;

		b2 = new JLabel("102        Shampoo         3         1           3") ;
		b2.setBounds(120,360,350,20) ;
		b2.setFont(ff) ;

		c2 = new JButton("x") ;
		c2.setBounds(470,361,50,20) ;
		c2.setFont(ff) ;
		c2.setForeground(Color.WHITE) ;
		c2.setBackground(Color.RED) ;

		b3 = new JLabel("103        C.Liquid            1        20        20") ;
		b3.setBounds(120,400,350,20) ;
		b3.setFont(ff) ;

		c3 = new JButton("x") ;
		c3.setBounds(470,401,50,20) ;
		c3.setFont(ff) ;
		c3.setForeground(Color.WHITE) ;
		c3.setBackground(Color.RED) ;

		b4 = new JLabel("104        Disinfectant      2        40        80") ;
		b4.setBounds(120,440,350,20) ;
		b4.setFont(ff) ;
		
		c4 = new JButton("x") ;
		c4.setBounds(470,441,50,20) ;
		c4.setFont(ff) ;
		c4.setForeground(Color.WHITE) ;
		c4.setBackground(Color.RED) ;

		b5 = new JLabel("105        T.brush             4        10        40") ;
		b5.setBounds(120,480,350,20) ;
		b5.setFont(ff) ;
		
		c5 = new JButton("x") ;
		c5.setBounds(470,481,50,20) ;
		c5.setFont(ff) ;
		c5.setForeground(Color.WHITE) ;
		c5.setBackground(Color.RED) ;

		alb = new JLabel("Product no             Product Name             Total product               RPP") ;
		alb.setFont(f) ;
		alb.setBounds(70,10,500,100) ;

		ap11 = new JTextField(10) ;	ap11.setBounds(76,100,60,30) ;
		ap12 = new JTextField(10) ;	ap12.setBounds(205,100,110,30) ;
		ap13 = new JTextField(10) ;	ap13.setBounds(384,100,60,30) ;
		ap14 = new JTextField(10) ;	ap14.setBounds(510,100,60,30) ;

		ap21 = new JTextField(10) ;	ap21.setBounds(76,160,60,30) ;
		ap22 = new JTextField(10) ;	ap22.setBounds(205,160,110,30) ;
		ap23 = new JTextField(10) ;	ap23.setBounds(384,160,60,30) ;
		ap24 = new JTextField(10) ;	ap24.setBounds(510,160,60,30) ;

		ap31 = new JTextField(10) ;	ap31.setBounds(76,220,60,30) ;
		ap32 = new JTextField(10) ;	ap32.setBounds(205,220,110,30) ;
		ap33 = new JTextField(10) ;	ap33.setBounds(384,220,60,30) ;
		ap34 = new JTextField(10) ;	ap34.setBounds(510,220,60,30) ;

		ap41 = new JTextField(10) ;	ap41.setBounds(76,280,60,30) ;
		ap42 = new JTextField(10) ;	ap42.setBounds(205,280,110,30) ;
		ap43 = new JTextField(10) ;	ap43.setBounds(384,280,60,30) ;
		ap44 = new JTextField(10) ;	ap44.setBounds(510,280,60,30) ;

		ap51 = new JTextField(10) ;	ap51.setBounds(76,340,60,30) ;
		ap52 = new JTextField(10) ;	ap52.setBounds(205,340,110,30) ;
		ap53 = new JTextField(10) ;	ap53.setBounds(384,340,60,30) ;
		ap54 = new JTextField(10) ;	ap54.setBounds(510,340,60,30) ;


		pnl1.add(goodslb) ;
		pnl1.add(p11) ;	pnl1.add(p12) ;	pnl1.add(p13) ;	pnl1.add(p14) ;
		pnl1.add(p21) ;	pnl1.add(p22) ;	pnl1.add(p23) ;	pnl1.add(p24) ;
		pnl1.add(p31) ;	pnl1.add(p32) ;	pnl1.add(p33) ;	pnl1.add(p34) ;
		pnl1.add(p41) ;	pnl1.add(p42) ;	pnl1.add(p43) ;	pnl1.add(p44) ;
		pnl1.add(p51) ;	pnl1.add(p52) ;	pnl1.add(p53) ;	pnl1.add(p54) ;


		pnl2.add(cusname) ;		pnl2.add(billno) ;		pnl2.add(billhdr) ;
		pnl2.add(cusnametf) ;	pnl2.add(billnotf) ;	pnl2.add(prdno) ;	pnl2.add(totprd) ; 
		pnl2.add(b1) ;			pnl2.add(b2) ;		    pnl2.add(b3) ;		pnl2.add(b4) ;  	pnl2.add(b5) ;
		pnl2.add(ok) ;		    pnl2.add(c1) ;			pnl2.add(c2) ;		pnl2.add(c3) ;		pnl2.add(c4) ;
		pnl2.add(c5) ;


		pnl3.add(alb) ;
		pnl3.add(ap11) ;	pnl3.add(ap12) ;	pnl3.add(ap13) ;	pnl3.add(ap14) ;
		pnl3.add(ap21) ;	pnl3.add(ap22) ;	pnl3.add(ap23) ;	pnl3.add(ap24) ;
		pnl3.add(ap31) ;	pnl3.add(ap32) ;	pnl3.add(ap33) ;	pnl3.add(ap34) ;
		pnl3.add(ap41) ;	pnl3.add(ap42) ;	pnl3.add(ap43) ;	pnl3.add(ap44) ;
		pnl3.add(ap51) ;	pnl3.add(ap52) ;	pnl3.add(ap53) ;	pnl3.add(ap54) ;


		tb.addTab("Input Panel",null,pnl1,"Stock") ;
		tb.addTab("Bill Panel",null,pnl2,"Bill") ;
		tb.addTab("Addition Panel",null,pnl3,"Stock Adder") ;
		tb.setBounds(0,0,650,550) ;
		add(tb) ;
	}
	
	//java -classpath ".;sqlite-JDBC-3.8.11.2.jar" maincls
}