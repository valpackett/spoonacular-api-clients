# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule com.spoonacular.client.Api.Default do
  @moduledoc """
  API calls for all endpoints tagged `Default`.
  """

  alias com.spoonacular.client.Connection
  import com.spoonacular.client.RequestBuilder


  @doc """
  Analyze Recipe
  This endpoint allows you to send raw recipe information, such as title, servings, and ingredients, to then see what we compute (badges, diets, nutrition, and more). This is useful if you have your own recipe data and want to enrich it with our semantic analysis.

  ## Parameters

  - connection (com.spoonacular.client.Connection): Connection to server
  - analyze_recipe_request (AnalyzeRecipeRequest): Example request body.
  - opts (KeywordList): [optional] Optional parameters
    - :language (String.t): The input language, either \"en\" or \"de\".
    - :include_nutrition (boolean()): Whether nutrition data should be added to correctly parsed ingredients.
    - :include_taste (boolean()): Whether taste data should be added to correctly parsed ingredients.
  ## Returns

  {:ok, map()} on success
  {:error, Tesla.Env.t} on failure
  """
  @spec analyze_recipe(Tesla.Env.client, com.spoonacular.client.Model.AnalyzeRecipeRequest.t, keyword()) :: {:ok, nil} | {:ok, Map.t} | {:error, Tesla.Env.t}
  def analyze_recipe(connection, analyze_recipe_request, opts \\ []) do
    optional_params = %{
      :language => :query,
      :includeNutrition => :query,
      :includeTaste => :query
    }
    %{}
    |> method(:post)
    |> url("/recipes/analyze")
    |> add_param(:body, :body, analyze_recipe_request)
    |> add_optional_params(optional_params, opts)
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> evaluate_response([
      { 200, %{}},
      { 401, false},
      { 403, false},
      { 404, false}
    ])
  end

  @doc """
  Search Restaurants
  Search through thousands of restaurants (in North America) by location, cuisine, budget, and more.

  ## Parameters

  - connection (com.spoonacular.client.Connection): Connection to server
  - opts (KeywordList): [optional] Optional parameters
    - :query (String.t): The search query.
    - :lat (float()): The latitude of the user's location.
    - :lng (float()): The longitude of the user's location.\".
    - :distance (float()): The distance around the location in miles.
    - :budget (float()): The user's budget for a meal in USD.
    - :cuisine (String.t): The cuisine of the restaurant.
    - :min_rating (float()): The minimum rating of the restaurant between 0 and 5.
    - :is_open (boolean()): Whether the restaurant must be open at the time of search.
    - :sort (String.t): How to sort the results, one of the following 'cheapest', 'fastest', 'rating', 'distance' or the default 'relevance'.
    - :page (float()): The page number of results.
  ## Returns

  {:ok, com.spoonacular.client.Model.SearchRestaurants200Response.t} on success
  {:error, Tesla.Env.t} on failure
  """
  @spec search_restaurants(Tesla.Env.client, keyword()) :: {:ok, nil} | {:ok, com.spoonacular.client.Model.SearchRestaurants200Response.t} | {:error, Tesla.Env.t}
  def search_restaurants(connection, opts \\ []) do
    optional_params = %{
      :query => :query,
      :lat => :query,
      :lng => :query,
      :distance => :query,
      :budget => :query,
      :cuisine => :query,
      :"min-rating" => :query,
      :"is-open" => :query,
      :sort => :query,
      :page => :query
    }
    %{}
    |> method(:get)
    |> url("/food/restaurants/search")
    |> add_optional_params(optional_params, opts)
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> evaluate_response([
      { 200, %com.spoonacular.client.Model.SearchRestaurants200Response{}},
      { 401, false},
      { 403, false},
      { 404, false}
    ])
  end
end