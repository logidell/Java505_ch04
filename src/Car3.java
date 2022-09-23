public class Car3 {
    public String name;
    public String type;

    public Car3() {
        name ="toless";
                type ="sun";
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