public class CashMachine {
    public int countTwenty;
    public int countFifty;
    public int countHundred;
    public int allMoney;

    CashMachine(int countFifty, int countHundred, int countTwenty) {
        this.countFifty = countFifty;
        this.countHundred = countHundred;
        this.countTwenty = countTwenty;
    }

    public void addMoney(int cash) {
        this.allMoney = 20 * countTwenty + 50 * countFifty + 100 * countHundred;
        allMoney += cash;
    }

    public boolean takeAwayMoney(int cash) {
        if (allMoney >= cash) {
            System.out.println("The operation was successful:)");
            return true;
        } else {
            System.out.println("Not enough money:(");
            return false;
        }
    }

    @Override
    public String toString() {
        return "CashMachine:\n" +
                "countTwenty=" + countTwenty +
                ",\ncountFifty=" + countFifty +
                ",\ncountHundred=" + countHundred +

                ';';
    }

    public static void main(String[] args) {
        CashMachine atm = new CashMachine(10, 20, 30);
        System.out.println(atm);
        atm.addMoney(4000);
        atm.takeAwayMoney(100000);
    }
}
