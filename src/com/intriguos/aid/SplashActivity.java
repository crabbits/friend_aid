package com.intriguos.aid;

import android.content.Intent;
import android.os.Bundle;

import com.parse.Parse;

public class SplashActivity extends AidActivity {

	private Intent signup_login_intent;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash_activity);
	
		signup_login_intent = new Intent(SplashActivity.this, SignupLoginActivity.class);
		
		try {
		  Parse.initialize(this, "VD62QSvjm7LS16uWXf1SHSHPx0YYm4SFLSXwIvvI", "7fiBeKFe8z05MPEFOjqMNmys0HzUMoroCqERcWWF");
		  startActivity(signup_login_intent);
		  finish();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
