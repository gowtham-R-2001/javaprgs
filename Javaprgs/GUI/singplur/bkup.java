if( (evnt.getSource() == opt1) && (opt1flg == 0) )
			{
				if( quesrand[cnt] == 0 )
				{
					s1 = right[ arr[cnt] ] ;
					
					tf1.setText( "                                              " + s1 ) ;
				
					opt1.setBackground( Color.GREEN ) ;
					
					opt1.setForeground( Color.BLACK ) ;
					
					//
					
					opt2.setBackground( Color.RED ) ;
					
					opt2.setForeground( Color.WHITE ) ;
					
					tf1.setBackground( Color.GREEN ) ;
					
					tf1.setForeground( Color.BLACK ) ;
					
					if(scrflg == 0)
						scr++ ;
					
					System.out.println("SCR : "  + scr ) ;
				
					scrflg = 1 ;
				}
				
				if( quesrand[cnt] == 1 )
				{
					s2 = wrong[ arr[cnt] ] ;
					
					tf1.setText("                                              " + s2 ) ;
				
					opt1.setBackground( Color.RED ) ;
					
					opt1.setForeground( Color.WHITE ) ;
					
					//
					
					opt2.setBackground( Color.GREEN ) ;
					
					opt2.setForeground( Color.BLACK ) ;
					
					tf1.setBackground( Color.RED ) ;
					
					tf1.setForeground( Color.WHITE ) ;
				}
				
				bflg = 0 ;	opt2flg = 1 ;
			}
			
			if( (evnt.getSource() == opt2) && (opt2flg == 0) )
			{
				if( quesrand[cnt] == 1 )
				{
					s1 = right[ arr[cnt] ] ;

					tf1.setText( "                                              " + s1 ) ;
				
					opt2.setBackground( Color.GREEN ) ;
					
					opt2.setForeground( Color.BLACK ) ;
					
					//
					
					opt1.setBackground( Color.RED ) ;
					
					opt1.setForeground( Color.WHITE ) ;
					
					tf1.setBackground( Color.GREEN ) ;
					
					tf1.setForeground( Color.BLACK ) ;
					
					if(scrflg == 0)
						scr++ ;
					
					System.out.println("SCR : "  + scr ) ;
				
					scrflg = 1 ;
				}
				
				if( quesrand[cnt] == 0 )
				{
					s2 = wrong[ arr[cnt] ] ;

					tf1.setText("                                              " + s2 ) ;
				
					opt2.setBackground( Color.RED ) ;
					
					opt2.setForeground( Color.WHITE ) ;
					
					//
					
					opt1.setBackground( Color.GREEN ) ;
					
					opt1.setForeground( Color.BLACK ) ;
					
					tf1.setBackground( Color.RED ) ;
					
					tf1.setForeground( Color.WHITE ) ;
				}
					bflg = 0 ;	opt1flg = 1 ;
			}
			
			
			if( (evnt.getSource() == subsubnext) && (bflg == 0) )
			{
				tf1.setText("") ;
				
				opt1.setBackground( new java.awt.Color(255,255,153) ) ;
				
				opt2.setBackground( new java.awt.Color(255,255,153) ) ;
				
				tf1.setBackground( Color.WHITE ) ;
				
				opt1.setForeground( Color.BLACK ) ;
				
				opt2.setForeground( Color.BLACK ) ;

				cnt++ ;
				
				ques.setText(  (cnt+1) + " . " + str[ arr[cnt] ] ) ;
				
				quesnum.setText("Question ") ;
				
				quesnum1.setText( (cnt+1) + " / 10") ;
				
				if( quesrand[cnt] == 0 )
				{
					opt1.setText( right[ arr[cnt] ] ) ;
					
					opt2.setText( wrong[ arr[cnt] ] ) ;
				}
				
				else
				{
					opt2.setText( right[ arr[cnt] ] ) ;
					
					opt1.setText( wrong[ arr[cnt] ] ) ;
				}
				
				bflg = 1 ;	scrflg = 0 ;	opt1flg = 0 ;	opt2flg = 0 ;	nxtflg = 0 ;
				
				if( cnt > 5 )
				{
					quesnum.setVisible(false) ;
					ques.setVisible(false) ;
					score.setVisible( false ) ;
					opt2.setVisible(false) ;
					opt1.setVisible(false) ;
					subsubnext.setVisible(false) ;
					tf1.setVisible(false)  ;
					quesnum1.setVisible(false) ;
					score1.setVisible(false) ;
					JOptionPane.showMessageDialog(null,"Good play !") ;
				}
				
				subnext.setText("Submit") ;
			}
			
			score.setText( "Score : " ) ;
			
			score1.setText( " " + scr ) ;
		}