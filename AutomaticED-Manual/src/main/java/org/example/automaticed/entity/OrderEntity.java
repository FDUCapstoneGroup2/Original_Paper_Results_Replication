package org.example.automaticed.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
/**
 * This is the entity class for Order.
 * It represents the structure of the 't_order' table in the database.
 *
 * Done by Yan
 */
@Data
@Table(name = "t_order")
// @JsonIgnoreProperties is currently commented out, may be required in the future for lazy loading handling.
@Entity
public class OrderEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Long orderId;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "order_name")
    private String orderName;

    // Getter and Setter methods are generated by Lombok. In future revisions, we may add custom logic to these methods if needed.

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return userName;
    }

    public void setUsername(String userName) {
        // TODO: Potential future improvement - add validation logic for user name
        this.userName = userName;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    // Additional methods for data validation or transformation can be added later if required.
}
