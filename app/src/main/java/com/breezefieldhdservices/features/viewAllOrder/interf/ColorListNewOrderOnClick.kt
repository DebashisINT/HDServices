package com.breezefieldhdservices.features.viewAllOrder.interf

import com.breezefieldhdservices.app.domain.NewOrderColorEntity
import com.breezefieldhdservices.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}