package a6_array;

import java.util.Arrays;

public class String2 {
    public static void main(String[] args) {
        // 1. 문자열 길이 length()
        String str1 = "Hello Java!";
        String str2 = "안녕하세요! 반갑습니다.";
        System.out.println(str1.length()); // 11
        System.out.println(str2.length()); // 13
        System.out.println();

        // 2. 문자열 검색 charAt(), indexOf(), lastIndexOf()
        System.out.println(str1.charAt(1)); // e
        System.out.println(str2.charAt(1)); // 녕
        System.out.println();

        System.out.println(str1.indexOf('a')); // 7
        System.out.println(str1.lastIndexOf('a')); // 9
        System.out.println(str1.indexOf('a', 8)); // 9
        System.out.println(str1.lastIndexOf('a', 8)); // 7
        System.out.println(str1.indexOf("Java")); // 6
        System.out.println(str1.indexOf("java")); // -1
        System.out.println();

        // 3. 문자열의 변환 및 연결 valueOf(), concat()
        String str3 = String.valueOf(2.3); // double -> String (Double.toString과 동일)
        String str4 = String.valueOf(false); // boolean -> String (Boolean.toString과 동일)
        System.out.println();

        String str5 = str3.concat(str4);
        System.out.println(str5); // 2.3false
        String str6 = "안녕" + 3;
        String str7 = "안녕".concat(String.valueOf(3));
        System.out.println(str6); // 안녕3
        System.out.println(str7); // 안녕3

        // 4. 문자열 -> byte[] 또는 char[]
        // 문자열을 바이트의 배열로 만드는 이유는 네트워크 전송, 파일 입출력 때문
        // ex) "Hello" 는 2byte * 5 =  10byte, 바이트 배열로 바꾸면 5바이트로 줄어듬
        // char 배열로 만드는 이유는 문자의 검색, 수정에 사용하기 위해서
        String str8 = "Hello Java";
        String str9 = "안녕하세요";
        byte[] array1 = str8.getBytes();
        byte[] array2 = str9.getBytes();
        System.out.println(Arrays.toString(array1)); // [72, 101, 108, 108, 111, 32, 74, 97, 118, 97]
        System.out.println(Arrays.toString(array2)); // [-20, -107, -120, -21, -123, -107, -19, -107, -104, -20, -124, -72, -20, -102, -108]
        System.out.println();

        // 한글의 문자 인코딩(character encoding) 방식
        // 자바가 내부적으로 사용하는 방식은 UTF-16 (2byte)
        // 윈도우 오피스가 사용하는 방식은 EUC-KR (2byte)
        // 가장 널리 사용되는 글로벌 표준 방식은 UTF-8 (3byte)
        // 한글은 최소 2byte가 필요하다.
        // array2의 byte[]이 15글자로 표현되는 것으로 보아 UTF-8을 사용한다. << 인텔리제이 때문에!!

        // 자바가 자체적인 메모리에 저장할 때는 2바이트씩 저장하는 것이 맞으나,
        // 화면에 보여주기 위해서는 3바이트씩, 15바이트가 사용된다. (UTF 8 인코딩)

        char[] array3 = str8.toCharArray();
        char[] array4 = str9.toCharArray();
        System.out.println(Arrays.toString(array3)); // [H, e, l, l, o,  , J, a, v, a]
        System.out.println(Arrays.toString(array4)); // [안, 녕, 하, 세, 요]
        // String은 불변성을 가지기 때문에 수정할 수 없다.
        // String을 char[]로 변경하여 수정하거나 검색하는 데에 용이하도록 사용한다.
        
    }
}








