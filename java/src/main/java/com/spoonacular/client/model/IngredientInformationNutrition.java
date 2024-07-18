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
import com.spoonacular.client.model.GetShoppingList200ResponseAislesInnerItemsInnerMeasuresOriginal;
import com.spoonacular.client.model.IngredientInformationNutritionPropertiesInner;
import com.spoonacular.client.model.SearchGroceryProductsByUPC200ResponseNutritionCaloricBreakdown;
import com.spoonacular.client.model.SearchGroceryProductsByUPC200ResponseNutritionNutrientsInner;
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
 * IngredientInformationNutrition
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.8.0-SNAPSHOT")
public class IngredientInformationNutrition {
  public static final String SERIALIZED_NAME_NUTRIENTS = "nutrients";
  @SerializedName(SERIALIZED_NAME_NUTRIENTS)
  private Set<SearchGroceryProductsByUPC200ResponseNutritionNutrientsInner> nutrients = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private Set<IngredientInformationNutritionPropertiesInner> properties = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_CALORIC_BREAKDOWN = "caloricBreakdown";
  @SerializedName(SERIALIZED_NAME_CALORIC_BREAKDOWN)
  private SearchGroceryProductsByUPC200ResponseNutritionCaloricBreakdown caloricBreakdown;

  public static final String SERIALIZED_NAME_WEIGHT_PER_SERVING = "weightPerServing";
  @SerializedName(SERIALIZED_NAME_WEIGHT_PER_SERVING)
  private GetShoppingList200ResponseAislesInnerItemsInnerMeasuresOriginal weightPerServing;

  public IngredientInformationNutrition() {
  }

  public IngredientInformationNutrition nutrients(Set<SearchGroceryProductsByUPC200ResponseNutritionNutrientsInner> nutrients) {
    this.nutrients = nutrients;
    return this;
  }

  public IngredientInformationNutrition addNutrientsItem(SearchGroceryProductsByUPC200ResponseNutritionNutrientsInner nutrientsItem) {
    if (this.nutrients == null) {
      this.nutrients = new LinkedHashSet<>();
    }
    this.nutrients.add(nutrientsItem);
    return this;
  }

  /**
   * Get nutrients
   * @return nutrients
   */
  @javax.annotation.Nonnull
  public Set<SearchGroceryProductsByUPC200ResponseNutritionNutrientsInner> getNutrients() {
    return nutrients;
  }

  public void setNutrients(Set<SearchGroceryProductsByUPC200ResponseNutritionNutrientsInner> nutrients) {
    this.nutrients = nutrients;
  }


  public IngredientInformationNutrition properties(Set<IngredientInformationNutritionPropertiesInner> properties) {
    this.properties = properties;
    return this;
  }

  public IngredientInformationNutrition addPropertiesItem(IngredientInformationNutritionPropertiesInner propertiesItem) {
    if (this.properties == null) {
      this.properties = new LinkedHashSet<>();
    }
    this.properties.add(propertiesItem);
    return this;
  }

  /**
   * Get properties
   * @return properties
   */
  @javax.annotation.Nonnull
  public Set<IngredientInformationNutritionPropertiesInner> getProperties() {
    return properties;
  }

  public void setProperties(Set<IngredientInformationNutritionPropertiesInner> properties) {
    this.properties = properties;
  }


  public IngredientInformationNutrition caloricBreakdown(SearchGroceryProductsByUPC200ResponseNutritionCaloricBreakdown caloricBreakdown) {
    this.caloricBreakdown = caloricBreakdown;
    return this;
  }

  /**
   * Get caloricBreakdown
   * @return caloricBreakdown
   */
  @javax.annotation.Nonnull
  public SearchGroceryProductsByUPC200ResponseNutritionCaloricBreakdown getCaloricBreakdown() {
    return caloricBreakdown;
  }

  public void setCaloricBreakdown(SearchGroceryProductsByUPC200ResponseNutritionCaloricBreakdown caloricBreakdown) {
    this.caloricBreakdown = caloricBreakdown;
  }


  public IngredientInformationNutrition weightPerServing(GetShoppingList200ResponseAislesInnerItemsInnerMeasuresOriginal weightPerServing) {
    this.weightPerServing = weightPerServing;
    return this;
  }

  /**
   * Get weightPerServing
   * @return weightPerServing
   */
  @javax.annotation.Nonnull
  public GetShoppingList200ResponseAislesInnerItemsInnerMeasuresOriginal getWeightPerServing() {
    return weightPerServing;
  }

  public void setWeightPerServing(GetShoppingList200ResponseAislesInnerItemsInnerMeasuresOriginal weightPerServing) {
    this.weightPerServing = weightPerServing;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IngredientInformationNutrition ingredientInformationNutrition = (IngredientInformationNutrition) o;
    return Objects.equals(this.nutrients, ingredientInformationNutrition.nutrients) &&
        Objects.equals(this.properties, ingredientInformationNutrition.properties) &&
        Objects.equals(this.caloricBreakdown, ingredientInformationNutrition.caloricBreakdown) &&
        Objects.equals(this.weightPerServing, ingredientInformationNutrition.weightPerServing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nutrients, properties, caloricBreakdown, weightPerServing);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IngredientInformationNutrition {\n");
    sb.append("    nutrients: ").append(toIndentedString(nutrients)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    caloricBreakdown: ").append(toIndentedString(caloricBreakdown)).append("\n");
    sb.append("    weightPerServing: ").append(toIndentedString(weightPerServing)).append("\n");
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
    openapiFields.add("properties");
    openapiFields.add("caloricBreakdown");
    openapiFields.add("weightPerServing");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("nutrients");
    openapiRequiredFields.add("properties");
    openapiRequiredFields.add("caloricBreakdown");
    openapiRequiredFields.add("weightPerServing");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to IngredientInformationNutrition
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IngredientInformationNutrition.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IngredientInformationNutrition is not found in the empty JSON string", IngredientInformationNutrition.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!IngredientInformationNutrition.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IngredientInformationNutrition` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : IngredientInformationNutrition.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("nutrients").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `nutrients` to be an array in the JSON string but got `%s`", jsonObj.get("nutrients").toString()));
      }

      JsonArray jsonArraynutrients = jsonObj.getAsJsonArray("nutrients");
      // validate the required field `nutrients` (array)
      for (int i = 0; i < jsonArraynutrients.size(); i++) {
        SearchGroceryProductsByUPC200ResponseNutritionNutrientsInner.validateJsonElement(jsonArraynutrients.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("properties").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `properties` to be an array in the JSON string but got `%s`", jsonObj.get("properties").toString()));
      }

      JsonArray jsonArrayproperties = jsonObj.getAsJsonArray("properties");
      // validate the required field `properties` (array)
      for (int i = 0; i < jsonArrayproperties.size(); i++) {
        IngredientInformationNutritionPropertiesInner.validateJsonElement(jsonArrayproperties.get(i));
      };
      // validate the required field `caloricBreakdown`
      SearchGroceryProductsByUPC200ResponseNutritionCaloricBreakdown.validateJsonElement(jsonObj.get("caloricBreakdown"));
      // validate the required field `weightPerServing`
      GetShoppingList200ResponseAislesInnerItemsInnerMeasuresOriginal.validateJsonElement(jsonObj.get("weightPerServing"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IngredientInformationNutrition.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IngredientInformationNutrition' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IngredientInformationNutrition> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IngredientInformationNutrition.class));

       return (TypeAdapter<T>) new TypeAdapter<IngredientInformationNutrition>() {
           @Override
           public void write(JsonWriter out, IngredientInformationNutrition value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IngredientInformationNutrition read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of IngredientInformationNutrition given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of IngredientInformationNutrition
   * @throws IOException if the JSON string is invalid with respect to IngredientInformationNutrition
   */
  public static IngredientInformationNutrition fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IngredientInformationNutrition.class);
  }

  /**
   * Convert an instance of IngredientInformationNutrition to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

