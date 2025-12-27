package com.example.questapi_025.uicontroller.route

import com.example.questapi_025.R

object DestinasiDetail: DestinasiNavigasi {
    override val route = "detail_siswa"

    override val titleRes = "Detail Siswa"
    const val itemIdArg = "idSiswa"

    val routeWithArgs = "$route/{$itemIdArg}"
}