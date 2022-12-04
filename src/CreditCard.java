public class CreditCard {
    int number;
    int money;
    int calculate;
    int withdraw;
    int cash = 1000;

    public int CalculateTheAmount() {
        calculate = money + cash;
        return calculate;
    }

    public int WithdrawTheAmount() {
        withdraw = money - cash;
        return withdraw;
    }

    public static void OutputInformationFromCard() {
        CreditCard c1 = new CreditCard(11111, 1000);
        CreditCard c2 = new CreditCard(22222, 2000);
        CreditCard c3 = new CreditCard(33333, 3000);
        System.out.println("Card information:\n" + "Credit card number 1-Number: " + c1.number + ", money: " + c1.money + "$;\n" + "Credit card number 2-Number: "
                + c2.number + ", money: " + c2.money + "$;\n" + "Credit card number 3-Number: " + c3.number + ", money: " + c3.money + "$;");
        System.out.println("Current status of cards after money transfers:\n" + "Card 1: " + c1.CalculateTheAmount() + "$;\n" + "Card 2: " + c2.CalculateTheAmount() + "$;\nCard 3: "
                + c3.WithdrawTheAmount() + "$;");
    }

    CreditCard(int number, int money) {
        this.number = number;
        this.money = money;
    }

    public static void main(String[] args) {
        OutputInformationFromCard();
    }
}