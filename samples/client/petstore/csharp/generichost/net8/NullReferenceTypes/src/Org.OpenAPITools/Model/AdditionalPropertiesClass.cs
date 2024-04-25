// <auto-generated>
/*
 * OpenAPI Petstore
 *
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

#nullable enable

using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Text.Json;
using System.Text.Json.Serialization;
using System.ComponentModel.DataAnnotations;
using OpenAPIClientUtils = Org.OpenAPITools.Client.ClientUtils;
using Org.OpenAPITools.Client;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// AdditionalPropertiesClass
    /// </summary>
    public partial class AdditionalPropertiesClass : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="AdditionalPropertiesClass" /> class.
        /// </summary>
        /// <param name="anytype1">anytype1</param>
        /// <param name="emptyMap">an object with no declared properties and no undeclared properties, hence it&#39;s an empty map.</param>
        /// <param name="mapOfMapProperty">mapOfMapProperty</param>
        /// <param name="mapProperty">mapProperty</param>
        /// <param name="mapWithUndeclaredPropertiesAnytype1">mapWithUndeclaredPropertiesAnytype1</param>
        /// <param name="mapWithUndeclaredPropertiesAnytype2">mapWithUndeclaredPropertiesAnytype2</param>
        /// <param name="mapWithUndeclaredPropertiesAnytype3">mapWithUndeclaredPropertiesAnytype3</param>
        /// <param name="mapWithUndeclaredPropertiesString">mapWithUndeclaredPropertiesString</param>
        [JsonConstructor]
        public AdditionalPropertiesClass(Option<Object?> anytype1 = default, Option<Object?> emptyMap = default, Option<Dictionary<string, Dictionary<string, string>>?> mapOfMapProperty = default, Option<Dictionary<string, string>?> mapProperty = default, Option<Object?> mapWithUndeclaredPropertiesAnytype1 = default, Option<Object?> mapWithUndeclaredPropertiesAnytype2 = default, Option<Dictionary<string, Object>?> mapWithUndeclaredPropertiesAnytype3 = default, Option<Dictionary<string, string>?> mapWithUndeclaredPropertiesString = default)
        {
            Anytype1Option = anytype1;
            EmptyMapOption = emptyMap;
            MapOfMapPropertyOption = mapOfMapProperty;
            MapPropertyOption = mapProperty;
            MapWithUndeclaredPropertiesAnytype1Option = mapWithUndeclaredPropertiesAnytype1;
            MapWithUndeclaredPropertiesAnytype2Option = mapWithUndeclaredPropertiesAnytype2;
            MapWithUndeclaredPropertiesAnytype3Option = mapWithUndeclaredPropertiesAnytype3;
            MapWithUndeclaredPropertiesStringOption = mapWithUndeclaredPropertiesString;
            OnCreated();
        }

        partial void OnCreated();

        /// <summary>
        /// Used to track the state of Anytype1
        /// </summary>
        [JsonIgnore]
        [System.ComponentModel.EditorBrowsable(System.ComponentModel.EditorBrowsableState.Never)]
        public Option<Object?> Anytype1Option { get; private set; }

        /// <summary>
        /// Gets or Sets Anytype1
        /// </summary>
        [JsonPropertyName("anytype_1")]
        public Object? Anytype1 { get { return this.Anytype1Option; } set { this.Anytype1Option = new(value); } }

        /// <summary>
        /// Used to track the state of EmptyMap
        /// </summary>
        [JsonIgnore]
        [System.ComponentModel.EditorBrowsable(System.ComponentModel.EditorBrowsableState.Never)]
        public Option<Object?> EmptyMapOption { get; private set; }

        /// <summary>
        /// an object with no declared properties and no undeclared properties, hence it&#39;s an empty map.
        /// </summary>
        /// <value>an object with no declared properties and no undeclared properties, hence it&#39;s an empty map.</value>
        [JsonPropertyName("empty_map")]
        public Object? EmptyMap { get { return this.EmptyMapOption; } set { this.EmptyMapOption = new(value); } }

        /// <summary>
        /// Used to track the state of MapOfMapProperty
        /// </summary>
        [JsonIgnore]
        [System.ComponentModel.EditorBrowsable(System.ComponentModel.EditorBrowsableState.Never)]
        public Option<Dictionary<string, Dictionary<string, string>>?> MapOfMapPropertyOption { get; private set; }

        /// <summary>
        /// Gets or Sets MapOfMapProperty
        /// </summary>
        [JsonPropertyName("map_of_map_property")]
        public Dictionary<string, Dictionary<string, string>>? MapOfMapProperty { get { return this.MapOfMapPropertyOption; } set { this.MapOfMapPropertyOption = new(value); } }

        /// <summary>
        /// Used to track the state of MapProperty
        /// </summary>
        [JsonIgnore]
        [System.ComponentModel.EditorBrowsable(System.ComponentModel.EditorBrowsableState.Never)]
        public Option<Dictionary<string, string>?> MapPropertyOption { get; private set; }

        /// <summary>
        /// Gets or Sets MapProperty
        /// </summary>
        [JsonPropertyName("map_property")]
        public Dictionary<string, string>? MapProperty { get { return this.MapPropertyOption; } set { this.MapPropertyOption = new(value); } }

        /// <summary>
        /// Used to track the state of MapWithUndeclaredPropertiesAnytype1
        /// </summary>
        [JsonIgnore]
        [System.ComponentModel.EditorBrowsable(System.ComponentModel.EditorBrowsableState.Never)]
        public Option<Object?> MapWithUndeclaredPropertiesAnytype1Option { get; private set; }

        /// <summary>
        /// Gets or Sets MapWithUndeclaredPropertiesAnytype1
        /// </summary>
        [JsonPropertyName("map_with_undeclared_properties_anytype_1")]
        public Object? MapWithUndeclaredPropertiesAnytype1 { get { return this.MapWithUndeclaredPropertiesAnytype1Option; } set { this.MapWithUndeclaredPropertiesAnytype1Option = new(value); } }

        /// <summary>
        /// Used to track the state of MapWithUndeclaredPropertiesAnytype2
        /// </summary>
        [JsonIgnore]
        [System.ComponentModel.EditorBrowsable(System.ComponentModel.EditorBrowsableState.Never)]
        public Option<Object?> MapWithUndeclaredPropertiesAnytype2Option { get; private set; }

        /// <summary>
        /// Gets or Sets MapWithUndeclaredPropertiesAnytype2
        /// </summary>
        [JsonPropertyName("map_with_undeclared_properties_anytype_2")]
        public Object? MapWithUndeclaredPropertiesAnytype2 { get { return this.MapWithUndeclaredPropertiesAnytype2Option; } set { this.MapWithUndeclaredPropertiesAnytype2Option = new(value); } }

        /// <summary>
        /// Used to track the state of MapWithUndeclaredPropertiesAnytype3
        /// </summary>
        [JsonIgnore]
        [System.ComponentModel.EditorBrowsable(System.ComponentModel.EditorBrowsableState.Never)]
        public Option<Dictionary<string, Object>?> MapWithUndeclaredPropertiesAnytype3Option { get; private set; }

        /// <summary>
        /// Gets or Sets MapWithUndeclaredPropertiesAnytype3
        /// </summary>
        [JsonPropertyName("map_with_undeclared_properties_anytype_3")]
        public Dictionary<string, Object>? MapWithUndeclaredPropertiesAnytype3 { get { return this.MapWithUndeclaredPropertiesAnytype3Option; } set { this.MapWithUndeclaredPropertiesAnytype3Option = new(value); } }

        /// <summary>
        /// Used to track the state of MapWithUndeclaredPropertiesString
        /// </summary>
        [JsonIgnore]
        [System.ComponentModel.EditorBrowsable(System.ComponentModel.EditorBrowsableState.Never)]
        public Option<Dictionary<string, string>?> MapWithUndeclaredPropertiesStringOption { get; private set; }

        /// <summary>
        /// Gets or Sets MapWithUndeclaredPropertiesString
        /// </summary>
        [JsonPropertyName("map_with_undeclared_properties_string")]
        public Dictionary<string, string>? MapWithUndeclaredPropertiesString { get { return this.MapWithUndeclaredPropertiesStringOption; } set { this.MapWithUndeclaredPropertiesStringOption = new(value); } }

        /// <summary>
        /// Gets or Sets additional properties
        /// </summary>
        [JsonExtensionData]
        public Dictionary<string, JsonElement> AdditionalProperties { get; } = new Dictionary<string, JsonElement>();

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class AdditionalPropertiesClass {\n");
            sb.Append("  Anytype1: ").Append(Anytype1).Append("\n");
            sb.Append("  EmptyMap: ").Append(EmptyMap).Append("\n");
            sb.Append("  MapOfMapProperty: ").Append(MapOfMapProperty).Append("\n");
            sb.Append("  MapProperty: ").Append(MapProperty).Append("\n");
            sb.Append("  MapWithUndeclaredPropertiesAnytype1: ").Append(MapWithUndeclaredPropertiesAnytype1).Append("\n");
            sb.Append("  MapWithUndeclaredPropertiesAnytype2: ").Append(MapWithUndeclaredPropertiesAnytype2).Append("\n");
            sb.Append("  MapWithUndeclaredPropertiesAnytype3: ").Append(MapWithUndeclaredPropertiesAnytype3).Append("\n");
            sb.Append("  MapWithUndeclaredPropertiesString: ").Append(MapWithUndeclaredPropertiesString).Append("\n");
            sb.Append("  AdditionalProperties: ").Append(AdditionalProperties).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

    /// <summary>
    /// A Json converter for type <see cref="AdditionalPropertiesClass" />
    /// </summary>
    public class AdditionalPropertiesClassJsonConverter : JsonConverter<AdditionalPropertiesClass>
    {
        /// <summary>
        /// Deserializes json to <see cref="AdditionalPropertiesClass" />
        /// </summary>
        /// <param name="utf8JsonReader"></param>
        /// <param name="typeToConvert"></param>
        /// <param name="jsonSerializerOptions"></param>
        /// <returns></returns>
        /// <exception cref="JsonException"></exception>
        public override AdditionalPropertiesClass Read(ref Utf8JsonReader utf8JsonReader, Type typeToConvert, JsonSerializerOptions jsonSerializerOptions)
        {
            int currentDepth = utf8JsonReader.CurrentDepth;

            if (utf8JsonReader.TokenType != JsonTokenType.StartObject && utf8JsonReader.TokenType != JsonTokenType.StartArray)
                throw new JsonException();

            JsonTokenType startingTokenType = utf8JsonReader.TokenType;

            Option<Object?> anytype1 = default;
            Option<Object?> emptyMap = default;
            Option<Dictionary<string, Dictionary<string, string>>?> mapOfMapProperty = default;
            Option<Dictionary<string, string>?> mapProperty = default;
            Option<Object?> mapWithUndeclaredPropertiesAnytype1 = default;
            Option<Object?> mapWithUndeclaredPropertiesAnytype2 = default;
            Option<Dictionary<string, Object>?> mapWithUndeclaredPropertiesAnytype3 = default;
            Option<Dictionary<string, string>?> mapWithUndeclaredPropertiesString = default;

            while (utf8JsonReader.Read())
            {
                if (startingTokenType == JsonTokenType.StartObject && utf8JsonReader.TokenType == JsonTokenType.EndObject && currentDepth == utf8JsonReader.CurrentDepth)
                    break;

                if (startingTokenType == JsonTokenType.StartArray && utf8JsonReader.TokenType == JsonTokenType.EndArray && currentDepth == utf8JsonReader.CurrentDepth)
                    break;

                if (utf8JsonReader.TokenType == JsonTokenType.PropertyName && currentDepth == utf8JsonReader.CurrentDepth - 1)
                {
                    string? localVarJsonPropertyName = utf8JsonReader.GetString();
                    utf8JsonReader.Read();

                    switch (localVarJsonPropertyName)
                    {
                        case "anytype_1":
                            if (utf8JsonReader.TokenType != JsonTokenType.Null)
                                anytype1 = new Option<Object?>(JsonSerializer.Deserialize<Object>(ref utf8JsonReader, jsonSerializerOptions));
                            break;
                        case "empty_map":
                            if (utf8JsonReader.TokenType != JsonTokenType.Null)
                                emptyMap = new Option<Object?>(JsonSerializer.Deserialize<Object>(ref utf8JsonReader, jsonSerializerOptions)!);
                            break;
                        case "map_of_map_property":
                            if (utf8JsonReader.TokenType != JsonTokenType.Null)
                                mapOfMapProperty = new Option<Dictionary<string, Dictionary<string, string>>?>(JsonSerializer.Deserialize<Dictionary<string, Dictionary<string, string>>>(ref utf8JsonReader, jsonSerializerOptions)!);
                            break;
                        case "map_property":
                            if (utf8JsonReader.TokenType != JsonTokenType.Null)
                                mapProperty = new Option<Dictionary<string, string>?>(JsonSerializer.Deserialize<Dictionary<string, string>>(ref utf8JsonReader, jsonSerializerOptions)!);
                            break;
                        case "map_with_undeclared_properties_anytype_1":
                            if (utf8JsonReader.TokenType != JsonTokenType.Null)
                                mapWithUndeclaredPropertiesAnytype1 = new Option<Object?>(JsonSerializer.Deserialize<Object>(ref utf8JsonReader, jsonSerializerOptions)!);
                            break;
                        case "map_with_undeclared_properties_anytype_2":
                            if (utf8JsonReader.TokenType != JsonTokenType.Null)
                                mapWithUndeclaredPropertiesAnytype2 = new Option<Object?>(JsonSerializer.Deserialize<Object>(ref utf8JsonReader, jsonSerializerOptions)!);
                            break;
                        case "map_with_undeclared_properties_anytype_3":
                            if (utf8JsonReader.TokenType != JsonTokenType.Null)
                                mapWithUndeclaredPropertiesAnytype3 = new Option<Dictionary<string, Object>?>(JsonSerializer.Deserialize<Dictionary<string, Object>>(ref utf8JsonReader, jsonSerializerOptions)!);
                            break;
                        case "map_with_undeclared_properties_string":
                            if (utf8JsonReader.TokenType != JsonTokenType.Null)
                                mapWithUndeclaredPropertiesString = new Option<Dictionary<string, string>?>(JsonSerializer.Deserialize<Dictionary<string, string>>(ref utf8JsonReader, jsonSerializerOptions)!);
                            break;
                        default:
                            break;
                    }
                }
            }

            if (emptyMap.IsSet && emptyMap.Value == null)
                throw new ArgumentNullException(nameof(emptyMap), "Property is not nullable for class AdditionalPropertiesClass.");

            if (mapOfMapProperty.IsSet && mapOfMapProperty.Value == null)
                throw new ArgumentNullException(nameof(mapOfMapProperty), "Property is not nullable for class AdditionalPropertiesClass.");

            if (mapProperty.IsSet && mapProperty.Value == null)
                throw new ArgumentNullException(nameof(mapProperty), "Property is not nullable for class AdditionalPropertiesClass.");

            if (mapWithUndeclaredPropertiesAnytype1.IsSet && mapWithUndeclaredPropertiesAnytype1.Value == null)
                throw new ArgumentNullException(nameof(mapWithUndeclaredPropertiesAnytype1), "Property is not nullable for class AdditionalPropertiesClass.");

            if (mapWithUndeclaredPropertiesAnytype2.IsSet && mapWithUndeclaredPropertiesAnytype2.Value == null)
                throw new ArgumentNullException(nameof(mapWithUndeclaredPropertiesAnytype2), "Property is not nullable for class AdditionalPropertiesClass.");

            if (mapWithUndeclaredPropertiesAnytype3.IsSet && mapWithUndeclaredPropertiesAnytype3.Value == null)
                throw new ArgumentNullException(nameof(mapWithUndeclaredPropertiesAnytype3), "Property is not nullable for class AdditionalPropertiesClass.");

            if (mapWithUndeclaredPropertiesString.IsSet && mapWithUndeclaredPropertiesString.Value == null)
                throw new ArgumentNullException(nameof(mapWithUndeclaredPropertiesString), "Property is not nullable for class AdditionalPropertiesClass.");

            return new AdditionalPropertiesClass(anytype1, emptyMap, mapOfMapProperty, mapProperty, mapWithUndeclaredPropertiesAnytype1, mapWithUndeclaredPropertiesAnytype2, mapWithUndeclaredPropertiesAnytype3, mapWithUndeclaredPropertiesString);
        }

        /// <summary>
        /// Serializes a <see cref="AdditionalPropertiesClass" />
        /// </summary>
        /// <param name="writer"></param>
        /// <param name="additionalPropertiesClass"></param>
        /// <param name="jsonSerializerOptions"></param>
        /// <exception cref="NotImplementedException"></exception>
        public override void Write(Utf8JsonWriter writer, AdditionalPropertiesClass additionalPropertiesClass, JsonSerializerOptions jsonSerializerOptions)
        {
            writer.WriteStartObject();

            WriteProperties(ref writer, additionalPropertiesClass, jsonSerializerOptions);
            writer.WriteEndObject();
        }

        /// <summary>
        /// Serializes the properties of <see cref="AdditionalPropertiesClass" />
        /// </summary>
        /// <param name="writer"></param>
        /// <param name="additionalPropertiesClass"></param>
        /// <param name="jsonSerializerOptions"></param>
        /// <exception cref="NotImplementedException"></exception>
        public void WriteProperties(ref Utf8JsonWriter writer, AdditionalPropertiesClass additionalPropertiesClass, JsonSerializerOptions jsonSerializerOptions)
        {
            if (additionalPropertiesClass.EmptyMapOption.IsSet && additionalPropertiesClass.EmptyMap == null)
                throw new ArgumentNullException(nameof(additionalPropertiesClass.EmptyMap), "Property is required for class AdditionalPropertiesClass.");

            if (additionalPropertiesClass.MapOfMapPropertyOption.IsSet && additionalPropertiesClass.MapOfMapProperty == null)
                throw new ArgumentNullException(nameof(additionalPropertiesClass.MapOfMapProperty), "Property is required for class AdditionalPropertiesClass.");

            if (additionalPropertiesClass.MapPropertyOption.IsSet && additionalPropertiesClass.MapProperty == null)
                throw new ArgumentNullException(nameof(additionalPropertiesClass.MapProperty), "Property is required for class AdditionalPropertiesClass.");

            if (additionalPropertiesClass.MapWithUndeclaredPropertiesAnytype1Option.IsSet && additionalPropertiesClass.MapWithUndeclaredPropertiesAnytype1 == null)
                throw new ArgumentNullException(nameof(additionalPropertiesClass.MapWithUndeclaredPropertiesAnytype1), "Property is required for class AdditionalPropertiesClass.");

            if (additionalPropertiesClass.MapWithUndeclaredPropertiesAnytype2Option.IsSet && additionalPropertiesClass.MapWithUndeclaredPropertiesAnytype2 == null)
                throw new ArgumentNullException(nameof(additionalPropertiesClass.MapWithUndeclaredPropertiesAnytype2), "Property is required for class AdditionalPropertiesClass.");

            if (additionalPropertiesClass.MapWithUndeclaredPropertiesAnytype3Option.IsSet && additionalPropertiesClass.MapWithUndeclaredPropertiesAnytype3 == null)
                throw new ArgumentNullException(nameof(additionalPropertiesClass.MapWithUndeclaredPropertiesAnytype3), "Property is required for class AdditionalPropertiesClass.");

            if (additionalPropertiesClass.MapWithUndeclaredPropertiesStringOption.IsSet && additionalPropertiesClass.MapWithUndeclaredPropertiesString == null)
                throw new ArgumentNullException(nameof(additionalPropertiesClass.MapWithUndeclaredPropertiesString), "Property is required for class AdditionalPropertiesClass.");

            if (additionalPropertiesClass.Anytype1Option.IsSet)
                if (additionalPropertiesClass.Anytype1Option.Value != null)
                {
                    writer.WritePropertyName("anytype_1");
                    JsonSerializer.Serialize(writer, additionalPropertiesClass.Anytype1, jsonSerializerOptions);
                }
                else
                    writer.WriteNull("anytype_1");
            if (additionalPropertiesClass.EmptyMapOption.IsSet)
            {
                writer.WritePropertyName("empty_map");
                JsonSerializer.Serialize(writer, additionalPropertiesClass.EmptyMap, jsonSerializerOptions);
            }
            if (additionalPropertiesClass.MapOfMapPropertyOption.IsSet)
            {
                writer.WritePropertyName("map_of_map_property");
                JsonSerializer.Serialize(writer, additionalPropertiesClass.MapOfMapProperty, jsonSerializerOptions);
            }
            if (additionalPropertiesClass.MapPropertyOption.IsSet)
            {
                writer.WritePropertyName("map_property");
                JsonSerializer.Serialize(writer, additionalPropertiesClass.MapProperty, jsonSerializerOptions);
            }
            if (additionalPropertiesClass.MapWithUndeclaredPropertiesAnytype1Option.IsSet)
            {
                writer.WritePropertyName("map_with_undeclared_properties_anytype_1");
                JsonSerializer.Serialize(writer, additionalPropertiesClass.MapWithUndeclaredPropertiesAnytype1, jsonSerializerOptions);
            }
            if (additionalPropertiesClass.MapWithUndeclaredPropertiesAnytype2Option.IsSet)
            {
                writer.WritePropertyName("map_with_undeclared_properties_anytype_2");
                JsonSerializer.Serialize(writer, additionalPropertiesClass.MapWithUndeclaredPropertiesAnytype2, jsonSerializerOptions);
            }
            if (additionalPropertiesClass.MapWithUndeclaredPropertiesAnytype3Option.IsSet)
            {
                writer.WritePropertyName("map_with_undeclared_properties_anytype_3");
                JsonSerializer.Serialize(writer, additionalPropertiesClass.MapWithUndeclaredPropertiesAnytype3, jsonSerializerOptions);
            }
            if (additionalPropertiesClass.MapWithUndeclaredPropertiesStringOption.IsSet)
            {
                writer.WritePropertyName("map_with_undeclared_properties_string");
                JsonSerializer.Serialize(writer, additionalPropertiesClass.MapWithUndeclaredPropertiesString, jsonSerializerOptions);
            }
        }
    }
}
