package Task3;

import java.util.Scanner;

public class ATM {
    static void deposit(BankAccount b, int amnt) {
        int balance=b.getBalance();
        balance+=amnt;
        b.setBalanace(balance);
        System.out.println("Amount deposited !");
    }

    static void withdraw(BankAccount b,int amnt) {
        int balance=b.getBalance();
        if(balance>=amnt){
            balance-=amnt;
            b.setBalanace(balance);
            System.out.println("Amount withdrawed!");
        }
        else{

            System.out.println("Operation Failed !");
        }
    }

    static void checkBalance(BankAccount b) {
        System.out.println(b.getBalance());
    }

    public static void main(String[] args) {
         int i=1,amnt=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose one of them \n1. Create Account \n2. exit\n:");
        int choice = sc.nextInt();
       
        switch (choice) {
            case 1:
                System.out.print("Enter the first balace of account:");
                int bal =sc.nextInt();
                BankAccount B1 =new BankAccount(bal);
                while (i==1) {

                    System.out.print("1.Deposit \n2.withdraw \n3.check Balance \n4.exit\n:");
                    int secondCh = sc.nextInt();

                    switch (secondCh) {
                        case 1:
                            System.out.print("Enter Amount:");
                            amnt=sc.nextInt();
                            deposit(B1 ,amnt );
                            break;
                        case 2:
                            System.out.print("Enter Amount:");
                            amnt=sc.nextInt();
                            withdraw(B1,amnt);
                            break;
                        case 3:
                            checkBalance(B1);
                            break;
                        case 4:
                            i++;
                            break;
                        default:
                            System.out.println("invalid input ...choose again !");
                            break;
                    }

                }
                break;
            case 2:
                break;
        }

    }

}
