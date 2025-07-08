package eud.sm.frame;

public class CustSql {
    public static String insertCust = "INSERT INTO cust VALUES (?,?,?,NOW(),NOW())";
    public static String updateCust = "UPDATE cust SET cust_name=? cust_id=?  ";
    public static String selectAllCust = "SELECT * FROM cust";
    public static String selectCust = "SELECT * FROM cust WHERE cust_id=?";
}
