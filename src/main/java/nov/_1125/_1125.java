package nov._1125;

public class _1125 {
    public int solution(int a, int b) {
        int ab = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        int ba = Integer.parseInt(Integer.toString(b) + Integer.toString(a));
        if(ab >= ba) return ab;
        else return ba;
    }
}
