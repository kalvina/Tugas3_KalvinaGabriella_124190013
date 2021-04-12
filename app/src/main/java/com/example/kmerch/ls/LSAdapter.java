package com.example.kmerch.ls;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.bumptech.glide.Glide;
import com.example.kmerch.R;

import java.util.ArrayList;

public class LSAdapter extends RecyclerView.Adapter<LSAdapter.ViewHolder> {
    private Context context;
    ArrayList<LSModel> kmerchModels = new ArrayList<>();

    public LSAdapter(Context context) {
        this.context = context;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public ArrayList<LSModel> getKmerchModels() {
        return kmerchModels;
    }

    public void setKmerchModels(ArrayList<LSModel> kmerchModels) {
        this.kmerchModels = kmerchModels;
    }

    @NonNull
    @Override
    public LSAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemRow = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_kmerch_data, parent, false);
        return new ViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull LSAdapter.ViewHolder holder, int position) {
        Glide.with(context).load(kmerchModels.get(position).getGambarItem()).into(holder.gambar);
        holder.text.setText(kmerchModels.get(position).getNamaItem());
    }

    @Override
    public int getItemCount() {
        return getKmerchModels().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView gambar;
        private TextView text;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            gambar = itemView.findViewById(R.id.rv_pic);
            text = itemView.findViewById(R.id.rv_name);
        }
    }
}