# NOTE: This file is auto generated by OpenAPI Generator 7.6.0-SNAPSHOT (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule OpenapiPetstore.Model.Return do
  @moduledoc """
  Model for testing reserved words
  """

  @derive Jason.Encoder
  defstruct [
    :return
  ]

  @type t :: %__MODULE__{
    :return => integer() | nil
  }

  def decode(value) do
    value
  end
end

