package com.example.doctree.Fragments;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.doctree.R;

public class OptionFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_option, container, false);

        LinearLayout layout = view.findViewById(R.id.layout_profile);
        // Change status bar color to white
        changeStatusBarColor();
        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                go_to_Profile(view);
            }
        });

        return view;
    }

    private void changeStatusBarColor() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = requireActivity().getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(getResources().getColor(android.R.color.white)); // Set the desired color
        }
    }

    public void go_to_Profile(View view) {
        // Inside your source fragment (e.g., SourceFragment.java)
        ProfileFragment profileFragment = new ProfileFragment(); // Create an instance of the destination fragment
        FragmentManager fragmentManager = requireActivity().getSupportFragmentManager(); // Get the FragmentManager
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction(); // Start a FragmentTransaction
        fragmentTransaction.replace(R.id.fragment_container, profileFragment); // Replace the current fragment with the destination fragment
        fragmentTransaction.addToBackStack(null); // Optionally, add the transaction to the back stack
        fragmentTransaction.commit(); // Commit the transaction


    }
}
