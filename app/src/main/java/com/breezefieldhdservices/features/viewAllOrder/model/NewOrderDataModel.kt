package com.breezefieldhdservices.features.viewAllOrder.model

import com.breezefieldhdservices.app.domain.NewOrderColorEntity
import com.breezefieldhdservices.app.domain.NewOrderGenderEntity
import com.breezefieldhdservices.app.domain.NewOrderProductEntity
import com.breezefieldhdservices.app.domain.NewOrderSizeEntity
import com.breezefieldhdservices.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}

