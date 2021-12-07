package com.dicoding.proyekakhir;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{
    private RecyclerView rvWisata;
    private ArrayList<WisataModel> list = new ArrayList<>();

    private String title = "Tempat Wisata Di Tolitoli";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvWisata =findViewById(R.id.rv_wisata);
        rvWisata.setHasFixedSize(true);
        list.addAll(WisataData.getListData());

        showRecyclerCardView();

    }

    private void showRecyclerCardView() {
        rvWisata.setLayoutManager(new LinearLayoutManager(this));
        CardViewWisataAdapter cardViewWisatadapter = new CardViewWisataAdapter(list, this);
        rvWisata.setAdapter(cardViewWisatadapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode){
        switch (selectedMode){
            case R.id.profile:
                Intent profileIntent = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(profileIntent);
                break;

        }
    }

}