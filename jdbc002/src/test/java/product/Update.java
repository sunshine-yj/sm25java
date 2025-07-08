package product;

import eud.sm.dto.Product;
import eud.sm.service.ProductService;
import org.junit.jupiter.api.Test;

public class Update {
    @Test
    void update() {
        System.out.println("update Test1 start ...");
        ProductService productService = new ProductService();
        Product product = Product.builder()
                .productId(1003)
                .productPrice(20000)
                .discountRate(0)
                .productImg("sl1.jpg")
                .build();
        try {
            productService.modify(product);
            System.out.println("update Test1 success");
        } catch (Exception e) {
            System.out.println("update Test1 failed");
            e.printStackTrace();
        }
    }
}
