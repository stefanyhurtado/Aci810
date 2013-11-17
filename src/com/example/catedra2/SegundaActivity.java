package com.example.catedra2;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;

public class SegundaActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_segunda);
	}
	
	SharedPreferences shadPref = getSharedPreferences("prefLog",Context.MODE_PRIVATE);
	String name = shadPref.getString(MainActivity.NAME_VALUE, "not set");
	String surname = shadPref.getString(MainActivity.SURNAME_VALUE, "not set");
	String fechadenacimiento = shadPref.getString(MainActivity.FECHADENACIMIENTO_VALUE, "not set");
	String email = shadPref.getString(MainActivity.EMAIL_VALUE, "not set");
    String user = shadPref.getString(MainActivity.USER_VALUE, "not set");
    String passaword = shadPref.getString(MainActivity.PASSWORD_VALUE, "not set");


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.segunda, menu);
		return true;
	}

}
