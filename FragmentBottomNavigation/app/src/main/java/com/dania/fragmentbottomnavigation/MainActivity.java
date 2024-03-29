package com.dania.fragmentbottomnavigation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Membuat action pada button
        bottomNavigation = findViewById(R.id.bottom_navigation);

        // Secara default pertama menjalankan chats
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new ChatsFragment()).commit();

        bottomNavigation.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedFragment = null;

                switch (item.getItemId()){
                    case R.id.nav_chats:  // Memanggil chats fragment yang ada disimpan dalam object selected fragment
                        selectedFragment = new ChatsFragment();
                        break;
                    case R.id.nav_status:
                        selectedFragment = new StatusFragment();
                        break;
                    case R.id.nav_calls:
                        selectedFragment = new CallsFragment();
                        break;
                }

                // Mengubah fungsi setiap fragment
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit(); // Bergantung pada value yang ada di object selected fragment
                return true;
            }
        });
    }
}