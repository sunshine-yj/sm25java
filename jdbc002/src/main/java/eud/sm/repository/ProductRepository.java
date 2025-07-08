package eud.sm.repository;

import eud.sm.dto.Product;
import eud.sm.frame.ProductSql;
import eud.sm.frame.SmRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

public class ProductRepository implements SmRepository<Product, Integer> {
    @Override
    public void insert(Product product, Connection conn) throws Exception {
        PreparedStatement psmt = null;
        try {
            psmt = conn.prepareStatement(ProductSql.insert);
            psmt.setInt(1, product.getProductId());
            psmt.setString(2, product.getProductName());
            psmt.setInt(3, product.getProductPrice());
            psmt.setDouble(4, product.getDiscountRate());
            psmt.setString(5, product.getProductImg());
            psmt.setInt(6, product.getCateId());
            psmt.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            if (psmt != null) {
                psmt.close();
            }
        }
    }

    @Override
    public void update(Product product, Connection conn) throws Exception {
        PreparedStatement psmt = null;
        try {
            psmt = conn.prepareStatement(ProductSql.update);
            psmt.setInt(4, product.getProductId());
            psmt.setInt(1, product.getProductPrice());
            psmt.setDouble(2, product.getDiscountRate());
            psmt.setString(3, product.getProductImg());
            psmt.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            if(psmt != null) {
                psmt.close();
            }
        }
    }

    @Override
    public void delete(Integer integer, Connection conn) throws Exception {
        PreparedStatement psmt = null;
        try {
            psmt = conn.prepareStatement(ProductSql.delete);
            psmt.setInt(1, integer);
            psmt.executeUpdate();
        }  catch (Exception e) {
            throw e;
        } finally {
            if(psmt != null) {
                psmt.close();
            }
        }
    }

    @Override
    public List<Product> selectAll(Connection conn) throws Exception {
        return List.of();
    }

    @Override
    public Product select(Integer integer, Connection conn) throws Exception {
        return null;
    }
}
