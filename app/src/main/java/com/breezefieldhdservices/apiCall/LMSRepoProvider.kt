package com.breezefieldhdservices.features.mylearning.apiCall

import com.breezefieldhdservices.features.login.api.opportunity.OpportunityListApi
import com.breezefieldhdservices.features.login.api.opportunity.OpportunityListRepo

object LMSRepoProvider {
    fun getTopicList(): LMSRepo {
        return LMSRepo(LMSApi.create())
    }
}