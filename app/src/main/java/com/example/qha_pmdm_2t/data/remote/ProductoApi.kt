package com.example.qha_pmdm_2t.data.remote

import com.example.qha_pmdm_2t.data.model.PagedResponse
import com.example.qha_pmdm_2t.data.model.ProductoDto
import retrofit2.http.GET
import retrofit2.http.Query

interface ProductosApi {

    @GET("products")
    suspend fun getProducts(
        @Query("page") page: Int = 1
    ): PagedResponse<ProductoDto>
}