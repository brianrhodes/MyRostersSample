package com.example.brhodes.myrosters;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    String[] myRoster = new String[] {"Maddie Rhodes", "Maddie McCarthy", "Visi Rizos", "Maggie Barden", "Julia Looby", "Morgan Palma", "Keelie Verbeek"};

    ListView rosterListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rosterListView = (ListView)findViewById(R.id.rosterListView);
        ArrayAdapter<String> rosterAdapter = new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_list_item_1, myRoster);
        rosterListView.setAdapter(rosterAdapter);

        rosterListView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent moveToDetailIntent = new Intent(getBaseContext(), PlayerDetailActivity.class);
        moveToDetailIntent.putExtra("PlayerName", myRoster[position]);
        startActivity(moveToDetailIntent);
    }

}
