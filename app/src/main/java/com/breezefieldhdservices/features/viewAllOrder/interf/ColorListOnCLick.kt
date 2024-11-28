package com.breezefieldhdservices.features.viewAllOrder.interf

import com.breezefieldhdservices.app.domain.NewOrderGenderEntity
import com.breezefieldhdservices.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}