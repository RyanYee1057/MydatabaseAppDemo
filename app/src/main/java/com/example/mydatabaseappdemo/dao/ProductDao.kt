package com.example.mydatabaseappdemo.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.mydatabaseappdemo.entity.Product

@Dao
interface ProductDao {

    @Insert
    fun insertProduct(p: Product)

    @Query ("Select * from product_table")
    fun getAllProduct(): List<Product>

    @Query ("Select * from product_table where price <= :price")
    fun getProductByPrice(price :Double): List<Product>

}