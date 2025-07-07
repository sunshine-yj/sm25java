package shop;

import java.util.List;

public interface SmService<V, K> {
    // 등록
    void register(V v);
    // 수정
    void modify(V v);
    // 삭제
    void remove(K k);
    // 전체 조회
    List<V> get();
    // 단일 조회
    V get (K k);

}
