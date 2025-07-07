package shop;

import java.util.ArrayList;
import java.util.List;
// 객체를 DB에 CRUD 하는 기능을 잘린 class
public class CustMySQLRepositoy implements SmRepository<CustDto, String> {

    @Override
    public void insert(CustDto custDto) {
        System.out.println("MySQL: Inserting Cust Table");
        System.out.println("MySQL : " + custDto);
    }

    @Override
    public void update(CustDto custDto) {
        System.out.println("MySQL: update Cust Table");
        System.out.println("MySQL : " + custDto);
    }

    @Override
    public void delete(String s) {
        System.out.println("MySQL: deleted Cust Table");
        System.out.println("MySQL : " + s);
    }

    @Override
    public List<CustDto> selectAll() {
        System.out.println("MySQL: Select All Cust Table");
        List<CustDto> custDtos = new ArrayList<>();
        custDtos.add(new CustDto("id01", "pwd01", "이말숙"));
        custDtos.add(new CustDto("id02", "pwd02", "김말숙"));
        custDtos.add(new CustDto("id03", "pwd03", "홍말숙"));
        return custDtos;
    }

    @Override
    public CustDto select(String s) {
        System.out.println("MySQL: Select Cust Table");
        CustDto custDto = new CustDto(s, "pwd01", "이말자");
        return custDto;
    }
}
