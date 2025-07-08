package product;

import eud.sm.dto.Product;
import eud.sm.service.ProductService;
import org.junit.jupiter.api.Test;

public class Insert {
    @Test
    public void insert() {
        System.out.println("insert Test1 start ...");
        ProductService productService = new ProductService();
        Product product = Product.builder()
                .productId(1003)
                .productName("슬리퍼")
                .productPrice(10000)
                .discountRate(0.3)
                .productImg("sl1,jpg")
                .cateId(30)
                .build();
        try {
            productService.register(product);
            System.out.println("insert Test1 success");
        } catch (Exception e) {
            System.out.println("insert Test1 failed");
            e.printStackTrace();
        }
    }
}
