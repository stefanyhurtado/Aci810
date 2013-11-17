package com.example.catedra2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
	
	
	public final static String NAME_VALUE = "com.example.catedra2.NAME_VALUE";
    public final static String SURNAME_VALUE = "com.example.catedra2.SURNAME_VALUE";
    public final static String FECHADENACIMIENTO_VALUE = "com.example.catedra2.FECHADENACIMIENTO_VALUE";
    public final static String USER_VALUE = "com.example.catedra2.USER_VALUE";
    public final static String EMAIL_VALUE = "com.example.catedra2.EMAIL_VALUE";
    public final static String PASSWORD_VALUE = "com.example.catedra2.PASSWORD_VALUE";
   

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

	
	  public void onClickSetting(View view){
          Intent intent = new Intent(this,PrimeraActivity.class);
          
          EditText nameEditText = (EditText) findViewById(R.id.editText1);
          String name = nameEditText.getText().toString();
          EditText surnameEditText = (EditText) findViewById(R.id.editText2);
          String surname = surnameEditText.getText().toString();
          EditText fechadenacimientoEditText = (EditText) findViewById(R.id.editText3);
          String fechadenacimiento = fechadenacimientoEditText.getText().toString();
          EditText userEditText = (EditText) findViewById(R.id.editText4);
          String user = userEditText.getText().toString();
          EditText emailEditText = (EditText) findViewById(R.id.emailField);
          String email = emailEditText.getText().toString();
          EditText passwordEditText = (EditText) findViewById(R.id.editText5);
          String password = passwordEditText.getText().toString(); 
          
               
          SharedPreferences sharedPref = getSharedPreferences("preferences",Context.MODE_PRIVATE);
          
          SharedPreferences.Editor editor = sharedPref.edit();
          
          editor.putString(NAME_VALUE,name);
          editor.putString(SURNAME_VALUE,surname);
          editor.putString(FECHADENACIMIENTO_VALUE,fechadenacimiento);
          editor.putString(USER_VALUE,user);
          editor.putString(EMAIL_VALUE,email);
          editor.putString(PASSWORD_VALUE,password);
          
          editor.commit();
          startActivity(intent);
         


}
}

