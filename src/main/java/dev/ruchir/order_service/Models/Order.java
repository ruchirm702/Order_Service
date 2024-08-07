package dev.ruchir.order_service.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Id;


import java.time.LocalDateTime;
import java.util.List;

//Represents an order placed by a customer.

@Entity
@Table(name = "orders")

@NoArgsConstructor
@AllArgsConstructor
public class Order {
    @Id // Primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // An order is placed by a single customer
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    // An order can have multiple items
    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrderItem> orderItems;

    private String status;
    private LocalDateTime orderDate;
}