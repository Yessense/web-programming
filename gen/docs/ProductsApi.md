# ProductsApi

All URIs are relative to *http://petstore.swagger.io/src*

Method | HTTP request | Description
------------- | ------------- | -------------
[**additem**](ProductsApi.md#additem) | **POST** /products | Add new product to products


<a name="additem"></a>
# **additem**
> additem()

Add new product to products

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProductsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://petstore.swagger.io/src");

    ProductsApi apiInstance = new ProductsApi(defaultClient);
    try {
      apiInstance.additem();
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductsApi#additem");
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

