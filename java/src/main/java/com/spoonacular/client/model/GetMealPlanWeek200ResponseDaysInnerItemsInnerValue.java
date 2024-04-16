/*
 * spoonacular API
 * The spoonacular Nutrition, Recipe, and Food API allows you to access over thousands of recipes, thousands of ingredients, 800,000 food products, over 100,000 menu items, and restaurants. Our food ontology and semantic recipe search engine makes it possible to search for recipes using natural language queries, such as \"gluten free brownies without sugar\" or \"low fat vegan cupcakes.\" You can automatically calculate the nutritional information for any recipe, analyze recipe costs, visualize ingredient lists, find recipes for what's in your fridge, find recipes based on special diets, nutritional requirements, or favorite ingredients, classify recipes into types and cuisines, convert ingredient amounts, or even compute an entire meal plan. With our powerful API, you can create many kinds of food and especially nutrition apps.  Special diets/dietary requirements currently available include: vegan, vegetarian, pescetarian, gluten free, grain free, dairy free, high protein, whole 30, low sodium, low carb, Paleo, ketogenic, FODMAP, and Primal.
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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;

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
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.spoonacular.client.JSON;

/**
 * GetMealPlanWeek200ResponseDaysInnerItemsInnerValue
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetMealPlanWeek200ResponseDaysInnerItemsInnerValue {
  public static final String SERIALIZED_NAME_SERVINGS = "servings";
  @SerializedName(SERIALIZED_NAME_SERVINGS)
  private BigDecimal servings;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private BigDecimal id;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_IMAGE_TYPE = "imageType";
  @SerializedName(SERIALIZED_NAME_IMAGE_TYPE)
  private String imageType;

  public GetMealPlanWeek200ResponseDaysInnerItemsInnerValue() {
  }

  public GetMealPlanWeek200ResponseDaysInnerItemsInnerValue servings(BigDecimal servings) {
    this.servings = servings;
    return this;
  }

   /**
   * Get servings
   * @return servings
  **/
  @javax.annotation.Nonnull
  public BigDecimal getServings() {
    return servings;
  }

  public void setServings(BigDecimal servings) {
    this.servings = servings;
  }


  public GetMealPlanWeek200ResponseDaysInnerItemsInnerValue id(BigDecimal id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  public BigDecimal getId() {
    return id;
  }

  public void setId(BigDecimal id) {
    this.id = id;
  }


  public GetMealPlanWeek200ResponseDaysInnerItemsInnerValue title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nonnull
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public GetMealPlanWeek200ResponseDaysInnerItemsInnerValue imageType(String imageType) {
    this.imageType = imageType;
    return this;
  }

   /**
   * Get imageType
   * @return imageType
  **/
  @javax.annotation.Nonnull
  public String getImageType() {
    return imageType;
  }

  public void setImageType(String imageType) {
    this.imageType = imageType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetMealPlanWeek200ResponseDaysInnerItemsInnerValue getMealPlanWeek200ResponseDaysInnerItemsInnerValue = (GetMealPlanWeek200ResponseDaysInnerItemsInnerValue) o;
    return Objects.equals(this.servings, getMealPlanWeek200ResponseDaysInnerItemsInnerValue.servings) &&
        Objects.equals(this.id, getMealPlanWeek200ResponseDaysInnerItemsInnerValue.id) &&
        Objects.equals(this.title, getMealPlanWeek200ResponseDaysInnerItemsInnerValue.title) &&
        Objects.equals(this.imageType, getMealPlanWeek200ResponseDaysInnerItemsInnerValue.imageType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(servings, id, title, imageType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetMealPlanWeek200ResponseDaysInnerItemsInnerValue {\n");
    sb.append("    servings: ").append(toIndentedString(servings)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
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
    openapiFields.add("servings");
    openapiFields.add("id");
    openapiFields.add("title");
    openapiFields.add("imageType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("servings");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("title");
    openapiRequiredFields.add("imageType");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetMealPlanWeek200ResponseDaysInnerItemsInnerValue
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetMealPlanWeek200ResponseDaysInnerItemsInnerValue.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetMealPlanWeek200ResponseDaysInnerItemsInnerValue is not found in the empty JSON string", GetMealPlanWeek200ResponseDaysInnerItemsInnerValue.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetMealPlanWeek200ResponseDaysInnerItemsInnerValue.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetMealPlanWeek200ResponseDaysInnerItemsInnerValue` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetMealPlanWeek200ResponseDaysInnerItemsInnerValue.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if (!jsonObj.get("imageType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `imageType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("imageType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetMealPlanWeek200ResponseDaysInnerItemsInnerValue.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetMealPlanWeek200ResponseDaysInnerItemsInnerValue' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetMealPlanWeek200ResponseDaysInnerItemsInnerValue> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetMealPlanWeek200ResponseDaysInnerItemsInnerValue.class));

       return (TypeAdapter<T>) new TypeAdapter<GetMealPlanWeek200ResponseDaysInnerItemsInnerValue>() {
           @Override
           public void write(JsonWriter out, GetMealPlanWeek200ResponseDaysInnerItemsInnerValue value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetMealPlanWeek200ResponseDaysInnerItemsInnerValue read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetMealPlanWeek200ResponseDaysInnerItemsInnerValue given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetMealPlanWeek200ResponseDaysInnerItemsInnerValue
  * @throws IOException if the JSON string is invalid with respect to GetMealPlanWeek200ResponseDaysInnerItemsInnerValue
  */
  public static GetMealPlanWeek200ResponseDaysInnerItemsInnerValue fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetMealPlanWeek200ResponseDaysInnerItemsInnerValue.class);
  }

 /**
  * Convert an instance of GetMealPlanWeek200ResponseDaysInnerItemsInnerValue to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

