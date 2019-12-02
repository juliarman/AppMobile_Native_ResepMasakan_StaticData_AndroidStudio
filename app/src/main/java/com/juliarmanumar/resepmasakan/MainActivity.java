package com.juliarmanumar.resepmasakan;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ArrayList<Resep> list = new ArrayList<>();
    private ArrayList<Resep> listfood = new ArrayList<>();
    private ArrayList<Resep> listcookies = new ArrayList<>();
    private ArrayList<Resep> listdrink = new ArrayList<>();


    RecyclerView resepnya;
    Button bt_food,bt_cookies,bt_drink,bt_about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        list.addAll(DataResep.getdata());



        bt_food = (Button) findViewById(R.id.btn_food);
        bt_cookies = (Button) findViewById(R.id.btn_cookies);
        bt_drink = (Button) findViewById(R.id.btn_drink);
        bt_about = (Button) findViewById(R.id.btn_about);
        resepnya = (RecyclerView) findViewById(R.id.resepcard);


        bt_drink.setOnClickListener(this);
        bt_food.setOnClickListener(this);
        bt_cookies.setOnClickListener(this);
        bt_about.setOnClickListener(this);

        resepnya.setLayoutManager(new LinearLayoutManager(this));
        AdapterResep adapterResep = new AdapterResep(this, list);
        resepnya.setAdapter(adapterResep);


    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.btn_food:
                food();
                break;

            case R.id.btn_cookies:
                cookies();
                break;

            case R.id.btn_drink:
                drink();
                break;

            case R.id.btn_about:
                Intent about = new Intent(MainActivity.this, About.class);
                startActivity(about);
                break;

        }
    }

    public void food(){

        listfood.addAll(DataResep.getfood());
        resepnya.setLayoutManager(new LinearLayoutManager(this));
        AdapterResep adapterResepp = new AdapterResep(this, listfood);
        resepnya.setAdapter(adapterResepp);


    }



    public void cookies(){

        listcookies.addAll(DataResep.getcookies());
        resepnya.setLayoutManager(new LinearLayoutManager(this));
        AdapterResep adapterReseppp = new AdapterResep(this, listcookies);
        resepnya.setAdapter(adapterReseppp);


    }

    public void drink(){

        listdrink.addAll(DataResep.getdrink());
        resepnya.setLayoutManager(new LinearLayoutManager(this));
        AdapterResep adapterResepppp = new AdapterResep(this, listdrink);
        resepnya.setAdapter(adapterResepppp);


    }

}
