package ethens.myapplication.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import ethens.myapplication.Utility;

/**
 * Created by ethens on 29/09/17.
 */

public class BaseActivity  extends AppCompatActivity{

  @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

  }

  /**
   * START TRACKING OF EVENT
   * @param eventName NAME OF EVENT
   */
  public void startTrackTime(String eventName){
    Utility.putInt(this,eventName,System.currentTimeMillis());
  }

  /**
   * STOPS TRACKING OF EVENT AND LOGS THE TIME TAKEN BY THE EVENT
   * @param eventName EVENT NAME
   */
  public void stopTrackTIme(String eventName){
    Long startTIme = Utility.getLong(this,eventName,0L);
    System.out.print((System.currentTimeMillis() - startTIme));
    Log.e(eventName, eventName + String.valueOf((System.currentTimeMillis() - startTIme)));
  }


}
