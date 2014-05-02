package com.intriguos.aid;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import com.intriguos.aid.classes.RegisteringUser;

public class SetupIntroductionActivity extends AidActivity {
	
	private Button continue_setup_user_type;
	private Intent setup_user_type_intent;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.setup_introduction_activity);
		
		continue_setup_user_type = (Button) findViewById(R.id.continue_setup_user_type);
		setup_user_type_intent = new Intent(SetupIntroductionActivity.this, SetupUserTypeActivity.class);
		
		RegisteringUser user = (RegisteringUser)getIntent().getSerializableExtra("registering_user");
		Log.v("User details", user.getUsername());
		
		setup_user_type_intent.putExtra("registering_user", user);


		addClickListenerAndFinish(continue_setup_user_type, setup_user_type_intent);
	}
}
