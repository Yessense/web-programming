package com.learning.store.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.UUID;

@Table(name = "item")
public class Item {
    @Id
    private UUID id;

    @Column(name = "name")
    private String name;
}
