# GetComparableProducts200Response



## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**comparable_products** | [**GetComparableProducts200ResponseComparableProducts**](GetComparableProducts200ResponseComparableProducts.md) |  | 

## Example

```python
from spoonacular.models.get_comparable_products200_response import GetComparableProducts200Response

# TODO update the JSON string below
json = "{}"
# create an instance of GetComparableProducts200Response from a JSON string
get_comparable_products200_response_instance = GetComparableProducts200Response.from_json(json)
# print the JSON string representation of the object
print(GetComparableProducts200Response.to_json())

# convert the object into a dict
get_comparable_products200_response_dict = get_comparable_products200_response_instance.to_dict()
# create an instance of GetComparableProducts200Response from a dict
get_comparable_products200_response_from_dict = GetComparableProducts200Response.from_dict(get_comparable_products200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


