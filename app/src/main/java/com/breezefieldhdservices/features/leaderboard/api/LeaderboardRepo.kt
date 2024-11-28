package com.breezefieldhdservices.features.leaderboard.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import com.fasterxml.jackson.databind.ObjectMapper
import com.breezefieldhdservices.app.FileUtils
import com.breezefieldhdservices.app.Pref
import com.breezefieldhdservices.base.BaseResponse
import com.breezefieldhdservices.features.addshop.model.AddLogReqData
import com.breezefieldhdservices.features.addshop.model.AddShopRequestData
import com.breezefieldhdservices.features.addshop.model.AddShopResponse
import com.breezefieldhdservices.features.addshop.model.LogFileResponse
import com.breezefieldhdservices.features.addshop.model.UpdateAddrReq
import com.breezefieldhdservices.features.contacts.CallHisDtls
import com.breezefieldhdservices.features.contacts.CompanyReqData
import com.breezefieldhdservices.features.contacts.ContactMasterRes
import com.breezefieldhdservices.features.contacts.SourceMasterRes
import com.breezefieldhdservices.features.contacts.StageMasterRes
import com.breezefieldhdservices.features.contacts.StatusMasterRes
import com.breezefieldhdservices.features.contacts.TypeMasterRes
import com.breezefieldhdservices.features.dashboard.presentation.DashboardActivity
import com.breezefieldhdservices.features.login.model.WhatsappApiData
import com.breezefieldhdservices.features.login.model.WhatsappApiFetchData
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

/**
 * Created by Puja on 10-10-2024.
 */
class LeaderboardRepo(val apiService: LeaderboardApi) {

    fun branchlist(session_token: String): Observable<LeaderboardBranchData> {
        return apiService.branchList(session_token)
    }
    fun ownDatalist(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOwnData> {
        return apiService.ownDatalist(user_id,activitybased,branchwise,flag)
    }
    fun overAllAPI(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOverAllData> {
        return apiService.overAllDatalist(user_id,activitybased,branchwise,flag)
    }
}