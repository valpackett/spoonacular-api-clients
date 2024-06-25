/**
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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class TalkToChatbot200ResponseMediaInner {
  
  @SerializedName("title")
  private String title = null;
  @SerializedName("image")
  private String image = null;
  @SerializedName("link")
  private String link = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getImage() {
    return image;
  }
  public void setImage(String image) {
    this.image = image;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getLink() {
    return link;
  }
  public void setLink(String link) {
    this.link = link;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TalkToChatbot200ResponseMediaInner talkToChatbot200ResponseMediaInner = (TalkToChatbot200ResponseMediaInner) o;
    return (this.title == null ? talkToChatbot200ResponseMediaInner.title == null : this.title.equals(talkToChatbot200ResponseMediaInner.title)) &&
        (this.image == null ? talkToChatbot200ResponseMediaInner.image == null : this.image.equals(talkToChatbot200ResponseMediaInner.image)) &&
        (this.link == null ? talkToChatbot200ResponseMediaInner.link == null : this.link.equals(talkToChatbot200ResponseMediaInner.link));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.title == null ? 0: this.title.hashCode());
    result = 31 * result + (this.image == null ? 0: this.image.hashCode());
    result = 31 * result + (this.link == null ? 0: this.link.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TalkToChatbot200ResponseMediaInner {\n");
    
    sb.append("  title: ").append(title).append("\n");
    sb.append("  image: ").append(image).append("\n");
    sb.append("  link: ").append(link).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}