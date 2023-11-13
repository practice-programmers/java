package nov._1111;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1111 {
        public int solution(double flo) {
            int answer = 0;
            answer = (int)flo;
            return answer;
        }

    public static void main(String[] args) throws IOException{
            _1111 test = new _1111();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String flo = br.readLine();
            double answer = Double.parseDouble(flo);
            System.out.println(test.solution(answer));

    }
}
