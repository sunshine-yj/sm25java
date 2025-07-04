package company;

public class Company2 {
    public static void main(String[] args) {
        Employee [] e = new Employee[3];
        e[0] = new Employee("이사원",1000.0);
        e[1] = new SalesEmployee("이세일",1000.0,"seoul",1000.0);
        e[2] = new SecretaryEmployee("이비서", 1000.0, "이보스");

        for (Employee n : e) {
            System.out.println(n);
        }

        for (Employee n : e) {
            System.out.println(n.getAnnualSalary());
        }

    }
}
