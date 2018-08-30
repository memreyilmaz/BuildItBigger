package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.android.detailactivity.DetailActivity;


public class MainActivity extends AppCompatActivity implements EndpointsAsyncTask.JokeRetrieverListener {
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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

    public void tellJoke(View view) {
        //getTheJoke();
        //Toast.makeText(this, joke, Toast.LENGTH_SHORT).show();
        //new EndpointsAsyncTask(this).execute();
        new EndpointsAsyncTask(this).execute();
    }

    /*public void getTheJoke(){
        Joker myJoker = new Joker();
        joke = myJoker.getJoke();
    }*/

    public void launchDetailActivity(View view) {
        //Joker myJoker = new Joker();
        //joke = myJoker.getJoke();
        //  Intent myIntent = new Intent(this, DetailActivity.class);
        //  myIntent.putExtra("key", joke);
        //  startActivity(myIntent);
    }

    @Override
    public void onJokeRetrieved(String joke) {
        Intent myIntent = new Intent(this, DetailActivity.class);
        myIntent.putExtra("key", joke);
        startActivity(myIntent);
    }

   /* @Override
    public void onJokeRetrieved(String joke) {
          Intent myIntent = new Intent(this, DetailActivity.class);
          myIntent.putExtra("key", joke);
          startActivity(myIntent);

    }*/
}


