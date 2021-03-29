import java.io.* ;
import java.awt.* ;
import javax.swing.* ;
import java.awt.event.* ;
import java.awt.Font.* ;
import java.util.regex.* ;
import java.awt.Color.* ;

class details1 extends JFrame
{
	private JTextField aadhartf , nametf , dobtf , phonetf , addresstf ;
	private JLabel aadharlb , namelb , doblb , phonelb , addresslb ;
	private JLabel img1,img2,img3,img4,img5 ;
	private JLabel img11,img21,img31,img41,img51 ;
	
	private String aadharpat = "(^[2-9]{1})([0-9]{11}$)" ;
	private String namepat = "[a-zA-z ]{3,}[A-Z ]{1,}" ;
	private String dobpat = "^(0[1-9]|[1-2][0-9])([-])(0[1-9]|[1][0-2])([-])(([1][9][6-9][0-9])|([2][0][0-1][0-9])|(2020))$" ;
	private String phonepat = "(([9|8|7|6])([0-9]{9}))|((0422|422|044|44)([0-9]{7}))" ;
	private String addresspat = "([0-9]{1,4}[,])([a-zA-Z0-9]{5,}[,])([a-zA-Z0-9]{5,}[-])([0-9]{6})" ;
	private boolean aadhar_result , name_result , dob_result , phone_result , address_result ;
	
	private Font f  = new Font("ARIAL",Font.BOLD,14) ;
	private Font f1 = new Font("ARIAL",Font.BOLD,13) ;
	
	public Icon valid   = new ImageIcon( getClass().getResource("right1.jpg") ) ;
	public Icon invalid = new ImageIcon( getClass().getResource("wrong1.jpg") ) ;
	
	public details1()
	{
		super("Personal-Details") ;
		setLayout(null) ;
		
		this.getContentPane().setBackground(Color.WHITE)  ;

		img1 = new JLabel("") ;		img1.setBounds(300,5,200,50) ;
		img1.setIcon(valid) ;		img1.setVisible(false) ;

		img2 = new JLabel("") ;		img2.setBounds(300,55,200,50) ;
		img2.setIcon(valid) ;		img2.setVisible(false) ;

		img3 = new JLabel("") ;		img3.setBounds(300,105,200,50) ;
		img3.setIcon(valid) ;		img3.setVisible(false) ;

		img4 = new JLabel("") ;		img4.setBounds(300,155,200,50) ;
		img4.setIcon(valid) ;		img4.setVisible(false) ;

		img5 = new JLabel("") ;		img5.setBounds(300,205,200,50) ;
		img5.setIcon(valid) ;		img5.setVisible(false) ;

		//

		img11 = new JLabel("") ;	img11.setBounds(300,5,200,50) ;
		img11.setIcon(invalid) ;	img11.setVisible(false) ;

		img21 = new JLabel("") ;	img21.setBounds(300,55,200,50) ;
		img21.setIcon(invalid) ;	img21.setVisible(false) ;

		img31 = new JLabel("") ;    img31.setBounds(300,105,200,50) ;
		img31.setIcon(invalid) ;	img31.setVisible(false) ;

		img41 = new JLabel("") ;	img41.setBounds(300,155,200,50) ;
		img41.setIcon(invalid) ;	img41.setVisible(false) ;

		img51 = new JLabel("") ;	img51.setBounds(300,205,200,50) ;
		img51.setIcon(invalid) ;	img51.setVisible(false) ;

		namelb = new JLabel("Name ") ;
		namelb.setBounds(15,10,80,30) ;
		namelb.setFont(f) ;
		nametf = new JTextField(10) ;
		nametf.setFont(f1) ;
		nametf.setBounds(170,17,110,20) ;

		doblb = new JLabel("DOB(DD-MM-YYYY)") ;
		doblb.setBounds(15,60,140,30) ;
		doblb.setFont(f) ;
		dobtf = new JTextField(10) ;
		dobtf.setFont(f1) ;
		dobtf.setBounds(170,67,110,20) ;

		phonelb = new JLabel("Mobile (or) Landline") ;
		phonelb.setBounds(15,110,150,30) ;
		phonelb.setFont(f) ;
		phonetf = new JTextField(10) ;
		phonetf.setFont(f1) ;
		phonetf.setBounds(170,117,110,20) ;

		aadharlb = new JLabel("Aadhar Number ") ;
		aadharlb.setBounds(15,160,120,30) ;
		aadharlb.setFont(f) ;
		aadhartf = new JTextField(10) ;
		aadhartf.setFont(f1) ;
		aadhartf.setBounds(170,167,110,20) ;

		addresslb = new JLabel("Address ") ;
		addresslb.setBounds(15,210,80,30) ;
		addresslb.setFont(f) ;
		addresstf = new JTextField(10) ;
		addresstf.setFont(f1) ;
		addresstf.setBounds(170,217,110,20) ;

		add(namelb) ;	add(nametf) ;	add(doblb) ;	add(dobtf) ;
		add(phonelb) ;	add(phonetf) ;	add(aadharlb) ;	add(aadhartf) ;
		add(addresslb) ;	add(addresstf) ;
		
		add(img1) ;	add(img11) ;	add(img2) ;	add(img21) ;
		add(img3) ;	add(img31) ;	add(img4) ;	add(img41) ;
		add(img5) ;	add(img51) ;

		frmhnd handler = new frmhnd() ;

		nametf.addActionListener(handler) ;
		dobtf.addActionListener(handler) ;
		phonetf.addActionListener(handler) ;
		aadhartf.addActionListener(handler) ;
		addresstf.addActionListener(handler) ;
	}

	private class frmhnd implements ActionListener
	{
		public void actionPerformed(ActionEvent evnt)
		{
			if( evnt.getSource() == nametf )
			{
				String s1 = evnt.getActionCommand() ;
				s1 = s1.replaceAll("[`_~_!_@_#_$_^_&_*_[0-9]_\\(\\_\\)\\_]","") ;
				nametf.setText(s1) ;
				Pattern p1 = Pattern.compile(namepat) ;
				Matcher m1 = p1.matcher(s1) ;
				name_result = m1.matches() ;
				if(name_result)
				{
					img1.setVisible(true) ;
					img11.setVisible(false) ;
				}
				else
				{
					img11.setVisible(true) ;
					img1.setVisible(false) ;
				}
			}

			if( evnt.getSource() == dobtf )
			{
				String s2 = evnt.getActionCommand() ;
				s2 = s2.replaceAll("[`_~_!_@_#_$_^_&_*_ _%_]","") ;
				dobtf.setText(s2) ;
				Pattern p2 = Pattern.compile(dobpat) ;
				Matcher m2 = p2.matcher(s2) ;
				dob_result = m2.matches() ;
				if(dob_result)
				{
					img2.setVisible(true) ;
					img21.setVisible(false) ;
				}
				else
				{
					img21.setVisible(true) ;
					img2.setVisible(false) ;
				}
			}

			if( evnt.getSource() == phonetf )
			{
				String s3 = evnt.getActionCommand() ;
				s3 = s3.replaceAll("[`_~_!_@_#_$_^_&_*_ _%_-_//(_//)_//?//_]","") ;
				phonetf.setText(s3) ;
				Pattern p3 = Pattern.compile(phonepat) ;
				Matcher m3 = p3.matcher(s3) ;
				phone_result = m3.matches() ;
				if(phone_result)
				{
					img3.setVisible(true) ;
					img31.setVisible(false) ;
				}
				else
				{
					img31.setVisible(true) ;
					img3.setVisible(false) ;
				}
					
			}

			if( evnt.getSource() == aadhartf )
			{
				String s4 = evnt.getActionCommand() ;
				s4 = s4.replaceAll("[`_~_!_@_#_$_^_&_*_ _%_-_//(_//)_//?//_]","") ;
				aadhartf.setText(s4) ;
				Pattern p4 = Pattern.compile(aadharpat) ;
				Matcher m4 = p4.matcher(s4) ;
				aadhar_result = m4.matches() ;
				if(aadhar_result)
				{
					img4.setVisible(true) ;
					img41.setVisible(false) ;
				}
				else
				{
					img41.setVisible(true) ;
					img4.setVisible(false) ;
				}
					
			}

			if( evnt.getSource() == addresstf )
			{
				String s5 = evnt.getActionCommand() ;
				Pattern p5 = Pattern.compile(addresspat) ;
				Matcher m5 = p5.matcher(s5) ;
				address_result = m5.matches() ;
				if(address_result)
				{
					img5.setVisible(true) ;
					img51.setVisible(false) ;
				}
				else
				{
					img51.setVisible(true) ;
					img5.setVisible(false) ;
				}
			}
		}
	}
}

class details
{
	public static void main(String args[])
	{
		details1 d =  new details1() ;
		d.setSize(450,450) ;
		d.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE ) ;
		d.setVisible(true) ;
	}
}