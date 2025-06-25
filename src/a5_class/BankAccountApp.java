package a5_class;

public class BankAccountApp {
    public static void main(String[] args) {
        BankAccount bankObject = new BankAccount
                ("111-222-333", "ga eun", 10000);
        System.out.println(bankObject);
        System.out.println();

        if (bankObject.deposit(1000)) { // 정상 입금
            System.out.println("입금 성공~!");
            System.out.println(bankObject);
        }
        System.out.println();

        if (bankObject.deposit(0)) { // 예외 상황
            System.out.println("입금 성공~!");
            System.out.println(bankObject);
        }
        System.out.println();

        // 정상 출금
        if (bankObject.withdraw(2000)) {
            System.out.println("출금 성공~!");
            System.out.println(bankObject);
        } else {
            System.out.println("출금 실패..");
        }
        System.out.println();

        // 예외 상황
        if (bankObject.withdraw(20000)) {
            System.out.println("출금 성공~!");
            System.out.println(bankObject);
        } else {
            System.out.println("출금 실패..");
        }
        System.out.println();
    }
}
