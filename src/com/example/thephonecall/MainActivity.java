package com.example.thephonecall;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	private Button button;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		button=(Button)findViewById(R.id.buttonCall);
		
		
		button.setOnClickListener(new View.OnClickListener(){
			
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			
				
				Intent callIntent=new Intent(Intent.ACTION_CALL);
				callIntent.setData(Uri.parse("tel:9029526913"));
				startActivity(callIntent);
			}
		});
	}


}
