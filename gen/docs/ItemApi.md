# ItemApi

All URIs are relative to *http://com.learning.store/src*

Method | HTTP request | Description
------------- | ------------- | -------------
[**additem**](ItemApi.md#additem) | **POST** /products | Add new product
[**updateItem**](ItemApi.md#updateItem) | **PUT** /products | Update product


<a name="additem"></a>
# **additem**
> additem()

Add new product

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://com.learning.store/src");

    ItemApi apiInstance = new ItemApi(defaultClient);
    try {
      apiInstance.additem();
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemApi#additem");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**405** | Invalid input |  -  |

<a name="updateItem"></a>
# **updateItem**
> updateItem(body)

Update product

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://com.learning.store/src");

    ItemApi apiInstance = new ItemApi(defaultClient);
    Object body = null; // Object | Pet object that needs to be added to the store
    try {
      apiInstance.updateItem(body);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemApi#updateItem");
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
 **body** | **Object**| Pet object that needs to be added to the store |

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

