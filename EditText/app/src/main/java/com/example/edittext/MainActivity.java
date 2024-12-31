package com.example.edittext;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
Button btn;
EditText e1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.mybutton);
        e1 = findViewById(R.id.mytxt);

        btn.setOnClickListener(v -> Toast.makeText(getApplicationContext(), "SUCESSFULLY LOGIN "+e1.getText().toString(), Toast.LENGTH_LONG).show());

    }
}