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

/**
 * The GetRecipeInformation200ResponseWinePairingProductMatchesInner model module.
 * @module model/GetRecipeInformation200ResponseWinePairingProductMatchesInner
 * @version 1.1
 */
class GetRecipeInformation200ResponseWinePairingProductMatchesInner {
    /**
     * Constructs a new <code>GetRecipeInformation200ResponseWinePairingProductMatchesInner</code>.
     * @alias module:model/GetRecipeInformation200ResponseWinePairingProductMatchesInner
     * @param id {Number} 
     * @param title {String} 
     * @param description {String} 
     * @param price {String} 
     * @param imageUrl {String} 
     * @param averageRating {Number} 
     * @param ratingCount {Number} 
     * @param score {Number} 
     * @param link {String} 
     */
    constructor(id, title, description, price, imageUrl, averageRating, ratingCount, score, link) { 
        
        GetRecipeInformation200ResponseWinePairingProductMatchesInner.initialize(this, id, title, description, price, imageUrl, averageRating, ratingCount, score, link);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, id, title, description, price, imageUrl, averageRating, ratingCount, score, link) { 
        obj['id'] = id;
        obj['title'] = title;
        obj['description'] = description;
        obj['price'] = price;
        obj['imageUrl'] = imageUrl;
        obj['averageRating'] = averageRating;
        obj['ratingCount'] = ratingCount;
        obj['score'] = score;
        obj['link'] = link;
    }

    /**
     * Constructs a <code>GetRecipeInformation200ResponseWinePairingProductMatchesInner</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/GetRecipeInformation200ResponseWinePairingProductMatchesInner} obj Optional instance to populate.
     * @return {module:model/GetRecipeInformation200ResponseWinePairingProductMatchesInner} The populated <code>GetRecipeInformation200ResponseWinePairingProductMatchesInner</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new GetRecipeInformation200ResponseWinePairingProductMatchesInner();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'Number');
            }
            if (data.hasOwnProperty('title')) {
                obj['title'] = ApiClient.convertToType(data['title'], 'String');
            }
            if (data.hasOwnProperty('description')) {
                obj['description'] = ApiClient.convertToType(data['description'], 'String');
            }
            if (data.hasOwnProperty('price')) {
                obj['price'] = ApiClient.convertToType(data['price'], 'String');
            }
            if (data.hasOwnProperty('imageUrl')) {
                obj['imageUrl'] = ApiClient.convertToType(data['imageUrl'], 'String');
            }
            if (data.hasOwnProperty('averageRating')) {
                obj['averageRating'] = ApiClient.convertToType(data['averageRating'], 'Number');
            }
            if (data.hasOwnProperty('ratingCount')) {
                obj['ratingCount'] = ApiClient.convertToType(data['ratingCount'], 'Number');
            }
            if (data.hasOwnProperty('score')) {
                obj['score'] = ApiClient.convertToType(data['score'], 'Number');
            }
            if (data.hasOwnProperty('link')) {
                obj['link'] = ApiClient.convertToType(data['link'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>GetRecipeInformation200ResponseWinePairingProductMatchesInner</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>GetRecipeInformation200ResponseWinePairingProductMatchesInner</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of GetRecipeInformation200ResponseWinePairingProductMatchesInner.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // ensure the json data is a string
        if (data['title'] && !(typeof data['title'] === 'string' || data['title'] instanceof String)) {
            throw new Error("Expected the field `title` to be a primitive type in the JSON string but got " + data['title']);
        }
        // ensure the json data is a string
        if (data['description'] && !(typeof data['description'] === 'string' || data['description'] instanceof String)) {
            throw new Error("Expected the field `description` to be a primitive type in the JSON string but got " + data['description']);
        }
        // ensure the json data is a string
        if (data['price'] && !(typeof data['price'] === 'string' || data['price'] instanceof String)) {
            throw new Error("Expected the field `price` to be a primitive type in the JSON string but got " + data['price']);
        }
        // ensure the json data is a string
        if (data['imageUrl'] && !(typeof data['imageUrl'] === 'string' || data['imageUrl'] instanceof String)) {
            throw new Error("Expected the field `imageUrl` to be a primitive type in the JSON string but got " + data['imageUrl']);
        }
        // ensure the json data is a string
        if (data['link'] && !(typeof data['link'] === 'string' || data['link'] instanceof String)) {
            throw new Error("Expected the field `link` to be a primitive type in the JSON string but got " + data['link']);
        }

        return true;
    }


}

GetRecipeInformation200ResponseWinePairingProductMatchesInner.RequiredProperties = ["id", "title", "description", "price", "imageUrl", "averageRating", "ratingCount", "score", "link"];

/**
 * @member {Number} id
 */
GetRecipeInformation200ResponseWinePairingProductMatchesInner.prototype['id'] = undefined;

/**
 * @member {String} title
 */
GetRecipeInformation200ResponseWinePairingProductMatchesInner.prototype['title'] = undefined;

/**
 * @member {String} description
 */
GetRecipeInformation200ResponseWinePairingProductMatchesInner.prototype['description'] = undefined;

/**
 * @member {String} price
 */
GetRecipeInformation200ResponseWinePairingProductMatchesInner.prototype['price'] = undefined;

/**
 * @member {String} imageUrl
 */
GetRecipeInformation200ResponseWinePairingProductMatchesInner.prototype['imageUrl'] = undefined;

/**
 * @member {Number} averageRating
 */
GetRecipeInformation200ResponseWinePairingProductMatchesInner.prototype['averageRating'] = undefined;

/**
 * @member {Number} ratingCount
 */
GetRecipeInformation200ResponseWinePairingProductMatchesInner.prototype['ratingCount'] = undefined;

/**
 * @member {Number} score
 */
GetRecipeInformation200ResponseWinePairingProductMatchesInner.prototype['score'] = undefined;

/**
 * @member {String} link
 */
GetRecipeInformation200ResponseWinePairingProductMatchesInner.prototype['link'] = undefined;






export default GetRecipeInformation200ResponseWinePairingProductMatchesInner;

