package com.examenjeancarlos1808.examenpmdm.mainactivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;

import com.examenjeancarlos1808.examenpmdm.R;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

    private Object adapter;

    {
         Bundle savedInstanceState = null;
         super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ViewPager2 viewPager = findViewById(R.id.viewPager);
        @SuppressLint({"Missi gInflatedId", "LocalSuppress", "MissingInflatedId"}) TabLayout tabLayout = findViewById(R.id.tabLayout);

        viewPager.setAdapter((RecyclerView.Adapter) adapter);

        new TabLayoutMediator(tabLayout, viewPager, (tab, position) -> {
            switch (position) {
                case 0:
                    tab.setText("Random");
                    break;
                case 1:
                    tab.setText("Nombre");
                    break;
                case 2:
                    tab.setText("Dialogo");
                    break;
            }
        }).attach();
    }
}
