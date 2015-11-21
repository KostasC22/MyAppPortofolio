package com.havistudio.myappportofolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);
        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);
        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);
        Button button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(this);
        Button button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(this);
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

    @Override
    public void onClick(View v) {
        Toast toast;
        switch(v.getId()){
            case R.id.button:
                toast = Toast.makeText(getApplicationContext(), "This button will launch my spotify streamer app", Toast.LENGTH_SHORT);
                break;
            case R.id.button2:
                toast = Toast.makeText(getApplicationContext(), "This button will launch my scores app", Toast.LENGTH_SHORT);
                break;
            case R.id.button3:
                toast = Toast.makeText(getApplicationContext(), "This button will launch my library app", Toast.LENGTH_SHORT);
                break;
            case R.id.button4:
                toast = Toast.makeText(getApplicationContext(), "This button will launch my build it bigger app", Toast.LENGTH_SHORT);
                break;
            case R.id.button5:
                toast = Toast.makeText(getApplicationContext(), "This button will launch my xyz reader", Toast.LENGTH_SHORT);
                break;
            case R.id.button6:
                toast = Toast.makeText(getApplicationContext(), "This button will launch my capstone app", Toast.LENGTH_SHORT);
                break;
            default:
                toast = Toast.makeText(getApplicationContext(), "This button show you that something is wrong", Toast.LENGTH_SHORT);
                break;
        }
        toast.show();
    }
}
