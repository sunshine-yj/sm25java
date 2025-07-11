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
                .custId("id76")
                .custPwd("pwd77")
                .custName("홍길")
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
