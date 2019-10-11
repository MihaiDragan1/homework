package week9;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class OrderDAOImp implements OrderDAO {

    public static void main(String[] args) {
        OrderDAOImp orderDAO = new OrderDAOImp();

        orderDAO.findAllByOrderStatus("status")
                .stream()
                .forEach(System.out::println);

        orderDAO.create(Order.builder()
                .orderNumber("10550")
                .orderDate(LocalDate.of(2019, 10, 20))
                .build());
        System.out.println(" after insert ---------------");
        orderDAO.delete("10100");
        orderDAO.findAll()
                .stream()
                .forEach(System.out::println);
    }

    @Override
    public List<Order> findAll() {
        List<Order> order = new ArrayList<>();
        try (Connection connection = getConnection()) {
            String sql = "SELECT * FROM orders";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Order orders = new Order();
                orders.setOrderNumber(resultSet.getString("orderNumber"));
                orders.setOrderDate(resultSet.getDate("orderDate").toLocalDate());
                //   orders.getOrderComments(resultSet.getString("orderComments"));
                order.add(orders);
            }
            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return order;
    }

    @Override
    public List<Order> findAllByOrderStatus(String OrderStatus) {
        List<Order> orders = new ArrayList<>();
        try (Connection connection = getConnection()) {
            String sql = "SELECT * FROM orders WHERE status = ?";
            String sqlInjectabil = "SELECT * FROM orders WHERE status = " + OrderStatus;
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            Statement statement = connection.createStatement();
            statement.executeQuery(sqlInjectabil);

            preparedStatement.setString(1, OrderStatus);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Order order = new Order();
                order.setOrderNumber(resultSet.getString("orderNumber"));
                order.setOrderDate(resultSet.getDate("orderDate").toLocalDate());
                order.setStatus(resultSet.getString("orderStatus"));
                // order.getOrderComments(resultSet.getString("orderComments"));
                orders.add(order);
            }
            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return orders;
    }


    @Override
    public void create(Order order) {

        try (Connection connection = getConnection()) {

            String sql = "INSERT INTO orders (orderNumber, orderDate) VALUES (10, 2020.10.12)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, order.getOrderNumber());
            preparedStatement.setDate(2, Date.valueOf(order.getOrderDate()));
            // preparedStatement.setString(3, order.getStatus());
            int numberOfModifedRows = preparedStatement.executeUpdate();
            if (numberOfModifedRows == 1) {
                System.out.println("Inserare cu succes");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(String orderNumber) {
        try (Connection connection = getConnection()) {

            String sql = "DELETE FROM orders where orderNumber = 10100";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, orderNumber);

            int numberOfModifedRows = preparedStatement.executeUpdate();
            if (numberOfModifedRows == 1) {
                System.out.println("S-a efectuat stergerea");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private Connection getConnection() {
        try {
            return DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/classicmodels?useSSL=true",
                    "root",
                    "Mihaita1982!@#");
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void update(String orderNumber, Order order) {
    }
}
