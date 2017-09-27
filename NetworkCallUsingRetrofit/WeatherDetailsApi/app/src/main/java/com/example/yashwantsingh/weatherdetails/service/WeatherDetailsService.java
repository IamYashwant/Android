package com.example.yashwantsingh.weatherdetails.service;

import com.example.yashwantsingh.weatherdetails.client.WeatherDetailsApi;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by yashwantsingh on 10/04/17.
 */

public class WeatherDetailsService {

    public Retrofit createRetrofitService(){

        GsonBuilder gsonBuilder = new GsonBuilder();
       // gsonBuilder.registerTypeAdapter(CityWeather.class,new CityWeather());
        Gson gson = gsonBuilder.create();

        return new Retrofit.Builder()
                .baseUrl("http://api.openweathermap.org")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
    }

    public WeatherDetailsApi provideWeatherDetailsService(){
        return createRetrofitService().create(WeatherDetailsApi.class);
    }

}
