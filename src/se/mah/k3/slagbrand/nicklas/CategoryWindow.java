package se.mah.k3.slagbrand.nicklas;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class CategoryWindow extends Activity implements OnClickListener {
	
	
/**laddar activiteten "categoryactivity" och hittar knappen "yrken" som anvands i onClick metoden langst ner.*/
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.categoryactivity);
		Button b = (Button) findViewById(R.id.WorkBtn);
		b.setOnClickListener(this);
		
	}
/**knapptrycket skickar vidare till nasta fonster, dvs den valda spelkategorin.*/
	@Override
	public void onClick(View v) {
	Button b = (Button) v;
	Intent i = new Intent(this,GameWindowWork.class);
	startActivity(i);
	finish();
	
	
		
	}


}
