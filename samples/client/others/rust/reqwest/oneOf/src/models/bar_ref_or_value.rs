/*
 * ByRefOrValue
 *
 * This tests for a oneOf interface representation 
 *
 * The version of the OpenAPI document: 0.0.1
 * 
 * Generated by: https://openapi-generator.tech
 */

use crate::models;

#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
#[serde(untagged)]
pub enum BarRefOrValue {
    Bar(Box<models::Bar>),
    BarRef(Box<models::BarRef>),
}

impl Default for BarRefOrValue {
    fn default() -> Self {
        Self::Bar(Default::default())
    }
}
