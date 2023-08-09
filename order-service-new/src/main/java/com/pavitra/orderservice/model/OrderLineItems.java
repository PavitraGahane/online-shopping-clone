package com.pavitra.orderservice.model;

import jakarta.persistence.*;
import lombok.*;


import java.math.BigDecimal;

@Entity
@Table(name = "t_order_line_items")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderLineItems {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String skuCode;
    private BigDecimal price;
    private Integer quantity;
}
