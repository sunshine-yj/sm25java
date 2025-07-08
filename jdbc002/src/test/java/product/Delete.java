package product;

import eud.sm.service.ProductService;
import org.junit.jupiter.api.Test;

public class Delete {
    @Test
    void delete() {
        System.out.println("delete Test1 start ...");
        ProductService productService = new ProductService();
        try {
            productService.remove(1003);
            System.out.println("delete Test1 Success");
        } catch (Exception e) {
            System.out.println("delete Test1 Failed");
            e.printStackTrace();
        }
    }
}
