/*
Test

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

API version: 1.0.0
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package openapi

import (
	"encoding/json"
	"fmt"
)

// Object - struct for Object
type Object struct {
	NestedObject1 *NestedObject1
	NestedObject2 *NestedObject2
}

// NestedObject1AsObject is a convenience function that returns NestedObject1 wrapped in Object
func NestedObject1AsObject(v *NestedObject1) Object {
	return Object{
		NestedObject1: v,
	}
}

// NestedObject2AsObject is a convenience function that returns NestedObject2 wrapped in Object
func NestedObject2AsObject(v *NestedObject2) Object {
	return Object{
		NestedObject2: v,
	}
}


// Unmarshal JSON data into one of the pointers in the struct
func (dst *Object) UnmarshalJSON(data []byte) error {
	var err error
	match := 0
	// try to unmarshal data into NestedObject1
	err = newStrictDecoder(data).Decode(&dst.NestedObject1)
	if err == nil {
		jsonNestedObject1, _ := json.Marshal(dst.NestedObject1)
		if string(jsonNestedObject1) == "{}" { // empty struct
			dst.NestedObject1 = nil
		} else {
			match++
		}
	} else {
		dst.NestedObject1 = nil
	}

	// try to unmarshal data into NestedObject2
	err = newStrictDecoder(data).Decode(&dst.NestedObject2)
	if err == nil {
		jsonNestedObject2, _ := json.Marshal(dst.NestedObject2)
		if string(jsonNestedObject2) == "{}" { // empty struct
			dst.NestedObject2 = nil
		} else {
			match++
		}
	} else {
		dst.NestedObject2 = nil
	}

	if match > 1 { // more than 1 match
		// reset to nil
		dst.NestedObject1 = nil
		dst.NestedObject2 = nil

		return fmt.Errorf("data matches more than one schema in oneOf(Object)")
	} else if match == 1 {
		return nil // exactly one match
	} else { // no match
		return fmt.Errorf("data failed to match schemas in oneOf(Object)")
	}
}

// Marshal data from the first non-nil pointers in the struct to JSON
func (src Object) MarshalJSON() ([]byte, error) {
	if src.NestedObject1 != nil {
		return json.Marshal(&src.NestedObject1)
	}

	if src.NestedObject2 != nil {
		return json.Marshal(&src.NestedObject2)
	}

	return nil, nil // no data in oneOf schemas
}

// Get the actual instance
func (obj *Object) GetActualInstance() (interface{}) {
	if obj == nil {
		return nil
	}
	if obj.NestedObject1 != nil {
		return obj.NestedObject1
	}

	if obj.NestedObject2 != nil {
		return obj.NestedObject2
	}

	// all schemas are nil
	return nil
}

type NullableObject struct {
	value *Object
	isSet bool
}

func (v NullableObject) Get() *Object {
	return v.value
}

func (v *NullableObject) Set(val *Object) {
	v.value = val
	v.isSet = true
}

func (v NullableObject) IsSet() bool {
	return v.isSet
}

func (v *NullableObject) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableObject(val *Object) *NullableObject {
	return &NullableObject{value: val, isSet: true}
}

func (v NullableObject) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableObject) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

