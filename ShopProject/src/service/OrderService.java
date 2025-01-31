package service;

import dao.OrderDAO;

public class OrderService {
	
	// 싱글톤
	private static final OrderService INSTANCE = new OrderService();
	public static OrderService getInstance() {
		return INSTANCE;
	}
	private OrderService() {}
	
	// DAO 객체
	private OrderDAO dao = OrderDAO.getInstance();

}
