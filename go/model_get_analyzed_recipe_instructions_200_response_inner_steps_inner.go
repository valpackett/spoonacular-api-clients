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

// checks if the GetAnalyzedRecipeInstructions200ResponseInnerStepsInner type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &GetAnalyzedRecipeInstructions200ResponseInnerStepsInner{}

// GetAnalyzedRecipeInstructions200ResponseInnerStepsInner struct for GetAnalyzedRecipeInstructions200ResponseInnerStepsInner
type GetAnalyzedRecipeInstructions200ResponseInnerStepsInner struct {
	Number float32 `json:"number"`
	Step string `json:"step"`
	Ingredients []GetAnalyzedRecipeInstructions200ResponseInnerStepsInnerIngredientsInner `json:"ingredients,omitempty"`
	Equipment []GetAnalyzedRecipeInstructions200ResponseInnerStepsInnerIngredientsInner `json:"equipment,omitempty"`
}

type _GetAnalyzedRecipeInstructions200ResponseInnerStepsInner GetAnalyzedRecipeInstructions200ResponseInnerStepsInner

// NewGetAnalyzedRecipeInstructions200ResponseInnerStepsInner instantiates a new GetAnalyzedRecipeInstructions200ResponseInnerStepsInner object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewGetAnalyzedRecipeInstructions200ResponseInnerStepsInner(number float32, step string) *GetAnalyzedRecipeInstructions200ResponseInnerStepsInner {
	this := GetAnalyzedRecipeInstructions200ResponseInnerStepsInner{}
	this.Number = number
	this.Step = step
	return &this
}

// NewGetAnalyzedRecipeInstructions200ResponseInnerStepsInnerWithDefaults instantiates a new GetAnalyzedRecipeInstructions200ResponseInnerStepsInner object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewGetAnalyzedRecipeInstructions200ResponseInnerStepsInnerWithDefaults() *GetAnalyzedRecipeInstructions200ResponseInnerStepsInner {
	this := GetAnalyzedRecipeInstructions200ResponseInnerStepsInner{}
	return &this
}

// GetNumber returns the Number field value
func (o *GetAnalyzedRecipeInstructions200ResponseInnerStepsInner) GetNumber() float32 {
	if o == nil {
		var ret float32
		return ret
	}

	return o.Number
}

// GetNumberOk returns a tuple with the Number field value
// and a boolean to check if the value has been set.
func (o *GetAnalyzedRecipeInstructions200ResponseInnerStepsInner) GetNumberOk() (*float32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Number, true
}

// SetNumber sets field value
func (o *GetAnalyzedRecipeInstructions200ResponseInnerStepsInner) SetNumber(v float32) {
	o.Number = v
}

// GetStep returns the Step field value
func (o *GetAnalyzedRecipeInstructions200ResponseInnerStepsInner) GetStep() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Step
}

// GetStepOk returns a tuple with the Step field value
// and a boolean to check if the value has been set.
func (o *GetAnalyzedRecipeInstructions200ResponseInnerStepsInner) GetStepOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Step, true
}

// SetStep sets field value
func (o *GetAnalyzedRecipeInstructions200ResponseInnerStepsInner) SetStep(v string) {
	o.Step = v
}

// GetIngredients returns the Ingredients field value if set, zero value otherwise.
func (o *GetAnalyzedRecipeInstructions200ResponseInnerStepsInner) GetIngredients() []GetAnalyzedRecipeInstructions200ResponseInnerStepsInnerIngredientsInner {
	if o == nil || IsNil(o.Ingredients) {
		var ret []GetAnalyzedRecipeInstructions200ResponseInnerStepsInnerIngredientsInner
		return ret
	}
	return o.Ingredients
}

// GetIngredientsOk returns a tuple with the Ingredients field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetAnalyzedRecipeInstructions200ResponseInnerStepsInner) GetIngredientsOk() ([]GetAnalyzedRecipeInstructions200ResponseInnerStepsInnerIngredientsInner, bool) {
	if o == nil || IsNil(o.Ingredients) {
		return nil, false
	}
	return o.Ingredients, true
}

// HasIngredients returns a boolean if a field has been set.
func (o *GetAnalyzedRecipeInstructions200ResponseInnerStepsInner) HasIngredients() bool {
	if o != nil && !IsNil(o.Ingredients) {
		return true
	}

	return false
}

// SetIngredients gets a reference to the given []GetAnalyzedRecipeInstructions200ResponseInnerStepsInnerIngredientsInner and assigns it to the Ingredients field.
func (o *GetAnalyzedRecipeInstructions200ResponseInnerStepsInner) SetIngredients(v []GetAnalyzedRecipeInstructions200ResponseInnerStepsInnerIngredientsInner) {
	o.Ingredients = v
}

// GetEquipment returns the Equipment field value if set, zero value otherwise.
func (o *GetAnalyzedRecipeInstructions200ResponseInnerStepsInner) GetEquipment() []GetAnalyzedRecipeInstructions200ResponseInnerStepsInnerIngredientsInner {
	if o == nil || IsNil(o.Equipment) {
		var ret []GetAnalyzedRecipeInstructions200ResponseInnerStepsInnerIngredientsInner
		return ret
	}
	return o.Equipment
}

// GetEquipmentOk returns a tuple with the Equipment field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetAnalyzedRecipeInstructions200ResponseInnerStepsInner) GetEquipmentOk() ([]GetAnalyzedRecipeInstructions200ResponseInnerStepsInnerIngredientsInner, bool) {
	if o == nil || IsNil(o.Equipment) {
		return nil, false
	}
	return o.Equipment, true
}

// HasEquipment returns a boolean if a field has been set.
func (o *GetAnalyzedRecipeInstructions200ResponseInnerStepsInner) HasEquipment() bool {
	if o != nil && !IsNil(o.Equipment) {
		return true
	}

	return false
}

// SetEquipment gets a reference to the given []GetAnalyzedRecipeInstructions200ResponseInnerStepsInnerIngredientsInner and assigns it to the Equipment field.
func (o *GetAnalyzedRecipeInstructions200ResponseInnerStepsInner) SetEquipment(v []GetAnalyzedRecipeInstructions200ResponseInnerStepsInnerIngredientsInner) {
	o.Equipment = v
}

func (o GetAnalyzedRecipeInstructions200ResponseInnerStepsInner) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o GetAnalyzedRecipeInstructions200ResponseInnerStepsInner) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["number"] = o.Number
	toSerialize["step"] = o.Step
	if !IsNil(o.Ingredients) {
		toSerialize["ingredients"] = o.Ingredients
	}
	if !IsNil(o.Equipment) {
		toSerialize["equipment"] = o.Equipment
	}
	return toSerialize, nil
}

func (o *GetAnalyzedRecipeInstructions200ResponseInnerStepsInner) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"number",
		"step",
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

	varGetAnalyzedRecipeInstructions200ResponseInnerStepsInner := _GetAnalyzedRecipeInstructions200ResponseInnerStepsInner{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varGetAnalyzedRecipeInstructions200ResponseInnerStepsInner)

	if err != nil {
		return err
	}

	*o = GetAnalyzedRecipeInstructions200ResponseInnerStepsInner(varGetAnalyzedRecipeInstructions200ResponseInnerStepsInner)

	return err
}

type NullableGetAnalyzedRecipeInstructions200ResponseInnerStepsInner struct {
	value *GetAnalyzedRecipeInstructions200ResponseInnerStepsInner
	isSet bool
}

func (v NullableGetAnalyzedRecipeInstructions200ResponseInnerStepsInner) Get() *GetAnalyzedRecipeInstructions200ResponseInnerStepsInner {
	return v.value
}

func (v *NullableGetAnalyzedRecipeInstructions200ResponseInnerStepsInner) Set(val *GetAnalyzedRecipeInstructions200ResponseInnerStepsInner) {
	v.value = val
	v.isSet = true
}

func (v NullableGetAnalyzedRecipeInstructions200ResponseInnerStepsInner) IsSet() bool {
	return v.isSet
}

func (v *NullableGetAnalyzedRecipeInstructions200ResponseInnerStepsInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableGetAnalyzedRecipeInstructions200ResponseInnerStepsInner(val *GetAnalyzedRecipeInstructions200ResponseInnerStepsInner) *NullableGetAnalyzedRecipeInstructions200ResponseInnerStepsInner {
	return &NullableGetAnalyzedRecipeInstructions200ResponseInnerStepsInner{value: val, isSet: true}
}

func (v NullableGetAnalyzedRecipeInstructions200ResponseInnerStepsInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableGetAnalyzedRecipeInstructions200ResponseInnerStepsInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

