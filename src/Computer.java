
public class Computer {
    public int cost;
    public String model;
    Hdd hdd;
    Ram ram;

    public Computer(int cost, String model) {
        this.cost = cost;
        this.model = model;
        ram = new Ram();
        hdd = new Hdd();
    }

    public Computer(int cost, String model, Ram ram, Hdd hdd) {
        this.cost = cost;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
    }

    @Override
    public String toString() {
        return "Computer: " +
                "cost=" + cost +
                ", model= " + model +
                " " + hdd +
                " " + ram ;
    }

    public static void main(String[] args) {
        Computer.Ram ram = new Ram("AMD", 16);
        Computer.Hdd hdd = new Hdd("Toshiba", 16, false);
        Computer computer1 = new Computer(10000, "Lenovo");
        Computer computer2 = new Computer(12000, "HP", ram, hdd);
        System.out.println(computer1 + "\n" + computer2);
        System.out.println(ram);
        System.out.println(hdd);
    }

    static class Ram {
        public String name;
        public int volume;

        public Ram() {
            name = "AMD";
            this.volume = 24;
        }

        public Ram(String name, int volume) {
            this.name = name;
            this.volume = volume;

        }

        @Override
        public String toString() {
            return "Ram: " +
                    "name= " + name +
                    ", volume= " + volume +
                    ";";
        }
    }

    static class Hdd {
        public String name;
        public int volume;
        public boolean type;

        public Hdd() {
            this.name = "Toshiba";
            this.volume = 8;
            this.type = true;

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
                        "name= " + name +
                        ", volume= " + volume +
                        ", type= " + "external;";
            } else {
                return "Hdd: " +
                        "name= " + name +
                        ", volume= " + volume +
                        ", type= " + "internal;";

            }
        }
    }
}

