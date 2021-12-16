package com.learning.store.service;

import com.learning.store.dto.*;

import java.util.List;
import java.util.UUID;

public interface HttpService {
    // Get methods
    public List<ItemDto> getItems();

    public List<CartDto> getCarts();

    public ItemDto getItem(UUID id);

    public CartDto getCart(UUID id);

    // Post methods
    public void createItem(CreateItemRequest request);

    public CartDto createCart();

    // Delete methods
    public void deleteItem(UUID id);

    public void deleteCart(UUID id);

    // Put methods
    public void updateItem(UpdateItemRequest request);

    public void addCartItem(UUID cartId, AddCartItemRequest request);

    public void removeCartItem(UUID cartId, RemoveCartItemRequest request);
}
