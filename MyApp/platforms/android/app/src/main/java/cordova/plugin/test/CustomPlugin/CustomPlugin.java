package cordova.plugin.test;

import android.content.Intent;
import android.webkit.WebView;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

import cordova.plugin.test.WebViewActivity;

/**
 * This class echoes a string called from JavaScript.
 */
public class CustomPlugin extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("showWebPage")) {
            this.showWebPage(args.getString(0));
            return true;
        }
        return false;
    }

    private void showWebPage(String url) {
        cordova.getActivity().runOnUiThread(() -> {
            Intent intent = new Intent(cordova.getActivity(), WebViewActivity.class);
            intent.putExtra(WebViewActivity.KEY_URL, url);
            cordova.getActivity().startActivity(intent);
//            WebView webView = new WebView(cordova.getActivity());
//            webView.loadUrl(url);
        });
    }
}
