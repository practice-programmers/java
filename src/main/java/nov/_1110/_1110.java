package nov._1110;

public class _1110 {
    public static int solution(int number, int n, int m) throws Exception {
        int answer = 0;
        // 메서드 기능 분리
        validation(number, n, m);

        if(number % n == 0 && number % m == 0) answer = 1;

        return answer;

    }

    private static void validation(int number, int n, int m) throws Exception {
        if(number >= 10 && number <= 100 && n >= 2 && m < 10) {
            throw new Exception("");
        }
    }

    public static void main(String[] args) throws Exception {
        int result = solution(100, 5, 3);
        System.out.println(result);
    }
}
