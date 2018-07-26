package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


import young.project.android.com.libandroid.JokeDisplayActivity;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void tellJoke(View view) {
        new EndpointsAsyncTask().execute(this);
    }

    class EndpointsAsyncTask extends AsyncTask<Context, Void, String> {
        private Context context;

        @Override
        protected String doInBackground(Context ... params) {
            context = params[0];
            return JokeApi.getJokeFromApi();
        }

        @Override
        protected void onPostExecute(String result) {
            if(!TextUtils.isEmpty(result)) {
                Intent intent = new Intent(context, JokeDisplayActivity.class);
                intent.putExtra(JokeDisplayActivity.JOKE_EXTRA_INTENT_KEY, result);
                startActivity(intent);
            } else {
                String errorMessage = getResources().getString(R.string.joke_retrieval_error);
                Toast.makeText(context, errorMessage, Toast.LENGTH_LONG)
                        .show();
            }
        }
    }


}
