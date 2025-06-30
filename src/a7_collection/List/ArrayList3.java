package a7_collection.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayList3 {
    public static void main(String[] args) {

        // [ ArrayList 메서드 사용법 ]

        List<Integer> aList1 = new ArrayList<>();

        // #1. add (요소 추가 - 맨 뒤에 추가)
        System.out.println("#1. add ㅡㅡㅡㅡㅡ");
        aList1.add(3);
        aList1.add(4);
        aList1.add(5);
        System.out.println(aList1); // [3, 4, 5]
        System.out.println();

        // #2. add(int index, E element) (요소 추가 - 특정 위치에 추가)
        System.out.println("#2. add ㅡㅡㅡㅡㅡ");
        aList1.add(1,6);
        // ㄴ> 두 번째 자리에 6을 추가한다는 뜻이다. (0 1 2...순서 이므로)
        System.out.println(aList1); // [3, 6, 4, 5]
        System.out.println();

        // #3. addAll (또 다른 리스트를 뒤에 추가)
        System.out.println("#3. addAll ㅡㅡㅡㅡㅡ");
        List<Integer> aList2 = new ArrayList<>();
        aList2.add(1);
        aList2.add(2);
        aList2.addAll(aList1);
        System.out.println(aList2); // [1, 2, 3, 6, 4, 5]
        System.out.println();

        // #4. addAll (특정 위치에 리스트 추가)
        System.out.println("#4. addAll ㅡㅡㅡㅡㅡ");
        List<Integer> aList3 = new ArrayList<>();
        aList3.add(100);
        aList3.add(101);
        aList2.addAll(1, aList3);
        System.out.println(aList2);// [1, 100, 101, 2, 3, 6, 4, 5]
        // ㄴ> aList2의 값 - index 1의 자리에 aList3(100)과 (101)을 끼워 넣는다.
        System.out.println();

        // #5. set (수정)
        // set은 위칫값이 앞이다.
        System.out.println("#5. set ㅡㅡㅡㅡㅡ");
        System.out.println(aList3); // [100, 101]
        aList3.set(0, 10); // << 수정하기
        aList3.set(1, 20); // << 수정하기
        System.out.println(aList3); // [10, 20]
        System.out.println();

        // #6. remove(int index) (해당 인덱스 삭제)
        System.out.println("#6. remove ㅡㅡㅡㅡㅡ");
        // aList3.remove(10); // <주의> 정수는 인덱스로 인식한다
        aList3.remove(0);
        System.out.println(aList3); // [20]
        System.out.println();

        // #7. remove(Object obj) (해당 오브젝트 삭제)
        System.out.println("#7. remove ㅡㅡㅡㅡㅡ");
        aList3.add(0,10); // [10, 20]
        System.out.println(aList3);
        aList3.remove(Integer.valueOf(10));
        // 10 을 size 속의 위치가 아닌, 오브젝트로 인식하게끔 만듦.
        System.out.println(aList3); // [20]
        System.out.println();

        // #8. clear (모두 삭제)
        System.out.println("#8. clear ㅡㅡㅡㅡㅡ");
        aList3.clear();
        System.out.println(aList3); // []
        System.out.println();

        // #9. isEmpty (배열이 비어있는지 확인, 비었을 경우-true)
        System.out.println("#9. isEmpty ㅡㅡㅡㅡㅡ");
        System.out.println(aList3.isEmpty()); // true
        System.out.println();

        // #10. size (리스트의 전체 갯수를 리턴)
        System.out.println("#10. size ㅡㅡㅡㅡㅡ");
        System.out.println(aList2.size()); // 8
        System.out.println();

        // #11. get (특정 인덱스의 요소를 읽음)
        System.out.println("#11. get ㅡㅡㅡㅡㅡ");
        // 배열에서는 array[index] 처럼 읽지만, 컬렉션에서는 안 된다.
        // aList2[index] << 오류 발생 코드
        System.out.println(aList2.get(0)); // 1
        System.out.println(aList2.get(1)); // 100
        System.out.println(aList2.get(2)); // 101
        System.out.println();

        // #12. toArray (리스트를 배열로 바꾸는 것)
        System.out.println("#12. toArray ㅡㅡㅡㅡㅡ");
        System.out.println(aList2); // [1, 100, 101, 2, 3, 6, 4, 5]

        // int[] array = aList2.toArray(); << 오류 발생 코드
        // 오류 원인 : 왼쪽은 int[], 오른쪽은 Object[] (toArray()반환영 Object[])

        Object[] objArray = aList2.toArray(); // 가능
        System.out.println(Arrays.toString(objArray)); // [1, 100, 101, 2, 3, 6, 4, 5]

        // Integer[] intArray = (Integer[]) aList2.toArray(); << 오류 발생 코드
        // ㄴ> ClassCastException(Object[] -> Integer[] 다운캐스팅 하면서 발생)

        // [ 어떻게 하면 Integer[]로 변환할 수 있을까? ]
        Integer[] intArray = aList2.toArray(new Integer[0]); // 가능
        Integer[] intArray2 = aList2.toArray(new Integer[aList2.size()]);
        // 윗 줄 명령어와 같은 의미, 정상 작동하여 사용은 가능하나 잘 활용되진 않는다.
        System.out.println(Arrays.toString(intArray)); // [1, 100, 101, 2, 3, 6, 4, 5]
        // ㄴ> new Integer[0]은 0의 크기를 가진 배열을 만드는 것이 아닌,
        // aList.size()와 "같은 배열 크기"로 만들어 내라는 약속!
        System.out.println();

        // #13. contains (탐색)
        System.out.println("#13. contains ㅡㅡㅡㅡㅡ");
        boolean exist = aList2.contains(Integer.valueOf(100));
        // ㄴ> aList2 에서 100 을 찾으라는 의미
        System.out.println(exist ? "탐색 성공" : "탐색 실패"); // << 삼항 연산자!
        System.out.println();

        // #14. iterator (컬렉션 요소를 순차적으로 탐색)
        System.out.println("#14. iterator ㅡㅡㅡㅡㅡ");
        Iterator<Integer> iterator = aList2.iterator();
        // 탐색자(=반복자)는 다음 요소가 존재하면 true, 끝에 도달했으면 false를 리턴한다.
        // 탐색자는 자료 구조상에서 일종의 로봇이다. (처음부터 끝까지 탐색하는 기능)
        // 자동으로 끝을 알려주기 때문에, while 문에서도 안전하다. (무한루프 X)

        while(iterator.hasNext()) {
            Integer a = iterator.next();
            // 현재 탐색자가 위치한 요소(객체)를 반환하고 자동으로 다음으로 넘어간다.
            // 그렇기 때문에 따로 증감식이 필요 없다.
            System.out.println(a);
        }
        System.out.println();
    }
}
