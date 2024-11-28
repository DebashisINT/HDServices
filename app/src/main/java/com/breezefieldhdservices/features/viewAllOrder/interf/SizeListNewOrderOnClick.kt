package com.breezefieldhdservices.features.viewAllOrder.interf

import com.breezefieldhdservices.app.domain.NewOrderProductEntity
import com.breezefieldhdservices.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}