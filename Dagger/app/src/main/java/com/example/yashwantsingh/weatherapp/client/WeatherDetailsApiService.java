package com.example.yashwantsingh.weatherapp.client;

import com.example.yashwantsingh.weatherapp.Entities.CityWeather;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by yashwantsingh on 10/04/17.
 */

public interface WeatherDetailsApiService {

    @GET("/data/2.5/weather")
    Call<CityWeather> getCityWeather(@Query("q") String city, @Query("appid") String appId, @Query("units") String units);
}
