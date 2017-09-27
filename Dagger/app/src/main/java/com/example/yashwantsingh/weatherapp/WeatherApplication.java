package com.example.yashwantsingh.weatherapp;

import android.app.Activity;
import android.app.Application;

import com.example.yashwantsingh.weatherapp.client.WeatherDetailsApiService;

/**
 * Created by yashwantsingh on 17/05/17.
 */

public class WeatherApplication extends Application {

    public static WeatherApplication get(Activity activity){
        return (WeatherApplication) activity.getApplication();
    }

    WeatherDetailsApiService weatherDetailsService;

    @Override
    public void onCreate() {
        super.onCreate();
        AppComponent appComponent = DaggerAppComponent.builder()
                .weatherDetailsApiServiceModule(new WeatherDetailsApiServiceModule())
                .build();

        weatherDetailsService = appComponent.getWeatherDetailApiService();
    }

    public WeatherDetailsApiService getWeatherDetailsService(){
        return weatherDetailsService;
    }

}
