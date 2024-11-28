package com.breezefieldhdservices.features.location.shopRevisitStatus

import com.breezefieldhdservices.base.BaseResponse
import com.breezefieldhdservices.features.location.model.ShopDurationRequest
import com.breezefieldhdservices.features.location.model.ShopRevisitStatusRequest
import io.reactivex.Observable

class ShopRevisitStatusRepository(val apiService : ShopRevisitStatusApi) {
    fun shopRevisitStatus(shopRevisitStatus: ShopRevisitStatusRequest?): Observable<BaseResponse> {
        return apiService.submShopRevisitStatus(shopRevisitStatus)
    }
}