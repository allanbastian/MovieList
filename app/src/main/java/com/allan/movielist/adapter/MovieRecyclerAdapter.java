package com.allan.movielist.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.allan.movielist.R;
import com.allan.movielist.data.result.MovieResult;
import com.allan.movielist.ui.PosterActivity;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MovieRecyclerAdapter extends RecyclerView.Adapter<MovieRecyclerAdapter.MyViewHolder> {

    private List<MovieResult> data = new ArrayList<>();
    private LayoutInflater inflater;
    private Context context;

    public MovieRecyclerAdapter(List<MovieResult> data, Context context) {
        this.data = data;
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.movie_row_layout, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        final MovieResult current = data.get(position);
        holder.Title.setText("Title: " + current.getTitle());
        holder.Language.setText("Language: " + current.getLanguage());
        holder.Director.setText("Director: " + current.getDirector());
        holder.Writer.setText("Writers: " + current.getWriters());
        holder.Stars.setText("Stars: " + current.getStars());
        holder.Company.setText("Company: " + current.getProductionCompany());
        holder.Poster.setText("Poster Link: " + current.getPoster());
        /*String uri = current.getPoster();
        try {
            URL url = new URL(uri);
            Bitmap bitmap = BitmapFactory.decodeStream(url.openConnection().getInputStream());
            holder.Poster.setImageBitmap(bitmap);
        } catch (Exception e) {
            Log.e("URL error", Objects.requireNonNull(e.getLocalizedMessage()));
            e.printStackTrace();
            Toast.makeText(context, "Image url is bad", Toast.LENGTH_SHORT).show();
        }*/
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView Title, Language, Director, Writer, Stars, Company, Poster;
        //ImageView Poster;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            Title = itemView.findViewById(R.id.title);
            Language = itemView.findViewById(R.id.language);
            Director = itemView.findViewById(R.id.director);
            Writer = itemView.findViewById(R.id.writer);
            Stars = itemView.findViewById(R.id.stars);
            Company = itemView.findViewById(R.id.company);
            Poster = itemView.findViewById(R.id.poster);
        }
    }
}
