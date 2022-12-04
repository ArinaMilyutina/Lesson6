public class Computer {
    public int cost;
    public String model;
    public String hdd;
    public String ram;
    public Computer(int cost, String model) {
        this.cost = cost;
        this.model = model;
    }

    public Computer(int cost, String model, String ram, String hdd) {
        this.cost = cost;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;

    }

    public static void main(String[] args) {
        Computer computer1 = new Computer(10000, "Lenovo");
        Computer computer2 = new Computer(12000, "HP", "AMD", "Toshiba");
        Computer.Ram ram = computer1.new Ram("AMD", 16);
        Computer.Hdd hdd = computer2.new Hdd("Toshiba", 16, true);
        System.out.println("Computer 1- Price: " + computer1.cost + "$; model: " + computer1.model + ";\n" + "Computer 2- Price: " + computer2.cost + "$; model: "
                + computer2.model + "; ram: " + computer2.ram + "GB; hdd: " + computer2.hdd);
        ram.enterInformationOfRam();
        hdd.enterInformationOfHdd();
    }

    class Ram {
        public String name;
        public int volume;

        public Ram() {
        }

        public Ram(String name, int volume) {
            this.name = name;
            this.volume = volume;

        }

        public void enterInformationOfRam() {
            System.out.println("RAM- Name: " + this.name + "; volume: " + this.volume + "GB;");
        }
    }

    class Hdd {
        public String name;
        public int volume;
        public boolean type;

        public Hdd() {

        }

        public Hdd(String name, int volume, boolean type) {
            this.name = name;
            this.volume = volume;
            this.type = type;
        }

        public void enterInformationOfHdd() {
            if (this.type) {
                System.out.println("HDD- Name: " + this.name + "; volume: " + this.volume + "GB; " + " type: external;");
            }
            if (!this.type) {
                System.out.println("HDD- Name: " + this.name + "; volume: " + this.volume + "GB; " + " type: internal;");
            }
        }
    }
}

