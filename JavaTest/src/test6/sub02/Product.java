package test6.sub02;

public class Product {
	private String productId;
	private String productName;
	private int price;
	private int quantity;
	
	public Product(String productId, String productName, int price, int quantity) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}
	
	public void updatePrice(int newPrice) {
		this.price = newPrice;
	}
	
	public void addStock(int newStock) {
		this.quantity += newStock;
	}
	
	public void printProductInfo() {
		System.out.println("상품 ID: " + productId);
		System.out.println("상품이름: " + productName);
		System.out.println("상품가격: " + price);
		System.out.println("재고수량: " + quantity);
	}

}
