package com.dania.dataapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    MoviesRecyclerViewAdapter adapter;
    ArrayList<Movies> objmovies = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        // Memasukkan data

        objmovies.add(new Movies("The Suicide Squad", "Action, Adventure, Comedy", "James Gunn", "7.3", "Supervillains Harley Quinn, Bloodsport, Peacemaker and a collection of nutty cons at Belle Reve prison join the super-secret, super-shady Task Force X as they are dropped off at the remote, enemy-infused island of Corto Maltese.", "6 Agustus 2021"));
        objmovies.add(new Movies("Loki", "Action, Adventure, Fantasy", "Michael Waldron", "8.4", "The mercurial villain Loki resumes his role as the God of Mischief in a new series that takes place after the events of “Avengers: Endgame.", "9 Juni 2021"));
        objmovies.add(new Movies("Logan", "Action, Drama, Sci-Fi", "James Mangold", "8.1", "In a future where mutants are nearly extinct, an elderly and weary Logan leads a quiet life. But when Laura, a mutant child pursued by scientists, comes to him for help, he must get her to safety.", "3 Maret 2021"));

        adapter = new MoviesRecyclerViewAdapter(objmovies);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
    }
}