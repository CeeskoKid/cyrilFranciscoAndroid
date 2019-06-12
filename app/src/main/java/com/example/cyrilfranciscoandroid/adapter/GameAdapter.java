package com.example.cyrilfranciscoandroid.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cyrilfranciscoandroid.R;
import com.example.cyrilfranciscoandroid.business.Game;

import java.util.List;

public class GameAdapter extends RecyclerView.Adapter<GameAdapter.ViewHolder> {
    private View.OnClickListener clic;
    private List<Game> games;

    public GameAdapter(View.OnClickListener clic, List<Game> games) {
        this.clic = clic;
        this.games = games;
    }

    @NonNull
    @Override
    public GameAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ConstraintLayout v =
                (ConstraintLayout)
                        LayoutInflater.from(parent.getContext())
                                .inflate(R.layout.item_game, parent, false);
        v.setOnClickListener(clic);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull GameAdapter.ViewHolder holder, int position) {
        ConstraintLayout v = holder.v;
        TextView textName = v.findViewById(R.id.game_name);
        TextView textCountGame = v.findViewById(R.id.count_game);
        ImageView imageView = v.findViewById(R.id.game_img);
        textName.setText(games.get(position).getName());
        //Picasso.get().load(games.get(position).getImg()).into(imageView);
    }

    @Override
    public int getItemCount() {
        return games.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private ConstraintLayout v;

        public ViewHolder(ConstraintLayout v) {
            super(v);
            this.v = v;
        }
    }
}
