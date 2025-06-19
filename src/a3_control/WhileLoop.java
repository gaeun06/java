package a3_control;

public class WhileLoop {
    public static void main(String[] args) {
        // while 반복문
        // 증감식이 실행코드의 일부이기 때문에 잘못 작성하거나 잊고 작성하지 않는 경우가 많음. 주의 !!!
        // for 문에 비해 구조가 안정적이지 못해 많이 사용하지 않음.
        // 초기식
        // while (조건식) {
        //     실행코드
        //     증감식
        // }
        int i = 0; // 초기식
        while (i<10) { // 조건식
            System.out.println(i);
            i++; // 증감식
        }
        System.out.println("반복끝");
        System.out.println();

        // do~while 반복문
        int j = 0; // 초기식
        do {
            System.out.print(j);
            j++; // 증갑식
        }while (j<10); // 조건식
        System.out.println("반복끝");

        // 알아두면 좋아요~
        // while문과 d0~while문의 차이점
        // 조건식이 처음부터 false인 경우, while문은 실행 코드가 실행되지 않으나,
        // do~while은 1회 실행됨. 실행 코드가 조건식보다 위에 있기 때문.
        int a = 0;
        while (a > 1) {
            System.out.println("실행 안 됨");
            a++;
        }
        do {
            System.out.println("실행됨");
            a++;
        }while (a > 1);
    }
}
