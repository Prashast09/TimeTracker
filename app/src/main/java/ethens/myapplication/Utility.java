package ethens.myapplication;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by ethens on 29/09/17.
 */

public class Utility {

  public static void putInt(Context context, String key, Long value) {
    final SharedPreferences.Editor editor =
        context.getSharedPreferences("trakr", Context.MODE_PRIVATE)
            .edit();
    editor.putLong(key, value);
    editor.apply();
  }

  public static Long getLong(Context context, String key, long defaultValue){
    final SharedPreferences preferences =
        context.getSharedPreferences("trakr", Context.MODE_PRIVATE);

    return preferences.getLong(key, defaultValue);
  }
}
