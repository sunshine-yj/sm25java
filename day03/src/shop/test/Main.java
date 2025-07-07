package shop.test;

import shop.dto.CustDto;
import shop.frame.SmService;
import shop.service.CustService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start Main Application...");
        System.out.println();
        SmService<CustDto, String> smService;
        smService = new CustService();

        System.out.println("1. Cust Register ...");
        CustDto custDto = new CustDto("id01", "pwd01", "이말숙");
        smService.register(custDto);
        System.out.println();

        System.out.println("2. Cust getAll ...");
        List<CustDto> custs = null;
        custs = smService.get();
        for (CustDto cust : custs) {
            System.out.println(cust);
        }
        System.out.println();

        System.out.println("3. Cust Delete ...");
        String id = "id88";
        smService.remove(id);
        System.out.println();

        System.out.println("4. Cust select ...");
        String id1 = "id01";
        CustDto myInfo = null;
        myInfo = smService.get(id1);
        System.out.println(myInfo);
        System.out.println();

        System.out.println("5. Cust update ...");
        CustDto uCust = new CustDto("id01", "pwd01", "홍말숙");
        smService.modify(uCust);
        System.out.println();

        System.out.println("End Main Application...");
    }
}
