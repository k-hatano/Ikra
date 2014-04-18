package jp.nita.ikra;

import jp.nita.ikra.util.SystemUiHider;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.webkit.WebView;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 * 
 * @see SystemUiHider
 */
public class FullscreenActivity extends Activity {
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fullscreen);
		
		WebView webView=(WebView)findViewById(R.id.webView);
		webView.loadUrl("http://www.google.com/");
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_fullscreen, menu);
		return true;
	}

}
