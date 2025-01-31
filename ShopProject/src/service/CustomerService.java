package service;

import java.util.List;

import dao.CustomerDAO;
import db.SQL;
import entity.Customer;

public class CustomerService {
	
	// 싱글톤
	private static final CustomerService INSTANCE = new CustomerService();
	public static CustomerService getInstance() {
		return INSTANCE;
	}
	private CustomerService() {}
	
	// DAO 객체
	private CustomerDAO dao = CustomerDAO.getInstance();
	
	// 회원가입
	public void registerCustomer(Customer customer) {
		dao.insertCustomer(customer);
	}
	
	// 로그인
	public Customer loginCustomer(String custId) {
		return dao.selectCustomer(custId);
		
	}
	
	// 회원탈퇴
	public Customer removeCustomer(String custId) {
	    Customer customer = dao.selectCustomer(custId); // 삭제 전 회원 조회

	    if (customer != null) {
	        dao.deleteCustomer(custId); // 삭제 실행
	    }

	    return customer; // 삭제된 회원 반환
	}
	// 회원수정
	public void modifyCustomer(Customer customer) {
		dao.updateCustomer(customer);
	}
	
	// 회원목록
	public List<Customer> listCustomer() {
		return dao.selectCustomers();
	}

}
