package com.breezefieldhdservices.features.activities.api

import com.breezefieldhdservices.features.member.api.TeamApi
import com.breezefieldhdservices.features.member.api.TeamRepo

object ActivityRepoProvider {
    fun activityRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.create())
    }

    fun activityImageRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.createImage())
    }
}