package id.web.freelancer.example;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

public class TCActivity extends Activity {
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        setContentView(R.layout.tc);
        
        Uri data = getIntent().getData();
        Log.i("LOG", "FULL URI: " + data.toString());
        Log.i("LOG", "QUERY: " + data.getQuery());
        Log.i("LOG", "PATH:" + data.getPath());
        Log.i("LOG", "HOST:" + data.getHost());
        Log.i("LOG", "PARAM1:" + data.getQueryParameter("param1"));
	}

}
