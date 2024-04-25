/*
OpenAPI Petstore

This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\

API version: 1.0.0
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package petstore

import (
	"encoding/json"
	"fmt"
)

// checks if the Whale type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &Whale{}

// Whale struct for Whale
type Whale struct {
	HasBaleen *bool `json:"hasBaleen,omitempty"`
	HasTeeth *bool `json:"hasTeeth,omitempty"`
	ClassName string `json:"className"`
	AdditionalProperties map[string]interface{}
}

type _Whale Whale

// NewWhale instantiates a new Whale object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewWhale(className string) *Whale {
	this := Whale{}
	this.ClassName = className
	return &this
}

// NewWhaleWithDefaults instantiates a new Whale object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewWhaleWithDefaults() *Whale {
	this := Whale{}
	return &this
}

// GetHasBaleen returns the HasBaleen field value if set, zero value otherwise.
func (o *Whale) GetHasBaleen() bool {
	if o == nil || IsNil(o.HasBaleen) {
		var ret bool
		return ret
	}
	return *o.HasBaleen
}

// GetHasBaleenOk returns a tuple with the HasBaleen field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Whale) GetHasBaleenOk() (*bool, bool) {
	if o == nil || IsNil(o.HasBaleen) {
		return nil, false
	}
	return o.HasBaleen, true
}

// HasHasBaleen returns a boolean if a field has been set.
func (o *Whale) HasHasBaleen() bool {
	if o != nil && !IsNil(o.HasBaleen) {
		return true
	}

	return false
}

// SetHasBaleen gets a reference to the given bool and assigns it to the HasBaleen field.
func (o *Whale) SetHasBaleen(v bool) {
	o.HasBaleen = &v
}

// GetHasTeeth returns the HasTeeth field value if set, zero value otherwise.
func (o *Whale) GetHasTeeth() bool {
	if o == nil || IsNil(o.HasTeeth) {
		var ret bool
		return ret
	}
	return *o.HasTeeth
}

// GetHasTeethOk returns a tuple with the HasTeeth field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Whale) GetHasTeethOk() (*bool, bool) {
	if o == nil || IsNil(o.HasTeeth) {
		return nil, false
	}
	return o.HasTeeth, true
}

// HasHasTeeth returns a boolean if a field has been set.
func (o *Whale) HasHasTeeth() bool {
	if o != nil && !IsNil(o.HasTeeth) {
		return true
	}

	return false
}

// SetHasTeeth gets a reference to the given bool and assigns it to the HasTeeth field.
func (o *Whale) SetHasTeeth(v bool) {
	o.HasTeeth = &v
}

// GetClassName returns the ClassName field value
func (o *Whale) GetClassName() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.ClassName
}

// GetClassNameOk returns a tuple with the ClassName field value
// and a boolean to check if the value has been set.
func (o *Whale) GetClassNameOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.ClassName, true
}

// SetClassName sets field value
func (o *Whale) SetClassName(v string) {
	o.ClassName = v
}

func (o Whale) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o Whale) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.HasBaleen) {
		toSerialize["hasBaleen"] = o.HasBaleen
	}
	if !IsNil(o.HasTeeth) {
		toSerialize["hasTeeth"] = o.HasTeeth
	}
	toSerialize["className"] = o.ClassName

	for key, value := range o.AdditionalProperties {
		toSerialize[key] = value
	}

	return toSerialize, nil
}

func (o *Whale) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"className",
	}

	allProperties := make(map[string]interface{})

	err = json.Unmarshal(data, &allProperties)

	if err != nil {
		return err;
	}

	for _, requiredProperty := range(requiredProperties) {
		if _, exists := allProperties[requiredProperty]; !exists {
			return fmt.Errorf("no value given for required property %v", requiredProperty)
		}
	}

	varWhale := _Whale{}

	err = json.Unmarshal(data, &varWhale)

	if err != nil {
		return err
	}

	*o = Whale(varWhale)

	additionalProperties := make(map[string]interface{})

	if err = json.Unmarshal(data, &additionalProperties); err == nil {
		delete(additionalProperties, "hasBaleen")
		delete(additionalProperties, "hasTeeth")
		delete(additionalProperties, "className")
		o.AdditionalProperties = additionalProperties
	}

	return err
}

type NullableWhale struct {
	value *Whale
	isSet bool
}

func (v NullableWhale) Get() *Whale {
	return v.value
}

func (v *NullableWhale) Set(val *Whale) {
	v.value = val
	v.isSet = true
}

func (v NullableWhale) IsSet() bool {
	return v.isSet
}

func (v *NullableWhale) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableWhale(val *Whale) *NullableWhale {
	return &NullableWhale{value: val, isSet: true}
}

func (v NullableWhale) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableWhale) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

