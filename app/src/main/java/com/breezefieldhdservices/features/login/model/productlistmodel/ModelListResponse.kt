package com.breezefieldhdservices.features.login.model.productlistmodel

import com.breezefieldhdservices.app.domain.ModelEntity
import com.breezefieldhdservices.app.domain.ProductListEntity
import com.breezefieldhdservices.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}