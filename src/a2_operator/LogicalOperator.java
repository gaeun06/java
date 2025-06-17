package a2_operator;

public class LogicalOperator {
    public static void main(String[] args) {
        // 논리 연산자 (&&, ||, ^, !)
        // 발음은 순서대로 앰퍼샌드, 파이프, 캐럿, 니게이션
        // ampersand, pipe, caret, negation(=not)

        // AND 논리 연산자
        System.out.println(true && true); // true
        System.out.println(true && false); // false
        System.out.println(false && true); // false
        System.out.println(false && false); // false
        System.out.println(true && (5<3)); // false
        System.out.println((5<=5) && (7>2)); // true
        System.out.println();

        // OR 논리 연산자
        System.out.println(true || true); // true
        System.out.println(true || false); // true
        System.out.println(false || true); // true
        System.out.println(false || false); // false
        System.out.println(false ||(5<3)); // false
        System.out.println((5<=5) || (7>2)); // true
        System.out.println();

        // NOT 논리 연산자
        System.out.println(!true); // false
        System.out.println(!false); // true
        System.out.println();

        // NOR (exclusive OR 베타적논리합)
        // 두 개의 값이 다르면 true(=1), 같으면 false(=0)
        System.out.println(true ^ true); // false
        System.out.println(true ^ false); // true
        System.out.println(false ^ true); // true
        System.out.println(false ^ false); // false

        // 실제에시 1) NOT 연산자의 사용법
        // 보통 토글 장치를 구현할 때 사용함
        boolean capsButton = false;
        capsButton = !capsButton;
//        if (capsButton == true) {
//            capsButton = false;
//        }else  {
//            capsButton = true;
//        }

        // 실제예시 2) XOR 연산자의 사용법
        // 기본적인 암호화, 복호화 구현에 사용 됨
        // 보내려는 문자와 키를 2진수로 변환
        // 보내려는 문자는 'A'. 키는 숫자 7
        // 01000001 = 'A'
        // 00000111 = 7
        // ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
        // 01000110 = 암호화된 데이터
        // 00000111 = 키
        // ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
        // 01000001 = 'A' 복호화 성공

        // 중요 !!
        // 쇼트 서킷 (Short Circuit)
        // AND와 OR 논리 연산자에 사용됨
        // AND의 경우,
        // 첫번째 조건이 false면 두번째 조건은 실행하지 X => 결과는 무조건 false
        // OR의 경우,
        // 첫번째 조건이 true면 두번째 조건은 실행 X => 결과는 무조건 true
        int value1 = 3;
        System.out.println(false && ++value1 > 6);
        // 두번째 조건 ++value > 6를 계산할 필요 없음. 결과는 무조건 false
    }
}
