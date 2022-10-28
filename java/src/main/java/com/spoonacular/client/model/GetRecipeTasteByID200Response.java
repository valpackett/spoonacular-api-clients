/*
 * spoonacular API
 * The spoonacular Nutrition, Recipe, and Food API allows you to access over 380,000 recipes, thousands of ingredients, 800,000 food products, and 100,000 menu items. Our food ontology and semantic recipe search engine makes it possible to search for recipes using natural language queries, such as \"gluten free brownies without sugar\" or \"low fat vegan cupcakes.\" You can automatically calculate the nutritional information for any recipe, analyze recipe costs, visualize ingredient lists, find recipes for what's in your fridge, find recipes based on special diets, nutritional requirements, or favorite ingredients, classify recipes into types and cuisines, convert ingredient amounts, or even compute an entire meal plan. With our powerful API, you can create many kinds of food and especially nutrition apps.  Special diets/dietary requirements currently available include: vegan, vegetarian, pescetarian, gluten free, grain free, dairy free, high protein, whole 30, low sodium, low carb, Paleo, ketogenic, FODMAP, and Primal.
 *
 * The version of the OpenAPI document: 1.1
 * Contact: mail@spoonacular.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.spoonacular.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.spoonacular.client.JSON;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-28T13:58:23.400+02:00[Europe/Berlin]")
public class GetRecipeTasteByID200Response {
  public static final String SERIALIZED_NAME_SWEETNESS = "sweetness";
  @SerializedName(SERIALIZED_NAME_SWEETNESS)
  private BigDecimal sweetness;

  public static final String SERIALIZED_NAME_SALTINESS = "saltiness";
  @SerializedName(SERIALIZED_NAME_SALTINESS)
  private BigDecimal saltiness;

  public static final String SERIALIZED_NAME_SOURNESS = "sourness";
  @SerializedName(SERIALIZED_NAME_SOURNESS)
  private BigDecimal sourness;

  public static final String SERIALIZED_NAME_BITTERNESS = "bitterness";
  @SerializedName(SERIALIZED_NAME_BITTERNESS)
  private BigDecimal bitterness;

  public static final String SERIALIZED_NAME_SAVORINESS = "savoriness";
  @SerializedName(SERIALIZED_NAME_SAVORINESS)
  private BigDecimal savoriness;

  public static final String SERIALIZED_NAME_FATTINESS = "fattiness";
  @SerializedName(SERIALIZED_NAME_FATTINESS)
  private BigDecimal fattiness;

  public static final String SERIALIZED_NAME_SPICINESS = "spiciness";
  @SerializedName(SERIALIZED_NAME_SPICINESS)
  private BigDecimal spiciness;

  public GetRecipeTasteByID200Response() { 
  }

  public GetRecipeTasteByID200Response sweetness(BigDecimal sweetness) {
    
    this.sweetness = sweetness;
    return this;
  }

   /**
   * Get sweetness
   * @return sweetness
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BigDecimal getSweetness() {
    return sweetness;
  }


  public void setSweetness(BigDecimal sweetness) {
    this.sweetness = sweetness;
  }


  public GetRecipeTasteByID200Response saltiness(BigDecimal saltiness) {
    
    this.saltiness = saltiness;
    return this;
  }

   /**
   * Get saltiness
   * @return saltiness
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BigDecimal getSaltiness() {
    return saltiness;
  }


  public void setSaltiness(BigDecimal saltiness) {
    this.saltiness = saltiness;
  }


  public GetRecipeTasteByID200Response sourness(BigDecimal sourness) {
    
    this.sourness = sourness;
    return this;
  }

   /**
   * Get sourness
   * @return sourness
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BigDecimal getSourness() {
    return sourness;
  }


  public void setSourness(BigDecimal sourness) {
    this.sourness = sourness;
  }


  public GetRecipeTasteByID200Response bitterness(BigDecimal bitterness) {
    
    this.bitterness = bitterness;
    return this;
  }

   /**
   * Get bitterness
   * @return bitterness
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BigDecimal getBitterness() {
    return bitterness;
  }


  public void setBitterness(BigDecimal bitterness) {
    this.bitterness = bitterness;
  }


  public GetRecipeTasteByID200Response savoriness(BigDecimal savoriness) {
    
    this.savoriness = savoriness;
    return this;
  }

   /**
   * Get savoriness
   * @return savoriness
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BigDecimal getSavoriness() {
    return savoriness;
  }


  public void setSavoriness(BigDecimal savoriness) {
    this.savoriness = savoriness;
  }


  public GetRecipeTasteByID200Response fattiness(BigDecimal fattiness) {
    
    this.fattiness = fattiness;
    return this;
  }

   /**
   * Get fattiness
   * @return fattiness
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BigDecimal getFattiness() {
    return fattiness;
  }


  public void setFattiness(BigDecimal fattiness) {
    this.fattiness = fattiness;
  }


  public GetRecipeTasteByID200Response spiciness(BigDecimal spiciness) {
    
    this.spiciness = spiciness;
    return this;
  }

   /**
   * Get spiciness
   * @return spiciness
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BigDecimal getSpiciness() {
    return spiciness;
  }


  public void setSpiciness(BigDecimal spiciness) {
    this.spiciness = spiciness;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRecipeTasteByID200Response getRecipeTasteByID200Response = (GetRecipeTasteByID200Response) o;
    return Objects.equals(this.sweetness, getRecipeTasteByID200Response.sweetness) &&
        Objects.equals(this.saltiness, getRecipeTasteByID200Response.saltiness) &&
        Objects.equals(this.sourness, getRecipeTasteByID200Response.sourness) &&
        Objects.equals(this.bitterness, getRecipeTasteByID200Response.bitterness) &&
        Objects.equals(this.savoriness, getRecipeTasteByID200Response.savoriness) &&
        Objects.equals(this.fattiness, getRecipeTasteByID200Response.fattiness) &&
        Objects.equals(this.spiciness, getRecipeTasteByID200Response.spiciness);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sweetness, saltiness, sourness, bitterness, savoriness, fattiness, spiciness);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRecipeTasteByID200Response {\n");
    sb.append("    sweetness: ").append(toIndentedString(sweetness)).append("\n");
    sb.append("    saltiness: ").append(toIndentedString(saltiness)).append("\n");
    sb.append("    sourness: ").append(toIndentedString(sourness)).append("\n");
    sb.append("    bitterness: ").append(toIndentedString(bitterness)).append("\n");
    sb.append("    savoriness: ").append(toIndentedString(savoriness)).append("\n");
    sb.append("    fattiness: ").append(toIndentedString(fattiness)).append("\n");
    sb.append("    spiciness: ").append(toIndentedString(spiciness)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("sweetness");
    openapiFields.add("saltiness");
    openapiFields.add("sourness");
    openapiFields.add("bitterness");
    openapiFields.add("savoriness");
    openapiFields.add("fattiness");
    openapiFields.add("spiciness");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("sweetness");
    openapiRequiredFields.add("saltiness");
    openapiRequiredFields.add("sourness");
    openapiRequiredFields.add("bitterness");
    openapiRequiredFields.add("savoriness");
    openapiRequiredFields.add("fattiness");
    openapiRequiredFields.add("spiciness");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetRecipeTasteByID200Response
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetRecipeTasteByID200Response.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetRecipeTasteByID200Response is not found in the empty JSON string", GetRecipeTasteByID200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetRecipeTasteByID200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetRecipeTasteByID200Response` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetRecipeTasteByID200Response.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetRecipeTasteByID200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetRecipeTasteByID200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetRecipeTasteByID200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetRecipeTasteByID200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<GetRecipeTasteByID200Response>() {
           @Override
           public void write(JsonWriter out, GetRecipeTasteByID200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetRecipeTasteByID200Response read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetRecipeTasteByID200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetRecipeTasteByID200Response
  * @throws IOException if the JSON string is invalid with respect to GetRecipeTasteByID200Response
  */
  public static GetRecipeTasteByID200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetRecipeTasteByID200Response.class);
  }

 /**
  * Convert an instance of GetRecipeTasteByID200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

