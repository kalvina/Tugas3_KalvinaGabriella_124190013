package com.example.kmerch;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TData extends AppCompatActivity {
    TextView tv_Hasil;
    Button kembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tdata);

        tv_Hasil = findViewById(R.id.tv_confirm);

        String name = getIntent().getStringExtra("et_name");
        int quantity = getIntent().getIntExtra("et_quantity",0);

        String hasil = "Thank you \n You're done to order :\n"+name+"\n\n In Quantity : "+quantity;
        tv_Hasil.setText(hasil);

        kembali = findViewById(R.id.btn_back1);
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}