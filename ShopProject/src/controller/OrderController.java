package controller;

import java.util.Scanner;

import entity.Customer;
import entity.Order;

public class OrderController {
	public void manage (Scanner sc, Customer loginedCustomer) {
		
		while(true) {
			System.out.println("------- 회원관리 -------");
			System.out.println("0:메인, 1:주문하기, 2:주문목록, 3:나의주문");
			System.out.println("선택: ");
			
			int choice = sc.nextInt();
			
			switch(choice) {
			case 0:
				// 메인 이동
				return; // 메서드 종료
			case 1:
				// 주문하기
				if(loginedCustomer != null) { //로그인 했을 경우
					
					Order inputOrder = inputOrder(sc, loginedCustomer);
					System.out.println(inputOrder);
				}else {
					System.out.println("주문을 하시려면 먼저 로그인을 하십시오.");
				}
				break;
			case 2:
				// 주문목록
				break;
			case 3:
				// 나의주문
				break;
			default:
				break;
			} // switch end
		} // while end
	} // manage end	

	
	public Order inputOrder(Scanner sc, Customer loginedCustomer) {
		//sc.nextLine(); -> nextInt라서 필요없음
		
		String orderId = loginedCustomer.getCustId();
		
		System.out.println("상품번호: ");
		int orderProduct = sc.nextInt();
		
		System.out.println("주문수량: ");
		int orderCount = sc.nextInt();
		
		return new Order(orderId, orderProduct, orderCount);
	}
}
