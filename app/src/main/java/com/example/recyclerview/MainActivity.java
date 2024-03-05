package com.example.recyclerview;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterListSiswa.OnItemClickListener {

    RecyclerView rvListDataSiswa;
    List<ModelSiswa> items;
    AdapterListSiswa adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvListDataSiswa = findViewById(R.id.rvListData);
        items = new ArrayList<>();

        items.add(new ModelSiswa("Abdun Nafi Hibatullah", "Absen: 1","https://png.pngtree.com/element_our/png/20181022/man-avatar-icon-professional-man-character-business-man-avatar-carton-symbol-png_206531.jpg"));
        items.add(new ModelSiswa("Aldiansyah Fayruz",  "Absen: 2" , "https://png.pngtree.com/element_our/png/20181022/man-avatar-icon-professional-man-character-business-man-avatar-carton-symbol-png_206531.jpg"));
        items.add(new ModelSiswa("Alikha Mutiara Hati",  "Absen: 3", "https://creazilla-store.fra1.digitaloceanspaces.com/cliparts/3155826/user-clipart-md.png"));
        items.add(new ModelSiswa("Allam Permata Putra" , "Absen: 4", "https://png.pngtree.com/element_our/png/20181022/man-avatar-icon-professional-man-character-business-man-avatar-carton-symbol-png_206531.jpg"));
        items.add(new ModelSiswa("Arbani Akhyar Radjadin", "Absen: 5", "https://png.pngtree.com/element_our/png/20181022/man-avatar-icon-professional-man-character-business-man-avatar-carton-symbol-png_206531.jpg"));
        items.add(new ModelSiswa("Arsya Fauz Marzuki",  "Absen: 6", "https://png.pngtree.com/element_our/png/20181022/man-avatar-icon-professional-man-character-business-man-avatar-carton-symbol-png_206531.jpg"));
        items.add(new ModelSiswa("Azzam Fitrawansyah Salim",  "Absen: 7", "https://png.pngtree.com/element_our/png/20181022/man-avatar-icon-professional-man-character-business-man-avatar-carton-symbol-png_206531.jpg"));
        items.add(new ModelSiswa("Azzan Isham Alawiy",  "Absen: 8", "https://png.pngtree.com/element_our/png/20181022/man-avatar-icon-professional-man-character-business-man-avatar-carton-symbol-png_206531.jpg"));
        items.add(new ModelSiswa("Burhanuddin Zain", "Absen: 9", "https://png.pngtree.com/element_our/png/20181022/man-avatar-icon-professional-man-character-business-man-avatar-carton-symbol-png_206531.jpg"));
        items.add(new ModelSiswa("Daffa Raziq Angie Irawan",  "Absen: 10", "https://png.pngtree.com/element_our/png/20181022/man-avatar-icon-professional-man-character-business-man-avatar-carton-symbol-png_206531.jpg"));
        items.add(new ModelSiswa("Dylan Athallah Alam", "Absen: 11", "https://png.pngtree.com/element_our/png/20181022/man-avatar-icon-professional-man-character-business-man-avatar-carton-symbol-png_206531.jpg"));
        items.add(new ModelSiswa("Dzaky Ihsan Rasyid",  "Absen: 12", "https://png.pngtree.com/element_our/png/20181022/man-avatar-icon-professional-man-character-business-man-avatar-carton-symbol-png_206531.jpg"));
        items.add(new ModelSiswa("Hilal Syah Amali", "Absen: 13", "https://png.pngtree.com/element_our/png/20181022/man-avatar-icon-professional-man-character-business-man-avatar-carton-symbol-png_206531.jpg"));
        items.add(new ModelSiswa("Jeremy Edward Domenico Sanjaya",  "Absen: 14", "https://png.pngtree.com/element_our/png/20181022/man-avatar-icon-professional-man-character-business-man-avatar-carton-symbol-png_206531.jpg"));
        items.add(new ModelSiswa("Jovanco Nicholas Rise",  "Absen: 15", "https://png.pngtree.com/element_our/png/20181022/man-avatar-icon-professional-man-character-business-man-avatar-carton-symbol-png_206531.jpg"));
        items.add(new ModelSiswa("Khalisha Kaylanasywa", "Absen: 16", "https://creazilla-store.fra1.digitaloceanspaces.com/cliparts/3155826/user-clipart-md.png"));
        items.add(new ModelSiswa("Maulana Arka Narendra", "Absen: 17", "https://png.pngtree.com/element_our/png/20181022/man-avatar-icon-professional-man-character-business-man-avatar-carton-symbol-png_206531.jpg"));
        items.add(new ModelSiswa("Muhammad Asraf El Farras",  "Absen: 18", "https://png.pngtree.com/element_our/png/20181022/man-avatar-icon-professional-man-character-business-man-avatar-carton-symbol-png_206531.jpg"));
        items.add(new ModelSiswa("Muhammad Choirul'Anam", "Absen: 19", "https://png.pngtree.com/element_our/png/20181022/man-avatar-icon-professional-man-character-business-man-avatar-carton-symbol-png_206531.jpg"));
        items.add(new ModelSiswa("Muhammad Evan Maxsalmina",  "Absen: 20", "https://png.pngtree.com/element_our/png/20181022/man-avatar-icon-professional-man-character-business-man-avatar-carton-symbol-png_206531.jpg"));
        items.add(new ModelSiswa("Muhammad Fakhry Alifahrizq A.",  "Absen: 21", "https://png.pngtree.com/element_our/png/20181022/man-avatar-icon-professional-man-character-business-man-avatar-carton-symbol-png_206531.jpg"));
        items.add(new ModelSiswa("Muhammad Rafif Azka Budiawan",  "Absen: 22", "https://png.pngtree.com/element_our/png/20181022/man-avatar-icon-professional-man-character-business-man-avatar-carton-symbol-png_206531.jpg"));
        items.add(new ModelSiswa("Muhammad Zuhrizal",  "Absen: 23", "https://png.pngtree.com/element_our/png/20181022/man-avatar-icon-professional-man-character-business-man-avatar-carton-symbol-png_206531.jpg"));
        items.add(new ModelSiswa("Nafisah Isbarsani",  "Absen: 24", "https://creazilla-store.fra1.digitaloceanspaces.com/cliparts/3155826/user-clipart-md.png"));
        items.add(new ModelSiswa("Nail Zhavier Adhyaksa", "Absen: 25", "https://png.pngtree.com/element_our/png/20181022/man-avatar-icon-professional-man-character-business-man-avatar-carton-symbol-png_206531.jpg"));
        items.add(new ModelSiswa("Nasharuddin Hatta", "Absen: 26", "https://png.pngtree.com/element_our/png/20181022/man-avatar-icon-professional-man-character-business-man-avatar-carton-symbol-png_206531.jpg"));
        items.add(new ModelSiswa("Naufal Afdhal Haryda",  "Absen: 27", "https://png.pngtree.com/element_our/png/20181022/man-avatar-icon-professional-man-character-business-man-avatar-carton-symbol-png_206531.jpg"));
        items.add(new ModelSiswa("Nicholas Christian Chandra",  "Absen: 28", "https://png.pngtree.com/element_our/png/20181022/man-avatar-icon-professional-man-character-business-man-avatar-carton-symbol-png_206531.jpg"));
        items.add(new ModelSiswa("Ocean Karuna Muryanto", "Absen: 29", "https://png.pngtree.com/element_our/png/20181022/man-avatar-icon-professional-man-character-business-man-avatar-carton-symbol-png_206531.jpg"));
        items.add(new ModelSiswa("Pajri Al Fikri Riandi", "Absen: 30", "https://png.pngtree.com/element_our/png/20181022/man-avatar-icon-professional-man-character-business-man-avatar-carton-symbol-png_206531.jpg"));
        items.add(new ModelSiswa("Radithia Arlistian Saputra", "Absen: 31", "https://png.pngtree.com/element_our/png/20181022/man-avatar-icon-professional-man-character-business-man-avatar-carton-symbol-png_206531.jpg"));
        items.add(new ModelSiswa("Rifqi Wibisono Himmawan", "Absen: 32", "https://png.pngtree.com/element_our/png/20181022/man-avatar-icon-professional-man-character-business-man-avatar-carton-symbol-png_206531.jpg"));
        items.add(new ModelSiswa("Royyan Ahmad Zaydan", "Absen: 33", "https://png.pngtree.com/element_our/png/20181022/man-avatar-icon-professional-man-character-business-man-avatar-carton-symbol-png_206531.jpg"));
        items.add(new ModelSiswa("Ruga Zinedine Airinka", "Absen: 34", "https://png.pngtree.com/element_our/png/20181022/man-avatar-icon-professional-man-character-business-man-avatar-carton-symbol-png_206531.jpg"));
        items.add(new ModelSiswa("Satria Rudi Pratama", "Absen: 35", "https://png.pngtree.com/element_our/png/20181022/man-avatar-icon-professional-man-character-business-man-avatar-carton-symbol-png_206531.jpg"));
        items.add(new ModelSiswa("Shofiyyul Hilmi","Absen: 36", "https://png.pngtree.com/element_our/png/20181022/man-avatar-icon-professional-man-character-business-man-avatar-carton-symbol-png_206531.jpg"));
        items.add(new ModelSiswa("Zaskia Amelia Putri","Absen: 37", "https://creazilla-store.fra1.digitaloceanspaces.com/cliparts/3155826/user-clipart-md.png"));

        adapter = new AdapterListSiswa(items, this);
        rvListDataSiswa.setLayoutManager(new LinearLayoutManager(this));
        rvListDataSiswa.setAdapter(adapter);
        adapter.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(ModelSiswa currentSiswa) {
        String message = "Nama: " + currentSiswa.getNama() + "\n" + currentSiswa.getNoAbsen();
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
