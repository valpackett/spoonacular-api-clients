--[[
  spoonacular API

  The spoonacular Nutrition, Recipe, and Food API allows you to access over thousands of recipes, thousands of ingredients, 800,000 food products, over 100,000 menu items, and restaurants. Our food ontology and semantic recipe search engine makes it possible to search for recipes using natural language queries, such as \"gluten free brownies without sugar\" or \"low fat vegan cupcakes.\" You can automatically calculate the nutritional information for any recipe, analyze recipe costs, visualize ingredient lists, find recipes for what's in your fridge, find recipes based on special diets, nutritional requirements, or favorite ingredients, classify recipes into types and cuisines, convert ingredient amounts, or even compute an entire meal plan. With our powerful API, you can create many kinds of food and especially nutrition apps.  Special diets/dietary requirements currently available include: vegan, vegetarian, pescetarian, gluten free, grain free, dairy free, high protein, whole 30, low sodium, low carb, Paleo, ketogenic, FODMAP, and Primal.

  The version of the OpenAPI document: 1.1
  Contact: mail@spoonacular.com
  Generated by: https://openapi-generator.tech
]]

-- ingredient_information class
local ingredient_information = {}
local ingredient_information_mt = {
	__name = "ingredient_information";
	__index = ingredient_information;
}

local function cast_ingredient_information(t)
	return setmetatable(t, ingredient_information_mt)
end

local function new_ingredient_information(id, original, original_name, name, amount, unit, unit_short, unit_long, possible_units, estimated_cost, consistency, shopping_list_units, aisle, image, meta, nutrition, category_path)
	return cast_ingredient_information({
		["id"] = id;
		["original"] = original;
		["originalName"] = original_name;
		["name"] = name;
		["amount"] = amount;
		["unit"] = unit;
		["unitShort"] = unit_short;
		["unitLong"] = unit_long;
		["possibleUnits"] = possible_units;
		["estimatedCost"] = estimated_cost;
		["consistency"] = consistency;
		["shoppingListUnits"] = shopping_list_units;
		["aisle"] = aisle;
		["image"] = image;
		["meta"] = meta;
		["nutrition"] = nutrition;
		["categoryPath"] = category_path;
	})
end

return {
	cast = cast_ingredient_information;
	new = new_ingredient_information;
}
