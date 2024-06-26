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

import com.spoonacular.client.model.SearchGroceryProductsByUPC200ResponseNutrition
import com.spoonacular.client.model.SearchGroceryProductsByUPC200ResponseServings

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param id 
 * @param title 
 * @param restaurantChain 
 * @param nutrition 
 * @param badges 
 * @param breadcrumbs 
 * @param imageType 
 * @param likes 
 * @param servings 
 * @param generatedText 
 * @param price 
 * @param spoonacularScore 
 */


data class GetMenuItemInformation200Response (

    @Json(name = "id")
    val id: kotlin.Int,

    @Json(name = "title")
    val title: kotlin.String,

    @Json(name = "restaurantChain")
    val restaurantChain: kotlin.String,

    @Json(name = "nutrition")
    val nutrition: SearchGroceryProductsByUPC200ResponseNutrition,

    @Json(name = "badges")
    val badges: kotlin.collections.List<kotlin.String>,

    @Json(name = "breadcrumbs")
    val breadcrumbs: kotlin.collections.List<kotlin.String>,

    @Json(name = "imageType")
    val imageType: kotlin.String,

    @Json(name = "likes")
    val likes: java.math.BigDecimal,

    @Json(name = "servings")
    val servings: SearchGroceryProductsByUPC200ResponseServings,

    @Json(name = "generatedText")
    val generatedText: kotlin.String? = null,

    @Json(name = "price")
    val price: java.math.BigDecimal? = null,

    @Json(name = "spoonacularScore")
    val spoonacularScore: java.math.BigDecimal? = null

) {


}

