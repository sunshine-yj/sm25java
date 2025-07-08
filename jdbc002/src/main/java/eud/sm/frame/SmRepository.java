package eud.sm.frame;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public interface SmRepository<V, K> {
    // Database에 CRUD 기능 정의
    // Insert (C), select(R), update (U), Delete (D)
    // Insert (C)
    void insert(V v, Connection conn) throws Exception;
    // update (U)
    void update(V v, Connection conn) throws Exception;
    // Delete (D)
    void delete(K k, Connection conn) throws Exception;
    // select (R)
    List<V> selectAll(Connection conn) throws Exception;
    V select(K k, Connection conn) throws Exception;
}
