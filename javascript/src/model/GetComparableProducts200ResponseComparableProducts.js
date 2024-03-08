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
import GetComparableProducts200ResponseComparableProductsProteinInner from './GetComparableProducts200ResponseComparableProductsProteinInner';

/**
 * The GetComparableProducts200ResponseComparableProducts model module.
 * @module model/GetComparableProducts200ResponseComparableProducts
 * @version 1.1
 */
class GetComparableProducts200ResponseComparableProducts {
    /**
     * Constructs a new <code>GetComparableProducts200ResponseComparableProducts</code>.
     * @alias module:model/GetComparableProducts200ResponseComparableProducts
     * @param calories {Array.<Object>} 
     * @param likes {Array.<Object>} 
     * @param price {Array.<Object>} 
     * @param protein {Array.<module:model/GetComparableProducts200ResponseComparableProductsProteinInner>} 
     * @param spoonacularScore {Array.<module:model/GetComparableProducts200ResponseComparableProductsProteinInner>} 
     * @param sugar {Array.<Object>} 
     */
    constructor(calories, likes, price, protein, spoonacularScore, sugar) { 
        
        GetComparableProducts200ResponseComparableProducts.initialize(this, calories, likes, price, protein, spoonacularScore, sugar);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, calories, likes, price, protein, spoonacularScore, sugar) { 
        obj['calories'] = calories;
        obj['likes'] = likes;
        obj['price'] = price;
        obj['protein'] = protein;
        obj['spoonacularScore'] = spoonacularScore;
        obj['sugar'] = sugar;
    }

    /**
     * Constructs a <code>GetComparableProducts200ResponseComparableProducts</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/GetComparableProducts200ResponseComparableProducts} obj Optional instance to populate.
     * @return {module:model/GetComparableProducts200ResponseComparableProducts} The populated <code>GetComparableProducts200ResponseComparableProducts</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new GetComparableProducts200ResponseComparableProducts();

            if (data.hasOwnProperty('calories')) {
                obj['calories'] = ApiClient.convertToType(data['calories'], [Object]);
            }
            if (data.hasOwnProperty('likes')) {
                obj['likes'] = ApiClient.convertToType(data['likes'], [Object]);
            }
            if (data.hasOwnProperty('price')) {
                obj['price'] = ApiClient.convertToType(data['price'], [Object]);
            }
            if (data.hasOwnProperty('protein')) {
                obj['protein'] = ApiClient.convertToType(data['protein'], [GetComparableProducts200ResponseComparableProductsProteinInner]);
            }
            if (data.hasOwnProperty('spoonacularScore')) {
                obj['spoonacularScore'] = ApiClient.convertToType(data['spoonacularScore'], [GetComparableProducts200ResponseComparableProductsProteinInner]);
            }
            if (data.hasOwnProperty('sugar')) {
                obj['sugar'] = ApiClient.convertToType(data['sugar'], [Object]);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>GetComparableProducts200ResponseComparableProducts</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>GetComparableProducts200ResponseComparableProducts</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of GetComparableProducts200ResponseComparableProducts.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // ensure the json data is an array
        if (!Array.isArray(data['calories'])) {
            throw new Error("Expected the field `calories` to be an array in the JSON data but got " + data['calories']);
        }
        // ensure the json data is an array
        if (!Array.isArray(data['likes'])) {
            throw new Error("Expected the field `likes` to be an array in the JSON data but got " + data['likes']);
        }
        // ensure the json data is an array
        if (!Array.isArray(data['price'])) {
            throw new Error("Expected the field `price` to be an array in the JSON data but got " + data['price']);
        }
        if (data['protein']) { // data not null
            // ensure the json data is an array
            if (!Array.isArray(data['protein'])) {
                throw new Error("Expected the field `protein` to be an array in the JSON data but got " + data['protein']);
            }
            // validate the optional field `protein` (array)
            for (const item of data['protein']) {
                GetComparableProducts200ResponseComparableProductsProteinInner.validateJSON(item);
            };
        }
        if (data['spoonacularScore']) { // data not null
            // ensure the json data is an array
            if (!Array.isArray(data['spoonacularScore'])) {
                throw new Error("Expected the field `spoonacularScore` to be an array in the JSON data but got " + data['spoonacularScore']);
            }
            // validate the optional field `spoonacularScore` (array)
            for (const item of data['spoonacularScore']) {
                GetComparableProducts200ResponseComparableProductsProteinInner.validateJSON(item);
            };
        }
        // ensure the json data is an array
        if (!Array.isArray(data['sugar'])) {
            throw new Error("Expected the field `sugar` to be an array in the JSON data but got " + data['sugar']);
        }

        return true;
    }


}

GetComparableProducts200ResponseComparableProducts.RequiredProperties = ["calories", "likes", "price", "protein", "spoonacularScore", "sugar"];

/**
 * @member {Array.<Object>} calories
 */
GetComparableProducts200ResponseComparableProducts.prototype['calories'] = undefined;

/**
 * @member {Array.<Object>} likes
 */
GetComparableProducts200ResponseComparableProducts.prototype['likes'] = undefined;

/**
 * @member {Array.<Object>} price
 */
GetComparableProducts200ResponseComparableProducts.prototype['price'] = undefined;

/**
 * @member {Array.<module:model/GetComparableProducts200ResponseComparableProductsProteinInner>} protein
 */
GetComparableProducts200ResponseComparableProducts.prototype['protein'] = undefined;

/**
 * @member {Array.<module:model/GetComparableProducts200ResponseComparableProductsProteinInner>} spoonacularScore
 */
GetComparableProducts200ResponseComparableProducts.prototype['spoonacularScore'] = undefined;

/**
 * @member {Array.<Object>} sugar
 */
GetComparableProducts200ResponseComparableProducts.prototype['sugar'] = undefined;






export default GetComparableProducts200ResponseComparableProducts;
