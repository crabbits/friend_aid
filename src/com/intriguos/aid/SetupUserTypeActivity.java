package com.intriguos.aid;

import com.intriguos.aid.classes.RegisteringUser;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class SetupUserTypeActivity extends AidActivity {

	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.setup_user_type_activity);
		
		RegisteringUser user = (RegisteringUser)getIntent().getSerializableExtra("registering_user");
		Log.v("User details", user.getUsername());
		
	}
}
