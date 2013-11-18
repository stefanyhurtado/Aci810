package com.example.catedra2;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.widget.EditText;
import android.widget.TextView;

public class SegundaActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_segunda);
	}
	
	SharedPreferences shadPref = getSharedPreferences("preferences",Context.MODE_PRIVATE);
	String name = shadPref.getString(MainActivity.NAME_VALUE, "not set");
	String surname = shadPref.getString(MainActivity.SURNAME_VALUE, "not set");
	String fechadenacimiento = shadPref.getString(MainActivity.FECHADENACIMIENTO_VALUE, "not set");
	String email = shadPref.getString(MainActivity.EMAIL_VALUE, "not set");
    String user = shadPref.getString(MainActivity.USER_VALUE, "not set");
    String passaword = shadPref.getString(MainActivity.PASSWORD_VALUE, "not set");
    
    EditText name2 = (EditText)findViewById(R.id.editText9);
    name2.setText(Name);
    EditText surname2 = (EditText)findViewById(R.id.editText10);
    surname2.setText(Surname);
    EditText fechadenacimiento2 = (EditText)findViewById(R.id.editText11);
    fechadenacimiento2.setText(Fechadenacimiento2);
    EditText user2 = (EditText)findViewById(R.id.editText12);
    user2.setText(user);
    EditText email2= (EditText)findViewById(R.id.editText13);
    email2.setText(Email);
    EditText password2 = (EditText)findViewById(R.id.ediText14);
    password2.setText(Password);
    
    
    
   



	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.segunda, menu);
		return true;
	}
	
     }



