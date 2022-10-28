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
 * GetWineRecommendation200ResponseRecommendedWinesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-28T13:58:23.400+02:00[Europe/Berlin]")
public class GetWineRecommendation200ResponseRecommendedWinesInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_AVERAGE_RATING = "averageRating";
  @SerializedName(SERIALIZED_NAME_AVERAGE_RATING)
  private BigDecimal averageRating;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_IMAGE_URL = "imageUrl";
  @SerializedName(SERIALIZED_NAME_IMAGE_URL)
  private String imageUrl;

  public static final String SERIALIZED_NAME_LINK = "link";
  @SerializedName(SERIALIZED_NAME_LINK)
  private String link;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private String price;

  public static final String SERIALIZED_NAME_RATING_COUNT = "ratingCount";
  @SerializedName(SERIALIZED_NAME_RATING_COUNT)
  private Integer ratingCount;

  public static final String SERIALIZED_NAME_SCORE = "score";
  @SerializedName(SERIALIZED_NAME_SCORE)
  private BigDecimal score;

  public GetWineRecommendation200ResponseRecommendedWinesInner() { 
  }

  public GetWineRecommendation200ResponseRecommendedWinesInner id(Integer id) {
    
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


  public GetWineRecommendation200ResponseRecommendedWinesInner title(String title) {
    
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


  public GetWineRecommendation200ResponseRecommendedWinesInner averageRating(BigDecimal averageRating) {
    
    this.averageRating = averageRating;
    return this;
  }

   /**
   * Get averageRating
   * @return averageRating
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BigDecimal getAverageRating() {
    return averageRating;
  }


  public void setAverageRating(BigDecimal averageRating) {
    this.averageRating = averageRating;
  }


  public GetWineRecommendation200ResponseRecommendedWinesInner description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public GetWineRecommendation200ResponseRecommendedWinesInner imageUrl(String imageUrl) {
    
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * Get imageUrl
   * @return imageUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getImageUrl() {
    return imageUrl;
  }


  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }


  public GetWineRecommendation200ResponseRecommendedWinesInner link(String link) {
    
    this.link = link;
    return this;
  }

   /**
   * Get link
   * @return link
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getLink() {
    return link;
  }


  public void setLink(String link) {
    this.link = link;
  }


  public GetWineRecommendation200ResponseRecommendedWinesInner price(String price) {
    
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getPrice() {
    return price;
  }


  public void setPrice(String price) {
    this.price = price;
  }


  public GetWineRecommendation200ResponseRecommendedWinesInner ratingCount(Integer ratingCount) {
    
    this.ratingCount = ratingCount;
    return this;
  }

   /**
   * Get ratingCount
   * @return ratingCount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getRatingCount() {
    return ratingCount;
  }


  public void setRatingCount(Integer ratingCount) {
    this.ratingCount = ratingCount;
  }


  public GetWineRecommendation200ResponseRecommendedWinesInner score(BigDecimal score) {
    
    this.score = score;
    return this;
  }

   /**
   * Get score
   * @return score
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BigDecimal getScore() {
    return score;
  }


  public void setScore(BigDecimal score) {
    this.score = score;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetWineRecommendation200ResponseRecommendedWinesInner getWineRecommendation200ResponseRecommendedWinesInner = (GetWineRecommendation200ResponseRecommendedWinesInner) o;
    return Objects.equals(this.id, getWineRecommendation200ResponseRecommendedWinesInner.id) &&
        Objects.equals(this.title, getWineRecommendation200ResponseRecommendedWinesInner.title) &&
        Objects.equals(this.averageRating, getWineRecommendation200ResponseRecommendedWinesInner.averageRating) &&
        Objects.equals(this.description, getWineRecommendation200ResponseRecommendedWinesInner.description) &&
        Objects.equals(this.imageUrl, getWineRecommendation200ResponseRecommendedWinesInner.imageUrl) &&
        Objects.equals(this.link, getWineRecommendation200ResponseRecommendedWinesInner.link) &&
        Objects.equals(this.price, getWineRecommendation200ResponseRecommendedWinesInner.price) &&
        Objects.equals(this.ratingCount, getWineRecommendation200ResponseRecommendedWinesInner.ratingCount) &&
        Objects.equals(this.score, getWineRecommendation200ResponseRecommendedWinesInner.score);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, averageRating, description, imageUrl, link, price, ratingCount, score);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetWineRecommendation200ResponseRecommendedWinesInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    averageRating: ").append(toIndentedString(averageRating)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    ratingCount: ").append(toIndentedString(ratingCount)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
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
    openapiFields.add("averageRating");
    openapiFields.add("description");
    openapiFields.add("imageUrl");
    openapiFields.add("link");
    openapiFields.add("price");
    openapiFields.add("ratingCount");
    openapiFields.add("score");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("title");
    openapiRequiredFields.add("averageRating");
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("imageUrl");
    openapiRequiredFields.add("link");
    openapiRequiredFields.add("price");
    openapiRequiredFields.add("ratingCount");
    openapiRequiredFields.add("score");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetWineRecommendation200ResponseRecommendedWinesInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetWineRecommendation200ResponseRecommendedWinesInner.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetWineRecommendation200ResponseRecommendedWinesInner is not found in the empty JSON string", GetWineRecommendation200ResponseRecommendedWinesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetWineRecommendation200ResponseRecommendedWinesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetWineRecommendation200ResponseRecommendedWinesInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetWineRecommendation200ResponseRecommendedWinesInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("title") != null && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (jsonObj.get("imageUrl") != null && !jsonObj.get("imageUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `imageUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("imageUrl").toString()));
      }
      if (jsonObj.get("link") != null && !jsonObj.get("link").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `link` to be a primitive type in the JSON string but got `%s`", jsonObj.get("link").toString()));
      }
      if (jsonObj.get("price") != null && !jsonObj.get("price").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `price` to be a primitive type in the JSON string but got `%s`", jsonObj.get("price").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetWineRecommendation200ResponseRecommendedWinesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetWineRecommendation200ResponseRecommendedWinesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetWineRecommendation200ResponseRecommendedWinesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetWineRecommendation200ResponseRecommendedWinesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<GetWineRecommendation200ResponseRecommendedWinesInner>() {
           @Override
           public void write(JsonWriter out, GetWineRecommendation200ResponseRecommendedWinesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetWineRecommendation200ResponseRecommendedWinesInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetWineRecommendation200ResponseRecommendedWinesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetWineRecommendation200ResponseRecommendedWinesInner
  * @throws IOException if the JSON string is invalid with respect to GetWineRecommendation200ResponseRecommendedWinesInner
  */
  public static GetWineRecommendation200ResponseRecommendedWinesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetWineRecommendation200ResponseRecommendedWinesInner.class);
  }

 /**
  * Convert an instance of GetWineRecommendation200ResponseRecommendedWinesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

