# coding: utf-8

"""
    spoonacular API

    The spoonacular Nutrition, Recipe, and Food API allows you to access over thousands of recipes, thousands of ingredients, 800,000 food products, over 100,000 menu items, and restaurants. Our food ontology and semantic recipe search engine makes it possible to search for recipes using natural language queries, such as \"gluten free brownies without sugar\" or \"low fat vegan cupcakes.\" You can automatically calculate the nutritional information for any recipe, analyze recipe costs, visualize ingredient lists, find recipes for what's in your fridge, find recipes based on special diets, nutritional requirements, or favorite ingredients, classify recipes into types and cuisines, convert ingredient amounts, or even compute an entire meal plan. With our powerful API, you can create many kinds of food and especially nutrition apps.  Special diets/dietary requirements currently available include: vegan, vegetarian, pescetarian, gluten free, grain free, dairy free, high protein, whole 30, low sodium, low carb, Paleo, ketogenic, FODMAP, and Primal.

    The version of the OpenAPI document: 1.1
    Contact: mail@spoonacular.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from spoonacular.models.ingredient_information_nutrition import IngredientInformationNutrition

class TestIngredientInformationNutrition(unittest.TestCase):
    """IngredientInformationNutrition unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> IngredientInformationNutrition:
        """Test IngredientInformationNutrition
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `IngredientInformationNutrition`
        """
        model = IngredientInformationNutrition()
        if include_optional:
            return IngredientInformationNutrition(
                nutrients = [
                    spoonacular.models.search_grocery_products_by_upc_200_response_nutrition_nutrients_inner.searchGroceryProductsByUPC_200_response_nutrition_nutrients_inner(
                        name = '0', 
                        amount = 1.337, 
                        unit = '0', 
                        percent_of_daily_needs = 1.337, )
                    ],
                properties = [
                    spoonacular.models.ingredient_information_nutrition_properties_inner.IngredientInformation_nutrition_properties_inner(
                        name = '0', 
                        amount = 1.337, 
                        unit = '', )
                    ],
                caloric_breakdown = spoonacular.models.search_grocery_products_by_upc_200_response_nutrition_caloric_breakdown.searchGroceryProductsByUPC_200_response_nutrition_caloricBreakdown(
                    percent_protein = 1.337, 
                    percent_fat = 1.337, 
                    percent_carbs = 1.337, ),
                weight_per_serving = spoonacular.models.get_shopping_list_200_response_aisles_inner_items_inner_measures_original.getShoppingList_200_response_aisles_inner_items_inner_measures_original(
                    amount = 1.337, 
                    unit = '0', )
            )
        else:
            return IngredientInformationNutrition(
                nutrients = [
                    spoonacular.models.search_grocery_products_by_upc_200_response_nutrition_nutrients_inner.searchGroceryProductsByUPC_200_response_nutrition_nutrients_inner(
                        name = '0', 
                        amount = 1.337, 
                        unit = '0', 
                        percent_of_daily_needs = 1.337, )
                    ],
                properties = [
                    spoonacular.models.ingredient_information_nutrition_properties_inner.IngredientInformation_nutrition_properties_inner(
                        name = '0', 
                        amount = 1.337, 
                        unit = '', )
                    ],
                caloric_breakdown = spoonacular.models.search_grocery_products_by_upc_200_response_nutrition_caloric_breakdown.searchGroceryProductsByUPC_200_response_nutrition_caloricBreakdown(
                    percent_protein = 1.337, 
                    percent_fat = 1.337, 
                    percent_carbs = 1.337, ),
                weight_per_serving = spoonacular.models.get_shopping_list_200_response_aisles_inner_items_inner_measures_original.getShoppingList_200_response_aisles_inner_items_inner_measures_original(
                    amount = 1.337, 
                    unit = '0', ),
        )
        """

    def testIngredientInformationNutrition(self):
        """Test IngredientInformationNutrition"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
