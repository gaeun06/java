package a5_class;

public class User {
    // 필드
    String userName;
    String email;
    String password;

    // 생성자 : 보통 기본 생성자와 모든 필드를 매개변수로 하는 생성자를 선언해줌
    // 만약 아무 생성자도 선언하지 않으면 자동으로 기본 생성자를 제공해 준다!!

    public User() {
    }
    public User(String userName, String email, String password) {
        this.userName = userName;
        this.email = email;
        this.password = password;
    }

    // 메서드
    // 패스워드를 변경하는 메서드
    public String setPassword(String newPassword) {
        this.password = newPassword; // 하나의 특정 객체가 해당하는 어떠한 객체
        return this.password;
    }
}
