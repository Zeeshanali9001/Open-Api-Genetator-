/*
 * Echo Server API
 * Echo Server API
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: team@openapitools.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.Pet;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BodyApi
 */
@Disabled
public class BodyApiTest {

    private final BodyApi api = new BodyApi();

    /**
     * Test body parameter(s)
     *
     * Test body parameter(s)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void testEchoBodyPetTest() throws ApiException {
        Pet pet = null;
        Pet response = api.testEchoBodyPet(pet);
        // TODO: test validations
    }

}
