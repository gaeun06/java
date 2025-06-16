package a2_operator;

public class ArithmeticOperator {
    public static void main(String[] args) {
        // 산술 연산자 (+, -, *, /, %)
        System.out.println(2+3); // 5
        System.out.println(8-5); // 3
        System.out.println(7*2); // 14
        System.out.println(7/2); // 3
        System.out.println(8%5); // 3 나머지를 의미
        System.out.println(); // 한 줄 띄어쓰기의 용도

        // 증감 연산자 (++ , --)
        int value1 =3;
        System.out.println(value1); // 3
        // value1 = value1 + 1;
        value1++;
        System.out.println(value1); // 4

        int value2 = 3;
        ++value2;
        System.out.println(value2); // 4

        int value3 = 3;
        int value4 = value3++; // 계산 진행 순서가 아래와 같음
        // ++의 의미는 value3 = value3 + 1 이므로
        // int value4 = value3;
        // value3 = value3 + 1
        System.out.println(value3); // 4
        System.out.println(value4); // 3

        int value5 = 3;
        int value6 = ++value5; // 계산 진행 순서가 아래와 같음
        // value5 = value + 1;
        // value6 = value5;
        System.out.println(value5); // 4
        System.out.println(value6); // 4

        // 절대 이런 짓 하지 말자!!!
        int value7 = 3;
        int value8 = 4;
        int value9 = 2 + value7-- + ++value8; // 2 + 3 + 5
        // 풀어쓰면,
        // value8 = value8 + 1
        // int value9 = 2 + value7 + value8
        // value7 = value7 - 1;
        System.out.println(value7); // 2
        System.out.println(value8); // 5
        System.out.println(value9); // 10
    }
}
