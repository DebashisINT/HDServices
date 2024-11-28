package com.breezefieldhdservices.features.photoReg.present

import com.breezefieldhdservices.app.domain.ProspectEntity
import com.breezefieldhdservices.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}