package com.example.takesurvey;
import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity implements OnClickListener {
	
	private Button user_confirm;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		user_confirm = (Button)findViewById(R.id.user_confirm);
		user_confirm.setOnClickListener(new View.OnClickListener() 
					{
						
						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							Intent i = new Intent(MainActivity.this, LoadSurveyActivity.class);
							i.putExtra("user","R.string.enter_your_name");
							startActivity(i);
							
							
						}
					}
				);
		
		
	}
	

	/*
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
*/

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Button nameField = (Button) findViewById(R.id.user_confirm);
		String name = nameField.getText().toString();
		if (name.length() == 0) {
		    new AlertDialog.Builder(this) 
		            .setMessage(R.string.error_name_missing)
		            .setNeutralButton(R.string.error_ok, null)
		            .show();
		    return;
		}
		/*
		 * zum Testen
		if (v == user_confirm)
		{
		    int resourceId = v == user_confirm ? R.string.hi_user
		            : R.string.hello_greeting; 

		    String greeting = getResources().getString(resourceId, name);
		    Toast.makeText(this, greeting, Toast.LENGTH_LONG).show();
		
		    TextView greetingField = (TextView) findViewById(R.id.greeting_field);
		    greetingField.setText(greeting);
		    
		}*/
	}

}
