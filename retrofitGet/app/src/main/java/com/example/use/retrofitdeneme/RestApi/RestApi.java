package com.example.use.retrofitdeneme.RestApi;

import com.example.use.retrofitdeneme.Model.Bilgiler;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RestApi {
    @GET("/posts")  //veri almak için kullanılır Json verisini
    Call<List<Bilgiler>> bilgiGetir();   //gelen verileri list tipinde bilgilerden çekecegiz !! bilgiGetir fonsiyonunu çagırırz


}
