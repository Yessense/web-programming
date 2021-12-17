package com.learning.store.entity;

import java.util.UUID;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "cart")
public class Cart {
    @Id
    private UUID id;

}
