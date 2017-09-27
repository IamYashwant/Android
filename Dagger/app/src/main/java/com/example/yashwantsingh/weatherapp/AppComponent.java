package com.example.yashwantsingh.weatherapp;

import com.example.yashwantsingh.weatherapp.client.WeatherDetailsApiService;

import dagger.Component;
import dagger.Provides;

/**
 * Created by yashwantsingh on 17/05/17.
 */

@Component(modules = WeatherDetailsApiServiceModule.class)
public interface AppComponent {

    WeatherDetailsApiService getWeatherDetailApiService();

}
