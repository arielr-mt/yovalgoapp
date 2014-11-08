package net.armacode.yovalgoapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ResultadoB1 extends Activity{
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultadob1_layout);
        Button btn_volver = (Button) findViewById(R.id.btn_volver_rb1);
        btn_volver.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent i=new Intent(getApplicationContext(), MainActivity.class);
		        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		        startActivity(i);
			}
		});
    }
}
