package com.example.appbandaquy.Service;

public class APIUltil {
    public static final String baseUrl = "http://192.168.43.184/QLSV/";

    public static DataClient getData(){
        return RetrofitClient.getRetrofit(baseUrl).create(DataClient.class);
    }
}
