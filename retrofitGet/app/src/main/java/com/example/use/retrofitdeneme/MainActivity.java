package com.example.use.retrofitdeneme;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.example.use.retrofitdeneme.Model.Bilgiler;
import com.example.use.retrofitdeneme.RestApi.ManagerAll;
import com.example.use.retrofitdeneme.adapter.adapter;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
List<Bilgiler> lists;
ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listview);
        istek();
    }
    public  void istek(){
        lists=new ArrayList<>();
        Call<List<Bilgiler>>  bilgiList = ManagerAll.getInstance().getirBilgileri();
        bilgiList.enqueue(new Callback<List<Bilgiler>>() {
            @Override
            public void onResponse(Call<List<Bilgiler>> call, Response<List<Bilgiler>> response) {
              if  (response.isSuccessful()) {

                    lists=response.body();
                    adapter adp=new adapter(lists,getApplicationContext());
                    listView.setAdapter(adp);

                }

            }

            @Override
            public void onFailure(Call<List<Bilgiler>> call, Throwable t) {

            }
        });
    }
}
