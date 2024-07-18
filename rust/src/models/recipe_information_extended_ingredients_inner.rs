/*
 * spoonacular API
 *
 * The spoonacular Nutrition, Recipe, and Food API allows you to access over thousands of recipes, thousands of ingredients, 800,000 food products, over 100,000 menu items, and restaurants. Our food ontology and semantic recipe search engine makes it possible to search for recipes using natural language queries, such as \"gluten free brownies without sugar\" or \"low fat vegan cupcakes.\" You can automatically calculate the nutritional information for any recipe, analyze recipe costs, visualize ingredient lists, find recipes for what's in your fridge, find recipes based on special diets, nutritional requirements, or favorite ingredients, classify recipes into types and cuisines, convert ingredient amounts, or even compute an entire meal plan. With our powerful API, you can create many kinds of food and especially nutrition apps.  Special diets/dietary requirements currently available include: vegan, vegetarian, pescetarian, gluten free, grain free, dairy free, high protein, whole 30, low sodium, low carb, Paleo, ketogenic, FODMAP, and Primal.
 *
 * The version of the OpenAPI document: 1.1
 * Contact: mail@spoonacular.com
 * Generated by: https://openapi-generator.tech
 */

use crate::models;
use serde::{Deserialize, Serialize};

#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct RecipeInformationExtendedIngredientsInner {
    #[serde(rename = "aisle")]
    pub aisle: String,
    #[serde(rename = "amount")]
    pub amount: f64,
    #[serde(rename = "consistency")]
    pub consistency: String,
    #[serde(rename = "id")]
    pub id: i32,
    #[serde(rename = "image")]
    pub image: String,
    #[serde(rename = "measures", skip_serializing_if = "Option::is_none")]
    pub measures: Option<Box<models::RecipeInformationExtendedIngredientsInnerMeasures>>,
    #[serde(rename = "meta", skip_serializing_if = "Option::is_none")]
    pub meta: Option<Vec<String>>,
    #[serde(rename = "name")]
    pub name: String,
    #[serde(rename = "original")]
    pub original: String,
    #[serde(rename = "originalName")]
    pub original_name: String,
    #[serde(rename = "unit")]
    pub unit: String,
}

impl RecipeInformationExtendedIngredientsInner {
    pub fn new(aisle: String, amount: f64, consistency: String, id: i32, image: String, name: String, original: String, original_name: String, unit: String) -> RecipeInformationExtendedIngredientsInner {
        RecipeInformationExtendedIngredientsInner {
            aisle,
            amount,
            consistency,
            id,
            image,
            measures: None,
            meta: None,
            name,
            original,
            original_name,
            unit,
        }
    }
}

