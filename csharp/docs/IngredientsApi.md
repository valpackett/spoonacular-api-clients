# spoonacular.Api.IngredientsApi

All URIs are relative to *https://api.spoonacular.com*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**AutocompleteIngredientSearch**](IngredientsApi.md#autocompleteingredientsearch) | **GET** /food/ingredients/autocomplete | Autocomplete Ingredient Search |
| [**ComputeIngredientAmount**](IngredientsApi.md#computeingredientamount) | **GET** /food/ingredients/{id}/amount | Compute Ingredient Amount |
| [**GetIngredientInformation**](IngredientsApi.md#getingredientinformation) | **GET** /food/ingredients/{id}/information | Get Ingredient Information |
| [**GetIngredientSubstitutes**](IngredientsApi.md#getingredientsubstitutes) | **GET** /food/ingredients/substitutes | Get Ingredient Substitutes |
| [**GetIngredientSubstitutesByID**](IngredientsApi.md#getingredientsubstitutesbyid) | **GET** /food/ingredients/{id}/substitutes | Get Ingredient Substitutes by ID |
| [**IngredientSearch**](IngredientsApi.md#ingredientsearch) | **GET** /food/ingredients/search | Ingredient Search |
| [**IngredientsByIDImage**](IngredientsApi.md#ingredientsbyidimage) | **GET** /recipes/{id}/ingredientWidget.png | Ingredients by ID Image |
| [**MapIngredientsToGroceryProducts**](IngredientsApi.md#mapingredientstogroceryproducts) | **POST** /food/ingredients/map | Map Ingredients to Grocery Products |
| [**VisualizeIngredients**](IngredientsApi.md#visualizeingredients) | **POST** /recipes/visualizeIngredients | Ingredients Widget |

<a id="autocompleteingredientsearch"></a>
# **AutocompleteIngredientSearch**
> List&lt;AutocompleteIngredientSearch200ResponseInner&gt; AutocompleteIngredientSearch (string query, int? number = null, bool? metaInformation = null, string? intolerances = null, string? language = null)

Autocomplete Ingredient Search

Autocomplete the entry of an ingredient.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using spoonacular.Api;
using spoonacular.Client;
using spoonacular.Model;

namespace Example
{
    public class AutocompleteIngredientSearchExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.spoonacular.com";
            // Configure API key authorization: apiKeyScheme
            config.AddApiKey("x-api-key", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("x-api-key", "Bearer");

            var apiInstance = new IngredientsApi(config);
            var query = burger;  // string | The (natural language) search query.
            var number = 10;  // int? | The maximum number of items to return (between 1 and 100). Defaults to 10. (optional)  (default to 10)
            var metaInformation = false;  // bool? | Whether to return more meta information about the ingredients. (optional) 
            var intolerances = egg;  // string? | A comma-separated list of intolerances. All recipes returned must not contain ingredients that are not suitable for people with the intolerances entered. See a full list of supported intolerances. (optional) 
            var language = en;  // string? | The language of the input. Either 'en' or 'de'. (optional) 

            try
            {
                // Autocomplete Ingredient Search
                List<AutocompleteIngredientSearch200ResponseInner> result = apiInstance.AutocompleteIngredientSearch(query, number, metaInformation, intolerances, language);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling IngredientsApi.AutocompleteIngredientSearch: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the AutocompleteIngredientSearchWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Autocomplete Ingredient Search
    ApiResponse<List<AutocompleteIngredientSearch200ResponseInner>> response = apiInstance.AutocompleteIngredientSearchWithHttpInfo(query, number, metaInformation, intolerances, language);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling IngredientsApi.AutocompleteIngredientSearchWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **query** | **string** | The (natural language) search query. |  |
| **number** | **int?** | The maximum number of items to return (between 1 and 100). Defaults to 10. | [optional] [default to 10] |
| **metaInformation** | **bool?** | Whether to return more meta information about the ingredients. | [optional]  |
| **intolerances** | **string?** | A comma-separated list of intolerances. All recipes returned must not contain ingredients that are not suitable for people with the intolerances entered. See a full list of supported intolerances. | [optional]  |
| **language** | **string?** | The language of the input. Either &#39;en&#39; or &#39;de&#39;. | [optional]  |

### Return type

[**List&lt;AutocompleteIngredientSearch200ResponseInner&gt;**](AutocompleteIngredientSearch200ResponseInner.md)

### Authorization

[apiKeyScheme](../README.md#apiKeyScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="computeingredientamount"></a>
# **ComputeIngredientAmount**
> ComputeIngredientAmount200Response ComputeIngredientAmount (int id, string nutrient, int target, string? unit = null)

Compute Ingredient Amount

Compute the amount you need of a certain ingredient for a certain nutritional goal. For example, how much pineapple do you have to eat to get 10 grams of protein?

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using spoonacular.Api;
using spoonacular.Client;
using spoonacular.Model;

namespace Example
{
    public class ComputeIngredientAmountExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.spoonacular.com";
            // Configure API key authorization: apiKeyScheme
            config.AddApiKey("x-api-key", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("x-api-key", "Bearer");

            var apiInstance = new IngredientsApi(config);
            var id = 9266;  // int | The id of the ingredient you want the amount for.
            var nutrient = protein;  // string | The target nutrient. See a list of supported nutrients.
            var target = 2;  // int | The target number of the given nutrient.
            var unit = oz;  // string? | The target unit. (optional) 

            try
            {
                // Compute Ingredient Amount
                ComputeIngredientAmount200Response result = apiInstance.ComputeIngredientAmount(id, nutrient, target, unit);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling IngredientsApi.ComputeIngredientAmount: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ComputeIngredientAmountWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Compute Ingredient Amount
    ApiResponse<ComputeIngredientAmount200Response> response = apiInstance.ComputeIngredientAmountWithHttpInfo(id, nutrient, target, unit);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling IngredientsApi.ComputeIngredientAmountWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **id** | **int** | The id of the ingredient you want the amount for. |  |
| **nutrient** | **string** | The target nutrient. See a list of supported nutrients. |  |
| **target** | **int** | The target number of the given nutrient. |  |
| **unit** | **string?** | The target unit. | [optional]  |

### Return type

[**ComputeIngredientAmount200Response**](ComputeIngredientAmount200Response.md)

### Authorization

[apiKeyScheme](../README.md#apiKeyScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="getingredientinformation"></a>
# **GetIngredientInformation**
> IngredientInformation GetIngredientInformation (int id, decimal? amount = null, string? unit = null)

Get Ingredient Information

Use an ingredient id to get all available information about an ingredient, such as its image and supermarket aisle.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using spoonacular.Api;
using spoonacular.Client;
using spoonacular.Model;

namespace Example
{
    public class GetIngredientInformationExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.spoonacular.com";
            // Configure API key authorization: apiKeyScheme
            config.AddApiKey("x-api-key", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("x-api-key", "Bearer");

            var apiInstance = new IngredientsApi(config);
            var id = 9266;  // int | The ingredient id.
            var amount = 150;  // decimal? | The amount of this ingredient. (optional) 
            var unit = grams;  // string? | The unit for the given amount. (optional) 

            try
            {
                // Get Ingredient Information
                IngredientInformation result = apiInstance.GetIngredientInformation(id, amount, unit);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling IngredientsApi.GetIngredientInformation: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetIngredientInformationWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get Ingredient Information
    ApiResponse<IngredientInformation> response = apiInstance.GetIngredientInformationWithHttpInfo(id, amount, unit);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling IngredientsApi.GetIngredientInformationWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **id** | **int** | The ingredient id. |  |
| **amount** | **decimal?** | The amount of this ingredient. | [optional]  |
| **unit** | **string?** | The unit for the given amount. | [optional]  |

### Return type

[**IngredientInformation**](IngredientInformation.md)

### Authorization

[apiKeyScheme](../README.md#apiKeyScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="getingredientsubstitutes"></a>
# **GetIngredientSubstitutes**
> GetIngredientSubstitutes200Response GetIngredientSubstitutes (string ingredientName)

Get Ingredient Substitutes

Search for substitutes for a given ingredient.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using spoonacular.Api;
using spoonacular.Client;
using spoonacular.Model;

namespace Example
{
    public class GetIngredientSubstitutesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.spoonacular.com";
            // Configure API key authorization: apiKeyScheme
            config.AddApiKey("x-api-key", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("x-api-key", "Bearer");

            var apiInstance = new IngredientsApi(config);
            var ingredientName = butter;  // string | The name of the ingredient you want to replace.

            try
            {
                // Get Ingredient Substitutes
                GetIngredientSubstitutes200Response result = apiInstance.GetIngredientSubstitutes(ingredientName);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling IngredientsApi.GetIngredientSubstitutes: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetIngredientSubstitutesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get Ingredient Substitutes
    ApiResponse<GetIngredientSubstitutes200Response> response = apiInstance.GetIngredientSubstitutesWithHttpInfo(ingredientName);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling IngredientsApi.GetIngredientSubstitutesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **ingredientName** | **string** | The name of the ingredient you want to replace. |  |

### Return type

[**GetIngredientSubstitutes200Response**](GetIngredientSubstitutes200Response.md)

### Authorization

[apiKeyScheme](../README.md#apiKeyScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="getingredientsubstitutesbyid"></a>
# **GetIngredientSubstitutesByID**
> GetIngredientSubstitutes200Response GetIngredientSubstitutesByID (int id)

Get Ingredient Substitutes by ID

Search for substitutes for a given ingredient.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using spoonacular.Api;
using spoonacular.Client;
using spoonacular.Model;

namespace Example
{
    public class GetIngredientSubstitutesByIDExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.spoonacular.com";
            // Configure API key authorization: apiKeyScheme
            config.AddApiKey("x-api-key", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("x-api-key", "Bearer");

            var apiInstance = new IngredientsApi(config);
            var id = 1001;  // int | The id of the ingredient you want substitutes for.

            try
            {
                // Get Ingredient Substitutes by ID
                GetIngredientSubstitutes200Response result = apiInstance.GetIngredientSubstitutesByID(id);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling IngredientsApi.GetIngredientSubstitutesByID: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetIngredientSubstitutesByIDWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get Ingredient Substitutes by ID
    ApiResponse<GetIngredientSubstitutes200Response> response = apiInstance.GetIngredientSubstitutesByIDWithHttpInfo(id);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling IngredientsApi.GetIngredientSubstitutesByIDWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **id** | **int** | The id of the ingredient you want substitutes for. |  |

### Return type

[**GetIngredientSubstitutes200Response**](GetIngredientSubstitutes200Response.md)

### Authorization

[apiKeyScheme](../README.md#apiKeyScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="ingredientsearch"></a>
# **IngredientSearch**
> IngredientSearch200Response IngredientSearch (string query, bool? addChildren = null, decimal? minProteinPercent = null, decimal? maxProteinPercent = null, decimal? minFatPercent = null, decimal? maxFatPercent = null, decimal? minCarbsPercent = null, decimal? maxCarbsPercent = null, bool? metaInformation = null, string? intolerances = null, string? sort = null, string? sortDirection = null, int? offset = null, int? number = null, string? language = null)

Ingredient Search

Search for simple whole foods (e.g. fruits, vegetables, nuts, grains, meat, fish, dairy etc.).

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using spoonacular.Api;
using spoonacular.Client;
using spoonacular.Model;

namespace Example
{
    public class IngredientSearchExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.spoonacular.com";
            // Configure API key authorization: apiKeyScheme
            config.AddApiKey("x-api-key", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("x-api-key", "Bearer");

            var apiInstance = new IngredientsApi(config);
            var query = burger;  // string | The (natural language) search query.
            var addChildren = true;  // bool? | Whether to add children of found foods. (optional) 
            var minProteinPercent = 10;  // decimal? | The minimum percentage of protein the food must have (between 0 and 100). (optional) 
            var maxProteinPercent = 90;  // decimal? | The maximum percentage of protein the food can have (between 0 and 100). (optional) 
            var minFatPercent = 10;  // decimal? | The minimum percentage of fat the food must have (between 0 and 100). (optional) 
            var maxFatPercent = 90;  // decimal? | The maximum percentage of fat the food can have (between 0 and 100). (optional) 
            var minCarbsPercent = 10;  // decimal? | The minimum percentage of carbs the food must have (between 0 and 100). (optional) 
            var maxCarbsPercent = 90;  // decimal? | The maximum percentage of carbs the food can have (between 0 and 100). (optional) 
            var metaInformation = false;  // bool? | Whether to return more meta information about the ingredients. (optional) 
            var intolerances = egg;  // string? | A comma-separated list of intolerances. All recipes returned must not contain ingredients that are not suitable for people with the intolerances entered. See a full list of supported intolerances. (optional) 
            var sort = calories;  // string? | The strategy to sort recipes by. See a full list of supported sorting options. (optional) 
            var sortDirection = asc;  // string? | The direction in which to sort. Must be either 'asc' (ascending) or 'desc' (descending). (optional) 
            var offset = 56;  // int? | The number of results to skip (between 0 and 900). (optional) 
            var number = 10;  // int? | The maximum number of items to return (between 1 and 100). Defaults to 10. (optional)  (default to 10)
            var language = en;  // string? | The language of the input. Either 'en' or 'de'. (optional) 

            try
            {
                // Ingredient Search
                IngredientSearch200Response result = apiInstance.IngredientSearch(query, addChildren, minProteinPercent, maxProteinPercent, minFatPercent, maxFatPercent, minCarbsPercent, maxCarbsPercent, metaInformation, intolerances, sort, sortDirection, offset, number, language);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling IngredientsApi.IngredientSearch: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the IngredientSearchWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Ingredient Search
    ApiResponse<IngredientSearch200Response> response = apiInstance.IngredientSearchWithHttpInfo(query, addChildren, minProteinPercent, maxProteinPercent, minFatPercent, maxFatPercent, minCarbsPercent, maxCarbsPercent, metaInformation, intolerances, sort, sortDirection, offset, number, language);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling IngredientsApi.IngredientSearchWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **query** | **string** | The (natural language) search query. |  |
| **addChildren** | **bool?** | Whether to add children of found foods. | [optional]  |
| **minProteinPercent** | **decimal?** | The minimum percentage of protein the food must have (between 0 and 100). | [optional]  |
| **maxProteinPercent** | **decimal?** | The maximum percentage of protein the food can have (between 0 and 100). | [optional]  |
| **minFatPercent** | **decimal?** | The minimum percentage of fat the food must have (between 0 and 100). | [optional]  |
| **maxFatPercent** | **decimal?** | The maximum percentage of fat the food can have (between 0 and 100). | [optional]  |
| **minCarbsPercent** | **decimal?** | The minimum percentage of carbs the food must have (between 0 and 100). | [optional]  |
| **maxCarbsPercent** | **decimal?** | The maximum percentage of carbs the food can have (between 0 and 100). | [optional]  |
| **metaInformation** | **bool?** | Whether to return more meta information about the ingredients. | [optional]  |
| **intolerances** | **string?** | A comma-separated list of intolerances. All recipes returned must not contain ingredients that are not suitable for people with the intolerances entered. See a full list of supported intolerances. | [optional]  |
| **sort** | **string?** | The strategy to sort recipes by. See a full list of supported sorting options. | [optional]  |
| **sortDirection** | **string?** | The direction in which to sort. Must be either &#39;asc&#39; (ascending) or &#39;desc&#39; (descending). | [optional]  |
| **offset** | **int?** | The number of results to skip (between 0 and 900). | [optional]  |
| **number** | **int?** | The maximum number of items to return (between 1 and 100). Defaults to 10. | [optional] [default to 10] |
| **language** | **string?** | The language of the input. Either &#39;en&#39; or &#39;de&#39;. | [optional]  |

### Return type

[**IngredientSearch200Response**](IngredientSearch200Response.md)

### Authorization

[apiKeyScheme](../README.md#apiKeyScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="ingredientsbyidimage"></a>
# **IngredientsByIDImage**
> System.IO.Stream IngredientsByIDImage (int id, string? measure = null)

Ingredients by ID Image

Visualize a recipe's ingredient list.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using spoonacular.Api;
using spoonacular.Client;
using spoonacular.Model;

namespace Example
{
    public class IngredientsByIDImageExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.spoonacular.com";
            // Configure API key authorization: apiKeyScheme
            config.AddApiKey("x-api-key", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("x-api-key", "Bearer");

            var apiInstance = new IngredientsApi(config);
            var id = 1082038;  // int | The recipe id.
            var measure = metric;  // string? | Whether the the measures should be 'us' or 'metric'. (optional) 

            try
            {
                // Ingredients by ID Image
                System.IO.Stream result = apiInstance.IngredientsByIDImage(id, measure);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling IngredientsApi.IngredientsByIDImage: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the IngredientsByIDImageWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Ingredients by ID Image
    ApiResponse<System.IO.Stream> response = apiInstance.IngredientsByIDImageWithHttpInfo(id, measure);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling IngredientsApi.IngredientsByIDImageWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **id** | **int** | The recipe id. |  |
| **measure** | **string?** | Whether the the measures should be &#39;us&#39; or &#39;metric&#39;. | [optional]  |

### Return type

**System.IO.Stream**

### Authorization

[apiKeyScheme](../README.md#apiKeyScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: image/png


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="mapingredientstogroceryproducts"></a>
# **MapIngredientsToGroceryProducts**
> List&lt;MapIngredientsToGroceryProducts200ResponseInner&gt; MapIngredientsToGroceryProducts (MapIngredientsToGroceryProductsRequest mapIngredientsToGroceryProductsRequest)

Map Ingredients to Grocery Products

Map a set of ingredients to products you can buy in the grocery store.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using spoonacular.Api;
using spoonacular.Client;
using spoonacular.Model;

namespace Example
{
    public class MapIngredientsToGroceryProductsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.spoonacular.com";
            // Configure API key authorization: apiKeyScheme
            config.AddApiKey("x-api-key", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("x-api-key", "Bearer");

            var apiInstance = new IngredientsApi(config);
            var mapIngredientsToGroceryProductsRequest = new MapIngredientsToGroceryProductsRequest(); // MapIngredientsToGroceryProductsRequest | 

            try
            {
                // Map Ingredients to Grocery Products
                List<MapIngredientsToGroceryProducts200ResponseInner> result = apiInstance.MapIngredientsToGroceryProducts(mapIngredientsToGroceryProductsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling IngredientsApi.MapIngredientsToGroceryProducts: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the MapIngredientsToGroceryProductsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Map Ingredients to Grocery Products
    ApiResponse<List<MapIngredientsToGroceryProducts200ResponseInner>> response = apiInstance.MapIngredientsToGroceryProductsWithHttpInfo(mapIngredientsToGroceryProductsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling IngredientsApi.MapIngredientsToGroceryProductsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **mapIngredientsToGroceryProductsRequest** | [**MapIngredientsToGroceryProductsRequest**](MapIngredientsToGroceryProductsRequest.md) |  |  |

### Return type

[**List&lt;MapIngredientsToGroceryProducts200ResponseInner&gt;**](MapIngredientsToGroceryProducts200ResponseInner.md)

### Authorization

[apiKeyScheme](../README.md#apiKeyScheme)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="visualizeingredients"></a>
# **VisualizeIngredients**
> string VisualizeIngredients (string ingredientList, decimal servings, string? language = null, string? measure = null, string? view = null, bool? defaultCss = null, bool? showBacklink = null)

Ingredients Widget

Visualize ingredients of a recipe. You can play around with that endpoint!

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using spoonacular.Api;
using spoonacular.Client;
using spoonacular.Model;

namespace Example
{
    public class VisualizeIngredientsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.spoonacular.com";
            // Configure API key authorization: apiKeyScheme
            config.AddApiKey("x-api-key", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("x-api-key", "Bearer");

            var apiInstance = new IngredientsApi(config);
            var ingredientList = "ingredientList_example";  // string | The ingredient list of the recipe, one ingredient per line (separate lines with \\\\n).
            var servings = 8.14D;  // decimal | The number of servings.
            var language = en;  // string? | The language of the input. Either 'en' or 'de'. (optional) 
            var measure = "us";  // string? | The original system of measurement, either 'metric' or 'us'. (optional) 
            var view = "grid";  // string? | How to visualize the ingredients, either 'grid' or 'list'. (optional) 
            var defaultCss = true;  // bool? | Whether the default CSS should be added to the response. (optional) 
            var showBacklink = true;  // bool? | Whether to show a backlink to spoonacular. If set false, this call counts against your quota. (optional) 

            try
            {
                // Ingredients Widget
                string result = apiInstance.VisualizeIngredients(ingredientList, servings, language, measure, view, defaultCss, showBacklink);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling IngredientsApi.VisualizeIngredients: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the VisualizeIngredientsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Ingredients Widget
    ApiResponse<string> response = apiInstance.VisualizeIngredientsWithHttpInfo(ingredientList, servings, language, measure, view, defaultCss, showBacklink);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling IngredientsApi.VisualizeIngredientsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **ingredientList** | **string** | The ingredient list of the recipe, one ingredient per line (separate lines with \\\\n). |  |
| **servings** | **decimal** | The number of servings. |  |
| **language** | **string?** | The language of the input. Either &#39;en&#39; or &#39;de&#39;. | [optional]  |
| **measure** | **string?** | The original system of measurement, either &#39;metric&#39; or &#39;us&#39;. | [optional]  |
| **view** | **string?** | How to visualize the ingredients, either &#39;grid&#39; or &#39;list&#39;. | [optional]  |
| **defaultCss** | **bool?** | Whether the default CSS should be added to the response. | [optional]  |
| **showBacklink** | **bool?** | Whether to show a backlink to spoonacular. If set false, this call counts against your quota. | [optional]  |

### Return type

**string**

### Authorization

[apiKeyScheme](../README.md#apiKeyScheme)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: text/html


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

