package week9;

import java.util.List;

public interface OrderDAO {
    void create(Order order);

    void delete(String orderNumber);

    List<Order> findAll();

    List<Order> findAllByOrderStatus(String OrderStatus);

    void update(String orderNumber, Order order);
}

