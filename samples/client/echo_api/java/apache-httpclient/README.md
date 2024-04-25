# echo-api-apache-httpclient

Echo Server API

- API version: 0.1.0

- Generator version: 7.6.0-SNAPSHOT

Echo Server API


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>echo-api-apache-httpclient</artifactId>
  <version>0.1.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.openapitools:echo-api-apache-httpclient:0.1.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/echo-api-apache-httpclient-0.1.0.jar`
- `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import org.openapitools.client.*;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AuthApi;

public class AuthApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:3000");
        
        // Configure HTTP basic authorization: http_auth
        HttpBasicAuth http_auth = (HttpBasicAuth) defaultClient.getAuthentication("http_auth");
        http_auth.setUsername("YOUR USERNAME");
        http_auth.setPassword("YOUR PASSWORD");

        AuthApi apiInstance = new AuthApi(defaultClient);
        try {
            String result = apiInstance.testAuthHttpBasic();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthApi#testAuthHttpBasic");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost:3000*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AuthApi* | [**testAuthHttpBasic**](docs/AuthApi.md#testAuthHttpBasic) | **POST** /auth/http/basic | To test HTTP basic authentication
*AuthApi* | [**testAuthHttpBearer**](docs/AuthApi.md#testAuthHttpBearer) | **POST** /auth/http/bearer | To test HTTP bearer authentication
*BodyApi* | [**testBinaryGif**](docs/BodyApi.md#testBinaryGif) | **POST** /binary/gif | Test binary (gif) response body
*BodyApi* | [**testBodyApplicationOctetstreamBinary**](docs/BodyApi.md#testBodyApplicationOctetstreamBinary) | **POST** /body/application/octetstream/binary | Test body parameter(s)
*BodyApi* | [**testBodyMultipartFormdataArrayOfBinary**](docs/BodyApi.md#testBodyMultipartFormdataArrayOfBinary) | **POST** /body/application/octetstream/array_of_binary | Test array of binary in multipart mime
*BodyApi* | [**testBodyMultipartFormdataSingleBinary**](docs/BodyApi.md#testBodyMultipartFormdataSingleBinary) | **POST** /body/application/octetstream/single_binary | Test single binary in multipart mime
*BodyApi* | [**testEchoBodyAllOfPet**](docs/BodyApi.md#testEchoBodyAllOfPet) | **POST** /echo/body/allOf/Pet | Test body parameter(s)
*BodyApi* | [**testEchoBodyFreeFormObjectResponseString**](docs/BodyApi.md#testEchoBodyFreeFormObjectResponseString) | **POST** /echo/body/FreeFormObject/response_string | Test free form object
*BodyApi* | [**testEchoBodyPet**](docs/BodyApi.md#testEchoBodyPet) | **POST** /echo/body/Pet | Test body parameter(s)
*BodyApi* | [**testEchoBodyPetResponseString**](docs/BodyApi.md#testEchoBodyPetResponseString) | **POST** /echo/body/Pet/response_string | Test empty response body
*BodyApi* | [**testEchoBodyStringEnum**](docs/BodyApi.md#testEchoBodyStringEnum) | **POST** /echo/body/string_enum | Test string enum response body
*BodyApi* | [**testEchoBodyTagResponseString**](docs/BodyApi.md#testEchoBodyTagResponseString) | **POST** /echo/body/Tag/response_string | Test empty json (request body)
*FormApi* | [**testFormIntegerBooleanString**](docs/FormApi.md#testFormIntegerBooleanString) | **POST** /form/integer/boolean/string | Test form parameter(s)
*FormApi* | [**testFormObjectMultipart**](docs/FormApi.md#testFormObjectMultipart) | **POST** /form/object/multipart | Test form parameter(s) for multipart schema
*FormApi* | [**testFormOneof**](docs/FormApi.md#testFormOneof) | **POST** /form/oneof | Test form parameter(s) for oneOf schema
*HeaderApi* | [**testHeaderIntegerBooleanStringEnums**](docs/HeaderApi.md#testHeaderIntegerBooleanStringEnums) | **GET** /header/integer/boolean/string/enums | Test header parameter(s)
*PathApi* | [**testsPathStringPathStringIntegerPathIntegerEnumNonrefStringPathEnumRefStringPath**](docs/PathApi.md#testsPathStringPathStringIntegerPathIntegerEnumNonrefStringPathEnumRefStringPath) | **GET** /path/string/{path_string}/integer/{path_integer}/{enum_nonref_string_path}/{enum_ref_string_path} | Test path parameter(s)
*QueryApi* | [**testEnumRefString**](docs/QueryApi.md#testEnumRefString) | **GET** /query/enum_ref_string | Test query parameter(s)
*QueryApi* | [**testQueryDatetimeDateString**](docs/QueryApi.md#testQueryDatetimeDateString) | **GET** /query/datetime/date/string | Test query parameter(s)
*QueryApi* | [**testQueryIntegerBooleanString**](docs/QueryApi.md#testQueryIntegerBooleanString) | **GET** /query/integer/boolean/string | Test query parameter(s)
*QueryApi* | [**testQueryStyleDeepObjectExplodeTrueObject**](docs/QueryApi.md#testQueryStyleDeepObjectExplodeTrueObject) | **GET** /query/style_deepObject/explode_true/object | Test query parameter(s)
*QueryApi* | [**testQueryStyleDeepObjectExplodeTrueObjectAllOf**](docs/QueryApi.md#testQueryStyleDeepObjectExplodeTrueObjectAllOf) | **GET** /query/style_deepObject/explode_true/object/allOf | Test query parameter(s)
*QueryApi* | [**testQueryStyleFormExplodeFalseArrayInteger**](docs/QueryApi.md#testQueryStyleFormExplodeFalseArrayInteger) | **GET** /query/style_form/explode_false/array_integer | Test query parameter(s)
*QueryApi* | [**testQueryStyleFormExplodeFalseArrayString**](docs/QueryApi.md#testQueryStyleFormExplodeFalseArrayString) | **GET** /query/style_form/explode_false/array_string | Test query parameter(s)
*QueryApi* | [**testQueryStyleFormExplodeTrueArrayString**](docs/QueryApi.md#testQueryStyleFormExplodeTrueArrayString) | **GET** /query/style_form/explode_true/array_string | Test query parameter(s)
*QueryApi* | [**testQueryStyleFormExplodeTrueObject**](docs/QueryApi.md#testQueryStyleFormExplodeTrueObject) | **GET** /query/style_form/explode_true/object | Test query parameter(s)
*QueryApi* | [**testQueryStyleFormExplodeTrueObjectAllOf**](docs/QueryApi.md#testQueryStyleFormExplodeTrueObjectAllOf) | **GET** /query/style_form/explode_true/object/allOf | Test query parameter(s)


## Documentation for Models

 - [Bird](docs/Bird.md)
 - [Category](docs/Category.md)
 - [DataQuery](docs/DataQuery.md)
 - [DefaultValue](docs/DefaultValue.md)
 - [NumberPropertiesOnly](docs/NumberPropertiesOnly.md)
 - [Pet](docs/Pet.md)
 - [Query](docs/Query.md)
 - [StringEnumRef](docs/StringEnumRef.md)
 - [Tag](docs/Tag.md)
 - [TestFormObjectMultipartRequestMarker](docs/TestFormObjectMultipartRequestMarker.md)
 - [TestQueryStyleDeepObjectExplodeTrueObjectAllOfQueryObjectParameter](docs/TestQueryStyleDeepObjectExplodeTrueObjectAllOfQueryObjectParameter.md)
 - [TestQueryStyleFormExplodeTrueArrayStringQueryObjectParameter](docs/TestQueryStyleFormExplodeTrueArrayStringQueryObjectParameter.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization


Authentication schemes defined for the API:
<a id="http_auth"></a>
### http_auth


- **Type**: HTTP basic authentication

<a id="http_bearer_auth"></a>
### http_bearer_auth


- **Type**: HTTP Bearer Token authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

team@openapitools.org
