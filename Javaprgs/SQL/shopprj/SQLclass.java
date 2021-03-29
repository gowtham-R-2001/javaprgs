import java.sql.* ;

class SQLclass
{
	Connection c = null ;
	Statement stmt = null ;

	SQLclass()
	{
		try
		{
			Class.forName("org.sqlite.JDBC") ;
			c = DriverManager.getConnection("JDBC:sqlite:shop.db") ;
			c.setAutoCommit(false) ;
			stmt = c.createStatement() ;
		}
		catch(Exception e)
		{
			System.out.println( e.getClass().getName() + " - " + e.getMessage() ) ;
			System.exit(0) ;
		}
	}

	public void AddData(int prdno , String prdname , int totprd , int rpp) throws SQLException
	{
		String sql = "INSERT INTO goodstbl(pn,prdct,tot_prdct,rpp)"+
		"VALUES('"+prdno+"','"+prdname+"','"+totprd+"','"+rpp+"')" ;

		stmt.executeUpdate(sql) ;
		c.commit() ;
		stmt.close() ;
	}

	public int CheckPno(int n)	throws SQLException
	{
		ResultSet rs = stmt.executeQuery("SELECT * FROM goodstbl;") ;

		while( rs.next() )
		{
			int pno = rs.getInt("pn") ;
			if(pno == n)
				return(1) ;
		}
		return(0) ;
	}

	public void DeleteData(int n) throws SQLException
	{
		String x = "DELETE FROM goodstbl WHERE pn="+n+";" ;
		stmt.executeUpdate(x) ;
		c.commit() ;
		stmt.close() ;
	}

	public String ReturnProductNo(int cnt) throws SQLException
	{
		String s = "" ;
		int x = 0 ;
		ResultSet rs = stmt.executeQuery("SELECT * FROM goodstbl") ;

		while( rs.next() )
		{
			if(x == cnt)
			{
				s = Integer.toString( rs.getInt("pn") ) ;
				break ;
			}
			x++ ;
		}
		stmt.close() ;
		return(s) ;
	}

	public int BillNoReturn() throws SQLException
	{
		int billno = 0 ;

		ResultSet rs = stmt.executeQuery("SELECT * FROM billtbl;") ;

		while( rs.next() )
		{
			try
			{
				billno = Integer.parseInt( rs.getString("bn") ) ;
			}
			catch(NumberFormatException ne)
			{
				continue ;
			}
		}
		return(billno+1) ;
	}

	public String getData(int pn) throws SQLException
	{
		ResultSet rs = stmt.executeQuery("SELECT * FROM goodstbl WHERE pn="+pn+"") ;

		String s = rs.getString("prdct") ;
		s = s + "_" + Integer.toString( rs.getInt("rpp") ) ;

		return(s) ;
	}

	public void AddBill(String dateinput,String customer,String bn,int pr,String pname,int tp,int rpp,int totalcost,int flg) throws SQLException
	{
		String sql = "" ;
		if(flg == 0)
		{
			sql = "INSERT INTO billtbl(date,bn,pn,prdct,tot_prdct,rpp,cost)"+
			"VALUES('"+customer+"','"+""+"','"+""+"','"+""+"','"+""+"','"+""+"','"+""+"')" ;
			stmt.executeUpdate(sql) ;
		}

		sql = "INSERT INTO billtbl(date,bn,pn,prdct,tot_prdct,rpp,cost)"+
		"VALUES('"+dateinput+"','"+bn+"','"+pr+"','"+pname+"','"+tp+"','"+rpp+"','"+totalcost+"')" ;
		stmt.executeUpdate(sql) ;
	
		c.commit() ;
		stmt.close() ;
	}
	
	public int ProductReduce(int prdno,int sold) throws SQLException
	{
		ResultSet rs = stmt.executeQuery("SELECT tot_prdct FROM goodstbl WHERE pn="+prdno+";") ;

		int tot_prdct = rs.getInt("tot_prdct") ;

		int balance = tot_prdct-sold ;
		
		if(balance <= 0)
			return(tot_prdct) ;
		else
		{
			String sql ="UPDATE goodstbl SET tot_prdct="+balance+" WHERE pn="+prdno+";" ;
			stmt.executeUpdate(sql) ;
			c.commit() ;
		}
	
		stmt.close() ;
		return(0) ;
	}
	
	public void display() throws SQLException
	{
		ResultSet rs = stmt.executeQuery("SELECT * FROM billtbl") ;
		
		while( rs.next() )
		{
			System.out.print( rs.getString("date") + " " ) ;
			System.out.print( rs.getString("bn") + " " ) ;
			System.out.print( rs.getInt("pn")+ " " ) ;
			System.out.print( rs.getString("prdct")+ " " ) ;
			System.out.print( rs.getInt("tot_prdct")+ " " ) ;
			System.out.print( rs.getInt("rpp")+ " " ) ;
			System.out.print( rs.getInt("cost")+ " " ) ;
			System.out.println() ;
		}
		stmt.close() ;
	}
	
	public void goodsdisplay() throws SQLException
	{
		ResultSet rs = stmt.executeQuery("SELECT * FROM goodstbl") ;
		
		System.out.println("\n\n") ;
		
		while( rs.next() )
		{
			System.out.print( rs.getInt("pn")+ " " ) ;
			System.out.print( rs.getString("prdct")+ " " ) ;
			System.out.print( rs.getInt("tot_prdct")+ " " ) ;
			System.out.print( rs.getInt("rpp")+ " " ) ;
			System.out.println() ;
		}
		stmt.close() ;
	}
	
	public float noReturn() throws SQLException
	{
		float no = 0.0f ;

		ResultSet rs = stmt.executeQuery("SELECT * FROM dailycollecttbl;") ;

		while( rs.next() )
			no = rs.getFloat("no") ;
			
		return(no+0.01f) ;
	}
	
	public void AddDailyCollection(String dateinput,int pr,String prdname,int tp,int totalcost,float no,int flg) throws Exception
	{
		if( flg == 0 )
		{
			float getno = 0.0f ;
			ResultSet rs = stmt.executeQuery("SELECT * FROM dailycollecttbl WHERE date='"+dateinput+"';") ;

			while( rs.next() )
			{
				System.out.println("Testttt") ;
				rs.getFloat("no") ;
				if( Integer.toString(pr).equals( Integer.toString(rs.getInt("pn")) ) )
				{
					getno = rs.getFloat("no") ;
					break ;
				}
			}
			
			rs = stmt.executeQuery("SELECT prdsale,totsale FROM dailycollecttbl WHERE no="+getno+";") ;

			int prdsale = rs.getInt("prdsale") ;
			int totsale = rs.getInt("totsale") ;

			prdsale += tp ;
			totsale += totalcost ;

			String sql = "UPDATE dailycollecttbl SET prdsale="+prdsale+" WHERE no="+getno+";" ;
			stmt.executeUpdate(sql) ;
			c.commit() ;

			sql = "UPDATE dailycollecttbl SET totsale="+totsale+" WHERE no="+getno+";" ;
			stmt.executeUpdate(sql) ;
			c.commit() ;

			System.out.println("Existing data Updated") ;
			stmt.close() ;
		}
		else
		{
			String sql="INSERT INTO dailycollecttbl(no,date,pn,prdct,prdsale,totsale)"+
			"VALUES('"+no+"','"+dateinput+"','"+pr+"','"+prdname+"','"+tp+"','"+totalcost+"')" ;
			stmt.executeUpdate(sql) ;
			c.commit() ;
			System.out.println("New data added") ;
		}
		stmt.close() ;
	}
	
	public void DailyCollectDisplay() throws SQLException
	{
		ResultSet rs = stmt.executeQuery("SELECT * FROM dailycollecttbl") ;

		System.out.println("\n\n") ;

		while( rs.next() )
		{
			System.out.print( rs.getFloat("no")+ " " ) ;
			System.out.print( rs.getString("date")+ " " ) ;
			System.out.print( rs.getInt("pn")+ " " ) ;
			System.out.print( rs.getString("prdct")+ " " ) ;
			System.out.print( rs.getInt("prdsale")+ " " ) ;
			System.out.print( rs.getInt("totsale")+ " " ) ;
			System.out.println() ;
		}
		stmt.close() ;
	}

	public void CheckGoods(int n) throws SQLException
	{
		ResultSet rs = stmt.executeQuery("SELECT * FROM goodstbl WHERE pn="+n+";") ;
		int x = rs.getInt("pn") ;
		rs.close() ;
	}
	
	public String getResult(int n) throws SQLException
	{
		String s = "" ;
		ResultSet rs = stmt.executeQuery("SELECT * FROM goodstbl WHERE pn="+n+";") ;
		int pn = rs.getInt("pn") ;
		String prdct = rs.getString("prdct") ;
		int tot_prdct = rs.getInt("tot_prdct") ;
		s = Integer.toString(pn)+"_"+prdct+"_"+Integer.toString(tot_prdct) ;
		return(s) ;
	}

	public void SetNewData(int pno,int newval) throws SQLException
	{
		String sql = "UPDATE goodstbl SET tot_prdct="+newval+" WHERE pn="+pno+";" ;
		stmt.executeUpdate(sql) ;
		c.commit() ;
		stmt.close() ;
	}

	public String DateResultReturn(String d) throws SQLException
	{
		String x = "" ;

		ResultSet rs = stmt.executeQuery("SELECT date,pn,prdct,prdsale,totsale FROM dailycollecttbl WHERE date='"+d+"';") ;

		x = "\n\n   Date                  PNo.              Product           PrdSale           TotSale\n\n" ;

		while( rs.next() )
		{
			String date = rs.getString("date") ;
			for(int i = 1 ; i <= 10-date.length() ; i++)
				x = x + " " ;
			x = x + date ;

			int pn = rs.getInt("pn") ;
			for(int i = 1 ; i <= 5-Integer.toString(pn).length() ; i++)
				x = x + "     " ;
			x = x + Integer.toString(pn) ;

			String prdct = rs.getString("prdct") ;
			for(int i = 1 ; i <= 20-Integer.toString(pn).length() ; i++)
				x = x + " " ;
			x = x + prdct ;
			
			int ln = prdct.length() ;

			int prdsale = rs.getInt("prdsale") ;
 			for(int i = 1 ; i <= 20-ln; i++)
				x = x + " " ;
			x = x + Integer.toString(prdsale) ;

			int totsale = rs.getInt("totsale") ;
			for(int i = 1 ; i <= 23-Integer.toString(totsale).length() ; i++)
				x = x + " " ;
			x = x + Integer.toString(totsale) + "\n\n" ;

			System.out.println(x) ;
		}
		return(x) ;
	}
}