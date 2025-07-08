package cust;

import eud.sm.dto.Cust;
import eud.sm.service.CustService;
import org.junit.jupiter.api.Test;

public class Delete {
    @Test
    public void delete() {
        System.out.println("delete Test1 Start ...");
        CustService custService = new CustService();
        try {
            custService.remove("id77");
            System.out.println("delete Test1 Success");
        } catch (Exception e) {
            System.out.println("delete Test1 Failed");
            e.printStackTrace();
        }
    }
}
