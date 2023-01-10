package com.saitawngpha.locationbackground

import android.location.Location
import kotlinx.coroutines.flow.Flow

/**
 * @Author: ၸၢႆးတွင်ႉၾႃႉ
 * @Date: 1/9/23
 */

interface LocationClient {

    fun getLocationUpdates(interval: Long) : Flow<Location>

    class LocationException(message: String) : Exception()
}