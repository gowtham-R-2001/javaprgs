import java.io.*;

class eof {

    public static void main(String[] args) throws Exception
    {
           String eof = "end-of-file";
           String[] arr = new String[1000] ;
           int cnt = 0 ;
           BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
           while( true )
           {
               arr[cnt] = br.readLine() ;
               if( arr[cnt].contains("end-of-file") )
               {
                    cnt++;
                    break;
               }
               cnt++;
           }

           for(int i = 0 ; i < cnt ; i++ )
           {
               System.out.println( (i+1) + " " + arr[i] ) ;
           }
    }
}
