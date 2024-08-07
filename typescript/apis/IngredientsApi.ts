// TODO: better import syntax?
import {BaseAPIRequestFactory, RequiredError, COLLECTION_FORMATS} from './baseapi';
import {Configuration} from '../configuration';
import {RequestContext, HttpMethod, ResponseContext, HttpFile, HttpInfo} from '../http/http';
import {ObjectSerializer} from '../models/ObjectSerializer';
import {ApiException} from './exception';
import {canConsumeForm, isCodeInRange} from '../util';
import {SecurityAuthentication} from '../auth/auth';


import { AutocompleteIngredientSearch200ResponseInner } from '../models/AutocompleteIngredientSearch200ResponseInner';
import { ComputeIngredientAmount200Response } from '../models/ComputeIngredientAmount200Response';
import { GetIngredientSubstitutes200Response } from '../models/GetIngredientSubstitutes200Response';
import { IngredientInformation } from '../models/IngredientInformation';
import { IngredientSearch200Response } from '../models/IngredientSearch200Response';
import { MapIngredientsToGroceryProducts200ResponseInner } from '../models/MapIngredientsToGroceryProducts200ResponseInner';
import { MapIngredientsToGroceryProductsRequest } from '../models/MapIngredientsToGroceryProductsRequest';

/**
 * no description
 */
export class IngredientsApiRequestFactory extends BaseAPIRequestFactory {

    /**
     * Autocomplete the entry of an ingredient.
     * Autocomplete Ingredient Search
     * @param query The (natural language) search query.
     * @param number The maximum number of items to return (between 1 and 100). Defaults to 10.
     * @param metaInformation Whether to return more meta information about the ingredients.
     * @param intolerances A comma-separated list of intolerances. All recipes returned must not contain ingredients that are not suitable for people with the intolerances entered. See a full list of supported intolerances.
     * @param language The language of the input. Either \&#39;en\&#39; or \&#39;de\&#39;.
     */
    public async autocompleteIngredientSearch(query: string, number?: number, metaInformation?: boolean, intolerances?: string, language?: 'en' | 'de', _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'query' is not null or undefined
        if (query === null || query === undefined) {
            throw new RequiredError("IngredientsApi", "autocompleteIngredientSearch", "query");
        }






        // Path Params
        const localVarPath = '/food/ingredients/autocomplete';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (query !== undefined) {
            requestContext.setQueryParam("query", ObjectSerializer.serialize(query, "string", ""));
        }

        // Query Params
        if (number !== undefined) {
            requestContext.setQueryParam("number", ObjectSerializer.serialize(number, "number", ""));
        }

        // Query Params
        if (metaInformation !== undefined) {
            requestContext.setQueryParam("metaInformation", ObjectSerializer.serialize(metaInformation, "boolean", ""));
        }

        // Query Params
        if (intolerances !== undefined) {
            requestContext.setQueryParam("intolerances", ObjectSerializer.serialize(intolerances, "string", ""));
        }

        // Query Params
        if (language !== undefined) {
            requestContext.setQueryParam("language", ObjectSerializer.serialize(language, "'en' | 'de'", ""));
        }


        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["apiKeyScheme"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * Compute the amount you need of a certain ingredient for a certain nutritional goal. For example, how much pineapple do you have to eat to get 10 grams of protein?
     * Compute Ingredient Amount
     * @param id The id of the ingredient you want the amount for.
     * @param nutrient The target nutrient. See a list of supported nutrients.
     * @param target The target number of the given nutrient.
     * @param unit The target unit.
     */
    public async computeIngredientAmount(id: number, nutrient: string, target: number, unit?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'id' is not null or undefined
        if (id === null || id === undefined) {
            throw new RequiredError("IngredientsApi", "computeIngredientAmount", "id");
        }


        // verify required parameter 'nutrient' is not null or undefined
        if (nutrient === null || nutrient === undefined) {
            throw new RequiredError("IngredientsApi", "computeIngredientAmount", "nutrient");
        }


        // verify required parameter 'target' is not null or undefined
        if (target === null || target === undefined) {
            throw new RequiredError("IngredientsApi", "computeIngredientAmount", "target");
        }



        // Path Params
        const localVarPath = '/food/ingredients/{id}/amount'
            .replace('{' + 'id' + '}', encodeURIComponent(String(id)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (nutrient !== undefined) {
            requestContext.setQueryParam("nutrient", ObjectSerializer.serialize(nutrient, "string", ""));
        }

        // Query Params
        if (target !== undefined) {
            requestContext.setQueryParam("target", ObjectSerializer.serialize(target, "number", ""));
        }

        // Query Params
        if (unit !== undefined) {
            requestContext.setQueryParam("unit", ObjectSerializer.serialize(unit, "string", ""));
        }


        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["apiKeyScheme"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * Use an ingredient id to get all available information about an ingredient, such as its image and supermarket aisle.
     * Get Ingredient Information
     * @param id The ingredient id.
     * @param amount The amount of this ingredient.
     * @param unit The unit for the given amount.
     */
    public async getIngredientInformation(id: number, amount?: number, unit?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'id' is not null or undefined
        if (id === null || id === undefined) {
            throw new RequiredError("IngredientsApi", "getIngredientInformation", "id");
        }




        // Path Params
        const localVarPath = '/food/ingredients/{id}/information'
            .replace('{' + 'id' + '}', encodeURIComponent(String(id)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (amount !== undefined) {
            requestContext.setQueryParam("amount", ObjectSerializer.serialize(amount, "number", ""));
        }

        // Query Params
        if (unit !== undefined) {
            requestContext.setQueryParam("unit", ObjectSerializer.serialize(unit, "string", ""));
        }


        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["apiKeyScheme"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * Search for substitutes for a given ingredient.
     * Get Ingredient Substitutes
     * @param ingredientName The name of the ingredient you want to replace.
     */
    public async getIngredientSubstitutes(ingredientName: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'ingredientName' is not null or undefined
        if (ingredientName === null || ingredientName === undefined) {
            throw new RequiredError("IngredientsApi", "getIngredientSubstitutes", "ingredientName");
        }


        // Path Params
        const localVarPath = '/food/ingredients/substitutes';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (ingredientName !== undefined) {
            requestContext.setQueryParam("ingredientName", ObjectSerializer.serialize(ingredientName, "string", ""));
        }


        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["apiKeyScheme"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * Search for substitutes for a given ingredient.
     * Get Ingredient Substitutes by ID
     * @param id The id of the ingredient you want substitutes for.
     */
    public async getIngredientSubstitutesByID(id: number, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'id' is not null or undefined
        if (id === null || id === undefined) {
            throw new RequiredError("IngredientsApi", "getIngredientSubstitutesByID", "id");
        }


        // Path Params
        const localVarPath = '/food/ingredients/{id}/substitutes'
            .replace('{' + 'id' + '}', encodeURIComponent(String(id)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["apiKeyScheme"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * Search for simple whole foods (e.g. fruits, vegetables, nuts, grains, meat, fish, dairy etc.).
     * Ingredient Search
     * @param query The (natural language) search query.
     * @param addChildren Whether to add children of found foods.
     * @param minProteinPercent The minimum percentage of protein the food must have (between 0 and 100).
     * @param maxProteinPercent The maximum percentage of protein the food can have (between 0 and 100).
     * @param minFatPercent The minimum percentage of fat the food must have (between 0 and 100).
     * @param maxFatPercent The maximum percentage of fat the food can have (between 0 and 100).
     * @param minCarbsPercent The minimum percentage of carbs the food must have (between 0 and 100).
     * @param maxCarbsPercent The maximum percentage of carbs the food can have (between 0 and 100).
     * @param metaInformation Whether to return more meta information about the ingredients.
     * @param intolerances A comma-separated list of intolerances. All recipes returned must not contain ingredients that are not suitable for people with the intolerances entered. See a full list of supported intolerances.
     * @param sort The strategy to sort recipes by. See a full list of supported sorting options.
     * @param sortDirection The direction in which to sort. Must be either \&#39;asc\&#39; (ascending) or \&#39;desc\&#39; (descending).
     * @param offset The number of results to skip (between 0 and 900).
     * @param number The maximum number of items to return (between 1 and 100). Defaults to 10.
     * @param language The language of the input. Either \&#39;en\&#39; or \&#39;de\&#39;.
     */
    public async ingredientSearch(query: string, addChildren?: boolean, minProteinPercent?: number, maxProteinPercent?: number, minFatPercent?: number, maxFatPercent?: number, minCarbsPercent?: number, maxCarbsPercent?: number, metaInformation?: boolean, intolerances?: string, sort?: string, sortDirection?: string, offset?: number, number?: number, language?: 'en' | 'de', _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'query' is not null or undefined
        if (query === null || query === undefined) {
            throw new RequiredError("IngredientsApi", "ingredientSearch", "query");
        }
















        // Path Params
        const localVarPath = '/food/ingredients/search';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (query !== undefined) {
            requestContext.setQueryParam("query", ObjectSerializer.serialize(query, "string", ""));
        }

        // Query Params
        if (addChildren !== undefined) {
            requestContext.setQueryParam("addChildren", ObjectSerializer.serialize(addChildren, "boolean", ""));
        }

        // Query Params
        if (minProteinPercent !== undefined) {
            requestContext.setQueryParam("minProteinPercent", ObjectSerializer.serialize(minProteinPercent, "number", ""));
        }

        // Query Params
        if (maxProteinPercent !== undefined) {
            requestContext.setQueryParam("maxProteinPercent", ObjectSerializer.serialize(maxProteinPercent, "number", ""));
        }

        // Query Params
        if (minFatPercent !== undefined) {
            requestContext.setQueryParam("minFatPercent", ObjectSerializer.serialize(minFatPercent, "number", ""));
        }

        // Query Params
        if (maxFatPercent !== undefined) {
            requestContext.setQueryParam("maxFatPercent", ObjectSerializer.serialize(maxFatPercent, "number", ""));
        }

        // Query Params
        if (minCarbsPercent !== undefined) {
            requestContext.setQueryParam("minCarbsPercent", ObjectSerializer.serialize(minCarbsPercent, "number", ""));
        }

        // Query Params
        if (maxCarbsPercent !== undefined) {
            requestContext.setQueryParam("maxCarbsPercent", ObjectSerializer.serialize(maxCarbsPercent, "number", ""));
        }

        // Query Params
        if (metaInformation !== undefined) {
            requestContext.setQueryParam("metaInformation", ObjectSerializer.serialize(metaInformation, "boolean", ""));
        }

        // Query Params
        if (intolerances !== undefined) {
            requestContext.setQueryParam("intolerances", ObjectSerializer.serialize(intolerances, "string", ""));
        }

        // Query Params
        if (sort !== undefined) {
            requestContext.setQueryParam("sort", ObjectSerializer.serialize(sort, "string", ""));
        }

        // Query Params
        if (sortDirection !== undefined) {
            requestContext.setQueryParam("sortDirection", ObjectSerializer.serialize(sortDirection, "string", ""));
        }

        // Query Params
        if (offset !== undefined) {
            requestContext.setQueryParam("offset", ObjectSerializer.serialize(offset, "number", ""));
        }

        // Query Params
        if (number !== undefined) {
            requestContext.setQueryParam("number", ObjectSerializer.serialize(number, "number", ""));
        }

        // Query Params
        if (language !== undefined) {
            requestContext.setQueryParam("language", ObjectSerializer.serialize(language, "'en' | 'de'", ""));
        }


        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["apiKeyScheme"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * Visualize a recipe\'s ingredient list.
     * Ingredients by ID Image
     * @param id The recipe id.
     * @param measure Whether the the measures should be \&#39;us\&#39; or \&#39;metric\&#39;.
     */
    public async ingredientsByIDImage(id: number, measure?: 'us' | 'metric', _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'id' is not null or undefined
        if (id === null || id === undefined) {
            throw new RequiredError("IngredientsApi", "ingredientsByIDImage", "id");
        }



        // Path Params
        const localVarPath = '/recipes/{id}/ingredientWidget.png'
            .replace('{' + 'id' + '}', encodeURIComponent(String(id)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (measure !== undefined) {
            requestContext.setQueryParam("measure", ObjectSerializer.serialize(measure, "'us' | 'metric'", ""));
        }


        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["apiKeyScheme"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * Map a set of ingredients to products you can buy in the grocery store.
     * Map Ingredients to Grocery Products
     * @param mapIngredientsToGroceryProductsRequest 
     */
    public async mapIngredientsToGroceryProducts(mapIngredientsToGroceryProductsRequest: MapIngredientsToGroceryProductsRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'mapIngredientsToGroceryProductsRequest' is not null or undefined
        if (mapIngredientsToGroceryProductsRequest === null || mapIngredientsToGroceryProductsRequest === undefined) {
            throw new RequiredError("IngredientsApi", "mapIngredientsToGroceryProducts", "mapIngredientsToGroceryProductsRequest");
        }


        // Path Params
        const localVarPath = '/food/ingredients/map';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(mapIngredientsToGroceryProductsRequest, "MapIngredientsToGroceryProductsRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["apiKeyScheme"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * Visualize ingredients of a recipe. You can play around with that endpoint!
     * Ingredients Widget
     * @param ingredientList The ingredient list of the recipe, one ingredient per line (separate lines with \\\\n).
     * @param servings The number of servings.
     * @param language The language of the input. Either \&#39;en\&#39; or \&#39;de\&#39;.
     * @param measure The original system of measurement, either \\\&#39;metric\\\&#39; or \\\&#39;us\\\&#39;.
     * @param view How to visualize the ingredients, either \\\&#39;grid\\\&#39; or \\\&#39;list\\\&#39;.
     * @param defaultCss Whether the default CSS should be added to the response.
     * @param showBacklink Whether to show a backlink to spoonacular. If set false, this call counts against your quota.
     */
    public async visualizeIngredients(ingredientList: string, servings: number, language?: 'en' | 'de', measure?: string, view?: string, defaultCss?: boolean, showBacklink?: boolean, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'ingredientList' is not null or undefined
        if (ingredientList === null || ingredientList === undefined) {
            throw new RequiredError("IngredientsApi", "visualizeIngredients", "ingredientList");
        }


        // verify required parameter 'servings' is not null or undefined
        if (servings === null || servings === undefined) {
            throw new RequiredError("IngredientsApi", "visualizeIngredients", "servings");
        }







        // Path Params
        const localVarPath = '/recipes/visualizeIngredients';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (language !== undefined) {
            requestContext.setQueryParam("language", ObjectSerializer.serialize(language, "'en' | 'de'", ""));
        }

        // Form Params
        const useForm = canConsumeForm([
            'application/x-www-form-urlencoded',
        ]);

        let localVarFormParams
        if (useForm) {
            localVarFormParams = new FormData();
        } else {
            localVarFormParams = new URLSearchParams();
        }

        if (ingredientList !== undefined) {
             // TODO: replace .append with .set
             localVarFormParams.append('ingredientList', ingredientList as any);
        }
        if (servings !== undefined) {
             // TODO: replace .append with .set
             localVarFormParams.append('servings', servings as any);
        }
        if (measure !== undefined) {
             // TODO: replace .append with .set
             localVarFormParams.append('measure', measure as any);
        }
        if (view !== undefined) {
             // TODO: replace .append with .set
             localVarFormParams.append('view', view as any);
        }
        if (defaultCss !== undefined) {
             // TODO: replace .append with .set
             localVarFormParams.append('defaultCss', defaultCss as any);
        }
        if (showBacklink !== undefined) {
             // TODO: replace .append with .set
             localVarFormParams.append('showBacklink', showBacklink as any);
        }

        requestContext.setBody(localVarFormParams);

        if(!useForm) {
            const contentType = ObjectSerializer.getPreferredMediaType([
                "application/x-www-form-urlencoded"
            ]);
            requestContext.setHeaderParam("Content-Type", contentType);
        }

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["apiKeyScheme"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

}

export class IngredientsApiResponseProcessor {

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to autocompleteIngredientSearch
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async autocompleteIngredientSearchWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Set<AutocompleteIngredientSearch200ResponseInner> >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Set<AutocompleteIngredientSearch200ResponseInner> = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Set<AutocompleteIngredientSearch200ResponseInner>", ""
            ) as Set<AutocompleteIngredientSearch200ResponseInner>;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("401", response.httpStatusCode)) {
            throw new ApiException<undefined>(response.httpStatusCode, "Unauthorized", undefined, response.headers);
        }
        if (isCodeInRange("403", response.httpStatusCode)) {
            throw new ApiException<undefined>(response.httpStatusCode, "Forbidden", undefined, response.headers);
        }
        if (isCodeInRange("404", response.httpStatusCode)) {
            throw new ApiException<undefined>(response.httpStatusCode, "Not Found", undefined, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: Set<AutocompleteIngredientSearch200ResponseInner> = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Set<AutocompleteIngredientSearch200ResponseInner>", ""
            ) as Set<AutocompleteIngredientSearch200ResponseInner>;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to computeIngredientAmount
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async computeIngredientAmountWithHttpInfo(response: ResponseContext): Promise<HttpInfo<ComputeIngredientAmount200Response >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: ComputeIngredientAmount200Response = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ComputeIngredientAmount200Response", ""
            ) as ComputeIngredientAmount200Response;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("401", response.httpStatusCode)) {
            throw new ApiException<undefined>(response.httpStatusCode, "Unauthorized", undefined, response.headers);
        }
        if (isCodeInRange("403", response.httpStatusCode)) {
            throw new ApiException<undefined>(response.httpStatusCode, "Forbidden", undefined, response.headers);
        }
        if (isCodeInRange("404", response.httpStatusCode)) {
            throw new ApiException<undefined>(response.httpStatusCode, "Not Found", undefined, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: ComputeIngredientAmount200Response = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ComputeIngredientAmount200Response", ""
            ) as ComputeIngredientAmount200Response;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to getIngredientInformation
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async getIngredientInformationWithHttpInfo(response: ResponseContext): Promise<HttpInfo<IngredientInformation >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: IngredientInformation = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "IngredientInformation", ""
            ) as IngredientInformation;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("401", response.httpStatusCode)) {
            throw new ApiException<undefined>(response.httpStatusCode, "Unauthorized", undefined, response.headers);
        }
        if (isCodeInRange("403", response.httpStatusCode)) {
            throw new ApiException<undefined>(response.httpStatusCode, "Forbidden", undefined, response.headers);
        }
        if (isCodeInRange("404", response.httpStatusCode)) {
            throw new ApiException<undefined>(response.httpStatusCode, "Not Found", undefined, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: IngredientInformation = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "IngredientInformation", ""
            ) as IngredientInformation;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to getIngredientSubstitutes
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async getIngredientSubstitutesWithHttpInfo(response: ResponseContext): Promise<HttpInfo<GetIngredientSubstitutes200Response >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: GetIngredientSubstitutes200Response = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "GetIngredientSubstitutes200Response", ""
            ) as GetIngredientSubstitutes200Response;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("401", response.httpStatusCode)) {
            throw new ApiException<undefined>(response.httpStatusCode, "Unauthorized", undefined, response.headers);
        }
        if (isCodeInRange("403", response.httpStatusCode)) {
            throw new ApiException<undefined>(response.httpStatusCode, "Forbidden", undefined, response.headers);
        }
        if (isCodeInRange("404", response.httpStatusCode)) {
            throw new ApiException<undefined>(response.httpStatusCode, "Not Found", undefined, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: GetIngredientSubstitutes200Response = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "GetIngredientSubstitutes200Response", ""
            ) as GetIngredientSubstitutes200Response;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to getIngredientSubstitutesByID
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async getIngredientSubstitutesByIDWithHttpInfo(response: ResponseContext): Promise<HttpInfo<GetIngredientSubstitutes200Response >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: GetIngredientSubstitutes200Response = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "GetIngredientSubstitutes200Response", ""
            ) as GetIngredientSubstitutes200Response;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("401", response.httpStatusCode)) {
            throw new ApiException<undefined>(response.httpStatusCode, "Unauthorized", undefined, response.headers);
        }
        if (isCodeInRange("403", response.httpStatusCode)) {
            throw new ApiException<undefined>(response.httpStatusCode, "Forbidden", undefined, response.headers);
        }
        if (isCodeInRange("404", response.httpStatusCode)) {
            throw new ApiException<undefined>(response.httpStatusCode, "Not Found", undefined, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: GetIngredientSubstitutes200Response = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "GetIngredientSubstitutes200Response", ""
            ) as GetIngredientSubstitutes200Response;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to ingredientSearch
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async ingredientSearchWithHttpInfo(response: ResponseContext): Promise<HttpInfo<IngredientSearch200Response >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: IngredientSearch200Response = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "IngredientSearch200Response", ""
            ) as IngredientSearch200Response;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("401", response.httpStatusCode)) {
            throw new ApiException<undefined>(response.httpStatusCode, "Unauthorized", undefined, response.headers);
        }
        if (isCodeInRange("403", response.httpStatusCode)) {
            throw new ApiException<undefined>(response.httpStatusCode, "Forbidden", undefined, response.headers);
        }
        if (isCodeInRange("404", response.httpStatusCode)) {
            throw new ApiException<undefined>(response.httpStatusCode, "Not Found", undefined, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: IngredientSearch200Response = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "IngredientSearch200Response", ""
            ) as IngredientSearch200Response;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to ingredientsByIDImage
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async ingredientsByIDImageWithHttpInfo(response: ResponseContext): Promise<HttpInfo<HttpFile >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: HttpFile = await response.getBodyAsFile() as any as HttpFile;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("401", response.httpStatusCode)) {
            throw new ApiException<undefined>(response.httpStatusCode, "Unauthorized", undefined, response.headers);
        }
        if (isCodeInRange("403", response.httpStatusCode)) {
            throw new ApiException<undefined>(response.httpStatusCode, "Forbidden", undefined, response.headers);
        }
        if (isCodeInRange("404", response.httpStatusCode)) {
            throw new ApiException<undefined>(response.httpStatusCode, "Not Found", undefined, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: HttpFile = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "HttpFile", "binary"
            ) as HttpFile;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to mapIngredientsToGroceryProducts
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async mapIngredientsToGroceryProductsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Set<MapIngredientsToGroceryProducts200ResponseInner> >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Set<MapIngredientsToGroceryProducts200ResponseInner> = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Set<MapIngredientsToGroceryProducts200ResponseInner>", ""
            ) as Set<MapIngredientsToGroceryProducts200ResponseInner>;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("401", response.httpStatusCode)) {
            throw new ApiException<undefined>(response.httpStatusCode, "Unauthorized", undefined, response.headers);
        }
        if (isCodeInRange("403", response.httpStatusCode)) {
            throw new ApiException<undefined>(response.httpStatusCode, "Forbidden", undefined, response.headers);
        }
        if (isCodeInRange("404", response.httpStatusCode)) {
            throw new ApiException<undefined>(response.httpStatusCode, "Not Found", undefined, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: Set<MapIngredientsToGroceryProducts200ResponseInner> = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Set<MapIngredientsToGroceryProducts200ResponseInner>", ""
            ) as Set<MapIngredientsToGroceryProducts200ResponseInner>;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to visualizeIngredients
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async visualizeIngredientsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<string >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: string = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "string", ""
            ) as string;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("401", response.httpStatusCode)) {
            throw new ApiException<undefined>(response.httpStatusCode, "Unauthorized", undefined, response.headers);
        }
        if (isCodeInRange("403", response.httpStatusCode)) {
            throw new ApiException<undefined>(response.httpStatusCode, "Forbidden", undefined, response.headers);
        }
        if (isCodeInRange("404", response.httpStatusCode)) {
            throw new ApiException<undefined>(response.httpStatusCode, "Not Found", undefined, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: string = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "string", ""
            ) as string;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

}
