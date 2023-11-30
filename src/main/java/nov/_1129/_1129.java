package nov._1129;

public class _1129 {
    public int solution(int[] num_list) {
        int multiple = 1;
        int sum = 0;
        for(int i = 0; i < num_list.length; i++) {
            multiple *= num_list[i];
            sum += num_list[i];
        }
        if( multiple <  sum * sum ) return 1;
        else if (multiple > sum * sum) {
            return 0;
        }
        return -1;
    }
}
