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

// checks if the GetShoppingList200ResponseAislesInnerItemsInnerMeasuresOriginal type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &GetShoppingList200ResponseAislesInnerItemsInnerMeasuresOriginal{}

// GetShoppingList200ResponseAislesInnerItemsInnerMeasuresOriginal struct for GetShoppingList200ResponseAislesInnerItemsInnerMeasuresOriginal
type GetShoppingList200ResponseAislesInnerItemsInnerMeasuresOriginal struct {
	Amount float32 `json:"amount"`
	Unit string `json:"unit"`
}

type _GetShoppingList200ResponseAislesInnerItemsInnerMeasuresOriginal GetShoppingList200ResponseAislesInnerItemsInnerMeasuresOriginal

// NewGetShoppingList200ResponseAislesInnerItemsInnerMeasuresOriginal instantiates a new GetShoppingList200ResponseAislesInnerItemsInnerMeasuresOriginal object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewGetShoppingList200ResponseAislesInnerItemsInnerMeasuresOriginal(amount float32, unit string) *GetShoppingList200ResponseAislesInnerItemsInnerMeasuresOriginal {
	this := GetShoppingList200ResponseAislesInnerItemsInnerMeasuresOriginal{}
	this.Amount = amount
	this.Unit = unit
	return &this
}

// NewGetShoppingList200ResponseAislesInnerItemsInnerMeasuresOriginalWithDefaults instantiates a new GetShoppingList200ResponseAislesInnerItemsInnerMeasuresOriginal object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewGetShoppingList200ResponseAislesInnerItemsInnerMeasuresOriginalWithDefaults() *GetShoppingList200ResponseAislesInnerItemsInnerMeasuresOriginal {
	this := GetShoppingList200ResponseAislesInnerItemsInnerMeasuresOriginal{}
	return &this
}

// GetAmount returns the Amount field value
func (o *GetShoppingList200ResponseAislesInnerItemsInnerMeasuresOriginal) GetAmount() float32 {
	if o == nil {
		var ret float32
		return ret
	}

	return o.Amount
}

// GetAmountOk returns a tuple with the Amount field value
// and a boolean to check if the value has been set.
func (o *GetShoppingList200ResponseAislesInnerItemsInnerMeasuresOriginal) GetAmountOk() (*float32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Amount, true
}

// SetAmount sets field value
func (o *GetShoppingList200ResponseAislesInnerItemsInnerMeasuresOriginal) SetAmount(v float32) {
	o.Amount = v
}

// GetUnit returns the Unit field value
func (o *GetShoppingList200ResponseAislesInnerItemsInnerMeasuresOriginal) GetUnit() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Unit
}

// GetUnitOk returns a tuple with the Unit field value
// and a boolean to check if the value has been set.
func (o *GetShoppingList200ResponseAislesInnerItemsInnerMeasuresOriginal) GetUnitOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Unit, true
}

// SetUnit sets field value
func (o *GetShoppingList200ResponseAislesInnerItemsInnerMeasuresOriginal) SetUnit(v string) {
	o.Unit = v
}

func (o GetShoppingList200ResponseAislesInnerItemsInnerMeasuresOriginal) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o GetShoppingList200ResponseAislesInnerItemsInnerMeasuresOriginal) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["amount"] = o.Amount
	toSerialize["unit"] = o.Unit
	return toSerialize, nil
}

func (o *GetShoppingList200ResponseAislesInnerItemsInnerMeasuresOriginal) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"amount",
		"unit",
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

	varGetShoppingList200ResponseAislesInnerItemsInnerMeasuresOriginal := _GetShoppingList200ResponseAislesInnerItemsInnerMeasuresOriginal{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varGetShoppingList200ResponseAislesInnerItemsInnerMeasuresOriginal)

	if err != nil {
		return err
	}

	*o = GetShoppingList200ResponseAislesInnerItemsInnerMeasuresOriginal(varGetShoppingList200ResponseAislesInnerItemsInnerMeasuresOriginal)

	return err
}

type NullableGetShoppingList200ResponseAislesInnerItemsInnerMeasuresOriginal struct {
	value *GetShoppingList200ResponseAislesInnerItemsInnerMeasuresOriginal
	isSet bool
}

func (v NullableGetShoppingList200ResponseAislesInnerItemsInnerMeasuresOriginal) Get() *GetShoppingList200ResponseAislesInnerItemsInnerMeasuresOriginal {
	return v.value
}

func (v *NullableGetShoppingList200ResponseAislesInnerItemsInnerMeasuresOriginal) Set(val *GetShoppingList200ResponseAislesInnerItemsInnerMeasuresOriginal) {
	v.value = val
	v.isSet = true
}

func (v NullableGetShoppingList200ResponseAislesInnerItemsInnerMeasuresOriginal) IsSet() bool {
	return v.isSet
}

func (v *NullableGetShoppingList200ResponseAislesInnerItemsInnerMeasuresOriginal) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableGetShoppingList200ResponseAislesInnerItemsInnerMeasuresOriginal(val *GetShoppingList200ResponseAislesInnerItemsInnerMeasuresOriginal) *NullableGetShoppingList200ResponseAislesInnerItemsInnerMeasuresOriginal {
	return &NullableGetShoppingList200ResponseAislesInnerItemsInnerMeasuresOriginal{value: val, isSet: true}
}

func (v NullableGetShoppingList200ResponseAislesInnerItemsInnerMeasuresOriginal) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableGetShoppingList200ResponseAislesInnerItemsInnerMeasuresOriginal) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


