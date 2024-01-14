package com.example.doctree.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.doctree.R;
import com.google.android.material.textfield.TextInputEditText;


public class ProfileFragment extends Fragment {
    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_profile, container, false);

        TextInputEditText editText = view.findViewById(R.id.full_name);
        editText.setText("Khan Mubashshir");

        return view;
    }
}