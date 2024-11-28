package com.breezefieldhdservices.features.location.shopRevisitStatus

import com.breezefieldhdservices.features.location.shopdurationapi.ShopDurationApi
import com.breezefieldhdservices.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}