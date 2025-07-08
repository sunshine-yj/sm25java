package cust;


import eud.sm.dto.Cust;
import eud.sm.service.CustService;
import org.junit.jupiter.api.Test;

public class Update {
    @Test
    public void test1() {
        System.out.println("Update Test1 ....");
        CustService custService = new CustService();
        Cust cust = Cust.builder()
                .custId("id77")
                .custPwd("pwd123")
                .custName("홍길길")
                .build();
        try {
            custService.modify(cust);
            System.out.println(cust);
        } catch (Exception e) {
            System.out.println("Failing");
            e.printStackTrace();
        }
    }
}
