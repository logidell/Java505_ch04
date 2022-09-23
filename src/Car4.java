public class Car4 {
    public String name;
    public String type;

    public Car4(String carName, String carType) {
        name = carName;
        type = carType;

    }

    public Car4() {

    }

    public void run() {
        System.out.println(name + "is running");
    }

    public void stop() {
        System.out.println(name + "is stop");
    }

    public void info() {
        System.out.println(name + " car name is " + name + "and type is " + type + ".");
    }
}
