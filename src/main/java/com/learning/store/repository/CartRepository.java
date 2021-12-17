package com.learning.store.repository;

import com.learning.store.entity.Cart;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;


@Repository
public interface CartRepository extends CrudRepository<Cart, UUID> {

}
