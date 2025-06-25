package a5_class;

import java.util.Arrays;

public class BankAccount {
    // 필드
    // accountNumber 계좌번호
    // ownerName 예금주 이름
    // balance 잔액
    // 생성자
    // 메서드
    // deposit(금액) : 돈을 입금하는 메서드 (양수만 가능)
    // withdraw(금액) : 돈을 출금하는 메서드
    //                      (양수만 가능, 잔액보다 출금액이 많으면 경고 표시)
    // toString() : 계좌번호, 예금주 이름, 잔액 화면 출력

    // 필드
    String accountNumber;
    String ownerName;
    double balance;

    // 생성자
    public BankAccount() {
    }

    public BankAccount(String accountNumber, String ownerName, long balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    // 메서드
    public boolean deposit(double amount) { // 입금
        if (amount <= 0) {
            System.out.println("입금액에 오류가 있잖아..!");
            return false; // 입금 실패하면 false
        } else {
            this.balance += amount;
            return true; // 입금 성공하면
        }
    }
    public boolean withdraw(double amount) { // 출금
        if (amount <= 0 ) {
            System.out.println("출금액에 오류가 있잖아..!");
            return false;
        } else if (amount > this.balance) {
            System.out.println("잔액보다 출금액이 더 많잖아..!");
            return false;
        } else {
            this.balance -= amount;
            return true;
        }
    }

    @Override
    public String toString() {
        return "계좌번호: " + accountNumber + ", 예금주: " + ownerName + ", 잔액: " + balance + "원";
    }

//    public long deposit(long newBalance) {// 입금
//        newBalance = balance + this.balance;
//        return balance;
//    }
//
//    public long withdraw(long newBalance) {
//        newBalance = this.balance - balance;
//        if (this.balance < balance) {
//            System.out.println("잔액보다 출금액이 더 많잖아..!");
//        }
//        return newBalance;
//    }
//
//    public String toString() {
//        String str = "계좌번호: " + accountNumber + ", 예금주: " + ownerName + ", 잔액: " + balance;
//        return str;
    }
