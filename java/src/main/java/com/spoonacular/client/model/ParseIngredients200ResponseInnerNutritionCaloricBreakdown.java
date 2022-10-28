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
 * ParseIngredients200ResponseInnerNutritionCaloricBreakdown
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-28T13:58:23.400+02:00[Europe/Berlin]")
public class ParseIngredients200ResponseInnerNutritionCaloricBreakdown {
  public static final String SERIALIZED_NAME_PERCENT_PROTEIN = "percentProtein";
  @SerializedName(SERIALIZED_NAME_PERCENT_PROTEIN)
  private BigDecimal percentProtein;

  public static final String SERIALIZED_NAME_PERCENT_FAT = "percentFat";
  @SerializedName(SERIALIZED_NAME_PERCENT_FAT)
  private BigDecimal percentFat;

  public static final String SERIALIZED_NAME_PERCENT_CARBS = "percentCarbs";
  @SerializedName(SERIALIZED_NAME_PERCENT_CARBS)
  private BigDecimal percentCarbs;

  public ParseIngredients200ResponseInnerNutritionCaloricBreakdown() { 
  }

  public ParseIngredients200ResponseInnerNutritionCaloricBreakdown percentProtein(BigDecimal percentProtein) {
    
    this.percentProtein = percentProtein;
    return this;
  }

   /**
   * Get percentProtein
   * @return percentProtein
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BigDecimal getPercentProtein() {
    return percentProtein;
  }


  public void setPercentProtein(BigDecimal percentProtein) {
    this.percentProtein = percentProtein;
  }


  public ParseIngredients200ResponseInnerNutritionCaloricBreakdown percentFat(BigDecimal percentFat) {
    
    this.percentFat = percentFat;
    return this;
  }

   /**
   * Get percentFat
   * @return percentFat
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BigDecimal getPercentFat() {
    return percentFat;
  }


  public void setPercentFat(BigDecimal percentFat) {
    this.percentFat = percentFat;
  }


  public ParseIngredients200ResponseInnerNutritionCaloricBreakdown percentCarbs(BigDecimal percentCarbs) {
    
    this.percentCarbs = percentCarbs;
    return this;
  }

   /**
   * Get percentCarbs
   * @return percentCarbs
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BigDecimal getPercentCarbs() {
    return percentCarbs;
  }


  public void setPercentCarbs(BigDecimal percentCarbs) {
    this.percentCarbs = percentCarbs;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParseIngredients200ResponseInnerNutritionCaloricBreakdown parseIngredients200ResponseInnerNutritionCaloricBreakdown = (ParseIngredients200ResponseInnerNutritionCaloricBreakdown) o;
    return Objects.equals(this.percentProtein, parseIngredients200ResponseInnerNutritionCaloricBreakdown.percentProtein) &&
        Objects.equals(this.percentFat, parseIngredients200ResponseInnerNutritionCaloricBreakdown.percentFat) &&
        Objects.equals(this.percentCarbs, parseIngredients200ResponseInnerNutritionCaloricBreakdown.percentCarbs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(percentProtein, percentFat, percentCarbs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParseIngredients200ResponseInnerNutritionCaloricBreakdown {\n");
    sb.append("    percentProtein: ").append(toIndentedString(percentProtein)).append("\n");
    sb.append("    percentFat: ").append(toIndentedString(percentFat)).append("\n");
    sb.append("    percentCarbs: ").append(toIndentedString(percentCarbs)).append("\n");
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
    openapiFields.add("percentProtein");
    openapiFields.add("percentFat");
    openapiFields.add("percentCarbs");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("percentProtein");
    openapiRequiredFields.add("percentFat");
    openapiRequiredFields.add("percentCarbs");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ParseIngredients200ResponseInnerNutritionCaloricBreakdown
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ParseIngredients200ResponseInnerNutritionCaloricBreakdown.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ParseIngredients200ResponseInnerNutritionCaloricBreakdown is not found in the empty JSON string", ParseIngredients200ResponseInnerNutritionCaloricBreakdown.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ParseIngredients200ResponseInnerNutritionCaloricBreakdown.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ParseIngredients200ResponseInnerNutritionCaloricBreakdown` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ParseIngredients200ResponseInnerNutritionCaloricBreakdown.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ParseIngredients200ResponseInnerNutritionCaloricBreakdown.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ParseIngredients200ResponseInnerNutritionCaloricBreakdown' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ParseIngredients200ResponseInnerNutritionCaloricBreakdown> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ParseIngredients200ResponseInnerNutritionCaloricBreakdown.class));

       return (TypeAdapter<T>) new TypeAdapter<ParseIngredients200ResponseInnerNutritionCaloricBreakdown>() {
           @Override
           public void write(JsonWriter out, ParseIngredients200ResponseInnerNutritionCaloricBreakdown value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ParseIngredients200ResponseInnerNutritionCaloricBreakdown read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ParseIngredients200ResponseInnerNutritionCaloricBreakdown given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ParseIngredients200ResponseInnerNutritionCaloricBreakdown
  * @throws IOException if the JSON string is invalid with respect to ParseIngredients200ResponseInnerNutritionCaloricBreakdown
  */
  public static ParseIngredients200ResponseInnerNutritionCaloricBreakdown fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ParseIngredients200ResponseInnerNutritionCaloricBreakdown.class);
  }

 /**
  * Convert an instance of ParseIngredients200ResponseInnerNutritionCaloricBreakdown to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

