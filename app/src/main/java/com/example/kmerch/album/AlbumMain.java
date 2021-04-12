package com.example.kmerch.album;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kmerch.KmerchData;
import com.example.kmerch.R;

import java.util.ArrayList;

public class AlbumMain extends AppCompatActivity {
    private RecyclerView rvCetak;
    private ArrayList<AlbumModel> listItem = new ArrayList<>();
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kmerch);

        rvCetak = findViewById(R.id.rv);
        rvCetak.setHasFixedSize(true);
        listItem.addAll(KmerchData.getListDataM());

        showRecyclerList();
        back = findViewById(R.id.btn_back2);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    private void showRecyclerList() {
        rvCetak.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        AlbumAdapter kmerchAdapter = new AlbumAdapter(this);
        kmerchAdapter.setKmerchModels(listItem);
        rvCetak.setAdapter(kmerchAdapter);
    }
}