package dao;

import db.DBHelper;
import db.SQL;
import entity.Order;

public class OrderDAO extends DBHelper{
	
	// 싱클톤
	private static final OrderDAO INSTANCE = new OrderDAO();
	public static OrderDAO getInstance() {
		return INSTANCE;
	}
	private OrderDAO() {}
	
	// 기본 CRUD
	public void insertOrder(Order order) {
		
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.INSERT_ORDER);
			psmt.setInt(1, order.getOrderNo());
			psmt.setString(2, order.getOrderId());
			psmt.setInt(3, order.getOrderProduct());
			psmt.setInt(4, order.getOrderCount());
			psmt.executeUpdate();
			closeAll();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void selectOrder(String OderId) {
		
		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void selectOrders() {}
	
	public void updateOrder() {}
	
	public void deleteOrder() {}

}
