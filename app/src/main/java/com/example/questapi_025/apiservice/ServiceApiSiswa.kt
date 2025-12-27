package com.example.questapi_025.apiservice

import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Query

interface ServiceApiSiswa {

    // LIST
    @GET("siswa.php")
    suspend fun getSiswa(): ResponseSiswa

    // DETAIL
    @GET("siswa.php")
    suspend fun getSatuSiswa(
        @Query("id") id: Int
    ): ResponseSatuSiswa

    @POST("siswa.php")
    suspend fun postSiswa(
        @Body data: DataSiswa
    ): Response<Void>

    @PUT("siswa.php")
    suspend fun editSatuSiswa(
        @Query("id") id: Int,
        @Body data: DataSiswa
    ): Response<Void>

    @DELETE("siswa.php")
    suspend fun hapusSatuSiswa(
        @Query("id") id: Int
    ): Response<Void>
}