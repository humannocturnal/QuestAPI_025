package com.example.questapi_025.apiservice

import kotlinx.serialization.Serializable

@Serializable
data class ResponseSatuSiswa(
    val success: Boolean,
    val data: DataSiswa
)