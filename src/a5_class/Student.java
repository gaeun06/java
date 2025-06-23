package a5_class;

// 이 자료형의 목적은 학생 데이터를 저장하기 위함
// 이런 목적의 클래스에는 main()을 선언하지 않는다.
public class Student {
    // 내부 구성 요소 (필드, 생성자, 메서드) - 외워야 함.
    // #1. 필드
    String name;
    int age;
    String address;
    String gender;
    double scoreMach;
    double scoreHistory;
    double scoreMusic;

    // #2. 생성자 : 필드 영역을 초기화하는 역할. new 뒤에 사용.
    // # 2-1. 기본 생성자
    public Student() {}
    // #2-2. 매개변수가 있는 생성자
    public Student (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, String address, String gender, double scoreMach, double scoreHistory, double scoreMusic) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.gender = gender;
        this.scoreMach = scoreMach;
        this.scoreHistory = scoreHistory;
        this.scoreMusic = scoreMusic;
    }
    // 생성자와 메서드의 차이점
    // 1) 목적 : 생성자는 필드의 초기화 역할, 메서드는 기능 구현 역할
    // 2) 이름 : 생성자는 클래스와 동일, 메서드는 동사로 시작하도록 작명(동사+명사)
    // 3) 반환형 : 생성자는 반환형 없음, 메서드는 반드시 명사 (void, int, String 등)

    // #3. 메서드
    public double sumScore() {
        double sum = this.scoreMach + this.scoreHistory + this.scoreMusic;
        return sum;
    }
    public double averageScore() {
        double sum = this.sumScore(); // 흔히 메서드에는 this를 생략함.
        double average = sum / 3;
        return average;
    }

    public String setName(String newName) {
        /*
        중요!!
        클래스의 필드를 직접 수정하면 각 필드의 특징을 거스르는 값이 저장될 수 있다.
        ex. 숫자가 포함된 이름과 같이 문법적으로는 문제가 없지만 이름에는 적절하지 못하다.
        그러므로 필드에 직접 수정하는 방식을 박고 메서드를 통한 수정 방식을 선호한다.
        ==> 이것을 클래스의 은닉화(=Capsulization)이라고 한다.
        */

//        if (문자열 안에 숫자가 포함되어 있다면) {
//            System.out.println("에러 발생. 이름 안에 숫자가 있습니다.");
//            // 예외 발생~
//        } else if (빈 문자열이라면) {
//            System.out.println("에러 발생. 이름이 없습니다.");
//            // 예외 발생~
//        }
        this.name = newName;
        return this.name;
    }
}
