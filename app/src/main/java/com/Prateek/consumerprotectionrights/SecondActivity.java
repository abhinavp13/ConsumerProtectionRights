package com.Prateek.consumerprotectionrights;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

import android.support.v4.app.NavUtils;

public class SecondActivity extends Activity implements OnClickListener {

		ImageButton obj,obj1,obj2,obj3,obj4,obj5;
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_second);
			DisplayMetrics dm = new DisplayMetrics();
			getWindowManager().getDefaultDisplay().getMetrics(dm);
			int height = dm.heightPixels;
			int width = dm.widthPixels;
			
			obj = (ImageButton) findViewById(R.id.imageButton1);
		    obj1 = (ImageButton) findViewById(R.id.imageButton2);
		    obj2 = (ImageButton) findViewById(R.id.imageButton3);
		    obj3 = (ImageButton) findViewById(R.id.imageButton4);
		    obj4 = (ImageButton) findViewById(R.id.imageButton5);
		    obj5 = (ImageButton) findViewById(R.id.imageButton6);
		    obj.setOnClickListener(this);
		    obj1.setOnClickListener(this);
		    obj2.setOnClickListener(this);
		    obj3.setOnClickListener(this);
		    obj4.setOnClickListener(this);
		    obj5.setOnClickListener(this);
	}

	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.second, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			// This ID represents the Home or Up button. In the case of this
			// activity, the Up button is shown. Use NavUtils to allow users
			// to navigate up one level in the application structure. For
			// more details, see the Navigation pattern on Android Design:
			//
			// http://developer.android.com/design/patterns/navigation.html#up-vs-back
			//
			NavUtils.navigateUpFromSameTask(this);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	@Override
	public void onBackPressed() {
	    new AlertDialog.Builder(this)
	           .setMessage("Are you sure you want to exit?")
	           .setCancelable(false)
	           .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
	               public void onClick(DialogInterface dialog, int id) {
	                   SecondActivity.this.finish();
	               }
	           })
	           .setNegativeButton("No", null)
	           .show();
	}



	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent in;
		switch(v.getId())
		{
		case R.id.imageButton1:
			 in = new Intent(this,NumberOneActivity.class);
			 this.startActivity(in);
			 break;
		case R.id.imageButton3:
			 in = new Intent(this,NumberTwoActivity.class);
			 this.startActivity(in);
			 break;	 
		case R.id.imageButton2:
			 in = new Intent(this,NumberThreeActivity.class);
			 this.startActivity(in);
			 break;
		case R.id.imageButton4:
			 in = new Intent(this,NumberFiveActivity.class);
			 this.startActivity(in);
			 break;
			 
		case R.id.imageButton5:
			in = new Intent(this,NumberFourActivity.class);
			this.startActivity(in);
			break;	 
		case R.id.imageButton6:
			 in = new Intent(this,NumberSixActivity.class);
			 this.startActivity(in);
			 break;	  	 
		
		
		}
	}

}
