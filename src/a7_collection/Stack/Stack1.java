package a7_collection.Stack;

import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        /* 스택 Stack
        - 후입선출 LIFO (Last In First Out)
        - 카드의 덱(deck)이 가장 마지막 위에 놓여진 카드가
        먼저 선택되는 것과 같은 방식으로 실행되는 자료 구조이다.
        - 브라우저의 히스토리 저자장 또는 재귀함수 처리에 사용된다.
         */

        Stack<Integer> stack = new Stack<>();
        // #1. push : 입력
        System.out.println("ㅡㅡㅡㅡ #1 ㅡㅡㅡㅡ");
        stack.push(2);
        stack.push(5);
        stack.push(3);
        stack.push(7);
        System.out.println(stack);
        System.out.println();

        // #2. peek : 읽기
        System.out.println("ㅡㅡㅡㅡ #2 ㅡㅡㅡㅡ");
        System.out.println(stack.peek()); // 7
        // ㄴ> 마지막에 들어간 값이 가장 먼저 출력된다.
        System.out.println();

        // #3. search : 탐색 및 확인 (대기 번호 확인)
        // -> 몇 번째에 호출 될 지 확인한다.
        System.out.println("ㅡㅡㅡㅡ #3 ㅡㅡㅡㅡ");
        System.out.println(stack.search(7)); // 1
        System.out.println(stack.search(3)); // 2
        System.out.println(stack.search(5)); // 3
        System.out.println(stack.search(2)); // 4
        System.out.println(stack.search(9)); // -1 (없는 경우)
        System.out.println();

        // #4. pop : 꺼내고 삭제
        // -> 큐의 poll 과 비슷한 개념이다.
        System.out.println("ㅡㅡㅡㅡ #4 ㅡㅡㅡㅡ");
        System.out.println(stack.pop()); // 7
        System.out.println(stack.pop()); // 3
        System.out.println(stack.pop()); // 5
        System.out.println(stack.pop()); // 2
        System.out.println(stack.size()); // 0
    }
}
