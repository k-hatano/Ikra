package jp.nita.ikra;

import jp.nita.ikra.util.SystemUiHider;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 * 
 * @see SystemUiHider
 */
public class FullscreenActivity extends Activity {
	

	@SuppressLint("SetJavaScriptEnabled")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fullscreen);
		
		WebView webView=(WebView)findViewById(R.id.webView);
		webView.setWebViewClient(new WebViewClient());
		
		webView.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
		webView.setVerticalScrollbarOverlay(true);
		
		webView.getSettings().setJavaScriptEnabled(true);
		
		webView.getSettings().setSupportZoom(true);
		webView.getSettings().setSavePassword(true);
		webView.getSettings().setBuiltInZoomControls(true);
		webView.getSettings().setLoadWithOverviewMode(true);
		webView.getSettings().setUseWideViewPort(true);
		
		webView.getSettings().setUserAgentString("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/28.0.1500.52 Safari/537.36");
		
		webView.getSettings().setDefaultZoom(WebSettings.ZoomDensity.FAR);
		
		webView.loadUrl("https://www.icloud.com/");	
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_fullscreen, menu);
		return true;
	}

}
