package sg.edu.rp.c346.id19036308.demoimageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    //Declare the ImageView object called ivDay2
    ImageView ivDay2,ivDay3, ivDay4, ivDay5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get the ImageView obj and assign to ivDay2
        ivDay2 = (ImageView) findViewById(R.id.imageView2);
        // Set the image
        ivDay2.setImageResource(R.drawable.day2);
        // Get the ImageView obj and assign to ivDay2
        ivDay3 = (ImageView) findViewById(R.id.imageView3);
        // Set the image
        ivDay3.setImageResource(R.drawable.day3);

        // Get the ImageView obj and assign to ivDay2
        ivDay4 = (ImageView) findViewById(R.id.imageView4);
        // Set the image
        ivDay4.setImageResource(R.drawable.day4);

        // Get the ImageView obj and assign to ivDay2
        ivDay5 = (ImageView) findViewById(R.id.imageView5);
        // Set the image
        ivDay5.setImageResource(R.drawable.day5);

    }
}