package com.breezefieldhdservices.features.viewAllOrder.orderOptimized

import com.breezefieldhdservices.app.domain.ProductOnlineRateTempEntity
import com.breezefieldhdservices.base.BaseResponse
import com.breezefieldhdservices.features.login.model.productlistmodel.ProductRateDataModel
import java.io.Serializable

class ProductRateOnlineListResponseModel: BaseResponse(), Serializable {
    var product_rate_list: ArrayList<ProductOnlineRateTempEntity>? = null
}