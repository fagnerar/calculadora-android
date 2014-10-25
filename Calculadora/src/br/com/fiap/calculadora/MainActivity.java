package br.com.fiap.calculadora;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
//Teste
public class MainActivity extends Activity {
	
	private EditText etNum1;
	private EditText etNum2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		etNum1 = (EditText) findViewById(R.id.etNum1);
		etNum2 = (EditText) findViewById(R.id.etNum2);
	}
	
	public void calcular(View v) {
		String sn1 = etNum1.getText().toString();
		String sn2 = etNum2.getText().toString();
		
		float num1 = Float.parseFloat(sn1);
		float num2 = Float.parseFloat(sn2);
		
		AlertDialog.Builder builder = new Builder(this);
		builder.setTitle(R.string.dialogSoma);
		builder.setMessage(String.valueOf(num1+num2));
		
		builder.show();
	}

}
