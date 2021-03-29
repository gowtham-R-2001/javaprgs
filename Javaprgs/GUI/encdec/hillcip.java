import java.awt.* ;

import javax.swing.* ;

import java.awt.Color.* ;

import java.awt.event.* ;

import java.lang.* ;


class encdec extends JFrame	// class starts
{
	private String s1 = "" , check = "" , check1 = "" , s2 = "" , str = "" ;
	
	private String alphabets = "_abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()~{}|:;/.,`" ;
	
	int[][] a = new int[2][2] ;
	
	int[][] b = new int[2][2] ;

	float[][] a_inverse = new float[2][2] ;
	
	int[] arr = new int[100] ;
	
	int[] arr1 = new int[100] ;

	int[] encarr = new int[100] ;
	
	int[] decarr = new int[100] ;
	
	String[] strarr = new String[100] ;
	
	int k1flg = 0 , k2flg = 0 , k3flg = 0 , k4flg = 0 , msg1flg = 0 , num = 0 , key = 0 ,  k11flg = 0 , k21flg = 0 , k31flg = 0 , k41flg = 0 , msg2flg = 0 ;
	
	
	
	public JTabbedPane tb = new JTabbedPane() ;
	
	public JPanel pnl1 = new JPanel() ;
	
	public JPanel pnl2 = new JPanel() ;
	
	public Font f  = new Font( "ARIAL",Font.BOLD | Font.ITALIC,12 ) ;
	
	private JLabel lb1 , lb2 , lb11 , lb21 , key1 , key2 ;
	
	private JTextField k1 , k2 , k3 , k4 , k11 , k21 , k31 , k41 , msg1 , msg2 , msg11 , msg21 ;
	
	private JButton encr , decr ;
	
	
	
	public encdec()		// constructor 
	{
		super("Encryption-Decryption") ;
		
		
		setLayout( null) ;
		
		pnl1.setLayout( null ) ;
		
		pnl2.setLayout( null ) ;
		
		
		
		pnl1.setBackground( Color.WHITE ) ;
		
		pnl2.setBackground( Color.WHITE ) ;
		
		
		
		lb1 = new JLabel("Enter Message ") ;		lb1.setBounds(165,10,100,50) ;
		
		lb11 = new JLabel("Encrypted Message ") ;	lb11.setBounds(158,100,150,50) ;
		
		
		lb2  = new JLabel("Enter Message ") ;		lb2.setBounds(165,10,100,50) ;
		
		lb21  = new JLabel("Decrypted Message ") ;	lb21.setBounds(158,100,150,50) ;
		
		
		key1 = new JLabel("Key : ") ;			key1.setBounds(80,220,50,50) ;	
		
		key2 = new JLabel("Key : ") ;			key2.setBounds(80,220,50,50) ;
		
		
		
		msg1 = new JTextField(100) ;			msg1.setBounds(10,60,380,30) ;
		
		msg1.setFont(f) ;
		
		msg11 = new JTextField(100) ;			msg11.setBounds(10,150,380,50) ;
		
		msg11.setEditable( false ) ;
		
		//msg11.setBackground( Color.GREEN ) ;
		

		
		msg2 = new JTextField(100)  ;			msg2.setBounds(10,60,380,30) ;
		
		msg21 = new JTextField(100) ;			msg21.setBounds(10,150,380,50) ;
		
		msg21.setEditable( false ) ;
 
 
 
		k1 = new JTextField(1) ;			k1.setBounds(130,235,30,25) ;	

		k2 = new JTextField(1) ;			k2.setBounds(175,235,30,25) ;

		k3 = new JTextField(1) ;			k3.setBounds(220,235,30,25) ;

		k4 = new JTextField(1) ;			k4.setBounds(265,235,30,25) ;
		
		
		k11 = new JTextField(1) ;			k11.setBounds(130,235,30,25) ;	

		k21 = new JTextField(1) ;			k21.setBounds(175,235,30,25) ;

		k31 = new JTextField(1) ;			k31.setBounds(220,235,30,25) ;

		k41 = new JTextField(1) ;			k41.setBounds(265,235,30,25) ;


		encr = new JButton("Encrypt") ;		encr.setBounds(170,300,100,25) ;
		
		encr.setBackground( Color.RED ) ;
		
		encr.setForeground( Color.WHITE ) ;
		
		decr = new JButton("Decrypt") ;		decr.setBounds(170,300,100,25) ;
		
		decr.setBackground( Color.GREEN ) ;
		
		decr.setForeground( Color.BLACK ) ;
		
		
		pnl1.add(lb1) ;		pnl1.add(msg1) ;	pnl1.add(lb11) ;	pnl1.add(msg11) ;		pnl1.add(encr) ;	
		
		pnl1.add(k1) ;		pnl1.add(k2) ;		pnl1.add(k3) ;
		
		pnl1.add(k4) ;		pnl1.add(key1) ;
		
		
		pnl2.add(lb2) ;		pnl2.add(lb21) ;		pnl2.add(msg2) ;	pnl2.add(msg21) ;		pnl2.add(decr) ;	
		
		pnl2.add(k11) ;		pnl2.add(k21) ;			pnl2.add(k31) ;
		
		pnl2.add(k41) ;		pnl2.add(key2) ;
		
		
		tb.addTab("Encryption",null,pnl1,"panel 1") ;
		
		tb.addTab("Decryption",null,pnl2,"panel 2") ;
		
		
		add(tb) ;
		
		tb.setBounds(0,0,410,410) ;
		
		
		frmhnd handler = new frmhnd() ;
		
		msg1.addActionListener( handler ) ;
		
		msg11.addActionListener( handler ) ;
		
		msg2.addActionListener( handler ) ;
		
		msg21.addActionListener( handler ) ;
		
		k1.addActionListener( handler ) ;
		
		k2.addActionListener( handler ) ;
		
		k3.addActionListener( handler ) ;
		
		k4.addActionListener( handler ) ;
		
		k11.addActionListener( handler ) ;
		
		k21.addActionListener( handler ) ;
		
		k31.addActionListener( handler ) ;
		
		k41.addActionListener( handler ) ;
		
		encr.addActionListener( handler ) ;
		
		decr.addActionListener( handler ) ;
	}	
	
	// constructor ends
	
	private class frmhnd implements ActionListener		// private class starts
	{
		public void actionPerformed(ActionEvent evnt)
		{
			if( evnt.getSource() == msg1 )
			{
				s1 = msg1.getText() ;
				
				if( ! s1.isEmpty() )
					msg1flg = 1 ;
			}
			
			
			if( evnt.getSource() == k1 )
			{
				check = k1.getText() ;
				
				if( ! check.isEmpty() )
				{
					a[0][0] = Integer.parseInt( k1.getText() ) ;
					k1flg = 1 ;
				}
				check = "" ;
			}
				
			
			if( evnt.getSource() == k2 )
			{
				check = k2.getText() ;
				if( ! check.isEmpty() )
				{
					a[0][1] = Integer.parseInt( k2.getText() ) ;
					k2flg = 1 ;
				}
				check = "" ;
			}
				
			
			if( evnt.getSource() == k3 )
			{
				check = k3.getText() ;
				if( ! check.isEmpty() )
				{
					a[1][0] = Integer.parseInt( k3.getText() ) ;
					k3flg = 1 ;
				}
				check = "" ;
			}
				
			
			if( evnt.getSource() == k4 )
			{
				check = k4.getText() ;
				if( ! check.isEmpty() )
				{
					k4flg = 1 ;
					a[1][1] = Integer.parseInt( k4.getText() ) ;
				}
				check = "" ;
			}
			
			if( evnt.getSource() == encr )
			{
				if( (k1flg == 1) && (k2flg == 1) && (k3flg == 1) && (k4flg == 1) && (msg1flg == 1) )
				{
					if( determinant(a) != 0  )
					{	
						convert2num(arr,s1) ;
						
						matmul(encarr,arr,a,s1) ;
						
						int ln = s1.length() ;
						
						if( ln % 2 != 0 )
							ln++ ;
						
						s1 = "" ;
			
						for(int i = 0 ; i < ln ; i++)
							s1 = s1.concat( Integer.toString( encarr[i] ) + " ") ;
						
						msg11.setText( "" + s1 ) ;

					}

					else
					{
						k1.setText("") ;	k2.setText("") ;
						k3.setText("") ;	k4.setText("") ;
						JOptionPane.showMessageDialog(null,"Invalid Key") ;
						//k1flg =	k2flg = k3flg = k4flg = msg1flg = 0 ;
					}
				}
			}
			
			// panel 2 
			
			if( evnt.getSource() == msg2 )
			{
				s2 = msg2.getText() ;
				
				if( ! s2.isEmpty() )
					msg2flg = 1 ;
			}
			
			
			if( evnt.getSource() == k11 )
			{
				check1 = k11.getText() ;
				
				if( ! check1.isEmpty() )
				{
					b[0][0] = Integer.parseInt( k11.getText() ) ;
					k11flg = 1 ;
				}
				check1 = "" ;
			}
				
			
			if( evnt.getSource() == k21 )
			{
				check1 = k21.getText() ;
				if( ! check1.isEmpty() )
				{
					b[0][1] = Integer.parseInt( k21.getText() ) ;
					k21flg = 1 ;
				}
				check1 = "" ;
			}
				
			
			if( evnt.getSource() == k31 )
			{
				check1 = k31.getText() ;
				if( ! check1.isEmpty() )
				{
					b[1][0] = Integer.parseInt( k31.getText() ) ;
					k31flg = 1 ;
				}
				check1 = "" ;
			}
				
			
			if( evnt.getSource() == k41 )
			{
				check1 = k41.getText() ;
				if( ! check1.isEmpty() )
				{
					b[1][1] = Integer.parseInt( k41.getText() ) ;
					k41flg = 1 ;
				}
				check1 = "" ;
			}
			
			if( evnt.getSource() == decr )
			{
				if( (msg2flg == 1) && (k11flg == 1) && (k21flg == 1) && (k31flg == 1) && (k41flg == 1) )
				{
					int l = 0 ;
					
					str = msg2.getText() ;
					
					strarr = str.split(" ") ;
					
					for( String x : strarr )
						strarr[l++] = x ;
					
					inverse( b ) ;
					
					for(int i = 0 ; i < l ; i++)
						arr1[i] = Integer.parseInt( strarr[i] ) ;
					
					multokey( arr1 , decarr , l ) ;
					
					str = "" ;
					
					for( int i = 0 ; i < l ; i++ )
					{
						char c  ;
						
						if( decarr[i] == 32 ||  decarr[i] == -1 )
							str = str.concat( Character.toString( ' ' ) ) ;
						
						else
						{
							if( decarr[i] < 0 )
								decarr[i] = -1 * decarr[i] ;
							
							else if(  decarr[i] > 82 )
								decarr[i] =  decarr[i] % 83 ; 
								
							
							c = alphabets.charAt( decarr[i] ) ;
							str = str.concat( Character.toString( c ) ) ;
						}
					}
					
					msg21.setFont( f ) ;
					msg21.setText(str) ;
				}
			}
		}
		
		public int determinant(int[][] a)	// to find the determinant of the matrix
		{
			int result = 0 ;
			
			result = ( a[0][0] * a[1][1] ) - (a[0][1] * a[1][0] ) ;
			
			return(result) ;
		}
		
		public int[] convert2num( int[] arr,String s )	// to convert the string to number
		{
			int ln = 0 , pos = 0 , i = 0 ;
			
			ln = s.length() ;
			
			for(i = 0 ; i < ln ; i++)
			{
				if( s.charAt(i) == ' ' )
					arr[i] = 32 ;
				
				else
				{
					pos = alphabets.indexOf( s.charAt(i) ) ;
					arr[i] = pos ;
				}
			}
			
			if( ln % 2 != 0 )
				arr[ln] = -1 ;
			
			return(arr) ;
		}
		
		
		public int[] matmul( int[] encarr,int[] arr,int[][] a, String s )	// multiplying the matrix
		{	
			int ln = s.length() ; // hardworki 

			if( ln % 2 != 0 )
			{
				ln++ ;
				arr[ln-1] = -1 ;
			} 

			for(int i = 0 ; i <= ln ; i+=2)
			{
				encarr[i] = (a[0][0] * arr[i]) + (a[0][1] * arr[i+1]) ;

				encarr[i+1] = (a[1][0] * arr[i]) + (a[1][1] * arr[i+1]) ;
			}
			
			return(encarr) ;
		}
		
		
		// For 2nd panel 
		
		
		public int[] multokey( int[] arr1 , int[] decarr , int ln )
		{
			if( ln % 2 != 0 )
				ln-- ;
				
			for(int i = 0 ; i < ln ; i+=2)
			{
				decarr[i] = Math.round( (arr1[i] * a_inverse[0][0] ) + (arr1[i+1] * a_inverse[0][1] ) ) ;

				decarr[i+1] = Math.round( (arr1[i] * a_inverse[1][0]) + (arr1[i+1] * a_inverse[1][1] ) ) ;
			}
			
			return( decarr ) ;
		}
		


		public float[][] inverse( int[][] b )		//to find inverse of the matrix
		{
			float n = determinant(b) ;

			//System.out.println("Determinant value : " + n ) ;

			a_inverse[0][0] =  b[1][1] / n ;

			a_inverse[0][1] = (-1 * b[0][1]) / n ;

			a_inverse[1][0] = (-1 * b[1][0] )  / n ;

			a_inverse[1][1] = b[0][0] / n ;
			
			return(a_inverse) ;
		}
	}		// private class en
}

class hillcip		// main class
{
	public static void main(String args[])
	{
		encdec ed = new encdec() ;
		ed.setSize(425,450) ;
		ed.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE ) ;
		ed.setVisible( true ) ;
	}
}					// main class ends

