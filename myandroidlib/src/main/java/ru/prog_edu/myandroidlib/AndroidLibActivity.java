package ru.prog_edu.myandroidlib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AndroidLibActivity extends AppCompatActivity {

    private TextView randomJokeTextView;
    //private String randomJoke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_lib);
        randomJokeTextView = findViewById(R.id.random_joke_textView);
/*        randomJoke = getIntent().getStringExtra("RANDOM_JOKE");
        randomJokeTextView.setText(randomJoke);*/
        //new EndpointsAsyncTask().execute();

        String jokeFromGce = this.getIntent().getStringExtra("JOKE_FROM_GCE");
        randomJokeTextView.setText(jokeFromGce);

    }
}
