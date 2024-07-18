=begin
#spoonacular API

#The spoonacular Nutrition, Recipe, and Food API allows you to access over thousands of recipes, thousands of ingredients, 800,000 food products, over 100,000 menu items, and restaurants. Our food ontology and semantic recipe search engine makes it possible to search for recipes using natural language queries, such as \"gluten free brownies without sugar\" or \"low fat vegan cupcakes.\" You can automatically calculate the nutritional information for any recipe, analyze recipe costs, visualize ingredient lists, find recipes for what's in your fridge, find recipes based on special diets, nutritional requirements, or favorite ingredients, classify recipes into types and cuisines, convert ingredient amounts, or even compute an entire meal plan. With our powerful API, you can create many kinds of food and especially nutrition apps.  Special diets/dietary requirements currently available include: vegan, vegetarian, pescetarian, gluten free, grain free, dairy free, high protein, whole 30, low sodium, low carb, Paleo, ketogenic, FODMAP, and Primal.

The version of the OpenAPI document: 1.1
Contact: mail@spoonacular.com
Generated by: https://openapi-generator.tech
Generator version: 7.8.0-SNAPSHOT

=end

# Common files
require 'openapi_client/api_client'
require 'openapi_client/api_error'
require 'openapi_client/version'
require 'openapi_client/configuration'

# Models
require 'openapi_client/models/add_meal_plan_template200_response'
require 'openapi_client/models/add_meal_plan_template200_response_items_inner'
require 'openapi_client/models/add_meal_plan_template200_response_items_inner_value'
require 'openapi_client/models/add_to_meal_plan_request'
require 'openapi_client/models/add_to_meal_plan_request_value'
require 'openapi_client/models/add_to_meal_plan_request_value_ingredients_inner'
require 'openapi_client/models/add_to_shopping_list_request'
require 'openapi_client/models/analyze_a_recipe_search_query200_response'
require 'openapi_client/models/analyze_a_recipe_search_query200_response_dishes_inner'
require 'openapi_client/models/analyze_a_recipe_search_query200_response_ingredients_inner'
require 'openapi_client/models/analyze_recipe_instructions200_response'
require 'openapi_client/models/analyze_recipe_instructions200_response_ingredients_inner'
require 'openapi_client/models/analyze_recipe_instructions200_response_parsed_instructions_inner'
require 'openapi_client/models/analyze_recipe_instructions200_response_parsed_instructions_inner_steps_inner'
require 'openapi_client/models/analyze_recipe_instructions200_response_parsed_instructions_inner_steps_inner_ingredients_inner'
require 'openapi_client/models/analyze_recipe_request'
require 'openapi_client/models/autocomplete_ingredient_search200_response_inner'
require 'openapi_client/models/autocomplete_product_search200_response'
require 'openapi_client/models/autocomplete_product_search200_response_results_inner'
require 'openapi_client/models/autocomplete_recipe_search200_response_inner'
require 'openapi_client/models/classify_cuisine200_response'
require 'openapi_client/models/classify_grocery_product200_response'
require 'openapi_client/models/classify_grocery_product_bulk200_response_inner'
require 'openapi_client/models/classify_grocery_product_bulk_request_inner'
require 'openapi_client/models/classify_grocery_product_request'
require 'openapi_client/models/comparable_product'
require 'openapi_client/models/compute_glycemic_load200_response'
require 'openapi_client/models/compute_glycemic_load200_response_ingredients_inner'
require 'openapi_client/models/compute_glycemic_load_request'
require 'openapi_client/models/compute_ingredient_amount200_response'
require 'openapi_client/models/connect_user200_response'
require 'openapi_client/models/connect_user_request'
require 'openapi_client/models/convert_amounts200_response'
require 'openapi_client/models/create_recipe_card200_response'
require 'openapi_client/models/detect_food_in_text200_response'
require 'openapi_client/models/detect_food_in_text200_response_annotations_inner'
require 'openapi_client/models/generate_meal_plan200_response'
require 'openapi_client/models/generate_meal_plan200_response_nutrients'
require 'openapi_client/models/get_a_random_food_joke200_response'
require 'openapi_client/models/get_analyzed_recipe_instructions200_response_inner'
require 'openapi_client/models/get_analyzed_recipe_instructions200_response_inner_steps_inner'
require 'openapi_client/models/get_analyzed_recipe_instructions200_response_inner_steps_inner_ingredients_inner'
require 'openapi_client/models/get_comparable_products200_response'
require 'openapi_client/models/get_comparable_products200_response_comparable_products'
require 'openapi_client/models/get_conversation_suggests200_response'
require 'openapi_client/models/get_conversation_suggests200_response_suggests'
require 'openapi_client/models/get_conversation_suggests200_response_suggests_inner'
require 'openapi_client/models/get_dish_pairing_for_wine200_response'
require 'openapi_client/models/get_ingredient_substitutes200_response'
require 'openapi_client/models/get_meal_plan_template200_response'
require 'openapi_client/models/get_meal_plan_template200_response_days_inner'
require 'openapi_client/models/get_meal_plan_template200_response_days_inner_items_inner'
require 'openapi_client/models/get_meal_plan_template200_response_days_inner_items_inner_value'
require 'openapi_client/models/get_meal_plan_templates200_response'
require 'openapi_client/models/get_meal_plan_templates200_response_templates_inner'
require 'openapi_client/models/get_meal_plan_week200_response'
require 'openapi_client/models/get_meal_plan_week200_response_days_inner'
require 'openapi_client/models/get_meal_plan_week200_response_days_inner_items_inner'
require 'openapi_client/models/get_meal_plan_week200_response_days_inner_items_inner_value'
require 'openapi_client/models/get_meal_plan_week200_response_days_inner_nutrition_summary'
require 'openapi_client/models/get_meal_plan_week200_response_days_inner_nutrition_summary_nutrients_inner'
require 'openapi_client/models/get_random_recipes200_response'
require 'openapi_client/models/get_recipe_equipment_by_id200_response'
require 'openapi_client/models/get_recipe_equipment_by_id200_response_equipment_inner'
require 'openapi_client/models/get_recipe_ingredients_by_id200_response'
require 'openapi_client/models/get_recipe_ingredients_by_id200_response_ingredients_inner'
require 'openapi_client/models/get_recipe_nutrition_widget_by_id200_response'
require 'openapi_client/models/get_recipe_nutrition_widget_by_id200_response_bad_inner'
require 'openapi_client/models/get_recipe_nutrition_widget_by_id200_response_good_inner'
require 'openapi_client/models/get_recipe_price_breakdown_by_id200_response'
require 'openapi_client/models/get_recipe_price_breakdown_by_id200_response_ingredients_inner'
require 'openapi_client/models/get_recipe_price_breakdown_by_id200_response_ingredients_inner_amount'
require 'openapi_client/models/get_recipe_price_breakdown_by_id200_response_ingredients_inner_amount_metric'
require 'openapi_client/models/get_shopping_list200_response'
require 'openapi_client/models/get_shopping_list200_response_aisles_inner'
require 'openapi_client/models/get_shopping_list200_response_aisles_inner_items_inner'
require 'openapi_client/models/get_shopping_list200_response_aisles_inner_items_inner_measures'
require 'openapi_client/models/get_shopping_list200_response_aisles_inner_items_inner_measures_original'
require 'openapi_client/models/get_similar_recipes200_response_inner'
require 'openapi_client/models/get_wine_description200_response'
require 'openapi_client/models/get_wine_pairing200_response'
require 'openapi_client/models/get_wine_pairing200_response_product_matches_inner'
require 'openapi_client/models/get_wine_recommendation200_response'
require 'openapi_client/models/get_wine_recommendation200_response_recommended_wines_inner'
require 'openapi_client/models/guess_nutrition_by_dish_name200_response'
require 'openapi_client/models/guess_nutrition_by_dish_name200_response_calories'
require 'openapi_client/models/guess_nutrition_by_dish_name200_response_calories_confidence_range95_percent'
require 'openapi_client/models/image_analysis_by_url200_response'
require 'openapi_client/models/image_analysis_by_url200_response_category'
require 'openapi_client/models/image_analysis_by_url200_response_nutrition'
require 'openapi_client/models/image_analysis_by_url200_response_nutrition_calories'
require 'openapi_client/models/image_analysis_by_url200_response_nutrition_calories_confidence_range95_percent'
require 'openapi_client/models/image_analysis_by_url200_response_recipes_inner'
require 'openapi_client/models/image_classification_by_url200_response'
require 'openapi_client/models/ingredient_basics'
require 'openapi_client/models/ingredient_information'
require 'openapi_client/models/ingredient_information_estimated_cost'
require 'openapi_client/models/ingredient_information_nutrition'
require 'openapi_client/models/ingredient_information_nutrition_properties_inner'
require 'openapi_client/models/ingredient_search200_response'
require 'openapi_client/models/ingredient_search200_response_results_inner'
require 'openapi_client/models/map_ingredients_to_grocery_products200_response_inner'
require 'openapi_client/models/map_ingredients_to_grocery_products200_response_inner_products_inner'
require 'openapi_client/models/map_ingredients_to_grocery_products_request'
require 'openapi_client/models/menu_item'
require 'openapi_client/models/menu_item_servings'
require 'openapi_client/models/product_information'
require 'openapi_client/models/product_information_credits'
require 'openapi_client/models/quick_answer200_response'
require 'openapi_client/models/recipe_information'
require 'openapi_client/models/recipe_information_extended_ingredients_inner'
require 'openapi_client/models/recipe_information_extended_ingredients_inner_measures'
require 'openapi_client/models/recipe_information_extended_ingredients_inner_measures_metric'
require 'openapi_client/models/recipe_information_wine_pairing'
require 'openapi_client/models/recipe_information_wine_pairing_product_matches_inner'
require 'openapi_client/models/search_all_food200_response'
require 'openapi_client/models/search_all_food200_response_search_results_inner'
require 'openapi_client/models/search_custom_foods200_response'
require 'openapi_client/models/search_custom_foods200_response_custom_foods_inner'
require 'openapi_client/models/search_food_videos200_response'
require 'openapi_client/models/search_food_videos200_response_videos_inner'
require 'openapi_client/models/search_grocery_products200_response'
require 'openapi_client/models/search_grocery_products_by_upc200_response'
require 'openapi_client/models/search_grocery_products_by_upc200_response_nutrition'
require 'openapi_client/models/search_grocery_products_by_upc200_response_nutrition_caloric_breakdown'
require 'openapi_client/models/search_grocery_products_by_upc200_response_nutrition_nutrients_inner'
require 'openapi_client/models/search_grocery_products_by_upc200_response_servings'
require 'openapi_client/models/search_menu_items200_response'
require 'openapi_client/models/search_recipes200_response'
require 'openapi_client/models/search_recipes200_response_results_inner'
require 'openapi_client/models/search_recipes_by_ingredients200_response_inner'
require 'openapi_client/models/search_recipes_by_ingredients200_response_inner_missed_ingredients_inner'
require 'openapi_client/models/search_recipes_by_nutrients200_response_inner'
require 'openapi_client/models/search_restaurants200_response'
require 'openapi_client/models/search_restaurants200_response_restaurants_inner'
require 'openapi_client/models/search_restaurants200_response_restaurants_inner_address'
require 'openapi_client/models/search_restaurants200_response_restaurants_inner_local_hours'
require 'openapi_client/models/search_restaurants200_response_restaurants_inner_local_hours_operational'
require 'openapi_client/models/search_result'
require 'openapi_client/models/search_result_data_points_inner'
require 'openapi_client/models/search_site_content200_response'
require 'openapi_client/models/summarize_recipe200_response'
require 'openapi_client/models/talk_to_chatbot200_response'
require 'openapi_client/models/talk_to_chatbot200_response_media_inner'
require 'openapi_client/models/taste_information'

# APIs
require 'openapi_client/api/default_api'
require 'openapi_client/api/ingredients_api'
require 'openapi_client/api/meal_planning_api'
require 'openapi_client/api/menu_items_api'
require 'openapi_client/api/misc_api'
require 'openapi_client/api/products_api'
require 'openapi_client/api/recipes_api'
require 'openapi_client/api/wine_api'

module OpenapiClient
  class << self
    # Customize default settings for the SDK using block.
    #   OpenapiClient.configure do |config|
    #     config.username = "xxx"
    #     config.password = "xxx"
    #   end
    # If no block given, return the default Configuration object.
    def configure
      if block_given?
        yield(Configuration.default)
      else
        Configuration.default
      end
    end
  end
end
