package com.breezefieldhdservices.features.lead.api

import com.breezefieldhdservices.features.NewQuotation.api.GetQuotListRegRepository
import com.breezefieldhdservices.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}