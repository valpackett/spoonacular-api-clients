/*
spoonacular API

The spoonacular Nutrition, Recipe, and Food API allows you to access over thousands of recipes, thousands of ingredients, 800,000 food products, over 100,000 menu items, and restaurants. Our food ontology and semantic recipe search engine makes it possible to search for recipes using natural language queries, such as \"gluten free brownies without sugar\" or \"low fat vegan cupcakes.\" You can automatically calculate the nutritional information for any recipe, analyze recipe costs, visualize ingredient lists, find recipes for what's in your fridge, find recipes based on special diets, nutritional requirements, or favorite ingredients, classify recipes into types and cuisines, convert ingredient amounts, or even compute an entire meal plan. With our powerful API, you can create many kinds of food and especially nutrition apps.  Special diets/dietary requirements currently available include: vegan, vegetarian, pescetarian, gluten free, grain free, dairy free, high protein, whole 30, low sodium, low carb, Paleo, ketogenic, FODMAP, and Primal.

API version: 1.1
Contact: mail@spoonacular.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package spoonacular

import (
	"encoding/json"
	"bytes"
	"fmt"
)

// checks if the SearchMenuItems200Response type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &SearchMenuItems200Response{}

// SearchMenuItems200Response 
type SearchMenuItems200Response struct {
	MenuItems []MenuItem `json:"menuItems"`
	TotalMenuItems int32 `json:"totalMenuItems"`
	Type string `json:"type"`
	Offset int32 `json:"offset"`
	Number int32 `json:"number"`
}

type _SearchMenuItems200Response SearchMenuItems200Response

// NewSearchMenuItems200Response instantiates a new SearchMenuItems200Response object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewSearchMenuItems200Response(menuItems []MenuItem, totalMenuItems int32, type_ string, offset int32, number int32) *SearchMenuItems200Response {
	this := SearchMenuItems200Response{}
	this.MenuItems = menuItems
	this.TotalMenuItems = totalMenuItems
	this.Type = type_
	this.Offset = offset
	this.Number = number
	return &this
}

// NewSearchMenuItems200ResponseWithDefaults instantiates a new SearchMenuItems200Response object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewSearchMenuItems200ResponseWithDefaults() *SearchMenuItems200Response {
	this := SearchMenuItems200Response{}
	return &this
}

// GetMenuItems returns the MenuItems field value
func (o *SearchMenuItems200Response) GetMenuItems() []MenuItem {
	if o == nil {
		var ret []MenuItem
		return ret
	}

	return o.MenuItems
}

// GetMenuItemsOk returns a tuple with the MenuItems field value
// and a boolean to check if the value has been set.
func (o *SearchMenuItems200Response) GetMenuItemsOk() ([]MenuItem, bool) {
	if o == nil {
		return nil, false
	}
	return o.MenuItems, true
}

// SetMenuItems sets field value
func (o *SearchMenuItems200Response) SetMenuItems(v []MenuItem) {
	o.MenuItems = v
}

// GetTotalMenuItems returns the TotalMenuItems field value
func (o *SearchMenuItems200Response) GetTotalMenuItems() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.TotalMenuItems
}

// GetTotalMenuItemsOk returns a tuple with the TotalMenuItems field value
// and a boolean to check if the value has been set.
func (o *SearchMenuItems200Response) GetTotalMenuItemsOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.TotalMenuItems, true
}

// SetTotalMenuItems sets field value
func (o *SearchMenuItems200Response) SetTotalMenuItems(v int32) {
	o.TotalMenuItems = v
}

// GetType returns the Type field value
func (o *SearchMenuItems200Response) GetType() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Type
}

// GetTypeOk returns a tuple with the Type field value
// and a boolean to check if the value has been set.
func (o *SearchMenuItems200Response) GetTypeOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Type, true
}

// SetType sets field value
func (o *SearchMenuItems200Response) SetType(v string) {
	o.Type = v
}

// GetOffset returns the Offset field value
func (o *SearchMenuItems200Response) GetOffset() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Offset
}

// GetOffsetOk returns a tuple with the Offset field value
// and a boolean to check if the value has been set.
func (o *SearchMenuItems200Response) GetOffsetOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Offset, true
}

// SetOffset sets field value
func (o *SearchMenuItems200Response) SetOffset(v int32) {
	o.Offset = v
}

// GetNumber returns the Number field value
func (o *SearchMenuItems200Response) GetNumber() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Number
}

// GetNumberOk returns a tuple with the Number field value
// and a boolean to check if the value has been set.
func (o *SearchMenuItems200Response) GetNumberOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Number, true
}

// SetNumber sets field value
func (o *SearchMenuItems200Response) SetNumber(v int32) {
	o.Number = v
}

func (o SearchMenuItems200Response) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o SearchMenuItems200Response) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["menuItems"] = o.MenuItems
	toSerialize["totalMenuItems"] = o.TotalMenuItems
	toSerialize["type"] = o.Type
	toSerialize["offset"] = o.Offset
	toSerialize["number"] = o.Number
	return toSerialize, nil
}

func (o *SearchMenuItems200Response) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"menuItems",
		"totalMenuItems",
		"type",
		"offset",
		"number",
	}

	allProperties := make(map[string]interface{})

	err = json.Unmarshal(data, &allProperties)

	if err != nil {
		return err;
	}

	for _, requiredProperty := range(requiredProperties) {
		if _, exists := allProperties[requiredProperty]; !exists {
			return fmt.Errorf("no value given for required property %v", requiredProperty)
		}
	}

	varSearchMenuItems200Response := _SearchMenuItems200Response{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varSearchMenuItems200Response)

	if err != nil {
		return err
	}

	*o = SearchMenuItems200Response(varSearchMenuItems200Response)

	return err
}

type NullableSearchMenuItems200Response struct {
	value *SearchMenuItems200Response
	isSet bool
}

func (v NullableSearchMenuItems200Response) Get() *SearchMenuItems200Response {
	return v.value
}

func (v *NullableSearchMenuItems200Response) Set(val *SearchMenuItems200Response) {
	v.value = val
	v.isSet = true
}

func (v NullableSearchMenuItems200Response) IsSet() bool {
	return v.isSet
}

func (v *NullableSearchMenuItems200Response) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableSearchMenuItems200Response(val *SearchMenuItems200Response) *NullableSearchMenuItems200Response {
	return &NullableSearchMenuItems200Response{value: val, isSet: true}
}

func (v NullableSearchMenuItems200Response) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableSearchMenuItems200Response) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


