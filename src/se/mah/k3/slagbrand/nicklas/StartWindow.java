package se.mah.k3.slagbrand.nicklas;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class StartWindow extends Activity implements OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.startactivity);
		Button b = (Button) findViewById(R.id.Btn2);
		b.setOnClickListener(this);
	}
	/**laddar activiteten "categoryactivity" och hittar knappen "yrken" som anvands i onClick metoden langst ner.*/
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	/**knapptrycket skickar vidare till nasta fonster, dvs dar du ska valja spelkategorin.*/
	@Override
	public void onClick(View v) {
		Button b = (Button) v;
		Intent i = new Intent(this,CategoryWindow.class);
		startActivity(i);
		finish();
		
	}

}
