package com.breezefieldhdservices.features.viewAllOrder.interf

import com.breezefieldhdservices.app.domain.NewOrderGenderEntity
import com.breezefieldhdservices.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}