package eud.sm.service;

import eud.sm.dto.Product;
import eud.sm.frame.ConnectionPool;
import eud.sm.frame.SmService;
import eud.sm.repository.ProductRepository;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class ProductService implements SmService <Product, Integer> {

    ProductRepository productRepository;
    ConnectionPool connPool;

    public ProductService() {
        this.productRepository = new ProductRepository();
        try {
            connPool = ConnectionPool.create();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void register(Product product) throws Exception {
        Connection conn = connPool.getConnection();
        try {
            conn.setAutoCommit(false);
            productRepository.insert(product, conn);
            conn.commit();
        } catch (SQLException e) {
            conn.rollback();
            throw e;
        } finally {
            if (conn != null) {
                connPool.releaseConnection(conn);
            }
        }
    }

    @Override
    public void modify(Product product) throws Exception {
        Connection conn = connPool.getConnection();
        try {
            conn.setAutoCommit(false);
            productRepository.update(product, conn);
            conn.commit();
        } catch (SQLException e) {
            conn.rollback();
            throw e;
        } finally {
            if (conn != null) {
                connPool.releaseConnection(conn);
            }
        }
    }

    @Override
    public void remove(Integer integer) throws Exception {
        Connection conn = connPool.getConnection();
        try {
            conn.setAutoCommit(false);
            productRepository.delete(integer, conn);
            conn.commit();
        } catch (SQLException e) {
            conn.rollback();
            throw e;
        }  finally {
            if (conn != null) {
                connPool.releaseConnection(conn);
            }
        }
    }

    @Override
    public List<Product> get() throws Exception {
        return List.of();
    }

    @Override
    public Product get(Integer integer) throws Exception {
        return null;
    }
}
