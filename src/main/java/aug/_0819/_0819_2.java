package aug._0819;

public class _0819_2 {
    public int solution(int left, int right) {
        int answer = 0;
        // 약수 구하기 : 해당 수의 1/2에 해당하는 수까지 다 나눠보기
        //만약 마지막으로 나누어떨어지는 수가 제곱근이라면 약수의 수는 홀수!
        // 마지막으로 나누어떨어지는 수가 제곱근이 아니라면 약수의 수는 짝수!
        for(int i = left; i <= right; i ++) {
            if(i == 1 || divisor(i).equals("odd")) answer -= i;
            else answer += i;
        }
        return answer;
    }

    // 약수 갯수 구하기
    public String divisor(int number) {
        //제곱근이 존재하는 경우 약수의 갯수는 홀수개
        for(int i = 2; i <= number/2; i++) {
            if(i * i == number) return "odd";
        }
        //아닌 경우는 짝수개!
        return "even";
    }

    public static void main(String[] args) {
        _0819_2 test = new _0819_2();
        System.out.println(test.solution(2,5));

    }
}
