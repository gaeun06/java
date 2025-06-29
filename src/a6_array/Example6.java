package a6_array;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        // 사용자로부터 입력받은 문자열을 거꾸로 출력하는 메서드
        // 예) hello 를 입력하면 olleh 를 출력
        Scanner scanner = new Scanner(System.in);
        System.out.println("문자열을 입력해주세요.");
        String str = scanner.nextLine();
        System.out.println(reverseString(str));
    }
    // 힌트! String을 charArray로 변형하여 거꾸로 담은 다음
    // 그걸 다시 String 으로 변환하여 반환하세요.
    public static String reverseString(String str) {
        char[] chars =  str.toCharArray();
        // str의 문자열이 하나하나로 분리되어 chars에 들어간다.

        String text = "";
        for (int i = chars.length-1; i >= 0; i--) {
            text += chars[i];
            // 배열 전체를 사용하는 것이 아닌, 그 안에 있는 특정 문자 하나에 접근하기 위해 대괄호(배열) 사용
            // chars[4] , chars[0] 처럼!!
        }
        return text;
        // str은 원래 입력 받은 문자열이고, text는 for 문으로 새로 만든 문자열
        // 개발자는 새로 만든 뒤집힌 문자열을 반환해야 하기 때문에, text를 반환한다.
    }
}
