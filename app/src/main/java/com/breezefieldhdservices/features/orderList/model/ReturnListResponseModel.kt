package com.breezefieldhdservices.features.orderList.model

import com.breezefieldhdservices.base.BaseResponse


class ReturnListResponseModel: BaseResponse() {
    var return_list: ArrayList<ReturnDataModel>? = null
}