package com.example.cw5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Items> myList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Items item1 = new Items("hp pavilion 360",R.drawable.pavilion,299.9);
        Items item2 = new Items("macbook pro",R.drawable.macbook,452);
        Items item3 = new Items("lenovo legion 5 ",R.drawable.lenovo ,499);
        Items item4 = new Items("lenovo legion 5 ",R.drawable.dell,389.3);
        Items item5 = new Items("huawei d15",R.drawable.huawei,169.9);

        myList.add(item1);
        myList.add(item2);
        myList.add(item3);
        myList.add(item4);
        myList.add(item5);

        RecyclerView recycler = findViewById(R.id.rv);
        recycler.setHasFixedSize(true);

        RecyclerView.LayoutManager manager = new LinearLayoutManager(this );
        recycler.setLayoutManager(manager);

        ItemAdapter adapter  = new ItemAdapter(myList, this);
        recycler.setAdapter(adapter);



    }
}