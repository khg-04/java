package step2;

import java.util.Scanner;

public class Test07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        
        sc.close();
        
        if (x == y && y == z) {  // 세 수가 모두 같으면
            System.out.println(10000 + x * 1000);
        } else if (x == y || y == z || z == x) {  // 두 수가 같으면
            if (x == y || x == z) {
                System.out.println(1000 + x * 100);
            } else {
                System.out.println(1000 + y * 100);
            }
        } else {  // 세 수가 모두 다르면
            System.out.println(Math.max(Math.max(x, y), z) * 100);
        }
    }
}
