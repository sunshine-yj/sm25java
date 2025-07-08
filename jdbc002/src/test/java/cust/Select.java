package cust;

import eud.sm.dto.Cust;
import eud.sm.frame.ConnectionPool;
import eud.sm.service.CustService;
import org.junit.jupiter.api.Test;
import java.sql.Connection;

public class Select {
    @Test
    public void select1() {
        System.out.println("select Test1 Start ...");
        CustService custService = new CustService();
        Cust cust = null;
        try {
            cust = custService.get("id01");
            cust = custService.get("id77");
            cust = custService.get("id55");
            System.out.println(cust);
        } catch (Exception e) {
            System.out.println("failing");
        }
    }

    @Test
    public void select2() {
        System.out.println("select Test2 Start ...");
        CustService custService = new CustService();
        Cust cust = null;
        try {
            cust = custService.get("id77");
            System.out.println(cust);
        } catch (Exception e) {
            System.out.println("failing");
        }
    }
}
