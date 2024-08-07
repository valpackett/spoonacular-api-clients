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

import com.spoonacular.client.model.IngredientInformationEstimatedCost
import com.spoonacular.client.model.IngredientInformationNutrition

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param id 
 * @param original 
 * @param originalName 
 * @param name 
 * @param amount 
 * @param unit 
 * @param unitShort 
 * @param unitLong 
 * @param possibleUnits 
 * @param estimatedCost 
 * @param consistency 
 * @param aisle 
 * @param image 
 * @param meta 
 * @param shoppingListUnits 
 * @param nutrition 
 * @param categoryPath 
 */


data class IngredientInformation (

    @Json(name = "id")
    val id: kotlin.Int,

    @Json(name = "original")
    val original: kotlin.String,

    @Json(name = "originalName")
    val originalName: kotlin.String,

    @Json(name = "name")
    val name: kotlin.String,

    @Json(name = "amount")
    val amount: java.math.BigDecimal,

    @Json(name = "unit")
    val unit: kotlin.String,

    @Json(name = "unitShort")
    val unitShort: kotlin.String,

    @Json(name = "unitLong")
    val unitLong: kotlin.String,

    @Json(name = "possibleUnits")
    val possibleUnits: kotlin.collections.List<kotlin.String>,

    @Json(name = "estimatedCost")
    val estimatedCost: IngredientInformationEstimatedCost,

    @Json(name = "consistency")
    val consistency: kotlin.String,

    @Json(name = "aisle")
    val aisle: kotlin.String,

    @Json(name = "image")
    val image: kotlin.String,

    @Json(name = "meta")
    val meta: kotlin.collections.List<kotlin.String>,

    @Json(name = "shoppingListUnits")
    val shoppingListUnits: kotlin.collections.List<kotlin.String>? = null,

    @Json(name = "nutrition")
    val nutrition: IngredientInformationNutrition? = null,

    @Json(name = "categoryPath")
    val categoryPath: kotlin.collections.List<kotlin.String>? = null

) {


}

