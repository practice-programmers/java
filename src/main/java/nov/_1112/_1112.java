package nov._1112;

public class _1112 {
    public int solution(int a, int b, boolean flag) {
//        if(flag && a >= -1000 && a <=1000 && b >= -1000 && b <= 1000) {
//            answer = a + b;
//            return answer;
//        } else if (!flag && a >= -1000 && a <=1000 && b >= -1000 && b <= 1000) {
//            answer = a -b;
//            return answer;
//        }
        if(flag) {
            return a + b;
        }
        return a - b;
    }

    public static void main(String[] args) {
        _1112 test = new _1112();
        System.out.println(test.solution(1,3,true));

    }

}
