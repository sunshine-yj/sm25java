package company;

public class SalesEmployee extends Employee {
    // member variable
    // empNo, name, salary
    private String loc;
    private double bonus;

    public SalesEmployee() {

    }

    public SalesEmployee(String name, double salary, String loc, double bonus) {
        super(name, salary);
        this.loc = loc;
        this.bonus = bonus;
    }

    public SalesEmployee(String empNo, String name, double salary, String loc, double bonus) {
        super(empNo, name, salary);
        this.loc = loc;
        this.bonus = bonus;
    }

    public String getLoc() {
        return loc;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public String toString() {
        return "SalesEmployee{" +
                ", empNo=" + getEmpNo()+
                ", name=" + getName() +
                ", salary=" + getSalary() +
                "loc='" + loc + '\'' +
                ", bonus=" + bonus +
                '}';
    }

    @Override
    public double getAnnualSalary() {
//        return super.getSalary() * 12 + bonus;
        return super.getAnnualSalary() + bonus;
    }
}
