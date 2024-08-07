# NOTE: This file is auto generated by OpenAPI Generator 7.8.0-SNAPSHOT (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule SpoonacularAPI.Model.MenuItem do
  @moduledoc """
  
  """

  @derive Jason.Encoder
  defstruct [
    :id,
    :title,
    :restaurantChain,
    :nutrition,
    :badges,
    :breadcrumbs,
    :generatedText,
    :imageType,
    :likes,
    :servings,
    :price,
    :spoonacularScore
  ]

  @type t :: %__MODULE__{
    :id => integer(),
    :title => String.t,
    :restaurantChain => String.t,
    :nutrition => SpoonacularAPI.Model.SearchGroceryProductsByUpc200ResponseNutrition.t | nil,
    :badges => [String.t] | nil,
    :breadcrumbs => [String.t] | nil,
    :generatedText => String.t | nil,
    :imageType => String.t | nil,
    :likes => integer() | nil,
    :servings => SpoonacularAPI.Model.MenuItemServings.t | nil,
    :price => float() | nil,
    :spoonacularScore => float() | nil
  }

  alias SpoonacularAPI.Deserializer

  def decode(value) do
    value
     |> Deserializer.deserialize(:nutrition, :struct, SpoonacularAPI.Model.SearchGroceryProductsByUpc200ResponseNutrition)
     |> Deserializer.deserialize(:servings, :struct, SpoonacularAPI.Model.MenuItemServings)
  end
end

