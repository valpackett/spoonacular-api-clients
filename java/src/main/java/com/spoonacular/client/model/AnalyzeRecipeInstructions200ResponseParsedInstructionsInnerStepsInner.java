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
import com.spoonacular.client.model.AnalyzeRecipeInstructions200ResponseParsedInstructionsInnerStepsInnerIngredientsInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
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
 * AnalyzeRecipeInstructions200ResponseParsedInstructionsInnerStepsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-28T13:58:23.400+02:00[Europe/Berlin]")
public class AnalyzeRecipeInstructions200ResponseParsedInstructionsInnerStepsInner {
  public static final String SERIALIZED_NAME_NUMBER = "number";
  @SerializedName(SERIALIZED_NAME_NUMBER)
  private BigDecimal number;

  public static final String SERIALIZED_NAME_STEP = "step";
  @SerializedName(SERIALIZED_NAME_STEP)
  private String step;

  public static final String SERIALIZED_NAME_INGREDIENTS = "ingredients";
  @SerializedName(SERIALIZED_NAME_INGREDIENTS)
  private Set<AnalyzeRecipeInstructions200ResponseParsedInstructionsInnerStepsInnerIngredientsInner> ingredients = null;

  public static final String SERIALIZED_NAME_EQUIPMENT = "equipment";
  @SerializedName(SERIALIZED_NAME_EQUIPMENT)
  private Set<AnalyzeRecipeInstructions200ResponseParsedInstructionsInnerStepsInnerIngredientsInner> equipment = null;

  public AnalyzeRecipeInstructions200ResponseParsedInstructionsInnerStepsInner() { 
  }

  public AnalyzeRecipeInstructions200ResponseParsedInstructionsInnerStepsInner number(BigDecimal number) {
    
    this.number = number;
    return this;
  }

   /**
   * Get number
   * @return number
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BigDecimal getNumber() {
    return number;
  }


  public void setNumber(BigDecimal number) {
    this.number = number;
  }


  public AnalyzeRecipeInstructions200ResponseParsedInstructionsInnerStepsInner step(String step) {
    
    this.step = step;
    return this;
  }

   /**
   * Get step
   * @return step
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getStep() {
    return step;
  }


  public void setStep(String step) {
    this.step = step;
  }


  public AnalyzeRecipeInstructions200ResponseParsedInstructionsInnerStepsInner ingredients(Set<AnalyzeRecipeInstructions200ResponseParsedInstructionsInnerStepsInnerIngredientsInner> ingredients) {
    
    this.ingredients = ingredients;
    return this;
  }

  public AnalyzeRecipeInstructions200ResponseParsedInstructionsInnerStepsInner addIngredientsItem(AnalyzeRecipeInstructions200ResponseParsedInstructionsInnerStepsInnerIngredientsInner ingredientsItem) {
    if (this.ingredients == null) {
      this.ingredients = new LinkedHashSet<>();
    }
    this.ingredients.add(ingredientsItem);
    return this;
  }

   /**
   * Get ingredients
   * @return ingredients
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<AnalyzeRecipeInstructions200ResponseParsedInstructionsInnerStepsInnerIngredientsInner> getIngredients() {
    return ingredients;
  }


  public void setIngredients(Set<AnalyzeRecipeInstructions200ResponseParsedInstructionsInnerStepsInnerIngredientsInner> ingredients) {
    this.ingredients = ingredients;
  }


  public AnalyzeRecipeInstructions200ResponseParsedInstructionsInnerStepsInner equipment(Set<AnalyzeRecipeInstructions200ResponseParsedInstructionsInnerStepsInnerIngredientsInner> equipment) {
    
    this.equipment = equipment;
    return this;
  }

  public AnalyzeRecipeInstructions200ResponseParsedInstructionsInnerStepsInner addEquipmentItem(AnalyzeRecipeInstructions200ResponseParsedInstructionsInnerStepsInnerIngredientsInner equipmentItem) {
    if (this.equipment == null) {
      this.equipment = new LinkedHashSet<>();
    }
    this.equipment.add(equipmentItem);
    return this;
  }

   /**
   * Get equipment
   * @return equipment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<AnalyzeRecipeInstructions200ResponseParsedInstructionsInnerStepsInnerIngredientsInner> getEquipment() {
    return equipment;
  }


  public void setEquipment(Set<AnalyzeRecipeInstructions200ResponseParsedInstructionsInnerStepsInnerIngredientsInner> equipment) {
    this.equipment = equipment;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyzeRecipeInstructions200ResponseParsedInstructionsInnerStepsInner analyzeRecipeInstructions200ResponseParsedInstructionsInnerStepsInner = (AnalyzeRecipeInstructions200ResponseParsedInstructionsInnerStepsInner) o;
    return Objects.equals(this.number, analyzeRecipeInstructions200ResponseParsedInstructionsInnerStepsInner.number) &&
        Objects.equals(this.step, analyzeRecipeInstructions200ResponseParsedInstructionsInnerStepsInner.step) &&
        Objects.equals(this.ingredients, analyzeRecipeInstructions200ResponseParsedInstructionsInnerStepsInner.ingredients) &&
        Objects.equals(this.equipment, analyzeRecipeInstructions200ResponseParsedInstructionsInnerStepsInner.equipment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, step, ingredients, equipment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyzeRecipeInstructions200ResponseParsedInstructionsInnerStepsInner {\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    step: ").append(toIndentedString(step)).append("\n");
    sb.append("    ingredients: ").append(toIndentedString(ingredients)).append("\n");
    sb.append("    equipment: ").append(toIndentedString(equipment)).append("\n");
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
    openapiFields.add("number");
    openapiFields.add("step");
    openapiFields.add("ingredients");
    openapiFields.add("equipment");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("number");
    openapiRequiredFields.add("step");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AnalyzeRecipeInstructions200ResponseParsedInstructionsInnerStepsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AnalyzeRecipeInstructions200ResponseParsedInstructionsInnerStepsInner.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AnalyzeRecipeInstructions200ResponseParsedInstructionsInnerStepsInner is not found in the empty JSON string", AnalyzeRecipeInstructions200ResponseParsedInstructionsInnerStepsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AnalyzeRecipeInstructions200ResponseParsedInstructionsInnerStepsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AnalyzeRecipeInstructions200ResponseParsedInstructionsInnerStepsInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AnalyzeRecipeInstructions200ResponseParsedInstructionsInnerStepsInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("step") != null && !jsonObj.get("step").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `step` to be a primitive type in the JSON string but got `%s`", jsonObj.get("step").toString()));
      }
      JsonArray jsonArrayingredients = jsonObj.getAsJsonArray("ingredients");
      if (jsonArrayingredients != null) {
        // ensure the json data is an array
        if (!jsonObj.get("ingredients").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `ingredients` to be an array in the JSON string but got `%s`", jsonObj.get("ingredients").toString()));
        }

        // validate the optional field `ingredients` (array)
        for (int i = 0; i < jsonArrayingredients.size(); i++) {
          AnalyzeRecipeInstructions200ResponseParsedInstructionsInnerStepsInnerIngredientsInner.validateJsonObject(jsonArrayingredients.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArrayequipment = jsonObj.getAsJsonArray("equipment");
      if (jsonArrayequipment != null) {
        // ensure the json data is an array
        if (!jsonObj.get("equipment").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `equipment` to be an array in the JSON string but got `%s`", jsonObj.get("equipment").toString()));
        }

        // validate the optional field `equipment` (array)
        for (int i = 0; i < jsonArrayequipment.size(); i++) {
          AnalyzeRecipeInstructions200ResponseParsedInstructionsInnerStepsInnerIngredientsInner.validateJsonObject(jsonArrayequipment.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AnalyzeRecipeInstructions200ResponseParsedInstructionsInnerStepsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AnalyzeRecipeInstructions200ResponseParsedInstructionsInnerStepsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AnalyzeRecipeInstructions200ResponseParsedInstructionsInnerStepsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AnalyzeRecipeInstructions200ResponseParsedInstructionsInnerStepsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AnalyzeRecipeInstructions200ResponseParsedInstructionsInnerStepsInner>() {
           @Override
           public void write(JsonWriter out, AnalyzeRecipeInstructions200ResponseParsedInstructionsInnerStepsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AnalyzeRecipeInstructions200ResponseParsedInstructionsInnerStepsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AnalyzeRecipeInstructions200ResponseParsedInstructionsInnerStepsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AnalyzeRecipeInstructions200ResponseParsedInstructionsInnerStepsInner
  * @throws IOException if the JSON string is invalid with respect to AnalyzeRecipeInstructions200ResponseParsedInstructionsInnerStepsInner
  */
  public static AnalyzeRecipeInstructions200ResponseParsedInstructionsInnerStepsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AnalyzeRecipeInstructions200ResponseParsedInstructionsInnerStepsInner.class);
  }

 /**
  * Convert an instance of AnalyzeRecipeInstructions200ResponseParsedInstructionsInnerStepsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
