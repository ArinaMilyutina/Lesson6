public class CreditCard {
    int number;
    int money;

    public void calculateTheAmount(int money) {
        this.money += money;
    }

    public void withdrawTheAmount(int money) {
        this.money -= money;
    }

    @Override
    public String toString() {
        return "CreditCard: " +
                "number=" + number +
                ", money=" + money +
                ';';
    }

    CreditCard(int number, int money) {
        this.number = number;
        this.money = money;
    }

    public static void main(String[] args) {
        CreditCard c1 = new CreditCard(11111, 1000);
        CreditCard c2 = new CreditCard(22222, 2000);
        CreditCard c3 = new CreditCard(33333, 3000);
        System.out.println(c1 + "\n" + c2 + "\n" + c3 + "\n");
        c1.calculateTheAmount(100);
        c2.calculateTheAmount(120);
        c3.withdrawTheAmount(500);
        System.out.println("Current status of the card after monetary transaction:\n" + c1 + "\n" + c2 + "\n" + c3 + "\n");
    }
}