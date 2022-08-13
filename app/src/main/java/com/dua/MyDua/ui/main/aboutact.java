package com.dua.MyDua.ui.main;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.dua.MyDua.MainActivity;
import com.dua.MyDua.R;

public class aboutact extends AppCompatActivity {
    public Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutact);
        button2=findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent butt2 = new Intent(aboutact.this, MainActivity.class);
                startActivity(butt2);
            }
        });
    }


}