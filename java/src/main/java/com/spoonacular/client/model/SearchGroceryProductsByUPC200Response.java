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
import com.spoonacular.client.model.SearchGroceryProductsByUPC200ResponseIngredientsInner;
import com.spoonacular.client.model.SearchGroceryProductsByUPC200ResponseNutrition;
import com.spoonacular.client.model.SearchGroceryProductsByUPC200ResponseServings;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
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
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-28T13:58:23.400+02:00[Europe/Berlin]")
public class SearchGroceryProductsByUPC200Response {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_BADGES = "badges";
  @SerializedName(SERIALIZED_NAME_BADGES)
  private List<String> badges = new ArrayList<>();

  public static final String SERIALIZED_NAME_IMPORTANT_BADGES = "importantBadges";
  @SerializedName(SERIALIZED_NAME_IMPORTANT_BADGES)
  private List<String> importantBadges = new ArrayList<>();

  public static final String SERIALIZED_NAME_BREADCRUMBS = "breadcrumbs";
  @SerializedName(SERIALIZED_NAME_BREADCRUMBS)
  private List<String> breadcrumbs = new ArrayList<>();

  public static final String SERIALIZED_NAME_GENERATED_TEXT = "generatedText";
  @SerializedName(SERIALIZED_NAME_GENERATED_TEXT)
  private String generatedText;

  public static final String SERIALIZED_NAME_IMAGE_TYPE = "imageType";
  @SerializedName(SERIALIZED_NAME_IMAGE_TYPE)
  private String imageType;

  public static final String SERIALIZED_NAME_INGREDIENT_COUNT = "ingredientCount";
  @SerializedName(SERIALIZED_NAME_INGREDIENT_COUNT)
  private Integer ingredientCount;

  public static final String SERIALIZED_NAME_INGREDIENT_LIST = "ingredientList";
  @SerializedName(SERIALIZED_NAME_INGREDIENT_LIST)
  private String ingredientList;

  public static final String SERIALIZED_NAME_INGREDIENTS = "ingredients";
  @SerializedName(SERIALIZED_NAME_INGREDIENTS)
  private Set<SearchGroceryProductsByUPC200ResponseIngredientsInner> ingredients = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_LIKES = "likes";
  @SerializedName(SERIALIZED_NAME_LIKES)
  private BigDecimal likes;

  public static final String SERIALIZED_NAME_NUTRITION = "nutrition";
  @SerializedName(SERIALIZED_NAME_NUTRITION)
  private SearchGroceryProductsByUPC200ResponseNutrition nutrition;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private BigDecimal price;

  public static final String SERIALIZED_NAME_SERVINGS = "servings";
  @SerializedName(SERIALIZED_NAME_SERVINGS)
  private SearchGroceryProductsByUPC200ResponseServings servings;

  public static final String SERIALIZED_NAME_SPOONACULAR_SCORE = "spoonacularScore";
  @SerializedName(SERIALIZED_NAME_SPOONACULAR_SCORE)
  private BigDecimal spoonacularScore;

  public SearchGroceryProductsByUPC200Response() { 
  }

  public SearchGroceryProductsByUPC200Response id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public SearchGroceryProductsByUPC200Response title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public SearchGroceryProductsByUPC200Response badges(List<String> badges) {
    
    this.badges = badges;
    return this;
  }

  public SearchGroceryProductsByUPC200Response addBadgesItem(String badgesItem) {
    this.badges.add(badgesItem);
    return this;
  }

   /**
   * Get badges
   * @return badges
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getBadges() {
    return badges;
  }


  public void setBadges(List<String> badges) {
    this.badges = badges;
  }


  public SearchGroceryProductsByUPC200Response importantBadges(List<String> importantBadges) {
    
    this.importantBadges = importantBadges;
    return this;
  }

  public SearchGroceryProductsByUPC200Response addImportantBadgesItem(String importantBadgesItem) {
    this.importantBadges.add(importantBadgesItem);
    return this;
  }

   /**
   * Get importantBadges
   * @return importantBadges
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getImportantBadges() {
    return importantBadges;
  }


  public void setImportantBadges(List<String> importantBadges) {
    this.importantBadges = importantBadges;
  }


  public SearchGroceryProductsByUPC200Response breadcrumbs(List<String> breadcrumbs) {
    
    this.breadcrumbs = breadcrumbs;
    return this;
  }

  public SearchGroceryProductsByUPC200Response addBreadcrumbsItem(String breadcrumbsItem) {
    this.breadcrumbs.add(breadcrumbsItem);
    return this;
  }

   /**
   * Get breadcrumbs
   * @return breadcrumbs
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getBreadcrumbs() {
    return breadcrumbs;
  }


  public void setBreadcrumbs(List<String> breadcrumbs) {
    this.breadcrumbs = breadcrumbs;
  }


  public SearchGroceryProductsByUPC200Response generatedText(String generatedText) {
    
    this.generatedText = generatedText;
    return this;
  }

   /**
   * Get generatedText
   * @return generatedText
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getGeneratedText() {
    return generatedText;
  }


  public void setGeneratedText(String generatedText) {
    this.generatedText = generatedText;
  }


  public SearchGroceryProductsByUPC200Response imageType(String imageType) {
    
    this.imageType = imageType;
    return this;
  }

   /**
   * Get imageType
   * @return imageType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getImageType() {
    return imageType;
  }


  public void setImageType(String imageType) {
    this.imageType = imageType;
  }


  public SearchGroceryProductsByUPC200Response ingredientCount(Integer ingredientCount) {
    
    this.ingredientCount = ingredientCount;
    return this;
  }

   /**
   * Get ingredientCount
   * @return ingredientCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getIngredientCount() {
    return ingredientCount;
  }


  public void setIngredientCount(Integer ingredientCount) {
    this.ingredientCount = ingredientCount;
  }


  public SearchGroceryProductsByUPC200Response ingredientList(String ingredientList) {
    
    this.ingredientList = ingredientList;
    return this;
  }

   /**
   * Get ingredientList
   * @return ingredientList
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getIngredientList() {
    return ingredientList;
  }


  public void setIngredientList(String ingredientList) {
    this.ingredientList = ingredientList;
  }


  public SearchGroceryProductsByUPC200Response ingredients(Set<SearchGroceryProductsByUPC200ResponseIngredientsInner> ingredients) {
    
    this.ingredients = ingredients;
    return this;
  }

  public SearchGroceryProductsByUPC200Response addIngredientsItem(SearchGroceryProductsByUPC200ResponseIngredientsInner ingredientsItem) {
    this.ingredients.add(ingredientsItem);
    return this;
  }

   /**
   * Get ingredients
   * @return ingredients
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Set<SearchGroceryProductsByUPC200ResponseIngredientsInner> getIngredients() {
    return ingredients;
  }


  public void setIngredients(Set<SearchGroceryProductsByUPC200ResponseIngredientsInner> ingredients) {
    this.ingredients = ingredients;
  }


  public SearchGroceryProductsByUPC200Response likes(BigDecimal likes) {
    
    this.likes = likes;
    return this;
  }

   /**
   * Get likes
   * @return likes
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BigDecimal getLikes() {
    return likes;
  }


  public void setLikes(BigDecimal likes) {
    this.likes = likes;
  }


  public SearchGroceryProductsByUPC200Response nutrition(SearchGroceryProductsByUPC200ResponseNutrition nutrition) {
    
    this.nutrition = nutrition;
    return this;
  }

   /**
   * Get nutrition
   * @return nutrition
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public SearchGroceryProductsByUPC200ResponseNutrition getNutrition() {
    return nutrition;
  }


  public void setNutrition(SearchGroceryProductsByUPC200ResponseNutrition nutrition) {
    this.nutrition = nutrition;
  }


  public SearchGroceryProductsByUPC200Response price(BigDecimal price) {
    
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BigDecimal getPrice() {
    return price;
  }


  public void setPrice(BigDecimal price) {
    this.price = price;
  }


  public SearchGroceryProductsByUPC200Response servings(SearchGroceryProductsByUPC200ResponseServings servings) {
    
    this.servings = servings;
    return this;
  }

   /**
   * Get servings
   * @return servings
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public SearchGroceryProductsByUPC200ResponseServings getServings() {
    return servings;
  }


  public void setServings(SearchGroceryProductsByUPC200ResponseServings servings) {
    this.servings = servings;
  }


  public SearchGroceryProductsByUPC200Response spoonacularScore(BigDecimal spoonacularScore) {
    
    this.spoonacularScore = spoonacularScore;
    return this;
  }

   /**
   * Get spoonacularScore
   * @return spoonacularScore
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

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
    SearchGroceryProductsByUPC200Response searchGroceryProductsByUPC200Response = (SearchGroceryProductsByUPC200Response) o;
    return Objects.equals(this.id, searchGroceryProductsByUPC200Response.id) &&
        Objects.equals(this.title, searchGroceryProductsByUPC200Response.title) &&
        Objects.equals(this.badges, searchGroceryProductsByUPC200Response.badges) &&
        Objects.equals(this.importantBadges, searchGroceryProductsByUPC200Response.importantBadges) &&
        Objects.equals(this.breadcrumbs, searchGroceryProductsByUPC200Response.breadcrumbs) &&
        Objects.equals(this.generatedText, searchGroceryProductsByUPC200Response.generatedText) &&
        Objects.equals(this.imageType, searchGroceryProductsByUPC200Response.imageType) &&
        Objects.equals(this.ingredientCount, searchGroceryProductsByUPC200Response.ingredientCount) &&
        Objects.equals(this.ingredientList, searchGroceryProductsByUPC200Response.ingredientList) &&
        Objects.equals(this.ingredients, searchGroceryProductsByUPC200Response.ingredients) &&
        Objects.equals(this.likes, searchGroceryProductsByUPC200Response.likes) &&
        Objects.equals(this.nutrition, searchGroceryProductsByUPC200Response.nutrition) &&
        Objects.equals(this.price, searchGroceryProductsByUPC200Response.price) &&
        Objects.equals(this.servings, searchGroceryProductsByUPC200Response.servings) &&
        Objects.equals(this.spoonacularScore, searchGroceryProductsByUPC200Response.spoonacularScore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, badges, importantBadges, breadcrumbs, generatedText, imageType, ingredientCount, ingredientList, ingredients, likes, nutrition, price, servings, spoonacularScore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchGroceryProductsByUPC200Response {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    badges: ").append(toIndentedString(badges)).append("\n");
    sb.append("    importantBadges: ").append(toIndentedString(importantBadges)).append("\n");
    sb.append("    breadcrumbs: ").append(toIndentedString(breadcrumbs)).append("\n");
    sb.append("    generatedText: ").append(toIndentedString(generatedText)).append("\n");
    sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
    sb.append("    ingredientCount: ").append(toIndentedString(ingredientCount)).append("\n");
    sb.append("    ingredientList: ").append(toIndentedString(ingredientList)).append("\n");
    sb.append("    ingredients: ").append(toIndentedString(ingredients)).append("\n");
    sb.append("    likes: ").append(toIndentedString(likes)).append("\n");
    sb.append("    nutrition: ").append(toIndentedString(nutrition)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    servings: ").append(toIndentedString(servings)).append("\n");
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
    openapiFields.add("badges");
    openapiFields.add("importantBadges");
    openapiFields.add("breadcrumbs");
    openapiFields.add("generatedText");
    openapiFields.add("imageType");
    openapiFields.add("ingredientCount");
    openapiFields.add("ingredientList");
    openapiFields.add("ingredients");
    openapiFields.add("likes");
    openapiFields.add("nutrition");
    openapiFields.add("price");
    openapiFields.add("servings");
    openapiFields.add("spoonacularScore");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("title");
    openapiRequiredFields.add("badges");
    openapiRequiredFields.add("importantBadges");
    openapiRequiredFields.add("breadcrumbs");
    openapiRequiredFields.add("generatedText");
    openapiRequiredFields.add("imageType");
    openapiRequiredFields.add("ingredientList");
    openapiRequiredFields.add("ingredients");
    openapiRequiredFields.add("likes");
    openapiRequiredFields.add("nutrition");
    openapiRequiredFields.add("price");
    openapiRequiredFields.add("servings");
    openapiRequiredFields.add("spoonacularScore");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SearchGroceryProductsByUPC200Response
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SearchGroceryProductsByUPC200Response.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SearchGroceryProductsByUPC200Response is not found in the empty JSON string", SearchGroceryProductsByUPC200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SearchGroceryProductsByUPC200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SearchGroceryProductsByUPC200Response` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SearchGroceryProductsByUPC200Response.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("title") != null && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("badges") != null && !jsonObj.get("badges").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `badges` to be an array in the JSON string but got `%s`", jsonObj.get("badges").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("importantBadges") != null && !jsonObj.get("importantBadges").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `importantBadges` to be an array in the JSON string but got `%s`", jsonObj.get("importantBadges").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("breadcrumbs") != null && !jsonObj.get("breadcrumbs").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `breadcrumbs` to be an array in the JSON string but got `%s`", jsonObj.get("breadcrumbs").toString()));
      }
      if (jsonObj.get("generatedText") != null && !jsonObj.get("generatedText").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `generatedText` to be a primitive type in the JSON string but got `%s`", jsonObj.get("generatedText").toString()));
      }
      if (jsonObj.get("imageType") != null && !jsonObj.get("imageType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `imageType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("imageType").toString()));
      }
      if (jsonObj.get("ingredientList") != null && !jsonObj.get("ingredientList").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ingredientList` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ingredientList").toString()));
      }
      JsonArray jsonArrayingredients = jsonObj.getAsJsonArray("ingredients");
      if (jsonArrayingredients != null) {
        // ensure the json data is an array
        if (!jsonObj.get("ingredients").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `ingredients` to be an array in the JSON string but got `%s`", jsonObj.get("ingredients").toString()));
        }

        // validate the optional field `ingredients` (array)
        for (int i = 0; i < jsonArrayingredients.size(); i++) {
          SearchGroceryProductsByUPC200ResponseIngredientsInner.validateJsonObject(jsonArrayingredients.get(i).getAsJsonObject());
        };
      }
      // validate the optional field `nutrition`
      if (jsonObj.getAsJsonObject("nutrition") != null) {
        SearchGroceryProductsByUPC200ResponseNutrition.validateJsonObject(jsonObj.getAsJsonObject("nutrition"));
      }
      // validate the optional field `servings`
      if (jsonObj.getAsJsonObject("servings") != null) {
        SearchGroceryProductsByUPC200ResponseServings.validateJsonObject(jsonObj.getAsJsonObject("servings"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SearchGroceryProductsByUPC200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SearchGroceryProductsByUPC200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SearchGroceryProductsByUPC200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SearchGroceryProductsByUPC200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<SearchGroceryProductsByUPC200Response>() {
           @Override
           public void write(JsonWriter out, SearchGroceryProductsByUPC200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SearchGroceryProductsByUPC200Response read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SearchGroceryProductsByUPC200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SearchGroceryProductsByUPC200Response
  * @throws IOException if the JSON string is invalid with respect to SearchGroceryProductsByUPC200Response
  */
  public static SearchGroceryProductsByUPC200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SearchGroceryProductsByUPC200Response.class);
  }

 /**
  * Convert an instance of SearchGroceryProductsByUPC200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
