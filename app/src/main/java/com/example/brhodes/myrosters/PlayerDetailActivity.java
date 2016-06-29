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
        Bundle b = getIntent().getExtras();
        Player thisPlayer = (Player)b.getParcelable("PlayerClassSerialized");
        nameTextView.setText(thisPlayer.getName());
        imageView.setImageResource(thisPlayer.getPlayerPictureResId());
        ageTextView.setText(thisPlayer.getAge());
        schoolTextView.setText(thisPlayer.getSchool());
        heightTextView.setText(thisPlayer.getHeight());
    }
}
