--[[
  spoonacular API

  The spoonacular Nutrition, Recipe, and Food API allows you to access over thousands of recipes, thousands of ingredients, 800,000 food products, over 100,000 menu items, and restaurants. Our food ontology and semantic recipe search engine makes it possible to search for recipes using natural language queries, such as \"gluten free brownies without sugar\" or \"low fat vegan cupcakes.\" You can automatically calculate the nutritional information for any recipe, analyze recipe costs, visualize ingredient lists, find recipes for what's in your fridge, find recipes based on special diets, nutritional requirements, or favorite ingredients, classify recipes into types and cuisines, convert ingredient amounts, or even compute an entire meal plan. With our powerful API, you can create many kinds of food and especially nutrition apps.  Special diets/dietary requirements currently available include: vegan, vegetarian, pescetarian, gluten free, grain free, dairy free, high protein, whole 30, low sodium, low carb, Paleo, ketogenic, FODMAP, and Primal.

  The version of the OpenAPI document: 1.1
  Contact: mail@spoonacular.com
  Generated by: https://openapi-generator.tech
]]

-- search_result class
local search_result = {}
local search_result_mt = {
	__name = "search_result";
	__index = search_result;
}

local function cast_search_result(t)
	return setmetatable(t, search_result_mt)
end

local function new_search_result(data_points, image, link, name, type, kvtable, content, id, relevance)
	return cast_search_result({
		["dataPoints"] = data_points;
		["image"] = image;
		["link"] = link;
		["name"] = name;
		["type"] = type;
		["kvtable"] = kvtable;
		["content"] = content;
		["id"] = id;
		["relevance"] = relevance;
	})
end

return {
	cast = cast_search_result;
	new = new_search_result;
}
