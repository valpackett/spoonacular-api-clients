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
import com.spoonacular.client.model.MenuItemServings;
import com.spoonacular.client.model.SearchGroceryProductsByUPC200ResponseNutrition;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

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
public class MenuItem {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_RESTAURANT_CHAIN = "restaurantChain";
  @SerializedName(SERIALIZED_NAME_RESTAURANT_CHAIN)
  private String restaurantChain;

  public static final String SERIALIZED_NAME_NUTRITION = "nutrition";
  @SerializedName(SERIALIZED_NAME_NUTRITION)
  private SearchGroceryProductsByUPC200ResponseNutrition nutrition;

  public static final String SERIALIZED_NAME_BADGES = "badges";
  @SerializedName(SERIALIZED_NAME_BADGES)
  private List<String> badges = new ArrayList<>();

  public static final String SERIALIZED_NAME_BREADCRUMBS = "breadcrumbs";
  @SerializedName(SERIALIZED_NAME_BREADCRUMBS)
  private List<String> breadcrumbs = new ArrayList<>();

  public static final String SERIALIZED_NAME_GENERATED_TEXT = "generatedText";
  @SerializedName(SERIALIZED_NAME_GENERATED_TEXT)
  private String generatedText;

  public static final String SERIALIZED_NAME_IMAGE_TYPE = "imageType";
  @SerializedName(SERIALIZED_NAME_IMAGE_TYPE)
  private String imageType;

  public static final String SERIALIZED_NAME_LIKES = "likes";
  @SerializedName(SERIALIZED_NAME_LIKES)
  private Integer likes;

  public static final String SERIALIZED_NAME_SERVINGS = "servings";
  @SerializedName(SERIALIZED_NAME_SERVINGS)
  private MenuItemServings servings;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private BigDecimal price;

  public static final String SERIALIZED_NAME_SPOONACULAR_SCORE = "spoonacularScore";
  @SerializedName(SERIALIZED_NAME_SPOONACULAR_SCORE)
  private BigDecimal spoonacularScore;

  public MenuItem() {
  }

  public MenuItem id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nonnull
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public MenuItem title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   */
  @javax.annotation.Nonnull
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public MenuItem restaurantChain(String restaurantChain) {
    this.restaurantChain = restaurantChain;
    return this;
  }

  /**
   * Get restaurantChain
   * @return restaurantChain
   */
  @javax.annotation.Nonnull
  public String getRestaurantChain() {
    return restaurantChain;
  }

  public void setRestaurantChain(String restaurantChain) {
    this.restaurantChain = restaurantChain;
  }


  public MenuItem nutrition(SearchGroceryProductsByUPC200ResponseNutrition nutrition) {
    this.nutrition = nutrition;
    return this;
  }

  /**
   * Get nutrition
   * @return nutrition
   */
  @javax.annotation.Nullable
  public SearchGroceryProductsByUPC200ResponseNutrition getNutrition() {
    return nutrition;
  }

  public void setNutrition(SearchGroceryProductsByUPC200ResponseNutrition nutrition) {
    this.nutrition = nutrition;
  }


  public MenuItem badges(List<String> badges) {
    this.badges = badges;
    return this;
  }

  public MenuItem addBadgesItem(String badgesItem) {
    if (this.badges == null) {
      this.badges = new ArrayList<>();
    }
    this.badges.add(badgesItem);
    return this;
  }

  /**
   * Get badges
   * @return badges
   */
  @javax.annotation.Nullable
  public List<String> getBadges() {
    return badges;
  }

  public void setBadges(List<String> badges) {
    this.badges = badges;
  }


  public MenuItem breadcrumbs(List<String> breadcrumbs) {
    this.breadcrumbs = breadcrumbs;
    return this;
  }

  public MenuItem addBreadcrumbsItem(String breadcrumbsItem) {
    if (this.breadcrumbs == null) {
      this.breadcrumbs = new ArrayList<>();
    }
    this.breadcrumbs.add(breadcrumbsItem);
    return this;
  }

  /**
   * Get breadcrumbs
   * @return breadcrumbs
   */
  @javax.annotation.Nullable
  public List<String> getBreadcrumbs() {
    return breadcrumbs;
  }

  public void setBreadcrumbs(List<String> breadcrumbs) {
    this.breadcrumbs = breadcrumbs;
  }


  public MenuItem generatedText(String generatedText) {
    this.generatedText = generatedText;
    return this;
  }

  /**
   * Get generatedText
   * @return generatedText
   */
  @javax.annotation.Nullable
  public String getGeneratedText() {
    return generatedText;
  }

  public void setGeneratedText(String generatedText) {
    this.generatedText = generatedText;
  }


  public MenuItem imageType(String imageType) {
    this.imageType = imageType;
    return this;
  }

  /**
   * Get imageType
   * @return imageType
   */
  @javax.annotation.Nullable
  public String getImageType() {
    return imageType;
  }

  public void setImageType(String imageType) {
    this.imageType = imageType;
  }


  public MenuItem likes(Integer likes) {
    this.likes = likes;
    return this;
  }

  /**
   * Get likes
   * @return likes
   */
  @javax.annotation.Nullable
  public Integer getLikes() {
    return likes;
  }

  public void setLikes(Integer likes) {
    this.likes = likes;
  }


  public MenuItem servings(MenuItemServings servings) {
    this.servings = servings;
    return this;
  }

  /**
   * Get servings
   * @return servings
   */
  @javax.annotation.Nullable
  public MenuItemServings getServings() {
    return servings;
  }

  public void setServings(MenuItemServings servings) {
    this.servings = servings;
  }


  public MenuItem price(BigDecimal price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
   */
  @javax.annotation.Nullable
  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }


  public MenuItem spoonacularScore(BigDecimal spoonacularScore) {
    this.spoonacularScore = spoonacularScore;
    return this;
  }

  /**
   * Get spoonacularScore
   * @return spoonacularScore
   */
  @javax.annotation.Nullable
  public BigDecimal getSpoonacularScore() {
    return spoonacularScore;
  }

  public void setSpoonacularScore(BigDecimal spoonacularScore) {
    this.spoonacularScore = spoonacularScore;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MenuItem menuItem = (MenuItem) o;
    return Objects.equals(this.id, menuItem.id) &&
        Objects.equals(this.title, menuItem.title) &&
        Objects.equals(this.restaurantChain, menuItem.restaurantChain) &&
        Objects.equals(this.nutrition, menuItem.nutrition) &&
        Objects.equals(this.badges, menuItem.badges) &&
        Objects.equals(this.breadcrumbs, menuItem.breadcrumbs) &&
        Objects.equals(this.generatedText, menuItem.generatedText) &&
        Objects.equals(this.imageType, menuItem.imageType) &&
        Objects.equals(this.likes, menuItem.likes) &&
        Objects.equals(this.servings, menuItem.servings) &&
        Objects.equals(this.price, menuItem.price) &&
        Objects.equals(this.spoonacularScore, menuItem.spoonacularScore);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, restaurantChain, nutrition, badges, breadcrumbs, generatedText, imageType, likes, servings, price, spoonacularScore);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MenuItem {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    restaurantChain: ").append(toIndentedString(restaurantChain)).append("\n");
    sb.append("    nutrition: ").append(toIndentedString(nutrition)).append("\n");
    sb.append("    badges: ").append(toIndentedString(badges)).append("\n");
    sb.append("    breadcrumbs: ").append(toIndentedString(breadcrumbs)).append("\n");
    sb.append("    generatedText: ").append(toIndentedString(generatedText)).append("\n");
    sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
    sb.append("    likes: ").append(toIndentedString(likes)).append("\n");
    sb.append("    servings: ").append(toIndentedString(servings)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    spoonacularScore: ").append(toIndentedString(spoonacularScore)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("title");
    openapiFields.add("restaurantChain");
    openapiFields.add("nutrition");
    openapiFields.add("badges");
    openapiFields.add("breadcrumbs");
    openapiFields.add("generatedText");
    openapiFields.add("imageType");
    openapiFields.add("likes");
    openapiFields.add("servings");
    openapiFields.add("price");
    openapiFields.add("spoonacularScore");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("title");
    openapiRequiredFields.add("restaurantChain");
    openapiRequiredFields.add("price");
    openapiRequiredFields.add("spoonacularScore");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to MenuItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MenuItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MenuItem is not found in the empty JSON string", MenuItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MenuItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MenuItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MenuItem.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if (!jsonObj.get("restaurantChain").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `restaurantChain` to be a primitive type in the JSON string but got `%s`", jsonObj.get("restaurantChain").toString()));
      }
      // validate the optional field `nutrition`
      if (jsonObj.get("nutrition") != null && !jsonObj.get("nutrition").isJsonNull()) {
        SearchGroceryProductsByUPC200ResponseNutrition.validateJsonElement(jsonObj.get("nutrition"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("badges") != null && !jsonObj.get("badges").isJsonNull() && !jsonObj.get("badges").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `badges` to be an array in the JSON string but got `%s`", jsonObj.get("badges").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("breadcrumbs") != null && !jsonObj.get("breadcrumbs").isJsonNull() && !jsonObj.get("breadcrumbs").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `breadcrumbs` to be an array in the JSON string but got `%s`", jsonObj.get("breadcrumbs").toString()));
      }
      if ((jsonObj.get("generatedText") != null && !jsonObj.get("generatedText").isJsonNull()) && !jsonObj.get("generatedText").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `generatedText` to be a primitive type in the JSON string but got `%s`", jsonObj.get("generatedText").toString()));
      }
      if ((jsonObj.get("imageType") != null && !jsonObj.get("imageType").isJsonNull()) && !jsonObj.get("imageType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `imageType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("imageType").toString()));
      }
      // validate the optional field `servings`
      if (jsonObj.get("servings") != null && !jsonObj.get("servings").isJsonNull()) {
        MenuItemServings.validateJsonElement(jsonObj.get("servings"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MenuItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MenuItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MenuItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MenuItem.class));

       return (TypeAdapter<T>) new TypeAdapter<MenuItem>() {
           @Override
           public void write(JsonWriter out, MenuItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MenuItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of MenuItem given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of MenuItem
   * @throws IOException if the JSON string is invalid with respect to MenuItem
   */
  public static MenuItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MenuItem.class);
  }

  /**
   * Convert an instance of MenuItem to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

