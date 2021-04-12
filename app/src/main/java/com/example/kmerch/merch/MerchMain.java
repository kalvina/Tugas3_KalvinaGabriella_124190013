package com.example.kmerch.merch;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kmerch.KmerchData;
import com.example.kmerch.R;

import java.util.ArrayList;

public class MerchMain extends AppCompatActivity {
    private RecyclerView rvCetak;
    private ArrayList<MerchModel> listItem = new ArrayList<>();
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kmerch);

        rvCetak = findViewById(R.id.rv);
        rvCetak.setHasFixedSize(true);
        listItem.addAll(KmerchData.getListDataH());

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
        rvCetak.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        MerchAdapter merchAdapter = new MerchAdapter(this);
        merchAdapter.setKmerchModels(listItem);
        rvCetak.setAdapter(merchAdapter);
    }
}