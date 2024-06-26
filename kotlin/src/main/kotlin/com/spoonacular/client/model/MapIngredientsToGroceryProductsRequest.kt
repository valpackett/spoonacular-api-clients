/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package com.spoonacular.client.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param ingredients 
 * @param servings 
 */


data class MapIngredientsToGroceryProductsRequest (

    @Json(name = "ingredients")
    val ingredients: kotlin.collections.List<kotlin.String>,

    @Json(name = "servings")
    val servings: java.math.BigDecimal

) {


}

