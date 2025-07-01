package a7_collection.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {
    public static void main(String[] args) {
        /* 큐 (인터페이스)
        - 선입선출 FIFO (=First In First Out)
        - 주로 키 입력 또는 메서드 호출 등의 이벤트 처리에 사용된다.
        - 먼저 들어온 객체 정보를 먼저 사용한다.
        - 구현체로 LinkedList 또는 PriorityQueue 를 많이 사용한다.
         */
        Queue<Integer> q1 = new LinkedList<>();
        // LinkedList는 List의 구현체인 동시에 Queue의 구현체이기도 하다.

        // #1. add : 추가
        // -> 큐의 사이즈가 다 차서 더 이상 추가할 수 없으면 에러가 발생한다.
        System.out.println("ㅡㅡㅡㅡ #1 ㅡㅡㅡㅡ");
        q1.add(3);
        q1.add(4);
        q1.add(5);
        System.out.println(q1); // [3, 4, 5]
        System.out.println();

        // #2. element
        System.out.println("ㅡㅡㅡㅡ #2 ㅡㅡㅡㅡ");
        System.out.println(q1.element()); // 3
        System.out.println(q1.element()); // 3
        // ㄴ> FIFO 이므로, 가장 먼저 들어간 자료를 가장 먼저 읽는다. (3을 읽음)
        System.out.println();


        // #3. remove : 꺼내면서 삭제
        System.out.println("ㅡㅡㅡㅡ #3 ㅡㅡㅡㅡ");
        System.out.println(q1.remove()); // 3
        System.out.println(q1.remove()); // 4
        System.out.println(q1.remove()); // 5
        // System.out.println(q1.remove()); << 오류 발생 : 큐가 비었기 때문에
        System.out.println();

        // ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ 안전장치가 있는 메서드들 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
        Queue<Integer> q2 = new LinkedList<>();

        // #4. offer : 큐가 다 채워져도 에러가 발생하지 않고, 더 이상 추가하지 않음.
        System.out.println("ㅡㅡㅡㅡ #4 ㅡㅡㅡㅡ");
        q2.offer(3);
        q2.offer(4);
        q2.offer(5);
        System.out.println();

        // #5. peek : 읽기
        // -> 빈 큐를 읽어도 에러가 발생하지 않는다.
        System.out.println("ㅡㅡㅡㅡ #5 ㅡㅡㅡㅡ");
        System.out.println(q2.peek());
        System.out.println();

        // #6. poll 꺼내면서 삭제 : 큐가 모두 비워져도 에러가 발생하지 않음.
        System.out.println("ㅡㅡㅡㅡ #6 ㅡㅡㅡㅡ");
        System.out.println(q2.poll()); // 3
        System.out.println(q2.poll()); // 4
        System.out.println(q2.poll()); // 5
        System.out.println(q2.poll()); // null

    }
}
