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
import SearchSiteContent200ResponseArticlesInner from './SearchSiteContent200ResponseArticlesInner';

/**
 * The SearchSiteContent200Response model module.
 * @module model/SearchSiteContent200Response
 * @version 1.1
 */
class SearchSiteContent200Response {
    /**
     * Constructs a new <code>SearchSiteContent200Response</code>.
     * 
     * @alias module:model/SearchSiteContent200Response
     * @param articles {Array.<module:model/SearchSiteContent200ResponseArticlesInner>} 
     * @param groceryProducts {Array.<module:model/SearchSiteContent200ResponseArticlesInner>} 
     * @param menuItems {Array.<module:model/SearchSiteContent200ResponseArticlesInner>} 
     * @param recipes {Array.<module:model/SearchSiteContent200ResponseArticlesInner>} 
     */
    constructor(articles, groceryProducts, menuItems, recipes) { 
        
        SearchSiteContent200Response.initialize(this, articles, groceryProducts, menuItems, recipes);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, articles, groceryProducts, menuItems, recipes) { 
        obj['Articles'] = articles;
        obj['Grocery Products'] = groceryProducts;
        obj['Menu Items'] = menuItems;
        obj['Recipes'] = recipes;
    }

    /**
     * Constructs a <code>SearchSiteContent200Response</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/SearchSiteContent200Response} obj Optional instance to populate.
     * @return {module:model/SearchSiteContent200Response} The populated <code>SearchSiteContent200Response</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SearchSiteContent200Response();

            if (data.hasOwnProperty('Articles')) {
                obj['Articles'] = ApiClient.convertToType(data['Articles'], [SearchSiteContent200ResponseArticlesInner]);
            }
            if (data.hasOwnProperty('Grocery Products')) {
                obj['Grocery Products'] = ApiClient.convertToType(data['Grocery Products'], [SearchSiteContent200ResponseArticlesInner]);
            }
            if (data.hasOwnProperty('Menu Items')) {
                obj['Menu Items'] = ApiClient.convertToType(data['Menu Items'], [SearchSiteContent200ResponseArticlesInner]);
            }
            if (data.hasOwnProperty('Recipes')) {
                obj['Recipes'] = ApiClient.convertToType(data['Recipes'], [SearchSiteContent200ResponseArticlesInner]);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>SearchSiteContent200Response</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>SearchSiteContent200Response</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of SearchSiteContent200Response.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        if (data['Articles']) { // data not null
            // ensure the json data is an array
            if (!Array.isArray(data['Articles'])) {
                throw new Error("Expected the field `Articles` to be an array in the JSON data but got " + data['Articles']);
            }
            // validate the optional field `Articles` (array)
            for (const item of data['Articles']) {
                SearchSiteContent200ResponseArticlesInner.validateJSON(item);
            };
        }
        if (data['Grocery Products']) { // data not null
            // ensure the json data is an array
            if (!Array.isArray(data['Grocery Products'])) {
                throw new Error("Expected the field `Grocery Products` to be an array in the JSON data but got " + data['Grocery Products']);
            }
            // validate the optional field `Grocery Products` (array)
            for (const item of data['Grocery Products']) {
                SearchSiteContent200ResponseArticlesInner.validateJSON(item);
            };
        }
        if (data['Menu Items']) { // data not null
            // ensure the json data is an array
            if (!Array.isArray(data['Menu Items'])) {
                throw new Error("Expected the field `Menu Items` to be an array in the JSON data but got " + data['Menu Items']);
            }
            // validate the optional field `Menu Items` (array)
            for (const item of data['Menu Items']) {
                SearchSiteContent200ResponseArticlesInner.validateJSON(item);
            };
        }
        if (data['Recipes']) { // data not null
            // ensure the json data is an array
            if (!Array.isArray(data['Recipes'])) {
                throw new Error("Expected the field `Recipes` to be an array in the JSON data but got " + data['Recipes']);
            }
            // validate the optional field `Recipes` (array)
            for (const item of data['Recipes']) {
                SearchSiteContent200ResponseArticlesInner.validateJSON(item);
            };
        }

        return true;
    }


}

SearchSiteContent200Response.RequiredProperties = ["Articles", "Grocery Products", "Menu Items", "Recipes"];

/**
 * @member {Array.<module:model/SearchSiteContent200ResponseArticlesInner>} Articles
 */
SearchSiteContent200Response.prototype['Articles'] = undefined;

/**
 * @member {Array.<module:model/SearchSiteContent200ResponseArticlesInner>} Grocery Products
 */
SearchSiteContent200Response.prototype['Grocery Products'] = undefined;

/**
 * @member {Array.<module:model/SearchSiteContent200ResponseArticlesInner>} Menu Items
 */
SearchSiteContent200Response.prototype['Menu Items'] = undefined;

/**
 * @member {Array.<module:model/SearchSiteContent200ResponseArticlesInner>} Recipes
 */
SearchSiteContent200Response.prototype['Recipes'] = undefined;






export default SearchSiteContent200Response;

