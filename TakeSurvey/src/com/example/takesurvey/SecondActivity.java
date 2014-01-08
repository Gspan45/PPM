package com.example.takesurvey;

import java.io.File;
import java.io.IOException;

import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends Activity implements OnClickListener {

	EditText text;
	EditText xmloutput;
	Button but;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		but = (Button)findViewById(R.id.load_survey);
        but.setOnClickListener(this);
	}

	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.second, menu);
		return true;
	}
	
	org.jdom.Document doc;
	File f = null;
	String path;
	
	
	public void onClick(View view) {
		text = (EditText) findViewById(R.id.edit_name);
		
		xmloutput = (EditText) findViewById(R.id.XML_Ausgabe);
	    // used later
	    path = text.getText().toString();
		
		try{
	    f = new File("Adressbuch.xml");
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	    
	    try{
	    	SAXBuilder builder = new SAXBuilder();
	    	doc = builder.build(f);
	    // XMLOutputter fmt = new XMLOutputter();
  	
	    	org.jdom.Element element = doc.getRootElement();
	    	
	    	xmloutput.setText(element.toString());
	    }catch(JDOMException e){
	    	e.printStackTrace();
	    }catch(IOException e){
	    	e.printStackTrace();
	    }
		

	 }
}
