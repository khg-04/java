package db;

public class SQL {
	
	// customer
	public static final String INSERT_CUSTOMER = "INSERT INTO `Customer` VALUES (?,?,?,?,NOW())";
	public static final String SELECT_CUSTOMER_LIST = "SELECT * FROM `Customer`";
	public static final String SELECT_CUSTOMER = "SELECT * FROM `Customer` WHERE `custId`=?";
	
	// order
	public static final String INSERT_ORDER = "INSERT INTO `Order` VALUES (?,?,?,?,NOW())";
	public static final String SELECT_ORDER_LIST = "SELECT * FROM `Order`";
	public static final String SELECT_ORDER = "SELECT * FROM `Order` WHERE `orderId`=?";
	
	// product
	public static final String INSERT_PRODUCT = "INSERT INTO `Product` VALUES (?,?,?,?,?)";
	public static final String SELECT_PRODUCT_LIST = "SELECT * FROM `Product`";
	public static final String SELECT_PRODUCT = "SELECT * FROM `Product` WHERE `prodNo`=?";

}
