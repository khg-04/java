package dao;

import java.util.ArrayList;
import java.util.List;

import db.DBHelper;
import db.SQL;
import entity.Product;

public class ProductDAO extends DBHelper{
	
	// 싱글톤
	private static final ProductDAO INSTANCE = new ProductDAO();
	public static ProductDAO getInstance() {
		return INSTANCE;
	}
	private ProductDAO() {}
	
	// 기본 CRUD
	public void insertProduct(Product Product) {
		
		try {
			
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.INSERT_PRODUCT);
			psmt.setInt(1, Product.getProdNo());
			psmt.setString(2, Product.getProdName());
			psmt.setInt(3, Product.getStock());
			psmt.setInt(4, Product.getPrice());
			psmt.setString(5, Product.getCompany());
			psmt.executeUpdate();
			closeAll();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Product selectProduct(String prodName) {
		
		Product product = null;
		
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.SELECT_PRODUCT);
			psmt.setString(1, prodName);
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				product = new Product();
				product.setProdNo(rs.getInt(1));
				product.setProdName(rs.getString(2));
				product.setStock(rs.getInt(3));
				product.setPrice(rs.getInt(4));
				product.setCompany(rs.getString(5));
			}
			closeAll();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return product;
	}
	
	public List<Product> selectProducts() {
		
		List<Product> products = new ArrayList<Product>();
		
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(SQL.SELECT_PRODUCT_LIST);
			
			while(rs.next()) {
				Product product = new Product();
				product.setProdNo(rs.getInt(1));
				product.setProdName(rs.getString(2));
				product.setStock(rs.getInt(3));
				product.setPrice(rs.getInt(4));
				product.setCompany(rs.getString(5));
				products.add(product);
			}
			closeAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return products;
	}
	
	public void updateProduct(Product product) {}
	
	public void deleteProduct(String prodName) {}

}
