package com.example.yashwantsingh.weatherdetails;

import android.database.Observable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.example.yashwantsingh.weatherdetails.Entities.CityWeather;
import com.example.yashwantsingh.weatherdetails.service.WeatherDetailsService;

import java.lang.reflect.Method;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {


    Call<CityWeather> weatherCall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WeatherDetailsService weatherDetailsService = new WeatherDetailsService();

        weatherCall = weatherDetailsService.provideWeatherDetailsService()
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

        TextView textExample = (TextView)findViewById(R.id.textExample);
        BuilderPatternExample builderPatternExample = new BuilderPatternExample();
        textExample.setText(builderPatternExample.getMereChoteBhai().getBigBrother()+" "+builderPatternExample.getMereChoteBhai().getSmallBrother());

        Log.e("result","");
    }
}
