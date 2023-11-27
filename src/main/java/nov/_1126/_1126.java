package nov._1126;

public class _1126 {
    public int solution(int n) {
        int answer = 0;
        if(n % 2 == 1){
            int m = ( n - 1 ) / 2;
            for(int i = 0; i <= m; i++) {
                answer += (2 * i + 1);
            }
        } else if (n % 2 == 0) {
            int m = n / 2;
            for(int i = 1; i <= m; i++) {
                answer += (2 * i) * (2 * i);
            }
        }
        return answer;
    }
}
