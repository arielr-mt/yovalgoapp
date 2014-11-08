package net.armacode.yovalgoapp;
import net.armacode.util.SendDenuncia;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class DenunciaActivity extends Activity {

	private EditText et_nombre,et_denuncia;
	private Spinner sp_ciudad;
	 /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.denuncia_layout);
       
        //return home
        Button btn_home = (Button) findViewById(R.id.btn_home);
        btn_home.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent i=new Intent(getApplicationContext(), MainActivity.class);
		        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		        startActivity(i);
			}
		});
        
	    Spinner spinner = (Spinner) findViewById(R.id.sp_ciudad);
		 ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
		         R.array.ciudades, android.R.layout.simple_spinner_item);
		 adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		 spinner.setAdapter(adapter);
		 
        //enviar
		 Button btn_enviar=(Button)findViewById(R.id.btn_enviar);
		 btn_enviar.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				String nombre,ciudad,denuncia;
				
				sp_ciudad=(Spinner) findViewById(R.id.sp_ciudad);
				et_nombre = (EditText)findViewById(R.id.et_nombre);
			    et_denuncia = (EditText)findViewById(R.id.et_denuncia);
				
				ciudad= (String) sp_ciudad.getSelectedItem();
				nombre= (String) et_nombre.getText().toString();
				denuncia= (String) et_denuncia.getText().toString();
				SendDenuncia enviar=new SendDenuncia();
				enviar.res=0;
				enviar.execute(nombre,ciudad,denuncia);
				/*if(SendDenuncia.res!=0){
					Toast.makeText(DenunciaActivity.this,""+nombre+","+ciudad+","+denuncia, Toast.LENGTH_SHORT).show();
				}
				else{
					Toast.makeText(DenunciaActivity.this,"NO", Toast.LENGTH_SHORT).show();
				}*/
				Toast.makeText(DenunciaActivity.this,"Gracias por enviar tu denuncia "+nombre, Toast.LENGTH_SHORT).show();
			}
		});
    }
    
   
}
