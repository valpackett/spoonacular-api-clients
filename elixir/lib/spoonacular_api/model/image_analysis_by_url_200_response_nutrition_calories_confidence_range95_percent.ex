# NOTE: This file is auto generated by OpenAPI Generator 7.3.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule SpoonacularAPI.Model.ImageAnalysisByUrl200ResponseNutritionCaloriesConfidenceRange95Percent do
  @moduledoc """
  
  """

  @derive Jason.Encoder
  defstruct [
    :min,
    :max
  ]

  @type t :: %__MODULE__{
    :min => float(),
    :max => float()
  }

  def decode(value) do
    value
  end
end
