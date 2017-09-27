package com.example.yashwantsingh.weatherdetails.client;

import android.database.Observable;

import com.example.yashwantsingh.weatherdetails.Entities.CityWeather;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by yashwantsingh on 10/04/17.
 */

public interface WeatherDetailsApi {

    @GET("/data/2.5/weather")
    Call<CityWeather> getCityWeather(@Query("q")String city, @Query("appid")String appId, @Query("units")String units);
}
