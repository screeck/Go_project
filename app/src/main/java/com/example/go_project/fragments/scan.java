package com.example.go_project.fragments;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;
import com.example.go_project.MainActivity;
import com.example.go_project.R;

import static android.app.Activity.RESULT_OK;

public class scan extends Fragment {




    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.scan,container,false);
        Button shot = (Button) view.findViewById(R.id.scanBtn);
        shot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context;
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivity(intent);
                Animatoo.animateShrink(getContext());
            }
        });




        return view;
    }



    }


