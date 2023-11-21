package nov._1120;

public class _1120 {
    public String solution(int n) {
        nValidation(n);
        return String.valueOf(n);
    }

    private void nValidation(int n) {
        if(n < 1 || n > 10000) throw new IllegalArgumentException("n은 1 이상 10000이하의 정수입니다.");
    }

    public static void main(String[] args) {
        _1120 test = new _1120();
        System.out.println(test.solution(10));
    }
}
