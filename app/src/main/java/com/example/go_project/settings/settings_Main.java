package com.example.go_project.settings;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;
import com.example.go_project.MainActivity;
import com.example.go_project.R;

public class settings_Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings__main);

        Button save = (Button) findViewById(R.id.saveBtn);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(settings_Main.this, MainActivity.class);
                startActivity(intent);
                Animatoo.animateShrink(settings_Main.this);
                finish();
            }
        });


    }
}
