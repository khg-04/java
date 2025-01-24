package bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/* 
 * 날짜: 2025/01/24
 * 이름: 김효경
 * 내용: Java 정기수행평가
 */

public class Appmain {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Account> account = new ArrayList<>();

    public static void main(String[] args) {
    	
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("---------------------------");
            System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
            System.out.println("---------------------------");
            System.out.print("선택> ");
            
            int selectNo = Integer.parseInt(scanner.nextLine());
			if(selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				isRunning = false;
			} 
		}
		System.out.println("프로그램 종료");
	}

    private static void createAccount() {
    	System.out.println("------- 계좌생성 -------");

        System.out.print("계좌번호: ");
        String ano = scanner.next();

        System.out.print("계좌주: ");
        String owner = scanner.next();

        int balance = 0;
        boolean validBalance = false;
        System.out.print("초기입금액: ");
        while (!validBalance) {
            String balanceInput = scanner.nextLine();
            try {
                balance = Integer.parseInt(balanceInput);
                validBalance = true;
            } catch (NumberFormatException e) {}
        }

        Account newAccount = new Account(ano, owner, balance);
        account.add(newAccount);
        System.out.println("결과: 계좌가 생성되었습니다.");
    }

    private static void accountList() {
        System.out.println("------- 계좌목록 -------");

        for (Account acc : account) {
            System.out.print(acc.getAno() + " ");
            System.out.print(acc.getOwner() + " ");
            System.out.println(acc.getBalance());
        }
    }

    private static void deposit() {
    	System.out.println("------- 예금하기 -------");

        System.out.print("계좌번호: ");
        String ano = scanner.next();
        System.out.print("예금액: ");
        int money = 0;
        boolean validAmount = false;

        while (!validAmount) {
            try {
                money = Integer.parseInt(scanner.nextLine());  
                validAmount = true;  
            } catch (NumberFormatException e) {}
        }

        Account account = findAccount(ano);
        if (account == null) {
            System.out.println("해당 계좌가 존재하지 않습니다.");
            return;
        }

        account.setBalance(account.getBalance() + money);
        System.out.println("결과: " + money + "원이 예금되었습니다.");
    }

    private static void withdraw() {
    	System.out.println("------- 출금목록 -------");

        System.out.print("계좌번호: ");
        String ano = scanner.next();
        System.out.print("출금액: ");
        int money = 0;
        boolean validAmount = false;

        while (!validAmount) {
            try {
                money = Integer.parseInt(scanner.nextLine());  
                validAmount = true;  
            } catch (NumberFormatException e) {}
        }


        Account account = findAccount(ano);
        if (account == null) {
            System.out.println("해당 계좌가 존재하지 않습니다.");
            return;
        }

        if (account.getBalance() < money) {
            System.out.println("잔액이 부족합니다.");
            return;
        }

        account.setBalance(account.getBalance() - money);
        System.out.println("결과: " + money + "원이 출금되었습니다.");
    }

    private static Account findAccount(String ano) {
        for (Account acc : account) {
            if (acc.getAno().equals(ano)) {
                return acc;
            }
        }
        return null;
    }
} //main