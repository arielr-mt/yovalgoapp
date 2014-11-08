package net.armacode.yovalgoapp;

import net.armacode.yovalgoapp.DerechosActivity;
import net.armacode.yovalgoapp.InfoViolenciaActivity;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		/**
         * Creating all buttons instances
         * */
        Button btn_infoviolencia = (Button) findViewById(R.id.btn_infoviolencia);
        
        Button btn_derechos = (Button) findViewById(R.id.btn_derechos);
        
        Button btn_testimonios = (Button) findViewById(R.id.btn_testimonios);
        
        Button btn_denuncia = (Button) findViewById(R.id.btn_denuncia);
        
        Button btn_ayuda = (Button) findViewById(R.id.btn_ayuda);
        
        Button btn_quiz = (Button) findViewById(R.id.btn_quiz);
        
        /**
         * Handling all button click events
         * */
        
        btn_infoviolencia.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				// Launching News Feed Screen
				Intent i = new Intent(getApplicationContext(), InfoViolenciaActivity.class);
				startActivity(i);
			}
		});
        
        btn_derechos.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				// Launching News Feed Screen
				Intent i = new Intent(getApplicationContext(), DerechosActivity.class);
				startActivity(i);
			}
		});
        
        btn_testimonios.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				Toast.makeText(MainActivity.this,"Oops, hay un problema con la conexion al servidor, intentalo mas tarde", Toast.LENGTH_SHORT).show();
			}
		});
        
        btn_denuncia.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent i = new Intent(getApplicationContext(), DenunciaActivity.class);
				startActivity(i);
			}
		});
        
        btn_ayuda.setOnClickListener(new View.OnClickListener() {	
			@Override
			public void onClick(View view) {
				Intent i = new Intent(getApplicationContext(), AyudaActivity.class);
				startActivity(i);
			}
		});
        
        // Listening to Photos button click
        btn_quiz.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				// Launching News Feed Screen
				Intent i = new Intent(getApplicationContext(), QuizActivity.class);
				startActivity(i);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
