package controller;

import java.util.List;
import java.util.Scanner;

import entity.Customer;
import service.CustomerService;

public class CustomerController {
	
	// 서비스 객체
	private CustomerService service = CustomerService.getInstance();
	
	public Customer manage (Scanner sc) {
		
		// 로그인 고객 객체
		Customer loginedCustomer = null;
		
		while(true) {
			System.out.println("------- 회원관리 -------");
			
			if(loginedCustomer == null) {
				System.out.println("0:메인, 1:회원가입, 2:로그인, 3:회원목록, 4:회원수정, 5:회원탈퇴");
			}else {
				System.out.println("0:메인, 1:회원가입, 2:로그아웃, 3:회원목록, 4:회원수정, 5:회원탈퇴");
			}
			System.out.println("선택: ");
			
			int choice = sc.nextInt();
			
			switch(choice) {
			case 0:
				// 메인 이동
				return loginedCustomer;
			case 1:
				
				if(loginedCustomer == null) {
					// 회원가입
					Customer inputCustomer = inputCustomer(sc);
					service.registerCustomer(inputCustomer);
					
					System.out.println("회원가입이 완료되었습니다.");
				}else {
					// 나의 정보
					System.out.println(loginedCustomer);
				}
				break;
			case 2:
				if(loginedCustomer == null) {
					// 로그인
					String inputCustId = inputCustId(sc);
					loginedCustomer = service.loginCustomer(inputCustId);
					
					if(loginedCustomer != null) {
						System.out.println(loginedCustomer.getName() + "님 로그인 했습니다.");
					}else {
						System.out.println("로그인 실패했습니다.");
					}
				}else {
					// 로그아웃
					System.out.println(loginedCustomer.getName() + "님 로그아웃 했습니다.");
					loginedCustomer = null;
				}
				
				break;
			case 3:
				// 회원목록
				List<Customer> customers = service.listCustomer();
				
				for(Customer customer : customers) {
					System.out.println(customer);
				}
				break;
			case 4:
				String inputCustId = inputCustId(sc);
				loginedCustomer = service.modifyCustomer(inputCustId);
				break;
			case 5:
			    String outputCustId = outputCustId(sc);
			    Customer removedCustomer = service.removeCustomer(outputCustId);

			    if (removedCustomer != null) {
			    	//System.out.println(outputCustId);
				    //System.out.println(removedCustomer.getCustId());
			        System.out.println(removedCustomer.getName() + "님 회원탈퇴 했습니다.");
			        
			        // 로그인된 회원과 탈퇴한 회원이 같으면 자동 로그아웃
			        if (loginedCustomer.getCustId().equals(outputCustId)) {
			        	loginedCustomer = null;
			        }
			    } else {
			        System.out.println("회원탈퇴 실패했습니다. 아이디를 확인해주세요.");
			    }
			    break;
			default:
				break;
			} // switch end
		} // while end
	} // manage end
	
	public Customer inputCustomer(Scanner sc) {
		
		sc.nextLine(); // 버퍼 비우기
		
		System.out.println("아이디: ");
		String custId = sc.nextLine();
		
		System.out.println("이름: ");
		String name = sc.nextLine();
		
		System.out.println("휴대폰: ");
		String hp = sc.nextLine();
		
		System.out.println("주소: ");
		String addr = sc.nextLine();
		
		return new Customer(custId, name, hp, addr);
	}
	
	public String inputCustId(Scanner sc) {
		sc.nextLine(); // 버퍼 비우기
		
		System.out.println("아이디: ");
		String custId = sc.nextLine();
		
		return custId;
	}
	
	public String outputCustId(Scanner sc) {
		sc.nextLine();
		
		System.out.println("탈퇴할 아이디: ");
		String custId = sc.nextLine();
		
		return custId;
	}

}
