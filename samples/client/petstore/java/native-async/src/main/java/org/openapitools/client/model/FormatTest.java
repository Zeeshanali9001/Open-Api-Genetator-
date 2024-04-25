/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.File;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * FormatTest
 */
@JsonPropertyOrder({
  FormatTest.JSON_PROPERTY_INTEGER,
  FormatTest.JSON_PROPERTY_INT32,
  FormatTest.JSON_PROPERTY_INT64,
  FormatTest.JSON_PROPERTY_NUMBER,
  FormatTest.JSON_PROPERTY_FLOAT,
  FormatTest.JSON_PROPERTY_DOUBLE,
  FormatTest.JSON_PROPERTY_DECIMAL,
  FormatTest.JSON_PROPERTY_STRING,
  FormatTest.JSON_PROPERTY_BYTE,
  FormatTest.JSON_PROPERTY_BINARY,
  FormatTest.JSON_PROPERTY_DATE,
  FormatTest.JSON_PROPERTY_DATE_TIME,
  FormatTest.JSON_PROPERTY_UUID,
  FormatTest.JSON_PROPERTY_PASSWORD,
  FormatTest.JSON_PROPERTY_PATTERN_WITH_DIGITS,
  FormatTest.JSON_PROPERTY_PATTERN_WITH_DIGITS_AND_DELIMITER
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.6.0-SNAPSHOT")
public class FormatTest {
  public static final String JSON_PROPERTY_INTEGER = "integer";
  private Integer integer;

  public static final String JSON_PROPERTY_INT32 = "int32";
  private Integer int32;

  public static final String JSON_PROPERTY_INT64 = "int64";
  private Long int64;

  public static final String JSON_PROPERTY_NUMBER = "number";
  private BigDecimal number;

  public static final String JSON_PROPERTY_FLOAT = "float";
  private Float _float;

  public static final String JSON_PROPERTY_DOUBLE = "double";
  private Double _double;

  public static final String JSON_PROPERTY_DECIMAL = "decimal";
  private BigDecimal decimal;

  public static final String JSON_PROPERTY_STRING = "string";
  private String string;

  public static final String JSON_PROPERTY_BYTE = "byte";
  private byte[] _byte;

  public static final String JSON_PROPERTY_BINARY = "binary";
  private File binary;

  public static final String JSON_PROPERTY_DATE = "date";
  private LocalDate date;

  public static final String JSON_PROPERTY_DATE_TIME = "dateTime";
  private OffsetDateTime dateTime;

  public static final String JSON_PROPERTY_UUID = "uuid";
  private UUID uuid;

  public static final String JSON_PROPERTY_PASSWORD = "password";
  private String password;

  public static final String JSON_PROPERTY_PATTERN_WITH_DIGITS = "pattern_with_digits";
  private String patternWithDigits;

  public static final String JSON_PROPERTY_PATTERN_WITH_DIGITS_AND_DELIMITER = "pattern_with_digits_and_delimiter";
  private String patternWithDigitsAndDelimiter;

  public FormatTest() { 
  }

  public FormatTest integer(Integer integer) {
    this.integer = integer;
    return this;
  }

   /**
   * Get integer
   * minimum: 10
   * maximum: 100
   * @return integer
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTEGER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getInteger() {
    return integer;
  }


  @JsonProperty(JSON_PROPERTY_INTEGER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInteger(Integer integer) {
    this.integer = integer;
  }


  public FormatTest int32(Integer int32) {
    this.int32 = int32;
    return this;
  }

   /**
   * Get int32
   * minimum: 20
   * maximum: 200
   * @return int32
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INT32)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getInt32() {
    return int32;
  }


  @JsonProperty(JSON_PROPERTY_INT32)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInt32(Integer int32) {
    this.int32 = int32;
  }


  public FormatTest int64(Long int64) {
    this.int64 = int64;
    return this;
  }

   /**
   * Get int64
   * @return int64
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INT64)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getInt64() {
    return int64;
  }


  @JsonProperty(JSON_PROPERTY_INT64)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInt64(Long int64) {
    this.int64 = int64;
  }


  public FormatTest number(BigDecimal number) {
    this.number = number;
    return this;
  }

   /**
   * Get number
   * minimum: 32.1
   * maximum: 543.2
   * @return number
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getNumber() {
    return number;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNumber(BigDecimal number) {
    this.number = number;
  }


  public FormatTest _float(Float _float) {
    this._float = _float;
    return this;
  }

   /**
   * Get _float
   * minimum: 54.3
   * maximum: 987.6
   * @return _float
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FLOAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getFloat() {
    return _float;
  }


  @JsonProperty(JSON_PROPERTY_FLOAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFloat(Float _float) {
    this._float = _float;
  }


  public FormatTest _double(Double _double) {
    this._double = _double;
    return this;
  }

   /**
   * Get _double
   * minimum: 67.8
   * maximum: 123.4
   * @return _double
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOUBLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getDouble() {
    return _double;
  }


  @JsonProperty(JSON_PROPERTY_DOUBLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDouble(Double _double) {
    this._double = _double;
  }


  public FormatTest decimal(BigDecimal decimal) {
    this.decimal = decimal;
    return this;
  }

   /**
   * Get decimal
   * @return decimal
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DECIMAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getDecimal() {
    return decimal;
  }


  @JsonProperty(JSON_PROPERTY_DECIMAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDecimal(BigDecimal decimal) {
    this.decimal = decimal;
  }


  public FormatTest string(String string) {
    this.string = string;
    return this;
  }

   /**
   * Get string
   * @return string
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getString() {
    return string;
  }


  @JsonProperty(JSON_PROPERTY_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setString(String string) {
    this.string = string;
  }


  public FormatTest _byte(byte[] _byte) {
    this._byte = _byte;
    return this;
  }

   /**
   * Get _byte
   * @return _byte
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BYTE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public byte[] getByte() {
    return _byte;
  }


  @JsonProperty(JSON_PROPERTY_BYTE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setByte(byte[] _byte) {
    this._byte = _byte;
  }


  public FormatTest binary(File binary) {
    this.binary = binary;
    return this;
  }

   /**
   * Get binary
   * @return binary
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BINARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public File getBinary() {
    return binary;
  }


  @JsonProperty(JSON_PROPERTY_BINARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBinary(File binary) {
    this.binary = binary;
  }


  public FormatTest date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LocalDate getDate() {
    return date;
  }


  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDate(LocalDate date) {
    this.date = date;
  }


  public FormatTest dateTime(OffsetDateTime dateTime) {
    this.dateTime = dateTime;
    return this;
  }

   /**
   * Get dateTime
   * @return dateTime
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getDateTime() {
    return dateTime;
  }


  @JsonProperty(JSON_PROPERTY_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDateTime(OffsetDateTime dateTime) {
    this.dateTime = dateTime;
  }


  public FormatTest uuid(UUID uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * Get uuid
   * @return uuid
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getUuid() {
    return uuid;
  }


  @JsonProperty(JSON_PROPERTY_UUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }


  public FormatTest password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPassword() {
    return password;
  }


  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPassword(String password) {
    this.password = password;
  }


  public FormatTest patternWithDigits(String patternWithDigits) {
    this.patternWithDigits = patternWithDigits;
    return this;
  }

   /**
   * A string that is a 10 digit number. Can have leading zeros.
   * @return patternWithDigits
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PATTERN_WITH_DIGITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPatternWithDigits() {
    return patternWithDigits;
  }


  @JsonProperty(JSON_PROPERTY_PATTERN_WITH_DIGITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPatternWithDigits(String patternWithDigits) {
    this.patternWithDigits = patternWithDigits;
  }


  public FormatTest patternWithDigitsAndDelimiter(String patternWithDigitsAndDelimiter) {
    this.patternWithDigitsAndDelimiter = patternWithDigitsAndDelimiter;
    return this;
  }

   /**
   * A string starting with &#39;image_&#39; (case insensitive) and one to three digits following i.e. Image_01.
   * @return patternWithDigitsAndDelimiter
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PATTERN_WITH_DIGITS_AND_DELIMITER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPatternWithDigitsAndDelimiter() {
    return patternWithDigitsAndDelimiter;
  }


  @JsonProperty(JSON_PROPERTY_PATTERN_WITH_DIGITS_AND_DELIMITER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPatternWithDigitsAndDelimiter(String patternWithDigitsAndDelimiter) {
    this.patternWithDigitsAndDelimiter = patternWithDigitsAndDelimiter;
  }


  /**
   * Return true if this format_test object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormatTest formatTest = (FormatTest) o;
    return Objects.equals(this.integer, formatTest.integer) &&
        Objects.equals(this.int32, formatTest.int32) &&
        Objects.equals(this.int64, formatTest.int64) &&
        Objects.equals(this.number, formatTest.number) &&
        Objects.equals(this._float, formatTest._float) &&
        Objects.equals(this._double, formatTest._double) &&
        Objects.equals(this.decimal, formatTest.decimal) &&
        Objects.equals(this.string, formatTest.string) &&
        Arrays.equals(this._byte, formatTest._byte) &&
        Objects.equals(this.binary, formatTest.binary) &&
        Objects.equals(this.date, formatTest.date) &&
        Objects.equals(this.dateTime, formatTest.dateTime) &&
        Objects.equals(this.uuid, formatTest.uuid) &&
        Objects.equals(this.password, formatTest.password) &&
        Objects.equals(this.patternWithDigits, formatTest.patternWithDigits) &&
        Objects.equals(this.patternWithDigitsAndDelimiter, formatTest.patternWithDigitsAndDelimiter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(integer, int32, int64, number, _float, _double, decimal, string, Arrays.hashCode(_byte), binary, date, dateTime, uuid, password, patternWithDigits, patternWithDigitsAndDelimiter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormatTest {\n");
    sb.append("    integer: ").append(toIndentedString(integer)).append("\n");
    sb.append("    int32: ").append(toIndentedString(int32)).append("\n");
    sb.append("    int64: ").append(toIndentedString(int64)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    _float: ").append(toIndentedString(_float)).append("\n");
    sb.append("    _double: ").append(toIndentedString(_double)).append("\n");
    sb.append("    decimal: ").append(toIndentedString(decimal)).append("\n");
    sb.append("    string: ").append(toIndentedString(string)).append("\n");
    sb.append("    _byte: ").append(toIndentedString(_byte)).append("\n");
    sb.append("    binary: ").append(toIndentedString(binary)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    password: ").append("*").append("\n");
    sb.append("    patternWithDigits: ").append(toIndentedString(patternWithDigits)).append("\n");
    sb.append("    patternWithDigitsAndDelimiter: ").append(toIndentedString(patternWithDigitsAndDelimiter)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `integer` to the URL query string
    if (getInteger() != null) {
      joiner.add(String.format("%sinteger%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getInteger()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `int32` to the URL query string
    if (getInt32() != null) {
      joiner.add(String.format("%sint32%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getInt32()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `int64` to the URL query string
    if (getInt64() != null) {
      joiner.add(String.format("%sint64%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getInt64()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `number` to the URL query string
    if (getNumber() != null) {
      joiner.add(String.format("%snumber%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNumber()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `float` to the URL query string
    if (getFloat() != null) {
      joiner.add(String.format("%sfloat%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFloat()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `double` to the URL query string
    if (getDouble() != null) {
      joiner.add(String.format("%sdouble%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDouble()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `decimal` to the URL query string
    if (getDecimal() != null) {
      joiner.add(String.format("%sdecimal%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDecimal()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `string` to the URL query string
    if (getString() != null) {
      joiner.add(String.format("%sstring%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getString()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `byte` to the URL query string
    if (getByte() != null) {
      joiner.add(String.format("%sbyte%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getByte()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `binary` to the URL query string
    if (getBinary() != null) {
      joiner.add(String.format("%sbinary%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBinary()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `date` to the URL query string
    if (getDate() != null) {
      joiner.add(String.format("%sdate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDate()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `dateTime` to the URL query string
    if (getDateTime() != null) {
      joiner.add(String.format("%sdateTime%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDateTime()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `uuid` to the URL query string
    if (getUuid() != null) {
      joiner.add(String.format("%suuid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUuid()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `password` to the URL query string
    if (getPassword() != null) {
      joiner.add(String.format("%spassword%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPassword()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `pattern_with_digits` to the URL query string
    if (getPatternWithDigits() != null) {
      joiner.add(String.format("%spattern_with_digits%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPatternWithDigits()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `pattern_with_digits_and_delimiter` to the URL query string
    if (getPatternWithDigitsAndDelimiter() != null) {
      joiner.add(String.format("%spattern_with_digits_and_delimiter%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPatternWithDigitsAndDelimiter()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}
