package a6_array;

import java.util.Arrays;

public class Matrix1 {
    public static void main(String[] args) {
        // 2차원 행렬 배열. (매트릭스, 2D Array)
        // 2차원 배열의 선언
        int[][] array = new int[3][4];

        // 2차원 배열의 값 대입
        int[][] array3 = new int[2][3]; // 2*3=6 , 6개의 data가 있는 배열
        array3[0][0] = 1;
        array3[0][1] = 2;
        array3[0][2] = 3;
        array3[1][0] = 4;
        array3[1][1] = 5;
        array3[1][2] = 6;
        
        // 리터럴 방식으로 생성 (new를 사용하지 않고 생성)
        int[][] array4 = {{1,2,3},{4,5,6}};
        String[][] array5 ={{"black","white"},{"red","blue"}};
        System.out.println();

        // 2차원 배열의 출력 (deepToString)
        System.out.println(Arrays.deepToString(array3)); // [[1, 2, 3], [4, 5, 6]]
        System.out.println(Arrays.toString(array3)); // [[I@119d7047, [I@776ec8df]
        System.out.println(Arrays.deepToString(array5)); // [[black, white], [red, blue]]
        System.out.println();

        System.out.println(array3.length); // 2
        System.out.println(array3[0].length); // 3
        System.out.println(array3[1].length); // 3
        System.out.println();

        for (int i=0; i<array3.length; i++) { // array3.length 은 0,1 을 의미한다.
            for (int j=0; j<array3[i].length; j++) {
                // array3[?].length 의 괄호 안에는 0과 1 모두 들어갈 수 있으므로 i를 대입한다.
                System.out.print(array3[i][j]); // 123456
            }
        }
        System.out.println();
        System.out.println();
        
        for (int i=0; i<2; i++) { // i는 2번 반복 예정 : 0,1  - 31라인 참고
            for (int j=0; j<3; j++) { // j는 3번 반복 예정 : 0,1,2 - 32,33 라인 참고
                System.out.print(array3[i][j]); // 123456
            }
        }
    }
}
