# NOTE: This file is auto generated by OpenAPI Generator 7.8.0-SNAPSHOT (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule SpoonacularAPI.Model.GetShoppingList200ResponseAislesInner do
  @moduledoc """
  
  """

  @derive Jason.Encoder
  defstruct [
    :aisle,
    :items
  ]

  @type t :: %__MODULE__{
    :aisle => String.t,
    :items => [SpoonacularAPI.Model.GetShoppingList200ResponseAislesInnerItemsInner.t] | nil
  }

  alias SpoonacularAPI.Deserializer

  def decode(value) do
    value
     |> Deserializer.deserialize(:items, :list, SpoonacularAPI.Model.GetShoppingList200ResponseAislesInnerItemsInner)
  end
end

