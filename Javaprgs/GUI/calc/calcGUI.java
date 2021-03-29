import java.awt.* ;
import javax.swing.* ;
import java.awt.event.* ;
import java.awt.Color.* ;
import java.io.* ;

class calculator extends JFrame
{
	public JTextArea ta = new JTextArea() ;
	public JScrollPane sp = new JScrollPane(ta) ;
	private JButton zero,one,two,three,four,five,six,seven,eight,nine ;
	private JButton clear ;
	private JButton add,sub,mul,div,equal;
	
	public Font f = new Font("Arial",Font.BOLD,28) ;
	
	private String s = "" ;
	private int ln = 0 ;

	public calculator()
	{
		super("Mini-Calculator") ;

		setLayout(null) ;
		this.getContentPane().setBackground( new java.awt.Color(211,211,211) ) ; 

		sp.setSize(250,60) ;
		sp.setBounds(6,32,322,130) ;
		ta.setBackground( new java.awt.Color(211,211,211) ) ;
		ta.setFont(f) ;
		ta.setText("") ;
		ta.setEditable(false) ;

		zero  = new JButton("0") ;	
		zero.setFont(f) ;
		zero.setBackground(Color.WHITE) ;
		zero.setBounds(86,460,70,60) ;

		one = new JButton("1") ;
		one.setFont(f) ;
		one.setBackground(Color.WHITE) ;
		one.setBounds(3,250,70,60) ;

		two   = new JButton("2") ;
		two.setFont(f) ;
		two.setBackground(Color.WHITE) ;
		two.setBounds(85,250,70,60) ;

		three = new JButton("3") ;
		three.setFont(f) ;
		three.setBackground(Color.WHITE) ;
		three.setBounds(170,250,70,60) ;

		four  = new JButton("4") ;
		four.setFont(f) ;
		four.setBackground(Color.WHITE) ;
		four.setBounds(3,318,70,60) ;

		five  = new JButton("5") ;
		five.setFont(f) ;
		five.setBackground(Color.WHITE) ;
		five.setBounds(85,318,70,60) ;

		six   = new JButton("6") ;
		six.setFont(f) ;
		six.setBackground(Color.WHITE) ;
		six.setBounds(170,318,70,60) ;

		seven = new JButton("7") ;
		seven.setFont(f) ;
		seven.setBackground(Color.WHITE) ;
		seven.setBounds(3,386,70,60) ;

		eight = new JButton("8") ;
		eight.setFont(f) ;
		eight.setBackground(Color.WHITE) ;
		eight.setBounds(85,386,70,60) ;

		nine  = new JButton("9") ;
		nine.setFont(f) ;
		nine.setBackground(Color.WHITE) ;
		nine.setBounds(170,386,70,60) ;

		add = new JButton("+") ;
		add.setFont(f) ;
		add.setBackground(Color.WHITE) ;
		add.setBounds(255,250,70,60) ;
		
		sub = new JButton("-") ;
		sub.setFont(f) ;
		sub.setBackground(Color.WHITE) ;
		sub.setBounds(255,318,70,60) ;
		
		mul = new JButton("x") ;
		mul.setFont(f) ;
		mul.setBackground(Color.WHITE) ;
		mul.setBounds(255,386,70,60) ;
		
		div = new JButton("/") ;
		div.setFont(f) ;
		div.setBackground(Color.WHITE) ;
		div.setBounds(255,460,70,60) ;
		
		equal = new JButton("=") ;
		equal.setFont(f) ;
		equal.setBackground(Color.WHITE) ;
		equal.setBounds(170,460,70,60) ;
		
		clear = new JButton("C") ;
		clear.setFont(f) ;
		clear.setBackground(Color.WHITE) ;
		clear.setBounds(3,460,70,60) ;

		add(sp) ;	add(zero) ;	add(one) ;	 add(two) ;		add(three) ;
		add(four) ;	add(five) ;	add(six) ;	 add(seven) ;	add(eight) ;
		add(nine) ;	add(clear) ; add(add) ;	 add(sub) ;
		add(mul) ;	add(div) ;	add(equal) ;
		
		frmhnd handler = new frmhnd() ;
		one.addActionListener( handler ) ;
		two.addActionListener( handler ) ;
		three.addActionListener( handler ) ;
		four.addActionListener( handler ) ;
		five.addActionListener( handler ) ;
		six.addActionListener( handler ) ;
		seven.addActionListener( handler ) ;
		eight.addActionListener( handler ) ;
		nine.addActionListener( handler ) ;
		zero.addActionListener( handler ) ;
		add.addActionListener( handler ) ;
		sub.addActionListener( handler ) ;
		mul.addActionListener( handler ) ;
		div.addActionListener( handler ) ;
		clear.addActionListener( handler ) ;
		equal.addActionListener( handler ) ;
	}
	
	private class frmhnd implements ActionListener
	{
		public void actionPerformed(ActionEvent evnt)
		{
			if( evnt.getSource() == clear ){
				s = "" ;
				ta.setText("") ;
			}

			if( evnt.getSource() == zero || evnt.getSource() == one ||  evnt.getSource() == two ||  evnt.getSource() == three ||  evnt.getSource() == four  )
				s = s + evnt.getActionCommand() ;

			if( evnt.getSource() == five || evnt.getSource() == six ||  evnt.getSource() == seven ||  evnt.getSource() == eight ||  evnt.getSource() == nine  )
				s = s + evnt.getActionCommand() ;

			if(evnt.getSource() == add){
				if( (s.charAt( s.length()-1 ) == '-') || (s.charAt(s.length()-1) == 'x') || (s.charAt(s.length()-1) == '/') )
					s = s.substring( 0,s.length()-2) ;
				
					s = s + " "+evnt.getActionCommand() + " ";
			}

			if(evnt.getSource() == sub){
				if( (s.charAt(s.length()-2) == '+') || (s.charAt(s.length()-2) == 'x') || (s.charAt(s.length()-2) == '/') )
					s = s.substring( 0,s.length()-2) ;
				
					s = s + " "+evnt.getActionCommand() + " ";
			}

			if(evnt.getSource() == mul){
				if( (s.charAt(s.length()-2) == '-') || (s.charAt(s.length()-2) == '+') || (s.charAt(s.length()-2) == '/') )
					s = s.substring( 0,s.length()-2) ;
				
				s = s + " "+evnt.getActionCommand() + " ";
			}

			if(evnt.getSource() == div){
				if( (s.charAt(s.length()-2) == '-') || (s.charAt(s.length()-2) == 'x') || (s.charAt(s.length()-2) == '+') )
					s = s.substring( 0,s.length()-2) ;

				s = s + " "+evnt.getActionCommand() + " ";
			}
			ta.setText(s) ;
		}
	}
}

class calcGUI
{
	public static void main(String args[])
	{
		calculator c = new calculator() ;
		c.setSize(350,600) ;
		c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
		c.setVisible(true) ;
	}
}