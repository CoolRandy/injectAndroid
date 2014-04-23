package com.example.injectdemo;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends D3Activity {
    
	@ViewInject(id = R.id.input) EditText editText;
	@ViewInject(click="btnClick") TextView btn1,btn2,btn3;
	
    public void onCreate(Bundle savedInstanceState) {  
        super.onCreate(savedInstanceState);  
        setContentView(R.layout.activity_main);  
    }  

	public void btnClick(View v){
    	
    	switch (v.getId()) {
		case R.id.btn1:
			btn1.setText(editText.getText().toString());
			Toast.makeText(getApplicationContext(), "111", Toast.LENGTH_SHORT).show();
			break;
		
		case R.id.btn2:
			Toast.makeText(getApplicationContext(), "222", Toast.LENGTH_SHORT).show();

			break;
			
		case R.id.btn3:
			Toast.makeText(getApplicationContext(), "333", Toast.LENGTH_SHORT).show();
			break;

		default:
			break;
		}
    	
    }
    
}
