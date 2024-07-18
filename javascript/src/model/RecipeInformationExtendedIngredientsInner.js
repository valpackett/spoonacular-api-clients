/**
 * spoonacular API
 * The spoonacular Nutrition, Recipe, and Food API allows you to access over thousands of recipes, thousands of ingredients, 800,000 food products, over 100,000 menu items, and restaurants. Our food ontology and semantic recipe search engine makes it possible to search for recipes using natural language queries, such as \"gluten free brownies without sugar\" or \"low fat vegan cupcakes.\" You can automatically calculate the nutritional information for any recipe, analyze recipe costs, visualize ingredient lists, find recipes for what's in your fridge, find recipes based on special diets, nutritional requirements, or favorite ingredients, classify recipes into types and cuisines, convert ingredient amounts, or even compute an entire meal plan. With our powerful API, you can create many kinds of food and especially nutrition apps.  Special diets/dietary requirements currently available include: vegan, vegetarian, pescetarian, gluten free, grain free, dairy free, high protein, whole 30, low sodium, low carb, Paleo, ketogenic, FODMAP, and Primal.
 *
 * The version of the OpenAPI document: 1.1
 * Contact: mail@spoonacular.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import RecipeInformationExtendedIngredientsInnerMeasures from './RecipeInformationExtendedIngredientsInnerMeasures';

/**
 * The RecipeInformationExtendedIngredientsInner model module.
 * @module model/RecipeInformationExtendedIngredientsInner
 * @version 1.1
 */
class RecipeInformationExtendedIngredientsInner {
    /**
     * Constructs a new <code>RecipeInformationExtendedIngredientsInner</code>.
     * @alias module:model/RecipeInformationExtendedIngredientsInner
     * @param aisle {String} 
     * @param amount {Number} 
     * @param consistency {String} 
     * @param id {Number} 
     * @param image {String} 
     * @param name {String} 
     * @param original {String} 
     * @param originalName {String} 
     * @param unit {String} 
     */
    constructor(aisle, amount, consistency, id, image, name, original, originalName, unit) { 
        
        RecipeInformationExtendedIngredientsInner.initialize(this, aisle, amount, consistency, id, image, name, original, originalName, unit);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, aisle, amount, consistency, id, image, name, original, originalName, unit) { 
        obj['aisle'] = aisle;
        obj['amount'] = amount;
        obj['consistency'] = consistency;
        obj['id'] = id;
        obj['image'] = image;
        obj['name'] = name;
        obj['original'] = original;
        obj['originalName'] = originalName;
        obj['unit'] = unit;
    }

    /**
     * Constructs a <code>RecipeInformationExtendedIngredientsInner</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/RecipeInformationExtendedIngredientsInner} obj Optional instance to populate.
     * @return {module:model/RecipeInformationExtendedIngredientsInner} The populated <code>RecipeInformationExtendedIngredientsInner</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new RecipeInformationExtendedIngredientsInner();

            if (data.hasOwnProperty('aisle')) {
                obj['aisle'] = ApiClient.convertToType(data['aisle'], 'String');
            }
            if (data.hasOwnProperty('amount')) {
                obj['amount'] = ApiClient.convertToType(data['amount'], 'Number');
            }
            if (data.hasOwnProperty('consistency')) {
                obj['consistency'] = ApiClient.convertToType(data['consistency'], 'String');
            }
            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'Number');
            }
            if (data.hasOwnProperty('image')) {
                obj['image'] = ApiClient.convertToType(data['image'], 'String');
            }
            if (data.hasOwnProperty('measures')) {
                obj['measures'] = RecipeInformationExtendedIngredientsInnerMeasures.constructFromObject(data['measures']);
            }
            if (data.hasOwnProperty('meta')) {
                obj['meta'] = ApiClient.convertToType(data['meta'], ['String']);
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('original')) {
                obj['original'] = ApiClient.convertToType(data['original'], 'String');
            }
            if (data.hasOwnProperty('originalName')) {
                obj['originalName'] = ApiClient.convertToType(data['originalName'], 'String');
            }
            if (data.hasOwnProperty('unit')) {
                obj['unit'] = ApiClient.convertToType(data['unit'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>RecipeInformationExtendedIngredientsInner</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>RecipeInformationExtendedIngredientsInner</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of RecipeInformationExtendedIngredientsInner.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // ensure the json data is a string
        if (data['aisle'] && !(typeof data['aisle'] === 'string' || data['aisle'] instanceof String)) {
            throw new Error("Expected the field `aisle` to be a primitive type in the JSON string but got " + data['aisle']);
        }
        // ensure the json data is a string
        if (data['consistency'] && !(typeof data['consistency'] === 'string' || data['consistency'] instanceof String)) {
            throw new Error("Expected the field `consistency` to be a primitive type in the JSON string but got " + data['consistency']);
        }
        // ensure the json data is a string
        if (data['image'] && !(typeof data['image'] === 'string' || data['image'] instanceof String)) {
            throw new Error("Expected the field `image` to be a primitive type in the JSON string but got " + data['image']);
        }
        // validate the optional field `measures`
        if (data['measures']) { // data not null
          RecipeInformationExtendedIngredientsInnerMeasures.validateJSON(data['measures']);
        }
        // ensure the json data is an array
        if (!Array.isArray(data['meta'])) {
            throw new Error("Expected the field `meta` to be an array in the JSON data but got " + data['meta']);
        }
        // ensure the json data is a string
        if (data['name'] && !(typeof data['name'] === 'string' || data['name'] instanceof String)) {
            throw new Error("Expected the field `name` to be a primitive type in the JSON string but got " + data['name']);
        }
        // ensure the json data is a string
        if (data['original'] && !(typeof data['original'] === 'string' || data['original'] instanceof String)) {
            throw new Error("Expected the field `original` to be a primitive type in the JSON string but got " + data['original']);
        }
        // ensure the json data is a string
        if (data['originalName'] && !(typeof data['originalName'] === 'string' || data['originalName'] instanceof String)) {
            throw new Error("Expected the field `originalName` to be a primitive type in the JSON string but got " + data['originalName']);
        }
        // ensure the json data is a string
        if (data['unit'] && !(typeof data['unit'] === 'string' || data['unit'] instanceof String)) {
            throw new Error("Expected the field `unit` to be a primitive type in the JSON string but got " + data['unit']);
        }

        return true;
    }


}

RecipeInformationExtendedIngredientsInner.RequiredProperties = ["aisle", "amount", "consistency", "id", "image", "name", "original", "originalName", "unit"];

/**
 * @member {String} aisle
 */
RecipeInformationExtendedIngredientsInner.prototype['aisle'] = undefined;

/**
 * @member {Number} amount
 */
RecipeInformationExtendedIngredientsInner.prototype['amount'] = undefined;

/**
 * @member {String} consistency
 */
RecipeInformationExtendedIngredientsInner.prototype['consistency'] = undefined;

/**
 * @member {Number} id
 */
RecipeInformationExtendedIngredientsInner.prototype['id'] = undefined;

/**
 * @member {String} image
 */
RecipeInformationExtendedIngredientsInner.prototype['image'] = undefined;

/**
 * @member {module:model/RecipeInformationExtendedIngredientsInnerMeasures} measures
 */
RecipeInformationExtendedIngredientsInner.prototype['measures'] = undefined;

/**
 * @member {Array.<String>} meta
 */
RecipeInformationExtendedIngredientsInner.prototype['meta'] = undefined;

/**
 * @member {String} name
 */
RecipeInformationExtendedIngredientsInner.prototype['name'] = undefined;

/**
 * @member {String} original
 */
RecipeInformationExtendedIngredientsInner.prototype['original'] = undefined;

/**
 * @member {String} originalName
 */
RecipeInformationExtendedIngredientsInner.prototype['originalName'] = undefined;

/**
 * @member {String} unit
 */
RecipeInformationExtendedIngredientsInner.prototype['unit'] = undefined;






export default RecipeInformationExtendedIngredientsInner;

