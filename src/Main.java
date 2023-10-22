public class Main {
    public static void main(String[] args) {
        CreditCard card1 = new CreditCard("12994hHAA56", 3456.8);
        CreditCard card2 = new CreditCard("92788SAQ98", 6775.2);
        CreditCard card3 = new CreditCard("784920QQW87W", 3455.6);

        card1.currentAmount = card1.add(45.0);
        card2.currentAmount = card2.add(345.0);
        card3.currentAmount = card3.takeAway(50.0);

        card1.information();
        card2.information();
        card3.information();
    }
}
