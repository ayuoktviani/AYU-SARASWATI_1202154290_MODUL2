package com.example.android.ayusaraswatioktaviani_1202154290_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

    }

    public void gambarspaghetti(View view) {
        Intent i = new Intent(Menu.this, DetailMenu.class);
        startActivity(i);
    }

    public void gambarspaghetti2(View view) {
    }

    public void gambarmilkshake(View view) {
    }

    public void gambarmilkshake2(View view) {
    }
}
