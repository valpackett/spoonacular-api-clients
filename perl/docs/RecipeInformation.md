# WWW::OpenAPIClient::Object::RecipeInformation

## Load the model package
```perl
use WWW::OpenAPIClient::Object::RecipeInformation;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | 
**title** | **string** |  | 
**image** | **string** |  | 
**image_type** | **string** |  | [optional] 
**servings** | **double** |  | 
**ready_in_minutes** | **int** |  | 
**preparation_minutes** | **int** |  | [optional] 
**cooking_minutes** | **int** |  | [optional] 
**license** | **string** |  | [optional] 
**source_name** | **string** |  | 
**source_url** | **string** |  | 
**spoonacular_source_url** | **string** |  | 
**aggregate_likes** | **int** |  | 
**health_score** | **double** |  | 
**spoonacular_score** | **double** |  | 
**price_per_serving** | **double** |  | 
**analyzed_instructions** | **ARRAY[object]** |  | 
**cheap** | **boolean** |  | 
**credits_text** | **string** |  | 
**cuisines** | **ARRAY[string]** |  | 
**dairy_free** | **boolean** |  | 
**diets** | **ARRAY[string]** |  | 
**gaps** | **string** |  | 
**gluten_free** | **boolean** |  | 
**instructions** | **string** |  | 
**low_fodmap** | **boolean** |  | 
**occasions** | **ARRAY[string]** |  | 
**sustainable** | **boolean** |  | 
**vegan** | **boolean** |  | 
**vegetarian** | **boolean** |  | 
**very_healthy** | **boolean** |  | 
**very_popular** | **boolean** |  | 
**weight_watcher_smart_points** | **double** |  | 
**dish_types** | **ARRAY[string]** |  | 
**extended_ingredients** | [**ARRAY[RecipeInformationExtendedIngredientsInner]**](RecipeInformationExtendedIngredientsInner.md) |  | 
**summary** | **string** |  | 
**wine_pairing** | [**RecipeInformationWinePairing**](RecipeInformationWinePairing.md) |  | [optional] 
**taste** | [**TasteInformation**](TasteInformation.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


