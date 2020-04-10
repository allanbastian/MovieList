package com.allan.movielist.ui;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.allan.movielist.R;
import com.allan.movielist.adapter.MovieRecyclerAdapter;
import com.allan.movielist.data.model.MovieCallObj;
import com.allan.movielist.data.model.MovieResponse;
import com.allan.movielist.data.remote.ApiUtils;
import com.allan.movielist.data.result.MovieResult;

import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Objects;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ContentActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MovieRecyclerAdapter adapter;
    private ProgressDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);
        dialog = new ProgressDialog(ContentActivity.this);
        dialog.setTitle("Please wait...");
        dialog.show();
        MovieCallObj obj = new MovieCallObj("movies", "telugu", "all", "voting");
        Call<MovieResponse> call = ApiUtils.getAPIService().getMovies(obj);
        call.enqueue(new Callback<MovieResponse>() {
            @Override
            public void onResponse(@NotNull Call<MovieResponse> call, @NotNull Response<MovieResponse> response) {
                if (!response.isSuccessful()) {
                    Log.e("Server error", "" + response.code());
                    Toast.makeText(ContentActivity.this, "" + response.code(), Toast.LENGTH_SHORT).show();
                } else {
                    List<MovieResult> data = response.body().getResult();
                    recyclerView = findViewById(R.id.move_recycler);
                    adapter = new MovieRecyclerAdapter(data, getApplicationContext());
                    recyclerView.setAdapter(adapter);
                    recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                    dialog.dismiss();
                }
            }

            @Override
            public void onFailure(@NotNull Call<MovieResponse> call, @NotNull Throwable t) {
                Log.e("Callback failure", t.getMessage());
                Toast.makeText(ContentActivity.this, "Please check your internet connection", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
