package com.mneedler.myappportfoilo;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.ActionBarActivity;
import android.text.Html;
import android.view.View;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    private MainActivity me;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        me = this;

        // FancyButtons are normal buttons with multi color gradient
        FancyButton fb = new FancyButton();
        fb.changeButton((Button) findViewById(R.id.button1), 1, this.getResources().getString(R.string.spotify_streamer));
        fb.changeButton((Button) findViewById(R.id.button2), 2, this.getResources().getString(R.string.scores_app));
        fb.changeButton((Button) findViewById(R.id.button3), 3, this.getResources().getString(R.string.library_app));
        fb.changeButton((Button) findViewById(R.id.button4), 4, this.getResources().getString(R.string.build_it_bigger));
        fb.changeButton((Button) findViewById(R.id.button5), 5, this.getResources().getString(R.string.bacon_reader));
        fb.changeButton((Button) findViewById(R.id.button6), 6, this.getResources().getString(R.string.capstone_my_own_app));

        // Add the OnClick listener to each of the buttons
        findViewById(R.id.button1).setOnClickListener(spotifyStreamerOnClickListener);
        findViewById(R.id.button2).setOnClickListener(scoresAppOnClickListener);
        findViewById(R.id.button3).setOnClickListener(libraryAppOnClickListener);
        findViewById(R.id.button4).setOnClickListener(buildItBiggerOnClickListener);
        findViewById(R.id.button5).setOnClickListener(baconReaderOnClickListener);
        findViewById(R.id.button6).setOnClickListener(capstoneOnClickListener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Toast.makeText(me, "A menu button was clicked.", Toast.LENGTH_SHORT).show();
        switch (item.getItemId()) {
            case R.id.about:
                about();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    // Pop up a dialog that says something about this application.
    private void about() {
    	String aboutMessage =
                "<p>Version: 1.0</p>" +
                "<br>" +
                "<p>Build Date: August 13 2015</p>" +
                "<br>" +
                "<p>Author: <b>Michael A Needler</b></p>";

    	AlertDialog.Builder aboutDialog = new AlertDialog.Builder(this);
        aboutDialog.setTitle(getResources().getString(R.string.app_name));
    	//aboutDialog.setIcon(R.drawable.otf_logo_64);
    	aboutDialog.setMessage(Html.fromHtml(aboutMessage));

    	aboutDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
    		public void onClick(DialogInterface dialog, int id) {
    			// don't do anything
    		}
    	});

    	aboutDialog.show();
    }

    //On click listener for Spotify Streamer button
    final View.OnClickListener spotifyStreamerOnClickListener = new View.OnClickListener() {
        public void onClick(final View v) {
            Toast.makeText(me, "Spotify Streamer button clicked.", Toast.LENGTH_SHORT).show();
        }
    };

    //On click listener for Scores App button
    final View.OnClickListener scoresAppOnClickListener = new View.OnClickListener() {
        public void onClick(final View v) {
            Toast.makeText(me, "Scores App button clicked.", Toast.LENGTH_SHORT).show();
        }
    };

    //On click listener for Library App button
    final View.OnClickListener libraryAppOnClickListener = new View.OnClickListener() {
        public void onClick(final View v) {
            Toast.makeText(me, "Library App button clicked.", Toast.LENGTH_SHORT).show();
        }
    };

    //On click listener for Build It Bigger button
    final View.OnClickListener buildItBiggerOnClickListener = new View.OnClickListener() {
        public void onClick(final View v) {
            Toast.makeText(me, "Build It Bigger button clicked.", Toast.LENGTH_SHORT).show();
        }
    };

    //On click listener for Bacon Reader button
    final View.OnClickListener baconReaderOnClickListener = new View.OnClickListener() {
        public void onClick(final View v) {
            Toast.makeText(me, "Bacon Reader button clicked.", Toast.LENGTH_SHORT).show();
        }
    };

    //On click listener for Capstone button
    final View.OnClickListener capstoneOnClickListener = new View.OnClickListener() {
        public void onClick(final View v) {
            Toast.makeText(me, "Capstone: My Own App button clicked.", Toast.LENGTH_SHORT).show();
        }
    };
}
