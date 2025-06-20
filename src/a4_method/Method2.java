package a4_method;

public class Method2 {
    public static void main(String[] args) {
        // 리턴형이 있는 함수(=메서드)
        // 리턴형은 메서드가 실행 결과로 반환하는 값의 자료형이다.
        // (a + b) * c 를 수행하는 경우, + 를 수행하는 함수와 * 를 수행하는 함수로
        // 나누어 구현한다면, plus 함수와 multiply 함수가 필요
        int a = 3;
        int b = 5;
        int c = 10;
        int value = plus(a, b); // 함수의 계산 결과를 변수에 저장함, 리턴형 함수의 형태-int
        multiply(value, c); // 저장한 계산 결과를 다른 함수가 이용할 수 있음
    }

    public static int plus (int a, int b) { // 실행 코드가 아님. 코드의 선언 구호(메서드)
        int result = a + b; // 코드의 실행 구호는 여기 부터!
        return result;
    }
    public static void multiply(int x, int y) {
        int result = x * y;
        System.out.println(result);
    }
}
