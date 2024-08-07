package aug._0807;

public class _0807_2 {
    public boolean solution(int x) {
        int sum = 0;
        int temp = x;
        while(temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        return x % sum == 0;
    }

    public static void main(String[] args) {
        _0807_2 test = new _0807_2();
        System.out.println(test.solution(11));
    }
}
