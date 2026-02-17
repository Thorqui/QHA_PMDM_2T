package com.example.qha_pmdm_2t.data.repository

import com.example.qha_pmdm_2t.data.model.ProductoDto
import com.example.qha_pmdm_2t.data.remote.ProductosApi

class ProductosRepository(private val api: ProductosApi) {
    suspend fun getProducts(page: Int = 1): List<ProductoDto> =
        api.getProducts(page).results
}
