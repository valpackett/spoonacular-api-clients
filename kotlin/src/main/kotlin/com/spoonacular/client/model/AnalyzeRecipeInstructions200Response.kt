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

import com.spoonacular.client.model.AnalyzeRecipeInstructions200ResponseIngredientsInner
import com.spoonacular.client.model.AnalyzeRecipeInstructions200ResponseParsedInstructionsInner

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param parsedInstructions 
 * @param ingredients 
 * @param equipment 
 */


data class AnalyzeRecipeInstructions200Response (

    @Json(name = "parsedInstructions")
    val parsedInstructions: kotlin.collections.Set<AnalyzeRecipeInstructions200ResponseParsedInstructionsInner>,

    @Json(name = "ingredients")
    val ingredients: kotlin.collections.Set<AnalyzeRecipeInstructions200ResponseIngredientsInner>,

    @Json(name = "equipment")
    val equipment: kotlin.collections.Set<AnalyzeRecipeInstructions200ResponseIngredientsInner>

) {


}

