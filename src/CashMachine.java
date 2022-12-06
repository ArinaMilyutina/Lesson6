public class CashMachine {
    public int countTwenty;
    public int countFifty;
    public int countHundred;
    public int allMoney;

    CashMachine(int countFifty, int countHundred, int countTwenty, int allMoney) {
        this.countFifty = countFifty;
        this.countHundred = countHundred;
        this.countTwenty = countTwenty;
        this.allMoney = allMoney;
    }

    public void addMoney(int addTwenties, int addFifties, int addHundreds) {
        countTwenty += addTwenties;
        countFifty += addFifties;
        countHundred += addHundreds;
        int allAdd = 20 * addTwenties + 50 * addFifties + 100 * addHundreds;
        allMoney = allAdd + allMoney;
        System.out.println("The number of banknotes after adding money:\nCount 20 banknote: " + countTwenty + ";\nCount 50 banknote: " + countFifty + ";\nCount 100 banknote: " + countHundred
                + ";\nAll money: " + allMoney + " BYN;\n");
    }

    public boolean takeAwayMoney(int count20, int count50, int count100) {
        int sumOfTakeAwayMoney = 20 * count20 + 50 * count50 + 100 * count100;
        if (allMoney >= sumOfTakeAwayMoney) {
            allMoney = allMoney - sumOfTakeAwayMoney;
            countTwenty = countTwenty - count20;
            countFifty = countFifty - count50;
            countHundred += countHundred - count100;
            System.out.println("Before withdrawal of money:\n" + "All money: " + allMoney + " BYN;");
            System.out.println("Count 20 banknote: " + countTwenty + ";\nCount 50 banknote: " + countFifty + ";\nCount 100 banknote: " + countHundred+";");
            return true;
        } else {
            System.out.println("Not enough money :(");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Before starting work CashMachine:\n" +
                "Count 20 banknote: " + countTwenty +
                ";\nCount 50 banknote: " + countFifty +
                ";\nCount 100 banknote: " + countHundred +
                ";\nAll money: " + allMoney + " BYN" +
                ";\n";
    }

    public static void main(String[] args) {
        CashMachine atm = new CashMachine(10, 20, 30, 3100);
        System.out.println(atm);
        atm.addMoney(100, 40, 50);
        atm.takeAwayMoney(5, 10, 6);
    }
}
