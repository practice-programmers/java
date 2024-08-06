package aug._0806;

public class _0806_2 {
    public long solution(long n) {
        if(Math.sqrt(n) % 1 == 0) {
            System.out.println("Math.sqrt(n) = " + Math.sqrt(n) / 1);
            System.out.println("Math.sqrt(n) = " + Math.sqrt(n) % 1);
            return (long) Math.pow(Math.sqrt(n) + 1, 2);
        } else {
            System.out.println("Math.sqrt(n) = " + Math.sqrt(n) / 1);
            System.out.println("Math.sqrt(n) = " + Math.sqrt(n) % 1);
            return -1;
        }
    }

    public static void main(String[] args) {
        _0806_2 test = new _0806_2();
        System.out.println(test.solution(121));
        System.out.println(test.solution(3));
    }
}
