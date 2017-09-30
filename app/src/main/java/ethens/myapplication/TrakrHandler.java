package ethens.myapplication;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.provider.Settings;
import android.support.v4.math.MathUtils;

/**
 * Created by ethens on 29/09/17.
 */

public class TrakrHandler {


  public TrakrHandler(ApiCallback apiCallback) {
    getHandler(false).post(() -> apiCallback.onResponse(System.currentTimeMillis()));
  }

  private Handler getHandler(boolean runOnUiThread) {
    Looper looper;
    int randomId = (int) (Math.random() * 99);
    if (!runOnUiThread) {
      HandlerThread handlerThread = new HandlerThread("trakrThread" + randomId);
      handlerThread.start();
      looper = handlerThread.getLooper();
    } else {
      looper = Looper.getMainLooper();
    }

    return new Handler(looper) {
      @Override public void handleMessage(Message msg) {

      }
    };
  }

}
