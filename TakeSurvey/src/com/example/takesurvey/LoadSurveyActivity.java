package com.example.takesurvey;

import com.example.takesurvey.R.id;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TextView;

public class LoadSurveyActivity extends Activity {
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.load_survey);
		
		Bundle extras = getIntent().getExtras();
		if( extras == null ){
			return;
			
		}

		String name = extras.getString(Intent.EXTRA_TEXT);
		
		TextView greetingField = (TextView) findViewById(R.id.greeting_field);
	    greetingField.setText(name);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.load_survey, menu);
		return true;
	}

}
