package com.example.use.retrofitdeneme.RestApi;

public class BaseManager {
    //restApiClient ın nesnesini oluşturca
    //url vercez bize restapiyi döndurcek
    protected RestApi getRestApiClient()
    {
        RestApiClient restApiClient = new RestApiClient(BaseUrl.bilgi_url);
        return restApiClient.getRestApi();
    }

}
