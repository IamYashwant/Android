package com.example.yashwantsingh.weatherapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.example.yashwantsingh.weatherapp.Entities.CityWeather;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    Call<CityWeather> weatherCall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weatherCall = WeatherApplication.get(this).getWeatherDetailsService()
                .getCityWeather("bangalore","55bb165df89ca75a470aa0fa9b265234","Metric");

        weatherCall.enqueue(new Callback<CityWeather>() {
            @Override
            public void onResponse(Call<CityWeather> call, Response<CityWeather> response) {
                Toast.makeText(getApplicationContext(),String.valueOf(response.body().getMain().getTemp()),Toast.LENGTH_LONG).show();
            }

            @Override
            public void onFailure(Call<CityWeather> call, Throwable t) {

            }
        });
        Log.e("result","");
    }
}
