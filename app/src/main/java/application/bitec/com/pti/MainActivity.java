package application.bitec.com.pti;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (!DetectConnection.checkInternetConnection(this)) {
            Toast.makeText(getApplicationContext(), "No Internet Connection!", Toast.LENGTH_SHORT).show();
        } else {
            // create webview
            WebView myWebView = (WebView) findViewById(R.id.webview);
            myWebView.loadUrl("http://biochem-international.com/pti/");
            // javascript enabled
            WebSettings webSettings = myWebView.getSettings();
            webSettings.setJavaScriptEnabled(true);
            // handles page navigation
            myWebView.setWebViewClient(new WebViewClient());
        }
    }

    // Function to load all URLs in same webview
    //private class CustomWebViewClient extends WebViewClient {
        //public boolean shouldOverrideUrlLoading(WebView view, String url) {
            //if (!DetectConnection.checkInternetConnection(this)) {
               // Toast.makeText(getApplicationContext(), "No Internet!", Toast.LENGTH_SHORT).show();
            //} else {
              //  view.loadUrl(url);
            //}
           // return true;
       // }
    //}
}
