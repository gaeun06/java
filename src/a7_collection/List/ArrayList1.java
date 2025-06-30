package a7_collection.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList1 {
    public static void main(String[] args) {
        // List 리스트
        // 컬렉션중에 가장 많이 사용되는 클래스(= 실제로는 인터페이스)
        // <중요> 모든 컬렉션은 "객체"만 저장할 수 있다.
        // 기본 자료형은 반드시 래퍼클래스의 객체로 변환되어 저장한다!!
        // 사용시에는 오토박싱, 오토언박싱 기능이 동작해서 타입 변환은 자동으로 발생한다.

        // 배열의 단점 : 추가와 삭제 불가능
        String[] array = new String[] {"A", "B", "C", "D"};
        System.out.println(array.length); // 4
        array[2] = null; // 2번을 삭제시킬 의도
        System.out.println(array.length); // 4?
        System.out.println(Arrays.toString(array));
        // [A, B, null, D] < 하지만 삭제 불가 >
        // -> 배열은 요소를 삭제해도 메모리 공간은 남으며, 사이즈도 그대로이다.

        // 리스트 (List)
        // 1. 생성자가 List가 아니라, 그 자식 클래스인 ArrayList (사실은 구현체..)
        // 2. 컬렉션은 자료형의 명시를 <String>과 같은 방식으로 표현한다 (= 제네릭 문법)
        List<String> aList = new ArrayList<>();
        // => List의 구현체를 aList 를 만들기 위해, ArrayList를 이용한다는 뜻
        // List의 자식 클래스인 ArrayList, LinkedList, Vector를 사용할 수 있다.
        // <String>은 new ArrayList<>()에 저장되는 요소가 문자열만 가능하다는 뜻의 문법이다. (=제네릭)

        System.out.println(aList.size()); // 0
        // 길이를 재기 위해 length를 사용하지 않는다. -> size 사용
        aList.add("A");
        aList.add("B");
        aList.add("C");
        aList.add("D");
        System.out.println(aList.size()); // 4
        System.out.println(aList); // [A, B, C, D]
        // Arrays.toString 을 사용하지 않아도 모든 값을 출력할 수 있다!

        aList.remove("C");
        // 인덱스가 아닌, 값을 전달하면 자동으로 찾아서 삭제해 준다!
        // remove는 처음 발견한 값만 삭제한다.
        // 만약 "C"가 여러개일 때, 모든 "C"를 삭제하려면 removeAll을 사용한다

        System.out.println(aList.size()); // 3
        System.out.println(aList); // [A, B, D]

        // 리터럴 방식으로 배열을 한 번에 생성 및 저장을 수행하는 것 처럼
        // ArrayList 를 아래처럼 생성할 수 있다.
        List<String> stringList = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
        System.out.println(stringList.size()); // 4
        System.out.println(stringList); // [A, B, C, D]
        stringList.add("E");
        System.out.println(stringList); // [A, B, C, D, E]
    }
}
