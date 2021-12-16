package com.learning.store.service;

import com.learning.store.dto.CartDto;
import com.learning.store.dto.ItemDto;

import java.util.List;
import java.util.UUID;

public interface HttpService {
    // Get methods
    public List<ItemDto> getItems();

    public List<CartDto> getCarts();

    public ItemDto getItem(UUID id);

    public CartDto getCart(UUID id);

    // Post methods
    public void createItem();

    public CartDto createCart();

    // Delete methods
    public void deleteItem(UUID id);

    public void deleteCart(UUID id);

    // Put methods
    public void updateItem();

    public void addCartItem();

    public void removeCartItem();
}
