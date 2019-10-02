package week9;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDAOImpl implements ProductDAO {

    public static void main(String[] args) {
        ProductDAOImpl productDAO = new ProductDAOImpl();

        productDAO.findAllByProductLine("productName")
                .stream()
                .forEach(System.out::println);

 productDAO.create(Product.builder()
                .productCode("A_12")
                .productVendor("Audi")
                .productLine("Car")
                .productDescription("bla bla")
                .build());
        System.out.println(" after insert ------");
        productDAO.delete("S10_1678");
        productDAO.findAll()
                .stream()
                .forEach(System.out::println);
    }

    @Override
    public List<Product> findAll(){
        List<Product> product = new ArrayList<>();
        try (Connection connection = getConnection()){
            String sql = "SELECT * FROM products";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Product products = new Product();
                products.setProductCode(resultSet.getString("productCode"));
                products.setProductLine(resultSet.getString("productLine"));
                products.setProductVendor(resultSet.getString("productVendor"));
             //   products.getProductDescription(resultSet.getString("productDescription"));
                product.add(products);
            }
            preparedStatement.close();
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return product;
    }

    @Override
    public List<Product> findAllByProductLine(String ProductLine) {
        List<Product> products = new ArrayList<>();
        try (Connection connection = getConnection()) {
            String sql = "SELECT * FROM products WHERE PRODUCTLINE = ?";
            String sqlInjectabil = "SELECT * FROM products WHERE PRODUCTLINE = " + ProductLine;
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            Statement statement = connection.createStatement();
            statement.executeQuery(sqlInjectabil);

            preparedStatement.setString(1, ProductLine);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Product product = new Product();
                product.setProductCode(resultSet.getString("productCode"));
                product.setProductLine(resultSet.getString("productLine"));
                product.setProductVendor(resultSet.getString("productVendor"));
              // product.getProductDescription(resultSet.getString("productDescription"));
                products.add(product);
            }
            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return products;
    }


    @Override
    public void create(Product product) {

        try (Connection connection = getConnection()) {

            String sql = "INSERT INTO products (productCode, productLine, productVendor, productDescription) VALUES (10, Car, Dacia, National Car)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, product.getProductCode());
            preparedStatement.setString(2, product.getProductLine());
            preparedStatement.setString(3, product.getProductVendor());
            preparedStatement.setString(4, product.getProductDescription());
            int numberOfModifedRows = preparedStatement.executeUpdate();//se fol pt insert, update, delete
            if (numberOfModifedRows == 1) {
                System.out.println("Inserare cu succes");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(String productCode) {
        try (Connection connection = getConnection()) {

            String sql = "DELETE FROM products where productCode = S10_1678";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,productCode);

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
                "asd");
    }  catch(SQLException e){
            e.printStackTrace();
            return null;
        }
    }
        @Override
                public void update (String productCode, Product product) {
}

}
