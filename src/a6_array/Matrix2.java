package a6_array;

import java.util.Arrays;

public class Matrix2 {
    public static void main(String[] args) {
        // 가변 길이 2차원 배열
        // 비정방 행렬 배열
        // 리터럴 방식으로 생성
        int[][] array1 = {{1,2},{3,4,5}};
        System.out.println(Arrays.deepToString(array1)); // [[1, 2], [3, 4, 5]]
        System.out.println();

        // new 키워드로 생성
        int[][] array2 = new int[2][];
        // 첫 번째 배열에 2 를 넣은 순간, 4byte의 빈 공간만 생긴다.
        // 두 번째 길이는 가변이므로 비워둔다.
        // 두 번째 길이가 적히는 순간 정방형 배열이 된다.
//      array2[0][0] = 1; // 에러. 자식 배열이 아직 생성되지 않았기 때문에.
        array2[0] = new int[2];
        array2[1] = new int[3];
        array2[0][0] = 1;
        array2[0][1] = 2;
        array2[1][0] = 3;
        array2[1][1] = 4;
        array2[1][2] = 5;
        System.out.println(Arrays.deepToString(array2)); // [[1, 2], [3, 4, 5]]
    }
}
