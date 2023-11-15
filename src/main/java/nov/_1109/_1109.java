package nov._1109;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1109 {
    public int solution(int num, int n) throws IOException {
        validation(num, n);
        if (num % n == 0) return 0;
        else return 1;
    }

    private static void validation(int num, int n) {
        if (num >= 2 && num <= 100
                && n >= 2 && n <= 9) {
            throw new IllegalArgumentException();
        }
    }

    public static void main(String[] args) throws IOException {
        _1109 test = new _1109();
        int result = test.solution(100, 5);
        System.out.println(result);
    }
}
