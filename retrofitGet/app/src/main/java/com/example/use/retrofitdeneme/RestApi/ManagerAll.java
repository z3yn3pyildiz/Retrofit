package com.example.use.retrofitdeneme.RestApi;

import com.example.use.retrofitdeneme.Model.Bilgiler;

import java.util.List;

import retrofit2.Call;

public class ManagerAll extends BaseManager{ //RestApi döndürür Sonucu
    private static ManagerAll ourInstance = new ManagerAll();

    public static synchronized ManagerAll getInstance()
    {
        return ourInstance;
    }

    public Call<List<Bilgiler>> getirBilgileri()
    {
        Call<List<Bilgiler>> call = getRestApiClient().bilgiGetir();
        return call;
    }

}
