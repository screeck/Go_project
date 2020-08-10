package com.example.go_project.fragments;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.go_project.R;

public class tactics extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view =  inflater.inflate(R.layout.tactics, container, false);
        final ImageView board = (ImageView) view.findViewById(R.id.imageView);
        final Button points = (Button) view.findViewById(R.id.countBtn);


        board.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
//                int[] viewCoords = new int[2];
//                board.getLocationOnScreen(viewCoords);

                int touchX = (int) event.getX();
                int touchY = (int) event.getY();

//                int imageX = touchX - viewCoords[0]; // viewCoords[0] is the X coordinate
//                int imageY = touchY - viewCoords[1]; // viewCoords[1] is the y coordinate


                //Toast.makeText(getContext(), "Jest GIT", Toast.LENGTH_SHORT).show();
                //1062113

                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        Log.d("TAG", "touched down: (" + touchX + "," + touchY + ")");
                        break;
                    case MotionEvent.ACTION_MOVE:
                        Log.d("TAG", "moving: (" + touchX + ", " + touchY + ")");
                        break;
                    case MotionEvent.ACTION_UP:
                        Log.d("TAG", "touched up: (" + touchX + "," + touchY + ")");
                        break;
                }
                return false;
            }
        });
//      View.OnTouchListener handleTouch = new View.OnTouchListener() {

//        board.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                v.setOnTouchListener(new View.OnTouchListener() {
//                    @Override
//                    public boolean onTouch(View v, MotionEvent event) {
//                        if(event.getAction() == MotionEvent.ACTION_DOWN){
//                            int x = (int) event.getX();
//                            int y = (int) event.getY();
//
//                        }
//                        return true;
//                    }
//                });
//            }
//        });
//
       return view;
    }
}
