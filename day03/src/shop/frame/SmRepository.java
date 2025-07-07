package shop.frame;

import java.util.List;

public interface SmRepository<V, K> {
    // Database에 CRUD 기능 정의
    // Insert (C), select(R), update (U), Delete (D)
    // Insert (C)
    void insert(V v);
    // update (U)
    void update(V v);
    // Delete (D)
    void delete(K k);
    // select (R)
    List<V> selectAll();
    V select(K k);
}
