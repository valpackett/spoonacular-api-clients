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

// checks if the GetRecipeNutritionWidgetByID200ResponseBadInner type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &GetRecipeNutritionWidgetByID200ResponseBadInner{}

// GetRecipeNutritionWidgetByID200ResponseBadInner struct for GetRecipeNutritionWidgetByID200ResponseBadInner
type GetRecipeNutritionWidgetByID200ResponseBadInner struct {
	Title string `json:"title"`
	Amount string `json:"amount"`
	Indented bool `json:"indented"`
	PercentOfDailyNeeds float32 `json:"percentOfDailyNeeds"`
}

type _GetRecipeNutritionWidgetByID200ResponseBadInner GetRecipeNutritionWidgetByID200ResponseBadInner

// NewGetRecipeNutritionWidgetByID200ResponseBadInner instantiates a new GetRecipeNutritionWidgetByID200ResponseBadInner object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewGetRecipeNutritionWidgetByID200ResponseBadInner(title string, amount string, indented bool, percentOfDailyNeeds float32) *GetRecipeNutritionWidgetByID200ResponseBadInner {
	this := GetRecipeNutritionWidgetByID200ResponseBadInner{}
	this.Title = title
	this.Amount = amount
	this.Indented = indented
	this.PercentOfDailyNeeds = percentOfDailyNeeds
	return &this
}

// NewGetRecipeNutritionWidgetByID200ResponseBadInnerWithDefaults instantiates a new GetRecipeNutritionWidgetByID200ResponseBadInner object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewGetRecipeNutritionWidgetByID200ResponseBadInnerWithDefaults() *GetRecipeNutritionWidgetByID200ResponseBadInner {
	this := GetRecipeNutritionWidgetByID200ResponseBadInner{}
	return &this
}

// GetTitle returns the Title field value
func (o *GetRecipeNutritionWidgetByID200ResponseBadInner) GetTitle() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Title
}

// GetTitleOk returns a tuple with the Title field value
// and a boolean to check if the value has been set.
func (o *GetRecipeNutritionWidgetByID200ResponseBadInner) GetTitleOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Title, true
}

// SetTitle sets field value
func (o *GetRecipeNutritionWidgetByID200ResponseBadInner) SetTitle(v string) {
	o.Title = v
}

// GetAmount returns the Amount field value
func (o *GetRecipeNutritionWidgetByID200ResponseBadInner) GetAmount() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Amount
}

// GetAmountOk returns a tuple with the Amount field value
// and a boolean to check if the value has been set.
func (o *GetRecipeNutritionWidgetByID200ResponseBadInner) GetAmountOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Amount, true
}

// SetAmount sets field value
func (o *GetRecipeNutritionWidgetByID200ResponseBadInner) SetAmount(v string) {
	o.Amount = v
}

// GetIndented returns the Indented field value
func (o *GetRecipeNutritionWidgetByID200ResponseBadInner) GetIndented() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.Indented
}

// GetIndentedOk returns a tuple with the Indented field value
// and a boolean to check if the value has been set.
func (o *GetRecipeNutritionWidgetByID200ResponseBadInner) GetIndentedOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Indented, true
}

// SetIndented sets field value
func (o *GetRecipeNutritionWidgetByID200ResponseBadInner) SetIndented(v bool) {
	o.Indented = v
}

// GetPercentOfDailyNeeds returns the PercentOfDailyNeeds field value
func (o *GetRecipeNutritionWidgetByID200ResponseBadInner) GetPercentOfDailyNeeds() float32 {
	if o == nil {
		var ret float32
		return ret
	}

	return o.PercentOfDailyNeeds
}

// GetPercentOfDailyNeedsOk returns a tuple with the PercentOfDailyNeeds field value
// and a boolean to check if the value has been set.
func (o *GetRecipeNutritionWidgetByID200ResponseBadInner) GetPercentOfDailyNeedsOk() (*float32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.PercentOfDailyNeeds, true
}

// SetPercentOfDailyNeeds sets field value
func (o *GetRecipeNutritionWidgetByID200ResponseBadInner) SetPercentOfDailyNeeds(v float32) {
	o.PercentOfDailyNeeds = v
}

func (o GetRecipeNutritionWidgetByID200ResponseBadInner) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o GetRecipeNutritionWidgetByID200ResponseBadInner) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["title"] = o.Title
	toSerialize["amount"] = o.Amount
	toSerialize["indented"] = o.Indented
	toSerialize["percentOfDailyNeeds"] = o.PercentOfDailyNeeds
	return toSerialize, nil
}

func (o *GetRecipeNutritionWidgetByID200ResponseBadInner) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"title",
		"amount",
		"indented",
		"percentOfDailyNeeds",
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

	varGetRecipeNutritionWidgetByID200ResponseBadInner := _GetRecipeNutritionWidgetByID200ResponseBadInner{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varGetRecipeNutritionWidgetByID200ResponseBadInner)

	if err != nil {
		return err
	}

	*o = GetRecipeNutritionWidgetByID200ResponseBadInner(varGetRecipeNutritionWidgetByID200ResponseBadInner)

	return err
}

type NullableGetRecipeNutritionWidgetByID200ResponseBadInner struct {
	value *GetRecipeNutritionWidgetByID200ResponseBadInner
	isSet bool
}

func (v NullableGetRecipeNutritionWidgetByID200ResponseBadInner) Get() *GetRecipeNutritionWidgetByID200ResponseBadInner {
	return v.value
}

func (v *NullableGetRecipeNutritionWidgetByID200ResponseBadInner) Set(val *GetRecipeNutritionWidgetByID200ResponseBadInner) {
	v.value = val
	v.isSet = true
}

func (v NullableGetRecipeNutritionWidgetByID200ResponseBadInner) IsSet() bool {
	return v.isSet
}

func (v *NullableGetRecipeNutritionWidgetByID200ResponseBadInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableGetRecipeNutritionWidgetByID200ResponseBadInner(val *GetRecipeNutritionWidgetByID200ResponseBadInner) *NullableGetRecipeNutritionWidgetByID200ResponseBadInner {
	return &NullableGetRecipeNutritionWidgetByID200ResponseBadInner{value: val, isSet: true}
}

func (v NullableGetRecipeNutritionWidgetByID200ResponseBadInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableGetRecipeNutritionWidgetByID200ResponseBadInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


