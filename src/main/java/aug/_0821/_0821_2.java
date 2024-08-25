package aug._0821;

import java.util.Arrays;

public class _0821_2 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[1].length];
        for(int i = 0; i < arr1.length; i++) {
            for(int j = 0; j < arr1[1].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        _0821_2 test = new _0821_2();
        int[][] arr1 = {{1},{2}};
        int[][] arr2 = {{3},{4}};
        System.out.println(Arrays.toString(test.solution(arr1, arr2)));
    }
}
