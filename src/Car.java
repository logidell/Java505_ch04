public class Car {
    String name;
    String type;
    String gas = "가솔린";
    String size;
    int speed = 6;


    public Car(String carName, String carType, String carGas, String carSize) {
        name = carName;
        type = carType;
        gas = carGas;
        size = carSize;
    }

    public void move() {
        System.out.println("자동차가" + speed + " 의 속도로 움직입니다.");
    }

    public void stop() {
        System.out.println("자동차가 멈춥니다. ");
    }
}


