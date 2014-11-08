package net.armacode.util;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

import android.os.AsyncTask;

public class SendDenuncia extends AsyncTask<String,Void,String>{
	public int res;
	public String response;
	private String nombre;
	private String denuncia;
	private String ciudad;
	public SendDenuncia(){
		response="VACIO";
	}
	
	@Override
	protected String doInBackground(String... params) {
		nombre=(String)params[0];
		ciudad=(String)params[1];
		denuncia=(String)params[2];
		try{
		String link="http://yovalgo.comyr.com/insert.php";
		String data  = URLEncoder.encode("nombre", "UTF-8") 
	            + "=" + URLEncoder.encode(nombre, "UTF-8");
	            data += "&" + URLEncoder.encode("ciudad", "UTF-8") 
	            + "=" + URLEncoder.encode(ciudad, "UTF-8");
	            data += "&" + URLEncoder.encode("denuncia", "UTF-8") 
	    	            + "=" + URLEncoder.encode(denuncia, "UTF-8");
	            URL url = new URL(link);
	            URLConnection conn = url.openConnection(); 
	            conn.setDoOutput(true); 
	            OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream()); 
	            wr.write( data ); 
	            wr.flush(); 
	            BufferedReader reader = new BufferedReader (new InputStreamReader(conn.getInputStream()));
	            StringBuilder sb = new StringBuilder();
	            String line = null;
	            System.out.println(reader.toString());
	            // Read Server Response
	            while((line = reader.readLine()) != null)
	            {
	               sb.append(line);
	               break;
	            }
	            if(sb.equals("OK")==true){
	            	res=1;
	            }
	            else{
	            	res=0;
	            }
	            response=sb.toString();
	            return sb.toString();
		}catch(Exception e){
			response="Exc:"+ e.getMessage();
			System.out.println("Exception: " + e.getMessage());
			return new String("Exception: " + e.getMessage());
            
         }
		
	}

}
