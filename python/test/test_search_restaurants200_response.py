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

from spoonacular.models.search_restaurants200_response import SearchRestaurants200Response

class TestSearchRestaurants200Response(unittest.TestCase):
    """SearchRestaurants200Response unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> SearchRestaurants200Response:
        """Test SearchRestaurants200Response
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `SearchRestaurants200Response`
        """
        model = SearchRestaurants200Response()
        if include_optional:
            return SearchRestaurants200Response(
                restaurants = [
                    spoonacular.models.search_restaurants_200_response_restaurants_inner.searchRestaurants_200_response_restaurants_inner(
                        _id = '', 
                        name = '', 
                        phone_number = 56, 
                        address = spoonacular.models.search_restaurants_200_response_restaurants_inner_address.searchRestaurants_200_response_restaurants_inner_address(
                            street_addr = '', 
                            city = '', 
                            state = '', 
                            zipcode = '', 
                            country = '', 
                            lat = 1.337, 
                            lon = 1.337, 
                            street_addr_2 = '', 
                            latitude = 1.337, 
                            longitude = 1.337, ), 
                        type = '', 
                        description = '', 
                        local_hours = spoonacular.models.search_restaurants_200_response_restaurants_inner_local_hours.searchRestaurants_200_response_restaurants_inner_local_hours(
                            operational = spoonacular.models.search_restaurants_200_response_restaurants_inner_local_hours_operational.searchRestaurants_200_response_restaurants_inner_local_hours_operational(
                                monday = '', 
                                tuesday = '', 
                                wednesday = '', 
                                thursday = '', 
                                friday = '', 
                                saturday = '', 
                                sunday = '', ), 
                            delivery = spoonacular.models.search_restaurants_200_response_restaurants_inner_local_hours_operational.searchRestaurants_200_response_restaurants_inner_local_hours_operational(
                                monday = '', 
                                tuesday = '', 
                                wednesday = '', 
                                thursday = '', 
                                friday = '', 
                                saturday = '', 
                                sunday = '', ), 
                            pickup = , 
                            dine_in = , ), 
                        cuisines = [
                            ''
                            ], 
                        food_photos = [
                            ''
                            ], 
                        logo_photos = [
                            ''
                            ], 
                        store_photos = [
                            ''
                            ], 
                        dollar_signs = 56, 
                        pickup_enabled = True, 
                        delivery_enabled = True, 
                        is_open = True, 
                        offers_first_party_delivery = True, 
                        offers_third_party_delivery = True, 
                        miles = 1.337, 
                        weighted_rating_value = 1.337, 
                        aggregated_rating_count = 56, )
                    ]
            )
        else:
            return SearchRestaurants200Response(
        )
        """

    def testSearchRestaurants200Response(self):
        """Test SearchRestaurants200Response"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
