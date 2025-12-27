package com.example.questapi_025.apiservice

import kotlinx.serialization.Serializable

@Serializable
data class ResponseSiswa(
    val success: Boolean,
    val data: List<DataSiswa>
)