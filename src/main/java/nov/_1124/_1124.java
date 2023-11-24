package nov._1124;

import java.util.Scanner;

public class _1124 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        lengthValidation(a,b);
        System.out.println(a+b);
    }

    private static void lengthValidation(String a, String b) {
        if(a.isEmpty() || b.isEmpty() || a.length() > 10 || b.length() >10) {
            throw new IllegalArgumentException("입력하는 글자는 1 이상 10 이하의 글자입니다.");
        }
    }
}
