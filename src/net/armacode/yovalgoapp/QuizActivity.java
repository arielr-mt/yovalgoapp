package net.armacode.yovalgoapp;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import net.armacode.util.Util;

public class QuizActivity extends Activity {
	private RadioGroup rgPregunta1,rgPregunta2,rgPregunta3,rgPregunta4,rgPregunta5,rgPregunta6,rgPregunta7,rgPregunta8,rgPregunta9,rgPregunta10,rgPregunta11,rgPregunta12,rgPregunta13,rgPregunta14,rgPregunta15;
	private RadioButton rbPregunta;
	private Button btnEvaluar;
	
	private String errores;
	private boolean error;
	
	private int total;
	
	 /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz_layout);
       
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
        
        addListenerOnButtonEvaluar();
    }
    public void addListenerOnButtonEvaluar() {
    	
    	
    	rgPregunta1 = (RadioGroup) findViewById(R.id.rg_pregunta1);
    	rgPregunta2 = (RadioGroup) findViewById(R.id.rg_pregunta2);
    	rgPregunta3 = (RadioGroup) findViewById(R.id.rg_pregunta3);
    	rgPregunta4 = (RadioGroup) findViewById(R.id.rg_pregunta4);
    	rgPregunta5 = (RadioGroup) findViewById(R.id.rg_pregunta5);
    	rgPregunta6 = (RadioGroup) findViewById(R.id.rg_pregunta6);
    	rgPregunta7 = (RadioGroup) findViewById(R.id.rg_pregunta7);
    	rgPregunta8 = (RadioGroup) findViewById(R.id.rg_pregunta8);
    	rgPregunta9 = (RadioGroup) findViewById(R.id.rg_pregunta9);
    	rgPregunta10 = (RadioGroup) findViewById(R.id.rg_pregunta10);
    	rgPregunta11 = (RadioGroup) findViewById(R.id.rg_pregunta11);
    	rgPregunta12 = (RadioGroup) findViewById(R.id.rg_pregunta12);
    	rgPregunta13 = (RadioGroup) findViewById(R.id.rg_pregunta13);
    	rgPregunta14 = (RadioGroup) findViewById(R.id.rg_pregunta14);
    	rgPregunta15 = (RadioGroup) findViewById(R.id.rg_pregunta15);
    	btnEvaluar = (Button) findViewById(R.id.btnEvaluar);
     
    	btnEvaluar.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				String errores="Se te olvido responder las preguntas: ";
		    	boolean error=false;
		    	int total=0;
		    	int seleccionado=0;
		    	
			    // pregunta 1
    			seleccionado = rgPregunta1.getCheckedRadioButtonId();
    			if(seleccionado>=0){
    				rbPregunta = (RadioButton) findViewById(seleccionado);
    				total+=Util.evaluarRespuesta((String) rbPregunta.getText());
    			}else{
    				errores+="1,"; error=true;
    			}
    			// pregunta 2
    			seleccionado = rgPregunta2.getCheckedRadioButtonId();
    			if(seleccionado>=0){
    				rbPregunta = (RadioButton) findViewById(seleccionado);
    				total+=Util.evaluarRespuesta((String) rbPregunta.getText());
    			}else{
    				errores+="2,"; error=true;
    			}
    			// pregunta 3
    			seleccionado = rgPregunta3.getCheckedRadioButtonId();
    			if(seleccionado>=0){
    				rbPregunta = (RadioButton) findViewById(seleccionado);
    				total+=Util.evaluarRespuesta((String) rbPregunta.getText());
    			}else{
    				errores+="3,"; error=true;
    			}
    			// pregunta 4
    			seleccionado = rgPregunta4.getCheckedRadioButtonId();
    			if(seleccionado>=0){
    				rbPregunta = (RadioButton) findViewById(seleccionado);
    				total+=Util.evaluarRespuesta((String) rbPregunta.getText());
    			}else{
    				errores+="4,"; error=true;
    			}
    			// pregunta 5
    			seleccionado = rgPregunta5.getCheckedRadioButtonId();
    			if(seleccionado>=0){
    				rbPregunta = (RadioButton) findViewById(seleccionado);
    				total+=Util.evaluarRespuesta((String) rbPregunta.getText());
    			}else{
    				errores+="5,"; error=true;
    			}
    			// pregunta 6
    			seleccionado = rgPregunta6.getCheckedRadioButtonId();
    			if(seleccionado>=0){
    				rbPregunta = (RadioButton) findViewById(seleccionado);
    				total+=Util.evaluarRespuesta((String) rbPregunta.getText());
    			}else{
    				errores+="6,"; error=true;
    			}
    			// pregunta 7
    			seleccionado = rgPregunta7.getCheckedRadioButtonId();
    			if(seleccionado>=0){
    				rbPregunta = (RadioButton) findViewById(seleccionado);
    				total+=Util.evaluarRespuesta((String) rbPregunta.getText());
    			}else{
    				errores+="7,"; error=true;
    			}
    			// pregunta 8
    			seleccionado = rgPregunta8.getCheckedRadioButtonId();
    			if(seleccionado>=0){
    				rbPregunta = (RadioButton) findViewById(seleccionado);
    				total+=Util.evaluarRespuesta((String) rbPregunta.getText());
    			}else{
    				errores+="8,"; error=true;
    			}
    			// pregunta 9
    			seleccionado = rgPregunta9.getCheckedRadioButtonId();
    			if(seleccionado>=0){
    				rbPregunta = (RadioButton) findViewById(seleccionado);
    				total+=Util.evaluarRespuesta((String) rbPregunta.getText());
    			}else{
    				errores+="9,"; error=true;
    			}
    			// pregunta 10
    			seleccionado = rgPregunta10.getCheckedRadioButtonId();
    			if(seleccionado>=0){
    				rbPregunta = (RadioButton) findViewById(seleccionado);
    				total+=Util.evaluarRespuesta((String) rbPregunta.getText());
    			}else{
    				errores+="10,"; error=true;
    			}
    			// pregunta 11
    			seleccionado = rgPregunta11.getCheckedRadioButtonId();
    			if(seleccionado>=0){
    				rbPregunta = (RadioButton) findViewById(seleccionado);
    				total+=Util.evaluarRespuesta((String) rbPregunta.getText());
    			}else{
    				errores+="11,"; error=true;
    			}
    			// pregunta 12
    			seleccionado = rgPregunta12.getCheckedRadioButtonId();
    			if(seleccionado>=0){
    				rbPregunta = (RadioButton) findViewById(seleccionado);
    				total+=Util.evaluarRespuesta((String) rbPregunta.getText());
    			}else{
    				errores+="12,"; error=true;
    			}
    			// pregunta 13
    			seleccionado = rgPregunta13.getCheckedRadioButtonId();
    			if(seleccionado>=0){
    				rbPregunta = (RadioButton) findViewById(seleccionado);
    				total+=Util.evaluarRespuesta((String) rbPregunta.getText());
    			}else{
    				errores+="13,"; error=true;
    			}
    			// pregunta 14
    			seleccionado = rgPregunta14.getCheckedRadioButtonId();
    			if(seleccionado>=0){
    				rbPregunta = (RadioButton) findViewById(seleccionado);
    				total+=Util.evaluarRespuesta((String) rbPregunta.getText());
    			}else{
    				errores+="14,"; error=true;
    			}
    			// pregunta 15
    			seleccionado = rgPregunta15.getCheckedRadioButtonId();
    			if(seleccionado>=0){
    				rbPregunta = (RadioButton) findViewById(seleccionado);
    				total+=Util.evaluarRespuesta((String) rbPregunta.getText());
    			}else{
    				errores+="15,"; error=true;
    			}
    			errores=errores.substring(0, errores.length()-1);
    			
    			
    			if(error==true){
    				Toast.makeText(QuizActivity.this,errores, Toast.LENGTH_SHORT).show();
    			}
    			else{
    				if(total>=0 && total <=3){
    					Intent i = new Intent(getApplicationContext(), ResultadoA.class);
    					startActivity(i);
    				}else if(total>3 && total <=15){
    					Intent i = new Intent(getApplicationContext(), ResultadoB1.class);
    					startActivity(i);
    				}else if(total>15 && total <=30){
    					Intent i = new Intent(getApplicationContext(), ResultadoB2.class);
    					startActivity(i);
    				}else {
    					Intent i = new Intent(getApplicationContext(), ResultadoC.class);
    					startActivity(i);
    				}

    				//Toast.makeText(QuizActivity.this,""+total, Toast.LENGTH_SHORT).show();
    			}
			}
    	});
      }
    
    public String getErrores() {
		return errores;
	}
	public void setErrores(String errores) {
		this.errores = errores;
	}
	public boolean isError() {
		return error;
	}
	public void setError(boolean error) {
		this.error = error;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
}
