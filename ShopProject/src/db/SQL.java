package db;

public class SQL {
	
	// customer
	public static final String INSERT_CUSTOMER = "INSERT INTO `Customer` VALUES (?,?,?,?,NOW())";
	public static final String SELECT_CUSTOMER = "SELECT * FROM `Customer` WHERE `custId`=?";
	public static final String SELECT_CUSTOMER_LIST = "SELECT * FROM `Customer`";
	public static final String UPDATE_CUSTOMER = "UPDATE `Customer` SET "
												+ "`custId`=?,"
												+ "`name`=?,"
												+ "`hp`=?,"
												+ "`addr`=?,";
	
	public static final String DELETE_CUSTOMER = "DELETE FROM `Customer` WHERE `custId`=?";
	
	// order
	public static final String INSERT_ORDER = "INSERT INTO `Order` SET "
												+ "`orderId`=?,"
												+ "`orderProduct`=?,"
												+ "`orderCount`=?,"
												+ "`orderDate`=NOW()";
	public static final String SELECT_ORDERS = "SELECT "
												+ "`orderNo`,"
												+ "`orderId`,"
												+ "`prodName`,"
												+ "`orderCount`,"
												+ "`price`,"
												+ "`orderCount` * `price` as `total`,"
												+ "`orderDate` "
												+ "FROM `Order` as a "
												+ "JOIN `Product` as b ON a.orderProduct = b.prodNo";
	
	
	// product
	// alter table `product` modify `prodNo` int auto_increment;
	public static final String INSERT_PRODUCT = "INSERT INTO `Product` SET "
												+ "`prodName`=?,"
												+ "`stock`=?,"
												+ "`price`=?,"
												+ "`company`=?";
	
	public static final String SELECT_PRODUCTS = "SELECT * FROM `Product`";
	
}