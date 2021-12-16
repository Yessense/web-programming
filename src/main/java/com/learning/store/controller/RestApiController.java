package com.learning.store.controller;

import com.learning.store.dto.CartDto;
import com.learning.store.dto.ItemDto;
import com.learning.store.service.HttpService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class RestApiController {

    private HttpService service;

    // Get methods
    @GetMapping("/products")
    public List<ItemDto> getItems() {
        return service.getItems();
    }

    @GetMapping("/carts")
    public List<CartDto> getCarts() {
        return service.getCarts();
    }

    @GetMapping("/products/{id]")
    public ItemDto getItem(@PathVariable("id") UUID id) {
        return service.getItem(id);
    }

    @GetMapping("/carts/{id}")
    public CartDto getCart(@PathVariable("id") UUID id) {
        return service.getCart(id);
    }

    // Post methods
    @PostMapping("/products")
    public void createItem(@RequestBody) {
        service.createItem();
    }

    @PostMapping("/baskets")
    public CartDto createCart() {
        return service.createCart();
    }

    // Delete methods
    @DeleteMapping("/products/{id}")
    public void deleteItem(@PathVariable("id") UUID id) {
        service.deleteItem(id);
    }

    @DeleteMapping("/carts/{id}")
    public void deleteCart(@PathVariable("id") UUID id) {
        service.deleteCart(id);
    }


    // Put methods
    @PutMapping("/products/{id}")
    public void updateItem(@RequestBody) {
        service.updateItem();
    }


    @PutMapping("/carts/{id}/add_item")
    public void addCartItem(@PathVariable("id") UUID cart,
                            @RequestBody) {
        service.addCartItem();
    }

    @PutMapping("/carts/{id}/remove_item")
    public void removeCartItem(@PathVariable("id") UUID cart,
                            @RequestBody) {
        service.removeCartItem();
    }
