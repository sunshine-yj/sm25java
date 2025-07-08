package eud.sm.repository;

import eud.sm.dto.Cust;
import eud.sm.frame.SmRepository;

import java.sql.Connection;
import java.util.List;

public class CustRepository implements SmRepository<Cust, String> {

    @Override
    public void insert(Cust cust, Connection conn) throws Exception {

    }

    @Override
    public void update(Cust cust, Connection conn) throws Exception {

    }

    @Override
    public void delete(String s, Connection conn) throws Exception {

    }

    @Override
    public List<Cust> selectAll(Connection conn) throws Exception {
        return List.of();
    }

    @Override
    public Cust select(String s, Connection conn) throws Exception {
        return null;
    }
}
