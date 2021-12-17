package com.learning.store.service.impl;


import com.learning.store.dto.*;
import com.learning.store.entity.Item;
import com.learning.store.repository.CartRepository;
import com.learning.store.repository.ItemRepository;
import com.learning.store.service.HttpService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@Slf4j
@RequiredArgsConstructor
public class HttpServiceImpl implements HttpService {
    private final ItemRepository itemRepository;
    private final CartRepository cartRepository;

    @Override
    public List<ItemDto> getItems() {
        log.info("Get all items");
        return StreamSupport.stream(itemRepository.findAll().spliterator(), false)
                .map(item -> ItemDto.builder()
                        .name(item.getName())
                        .id(item.getId())
                        .build()
                ).collect(Collectors.toList());
    }

    @Override
    public List<CartDto> getCarts() {
        log.info("Get all Carts");
        return StreamSupport.stream(cartRepository.findAll().spliterator(), false)
                .map(cart -> CartDto.builder()
                        .id(cart.getId())
                        .build()).collect(Collectors.toList());
    }

    @Override
    public ItemDto getItem(UUID id) {
        log.info("Get product by id: {}", id);
        final var item = itemRepository.findById(id);
        if (item.isPresent()) {
            return ItemDto.builder()
                    .id(item.get().getId())
                    .name(item.get().getName())
                    .build();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Cart not found");
        }
    }

    @Override
    public CartDto getCart(UUID id) {
        log.info("Get cart by id: {}", id);
        final var cart = cartRepository.findById(id);
        if (cart.isPresent()) {
            return CartDto.builder()
                    .id(cart.get().getId())
                    .build();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Cart not found");
        }
    }

    @Override
    public void createItem(CreateItemRequest request) {
        System.out.println("hello2");
        log.info("Create item: {}", request);

        final var resource = Item.builder()
                .name(request.getName())
                .id(UUID.randomUUID())
                .build();
        itemRepository.save(resource);

    }

    @Override
    public CartDto createCart() {
        return null;
    }

    @Override
    public void deleteItem(UUID id) {

    }

    @Override
    public void deleteCart(UUID id) {

    }

    @Override
    public void updateItem(UpdateItemRequest request) {

    }

    @Override
    public void addCartItem(UUID cartId, AddCartItemRequest request) {

    }

    @Override
    public void removeCartItem(UUID cartId, RemoveCartItemRequest request) {

    }

}
