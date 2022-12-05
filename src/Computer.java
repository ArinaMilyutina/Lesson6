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

    @Override
    public String toString() {
        return "Computer: " +
                "cost=" + cost +
                ", model='" + model + '\'' +
                ", hdd='" + hdd + '\'' +
                ", ram='" + ram + '\'' +
                ';';
    }

    public static void main(String[] args) {
        Computer computer1 = new Computer(10000, "Lenovo");
        Computer computer2 = new Computer(12000, "HP", "AMD", "Toshiba");
        Computer.Ram ram = computer1.new Ram("AMD", 16);
        Computer.Hdd hdd = computer2.new Hdd("Toshiba", 16, true);
        System.out.println(computer1+"\n"+computer2);
        System.out.println(ram);
        System.out.println(hdd);
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

        @Override
        public String toString() {
            return "Ram: " +
                    "name='" + name + '\'' +
                    ", volume=" + volume +
                    ';';
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

        @Override
        public String toString() {
            if (this.type) {
                return "Hdd: " +
                        "name='" + name + '\'' +
                        ", volume=" + volume +
                        ", type=" + "external" +
                        ';';
            } else {
                return "Hdd: " +
                        "name='" + name + '\'' +
                        ", volume=" + volume +
                        ", type=" + "internal" +
                        ';';

            }
        }
    }
}

