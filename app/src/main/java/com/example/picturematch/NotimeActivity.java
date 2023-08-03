package com.example.picturematch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import MyAdapter.TimeAdapter;

public class NotimeActivity extends AppCompatActivity {

    GridView gridView;
    TimeAdapter adapter;
    private ArrayList<String> imgArr=new ArrayList<>();
    private List<String> arrayList=new ArrayList<>();
    TextView countdown;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notime);

        countdown=findViewById(R.id.countdown);
        gridView = findViewById(R.id.gridview);
        progressBar=findViewById(R.id.progress);

        String[] images = new String[0];
        try {
            images = getAssets().list("images/");
            imgArr = new ArrayList<String>(Arrays.asList(images));

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        Collections.sort(imgArr);
        imgArr.remove("android-logo-mask.png");
        imgArr.remove("android-logo-shine.png");
        imgArr.remove("clock_font.png");
        imgArr.remove("progress_font.png");
        arrayList=imgArr.subList(0,6);

        arrayList.addAll(arrayList);
        Collections.shuffle(arrayList);
        Collections.shuffle(arrayList);

        adapter = new TimeAdapter(NotimeActivity.this, arrayList,countdown,progressBar);
        gridView.setAdapter(adapter);
    }
}