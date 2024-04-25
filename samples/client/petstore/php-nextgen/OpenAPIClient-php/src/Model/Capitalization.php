<?php
/**
 * Capitalization
 *
 * PHP version 8.1
 *
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */

/**
 * OpenAPI Petstore
 *
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * @generated Generated by: https://openapi-generator.tech
 * Generator version: 7.6.0-SNAPSHOT
 */

/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

namespace OpenAPI\Client\Model;

use ArrayAccess;
use JsonSerializable;
use InvalidArgumentException;
use ReturnTypeWillChange;
use OpenAPI\Client\ObjectSerializer;

/**
 * Capitalization Class Doc Comment
 *
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements ArrayAccess<string, mixed>
 */
class Capitalization implements ModelInterface, ArrayAccess, JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static string $openAPIModelName = 'Capitalization';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var array<string, string>
      */
    protected static array $openAPITypes = [
        'small_camel' => 'string',
        'capital_camel' => 'string',
        'small_snake' => 'string',
        'capital_snake' => 'string',
        'sca_eth_flow_points' => 'string',
        'att_name' => 'string'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var array<string, string|null>
      */
    protected static array $openAPIFormats = [
        'small_camel' => null,
        'capital_camel' => null,
        'small_snake' => null,
        'capital_snake' => null,
        'sca_eth_flow_points' => null,
        'att_name' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var array<string, bool>
      */
    protected static array $openAPINullables = [
        'small_camel' => false,
        'capital_camel' => false,
        'small_snake' => false,
        'capital_snake' => false,
        'sca_eth_flow_points' => false,
        'att_name' => false
    ];

    /**
      * If a nullable field gets set to null, insert it here
      *
      * @var array<string, bool>
      */
    protected array $openAPINullablesSetToNull = [];

    /**
     * Array of property to type mappings. Used for (de)serialization
     *
     * @return array<string, string>
     */
    public static function openAPITypes(): array
    {
        return self::$openAPITypes;
    }

    /**
     * Array of property to format mappings. Used for (de)serialization
     *
     * @return array<string, string>
     */
    public static function openAPIFormats(): array
    {
        return self::$openAPIFormats;
    }

    /**
     * Array of nullable properties
     *
     * @return array<string, bool>
     */
    protected static function openAPINullables(): array
    {
        return self::$openAPINullables;
    }

    /**
     * Array of nullable field names deliberately set to null
     *
     * @return array<string, bool>
     */
    private function getOpenAPINullablesSetToNull(): array
    {
        return $this->openAPINullablesSetToNull;
    }

    /**
     * Setter - Array of nullable field names deliberately set to null
     *
     * @param array<string, bool> $openAPINullablesSetToNull
     */
    private function setOpenAPINullablesSetToNull(array $openAPINullablesSetToNull): void
    {
        $this->openAPINullablesSetToNull = $openAPINullablesSetToNull;
    }

    /**
     * Checks if a property is nullable
     *
     * @param string $property
     * @return bool
     */
    public static function isNullable(string $property): bool
    {
        return self::openAPINullables()[$property] ?? false;
    }

    /**
     * Checks if a nullable property is set to null.
     *
     * @param string $property
     * @return bool
     */
    public function isNullableSetToNull(string $property): bool
    {
        return in_array($property, $this->getOpenAPINullablesSetToNull(), true);
    }

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @var array<string, string>
     */
    protected static array $attributeMap = [
        'small_camel' => 'smallCamel',
        'capital_camel' => 'CapitalCamel',
        'small_snake' => 'small_Snake',
        'capital_snake' => 'Capital_Snake',
        'sca_eth_flow_points' => 'SCA_ETH_Flow_Points',
        'att_name' => 'ATT_NAME'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var array<string, string>
     */
    protected static array $setters = [
        'small_camel' => 'setSmallCamel',
        'capital_camel' => 'setCapitalCamel',
        'small_snake' => 'setSmallSnake',
        'capital_snake' => 'setCapitalSnake',
        'sca_eth_flow_points' => 'setScaEthFlowPoints',
        'att_name' => 'setAttName'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var array<string, string>
     */
    protected static array $getters = [
        'small_camel' => 'getSmallCamel',
        'capital_camel' => 'getCapitalCamel',
        'small_snake' => 'getSmallSnake',
        'capital_snake' => 'getCapitalSnake',
        'sca_eth_flow_points' => 'getScaEthFlowPoints',
        'att_name' => 'getAttName'
    ];

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @return array<string, string>
     */
    public static function attributeMap(): array
    {
        return self::$attributeMap;
    }

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @return array<string, string>
     */
    public static function setters(): array
    {
        return self::$setters;
    }

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @return array<string, string>
     */
    public static function getters(): array
    {
        return self::$getters;
    }

    /**
     * The original name of the model.
     *
     * @return string
     */
    public function getModelName(): string
    {
        return self::$openAPIModelName;
    }


    /**
     * Associative array for storing property values
     *
     * @var array
     */
    protected array $container = [];

    /**
     * Constructor
     *
     * @param array $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->setIfExists('small_camel', $data ?? [], null);
        $this->setIfExists('capital_camel', $data ?? [], null);
        $this->setIfExists('small_snake', $data ?? [], null);
        $this->setIfExists('capital_snake', $data ?? [], null);
        $this->setIfExists('sca_eth_flow_points', $data ?? [], null);
        $this->setIfExists('att_name', $data ?? [], null);
    }

    /**
    * Sets $this->container[$variableName] to the given data or to the given default Value; if $variableName
    * is nullable and its value is set to null in the $fields array, then mark it as "set to null" in the
    * $this->openAPINullablesSetToNull array
    *
    * @param string $variableName
    * @param array  $fields
    * @param mixed  $defaultValue
    */
    private function setIfExists(string $variableName, array $fields, mixed $defaultValue): void
    {
        if (self::isNullable($variableName) && array_key_exists($variableName, $fields) && is_null($fields[$variableName])) {
            $this->openAPINullablesSetToNull[] = $variableName;
        }

        $this->container[$variableName] = $fields[$variableName] ?? $defaultValue;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return string[] invalid properties with reasons
     */
    public function listInvalidProperties(): array
    {
        $invalidProperties = [];

        return $invalidProperties;
    }

    /**
     * Validate all the properties in the model
     * return true if all passed
     *
     * @return bool True if all properties are valid
     */
    public function valid(): bool
    {
        return count($this->listInvalidProperties()) === 0;
    }


    /**
     * Gets small_camel
     *
     * @return string|null
     */
    public function getSmallCamel(): ?string
    {
        return $this->container['small_camel'];
    }

    /**
     * Sets small_camel
     *
     * @param string|null $small_camel small_camel
     *
     * @return $this
     */
    public function setSmallCamel(?string $small_camel): static
    {
        if (is_null($small_camel)) {
            throw new InvalidArgumentException('non-nullable small_camel cannot be null');
        }
        $this->container['small_camel'] = $small_camel;

        return $this;
    }

    /**
     * Gets capital_camel
     *
     * @return string|null
     */
    public function getCapitalCamel(): ?string
    {
        return $this->container['capital_camel'];
    }

    /**
     * Sets capital_camel
     *
     * @param string|null $capital_camel capital_camel
     *
     * @return $this
     */
    public function setCapitalCamel(?string $capital_camel): static
    {
        if (is_null($capital_camel)) {
            throw new InvalidArgumentException('non-nullable capital_camel cannot be null');
        }
        $this->container['capital_camel'] = $capital_camel;

        return $this;
    }

    /**
     * Gets small_snake
     *
     * @return string|null
     */
    public function getSmallSnake(): ?string
    {
        return $this->container['small_snake'];
    }

    /**
     * Sets small_snake
     *
     * @param string|null $small_snake small_snake
     *
     * @return $this
     */
    public function setSmallSnake(?string $small_snake): static
    {
        if (is_null($small_snake)) {
            throw new InvalidArgumentException('non-nullable small_snake cannot be null');
        }
        $this->container['small_snake'] = $small_snake;

        return $this;
    }

    /**
     * Gets capital_snake
     *
     * @return string|null
     */
    public function getCapitalSnake(): ?string
    {
        return $this->container['capital_snake'];
    }

    /**
     * Sets capital_snake
     *
     * @param string|null $capital_snake capital_snake
     *
     * @return $this
     */
    public function setCapitalSnake(?string $capital_snake): static
    {
        if (is_null($capital_snake)) {
            throw new InvalidArgumentException('non-nullable capital_snake cannot be null');
        }
        $this->container['capital_snake'] = $capital_snake;

        return $this;
    }

    /**
     * Gets sca_eth_flow_points
     *
     * @return string|null
     */
    public function getScaEthFlowPoints(): ?string
    {
        return $this->container['sca_eth_flow_points'];
    }

    /**
     * Sets sca_eth_flow_points
     *
     * @param string|null $sca_eth_flow_points sca_eth_flow_points
     *
     * @return $this
     */
    public function setScaEthFlowPoints(?string $sca_eth_flow_points): static
    {
        if (is_null($sca_eth_flow_points)) {
            throw new InvalidArgumentException('non-nullable sca_eth_flow_points cannot be null');
        }
        $this->container['sca_eth_flow_points'] = $sca_eth_flow_points;

        return $this;
    }

    /**
     * Gets att_name
     *
     * @return string|null
     */
    public function getAttName(): ?string
    {
        return $this->container['att_name'];
    }

    /**
     * Sets att_name
     *
     * @param string|null $att_name Name of the pet
     *
     * @return $this
     */
    public function setAttName(?string $att_name): static
    {
        if (is_null($att_name)) {
            throw new InvalidArgumentException('non-nullable att_name cannot be null');
        }
        $this->container['att_name'] = $att_name;

        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     *
     * @param integer $offset Offset
     *
     * @return boolean
     */
    public function offsetExists(mixed $offset): bool
    {
        return isset($this->container[$offset]);
    }

    /**
     * Gets offset.
     *
     * @param integer $offset Offset
     *
     * @return mixed|null
     */
    #[ReturnTypeWillChange]
    public function offsetGet(mixed $offset): mixed
    {
        return $this->container[$offset] ?? null;
    }

    /**
     * Sets value based on offset.
     *
     * @param int|null $offset Offset
     * @param mixed    $value  Value to be set
     *
     * @return void
     */
    public function offsetSet(mixed $offset, mixed $value): void
    {
        if (is_null($offset)) {
            $this->container[] = $value;
        } else {
            $this->container[$offset] = $value;
        }
    }

    /**
     * Unsets offset.
     *
     * @param integer $offset Offset
     *
     * @return void
     */
    public function offsetUnset(mixed $offset): void
    {
        unset($this->container[$offset]);
    }

    /**
     * Serializes the object to a value that can be serialized natively by json_encode().
     * @link https://www.php.net/manual/en/jsonserializable.jsonserialize.php
     *
     * @return mixed Returns data which can be serialized by json_encode(), which is a value
     * of any type other than a resource.
     */
    #[ReturnTypeWillChange]
    public function jsonSerialize(): mixed
    {
       return ObjectSerializer::sanitizeForSerialization($this);
    }

    /**
     * Gets the string presentation of the object
     *
     * @return string
     */
    public function __toString(): string
    {
        return json_encode(
            ObjectSerializer::sanitizeForSerialization($this),
            JSON_PRETTY_PRINT
        );
    }

    /**
     * Gets a header-safe presentation of the object
     *
     * @return string
     */
    public function toHeaderValue(): string
    {
        return json_encode(ObjectSerializer::sanitizeForSerialization($this));
    }
}

