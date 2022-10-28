# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule com.spoonacular.client.Model.SearchSiteContent200ResponseArticlesInner do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :dataPoints,
    :image,
    :link,
    :name
  ]

  @type t :: %__MODULE__{
    :dataPoints => [AnyType] | nil,
    :image => String.t,
    :link => String.t,
    :name => String.t
  }
end

defimpl Poison.Decoder, for: com.spoonacular.client.Model.SearchSiteContent200ResponseArticlesInner do
  import com.spoonacular.client.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:dataPoints, :list, com.spoonacular.client.Model.AnyType, options)
  end
end
