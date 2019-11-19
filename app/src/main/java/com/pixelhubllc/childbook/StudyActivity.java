package com.pixelhubllc.childbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

public class StudyActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study);

        listView = findViewById(R.id.list_view);

        Intent intent = getIntent();
        String[] titleString = intent.getStringArrayExtra("title");
        String[] descriptionString = intent.getStringArrayExtra("description");

        CustomAdapter adapter = new CustomAdapter(this, titleString, descriptionString);
        listView.setAdapter(adapter);


    }
}
