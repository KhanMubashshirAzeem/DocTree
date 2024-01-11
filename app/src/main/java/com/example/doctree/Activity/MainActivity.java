package com.example.doctree.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.doctree.Fragments.DoctorFragment;
import com.example.doctree.Fragments.HomeFragment;
import com.example.doctree.Fragments.NotificationFragment;
import com.example.doctree.Fragments.OptionFragment;
import com.example.doctree.R;
import com.example.doctree.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    private long pressedTime;
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BottomNavigationView navigationView = binding.bottomNavigation;
        navigationView.setOnNavigationItemSelectedListener(this);  // Use 'this' as the listener

        // Set the HomeFragment as the default fragment
        if (savedInstanceState == null) {
            loadFragment(new HomeFragment());
        }




    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        Fragment fragment = null;

        if (menuItem.getItemId() == R.id.menu_home) {
            fragment = new HomeFragment();
        } else if (menuItem.getItemId() == R.id.menu_doctor) {
            fragment = new DoctorFragment();
        } else if (menuItem.getItemId() == R.id.menu_notification) {
            fragment = new NotificationFragment();
        } else if (menuItem.getItemId() == R.id.menu_option) {
            fragment = new OptionFragment();
        }

        return loadFragment(fragment);
    }

    private boolean loadFragment(Fragment fragment) {
        // Switching fragment
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, fragment)  // Use the correct container ID
                    .commit();
            return true;
        }
        return false;
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }

    @Override
    public void onBackPressed() {

        if (pressedTime + 2000 > System.currentTimeMillis()) {
            super.onBackPressed();
            finish();
        } else {
            Toast.makeText(getBaseContext(), "Press back again to exit", Toast.LENGTH_SHORT).show();
        }
        pressedTime = System.currentTimeMillis();
    }


}
