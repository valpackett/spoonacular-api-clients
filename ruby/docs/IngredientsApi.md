# OpenapiClient::IngredientsApi

All URIs are relative to *https://api.spoonacular.com*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**autocomplete_ingredient_search**](IngredientsApi.md#autocomplete_ingredient_search) | **GET** /food/ingredients/autocomplete | Autocomplete Ingredient Search |
| [**compute_ingredient_amount**](IngredientsApi.md#compute_ingredient_amount) | **GET** /food/ingredients/{id}/amount | Compute Ingredient Amount |
| [**get_ingredient_information**](IngredientsApi.md#get_ingredient_information) | **GET** /food/ingredients/{id}/information | Get Ingredient Information |
| [**get_ingredient_substitutes**](IngredientsApi.md#get_ingredient_substitutes) | **GET** /food/ingredients/substitutes | Get Ingredient Substitutes |
| [**get_ingredient_substitutes_by_id**](IngredientsApi.md#get_ingredient_substitutes_by_id) | **GET** /food/ingredients/{id}/substitutes | Get Ingredient Substitutes by ID |
| [**ingredient_search**](IngredientsApi.md#ingredient_search) | **GET** /food/ingredients/search | Ingredient Search |
| [**ingredients_by_id_image**](IngredientsApi.md#ingredients_by_id_image) | **GET** /recipes/{id}/ingredientWidget.png | Ingredients by ID Image |
| [**map_ingredients_to_grocery_products**](IngredientsApi.md#map_ingredients_to_grocery_products) | **POST** /food/ingredients/map | Map Ingredients to Grocery Products |
| [**visualize_ingredients**](IngredientsApi.md#visualize_ingredients) | **POST** /recipes/visualizeIngredients | Ingredients Widget |


## autocomplete_ingredient_search

> <Array<AutocompleteIngredientSearch200ResponseInner>> autocomplete_ingredient_search(query, opts)

Autocomplete Ingredient Search

Autocomplete the entry of an ingredient.

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure API key authorization: apiKeyScheme
  config.api_key['apiKeyScheme'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['apiKeyScheme'] = 'Bearer'
end

api_instance = OpenapiClient::IngredientsApi.new
query = 'burger' # String | The (natural language) search query.
opts = {
  number: 10, # Integer | The maximum number of items to return (between 1 and 100). Defaults to 10.
  meta_information: false, # Boolean | Whether to return more meta information about the ingredients.
  intolerances: 'egg', # String | A comma-separated list of intolerances. All recipes returned must not contain ingredients that are not suitable for people with the intolerances entered. See a full list of supported intolerances.
  language: 'en' # String | The language of the input. Either 'en' or 'de'.
}

begin
  # Autocomplete Ingredient Search
  result = api_instance.autocomplete_ingredient_search(query, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling IngredientsApi->autocomplete_ingredient_search: #{e}"
end
```

#### Using the autocomplete_ingredient_search_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Array<AutocompleteIngredientSearch200ResponseInner>>, Integer, Hash)> autocomplete_ingredient_search_with_http_info(query, opts)

```ruby
begin
  # Autocomplete Ingredient Search
  data, status_code, headers = api_instance.autocomplete_ingredient_search_with_http_info(query, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Array<AutocompleteIngredientSearch200ResponseInner>>
rescue OpenapiClient::ApiError => e
  puts "Error when calling IngredientsApi->autocomplete_ingredient_search_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **query** | **String** | The (natural language) search query. |  |
| **number** | **Integer** | The maximum number of items to return (between 1 and 100). Defaults to 10. | [optional][default to 10] |
| **meta_information** | **Boolean** | Whether to return more meta information about the ingredients. | [optional] |
| **intolerances** | **String** | A comma-separated list of intolerances. All recipes returned must not contain ingredients that are not suitable for people with the intolerances entered. See a full list of supported intolerances. | [optional] |
| **language** | **String** | The language of the input. Either &#39;en&#39; or &#39;de&#39;. | [optional] |

### Return type

[**Array&lt;AutocompleteIngredientSearch200ResponseInner&gt;**](AutocompleteIngredientSearch200ResponseInner.md)

### Authorization

[apiKeyScheme](../README.md#apiKeyScheme)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## compute_ingredient_amount

> <ComputeIngredientAmount200Response> compute_ingredient_amount(id, nutrient, target, opts)

Compute Ingredient Amount

Compute the amount you need of a certain ingredient for a certain nutritional goal. For example, how much pineapple do you have to eat to get 10 grams of protein?

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure API key authorization: apiKeyScheme
  config.api_key['apiKeyScheme'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['apiKeyScheme'] = 'Bearer'
end

api_instance = OpenapiClient::IngredientsApi.new
id = 9266 # Integer | The id of the ingredient you want the amount for.
nutrient = 'protein' # String | The target nutrient. See a list of supported nutrients.
target = 2 # Integer | The target number of the given nutrient.
opts = {
  unit: 'oz' # String | The target unit.
}

begin
  # Compute Ingredient Amount
  result = api_instance.compute_ingredient_amount(id, nutrient, target, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling IngredientsApi->compute_ingredient_amount: #{e}"
end
```

#### Using the compute_ingredient_amount_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ComputeIngredientAmount200Response>, Integer, Hash)> compute_ingredient_amount_with_http_info(id, nutrient, target, opts)

```ruby
begin
  # Compute Ingredient Amount
  data, status_code, headers = api_instance.compute_ingredient_amount_with_http_info(id, nutrient, target, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ComputeIngredientAmount200Response>
rescue OpenapiClient::ApiError => e
  puts "Error when calling IngredientsApi->compute_ingredient_amount_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** | The id of the ingredient you want the amount for. |  |
| **nutrient** | **String** | The target nutrient. See a list of supported nutrients. |  |
| **target** | **Integer** | The target number of the given nutrient. |  |
| **unit** | **String** | The target unit. | [optional] |

### Return type

[**ComputeIngredientAmount200Response**](ComputeIngredientAmount200Response.md)

### Authorization

[apiKeyScheme](../README.md#apiKeyScheme)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_ingredient_information

> <IngredientInformation> get_ingredient_information(id, opts)

Get Ingredient Information

Use an ingredient id to get all available information about an ingredient, such as its image and supermarket aisle.

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure API key authorization: apiKeyScheme
  config.api_key['apiKeyScheme'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['apiKeyScheme'] = 'Bearer'
end

api_instance = OpenapiClient::IngredientsApi.new
id = 9266 # Integer | The ingredient id.
opts = {
  amount: 150, # Float | The amount of this ingredient.
  unit: 'grams' # String | The unit for the given amount.
}

begin
  # Get Ingredient Information
  result = api_instance.get_ingredient_information(id, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling IngredientsApi->get_ingredient_information: #{e}"
end
```

#### Using the get_ingredient_information_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<IngredientInformation>, Integer, Hash)> get_ingredient_information_with_http_info(id, opts)

```ruby
begin
  # Get Ingredient Information
  data, status_code, headers = api_instance.get_ingredient_information_with_http_info(id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <IngredientInformation>
rescue OpenapiClient::ApiError => e
  puts "Error when calling IngredientsApi->get_ingredient_information_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** | The ingredient id. |  |
| **amount** | **Float** | The amount of this ingredient. | [optional] |
| **unit** | **String** | The unit for the given amount. | [optional] |

### Return type

[**IngredientInformation**](IngredientInformation.md)

### Authorization

[apiKeyScheme](../README.md#apiKeyScheme)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_ingredient_substitutes

> <GetIngredientSubstitutes200Response> get_ingredient_substitutes(ingredient_name)

Get Ingredient Substitutes

Search for substitutes for a given ingredient.

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure API key authorization: apiKeyScheme
  config.api_key['apiKeyScheme'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['apiKeyScheme'] = 'Bearer'
end

api_instance = OpenapiClient::IngredientsApi.new
ingredient_name = 'butter' # String | The name of the ingredient you want to replace.

begin
  # Get Ingredient Substitutes
  result = api_instance.get_ingredient_substitutes(ingredient_name)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling IngredientsApi->get_ingredient_substitutes: #{e}"
end
```

#### Using the get_ingredient_substitutes_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetIngredientSubstitutes200Response>, Integer, Hash)> get_ingredient_substitutes_with_http_info(ingredient_name)

```ruby
begin
  # Get Ingredient Substitutes
  data, status_code, headers = api_instance.get_ingredient_substitutes_with_http_info(ingredient_name)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetIngredientSubstitutes200Response>
rescue OpenapiClient::ApiError => e
  puts "Error when calling IngredientsApi->get_ingredient_substitutes_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ingredient_name** | **String** | The name of the ingredient you want to replace. |  |

### Return type

[**GetIngredientSubstitutes200Response**](GetIngredientSubstitutes200Response.md)

### Authorization

[apiKeyScheme](../README.md#apiKeyScheme)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_ingredient_substitutes_by_id

> <GetIngredientSubstitutes200Response> get_ingredient_substitutes_by_id(id)

Get Ingredient Substitutes by ID

Search for substitutes for a given ingredient.

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure API key authorization: apiKeyScheme
  config.api_key['apiKeyScheme'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['apiKeyScheme'] = 'Bearer'
end

api_instance = OpenapiClient::IngredientsApi.new
id = 1001 # Integer | The id of the ingredient you want substitutes for.

begin
  # Get Ingredient Substitutes by ID
  result = api_instance.get_ingredient_substitutes_by_id(id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling IngredientsApi->get_ingredient_substitutes_by_id: #{e}"
end
```

#### Using the get_ingredient_substitutes_by_id_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetIngredientSubstitutes200Response>, Integer, Hash)> get_ingredient_substitutes_by_id_with_http_info(id)

```ruby
begin
  # Get Ingredient Substitutes by ID
  data, status_code, headers = api_instance.get_ingredient_substitutes_by_id_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetIngredientSubstitutes200Response>
rescue OpenapiClient::ApiError => e
  puts "Error when calling IngredientsApi->get_ingredient_substitutes_by_id_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** | The id of the ingredient you want substitutes for. |  |

### Return type

[**GetIngredientSubstitutes200Response**](GetIngredientSubstitutes200Response.md)

### Authorization

[apiKeyScheme](../README.md#apiKeyScheme)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ingredient_search

> <IngredientSearch200Response> ingredient_search(query, opts)

Ingredient Search

Search for simple whole foods (e.g. fruits, vegetables, nuts, grains, meat, fish, dairy etc.).

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure API key authorization: apiKeyScheme
  config.api_key['apiKeyScheme'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['apiKeyScheme'] = 'Bearer'
end

api_instance = OpenapiClient::IngredientsApi.new
query = 'burger' # String | The (natural language) search query.
opts = {
  add_children: true, # Boolean | Whether to add children of found foods.
  min_protein_percent: 10, # Float | The minimum percentage of protein the food must have (between 0 and 100).
  max_protein_percent: 90, # Float | The maximum percentage of protein the food can have (between 0 and 100).
  min_fat_percent: 10, # Float | The minimum percentage of fat the food must have (between 0 and 100).
  max_fat_percent: 90, # Float | The maximum percentage of fat the food can have (between 0 and 100).
  min_carbs_percent: 10, # Float | The minimum percentage of carbs the food must have (between 0 and 100).
  max_carbs_percent: 90, # Float | The maximum percentage of carbs the food can have (between 0 and 100).
  meta_information: false, # Boolean | Whether to return more meta information about the ingredients.
  intolerances: 'egg', # String | A comma-separated list of intolerances. All recipes returned must not contain ingredients that are not suitable for people with the intolerances entered. See a full list of supported intolerances.
  sort: 'calories', # String | The strategy to sort recipes by. See a full list of supported sorting options.
  sort_direction: 'asc', # String | The direction in which to sort. Must be either 'asc' (ascending) or 'desc' (descending).
  offset: 56, # Integer | The number of results to skip (between 0 and 900).
  number: 10, # Integer | The maximum number of items to return (between 1 and 100). Defaults to 10.
  language: 'en' # String | The language of the input. Either 'en' or 'de'.
}

begin
  # Ingredient Search
  result = api_instance.ingredient_search(query, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling IngredientsApi->ingredient_search: #{e}"
end
```

#### Using the ingredient_search_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<IngredientSearch200Response>, Integer, Hash)> ingredient_search_with_http_info(query, opts)

```ruby
begin
  # Ingredient Search
  data, status_code, headers = api_instance.ingredient_search_with_http_info(query, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <IngredientSearch200Response>
rescue OpenapiClient::ApiError => e
  puts "Error when calling IngredientsApi->ingredient_search_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **query** | **String** | The (natural language) search query. |  |
| **add_children** | **Boolean** | Whether to add children of found foods. | [optional] |
| **min_protein_percent** | **Float** | The minimum percentage of protein the food must have (between 0 and 100). | [optional] |
| **max_protein_percent** | **Float** | The maximum percentage of protein the food can have (between 0 and 100). | [optional] |
| **min_fat_percent** | **Float** | The minimum percentage of fat the food must have (between 0 and 100). | [optional] |
| **max_fat_percent** | **Float** | The maximum percentage of fat the food can have (between 0 and 100). | [optional] |
| **min_carbs_percent** | **Float** | The minimum percentage of carbs the food must have (between 0 and 100). | [optional] |
| **max_carbs_percent** | **Float** | The maximum percentage of carbs the food can have (between 0 and 100). | [optional] |
| **meta_information** | **Boolean** | Whether to return more meta information about the ingredients. | [optional] |
| **intolerances** | **String** | A comma-separated list of intolerances. All recipes returned must not contain ingredients that are not suitable for people with the intolerances entered. See a full list of supported intolerances. | [optional] |
| **sort** | **String** | The strategy to sort recipes by. See a full list of supported sorting options. | [optional] |
| **sort_direction** | **String** | The direction in which to sort. Must be either &#39;asc&#39; (ascending) or &#39;desc&#39; (descending). | [optional] |
| **offset** | **Integer** | The number of results to skip (between 0 and 900). | [optional] |
| **number** | **Integer** | The maximum number of items to return (between 1 and 100). Defaults to 10. | [optional][default to 10] |
| **language** | **String** | The language of the input. Either &#39;en&#39; or &#39;de&#39;. | [optional] |

### Return type

[**IngredientSearch200Response**](IngredientSearch200Response.md)

### Authorization

[apiKeyScheme](../README.md#apiKeyScheme)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ingredients_by_id_image

> File ingredients_by_id_image(id, opts)

Ingredients by ID Image

Visualize a recipe's ingredient list.

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure API key authorization: apiKeyScheme
  config.api_key['apiKeyScheme'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['apiKeyScheme'] = 'Bearer'
end

api_instance = OpenapiClient::IngredientsApi.new
id = 1082038 # Integer | The recipe id.
opts = {
  measure: 'us' # String | Whether the the measures should be 'us' or 'metric'.
}

begin
  # Ingredients by ID Image
  result = api_instance.ingredients_by_id_image(id, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling IngredientsApi->ingredients_by_id_image: #{e}"
end
```

#### Using the ingredients_by_id_image_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(File, Integer, Hash)> ingredients_by_id_image_with_http_info(id, opts)

```ruby
begin
  # Ingredients by ID Image
  data, status_code, headers = api_instance.ingredients_by_id_image_with_http_info(id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => File
rescue OpenapiClient::ApiError => e
  puts "Error when calling IngredientsApi->ingredients_by_id_image_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** | The recipe id. |  |
| **measure** | **String** | Whether the the measures should be &#39;us&#39; or &#39;metric&#39;. | [optional] |

### Return type

**File**

### Authorization

[apiKeyScheme](../README.md#apiKeyScheme)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: image/png


## map_ingredients_to_grocery_products

> <Array<MapIngredientsToGroceryProducts200ResponseInner>> map_ingredients_to_grocery_products(map_ingredients_to_grocery_products_request)

Map Ingredients to Grocery Products

Map a set of ingredients to products you can buy in the grocery store.

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure API key authorization: apiKeyScheme
  config.api_key['apiKeyScheme'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['apiKeyScheme'] = 'Bearer'
end

api_instance = OpenapiClient::IngredientsApi.new
map_ingredients_to_grocery_products_request = OpenapiClient::MapIngredientsToGroceryProductsRequest.new({ingredients: ['ingredients_example'], servings: 3.56}) # MapIngredientsToGroceryProductsRequest | 

begin
  # Map Ingredients to Grocery Products
  result = api_instance.map_ingredients_to_grocery_products(map_ingredients_to_grocery_products_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling IngredientsApi->map_ingredients_to_grocery_products: #{e}"
end
```

#### Using the map_ingredients_to_grocery_products_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Array<MapIngredientsToGroceryProducts200ResponseInner>>, Integer, Hash)> map_ingredients_to_grocery_products_with_http_info(map_ingredients_to_grocery_products_request)

```ruby
begin
  # Map Ingredients to Grocery Products
  data, status_code, headers = api_instance.map_ingredients_to_grocery_products_with_http_info(map_ingredients_to_grocery_products_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Array<MapIngredientsToGroceryProducts200ResponseInner>>
rescue OpenapiClient::ApiError => e
  puts "Error when calling IngredientsApi->map_ingredients_to_grocery_products_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **map_ingredients_to_grocery_products_request** | [**MapIngredientsToGroceryProductsRequest**](MapIngredientsToGroceryProductsRequest.md) |  |  |

### Return type

[**Array&lt;MapIngredientsToGroceryProducts200ResponseInner&gt;**](MapIngredientsToGroceryProducts200ResponseInner.md)

### Authorization

[apiKeyScheme](../README.md#apiKeyScheme)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## visualize_ingredients

> String visualize_ingredients(ingredient_list, servings, opts)

Ingredients Widget

Visualize ingredients of a recipe. You can play around with that endpoint!

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure API key authorization: apiKeyScheme
  config.api_key['apiKeyScheme'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['apiKeyScheme'] = 'Bearer'
end

api_instance = OpenapiClient::IngredientsApi.new
ingredient_list = 'ingredient_list_example' # String | The ingredient list of the recipe, one ingredient per line (separate lines with \\\\n).
servings = 8.14 # Float | The number of servings.
opts = {
  language: 'en', # String | The language of the input. Either 'en' or 'de'.
  measure: 'us', # String | The original system of measurement, either 'metric' or 'us'.
  view: 'grid', # String | How to visualize the ingredients, either 'grid' or 'list'.
  default_css: true, # Boolean | Whether the default CSS should be added to the response.
  show_backlink: true # Boolean | Whether to show a backlink to spoonacular. If set false, this call counts against your quota.
}

begin
  # Ingredients Widget
  result = api_instance.visualize_ingredients(ingredient_list, servings, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling IngredientsApi->visualize_ingredients: #{e}"
end
```

#### Using the visualize_ingredients_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> visualize_ingredients_with_http_info(ingredient_list, servings, opts)

```ruby
begin
  # Ingredients Widget
  data, status_code, headers = api_instance.visualize_ingredients_with_http_info(ingredient_list, servings, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue OpenapiClient::ApiError => e
  puts "Error when calling IngredientsApi->visualize_ingredients_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ingredient_list** | **String** | The ingredient list of the recipe, one ingredient per line (separate lines with \\\\n). |  |
| **servings** | **Float** | The number of servings. |  |
| **language** | **String** | The language of the input. Either &#39;en&#39; or &#39;de&#39;. | [optional] |
| **measure** | **String** | The original system of measurement, either &#39;metric&#39; or &#39;us&#39;. | [optional] |
| **view** | **String** | How to visualize the ingredients, either &#39;grid&#39; or &#39;list&#39;. | [optional] |
| **default_css** | **Boolean** | Whether the default CSS should be added to the response. | [optional] |
| **show_backlink** | **Boolean** | Whether to show a backlink to spoonacular. If set false, this call counts against your quota. | [optional] |

### Return type

**String**

### Authorization

[apiKeyScheme](../README.md#apiKeyScheme)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: text/html

