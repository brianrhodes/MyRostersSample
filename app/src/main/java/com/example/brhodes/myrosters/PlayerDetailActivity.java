package com.example.brhodes.myrosters;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class PlayerDetailActivity extends AppCompatActivity {

    TextView nameTextView;
    TextView ageTextView;
    TextView schoolTextView;
    TextView heightTextView;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_detail);

        nameTextView = (TextView)findViewById(R.id.nameTextView);
        ageTextView = (TextView)findViewById(R.id.ageTextView);
        schoolTextView = (TextView)findViewById(R.id.schoolTextView);
        heightTextView = (TextView)findViewById(R.id.heightTextView);
        imageView = (ImageView)findViewById(R.id.imageView);

        // Player Name
        String playerName = (String)getIntent().getExtras().get("PlayerName");
        nameTextView.setText(playerName);

        // Player Age, school, height and image
        if (playerName.equals("Maddie Rhodes")) {
            imageView.setImageResource(R.mipmap.alex);
            ageTextView.setText("Age: 16");
            schoolTextView.setText("School: Undecided");
            heightTextView.setText("Height: 5'7\"");
        } else if (playerName.equals("Maddie McCarthy")) {
            imageView.setImageResource(R.mipmap.abbey);
            ageTextView.setText("Age: 17");
            schoolTextView.setText("School: UNH");
            heightTextView.setText("Height: 5'2\"");
        } else if (playerName.equals("Maggie Barden")) {
            imageView.setImageResource(R.mipmap.brandi);
            ageTextView.setText("Age: 18");
            schoolTextView.setText("School: Union");
            heightTextView.setText("Height: 5'9\"");
        } else if (playerName.equals("Julia Looby")) {
            imageView.setImageResource(R.mipmap.carli);
            ageTextView.setText("Age: 19");
            schoolTextView.setText("School: UMass");
            heightTextView.setText("Height: 5'6\"");
        } else if (playerName.equals("Morgan Palma")) {
            imageView.setImageResource(R.mipmap.messi);
            ageTextView.setText("Age: 20");
            schoolTextView.setText("School: UCLA");
            heightTextView.setText("Height: 5'5.5\"");
        } else if (playerName.equals("Keelie Verbeek")) {
            imageView.setImageResource(R.mipmap.mia);
            ageTextView.setText("Age: 21");
            schoolTextView.setText("School: Florida State");
            heightTextView.setText("Height: 5'4\"");
        } else if (playerName.equals("Visi Rizos")) {
            imageView.setImageResource(R.mipmap.ronaldo);
            ageTextView.setText("Age: 22");
            schoolTextView.setText("School: Duke");
            heightTextView.setText("Height: 5'2\"");
        }
    }
}
