package com.breezefieldhdservices.features.damageProduct.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import android.util.Log
import com.breezefieldhdservices.app.FileUtils
import com.breezefieldhdservices.base.BaseResponse
import com.breezefieldhdservices.features.NewQuotation.model.*
import com.breezefieldhdservices.features.addshop.model.AddShopRequestData
import com.breezefieldhdservices.features.addshop.model.AddShopResponse
import com.breezefieldhdservices.features.damageProduct.model.DamageProductResponseModel
import com.breezefieldhdservices.features.damageProduct.model.delBreakageReq
import com.breezefieldhdservices.features.damageProduct.model.viewAllBreakageReq
import com.breezefieldhdservices.features.login.model.userconfig.UserConfigResponseModel
import com.breezefieldhdservices.features.myjobs.model.WIPImageSubmit
import com.breezefieldhdservices.features.photoReg.model.*
import com.fasterxml.jackson.databind.ObjectMapper
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

class GetDamageProductListRegRepository(val apiService : GetDamageProductListApi) {

    fun viewBreakage(req: viewAllBreakageReq): Observable<DamageProductResponseModel> {
        return apiService.viewBreakage(req)
    }

    fun delBreakage(req: delBreakageReq): Observable<BaseResponse>{
        return apiService.BreakageDel(req.user_id!!,req.breakage_number!!,req.session_token!!)
    }

}