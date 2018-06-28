package com.udacity.gradle.builditbigger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import ru.prog_edu.myandroidlib.AndroidLibActivity;
import ru.prog_edu.myjokes.Jokes;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    private Button showJokeButton;
    private Button launchLibActivityButton;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);

        showJokeButton = root.findViewById(R.id.show_toast_joke_btn);
        showJokeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), Jokes.getRandomJoke(), Toast.LENGTH_LONG).show();
            }
        });

// it was created for launch android library:
/*        launchLibActivityButton = root.findViewById(R.id.launch_library_activity);
        launchLibActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(getActivity(), AndroidLibActivity.class);
                myIntent.putExtra("RANDOM_JOKE", Jokes.getRandomJoke());
                startActivity(myIntent);
            }
        });*/

        return root;
    }
}
