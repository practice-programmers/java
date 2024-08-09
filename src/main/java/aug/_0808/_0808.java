package aug._0808;

public class _0808 {
    public long solution(int a, int b) {
        long answer = 0;
        int first = 0;
        int last = 0;
        if(a >= b) {
            first = b;
            last = a;
        }
        else {first = a;
            last = b;}
        for(int i = first; i <= last; i++) {
            answer += i;
        }
        return answer;
    }
}
