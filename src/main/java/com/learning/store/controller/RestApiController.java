package com.learning.store.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class RestApiController {

    // ToDo: service
    private HttpService service;

    @GetMapping("/products")
    public List<String> getItems() {
        return;
    }

    @GetMapping("/products/{id]")
    public ItemDto getItem(@PathVariable("id") UUID id) {
        return;
    }

    @PostMapping("/products")
    public void createItem(@RequestBody) {

    }


    @PutMapping("/products/{id}")
    public void putItem(@RequestBody) {


    }

    @DeleteMapping("/products/{id}")

    @GetMapping("/carts")

    @GetMapping("/carts/{id}")

    @DeleteMapping("/carts/{id}")

    @PutMapping("/carts/{id}/add_item")

    @PutMapping("/carts/{id}/remove_item")
}
