# NOTE: This file is auto generated by OpenAPI Generator 7.8.0-SNAPSHOT (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule SpoonacularAPI.Model.GetShoppingList200ResponseAislesInnerItemsInnerMeasures do
  @moduledoc """
  
  """

  @derive Jason.Encoder
  defstruct [
    :original,
    :metric,
    :us
  ]

  @type t :: %__MODULE__{
    :original => SpoonacularAPI.Model.GetShoppingList200ResponseAislesInnerItemsInnerMeasuresOriginal.t,
    :metric => SpoonacularAPI.Model.GetShoppingList200ResponseAislesInnerItemsInnerMeasuresOriginal.t,
    :us => SpoonacularAPI.Model.GetShoppingList200ResponseAislesInnerItemsInnerMeasuresOriginal.t
  }

  alias SpoonacularAPI.Deserializer

  def decode(value) do
    value
     |> Deserializer.deserialize(:original, :struct, SpoonacularAPI.Model.GetShoppingList200ResponseAislesInnerItemsInnerMeasuresOriginal)
     |> Deserializer.deserialize(:metric, :struct, SpoonacularAPI.Model.GetShoppingList200ResponseAislesInnerItemsInnerMeasuresOriginal)
     |> Deserializer.deserialize(:us, :struct, SpoonacularAPI.Model.GetShoppingList200ResponseAislesInnerItemsInnerMeasuresOriginal)
  end
end

