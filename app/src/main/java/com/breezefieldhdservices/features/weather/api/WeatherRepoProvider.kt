package com.breezefieldhdservices.features.weather.api

import com.breezefieldhdservices.features.task.api.TaskApi
import com.breezefieldhdservices.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}