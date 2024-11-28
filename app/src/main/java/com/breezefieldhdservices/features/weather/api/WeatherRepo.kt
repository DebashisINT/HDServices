package com.breezefieldhdservices.features.weather.api

import com.breezefieldhdservices.base.BaseResponse
import com.breezefieldhdservices.features.task.api.TaskApi
import com.breezefieldhdservices.features.task.model.AddTaskInputModel
import com.breezefieldhdservices.features.weather.model.ForeCastAPIResponse
import com.breezefieldhdservices.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}