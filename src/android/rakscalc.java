package cordova-plugin-rakscalc;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class rakscalc extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if(action.equals("add")){
            this.add(args,callbackContext);
            return true;
        }
        return false;
    }

    private void add(JSONArray args, CallbackContext callback){
        if(args !=null){
            try{
                int p1 = Interger.parse(args.getJSONObject(0).getString("param1"))
                   int p2 = Interger.parse(args.getJSONObject(0).getString("param1"))
                   callback.success(""+ (p1+p2));
            }catch(Exception ex){

            }
        }else {
            callback.error('Passed null value')
        }
    }
}
