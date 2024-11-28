package com.breezefieldhdservices.features.task.api

import com.breezefieldhdservices.features.timesheet.api.TimeSheetApi
import com.breezefieldhdservices.features.timesheet.api.TimeSheetRepo

/**
 * Created by Saikat on 12-Aug-20.
 */
object TaskRepoProvider {
    fun taskRepoProvider(): TaskRepo {
        return TaskRepo(TaskApi.create())
    }
}