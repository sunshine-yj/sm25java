package eud.sm.service;

import eud.sm.dto.Cust;
import eud.sm.frame.SmService;
import eud.sm.repository.CustRepository;

import java.util.List;

public class Custservice implements SmService <Cust, String> {

    CustRepository custRepository;

    public Custservice() {
    }

    public Custservice(CustRepository custRepository) {
        this.custRepository = new CustRepository();
    }


    @Override
    public void register(Cust cust) throws Exception {

    }

    @Override
    public void modify(Cust cust) throws Exception {

    }

    @Override
    public void remove(String s) throws Exception {

    }

    @Override
    public List<Cust> get() throws Exception {
        return List.of();
    }

    @Override
    public Cust get(String s) throws Exception {
        return null;
    }
}
