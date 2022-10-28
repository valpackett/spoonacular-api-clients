{-
   spoonacular API

   The spoonacular Nutrition, Recipe, and Food API allows you to access over 380,000 recipes, thousands of ingredients, 800,000 food products, and 100,000 menu items. Our food ontology and semantic recipe search engine makes it possible to search for recipes using natural language queries, such as \"gluten free brownies without sugar\" or \"low fat vegan cupcakes.\" You can automatically calculate the nutritional information for any recipe, analyze recipe costs, visualize ingredient lists, find recipes for what's in your fridge, find recipes based on special diets, nutritional requirements, or favorite ingredients, classify recipes into types and cuisines, convert ingredient amounts, or even compute an entire meal plan. With our powerful API, you can create many kinds of food and especially nutrition apps.  Special diets/dietary requirements currently available include: vegan, vegetarian, pescetarian, gluten free, grain free, dairy free, high protein, whole 30, low sodium, low carb, Paleo, ketogenic, FODMAP, and Primal.

   OpenAPI Version: 3.0.0
   spoonacular API API version: 1.1
   Contact: mail@spoonacular.com
   Generated by OpenAPI Generator (https://openapi-generator.tech)
-}

{-|
Module : Spoonacular.API.Products
-}

{-# LANGUAGE FlexibleContexts #-}
{-# LANGUAGE FlexibleInstances #-}
{-# LANGUAGE MonoLocalBinds #-}
{-# LANGUAGE MultiParamTypeClasses #-}
{-# LANGUAGE OverloadedStrings #-}
{-# OPTIONS_GHC -fno-warn-name-shadowing -fno-warn-unused-binds -fno-warn-unused-imports #-}

module Spoonacular.API.Products where

import Spoonacular.Core
import Spoonacular.MimeTypes
import Spoonacular.Model as M

import qualified Data.Aeson as A
import qualified Data.ByteString as B
import qualified Data.ByteString.Lazy as BL
import qualified Data.Data as P (Typeable, TypeRep, typeOf, typeRep)
import qualified Data.Foldable as P
import qualified Data.Map as Map
import qualified Data.Maybe as P
import qualified Data.Proxy as P (Proxy(..))
import qualified Data.Set as Set
import qualified Data.String as P
import qualified Data.Text as T
import qualified Data.Text.Encoding as T
import qualified Data.Text.Lazy as TL
import qualified Data.Text.Lazy.Encoding as TL
import qualified Data.Time as TI
import qualified Network.HTTP.Client.MultipartFormData as NH
import qualified Network.HTTP.Media as ME
import qualified Network.HTTP.Types as NH
import qualified Web.FormUrlEncoded as WH
import qualified Web.HttpApiData as WH

import Data.Text (Text)
import GHC.Base ((<|>))

import Prelude ((==),(/=),($), (.),(<$>),(<*>),(>>=),Maybe(..),Bool(..),Char,Double,FilePath,Float,Int,Integer,String,fmap,undefined,mempty,maybe,pure,Monad,Applicative,Functor)
import qualified Prelude as P

-- * Operations


-- ** Products

-- *** autocompleteProductSearch

-- | @GET \/food\/products\/suggest@
-- 
-- Autocomplete Product Search
-- 
-- Generate suggestions for grocery products based on a (partial) query. The matches will be found by looking in the title only.
-- 
-- AuthMethod: 'AuthApiKeyApiKeyScheme'
-- 
autocompleteProductSearch
  :: Query -- ^ "query" -  The (partial) search query.
  -> SpoonacularRequest AutocompleteProductSearch MimeNoContent AutocompleteProductSearch200Response MimeJSON
autocompleteProductSearch (Query query) =
  _mkRequest "GET" ["/food/products/suggest"]
    `_hasAuthType` (P.Proxy :: P.Proxy AuthApiKeyApiKeyScheme)
    `addQuery` toQuery ("query", Just query)

data AutocompleteProductSearch  

-- | /Optional Param/ "number" - The number of results to return (between 1 and 25).
instance HasOptionalParam AutocompleteProductSearch Number where
  applyOptionalParam req (Number xs) =
    req `addQuery` toQuery ("number", Just xs)
-- | @application/json@
instance Produces AutocompleteProductSearch MimeJSON


-- *** classifyGroceryProduct

-- | @POST \/food\/products\/classify@
-- 
-- Classify Grocery Product
-- 
-- This endpoint allows you to match a packaged food to a basic category, e.g. a specific brand of milk to the category milk.
-- 
-- AuthMethod: 'AuthApiKeyApiKeyScheme'
-- 
classifyGroceryProduct
  :: (Consumes ClassifyGroceryProduct MimeJSON, MimeRender MimeJSON ClassifyGroceryProductRequest)
  => ClassifyGroceryProductRequest -- ^ "classifyGroceryProductRequest"
  -> SpoonacularRequest ClassifyGroceryProduct MimeJSON ClassifyGroceryProduct200Response MimeJSON
classifyGroceryProduct classifyGroceryProductRequest =
  _mkRequest "POST" ["/food/products/classify"]
    `_hasAuthType` (P.Proxy :: P.Proxy AuthApiKeyApiKeyScheme)
    `setBodyParam` classifyGroceryProductRequest

data ClassifyGroceryProduct 
instance HasBodyParam ClassifyGroceryProduct ClassifyGroceryProductRequest 

-- | /Optional Param/ "locale" - The display name of the returned category, supported is en_US (for American English) and en_GB (for British English).
instance HasOptionalParam ClassifyGroceryProduct Locale where
  applyOptionalParam req (Locale xs) =
    req `addQuery` toQuery ("locale", Just xs)

-- | @application/json@
instance Consumes ClassifyGroceryProduct MimeJSON

-- | @application/json@
instance Produces ClassifyGroceryProduct MimeJSON


-- *** classifyGroceryProductBulk

-- | @POST \/food\/products\/classifyBatch@
-- 
-- Classify Grocery Product Bulk
-- 
-- Provide a set of product jsons, get back classified products.
-- 
-- AuthMethod: 'AuthApiKeyApiKeyScheme'
-- 
classifyGroceryProductBulk
  :: (Consumes ClassifyGroceryProductBulk MimeJSON, MimeRender MimeJSON ClassifyGroceryProductBulkRequestInner2)
  => ClassifyGroceryProductBulkRequestInner2 -- ^ "classifyGroceryProductBulkRequestInner"
  -> SpoonacularRequest ClassifyGroceryProductBulk MimeJSON [ClassifyGroceryProductBulk200ResponseInner] MimeJSON
classifyGroceryProductBulk classifyGroceryProductBulkRequestInner =
  _mkRequest "POST" ["/food/products/classifyBatch"]
    `_hasAuthType` (P.Proxy :: P.Proxy AuthApiKeyApiKeyScheme)
    `setBodyParam` classifyGroceryProductBulkRequestInner

data ClassifyGroceryProductBulk 
instance HasBodyParam ClassifyGroceryProductBulk ClassifyGroceryProductBulkRequestInner2 

-- | /Optional Param/ "locale" - The display name of the returned category, supported is en_US (for American English) and en_GB (for British English).
instance HasOptionalParam ClassifyGroceryProductBulk LocaleText where
  applyOptionalParam req (LocaleText xs) =
    req `addQuery` toQuery ("locale", Just xs)

-- | @application/json@
instance Consumes ClassifyGroceryProductBulk MimeJSON

-- | @application/json@
instance Produces ClassifyGroceryProductBulk MimeJSON


-- *** getComparableProducts

-- | @GET \/food\/products\/upc\/{upc}\/comparable@
-- 
-- Get Comparable Products
-- 
-- Find comparable products to the given one.
-- 
-- AuthMethod: 'AuthApiKeyApiKeyScheme'
-- 
getComparableProducts
  :: Upc -- ^ "upc" -  The UPC of the product for which you want to find comparable products.
  -> SpoonacularRequest GetComparableProducts MimeNoContent GetComparableProducts200Response MimeJSON
getComparableProducts (Upc upc) =
  _mkRequest "GET" ["/food/products/upc/",toPath upc,"/comparable"]
    `_hasAuthType` (P.Proxy :: P.Proxy AuthApiKeyApiKeyScheme)

data GetComparableProducts  
-- | @application/json@
instance Produces GetComparableProducts MimeJSON


-- *** getProductInformation

-- | @GET \/food\/products\/{id}@
-- 
-- Get Product Information
-- 
-- Use a product id to get full information about a product, such as ingredients, nutrition, etc. The nutritional information is per serving.
-- 
-- AuthMethod: 'AuthApiKeyApiKeyScheme'
-- 
getProductInformation
  :: Id -- ^ "id" -  The item's id.
  -> SpoonacularRequest GetProductInformation MimeNoContent GetProductInformation200Response MimeJSON
getProductInformation (Id id) =
  _mkRequest "GET" ["/food/products/",toPath id]
    `_hasAuthType` (P.Proxy :: P.Proxy AuthApiKeyApiKeyScheme)

data GetProductInformation  
-- | @application/json@
instance Produces GetProductInformation MimeJSON


-- *** productNutritionByIDImage

-- | @GET \/food\/products\/{id}\/nutritionWidget.png@
-- 
-- Product Nutrition by ID Image
-- 
-- Visualize a product's nutritional information as an image.
-- 
-- AuthMethod: 'AuthApiKeyApiKeyScheme'
-- 
productNutritionByIDImage
  :: IdDouble -- ^ "id" -  The id of the product.
  -> SpoonacularRequest ProductNutritionByIDImage MimeNoContent A.Value MimeImagePng
productNutritionByIDImage (IdDouble id) =
  _mkRequest "GET" ["/food/products/",toPath id,"/nutritionWidget.png"]
    `_hasAuthType` (P.Proxy :: P.Proxy AuthApiKeyApiKeyScheme)

data ProductNutritionByIDImage  
-- | @image/png@
instance Produces ProductNutritionByIDImage MimeImagePng


-- *** productNutritionLabelImage

-- | @GET \/food\/products\/{id}\/nutritionLabel.png@
-- 
-- Product Nutrition Label Image
-- 
-- Get a product's nutrition label as an image.
-- 
-- AuthMethod: 'AuthApiKeyApiKeyScheme'
-- 
productNutritionLabelImage
  :: IdDouble -- ^ "id" -  The product id.
  -> SpoonacularRequest ProductNutritionLabelImage MimeNoContent A.Value MimeImagePng
productNutritionLabelImage (IdDouble id) =
  _mkRequest "GET" ["/food/products/",toPath id,"/nutritionLabel.png"]
    `_hasAuthType` (P.Proxy :: P.Proxy AuthApiKeyApiKeyScheme)

data ProductNutritionLabelImage  

-- | /Optional Param/ "showOptionalNutrients" - Whether to show optional nutrients.
instance HasOptionalParam ProductNutritionLabelImage ShowOptionalNutrients where
  applyOptionalParam req (ShowOptionalNutrients xs) =
    req `addQuery` toQuery ("showOptionalNutrients", Just xs)

-- | /Optional Param/ "showZeroValues" - Whether to show zero values.
instance HasOptionalParam ProductNutritionLabelImage ShowZeroValues where
  applyOptionalParam req (ShowZeroValues xs) =
    req `addQuery` toQuery ("showZeroValues", Just xs)

-- | /Optional Param/ "showIngredients" - Whether to show a list of ingredients.
instance HasOptionalParam ProductNutritionLabelImage ShowIngredients where
  applyOptionalParam req (ShowIngredients xs) =
    req `addQuery` toQuery ("showIngredients", Just xs)
-- | @image/png@
instance Produces ProductNutritionLabelImage MimeImagePng


-- *** productNutritionLabelWidget

-- | @GET \/food\/products\/{id}\/nutritionLabel@
-- 
-- Product Nutrition Label Widget
-- 
-- Get a product's nutrition label as an HTML widget.
-- 
-- AuthMethod: 'AuthApiKeyApiKeyScheme'
-- 
productNutritionLabelWidget
  :: IdDouble -- ^ "id" -  The product id.
  -> SpoonacularRequest ProductNutritionLabelWidget MimeNoContent Text MimeTextHtml
productNutritionLabelWidget (IdDouble id) =
  _mkRequest "GET" ["/food/products/",toPath id,"/nutritionLabel"]
    `_hasAuthType` (P.Proxy :: P.Proxy AuthApiKeyApiKeyScheme)

data ProductNutritionLabelWidget  

-- | /Optional Param/ "defaultCss" - Whether the default CSS should be added to the response.
instance HasOptionalParam ProductNutritionLabelWidget DefaultCss where
  applyOptionalParam req (DefaultCss xs) =
    req `addQuery` toQuery ("defaultCss", Just xs)

-- | /Optional Param/ "showOptionalNutrients" - Whether to show optional nutrients.
instance HasOptionalParam ProductNutritionLabelWidget ShowOptionalNutrients where
  applyOptionalParam req (ShowOptionalNutrients xs) =
    req `addQuery` toQuery ("showOptionalNutrients", Just xs)

-- | /Optional Param/ "showZeroValues" - Whether to show zero values.
instance HasOptionalParam ProductNutritionLabelWidget ShowZeroValues where
  applyOptionalParam req (ShowZeroValues xs) =
    req `addQuery` toQuery ("showZeroValues", Just xs)

-- | /Optional Param/ "showIngredients" - Whether to show a list of ingredients.
instance HasOptionalParam ProductNutritionLabelWidget ShowIngredients where
  applyOptionalParam req (ShowIngredients xs) =
    req `addQuery` toQuery ("showIngredients", Just xs)
-- | @text/html@
instance Produces ProductNutritionLabelWidget MimeTextHtml


-- *** searchGroceryProducts

-- | @GET \/food\/products\/search@
-- 
-- Search Grocery Products
-- 
-- Search packaged food products, such as frozen pizza or Greek yogurt.
-- 
-- AuthMethod: 'AuthApiKeyApiKeyScheme'
-- 
searchGroceryProducts
  :: SpoonacularRequest SearchGroceryProducts MimeNoContent SearchGroceryProducts200Response MimeJSON
searchGroceryProducts =
  _mkRequest "GET" ["/food/products/search"]
    `_hasAuthType` (P.Proxy :: P.Proxy AuthApiKeyApiKeyScheme)

data SearchGroceryProducts  

-- | /Optional Param/ "query" - The (natural language) search query.
instance HasOptionalParam SearchGroceryProducts Query where
  applyOptionalParam req (Query xs) =
    req `addQuery` toQuery ("query", Just xs)

-- | /Optional Param/ "minCalories" - The minimum amount of calories the product must have.
instance HasOptionalParam SearchGroceryProducts MinCalories where
  applyOptionalParam req (MinCalories xs) =
    req `addQuery` toQuery ("minCalories", Just xs)

-- | /Optional Param/ "maxCalories" - The maximum amount of calories the product can have.
instance HasOptionalParam SearchGroceryProducts MaxCalories where
  applyOptionalParam req (MaxCalories xs) =
    req `addQuery` toQuery ("maxCalories", Just xs)

-- | /Optional Param/ "minCarbs" - The minimum amount of carbohydrates in grams the product must have.
instance HasOptionalParam SearchGroceryProducts MinCarbs where
  applyOptionalParam req (MinCarbs xs) =
    req `addQuery` toQuery ("minCarbs", Just xs)

-- | /Optional Param/ "maxCarbs" - The maximum amount of carbohydrates in grams the product can have.
instance HasOptionalParam SearchGroceryProducts MaxCarbs where
  applyOptionalParam req (MaxCarbs xs) =
    req `addQuery` toQuery ("maxCarbs", Just xs)

-- | /Optional Param/ "minProtein" - The minimum amount of protein in grams the product must have.
instance HasOptionalParam SearchGroceryProducts MinProtein where
  applyOptionalParam req (MinProtein xs) =
    req `addQuery` toQuery ("minProtein", Just xs)

-- | /Optional Param/ "maxProtein" - The maximum amount of protein in grams the product can have.
instance HasOptionalParam SearchGroceryProducts MaxProtein where
  applyOptionalParam req (MaxProtein xs) =
    req `addQuery` toQuery ("maxProtein", Just xs)

-- | /Optional Param/ "minFat" - The minimum amount of fat in grams the product must have.
instance HasOptionalParam SearchGroceryProducts MinFat where
  applyOptionalParam req (MinFat xs) =
    req `addQuery` toQuery ("minFat", Just xs)

-- | /Optional Param/ "maxFat" - The maximum amount of fat in grams the product can have.
instance HasOptionalParam SearchGroceryProducts MaxFat where
  applyOptionalParam req (MaxFat xs) =
    req `addQuery` toQuery ("maxFat", Just xs)

-- | /Optional Param/ "addProductInformation" - If set to true, you get more information about the products returned.
instance HasOptionalParam SearchGroceryProducts AddProductInformation where
  applyOptionalParam req (AddProductInformation xs) =
    req `addQuery` toQuery ("addProductInformation", Just xs)

-- | /Optional Param/ "offset" - The number of results to skip (between 0 and 900).
instance HasOptionalParam SearchGroceryProducts Offset where
  applyOptionalParam req (Offset xs) =
    req `addQuery` toQuery ("offset", Just xs)

-- | /Optional Param/ "number" - The maximum number of items to return (between 1 and 100). Defaults to 10.
instance HasOptionalParam SearchGroceryProducts Number where
  applyOptionalParam req (Number xs) =
    req `addQuery` toQuery ("number", Just xs)
-- | @application/json@
instance Produces SearchGroceryProducts MimeJSON


-- *** searchGroceryProductsByUPC

-- | @GET \/food\/products\/upc\/{upc}@
-- 
-- Search Grocery Products by UPC
-- 
-- Get information about a packaged food using its UPC.
-- 
-- AuthMethod: 'AuthApiKeyApiKeyScheme'
-- 
searchGroceryProductsByUPC
  :: Upc -- ^ "upc" -  The product's UPC.
  -> SpoonacularRequest SearchGroceryProductsByUPC MimeNoContent SearchGroceryProductsByUPC200Response MimeJSON
searchGroceryProductsByUPC (Upc upc) =
  _mkRequest "GET" ["/food/products/upc/",toPath upc]
    `_hasAuthType` (P.Proxy :: P.Proxy AuthApiKeyApiKeyScheme)

data SearchGroceryProductsByUPC  
-- | @application/json@
instance Produces SearchGroceryProductsByUPC MimeJSON


-- *** visualizeProductNutritionByID

-- | @GET \/food\/products\/{id}\/nutritionWidget@
-- 
-- Product Nutrition by ID Widget
-- 
-- Visualize a product's nutritional information as HTML including CSS.
-- 
-- AuthMethod: 'AuthApiKeyApiKeyScheme'
-- 
visualizeProductNutritionByID
  :: Id -- ^ "id" -  The item's id.
  -> SpoonacularRequest VisualizeProductNutritionByID MimeNoContent Text MimeTextHtml
visualizeProductNutritionByID (Id id) =
  _mkRequest "GET" ["/food/products/",toPath id,"/nutritionWidget"]
    `_hasAuthType` (P.Proxy :: P.Proxy AuthApiKeyApiKeyScheme)

data VisualizeProductNutritionByID  

-- | /Optional Param/ "defaultCss" - Whether the default CSS should be added to the response.
instance HasOptionalParam VisualizeProductNutritionByID DefaultCss where
  applyOptionalParam req (DefaultCss xs) =
    req `addQuery` toQuery ("defaultCss", Just xs)

-- | /Optional Param/ "Accept" - Accept header.
instance HasOptionalParam VisualizeProductNutritionByID ParamAccept where
  applyOptionalParam req (ParamAccept xs) =
    req `addHeader` toHeader ("Accept", xs)
-- | @text/html@
instance Produces VisualizeProductNutritionByID MimeTextHtml
