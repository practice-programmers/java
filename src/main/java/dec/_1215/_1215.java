package dec._1215;

public class _1215 {
    public int solution(int a, int b) {
        int sumAb = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        int ab = 2 * a * b;
        if (sumAb >= ab) {
            return sumAb;
        } else {
            return ab;
        }
    }
}
