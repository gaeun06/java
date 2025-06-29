package practice;

// [ Q1 ]
//정수 start와 end를 매개변수로 받아, start부터 end까지의 숫자 중
//짝수 == "Even" / 홀수 == "Odd"
//3의 배수 == "Three" / 5의 배수 == "Five"
//라는 규칙을 적용해 출력하는 printNumbers(int start, int end) 메서드 작성해보기.

// [ Q2 ]
// 정수 하나를 매개변수로 받아 등급을 출력하는 메서드 printGrade(int score) 작성
// 추가 조건 : main 메서드에서 5개의 점수를 배열에 담아 반복문으로 printGrade()를 호출할 것.
// 90점 이상: Grade A
// 80점 이상 90점 미만: Grade B
// 70점 이상 80점 미만: Grade C
// 60점 이상 70점 미만: Grade D
// 그 외: Grade F

// [ Q3 ]
// 정수 배열이 주어졌을 때, 짝수만 출력하는 프로그램 작성
// 배열은 {3, 6, 1, 8, 2, 9, 4}로 고정
// for 문을 사용해서 각 요소를 확인
// 짝수일 경우만 출력

public class Practice1 {
    public static void main(String[] args) {
        int start = 1;
        int end = 10;
        printNumbers(start, end);

        int[] score = {100, 87, 15, 60, 74};
        for (int i=0; i<score.length; i++) {
            // 증감식 실행 이후 조건식이 실행되므로
            // 비교 연산자를 <= 가 아닌, < 로 입력해야함.
            // (배열에 저장된 값은 한정되어 있기 때문에)
            printGrade(score[i]);
        }

        int[] num = {3, 6, 1, 8, 2, 9, 4};
        for (int j=0; j<num.length; j++) {
            printEven(num[j]);
        }
    }

    public static void printNumbers(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (i % 3 == 0) { // if-else-if도 위의 조건문이 true일 경우 아래 조건문을 실행하지 않음
                System.out.println("Three");
                // 만약 6의 값이 나왔을 때 짝수 구별 조건문이 위에 있으면
                // 3의 배수 조건문은 실행되지 않으므로, 배수를 구별하는 조건문이 먼저 실행되어야 함.
            }
            else if (i % 5 == 0) {
                System.out.println("Five");
            }
            else if (i % 2 == 0) {
                System.out.println("Even");
            }
            else {
                System.out.println("Odd");
            }
        }
        System.out.println();
    }

    public static void printGrade(int i) {
        if (i>=90) {
            System.out.println("Grade A");
        } else if (i>=80 && i<90) {
            System.out.println("Grade B");
        } else if (i>=70 && i<80) {
            System.out.println("Grade C");
        } else if (i>=60 && i<70) {
            System.out.println("Grade D");
        } else {
            System.out.println("Grade F");
        }
    }

    public static void printEven(int j) {
        if (j%2==0) {
            System.out.print(j + " ");
        }
    }
}
