package com.hengtan.nanodegreeapp.mynanodegreeapps;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    private Button spotifyBtn;
    private Button scoreBtn;
    private Button libraryBtn;
    private Button buildBtn;
    private Button xyzBtn;
    private Button capstoneBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spotifyBtn = (Button) findViewById(R.id.spotifyBtn);
        scoreBtn = (Button) findViewById(R.id.scoresBtn);
        libraryBtn = (Button) findViewById(R.id.libraryBtn);
        buildBtn = (Button) findViewById(R.id.buildBtn);
        xyzBtn = (Button) findViewById(R.id.xyzBtn);
        capstoneBtn = (Button) findViewById(R.id.capstoneBtn);

        spotifyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.this.onSpotifyBtnClick((Button) view);
            }
        });

        scoreBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.this.onScoreBtnClick((Button) view);
            }
        });

        libraryBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.this.onLibraryBtnClick((Button) view);
            }
        });

        buildBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.this.onBuildBtnClick((Button) view);
            }
        });

        xyzBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.this.onXyzBtnClick((Button) view);
            }
        });

        capstoneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.this.onCapstoneBtnClick((Button) view);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onSpotifyBtnClick(View v) {
        // Display toast message
        Toast.makeText(getApplicationContext(),
                "This button will launch my spotify streamer app!",
                Toast.LENGTH_LONG).show();
    }

    public void onScoreBtnClick(View v) {
        // Display toast message
        Toast.makeText(getApplicationContext(),
                "This button will launch scores app!",
                Toast.LENGTH_LONG).show();
    }

    public void onLibraryBtnClick(View v) {
        // Display toast message
        Toast.makeText(getApplicationContext(),
                "This button will launch library app!",
                Toast.LENGTH_LONG).show();
    }

    public void onBuildBtnClick(View v) {
        // Display toast message
        Toast.makeText(getApplicationContext(),
                "This button will launch build it bigger app!",
                Toast.LENGTH_LONG).show();
    }

    public void onXyzBtnClick(View v) {
        // Display toast message
        Toast.makeText(getApplicationContext(),
                "This button will launch xyz reader app!",
                Toast.LENGTH_LONG).show();
    }

    public void onCapstoneBtnClick(View v) {
        // Display toast message
        Toast.makeText(getApplicationContext(),
                "This button will launch my capstone app!",
                Toast.LENGTH_LONG).show();
    }
}
