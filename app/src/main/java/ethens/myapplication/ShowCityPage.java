package ethens.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import ethens.myapplication.base.BaseActivity;

/**
 * Created by ethens on 29/09/17.
 */

public class ShowCityPage extends BaseActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {

    super.onCreate(savedInstanceState);

    //stop track of activity transition
    stopTrackTIme("TimeTakenShowCityPage");

    setContentView(R.layout.activity_show_city);
    View view = findViewById(R.id.showCityPage);

    Button button = view.findViewById(R.id.button);
    TextView tv = view.findViewById(R.id.cityName);
    button.setText("CityImage");
    tv.setText("New Delhi");

    button.setOnClickListener(l->{
      startTrackTime("TimeTakenShowCityPage");
     Intent intent = new Intent(this,ShowImage.class);
      startActivity(intent);

    });

  }
}
