package com.breezefieldhdservices.features.dashboard.presentation.api.dayStartEnd

import com.breezefieldhdservices.features.stockCompetetorStock.api.AddCompStockApi
import com.breezefieldhdservices.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}