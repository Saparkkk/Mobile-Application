package app.ubu.projectmycar;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class car_detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_detail);

        Intent intent = getIntent();
        String carName = intent.getStringExtra("CarName");
        String carImgUrl = intent.getStringExtra("CarImgUrl");
        String carPrice = intent.getStringExtra("CarPrice");
        String carModel = intent.getStringExtra("CarModel");
        String carYear = intent.getStringExtra("CarYear");
        String carDescription = intent.getStringExtra("CarDescription");

        ImageView carImageView = findViewById(R.id.icon);
        TextView textViewName = findViewById(R.id.secondLine);
        TextView textViewPrice = findViewById(R.id.firstLine);
        TextView textViewModel = findViewById(R.id.textViewModel);
        TextView textViewYear = findViewById(R.id.textViewYear);
        TextView textViewDescription = findViewById(R.id.textViewDescription);

        textViewName.setText(carName);
        textViewPrice.setText("ราคา: " + carPrice + " บาท");
        textViewModel.setText("รุ่น: " + carModel);
        textViewYear.setText("ปี: " + carYear);
        textViewDescription.setText("รายละเอียด: " + carDescription);

        // โหลดรูปภาพด้วย Glide
        Glide.with(this)
                .load(carImgUrl)
                .into(carImageView);
    }
}

