package com.example.project;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project.b22dansa;
import com.example.project.R;
import com.squareup.picasso.Picasso;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    public ArrayList<b22dansa> B22dansaList = new ArrayList<>();

    public MyAdapter() {
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.list_items, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        b22dansa item = this.B22dansaList.get(position);
        holder.Name.setText("Model: " + item.getName()); // Name
        holder.Company.setText("Manufacturer: " + item.getCompany()); // Company
        holder.Location.setText("Location: " + item.getLocation());
        holder.Category.setText("Engine: " + item.getCategory()); // Category
        holder.Size.setText("Max Speed: " + Integer.toString(item.getSize()) + " km/h"); //
        holder.Cost.setText("HP: " + Integer.toString(item.getCost())); // Cost
        Picasso.get().load(item.getImg()).into(holder.img);

    }

    @Override
    public int getItemCount() {
        return B22dansaList.size();
    }



    public class ViewHolder extends RecyclerView.ViewHolder {

        private final TextView Name;
        private final TextView Company;
        private final TextView Location;
        private final TextView Category;
        private final TextView Size;
        private final TextView Cost;
        private final ImageView img;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.Name = itemView.findViewById(R.id.Name);
            this.Company = itemView.findViewById(R.id.Company);
            this.Location = itemView.findViewById(R.id.Location);
            this.Category = itemView.findViewById(R.id.Category);
            this.Size = itemView.findViewById(R.id.Size);
            this.Cost = itemView.findViewById(R.id.Cost);
            this.img = itemView.findViewById(R.id.img);
        }



    }


}

