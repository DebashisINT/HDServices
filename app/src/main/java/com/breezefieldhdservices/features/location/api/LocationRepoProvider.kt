package com.breezefieldhdservices.features.location.api

import com.breezefieldhdservices.features.location.shopdurationapi.ShopDurationApi
import com.breezefieldhdservices.features.location.shopdurationapi.ShopDurationRepository


object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}