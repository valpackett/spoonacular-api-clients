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
import com.spoonacular.client.model.MenuItem;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashSet;
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
 * 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.8.0-SNAPSHOT")
public class SearchMenuItems200Response {
  public static final String SERIALIZED_NAME_MENU_ITEMS = "menuItems";
  @SerializedName(SERIALIZED_NAME_MENU_ITEMS)
  private Set<MenuItem> menuItems = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_TOTAL_MENU_ITEMS = "totalMenuItems";
  @SerializedName(SERIALIZED_NAME_TOTAL_MENU_ITEMS)
  private Integer totalMenuItems;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private Integer offset;

  public static final String SERIALIZED_NAME_NUMBER = "number";
  @SerializedName(SERIALIZED_NAME_NUMBER)
  private Integer number;

  public SearchMenuItems200Response() {
  }

  public SearchMenuItems200Response menuItems(Set<MenuItem> menuItems) {
    this.menuItems = menuItems;
    return this;
  }

  public SearchMenuItems200Response addMenuItemsItem(MenuItem menuItemsItem) {
    if (this.menuItems == null) {
      this.menuItems = new LinkedHashSet<>();
    }
    this.menuItems.add(menuItemsItem);
    return this;
  }

  /**
   * Get menuItems
   * @return menuItems
   */
  @javax.annotation.Nonnull
  public Set<MenuItem> getMenuItems() {
    return menuItems;
  }

  public void setMenuItems(Set<MenuItem> menuItems) {
    this.menuItems = menuItems;
  }


  public SearchMenuItems200Response totalMenuItems(Integer totalMenuItems) {
    this.totalMenuItems = totalMenuItems;
    return this;
  }

  /**
   * Get totalMenuItems
   * @return totalMenuItems
   */
  @javax.annotation.Nonnull
  public Integer getTotalMenuItems() {
    return totalMenuItems;
  }

  public void setTotalMenuItems(Integer totalMenuItems) {
    this.totalMenuItems = totalMenuItems;
  }


  public SearchMenuItems200Response type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nonnull
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public SearchMenuItems200Response offset(Integer offset) {
    this.offset = offset;
    return this;
  }

  /**
   * Get offset
   * @return offset
   */
  @javax.annotation.Nonnull
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }


  public SearchMenuItems200Response number(Integer number) {
    this.number = number;
    return this;
  }

  /**
   * Get number
   * @return number
   */
  @javax.annotation.Nonnull
  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchMenuItems200Response searchMenuItems200Response = (SearchMenuItems200Response) o;
    return Objects.equals(this.menuItems, searchMenuItems200Response.menuItems) &&
        Objects.equals(this.totalMenuItems, searchMenuItems200Response.totalMenuItems) &&
        Objects.equals(this.type, searchMenuItems200Response.type) &&
        Objects.equals(this.offset, searchMenuItems200Response.offset) &&
        Objects.equals(this.number, searchMenuItems200Response.number);
  }

  @Override
  public int hashCode() {
    return Objects.hash(menuItems, totalMenuItems, type, offset, number);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchMenuItems200Response {\n");
    sb.append("    menuItems: ").append(toIndentedString(menuItems)).append("\n");
    sb.append("    totalMenuItems: ").append(toIndentedString(totalMenuItems)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
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
    openapiFields.add("menuItems");
    openapiFields.add("totalMenuItems");
    openapiFields.add("type");
    openapiFields.add("offset");
    openapiFields.add("number");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("menuItems");
    openapiRequiredFields.add("totalMenuItems");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("offset");
    openapiRequiredFields.add("number");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SearchMenuItems200Response
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SearchMenuItems200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SearchMenuItems200Response is not found in the empty JSON string", SearchMenuItems200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SearchMenuItems200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SearchMenuItems200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SearchMenuItems200Response.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("menuItems").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `menuItems` to be an array in the JSON string but got `%s`", jsonObj.get("menuItems").toString()));
      }

      JsonArray jsonArraymenuItems = jsonObj.getAsJsonArray("menuItems");
      // validate the required field `menuItems` (array)
      for (int i = 0; i < jsonArraymenuItems.size(); i++) {
        MenuItem.validateJsonElement(jsonArraymenuItems.get(i));
      };
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SearchMenuItems200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SearchMenuItems200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SearchMenuItems200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SearchMenuItems200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<SearchMenuItems200Response>() {
           @Override
           public void write(JsonWriter out, SearchMenuItems200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SearchMenuItems200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SearchMenuItems200Response given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SearchMenuItems200Response
   * @throws IOException if the JSON string is invalid with respect to SearchMenuItems200Response
   */
  public static SearchMenuItems200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SearchMenuItems200Response.class);
  }

  /**
   * Convert an instance of SearchMenuItems200Response to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

