# NOTE: This file is auto generated by OpenAPI Generator 7.7.0-SNAPSHOT (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule SpoonacularAPI.Model.GetRecipeInformation200ResponseExtendedIngredientsInnerMeasures do
  @moduledoc """
  
  """

  @derive Jason.Encoder
  defstruct [
    :metric,
    :us
  ]

  @type t :: %__MODULE__{
    :metric => SpoonacularAPI.Model.GetRecipeInformation200ResponseExtendedIngredientsInnerMeasuresMetric.t,
    :us => SpoonacularAPI.Model.GetRecipeInformation200ResponseExtendedIngredientsInnerMeasuresMetric.t
  }

  alias SpoonacularAPI.Deserializer

  def decode(value) do
    value
     |> Deserializer.deserialize(:metric, :struct, SpoonacularAPI.Model.GetRecipeInformation200ResponseExtendedIngredientsInnerMeasuresMetric)
     |> Deserializer.deserialize(:us, :struct, SpoonacularAPI.Model.GetRecipeInformation200ResponseExtendedIngredientsInnerMeasuresMetric)
  end
end

