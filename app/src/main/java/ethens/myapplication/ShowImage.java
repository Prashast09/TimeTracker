package ethens.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;
import ethens.myapplication.base.BaseActivity;

/**
 * Created by ethens on 29/09/17.
 */

public class ShowImage extends BaseActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {

    super.onCreate(savedInstanceState);

    setContentView(R.layout.activity_show_image);
    View view = findViewById(R.id.show_image);
    ImageView image = view.findViewById(R.id.imageView);

    Picasso.with(this)
          .load("https://static.pexels.com/photos/5256/city-cars-road-houses.jpg")
          .into(image);

    stopTrackTIme("TimeTakenShowCityPage");
    }
  }