package com.example.brhodes.myrosters;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    ArrayList<Player> myRoster = new ArrayList<Player>();

    ListView rosterListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createRoster();
        rosterListView = (ListView)findViewById(R.id.rosterListView);
        ArrayAdapter<Player> rosterAdapter = new ArrayAdapter<Player>(getBaseContext(), android.R.layout.simple_list_item_1, myRoster);
        rosterListView.setAdapter(rosterAdapter);

        rosterListView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent moveToDetailIntent = new Intent(getApplicationContext(), PlayerDetailActivity.class);
        moveToDetailIntent.putExtra("PlayerClassSerialized", myRoster.get(position));
        startActivity(moveToDetailIntent);
    }

    public void createRoster() {
        Player newPlayer = new Player("Maddie Rhodes", "16", "UPenn", "5'7\"", R.mipmap.alex);
        myRoster.add(newPlayer);
        newPlayer = new Player("Maddie McCarthy", "17", "UMass", "5'4\"", R.mipmap.brandi);
        myRoster.add(newPlayer);
        newPlayer = new Player("Maggie Barden", "18", "Union", "5'3\"", R.mipmap.abbey);
        myRoster.add(newPlayer);
        newPlayer = new Player("Carli Llyod", "19", "Rutgers", "5'2\"", R.mipmap.carli);
        myRoster.add(newPlayer);
        newPlayer = new Player("Lionel Messi", "20", "Argentina", "5'1\"", R.mipmap.messi);
        myRoster.add(newPlayer);
        newPlayer = new Player("Mia Hamm", "21", "USA", "5'0\"", R.mipmap.mia);
        myRoster.add(newPlayer);
        newPlayer = new Player("Christaano Ronaldo", "22", "Barcelona", "5'11\"", R.mipmap.ronaldo);
        myRoster.add(newPlayer);


    }
}
