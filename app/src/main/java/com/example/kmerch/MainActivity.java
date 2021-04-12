package com.example.kmerch;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.kmerch.album.AlbumMain;
import com.example.kmerch.ls.LSMain;
import com.example.kmerch.merch.MerchMain;

public class MainActivity extends AppCompatActivity {

    Button btn_tdata, btn_call, btn_album, btn_ls, btn_merch;
    TextView name, quantity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_album   = findViewById(R.id.btn_Album);
        btn_ls   = findViewById(R.id.btn_LS);
        btn_merch   = findViewById(R.id.btn_Merch);
        btn_tdata = findViewById(R.id.btn_Tdata);
        btn_call   = findViewById(R.id.btn_call);
        name   = findViewById(R.id.et_name);
        quantity = findViewById(R.id.et_qty);

        btn_album.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent album = new Intent(MainActivity.this, AlbumMain.class);
                startActivity(album);
            }
        });

        btn_ls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ls = new Intent(MainActivity.this, LSMain.class);
                startActivity(ls);
            }
        });

        btn_merch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent merch = new Intent(MainActivity.this, MerchMain.class);
                startActivity(merch);
            }
        });

        btn_tdata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent tdata = new Intent(MainActivity.this,TData.class);
                    tdata.putExtra("et_name",name.getText().toString());
                    tdata.putExtra("et_quantity",Integer.parseInt(quantity.getText().toString()));
                    startActivity(tdata);
                }
                catch (NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(), "Please input data first!",Toast.LENGTH_SHORT).show();
                }
            }
        });

        btn_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent call = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: 081277112843"));
                startActivity(call);
            }
        });
    }
}