package com.example.exam;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    RecyclerView rvUsers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
final Button btn= findViewById(R.id.btnlogout);
 

        rvUsers = findViewById(R.id.rvUserss);
        rvUsers.setLayoutManager(new LinearLayoutManager(this));

        UserAdapter userAdapter = new UserAdapter(getApplicationContext());
        rvUsers.setAdapter(userAdapter);

    }

}

