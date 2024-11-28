package com.breezefieldhdservices.features.stock.api

import com.breezefieldhdservices.app.Pref
import com.breezefieldhdservices.base.BaseResponse
import com.breezefieldhdservices.features.stock.model.AddStockInputParamsModel
import com.breezefieldhdservices.features.stock.model.NewStockListResponseModel
import io.reactivex.Observable

/**
 * Created by Saikat on 17-09-2019.
 */
class StockRepository(val apiService: StockApi) {

    fun addStock(addStock: AddStockInputParamsModel): Observable<BaseResponse> {
        return apiService.addStock(addStock)
    }

    fun getStockList(): Observable<NewStockListResponseModel> {
        return apiService.getStockList(Pref.session_token!!, Pref.user_id!!)
    }
}