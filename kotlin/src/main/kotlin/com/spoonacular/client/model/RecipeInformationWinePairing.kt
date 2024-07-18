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

import com.spoonacular.client.model.RecipeInformationWinePairingProductMatchesInner

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param pairedWines 
 * @param pairingText 
 * @param productMatches 
 */


data class RecipeInformationWinePairing (

    @Json(name = "pairedWines")
    val pairedWines: kotlin.collections.List<kotlin.String>? = null,

    @Json(name = "pairingText")
    val pairingText: kotlin.String? = null,

    @Json(name = "productMatches")
    val productMatches: kotlin.collections.Set<RecipeInformationWinePairingProductMatchesInner>? = null

) {


}

