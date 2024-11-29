package com.examenjeancarlos1808.examenpmdm.fragments;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.examenjeancarlos1808.examenpmdm.R;

public class Fragment3 extends Fragment {

    @SuppressLint("MissingInflatedId")
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_3, container, false);

        view.findViewById(R.id.button_alert).setOnClickListener(v -> {
            new AlertDialog.Builder(requireContext())
                    .setTitle("Tu Nombre")
                    .setMessage("Hola, Profesor. ¿Qué quiere hacer?")
                    .setPositiveButton("Aprobar", null)
                    .setNegativeButton("Suspender", null)
                    .show();
        });

        return view;
    }
}
