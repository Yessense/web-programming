package com.learning.store.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "cartItem")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CartItem { @Id
    private UUID id;

}
