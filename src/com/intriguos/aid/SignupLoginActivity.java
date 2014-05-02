package com.intriguos.aid;

import java.io.Serializable;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.intriguos.aid.classes.RegisteringUser;

public class SignupLoginActivity extends AidActivity {

	private EditText username;
	private EditText password;
	private Button login_signup;
	private TextView error_message;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.signup_login_activity);
	
		login_signup = (Button) findViewById(R.id.login_signup_button);
	    username = (EditText) findViewById(R.id.username_field);
	    password = (EditText) findViewById(R.id.password_field);
	    error_message = (TextView) findViewById(R.id.login_signup_error_message);
	    
		login_signup.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				signupLoginUser();
			}
		});
	}
	
	private void signupLoginUser() {
		String username_string = username.getText().toString();
		String password_string = password.getText().toString();
		if (username_string.equals("") ||
				password_string.equals("")) {
			renderLoginSignupErrors();
		} else {
			loginOrSignupUser(username_string, password_string);
		}
	}
	
	private void renderLoginSignupErrors() {
		error_message.setVisibility(View.VISIBLE);
		if (username.getText().toString() == "" ) {
			//TODO highlight the text area
		}
		
		if (password.getText().toString() == "") {
			//TODO highlight the text area
		}
	}
	
	private void loginOrSignupUser(String username, String password) {
		
		RegisteringUser user = new RegisteringUser();
		
		user.setUsername(username);
		user.setPassword(password);
		
		Intent setup_introduction_intent = new Intent(SignupLoginActivity.this, SetupIntroductionActivity.class);
		setup_introduction_intent.putExtra("registering_user", user);
		startActivity(setup_introduction_intent);
		finish();
	}

}
