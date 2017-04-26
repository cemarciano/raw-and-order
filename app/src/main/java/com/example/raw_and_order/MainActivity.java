package com.example.raw_and_order;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Called when the user clicks the search button
    public void searchButtonClick(){
        Intent goToSearch = new Intent(this, SearchActivity.class);
        startActivity(goToSearch);
    }
}
