package company;

public class Company {
    public static void main(String[] args) {
        Employee employee = new Employee("이사원",1000.0);
        SalesEmployee salesEmployee = new SalesEmployee("이세일",1000.0,"seoul",1000.0);
        SecretaryEmployee secretaryEmployee = new SecretaryEmployee("이비서", 1000.0, "이보스");

        System.out.println(employee);
        System.out.println(salesEmployee);
        System.out.println(secretaryEmployee);

        System.out.println(employee.getAnnualSalary());
        System.out.println(salesEmployee.getAnnualSalary());
        System.out.println(secretaryEmployee.getAnnualSalary());
    }
}
