import java.net.*;
import java.io.*;

class socketClass
{
	public static void main(String args[]) throws IOException
	{
		String hostname = "www.sunnetwork.in";
		int portNo = 80;
		
		try {
			Socket socket = new Socket(hostname,portNo);
			PrintWriter printWriter = new PrintWriter(socket.getOutputStream(),true);
			BufferedReader br = new BufferedReader( new InputStreamReader(socket.getInputStream().read()));

			String str = "";

			while( (str = br.readLine()) != null ) {
				System.out.println("hai");
				System.out.println( str );
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}