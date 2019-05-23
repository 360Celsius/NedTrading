package com.a360celsius.retrofit.endpoints.interfaces;

import com.a360celsius.retrofit.EndpointsUrl;
import com.a360celsius.retrofit.pojo.Symbol;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetData {

    @GET(EndpointsUrl.GET_SYMBOLS_ENDPOINT)
    Call<List<Symbol>> getAllSymbols();
}
