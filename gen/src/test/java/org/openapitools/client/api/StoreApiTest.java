/*
 * Swagger Petstore
 * This is a sample server Petstore server.  You can find out more about Swagger at [https://swagger.io](https://swagger.io) or on [irc.freenode.net, #swagger](https://swagger.io/irc/).  For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.Order;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StoreApi
 */
@Ignore
public class StoreApiTest {

    private final StoreApi api = new StoreApi();

    
    /**
     * Delete purchase order by ID
     *
     * For valid response try integer IDs with value &lt; 1000. Anything above 1000 or nonintegers will generate API errors
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteOrderTest() throws ApiException {
        String orderId = null;
        api.deleteOrder(orderId);

        // TODO: test validations
    }
    
    /**
     * Returns pet inventories by status
     *
     * Returns a map of status codes to quantities
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInventoryTest() throws ApiException {
        Map<String, Integer> response = api.getInventory();

        // TODO: test validations
    }
    
    /**
     * Find purchase order by ID
     *
     * For valid response try integer IDs with value &lt;&#x3D; 5 or &gt; 10. Other values will generated exceptions
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOrderByIdTest() throws ApiException {
        Long orderId = null;
        Order response = api.getOrderById(orderId);

        // TODO: test validations
    }
    
    /**
     * Place an order for a pet
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void placeOrderTest() throws ApiException {
        Order body = null;
        Order response = api.placeOrder(body);

        // TODO: test validations
    }
    
}
