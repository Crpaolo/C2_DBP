package com.example.c2_dbp.events;

import org.springframework.context.ApplicationEvent;
import com.example.c2_dbp.model.Producto;
import java.util.List;

public class OrderCreatedEvent extends ApplicationEvent {

    private final String orderId;
    private final String email;
    private final List<Producto> productos;

    public OrderCreatedEvent(Object source, String orderId, String email, List<Producto> productos) {
        super(source);
        this.orderId = orderId;
        this.email = email;
        this.productos = productos;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getEmail() {
        return email;
    }

    public List<Producto> getProductos() {
        return productos;
    }
}
