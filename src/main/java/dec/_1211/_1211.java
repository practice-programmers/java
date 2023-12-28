package dec._1211;

public class _1211  {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        for(int i : index_list) {
            answer += my_string.charAt(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        _1211 s = new _1211();
        String my_string = "abcde";
        int[] index_list = {1,0,2};
        System.out.println(s.solution(my_string, index_list));
    }
}
