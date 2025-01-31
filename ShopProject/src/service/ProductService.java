package service;

import java.util.List;

import dao.ProductDAO;
import entity.Product;

public class ProductService {
	
	// 싱글톤
	private static final ProductService INSTANCE = new ProductService();
	public static ProductService getInstance() {
		return INSTANCE;
	}
	private ProductService() {}
	
	// DAO 객체
	private ProductDAO dao = ProductDAO.getInstance();
	
	// 상품등록
	public void registerProduct(Product product) {
		dao.insertProduct(product);
	}
	
	// 상품확인
	public List<Product> listProduct() {
		return dao.selectProducts();
	}
	
	// 상품삭제
	public void deleteProduct(int prodNo) {
		dao.deleteProduct(prodNo);
	}
	
	// 상품수정
	public void modifyProduct(Product product) {
		dao.updateProduct(product);
	}

}
