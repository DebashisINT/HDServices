package com.breezefieldhdservices.features.newcollectionreport

import com.breezefieldhdservices.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}