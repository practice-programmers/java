package aug._0805;

public class _0805_2 {
    public int[] solution(long n) {
        int[] answer = {};
        String[] arrNum = String.valueOf(n).split("");
        answer = new int[arrNum.length];
        for(int i = 0; i < arrNum.length; i++) {
            answer[i] = (int)(n % 10);
            n /= 10;
        }
        return answer;
    }
}
