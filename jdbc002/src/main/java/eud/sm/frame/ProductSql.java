package eud.sm.frame;

public class ProductSql {
    public static String insert = "INSERT INTO product VALUES (?,?,?,?,?,NOW(),NOW(),?)";
    public static String select = "SELECT * FROM product WHERE product_id=?";
    public static String delete = "DELETE FROM product WHERE product_id=?";
    public static String selectAll = "SELECT * FROM product p Inner JOIN cate c ON product.cate_id=c.cate_id";
    public static String update = "UPDATE product SET product_price=?, discount_rate=?, product_img=? WHERE product_id=?";
}
