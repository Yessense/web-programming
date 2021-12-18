# PetApi

All URIs are relative to *http://petstore.swagger.io/src*

Method | HTTP request | Description
------------- | ------------- | -------------
[**updatePet**](PetApi.md#updatePet) | **PUT** /products | Update an existing pet


<a name="updatePet"></a>
# **updatePet**
> updatePet(body)

Update an existing pet

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PetApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://petstore.swagger.io/src");

    PetApi apiInstance = new PetApi(defaultClient);
    Pet body = new Pet(); // Pet | Pet object that needs to be added to the store
    try {
      apiInstance.updatePet(body);
    } catch (ApiException e) {
      System.err.println("Exception when calling PetApi#updatePet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **Pet**| Pet object that needs to be added to the store |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**400** | Invalid ID supplied |  -  |
**404** | Pet not found |  -  |
**405** | Validation exception |  -  |

