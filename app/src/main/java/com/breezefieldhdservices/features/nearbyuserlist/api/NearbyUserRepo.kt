package com.breezefieldhdservices.features.nearbyuserlist.api

import com.breezefieldhdservices.app.Pref
import com.breezefieldhdservices.features.nearbyuserlist.model.NearbyUserResponseModel
import com.breezefieldhdservices.features.newcollection.model.NewCollectionListResponseModel
import com.breezefieldhdservices.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}