package nov._1109;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1109 {
        public int solution() throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] answer = br.readLine().split(" ");

            int num = Integer.parseInt(answer[0]);
            int n = Integer.parseInt(answer[1]);

            if (num >= 2 && num <= 100 && n >= 2 && n <= 9) {
                if (num % n == 0) return 0;
                else return 1;
            }
            return 99;
        }
    public static void main(String[] args) throws IOException {
        _1109 test = new _1109();
        int result = test.solution();
        System.out.println(result);
    }
}
