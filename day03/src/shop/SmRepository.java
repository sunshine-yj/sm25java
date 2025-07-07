package shop;

import java.util.List;

public interface SmRepository<V, K> {
    // Database에 Curd 가능 넏의
    // Insert(C), select(R), update (U), Delete (d)
    void insert(V v);
    void update(V v);
    void delete(K k);
    List<V> selectAll();
    V select(K k);
}
