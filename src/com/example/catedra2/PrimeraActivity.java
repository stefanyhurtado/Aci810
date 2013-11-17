package com.example.catedra2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class PrimeraActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_primera);
		
		public final static String USER_VALUE = "com.example.catedra2.USER_VALUE";
	    public final static String PASSWORD_VALUE = "com.example.catedra2.PASSWORD_VALUE";
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.primera, menu);
		return true;
	}
	 public void onClickLogin(View view){
         Intent intent = new Intent(this,PrimeraActivity.class);
         
         EditText emailEditText = (EditText) findViewById(R.id.editText7);
         String email = emailEditText.getText().toString();
         EditText passwordEditText = (EditText) findViewById(R.id.ediText8);
         String password = passwordEditText.getText().toString(); 
         
         
         SharedPreferences sharedPref = getSharedPreferences("preferences",Context.MODE_PRIVATE);
         
         Boolean b = sharedPref.getBoolean("is-Registred",true) ;        
        
         
         
         SharedPreferences.Editor editor = sharedPref.edit();
         
         editor.putString(USER_VALUE,user);
         editor.putString(EMAIL_VALUE,email);
         editor.putString(PASSWORD_VALUE,password);
         
         
         editor.commit();
         startActivity(intent);
        
	 }
	
	public void OnClickProfile(View view){
        Intent intent = new Intent(this,SegundaActivity.class);
        startActivity(intent);


}
}
        

