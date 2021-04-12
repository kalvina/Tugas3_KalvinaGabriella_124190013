package com.example.kmerch.ls;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kmerch.KmerchData;
import com.example.kmerch.R;

import java.util.ArrayList;

public class LSMain extends AppCompatActivity {
    private RecyclerView rvCetak;
    private ArrayList<LSModel> listItem = new ArrayList<>();
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kmerch);

        rvCetak = findViewById(R.id.rv);
        rvCetak.setHasFixedSize(true);
        listItem.addAll(KmerchData.getListDataK());

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
        rvCetak.setLayoutManager(new GridLayoutManager(this, 2));
        LSAdapter kmerchAdapter = new LSAdapter(this);
        kmerchAdapter.setKmerchModels(listItem);
        rvCetak.setAdapter(kmerchAdapter);
    }
}