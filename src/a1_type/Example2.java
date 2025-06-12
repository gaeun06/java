package a1_type;

public class Example2 {
    public static void main(String[] args) {
        // 정수형 변수 생성 연습
        byte a = 1;
        short b = 128;
        int c = 1000;
        long d = 100000; // 뒤에 l 또는 L 을 명시적으로 붙이기도 한다.
        // 실수형
        // 실수형의 기본형은 double 이므로 f 또는 F 를 뒤에 붙여야 한다.
        float e = 3.5f;
        double f = 3.144372894732;  // 뒤에 d 또는 D 를 명시적으로 붙이기도 한다.
        // 문자형
        char g = 'A';
        String h = "안녕하세요"; // 참조자료형 (char를 여려개 모아놓은 형태)
        // 불리언형
        boolean i = false;

        // 진법에 따른 표기법 연습 (10진법, 2진법, 16진법)
        System.out.println(c); // 1000
        c = 15; // 10진법
        System.out.println(c); // 15
        c = 0b1111; // 2진법
        System.out.println(c); // 15
        c = 0xF; // 16진법
        System.out.println(c); // 15
    }
}
