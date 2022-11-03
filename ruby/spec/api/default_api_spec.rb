=begin
#spoonacular API

#The spoonacular Nutrition, Recipe, and Food API allows you to access over thousands of recipes, thousands of ingredients, 800,000 food products, over 100,000 menu items, and restaurants. Our food ontology and semantic recipe search engine makes it possible to search for recipes using natural language queries, such as \"gluten free brownies without sugar\" or \"low fat vegan cupcakes.\" You can automatically calculate the nutritional information for any recipe, analyze recipe costs, visualize ingredient lists, find recipes for what's in your fridge, find recipes based on special diets, nutritional requirements, or favorite ingredients, classify recipes into types and cuisines, convert ingredient amounts, or even compute an entire meal plan. With our powerful API, you can create many kinds of food and especially nutrition apps.  Special diets/dietary requirements currently available include: vegan, vegetarian, pescetarian, gluten free, grain free, dairy free, high protein, whole 30, low sodium, low carb, Paleo, ketogenic, FODMAP, and Primal.

The version of the OpenAPI document: 1.1
Contact: mail@spoonacular.com
Generated by: https://openapi-generator.tech
OpenAPI Generator version: 6.0.1

=end

require 'spec_helper'
require 'json'

# Unit tests for OpenapiClient::DefaultApi
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe 'DefaultApi' do
  before do
    # run before each test
    @api_instance = OpenapiClient::DefaultApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of DefaultApi' do
    it 'should create an instance of DefaultApi' do
      expect(@api_instance).to be_instance_of(OpenapiClient::DefaultApi)
    end
  end

  # unit tests for analyze_recipe
  # Analyze Recipe
  # This endpoint allows you to send raw recipe information, such as title, servings, and ingredients, to then see what we compute (badges, diets, nutrition, and more). This is useful if you have your own recipe data and want to enrich it with our semantic analysis.
  # @param analyze_recipe_request Example request body.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :language The input language, either \&quot;en\&quot; or \&quot;de\&quot;.
  # @option opts [Boolean] :include_nutrition Whether nutrition data should be added to correctly parsed ingredients.
  # @option opts [Boolean] :include_taste Whether taste data should be added to correctly parsed ingredients.
  # @return [Object]
  describe 'analyze_recipe test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for search_restaurants
  # Search Restaurants
  # Search through thousands of restaurants (in North America) by location, cuisine, budget, and more.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :query The search query.
  # @option opts [Float] :lat The latitude of the user&#39;s location.
  # @option opts [Float] :lng The longitude of the user&#39;s location.\&quot;.
  # @option opts [Float] :distance The distance around the location in miles.
  # @option opts [Float] :budget The user&#39;s budget for a meal in USD.
  # @option opts [String] :cuisine The cuisine of the restaurant.
  # @option opts [Float] :min_rating The minimum rating of the restaurant between 0 and 5.
  # @option opts [Boolean] :is_open Whether the restaurant must be open at the time of search.
  # @option opts [String] :sort How to sort the results, one of the following &#39;cheapest&#39;, &#39;fastest&#39;, &#39;rating&#39;, &#39;distance&#39; or the default &#39;relevance&#39;.
  # @option opts [Float] :page The page number of results.
  # @return [SearchRestaurants200Response]
  describe 'search_restaurants test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end