package dev.ruchir.order_service.Models;

import dev.ruchir.order_service.Models.Order;
import dev.ruchir.order_service.Models.Product;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;

// Represents an item in an order.
@Entity
@Table(name = "order_items")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderItem {

    @Id // Primary key for the order item.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne // Many-to-One with Order.
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne // Many-to-One with Product.
    @JoinColumn(name = "product_id")
    private Product product; // Ensure this matches the correct package

    private int quantity;
    private BigDecimal price;
}
