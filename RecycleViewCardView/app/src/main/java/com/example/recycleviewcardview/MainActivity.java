package com.example.recycleviewcardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    SiswaAdapter adapter;
    List<Siswa> siswaList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        load();
        isiData();
    }

    public void load() {
        recyclerView = findViewById(R.id.rcvSIswa);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    public void isiData() {
        siswaList = new ArrayList<Siswa>();
        siswaList.add(new Siswa("Joni", "Surabaya"));
        siswaList.add(new Siswa("Eko", "Surabaya"));
        siswaList.add(new Siswa("Tejo", "Surabaya"));
        siswaList.add(new Siswa("Siti", "Surabaya"));
        siswaList.add(new Siswa("Roni", "Surabaya"));
        siswaList.add(new Siswa("Erwin", "Surabaya"));
        siswaList.add(new Siswa("Nurdin", "Surabaya"));
        siswaList.add(new Siswa("Nasrun", "Surabaya"));
        siswaList.add(new Siswa("Parjo", "Surabaya"));
        siswaList.add(new Siswa("Dzar", "Surabaya"));
        siswaList.add(new Siswa("Joni", "Surabaya"));
        siswaList.add(new Siswa("Joni", "Surabaya"));
        siswaList.add(new Siswa("Joni", "Surabaya"));
        siswaList.add(new Siswa("Joni", "Surabaya"));

        adapter = new SiswaAdapter(this,siswaList);
        recyclerView.setAdapter(adapter);
    }

    public void btnTambah(View view) {
        siswaList.add(new Siswa("Joni Sakti", "Jakarta"));
        adapter.notifyDataSetChanged();
        Toast.makeText(this, "Berhasil Ditambahkan", Toast.LENGTH_SHORT).show();
    }
}