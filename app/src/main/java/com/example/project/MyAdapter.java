package com.example.project;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project.b22dansa;
import com.example.project.R;

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
        holder.ID.setText("ID: " + item.getID());
        holder.Name.setText("Name: " + item.getName());
        holder.Type.setText("Type: " + item.getType());
        holder.Company.setText("Company: " + item.getCompany());
        holder.Location.setText("Location: " + item.getLocation());
        holder.Category.setText("Category: " + item.getCategory());
        holder.Size.setText("Size: " + Integer.toString(item.getSize()));
        holder.Cost.setText("Cost: " + Integer.toString(item.getCost()));

    }

    @Override
    public int getItemCount() {
        return B22dansaList.size();
    }



    public class ViewHolder extends RecyclerView.ViewHolder {

        private final TextView ID;

        private final TextView Name;

        private final TextView Type;

        private final TextView Company;

        private final TextView Location;

        private final TextView Category;

        private final TextView Size;

        private final TextView Cost;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.ID = itemView.findViewById(R.id.ID);
            this.Name = itemView.findViewById(R.id.Name);
            this.Type = itemView.findViewById(R.id.Type);
            this.Company = itemView.findViewById(R.id.Company);
            this.Location = itemView.findViewById(R.id.Location);
            this.Category = itemView.findViewById(R.id.Category);
            this.Size = itemView.findViewById(R.id.Size);
            this.Cost = itemView.findViewById(R.id.Cost);
        }



    }


}

