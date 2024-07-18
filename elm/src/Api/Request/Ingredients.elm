{-
   spoonacular API
   The spoonacular Nutrition, Recipe, and Food API allows you to access over thousands of recipes, thousands of ingredients, 800,000 food products, over 100,000 menu items, and restaurants. Our food ontology and semantic recipe search engine makes it possible to search for recipes using natural language queries, such as \"gluten free brownies without sugar\" or \"low fat vegan cupcakes.\" You can automatically calculate the nutritional information for any recipe, analyze recipe costs, visualize ingredient lists, find recipes for what's in your fridge, find recipes based on special diets, nutritional requirements, or favorite ingredients, classify recipes into types and cuisines, convert ingredient amounts, or even compute an entire meal plan. With our powerful API, you can create many kinds of food and especially nutrition apps.  Special diets/dietary requirements currently available include: vegan, vegetarian, pescetarian, gluten free, grain free, dairy free, high protein, whole 30, low sodium, low carb, Paleo, ketogenic, FODMAP, and Primal.

   The version of the OpenAPI document: 1.1
   Contact: mail@spoonacular.com

   NOTE: This file is auto generated by the openapi-generator.
   https://github.com/openapitools/openapi-generator.git

   DO NOT EDIT THIS FILE MANUALLY.

   For more info on generating Elm code, see https://eriktim.github.io/openapi-elm/
-}


module Api.Request.Ingredients exposing
    ( autocompleteIngredientSearch, Language(..), languageVariants
    , computeIngredientAmount
    , getIngredientInformation
    , getIngredientSubstitutes
    , getIngredientSubstitutesByID
    , ingredientSearch, Language(..), languageVariants
    , ingredientsByIDImage, Measure(..), measureVariants
    , mapIngredientsToGroceryProducts
    , visualizeIngredients, Language(..), languageVariants, Measure(..), measureVariants, View(..), viewVariants
    )

import Api
import Api.Data exposing (..)
import Dict
import Http
import Json.Decode
import Json.Encode
import File exposing (File)


type Language
    = LanguageEn
    | LanguageDe


languageVariants : List Language
languageVariants =
    [ LanguageEn
    , LanguageDe
    ]


stringFromLanguage : Language -> String
stringFromLanguage model =
    case model of
        LanguageEn ->
            "en"

        LanguageDe ->
            "de"




type Language
    = LanguageEn
    | LanguageDe


languageVariants : List Language
languageVariants =
    [ LanguageEn
    , LanguageDe
    ]


stringFromLanguage : Language -> String
stringFromLanguage model =
    case model of
        LanguageEn ->
            "en"

        LanguageDe ->
            "de"




type Measure
    = MeasureUs
    | MeasureMetric


measureVariants : List Measure
measureVariants =
    [ MeasureUs
    , MeasureMetric
    ]


stringFromMeasure : Measure -> String
stringFromMeasure model =
    case model of
        MeasureUs ->
            "us"

        MeasureMetric ->
            "metric"




type Language
    = LanguageEn
    | LanguageDe


languageVariants : List Language
languageVariants =
    [ LanguageEn
    , LanguageDe
    ]


stringFromLanguage : Language -> String
stringFromLanguage model =
    case model of
        LanguageEn ->
            "en"

        LanguageDe ->
            "de"




type Measure
    = MeasureUs
    | MeasureMetric


measureVariants : List Measure
measureVariants =
    [ MeasureUs
    , MeasureMetric
    ]


stringFromMeasure : Measure -> String
stringFromMeasure model =
    case model of
        MeasureUs ->
            "us"

        MeasureMetric ->
            "metric"




type View
    = ViewGrid
    | ViewList


viewVariants : List View
viewVariants =
    [ ViewGrid
    , ViewList
    ]


stringFromView : View -> String
stringFromView model =
    case model of
        ViewGrid ->
            "grid"

        ViewList ->
            "list"



{-| Autocomplete the entry of an ingredient.
-}
autocompleteIngredientSearch : String -> Maybe Int -> Maybe Bool -> Maybe String -> Maybe Language -> Api.Request (List Api.Data.AutocompleteIngredientSearch200ResponseInner)
autocompleteIngredientSearch query_query number_query metaInformation_query intolerances_query language_query =
    Api.request
        "GET"
        "/food/ingredients/autocomplete"
        []
        [ ( "query", Just <| identity query_query ), ( "number", Maybe.map String.fromInt number_query ), ( "metaInformation", Maybe.map (\val -> if val then "true" else "false") metaInformation_query ), ( "intolerances", Maybe.map identity intolerances_query ), ( "language", Maybe.map stringFromLanguage language_query ) ]
        []
        Nothing
        (Json.Decode.list Api.Data.autocompleteIngredientSearch200ResponseInnerDecoder)


{-| Compute the amount you need of a certain ingredient for a certain nutritional goal. For example, how much pineapple do you have to eat to get 10 grams of protein?
-}
computeIngredientAmount : Int -> String -> Int -> Maybe String -> Api.Request Api.Data.ComputeIngredientAmount200Response
computeIngredientAmount id_path nutrient_query target_query unit_query =
    Api.request
        "GET"
        "/food/ingredients/{id}/amount"
        [ ( "id", String.fromInt id_path ) ]
        [ ( "nutrient", Just <| identity nutrient_query ), ( "target", Just <| String.fromInt target_query ), ( "unit", Maybe.map identity unit_query ) ]
        []
        Nothing
        Api.Data.computeIngredientAmount200ResponseDecoder


{-| Use an ingredient id to get all available information about an ingredient, such as its image and supermarket aisle.
-}
getIngredientInformation : Int -> Maybe Float -> Maybe String -> Api.Request Api.Data.IngredientInformation
getIngredientInformation id_path amount_query unit_query =
    Api.request
        "GET"
        "/food/ingredients/{id}/information"
        [ ( "id", String.fromInt id_path ) ]
        [ ( "amount", Maybe.map String.fromFloat amount_query ), ( "unit", Maybe.map identity unit_query ) ]
        []
        Nothing
        Api.Data.ingredientInformationDecoder


{-| Search for substitutes for a given ingredient.
-}
getIngredientSubstitutes : String -> Api.Request Api.Data.GetIngredientSubstitutes200Response
getIngredientSubstitutes ingredientName_query =
    Api.request
        "GET"
        "/food/ingredients/substitutes"
        []
        [ ( "ingredientName", Just <| identity ingredientName_query ) ]
        []
        Nothing
        Api.Data.getIngredientSubstitutes200ResponseDecoder


{-| Search for substitutes for a given ingredient.
-}
getIngredientSubstitutesByID : Int -> Api.Request Api.Data.GetIngredientSubstitutes200Response
getIngredientSubstitutesByID id_path =
    Api.request
        "GET"
        "/food/ingredients/{id}/substitutes"
        [ ( "id", String.fromInt id_path ) ]
        []
        []
        Nothing
        Api.Data.getIngredientSubstitutes200ResponseDecoder


{-| Search for simple whole foods (e.g. fruits, vegetables, nuts, grains, meat, fish, dairy etc.).
-}
ingredientSearch : String -> Maybe Bool -> Maybe Float -> Maybe Float -> Maybe Float -> Maybe Float -> Maybe Float -> Maybe Float -> Maybe Bool -> Maybe String -> Maybe String -> Maybe String -> Maybe Int -> Maybe Int -> Maybe Language -> Api.Request Api.Data.IngredientSearch200Response
ingredientSearch query_query addChildren_query minProteinPercent_query maxProteinPercent_query minFatPercent_query maxFatPercent_query minCarbsPercent_query maxCarbsPercent_query metaInformation_query intolerances_query sort_query sortDirection_query offset_query number_query language_query =
    Api.request
        "GET"
        "/food/ingredients/search"
        []
        [ ( "query", Just <| identity query_query ), ( "addChildren", Maybe.map (\val -> if val then "true" else "false") addChildren_query ), ( "minProteinPercent", Maybe.map String.fromFloat minProteinPercent_query ), ( "maxProteinPercent", Maybe.map String.fromFloat maxProteinPercent_query ), ( "minFatPercent", Maybe.map String.fromFloat minFatPercent_query ), ( "maxFatPercent", Maybe.map String.fromFloat maxFatPercent_query ), ( "minCarbsPercent", Maybe.map String.fromFloat minCarbsPercent_query ), ( "maxCarbsPercent", Maybe.map String.fromFloat maxCarbsPercent_query ), ( "metaInformation", Maybe.map (\val -> if val then "true" else "false") metaInformation_query ), ( "intolerances", Maybe.map identity intolerances_query ), ( "sort", Maybe.map identity sort_query ), ( "sortDirection", Maybe.map identity sortDirection_query ), ( "offset", Maybe.map String.fromInt offset_query ), ( "number", Maybe.map String.fromInt number_query ), ( "language", Maybe.map stringFromLanguage language_query ) ]
        []
        Nothing
        Api.Data.ingredientSearch200ResponseDecoder


{-| Visualize a recipe's ingredient list.
-}
ingredientsByIDImage : Int -> Maybe Measure -> Api.Request File
ingredientsByIDImage id_path measure_query =
    Api.request
        "GET"
        "/recipes/{id}/ingredientWidget.png"
        [ ( "id", String.fromInt id_path ) ]
        [ ( "measure", Maybe.map stringFromMeasure measure_query ) ]
        []
        Nothing
        File.decoder


{-| Map a set of ingredients to products you can buy in the grocery store.
-}
mapIngredientsToGroceryProducts : Api.Data.MapIngredientsToGroceryProductsRequest -> Api.Request (List Api.Data.MapIngredientsToGroceryProducts200ResponseInner)
mapIngredientsToGroceryProducts mapIngredientsToGroceryProductsRequest_body =
    Api.request
        "POST"
        "/food/ingredients/map"
        []
        []
        []
        (Maybe.map Http.jsonBody (Just (Api.Data.encodeMapIngredientsToGroceryProductsRequest mapIngredientsToGroceryProductsRequest_body)))
        (Json.Decode.list Api.Data.mapIngredientsToGroceryProducts200ResponseInnerDecoder)


{-| Visualize ingredients of a recipe. You can play around with that endpoint!
-}
visualizeIngredients : Maybe Language -> String -> Float -> Maybe Measure -> Maybe View -> Maybe Bool -> Maybe Bool -> Api.Request String
visualizeIngredients language_query ingredientList servings measure view defaultCss showBacklink =
    Api.request
        "POST"
        "/recipes/visualizeIngredients"
        []
        [ ( "language", Maybe.map stringFromLanguage language_query ) ]
        []
        (Just <| Http.multipartBody <| List.filterMap identity [ Just <| Http.stringPart "ingredientList" ingredientList, Just <| Http.stringPart "servings"String.fromFloat servings, Maybe.map (Http.stringPart "measure"Api.Data.stringFromMeasure) measure, Maybe.map (Http.stringPart "view"Api.Data.stringFromView) view, Maybe.map (Http.stringPart "defaultCss"(\val -> if val then "true" else "false")) defaultCss, Maybe.map (Http.stringPart "showBacklink"(\val -> if val then "true" else "false")) showBacklink ])
        Json.Decode.string

