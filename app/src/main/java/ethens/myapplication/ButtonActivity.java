package ethens.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import ethens.myapplication.base.BaseActivity;

public class ButtonActivity extends BaseActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {

    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_button);
    View view = findViewById(R.id.linearlayout);
    Button button = view.findViewById(R.id.button);
    /*button.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View view) {
        new TrakrHandler(this::startTimer);
      }

      public Object startTimer(Object eventName){
        Long startTime = System.currentTimeMillis();
        //fetch API
        return startTime;
      }
    });*/

    button.setOnClickListener(l -> {
      startTrackTime("TimeTakenShowCityPage");
      Intent intent = new Intent(this,ShowCityPage.class);
      intent.putExtra("interface", new ApiCallback(){

        @Override public Object onResponse(Object from) {
          return
        }
      });
      startActivity(intent);
    });
  }




}
