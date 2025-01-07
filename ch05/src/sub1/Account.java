package sub1;

// Account 클래스 정의(설계)
public class Account {
	
	// 속성(필드)
	String bank;
	String id;
	String name;
	int balance;
	
	// 기능
	public void deposit(int money) {
		this.balance += money;
	}
	
	public void withdraw(int money) {
		this.balance -= money;
	}
	public void show() {
		System.out.println("-------------");
		System.out.println("은행명: " + this.bank);
		System.out.println("은행명: " + this.id);
		System.out.println("은행명: " + this.name);
		System.out.println("은행명: " + this.balance);
		System.out.println("-------------");
	}

}
