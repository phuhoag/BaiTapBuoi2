package com.example.lifecycledemo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.content.Intent;
import android.net.Uri;

public class MainActivity extends AppCompatActivity {

    Button btnExplicit, btnImplicit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Lifecycle", "Hàm onCreate được gọi");

        // Ánh xạ 2 nút
        btnExplicit = findViewById(R.id.btnExplicit);
        btnImplicit = findViewById(R.id.btnImplicit);

        // ============================
        // EXPLICIT INTENT
        // ============================
        btnExplicit.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        });

        // ============================
        // IMPLICIT INTENT
        // ============================
        btnImplicit.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://google.com"));
            startActivity(intent);
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Lifecycle", "Hàm onStart được gọi");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Lifecycle", "Hàm onResume được gọi");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Lifecycle", "Hàm onPause được gọi");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Lifecycle", "Hàm onStop được gọi");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Lifecycle", "Hàm onRestart được gọi");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Lifecycle", "Hàm onDestroy được gọi");
    }
}
