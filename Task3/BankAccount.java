package Task3;

public class BankAccount {
    private int Balance;
    BankAccount(int Balance){
        this.Balance=Balance;
    }

    int getBalance(){
        return this.Balance;
    }
    
    void setBalanace(int amnt){
        this.Balance=amnt;
    }
}
