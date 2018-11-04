package cordova.plugin.test;

import android.webkit.WebView;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

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
            WebView webView = new WebView(cordova.getActivity());
            webView.loadUrl(url);
        });
    }
}
