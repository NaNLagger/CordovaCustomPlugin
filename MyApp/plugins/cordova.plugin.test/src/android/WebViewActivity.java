package cordova.plugin.test;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebViewActivity extends Activity {

    public static final String KEY_URL = "key.url";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WebView myWebView = new WebView(this);
        setContentView(myWebView);
        myWebView.setWebViewClient(new cordova.plugin.test.MyWebViewClient());
        myWebView.loadUrl(getIntent().getStringExtra(KEY_URL));
    }
}
