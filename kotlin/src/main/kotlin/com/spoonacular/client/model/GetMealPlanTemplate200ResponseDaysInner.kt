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

import com.spoonacular.client.model.GetMealPlanTemplate200ResponseDaysInnerItemsInner
import com.spoonacular.client.model.GetMealPlanWeek200ResponseDaysInnerNutritionSummary

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param day 
 * @param nutritionSummary 
 * @param nutritionSummaryBreakfast 
 * @param nutritionSummaryLunch 
 * @param nutritionSummaryDinner 
 * @param items 
 */


data class GetMealPlanTemplate200ResponseDaysInner (

    @Json(name = "day")
    val day: kotlin.String,

    @Json(name = "nutritionSummary")
    val nutritionSummary: GetMealPlanWeek200ResponseDaysInnerNutritionSummary? = null,

    @Json(name = "nutritionSummaryBreakfast")
    val nutritionSummaryBreakfast: GetMealPlanWeek200ResponseDaysInnerNutritionSummary? = null,

    @Json(name = "nutritionSummaryLunch")
    val nutritionSummaryLunch: GetMealPlanWeek200ResponseDaysInnerNutritionSummary? = null,

    @Json(name = "nutritionSummaryDinner")
    val nutritionSummaryDinner: GetMealPlanWeek200ResponseDaysInnerNutritionSummary? = null,

    @Json(name = "items")
    val items: kotlin.collections.Set<GetMealPlanTemplate200ResponseDaysInnerItemsInner>? = null

) {


}

