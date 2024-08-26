package aug._0826;

import java.util.Scanner;

public class _0826 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i = 0; i < b; i++) {
            for(int j = 0; j < a; j++) {
                if(j == a -1) System.out.println("*");
                else System.out.print("*");
            }
        }
    }
}
