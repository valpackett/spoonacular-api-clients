# GetRandomRecipes200Response



## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recipes** | [**List[RecipeInformation]**](RecipeInformation.md) |  | 

## Example

```python
from spoonacular.models.get_random_recipes200_response import GetRandomRecipes200Response

# TODO update the JSON string below
json = "{}"
# create an instance of GetRandomRecipes200Response from a JSON string
get_random_recipes200_response_instance = GetRandomRecipes200Response.from_json(json)
# print the JSON string representation of the object
print(GetRandomRecipes200Response.to_json())

# convert the object into a dict
get_random_recipes200_response_dict = get_random_recipes200_response_instance.to_dict()
# create an instance of GetRandomRecipes200Response from a dict
get_random_recipes200_response_from_dict = GetRandomRecipes200Response.from_dict(get_random_recipes200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


