package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvListDataSiswa;
    List<String> listDataSiswa10PPLG1;
    AdapterListSiswa adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvListDataSiswa = findViewById(R.id.rvListData);
        listDataSiswa10PPLG1 = new ArrayList<>();
        listDataSiswa10PPLG1.add("Nafi");
        listDataSiswa10PPLG1.add("Aldi");

        // call adapter data
        rvListDataSiswa.setLayoutManager(new LinearLayoutManager(this));
        adapter = new AdapterListSiswa(this, listDataSiswa10PPLG1);
        rvListDataSiswa.setAdapter(adapter);

    }
}