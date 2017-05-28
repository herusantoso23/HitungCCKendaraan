package com.example.hitun;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	EditText txtDiameter, txtLangkahKerja, txtJumlahSilinder, txtHasil;
	Button btnVolume, btnReset;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        txtDiameter = (EditText) findViewById(R.id.diameter);
        txtLangkahKerja = (EditText) findViewById(R.id.langkahKerja);
        txtJumlahSilinder = (EditText) findViewById(R.id.jumlahSilinder);
        txtHasil = (EditText) findViewById(R.id.hasil);
        btnVolume = (Button) findViewById(R.id.hitung);
        btnReset = (Button) findViewById(R.id.reset);
        
        btnVolume.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
		        Double d, l, k, n, v;
		        d = Double.parseDouble(String.valueOf(txtDiameter.getText()));
		        l = Double.parseDouble(String.valueOf(txtLangkahKerja.getText()));
		        k = 3.14;
		        n = Double.parseDouble(String.valueOf(txtJumlahSilinder.getText()));

		        v = (k * d * d * l * n) / 4;
		        
		        txtHasil.setText(""+v + " CC");
				
			}
		});
        
        btnReset.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				txtDiameter.setText("");
				txtLangkahKerja.setText("");
				txtJumlahSilinder.setText("");
				txtHasil.setText("");
				
			}
		});
       
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
