package cust;

import eud.sm.dto.Cust;
import eud.sm.service.CustService;
import org.junit.jupiter.api.Test;

public class Insert {
    @Test
    public void Insert() {
        System.out.println("insert Test Start ...");
        CustService custService = new CustService();
        Cust cust = Cust.builder()
                .custId("id55")
                .custPwd("pwd55")
                .custName("홍말순")
                .build();
        try {
            custService.register(cust);
            System.out.println("insert success");
        } catch (Exception e) {
            System.out.println("insert error");
            e.printStackTrace();
        }
    }
}
