package com.breezefieldhdservices.features.stockCompetetorStock.api

import com.breezefieldhdservices.base.BaseResponse
import com.breezefieldhdservices.features.orderList.model.NewOrderListResponseModel
import com.breezefieldhdservices.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.breezefieldhdservices.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class AddCompStockRepository(val apiService:AddCompStockApi){

    fun addCompStock(shopAddCompetetorStockRequest: ShopAddCompetetorStockRequest): Observable<BaseResponse> {
        return apiService.submShopCompStock(shopAddCompetetorStockRequest)
    }

    fun getCompStockList(sessiontoken: String, user_id: String, date: String): Observable<CompetetorStockGetData> {
        return apiService.getCompStockList(sessiontoken, user_id, date)
    }
}