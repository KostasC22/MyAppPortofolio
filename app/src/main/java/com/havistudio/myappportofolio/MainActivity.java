package com.havistudio.myappportofolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity{

    @Bind(R.id.buttonSpotifyStreamer)
    Button buttonSpotifyStreamer;
    @Bind(R.id.buttonScoresApp)
    Button buttonScoresApp;
    @Bind(R.id.buttonLibraryApp)
    Button buttonLibraryApp;
    @Bind(R.id.buttonBuildItBigger)
    Button buttonBuildItBigger;
    @Bind(R.id.buttonXYZReader)
    Button buttonXYZReader;
    @Bind(R.id.buttonCapstoneApp)
    Button buttonCapstoneApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ButterKnife.bind(this);
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

    @OnClick(R.id.buttonSpotifyStreamer)
    protected void toastSpotStre(){
        showToast("This button will launch my spotify streamer app");
    }

    @OnClick(R.id.buttonScoresApp)
    protected void toastScorApp(){
        showToast("This button will launch my scores app");
    }

    @OnClick(R.id.buttonLibraryApp)
    protected void toastLibApp(){
        showToast("This button will launch my library app");
    }

    @OnClick(R.id.buttonBuildItBigger)
    protected void toastBuiBig(){
        showToast("This button will launch my build it bigger app");
    }

    @OnClick(R.id.buttonXYZReader)
    protected void toastXYZRed(){
        showToast("This button will launch my xyz reader");
    }

    @OnClick(R.id.buttonCapstoneApp)
    protected void toast(){
        showToast("This button will launch my capstone app");
    }

    protected void showToast(String message){
        Toast.makeText(getApplicationContext(),message,Toast.LENGTH_LONG).show();
    }

}
