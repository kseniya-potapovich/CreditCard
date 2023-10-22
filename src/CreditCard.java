public class CreditCard {
    String accountNumber;
    double currentAmount;

    public CreditCard() {
    }

    public CreditCard(String accountNumber, double currentAmount) {
        this.accountNumber = accountNumber;
        this.currentAmount = currentAmount;
    }
    double add(double cash){
        return currentAmount + cash;
    }
    double takeAway(double cash){
        return currentAmount - cash;
    }
    void information(){
        System.out.println("Номер счета: " + accountNumber);
        System.out.println("Текущая сумма на счете: " + currentAmount);
    }
}
