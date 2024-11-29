package com.examenjeancarlos1808.examenpmdm.fragments;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.examenjeancarlos1808.examenpmdm.R;

import java.util.Random;

public class Fragment1 extends Fragment {

    private TextView displayText;
    private int clickCount = 0;
    private final String[] names = {"Juan", "María", "Pedro", "Lucía"};

    @SuppressLint("MissingInflatedId")
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_1, container, false);
        displayText = view.findViewById(R.id.text_display);

        view.findViewById(R.id.button_update).setOnClickListener(v -> {
            String randomName = names[new Random().nextInt(names.length)];
            clickCount++;
            displayText.setText(randomName + " - Veces pulsado: " + clickCount);
        });

        return view;
    }
}
