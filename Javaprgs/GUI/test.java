import java.awt.* ;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class guiprogram extends JFrame
{
	private JTextField tf1 , tf2 ;
	private JLabel finans;
	private int num1 = 0 , num2 = 0 ;
	private String[] s = {"hai","how r u","i am fine","cool"} ;
	private JComboBox<String> cb = new JComboBox<>(s) ;
	public guiprogram()
	{
		super("Welcome to my project") ;
		getContentPane().setLayout(null);
		
		JLabel lbl = new JLabel("Enter number 1 :");
		lbl.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl.setBounds(135, 55, 200, 38);
		getContentPane().add(lbl);
		
		JLabel lb2 = new JLabel("Enter number 2 : ");
		lb2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lb2.setBounds(135, 150, 188, 27);
		getContentPane().add(lb2);
		
		tf1 = new JTextField();
		tf1.setBounds(344, 55, 188, 34);
		getContentPane().add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setColumns(10);
		tf2.setBounds(344, 152, 188, 34);
		getContentPane().add(tf2);
		
		JLabel anslb = new JLabel("Answer is : ");
		anslb.setFont(new Font("Tahoma", Font.PLAIN, 22));
		anslb.setBounds(231, 264, 118, 27);
		getContentPane().add(anslb);
		
		finans = new JLabel("?");
		finans.setFont(new Font("Tahoma", Font.PLAIN, 23));
		finans.setBounds(392, 264, 93, 39);
		getContentPane().add(finans);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setBounds(690, -110, 344, 544);
		getContentPane().add(panel);
		
		cb.setBounds(600,500,300,100) ;
		getContentPane().add(cb);
		
		frmhnd handler = new frmhnd() ;
		tf1.addActionListener(handler);
		tf2.addActionListener(handler);
	}
	
	private class frmhnd implements ActionListener
	{
		public void actionPerformed(ActionEvent evnt)
		{	
			if(evnt.getSource() == tf1)
				try {
					num1 = Integer.parseInt( evnt.getActionCommand() );
				}
				catch(Exception e) {
					e.printStackTrace() ;
				}
				
			if(evnt.getSource() == tf2)
			{
				try {
					num2 = Integer.parseInt( evnt.getActionCommand() );
				}
				catch(Exception e) {
					e.printStackTrace() ;
				}
			}
			finans.setText( ""+Integer.toString(num1+num2) ) ;
		}
	}
}

class test
{
	public static void main(String args[])
	{
		guiprogram g = new guiprogram() ;
		g.setSize(800,450) ;
		g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
		g.setVisible(true) ;
	}
}