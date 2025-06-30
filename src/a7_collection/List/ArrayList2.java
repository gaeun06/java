package a7_collection.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList2 {
    public static void main(String[] args) {
        // [ 배열을 List로 변환하는 법 ] ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
        // int[] array = {1,2,3,4};
        // ㄴ> 기본 자료형의 배열은 List 로 자동 변환되지 않는다.

        Integer[] array = {1,2,3,4};
        List<Integer> aList1 = Arrays.asList(array);

        // aList1.add(5); << 왜 에러가 발생하는가 ?
        // -> Arrays.asList()로 배열을 리스트로 변환할 때,
        // 기존 배열의 메모리 위치를 그대로 재사용하기 때문이다.
        // = 원본 배열을 참조하여 List 인터페이스의 껍데기를 씌운 것과 같다.
        // 그러므로 배열의 고정 크기를 유지하며 View(뷰)의 역할을 수행한다.
        // 결과적으로 배열의 불변성을 그대로 가지게 되는 것이다.

        // [ 위의 오류 발생 코드는 아래와 같이 수정할 수 있다. ] ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
        List<Integer> aList2 = new ArrayList<>(Arrays.asList(array));
        // ㄴ> 이것은 새로운 메모리에 만들어져, 일종의 값 복사를 이루어 내는 것이다.
        aList2.add(5);
        // ㄴ> 그 후, 5 를 추가하면 아래와 더해진 배열값이 같이 정상 출력되는 것을 확인 할 수 있다.
        System.out.println(aList2); // [1, 2, 3, 4, 5]
        // : 기존 배열의 메모리 위치를 재사용하지 않고
        // new ArrayList<>()로 새로 생성하는 방식이므로, 새로운 힙 메모리 영영을 가진다. (= 값 복사)
        // 해당 경우에는 리스트의 특징을 그대로 사용할 수 있다.
    }
}
