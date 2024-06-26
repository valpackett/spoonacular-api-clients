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
 * SearchRestaurants200ResponseRestaurantsInnerLocalHoursOperational
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0-SNAPSHOT")
public class SearchRestaurants200ResponseRestaurantsInnerLocalHoursOperational {
  public static final String SERIALIZED_NAME_MONDAY = "Monday";
  @SerializedName(SERIALIZED_NAME_MONDAY)
  private String monday;

  public static final String SERIALIZED_NAME_TUESDAY = "Tuesday";
  @SerializedName(SERIALIZED_NAME_TUESDAY)
  private String tuesday;

  public static final String SERIALIZED_NAME_WEDNESDAY = "Wednesday";
  @SerializedName(SERIALIZED_NAME_WEDNESDAY)
  private String wednesday;

  public static final String SERIALIZED_NAME_THURSDAY = "Thursday";
  @SerializedName(SERIALIZED_NAME_THURSDAY)
  private String thursday;

  public static final String SERIALIZED_NAME_FRIDAY = "Friday";
  @SerializedName(SERIALIZED_NAME_FRIDAY)
  private String friday;

  public static final String SERIALIZED_NAME_SATURDAY = "Saturday";
  @SerializedName(SERIALIZED_NAME_SATURDAY)
  private String saturday;

  public static final String SERIALIZED_NAME_SUNDAY = "Sunday";
  @SerializedName(SERIALIZED_NAME_SUNDAY)
  private String sunday;

  public SearchRestaurants200ResponseRestaurantsInnerLocalHoursOperational() {
  }

  public SearchRestaurants200ResponseRestaurantsInnerLocalHoursOperational monday(String monday) {
    this.monday = monday;
    return this;
  }

  /**
   * Get monday
   * @return monday
   */
  @javax.annotation.Nullable
  public String getMonday() {
    return monday;
  }

  public void setMonday(String monday) {
    this.monday = monday;
  }


  public SearchRestaurants200ResponseRestaurantsInnerLocalHoursOperational tuesday(String tuesday) {
    this.tuesday = tuesday;
    return this;
  }

  /**
   * Get tuesday
   * @return tuesday
   */
  @javax.annotation.Nullable
  public String getTuesday() {
    return tuesday;
  }

  public void setTuesday(String tuesday) {
    this.tuesday = tuesday;
  }


  public SearchRestaurants200ResponseRestaurantsInnerLocalHoursOperational wednesday(String wednesday) {
    this.wednesday = wednesday;
    return this;
  }

  /**
   * Get wednesday
   * @return wednesday
   */
  @javax.annotation.Nullable
  public String getWednesday() {
    return wednesday;
  }

  public void setWednesday(String wednesday) {
    this.wednesday = wednesday;
  }


  public SearchRestaurants200ResponseRestaurantsInnerLocalHoursOperational thursday(String thursday) {
    this.thursday = thursday;
    return this;
  }

  /**
   * Get thursday
   * @return thursday
   */
  @javax.annotation.Nullable
  public String getThursday() {
    return thursday;
  }

  public void setThursday(String thursday) {
    this.thursday = thursday;
  }


  public SearchRestaurants200ResponseRestaurantsInnerLocalHoursOperational friday(String friday) {
    this.friday = friday;
    return this;
  }

  /**
   * Get friday
   * @return friday
   */
  @javax.annotation.Nullable
  public String getFriday() {
    return friday;
  }

  public void setFriday(String friday) {
    this.friday = friday;
  }


  public SearchRestaurants200ResponseRestaurantsInnerLocalHoursOperational saturday(String saturday) {
    this.saturday = saturday;
    return this;
  }

  /**
   * Get saturday
   * @return saturday
   */
  @javax.annotation.Nullable
  public String getSaturday() {
    return saturday;
  }

  public void setSaturday(String saturday) {
    this.saturday = saturday;
  }


  public SearchRestaurants200ResponseRestaurantsInnerLocalHoursOperational sunday(String sunday) {
    this.sunday = sunday;
    return this;
  }

  /**
   * Get sunday
   * @return sunday
   */
  @javax.annotation.Nullable
  public String getSunday() {
    return sunday;
  }

  public void setSunday(String sunday) {
    this.sunday = sunday;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchRestaurants200ResponseRestaurantsInnerLocalHoursOperational searchRestaurants200ResponseRestaurantsInnerLocalHoursOperational = (SearchRestaurants200ResponseRestaurantsInnerLocalHoursOperational) o;
    return Objects.equals(this.monday, searchRestaurants200ResponseRestaurantsInnerLocalHoursOperational.monday) &&
        Objects.equals(this.tuesday, searchRestaurants200ResponseRestaurantsInnerLocalHoursOperational.tuesday) &&
        Objects.equals(this.wednesday, searchRestaurants200ResponseRestaurantsInnerLocalHoursOperational.wednesday) &&
        Objects.equals(this.thursday, searchRestaurants200ResponseRestaurantsInnerLocalHoursOperational.thursday) &&
        Objects.equals(this.friday, searchRestaurants200ResponseRestaurantsInnerLocalHoursOperational.friday) &&
        Objects.equals(this.saturday, searchRestaurants200ResponseRestaurantsInnerLocalHoursOperational.saturday) &&
        Objects.equals(this.sunday, searchRestaurants200ResponseRestaurantsInnerLocalHoursOperational.sunday);
  }

  @Override
  public int hashCode() {
    return Objects.hash(monday, tuesday, wednesday, thursday, friday, saturday, sunday);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchRestaurants200ResponseRestaurantsInnerLocalHoursOperational {\n");
    sb.append("    monday: ").append(toIndentedString(monday)).append("\n");
    sb.append("    tuesday: ").append(toIndentedString(tuesday)).append("\n");
    sb.append("    wednesday: ").append(toIndentedString(wednesday)).append("\n");
    sb.append("    thursday: ").append(toIndentedString(thursday)).append("\n");
    sb.append("    friday: ").append(toIndentedString(friday)).append("\n");
    sb.append("    saturday: ").append(toIndentedString(saturday)).append("\n");
    sb.append("    sunday: ").append(toIndentedString(sunday)).append("\n");
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
    openapiFields.add("Monday");
    openapiFields.add("Tuesday");
    openapiFields.add("Wednesday");
    openapiFields.add("Thursday");
    openapiFields.add("Friday");
    openapiFields.add("Saturday");
    openapiFields.add("Sunday");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SearchRestaurants200ResponseRestaurantsInnerLocalHoursOperational
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SearchRestaurants200ResponseRestaurantsInnerLocalHoursOperational.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SearchRestaurants200ResponseRestaurantsInnerLocalHoursOperational is not found in the empty JSON string", SearchRestaurants200ResponseRestaurantsInnerLocalHoursOperational.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SearchRestaurants200ResponseRestaurantsInnerLocalHoursOperational.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SearchRestaurants200ResponseRestaurantsInnerLocalHoursOperational` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("Monday") != null && !jsonObj.get("Monday").isJsonNull()) && !jsonObj.get("Monday").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Monday` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Monday").toString()));
      }
      if ((jsonObj.get("Tuesday") != null && !jsonObj.get("Tuesday").isJsonNull()) && !jsonObj.get("Tuesday").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Tuesday` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Tuesday").toString()));
      }
      if ((jsonObj.get("Wednesday") != null && !jsonObj.get("Wednesday").isJsonNull()) && !jsonObj.get("Wednesday").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Wednesday` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Wednesday").toString()));
      }
      if ((jsonObj.get("Thursday") != null && !jsonObj.get("Thursday").isJsonNull()) && !jsonObj.get("Thursday").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Thursday` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Thursday").toString()));
      }
      if ((jsonObj.get("Friday") != null && !jsonObj.get("Friday").isJsonNull()) && !jsonObj.get("Friday").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Friday` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Friday").toString()));
      }
      if ((jsonObj.get("Saturday") != null && !jsonObj.get("Saturday").isJsonNull()) && !jsonObj.get("Saturday").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Saturday` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Saturday").toString()));
      }
      if ((jsonObj.get("Sunday") != null && !jsonObj.get("Sunday").isJsonNull()) && !jsonObj.get("Sunday").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Sunday` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Sunday").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SearchRestaurants200ResponseRestaurantsInnerLocalHoursOperational.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SearchRestaurants200ResponseRestaurantsInnerLocalHoursOperational' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SearchRestaurants200ResponseRestaurantsInnerLocalHoursOperational> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SearchRestaurants200ResponseRestaurantsInnerLocalHoursOperational.class));

       return (TypeAdapter<T>) new TypeAdapter<SearchRestaurants200ResponseRestaurantsInnerLocalHoursOperational>() {
           @Override
           public void write(JsonWriter out, SearchRestaurants200ResponseRestaurantsInnerLocalHoursOperational value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SearchRestaurants200ResponseRestaurantsInnerLocalHoursOperational read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SearchRestaurants200ResponseRestaurantsInnerLocalHoursOperational given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SearchRestaurants200ResponseRestaurantsInnerLocalHoursOperational
   * @throws IOException if the JSON string is invalid with respect to SearchRestaurants200ResponseRestaurantsInnerLocalHoursOperational
   */
  public static SearchRestaurants200ResponseRestaurantsInnerLocalHoursOperational fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SearchRestaurants200ResponseRestaurantsInnerLocalHoursOperational.class);
  }

  /**
   * Convert an instance of SearchRestaurants200ResponseRestaurantsInnerLocalHoursOperational to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

