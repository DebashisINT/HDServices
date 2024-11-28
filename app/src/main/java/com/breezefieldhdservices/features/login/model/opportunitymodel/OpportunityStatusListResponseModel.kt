package com.breezefieldhdservices.features.login.model.opportunitymodel

import com.breezefieldhdservices.app.domain.OpportunityStatusEntity
import com.breezefieldhdservices.app.domain.ProductListEntity
import com.breezefieldhdservices.base.BaseResponse

/**
 * Created by Puja on 30.05.2024
 */
class OpportunityStatusListResponseModel : BaseResponse() {
    var status_list: ArrayList<OpportunityStatusEntity>? = null
}