package com.example.lebenszyklus;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;

/**
 * Dies ist die erste Beispiel-App.
 * 
 * Hierbei werden _die_ Ereignis-Methoden nachgetragen, welche bei der 
 * Erstellung des Projektes nicht angelegt werden.
 * 
 * Auﬂerdem wird jede Ereignis-Methode mit einer Log-Ausschrift/Meldung 
 * versehen.
 * So kann im 'LogCat' verfolgt werden, welchen Zustand die App in Abh‰ngig-
 * keit der Bedienhandlungen einnimmt.
 * 
 * @see http://developer.android.com/reference/android/app/Activity.html
 */
public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Log.i("maInfo", "onCreate()");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		Log.i("maInfo", "onCreateOptionsMenu()");
		return true;
	}
	
	// /////////////////////////////////////////////////////////////////////////
	// Dies wurde hinzugefuegt
	// /////////////////////////////////////////////////////////////////////////
	
	@Override
	protected void onStart() {
		super.onStart();
		Log.i("maInfo", "onStart()");
	}
	
	@Override
	protected void onRestart() {
		super.onRestart();
		Log.i("maInfo", "onRestart()");
	}
	
	@Override
	protected void onResume() {
		super.onResume();
		Log.i("maInfo", "onResume()");
	}
	
	@Override
	protected void onPause() {
		super.onPause();
		Log.i("maInfo", "onPause()");
	}
	
	@Override
	protected void onStop() {
		super.onStop();
		Log.i("maInfo", "onStop()");
	}
	
	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.i("maInfo", "onDestroy()");
	}

}
