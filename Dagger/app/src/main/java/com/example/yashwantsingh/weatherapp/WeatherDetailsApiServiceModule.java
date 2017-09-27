package com.example.yashwantsingh.weatherapp;

import com.example.yashwantsingh.weatherapp.client.WeatherDetailsApiService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by yashwantsingh on 17/05/17.
 */

@Module
public class WeatherDetailsApiServiceModule {

    @Provides
    public Gson gson(){
        GsonBuilder gsonBuilder = new GsonBuilder();
        return gsonBuilder.create();
    }

    @Provides
    public Retrofit createRetrofitService(Gson gson){
        return new Retrofit.Builder()
                .baseUrl("http://api.openweathermap.org")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
    }

    @Provides
    WeatherDetailsApiService getWeatherDetailsApiService(Retrofit retrofit) {
        return retrofit.create(WeatherDetailsApiService.class);
    }
}
