package com.example.mekaniku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class daftar extends AppCompatActivity {

    private FloatingActionButton btnkembalidaftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.daftar);

        btnkembalidaftar =(FloatingActionButton) findViewById(R.id.btnkembalidaftar);
        btnkembalidaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kembaliawal();
            }
        });
    }
    public void kembaliawal(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}