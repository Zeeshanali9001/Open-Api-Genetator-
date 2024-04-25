# #OpenAPI Petstore
#
##This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
#
#The version of the OpenAPI document: 1.0.0
#
#Generated by: https://openapi-generator.tech
#Generator version: 7.6.0-SNAPSHOT
#

require "big"
require "json"
require "time"

module Petstore
  class FormatTest
    include JSON::Serializable

    # Required properties
    @[JSON::Field(key: "number", type: Float64, nillable: false, emit_null: false)]
    property number : Float64

    @[JSON::Field(key: "byte", type: String, nillable: false, emit_null: false)]
    property byte : String

    @[JSON::Field(key: "date", type: Time, nillable: false, emit_null: false)]
    property date : Time

    @[JSON::Field(key: "password", type: String, nillable: false, emit_null: false)]
    property password : String

    # Optional properties
    @[JSON::Field(key: "integer", type: Int32?, nillable: true, emit_null: false)]
    property integer : Int32?

    @[JSON::Field(key: "int32", type: Int32?, nillable: true, emit_null: false)]
    property int32 : Int32?

    @[JSON::Field(key: "int64", type: Int64?, nillable: true, emit_null: false)]
    property int64 : Int64?

    @[JSON::Field(key: "float", type: Float32?, nillable: true, emit_null: false)]
    property float : Float32?

    @[JSON::Field(key: "double", type: Float64?, nillable: true, emit_null: false)]
    property double : Float64?

    @[JSON::Field(key: "decimal", type: BigDecimal?, nillable: true, emit_null: false)]
    property decimal : BigDecimal?

    @[JSON::Field(key: "string", type: String?, nillable: true, emit_null: false)]
    property string : String?

    @[JSON::Field(key: "binary", type: ::File?, nillable: true, emit_null: false)]
    property binary : ::File?

    @[JSON::Field(key: "dateTime", type: Time?, nillable: true, emit_null: false)]
    property date_time : Time?

    @[JSON::Field(key: "uuid", type: String?, nillable: true, emit_null: false)]
    property uuid : String?

    # A string that is a 10 digit number. Can have leading zeros.
    @[JSON::Field(key: "pattern_with_digits", type: String?, nillable: true, emit_null: false)]
    property pattern_with_digits : String?

    # A string starting with 'image_' (case insensitive) and one to three digits following i.e. Image_01.
    @[JSON::Field(key: "pattern_with_digits_and_delimiter", type: String?, nillable: true, emit_null: false)]
    property pattern_with_digits_and_delimiter : String?

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(@number : Float64, @byte : String, @date : Time, @password : String, @integer : Int32?, @int32 : Int32?, @int64 : Int64?, @float : Float32?, @double : Float64?, @decimal : BigDecimal?, @string : String?, @binary : ::File?, @date_time : Time?, @uuid : String?, @pattern_with_digits : String?, @pattern_with_digits_and_delimiter : String?)
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array(String).new
      if !@integer.nil? && @integer > 100
        invalid_properties.push("invalid value for \"integer\", must be smaller than or equal to 100.")
      end

      if !@integer.nil? && @integer < 10
        invalid_properties.push("invalid value for \"integer\", must be greater than or equal to 10.")
      end

      if !@int32.nil? && @int32 > 200
        invalid_properties.push("invalid value for \"int32\", must be smaller than or equal to 200.")
      end

      if !@int32.nil? && @int32 < 20
        invalid_properties.push("invalid value for \"int32\", must be greater than or equal to 20.")
      end

      if @number > 543.2
        invalid_properties.push("invalid value for \"number\", must be smaller than or equal to 543.2.")
      end

      if @number < 32.1
        invalid_properties.push("invalid value for \"number\", must be greater than or equal to 32.1.")
      end

      if !@float.nil? && @float > 987.6
        invalid_properties.push("invalid value for \"float\", must be smaller than or equal to 987.6.")
      end

      if !@float.nil? && @float < 54.3
        invalid_properties.push("invalid value for \"float\", must be greater than or equal to 54.3.")
      end

      if !@double.nil? && @double > 123.4
        invalid_properties.push("invalid value for \"double\", must be smaller than or equal to 123.4.")
      end

      if !@double.nil? && @double < 67.8
        invalid_properties.push("invalid value for \"double\", must be greater than or equal to 67.8.")
      end

      pattern = Regexp.new(/[a-z]/i)
      if !@string.nil? && @string !~ pattern
        invalid_properties.push("invalid value for \"string\", must conform to the pattern #{pattern}.")
      end

      if @password.to_s.size > 64
        invalid_properties.push("invalid value for \"password\", the character length must be smaller than or equal to 64.")
      end

      if @password.to_s.size < 10
        invalid_properties.push("invalid value for \"password\", the character length must be great than or equal to 10.")
      end

      pattern = Regexp.new(/^\d{10}$/)
      if !@pattern_with_digits.nil? && @pattern_with_digits !~ pattern
        invalid_properties.push("invalid value for \"pattern_with_digits\", must conform to the pattern #{pattern}.")
      end

      pattern = Regexp.new(/^image_\d{1,3}$/i)
      if !@pattern_with_digits_and_delimiter.nil? && @pattern_with_digits_and_delimiter !~ pattern
        invalid_properties.push("invalid value for \"pattern_with_digits_and_delimiter\", must conform to the pattern #{pattern}.")
      end

      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      return false if !@integer.nil? && @integer > 100
      return false if !@integer.nil? && @integer < 10
      return false if !@int32.nil? && @int32 > 200
      return false if !@int32.nil? && @int32 < 20
      return false if @number > 543.2
      return false if @number < 32.1
      return false if !@float.nil? && @float > 987.6
      return false if !@float.nil? && @float < 54.3
      return false if !@double.nil? && @double > 123.4
      return false if !@double.nil? && @double < 67.8
      return false if !@string.nil? && @string !~ Regexp.new(/[a-z]/i)
      return false if @password.to_s.size > 64
      return false if @password.to_s.size < 10
      return false if !@pattern_with_digits.nil? && @pattern_with_digits !~ Regexp.new(/^\d{10}$/)
      return false if !@pattern_with_digits_and_delimiter.nil? && @pattern_with_digits_and_delimiter !~ Regexp.new(/^image_\d{1,3}$/i)
      true
    end

    # Custom attribute writer method with validation
    # @param [Object] integer Value to be assigned
    def integer=(integer)
      if !integer.nil? && integer > 100
        raise ArgumentError.new("invalid value for \"integer\", must be smaller than or equal to 100.")
      end

      if !integer.nil? && integer < 10
        raise ArgumentError.new("invalid value for \"integer\", must be greater than or equal to 10.")
      end

      @integer = integer
    end

    # Custom attribute writer method with validation
    # @param [Object] int32 Value to be assigned
    def int32=(int32)
      if !int32.nil? && int32 > 200
        raise ArgumentError.new("invalid value for \"int32\", must be smaller than or equal to 200.")
      end

      if !int32.nil? && int32 < 20
        raise ArgumentError.new("invalid value for \"int32\", must be greater than or equal to 20.")
      end

      @int32 = int32
    end

    # Custom attribute writer method with validation
    # @param [Object] number Value to be assigned
    def number=(number)
      if number > 543.2
        raise ArgumentError.new("invalid value for \"number\", must be smaller than or equal to 543.2.")
      end

      if number < 32.1
        raise ArgumentError.new("invalid value for \"number\", must be greater than or equal to 32.1.")
      end

      @number = number
    end

    # Custom attribute writer method with validation
    # @param [Object] float Value to be assigned
    def float=(float)
      if !float.nil? && float > 987.6
        raise ArgumentError.new("invalid value for \"float\", must be smaller than or equal to 987.6.")
      end

      if !float.nil? && float < 54.3
        raise ArgumentError.new("invalid value for \"float\", must be greater than or equal to 54.3.")
      end

      @float = float
    end

    # Custom attribute writer method with validation
    # @param [Object] double Value to be assigned
    def double=(double)
      if !double.nil? && double > 123.4
        raise ArgumentError.new("invalid value for \"double\", must be smaller than or equal to 123.4.")
      end

      if !double.nil? && double < 67.8
        raise ArgumentError.new("invalid value for \"double\", must be greater than or equal to 67.8.")
      end

      @double = double
    end

    # Custom attribute writer method with validation
    # @param [Object] string Value to be assigned
    def string=(string)
      pattern = Regexp.new(/[a-z]/i)
      if !string.nil? && string !~ pattern
        raise ArgumentError.new("invalid value for \"string\", must conform to the pattern #{pattern}.")
      end

      @string = string
    end

    # Custom attribute writer method with validation
    # @param [Object] password Value to be assigned
    def password=(password)
      if password.to_s.size > 64
        raise ArgumentError.new("invalid value for \"password\", the character length must be smaller than or equal to 64.")
      end

      if password.to_s.size < 10
        raise ArgumentError.new("invalid value for \"password\", the character length must be great than or equal to 10.")
      end

      @password = password
    end

    # Custom attribute writer method with validation
    # @param [Object] pattern_with_digits Value to be assigned
    def pattern_with_digits=(pattern_with_digits)
      pattern = Regexp.new(/^\d{10}$/)
      if !pattern_with_digits.nil? && pattern_with_digits !~ pattern
        raise ArgumentError.new("invalid value for \"pattern_with_digits\", must conform to the pattern #{pattern}.")
      end

      @pattern_with_digits = pattern_with_digits
    end

    # Custom attribute writer method with validation
    # @param [Object] pattern_with_digits_and_delimiter Value to be assigned
    def pattern_with_digits_and_delimiter=(pattern_with_digits_and_delimiter)
      pattern = Regexp.new(/^image_\d{1,3}$/i)
      if !pattern_with_digits_and_delimiter.nil? && pattern_with_digits_and_delimiter !~ pattern
        raise ArgumentError.new("invalid value for \"pattern_with_digits_and_delimiter\", must conform to the pattern #{pattern}.")
      end

      @pattern_with_digits_and_delimiter = pattern_with_digits_and_delimiter
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.same?(o)
      self.class == o.class &&
          integer == o.integer &&
          int32 == o.int32 &&
          int64 == o.int64 &&
          number == o.number &&
          float == o.float &&
          double == o.double &&
          decimal == o.decimal &&
          string == o.string &&
          byte == o.byte &&
          binary == o.binary &&
          date == o.date &&
          date_time == o.date_time &&
          uuid == o.uuid &&
          password == o.password &&
          pattern_with_digits == o.pattern_with_digits &&
          pattern_with_digits_and_delimiter == o.pattern_with_digits_and_delimiter
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Integer] Hash code
    def hash
      [integer, int32, int64, number, float, double, decimal, string, byte, binary, date, date_time, uuid, password, pattern_with_digits, pattern_with_digits_and_delimiter].hash
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def self.build_from_hash(attributes)
      new.build_from_hash(attributes)
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def build_from_hash(attributes)
      return nil unless attributes.is_a?(Hash)
      self.class.openapi_types.each_pair do |key, type|
        if !attributes[self.class.attribute_map[key]]? && self.class.openapi_nullable.includes?(key)
          self.send("#{key}=", nil)
        elsif type =~ /\AArray<(.*)>/i
          # check to ensure the input is an array given that the attribute
          # is documented as an array but the input is not
          if attributes[self.class.attribute_map[key]].is_a?(Array)
            self.send("#{key}=", attributes[self.class.attribute_map[key]].map { |v| _deserialize($1, v) })
          end
        elsif !attributes[self.class.attribute_map[key]].nil?
          self.send("#{key}=", _deserialize(type, attributes[self.class.attribute_map[key]]))
        end
      end

      self
    end

    # Deserializes the data based on type
    # @param string type Data type
    # @param string value Value to be deserialized
    # @return [Object] Deserialized data
    def _deserialize(type, value)
      case type.to_sym
      when :Time
        Time.parse(value)
      when :Date
        Date.parse(value)
      when :String
        value.to_s
      when :Integer
        value.to_i
      when :Float
        value.to_f
      when :Boolean
        if value.to_s =~ /\A(true|t|yes|y|1)\z/i
          true
        else
          false
        end
      when :Object
        # generic object (usually a Hash), return directly
        value
      when /\AArray<(?<inner_type>.+)>\z/
        inner_type = Regexp.last_match[:inner_type]
        value.map { |v| _deserialize(inner_type, v) }
      when /\AHash<(?<k_type>.+?), (?<v_type>.+)>\z/
        k_type = Regexp.last_match[:k_type]
        v_type = Regexp.last_match[:v_type]
        ({} of Symbol => String).tap do |hash|
          value.each do |k, v|
            hash[_deserialize(k_type, k)] = _deserialize(v_type, v)
          end
        end
      else # model
        # models (e.g. Pet) or oneOf
        klass = Petstore.const_get(type)
        klass.respond_to?(:openapi_one_of) ? klass.build(value) : klass.build_from_hash(value)
      end
    end

    # Returns the string representation of the object
    # @return [String] String presentation of the object
    def to_s
      to_hash.to_s
    end

    # to_body is an alias to to_hash (backward compatibility)
    # @return [Hash] Returns the object in the form of hash
    def to_body
      to_hash
    end

    # Returns the object in the form of hash
    # @return [Hash] Returns the object in the form of hash
    def to_hash
      hash = {} of Symbol => String
      self.class.attribute_map.each_pair do |attr, param|
        value = self.send(attr)
        if value.nil?
          is_nullable = self.class.openapi_nullable.includes?(attr)
          next if !is_nullable || (is_nullable && !instance_variable_defined?(:"@#{attr}"))
        end

        hash[param] = _to_hash(value)
      end
      hash
    end

    # Outputs non-array value in the form of hash
    # For object, use to_hash. Otherwise, just return the value
    # @param [Object] value Any valid value
    # @return [Hash] Returns the value in the form of hash
    def _to_hash(value)
      if value.is_a?(Array)
        value.compact.map { |v| _to_hash(v) }
      elsif value.is_a?(Hash)
        ({} of Symbol => String).tap do |hash|
          value.each { |k, v| hash[k] = _to_hash(v) }
        end
      elsif value.respond_to? :to_hash
        value.to_hash
      else
        value
      end
    end

  end

end
