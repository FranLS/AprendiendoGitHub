package com.example.aprendiendogithub;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	private boolean ontouche7(){
		final String testeo = "blabla";
		return false;
	}
	private boolean funcionsoloLOCAL(){
		final String testeo2 = "akakaka";
		return false;
	}
	private boolean functionFran(){
		return true;
	}
}
