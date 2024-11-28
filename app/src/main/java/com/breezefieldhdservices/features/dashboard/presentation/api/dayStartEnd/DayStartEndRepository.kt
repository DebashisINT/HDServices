package com.breezefieldhdservices.features.dashboard.presentation.api.dayStartEnd

import com.breezefieldhdservices.app.Pref
import com.breezefieldhdservices.base.BaseResponse
import com.breezefieldhdservices.features.dashboard.presentation.model.DaystartDayendRequest
import com.breezefieldhdservices.features.dashboard.presentation.model.StatusDayStartEnd
import com.breezefieldhdservices.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.breezefieldhdservices.features.stockCompetetorStock.api.AddCompStockApi
import io.reactivex.Observable

class DayStartEndRepository (val apiService: DayStartEndApi){
    fun dayStart(daystartDayendRequest: DaystartDayendRequest): Observable<BaseResponse> {
        return apiService.submitDayStartEnd(daystartDayendRequest)
    }

    fun dayStartEndStatus(date:String): Observable<StatusDayStartEnd> {
        return apiService.statusDayStartEnd(Pref.session_token!!, Pref.user_id!!,date)
    }

    fun daystartendDelete(sessionToken:String,usrID:String,date:String,dayStDel:String,dayEndDel:String): Observable<BaseResponse> {
        return apiService.submitDayStartEndDelApi(sessionToken,usrID,date,dayStDel,dayEndDel)
    }


}