package nov._1110;

public class _1110 {
    public int solution(int number, int n, int m) {
        int answer = 0;
        if(number >= 10 && number <= 100 && n >= 2 && m < 10) {
            if(number % n == 0 && number % m == 0) return 1;
            else return 0;
        }
        else return answer;
    }

}
