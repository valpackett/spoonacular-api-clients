# NOTE: This file is auto generated by OpenAPI Generator 7.8.0-SNAPSHOT (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule SpoonacularAPI.Model.GetRecipeNutritionWidgetById200ResponseBadInner do
  @moduledoc """
  
  """

  @derive Jason.Encoder
  defstruct [
    :title,
    :amount,
    :indented,
    :percentOfDailyNeeds
  ]

  @type t :: %__MODULE__{
    :title => String.t,
    :amount => String.t,
    :indented => boolean(),
    :percentOfDailyNeeds => float()
  }

  def decode(value) do
    value
  end
end

