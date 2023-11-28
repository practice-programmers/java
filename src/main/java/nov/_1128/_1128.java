package nov._1128;

public class _1128 {
    public int solution(int[] num_list) {
        String odd = "";
        String even = "";
        for(int i = 0; i < num_list.length; i++) {
            if(num_list[i] % 2 == 1) odd += num_list[i];
            else even += num_list[i];
        }
        return Integer.parseInt(odd) + Integer.parseInt(even);
    }

    public static void main(String[] args) {
        _1128 test = new _1128();
        System.out.println(test.solution(new int[]{3,4,5,2,1}));
    }
}
