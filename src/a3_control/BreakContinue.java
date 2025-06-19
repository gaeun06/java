package a3_control;

public class BreakContinue {
    public static void main(String[] args) {
        // 제어 키워드
        // break
        // switch, for, while, do~while 중괄호{} 를 탈출하는 용도로 사용함. (if문은 제외)
        // 중요!! 가장 가까운 중괄호 한 개만 탈출 가능


        // 기본형
        for (int i=0; i<10; i++) {
            if (i==5) {
                break; // break를 if문의 윗줄에 넣으면 5까지 출력
            }
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();

        // 이중 for문 (double loop)
        for (int i=0; i<5; i++) { // i 3번 진행 예정
            for (int j=0; j<5; j++) { // 2번
                if (j == 4) {
                    break;
                }
                System.out.println("i=" + i + ", j=" + j); // i=?, j=?
            }
        }
        System.out.println();

        // (tip!) 이중 for문 한 번에 탈출하는 코드
        for (int i=0; i<3; i++) {
            for (int j=0; j<5; j++) {
                if (j == 2) {
                    i = 9999999; // 바깥 loop의 조건을 강제로 false로 바꿈! (명시적으로 거대한 수를 입력)
                    break;
                }
                System.out.println("i=" + i + ", j=" + j); // i=?, j=?
            }
        }

        // continue
        // 반복문 안에서 현재 반복을 건너뛰고 다음 반복으로 넘어가도록 함
        // 핵심은 continue가 선언된 위치 아래쪽 코드를 실행하지 않는 것!!
        for (int i=0; i<10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.print(i + " "); // 0 1 2 3 4 6 7 8 9
        }
        System.out.println();
    }
}
