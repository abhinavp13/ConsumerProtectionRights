package com.Prateek.consumerprotectionrights;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class NumberThreeActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_number_three);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.number_three, menu);
		return true;
	}

}
