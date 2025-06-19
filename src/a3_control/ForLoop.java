package a3_control;
// import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) throws InterruptedException {
        // 반복 제어문
        // For
        // 기본 형태
        //  for (초기식; 조건식; 증감식)   {
        //     실행구문
        // }
        for (int i=0; i<10; i++) {
            System.out.print(i);
        }
        System.out.println("반복 끝");
        for (int i=10; i>0; i--) {
            System.out.print(i);
        }
        System.out.println("반복 끝");

        // 컴파일 에러가 발생하지는 않지만 무한 루프 상황이 발생하므로 사용 X
        // 무한 루프를 설계해도 적절한 Sleep과 리소스 관리를 동반하면 문제 없음
//        for ( ; ; ) {
//            System.out.println("무한루프");
//        }

        // 안전한 무한루프
//        Scanner scanner = new Scanner(System.in);
//        for ( ; ; ) {
//            System.out.println("유저 입력 대기중 :");
//            String userInput = scanner.nextLine();
//            System.out.println(userInput);
//            if (userInput.equals("exit")) {
//                break;
//            }
//            Thread.sleep(1000);
//        }
//        System.out.println("무한루프 탈출~");

        // 증감식의 변화 (2씩 증가)
        for (int i=0; i<10; i=i+2) {
            System.out.println(i); // 0 2 4 6 8
        }
        System.out.println("반복끝");

        // iterator(=반복자) 여러개인 경우
        for (int i=0, j=0; i<10 && j<10; i++, j++) {
            System.out.println(i + " " + j);
        }
        System.out.println("반복끝");

        // for문 밖에서 iterator를 참조 해야만 한다면 아래처럼~
        int i;
        for (i=0; i<10; i++) {
            // 실행코드
        }
        System.out.println("iterator의 최종 값은?");
        System.out.println(i);
    }
}
