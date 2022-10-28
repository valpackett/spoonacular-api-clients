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
import com.spoonacular.client.model.ParseIngredients200ResponseInnerNutritionCaloricBreakdown;
import com.spoonacular.client.model.ParseIngredients200ResponseInnerNutritionNutrientsInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

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
 * SearchGroceryProductsByUPC200ResponseNutrition
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-28T13:58:23.400+02:00[Europe/Berlin]")
public class SearchGroceryProductsByUPC200ResponseNutrition {
  public static final String SERIALIZED_NAME_NUTRIENTS = "nutrients";
  @SerializedName(SERIALIZED_NAME_NUTRIENTS)
  private Set<ParseIngredients200ResponseInnerNutritionNutrientsInner> nutrients = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_CALORIC_BREAKDOWN = "caloricBreakdown";
  @SerializedName(SERIALIZED_NAME_CALORIC_BREAKDOWN)
  private ParseIngredients200ResponseInnerNutritionCaloricBreakdown caloricBreakdown;

  public SearchGroceryProductsByUPC200ResponseNutrition() { 
  }

  public SearchGroceryProductsByUPC200ResponseNutrition nutrients(Set<ParseIngredients200ResponseInnerNutritionNutrientsInner> nutrients) {
    
    this.nutrients = nutrients;
    return this;
  }

  public SearchGroceryProductsByUPC200ResponseNutrition addNutrientsItem(ParseIngredients200ResponseInnerNutritionNutrientsInner nutrientsItem) {
    this.nutrients.add(nutrientsItem);
    return this;
  }

   /**
   * Get nutrients
   * @return nutrients
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Set<ParseIngredients200ResponseInnerNutritionNutrientsInner> getNutrients() {
    return nutrients;
  }


  public void setNutrients(Set<ParseIngredients200ResponseInnerNutritionNutrientsInner> nutrients) {
    this.nutrients = nutrients;
  }


  public SearchGroceryProductsByUPC200ResponseNutrition caloricBreakdown(ParseIngredients200ResponseInnerNutritionCaloricBreakdown caloricBreakdown) {
    
    this.caloricBreakdown = caloricBreakdown;
    return this;
  }

   /**
   * Get caloricBreakdown
   * @return caloricBreakdown
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ParseIngredients200ResponseInnerNutritionCaloricBreakdown getCaloricBreakdown() {
    return caloricBreakdown;
  }


  public void setCaloricBreakdown(ParseIngredients200ResponseInnerNutritionCaloricBreakdown caloricBreakdown) {
    this.caloricBreakdown = caloricBreakdown;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchGroceryProductsByUPC200ResponseNutrition searchGroceryProductsByUPC200ResponseNutrition = (SearchGroceryProductsByUPC200ResponseNutrition) o;
    return Objects.equals(this.nutrients, searchGroceryProductsByUPC200ResponseNutrition.nutrients) &&
        Objects.equals(this.caloricBreakdown, searchGroceryProductsByUPC200ResponseNutrition.caloricBreakdown);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nutrients, caloricBreakdown);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchGroceryProductsByUPC200ResponseNutrition {\n");
    sb.append("    nutrients: ").append(toIndentedString(nutrients)).append("\n");
    sb.append("    caloricBreakdown: ").append(toIndentedString(caloricBreakdown)).append("\n");
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
    openapiFields.add("nutrients");
    openapiFields.add("caloricBreakdown");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("nutrients");
    openapiRequiredFields.add("caloricBreakdown");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SearchGroceryProductsByUPC200ResponseNutrition
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SearchGroceryProductsByUPC200ResponseNutrition.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SearchGroceryProductsByUPC200ResponseNutrition is not found in the empty JSON string", SearchGroceryProductsByUPC200ResponseNutrition.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SearchGroceryProductsByUPC200ResponseNutrition.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SearchGroceryProductsByUPC200ResponseNutrition` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SearchGroceryProductsByUPC200ResponseNutrition.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      JsonArray jsonArraynutrients = jsonObj.getAsJsonArray("nutrients");
      if (jsonArraynutrients != null) {
        // ensure the json data is an array
        if (!jsonObj.get("nutrients").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `nutrients` to be an array in the JSON string but got `%s`", jsonObj.get("nutrients").toString()));
        }

        // validate the optional field `nutrients` (array)
        for (int i = 0; i < jsonArraynutrients.size(); i++) {
          ParseIngredients200ResponseInnerNutritionNutrientsInner.validateJsonObject(jsonArraynutrients.get(i).getAsJsonObject());
        };
      }
      // validate the optional field `caloricBreakdown`
      if (jsonObj.getAsJsonObject("caloricBreakdown") != null) {
        ParseIngredients200ResponseInnerNutritionCaloricBreakdown.validateJsonObject(jsonObj.getAsJsonObject("caloricBreakdown"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SearchGroceryProductsByUPC200ResponseNutrition.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SearchGroceryProductsByUPC200ResponseNutrition' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SearchGroceryProductsByUPC200ResponseNutrition> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SearchGroceryProductsByUPC200ResponseNutrition.class));

       return (TypeAdapter<T>) new TypeAdapter<SearchGroceryProductsByUPC200ResponseNutrition>() {
           @Override
           public void write(JsonWriter out, SearchGroceryProductsByUPC200ResponseNutrition value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SearchGroceryProductsByUPC200ResponseNutrition read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SearchGroceryProductsByUPC200ResponseNutrition given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SearchGroceryProductsByUPC200ResponseNutrition
  * @throws IOException if the JSON string is invalid with respect to SearchGroceryProductsByUPC200ResponseNutrition
  */
  public static SearchGroceryProductsByUPC200ResponseNutrition fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SearchGroceryProductsByUPC200ResponseNutrition.class);
  }

 /**
  * Convert an instance of SearchGroceryProductsByUPC200ResponseNutrition to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
