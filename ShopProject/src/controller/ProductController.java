package controller;

import java.io.InputStream;
import java.util.List;
import java.util.Scanner;

import entity.Product;
import service.ProductService;

public class ProductController {
	
	// 서비스 객체
	private ProductService service = ProductService.getInstance();
	
	public void manage (Scanner sc) {
		
		//Product inputProduct = null;
		
		while(true) {
			System.out.println("------- 상품관리 -------");
			System.out.println("0:메인, 1:상품등록, 2:상품목록, 3:상품검색");
			System.out.println("선택: ");
			
			int choice = sc.nextInt();
			
			switch(choice) {
			case 0:
				// 메인 이동
				return; // 메서드 종료
			case 1:
				// 상품등록
				Product inputProduct = inputProduct(sc);
				service.registerProduct(inputProduct);
				
				System.out.println("상품 등록 완료!");
				break;
			case 2:
				// 상품목록
				List<Product> products = service.listProduct();
				
				for(Product product : products) {
					System.out.println(product);
				}
				break;
			case 3:
				// 상품검색
				break;
			default:
				break;
			} // switch end
		} // while end
	} // manage end	

	public Product inputProduct(Scanner sc) {
		
		sc.nextLine();
		
		System.out.println("상품명: ");
		String prodName = sc.nextLine();
		
		System.out.println("재고량: ");
		int stock = sc.nextInt();
		
		System.out.println("가격: ");
		int price = sc.nextInt();
		
		sc.nextLine();
		System.out.println("제조사: ");
		String company = sc.nextLine();
		
		return new Product(prodName, stock, price, company);
	}

}
