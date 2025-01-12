package test3;

/*
 * 날짜: 2025/01/01
 * 이름: 김효경
 * 내용: 다형성 연습문제
 */
interface Buyer {
	public void buy();
}

interface Seller {
	public void sell();
}

class Customers implements Buyer, Seller {
	
	@Override
	public void sell() {
		System.out.println("판매하기");
	}
	
	@Override
	public void buy() {
		System.out.println("구매하기");
	}
}

public class Test10 {
	public static void main(String[] args) {
		Buyer buyer = new Customers();
		Seller seller = new Customers();
		
		buyer.buy();
		seller.sell();
	}

}
