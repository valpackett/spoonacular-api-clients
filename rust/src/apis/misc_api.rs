/*
 * spoonacular API
 *
 * The spoonacular Nutrition, Recipe, and Food API allows you to access over thousands of recipes, thousands of ingredients, 800,000 food products, over 100,000 menu items, and restaurants. Our food ontology and semantic recipe search engine makes it possible to search for recipes using natural language queries, such as \"gluten free brownies without sugar\" or \"low fat vegan cupcakes.\" You can automatically calculate the nutritional information for any recipe, analyze recipe costs, visualize ingredient lists, find recipes for what's in your fridge, find recipes based on special diets, nutritional requirements, or favorite ingredients, classify recipes into types and cuisines, convert ingredient amounts, or even compute an entire meal plan. With our powerful API, you can create many kinds of food and especially nutrition apps.  Special diets/dietary requirements currently available include: vegan, vegetarian, pescetarian, gluten free, grain free, dairy free, high protein, whole 30, low sodium, low carb, Paleo, ketogenic, FODMAP, and Primal.
 *
 * The version of the OpenAPI document: 1.1
 * Contact: mail@spoonacular.com
 * Generated by: https://openapi-generator.tech
 */


use reqwest;
use serde::{Deserialize, Serialize};
use crate::{apis::ResponseContent, models};
use super::{Error, configuration};


/// struct for typed errors of method [`detect_food_in_text`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum DetectFoodInTextError {
    Status401(),
    Status403(),
    Status404(),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`get_a_random_food_joke`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum GetARandomFoodJokeError {
    Status401(),
    Status403(),
    Status404(),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`get_conversation_suggests`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum GetConversationSuggestsError {
    Status401(),
    Status403(),
    Status404(),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`get_random_food_trivia`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum GetRandomFoodTriviaError {
    Status401(),
    Status403(),
    Status404(),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`image_analysis_by_url`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum ImageAnalysisByUrlError {
    Status401(),
    Status403(),
    Status404(),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`image_classification_by_url`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum ImageClassificationByUrlError {
    Status401(),
    Status403(),
    Status404(),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`search_all_food`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum SearchAllFoodError {
    Status401(),
    Status403(),
    Status404(),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`search_custom_foods`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum SearchCustomFoodsError {
    Status401(),
    Status403(),
    Status404(),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`search_food_videos`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum SearchFoodVideosError {
    Status401(),
    Status403(),
    Status404(),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`search_site_content`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum SearchSiteContentError {
    Status401(),
    Status403(),
    Status404(),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`talk_to_chatbot`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum TalkToChatbotError {
    Status401(),
    Status403(),
    Status404(),
    UnknownValue(serde_json::Value),
}


/// Take any text and find all mentions of food contained within it. This task is also called Named Entity Recognition (NER). In this case, the entities are foods. Either dishes, such as pizza or cheeseburger, or ingredients, such as cucumber or almonds.
pub async fn detect_food_in_text(configuration: &configuration::Configuration, text: &str) -> Result<models::DetectFoodInText200Response, Error<DetectFoodInTextError>> {
    let local_var_configuration = configuration;

    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/food/detect", local_var_configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::POST, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    if let Some(ref local_var_apikey) = local_var_configuration.api_key {
        let local_var_key = local_var_apikey.key.clone();
        let local_var_value = match local_var_apikey.prefix {
            Some(ref local_var_prefix) => format!("{} {}", local_var_prefix, local_var_key),
            None => local_var_key,
        };
        local_var_req_builder = local_var_req_builder.header("x-api-key", local_var_value);
    };
    let mut local_var_form_params = std::collections::HashMap::new();
    local_var_form_params.insert("text", text.to_string());
    local_var_req_builder = local_var_req_builder.form(&local_var_form_params);

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<DetectFoodInTextError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// Get a random joke that is related to food. Caution: this is an endpoint for adults!
pub async fn get_a_random_food_joke(configuration: &configuration::Configuration, ) -> Result<models::GetARandomFoodJoke200Response, Error<GetARandomFoodJokeError>> {
    let local_var_configuration = configuration;

    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/food/jokes/random", local_var_configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::GET, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    if let Some(ref local_var_apikey) = local_var_configuration.api_key {
        let local_var_key = local_var_apikey.key.clone();
        let local_var_value = match local_var_apikey.prefix {
            Some(ref local_var_prefix) => format!("{} {}", local_var_prefix, local_var_key),
            None => local_var_key,
        };
        local_var_req_builder = local_var_req_builder.header("x-api-key", local_var_value);
    };

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<GetARandomFoodJokeError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// This endpoint returns suggestions for things the user can say or ask the chatbot.
pub async fn get_conversation_suggests(configuration: &configuration::Configuration, query: &str, number: Option<f64>) -> Result<models::GetConversationSuggests200Response, Error<GetConversationSuggestsError>> {
    let local_var_configuration = configuration;

    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/food/converse/suggest", local_var_configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::GET, local_var_uri_str.as_str());

    local_var_req_builder = local_var_req_builder.query(&[("query", &query.to_string())]);
    if let Some(ref local_var_str) = number {
        local_var_req_builder = local_var_req_builder.query(&[("number", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    if let Some(ref local_var_apikey) = local_var_configuration.api_key {
        let local_var_key = local_var_apikey.key.clone();
        let local_var_value = match local_var_apikey.prefix {
            Some(ref local_var_prefix) => format!("{} {}", local_var_prefix, local_var_key),
            None => local_var_key,
        };
        local_var_req_builder = local_var_req_builder.header("x-api-key", local_var_value);
    };

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<GetConversationSuggestsError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// Returns random food trivia.
pub async fn get_random_food_trivia(configuration: &configuration::Configuration, ) -> Result<models::GetARandomFoodJoke200Response, Error<GetRandomFoodTriviaError>> {
    let local_var_configuration = configuration;

    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/food/trivia/random", local_var_configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::GET, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    if let Some(ref local_var_apikey) = local_var_configuration.api_key {
        let local_var_key = local_var_apikey.key.clone();
        let local_var_value = match local_var_apikey.prefix {
            Some(ref local_var_prefix) => format!("{} {}", local_var_prefix, local_var_key),
            None => local_var_key,
        };
        local_var_req_builder = local_var_req_builder.header("x-api-key", local_var_value);
    };

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<GetRandomFoodTriviaError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// Analyze a food image. The API tries to classify the image, guess the nutrition, and find a matching recipes.
pub async fn image_analysis_by_url(configuration: &configuration::Configuration, image_url: &str) -> Result<models::ImageAnalysisByUrl200Response, Error<ImageAnalysisByUrlError>> {
    let local_var_configuration = configuration;

    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/food/images/analyze", local_var_configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::GET, local_var_uri_str.as_str());

    local_var_req_builder = local_var_req_builder.query(&[("imageUrl", &image_url.to_string())]);
    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    if let Some(ref local_var_apikey) = local_var_configuration.api_key {
        let local_var_key = local_var_apikey.key.clone();
        let local_var_value = match local_var_apikey.prefix {
            Some(ref local_var_prefix) => format!("{} {}", local_var_prefix, local_var_key),
            None => local_var_key,
        };
        local_var_req_builder = local_var_req_builder.header("x-api-key", local_var_value);
    };

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<ImageAnalysisByUrlError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// Classify a food image.
pub async fn image_classification_by_url(configuration: &configuration::Configuration, image_url: &str) -> Result<models::ImageClassificationByUrl200Response, Error<ImageClassificationByUrlError>> {
    let local_var_configuration = configuration;

    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/food/images/classify", local_var_configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::GET, local_var_uri_str.as_str());

    local_var_req_builder = local_var_req_builder.query(&[("imageUrl", &image_url.to_string())]);
    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    if let Some(ref local_var_apikey) = local_var_configuration.api_key {
        let local_var_key = local_var_apikey.key.clone();
        let local_var_value = match local_var_apikey.prefix {
            Some(ref local_var_prefix) => format!("{} {}", local_var_prefix, local_var_key),
            None => local_var_key,
        };
        local_var_req_builder = local_var_req_builder.header("x-api-key", local_var_value);
    };

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<ImageClassificationByUrlError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// Search all food content with one call. That includes recipes, grocery products, menu items, simple foods (ingredients), and food videos.
pub async fn search_all_food(configuration: &configuration::Configuration, query: &str, offset: Option<i32>, number: Option<i32>) -> Result<models::SearchAllFood200Response, Error<SearchAllFoodError>> {
    let local_var_configuration = configuration;

    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/food/search", local_var_configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::GET, local_var_uri_str.as_str());

    local_var_req_builder = local_var_req_builder.query(&[("query", &query.to_string())]);
    if let Some(ref local_var_str) = offset {
        local_var_req_builder = local_var_req_builder.query(&[("offset", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = number {
        local_var_req_builder = local_var_req_builder.query(&[("number", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    if let Some(ref local_var_apikey) = local_var_configuration.api_key {
        let local_var_key = local_var_apikey.key.clone();
        let local_var_value = match local_var_apikey.prefix {
            Some(ref local_var_prefix) => format!("{} {}", local_var_prefix, local_var_key),
            None => local_var_key,
        };
        local_var_req_builder = local_var_req_builder.header("x-api-key", local_var_value);
    };

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<SearchAllFoodError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// Search custom foods in a user's account.
pub async fn search_custom_foods(configuration: &configuration::Configuration, query: &str, username: &str, hash: &str, offset: Option<i32>, number: Option<i32>) -> Result<models::SearchCustomFoods200Response, Error<SearchCustomFoodsError>> {
    let local_var_configuration = configuration;

    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/food/customFoods/search", local_var_configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::GET, local_var_uri_str.as_str());

    local_var_req_builder = local_var_req_builder.query(&[("query", &query.to_string())]);
    local_var_req_builder = local_var_req_builder.query(&[("username", &username.to_string())]);
    local_var_req_builder = local_var_req_builder.query(&[("hash", &hash.to_string())]);
    if let Some(ref local_var_str) = offset {
        local_var_req_builder = local_var_req_builder.query(&[("offset", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = number {
        local_var_req_builder = local_var_req_builder.query(&[("number", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    if let Some(ref local_var_apikey) = local_var_configuration.api_key {
        let local_var_key = local_var_apikey.key.clone();
        let local_var_value = match local_var_apikey.prefix {
            Some(ref local_var_prefix) => format!("{} {}", local_var_prefix, local_var_key),
            None => local_var_key,
        };
        local_var_req_builder = local_var_req_builder.header("x-api-key", local_var_value);
    };

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<SearchCustomFoodsError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// Find recipe and other food related videos.
pub async fn search_food_videos(configuration: &configuration::Configuration, query: &str, r#type: Option<&str>, cuisine: Option<&str>, diet: Option<&str>, include_ingredients: Option<&str>, exclude_ingredients: Option<&str>, min_length: Option<f64>, max_length: Option<f64>, offset: Option<i32>, number: Option<i32>) -> Result<models::SearchFoodVideos200Response, Error<SearchFoodVideosError>> {
    let local_var_configuration = configuration;

    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/food/videos/search", local_var_configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::GET, local_var_uri_str.as_str());

    local_var_req_builder = local_var_req_builder.query(&[("query", &query.to_string())]);
    if let Some(ref local_var_str) = r#type {
        local_var_req_builder = local_var_req_builder.query(&[("type", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = cuisine {
        local_var_req_builder = local_var_req_builder.query(&[("cuisine", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = diet {
        local_var_req_builder = local_var_req_builder.query(&[("diet", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = include_ingredients {
        local_var_req_builder = local_var_req_builder.query(&[("includeIngredients", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = exclude_ingredients {
        local_var_req_builder = local_var_req_builder.query(&[("excludeIngredients", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = min_length {
        local_var_req_builder = local_var_req_builder.query(&[("minLength", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = max_length {
        local_var_req_builder = local_var_req_builder.query(&[("maxLength", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = offset {
        local_var_req_builder = local_var_req_builder.query(&[("offset", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = number {
        local_var_req_builder = local_var_req_builder.query(&[("number", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    if let Some(ref local_var_apikey) = local_var_configuration.api_key {
        let local_var_key = local_var_apikey.key.clone();
        let local_var_value = match local_var_apikey.prefix {
            Some(ref local_var_prefix) => format!("{} {}", local_var_prefix, local_var_key),
            None => local_var_key,
        };
        local_var_req_builder = local_var_req_builder.header("x-api-key", local_var_value);
    };

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<SearchFoodVideosError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// Search spoonacular's site content. You'll be able to find everything that you could also find using the search suggestions on spoonacular.com. This is a suggest API so you can send partial strings as queries.
pub async fn search_site_content(configuration: &configuration::Configuration, query: &str) -> Result<models::SearchSiteContent200Response, Error<SearchSiteContentError>> {
    let local_var_configuration = configuration;

    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/food/site/search", local_var_configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::GET, local_var_uri_str.as_str());

    local_var_req_builder = local_var_req_builder.query(&[("query", &query.to_string())]);
    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    if let Some(ref local_var_apikey) = local_var_configuration.api_key {
        let local_var_key = local_var_apikey.key.clone();
        let local_var_value = match local_var_apikey.prefix {
            Some(ref local_var_prefix) => format!("{} {}", local_var_prefix, local_var_key),
            None => local_var_key,
        };
        local_var_req_builder = local_var_req_builder.header("x-api-key", local_var_value);
    };

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<SearchSiteContentError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// This endpoint can be used to have a conversation about food with the spoonacular chatbot. Use the \"Get Conversation Suggests\" endpoint to show your user what he or she can say.
pub async fn talk_to_chatbot(configuration: &configuration::Configuration, text: &str, context_id: Option<&str>) -> Result<models::TalkToChatbot200Response, Error<TalkToChatbotError>> {
    let local_var_configuration = configuration;

    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/food/converse", local_var_configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::GET, local_var_uri_str.as_str());

    local_var_req_builder = local_var_req_builder.query(&[("text", &text.to_string())]);
    if let Some(ref local_var_str) = context_id {
        local_var_req_builder = local_var_req_builder.query(&[("contextId", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    if let Some(ref local_var_apikey) = local_var_configuration.api_key {
        let local_var_key = local_var_apikey.key.clone();
        let local_var_value = match local_var_apikey.prefix {
            Some(ref local_var_prefix) => format!("{} {}", local_var_prefix, local_var_key),
            None => local_var_key,
        };
        local_var_req_builder = local_var_req_builder.header("x-api-key", local_var_value);
    };

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<TalkToChatbotError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

