public class Car5 {

    public String name;
    public String type;
    public String size;
    public String color;

    public Car5(String carName, String carType, String carSize, String carColor) {
        name = carName;
        type = carType;
        size = carSize;
        color = carColor;
    }


    public Car5(String carName, String carType, String carSize) {
        this(carName, carType, carSize, "검정색");
    }

    public Car5(String carName, String carType) {
        this(carName, carType, "대형");
    }

    public Car5(String carName) {
        this(carName, "세단");
    }

    public Car5() {
        this("그랜저");
    }

    public void getInfo() {
        System.out.println("차의 이름은 " + name + "\n차 종 : "
                + type + "\n크키: " + size + "\n색상: " + color);
        System.out.println("--------------");
    }

    public void getInfo(String gas) {
        System.out.println("차의 이름은 " + name + "\n차 종 : "
                + type + "\n크키: " + size + "\n색상: " + color + "\n연료: " + gas);
        System.out.println("--------------");
    }

    public void getInfo(String gas, int price) {
        System.out.println("차의 이름은 " + name + "\n차 종 : "
                + type + "\n크키: " + size + "\n색상: " + color + "\n연료: " + gas + "\n가격: " + price);
        System.out.println("--------------");
    }

    public void getInfo(String gas, String price) {
        System.out.println("차의 이름은 " + name + "\n차 종 : "
                + type + "\n크키: " + size + "\n색상: " + color + "\n연료: " + gas + "\n가격: " + price);
        System.out.println("--------------");
    }

    public void getInfo(int price, String gas) {
        System.out.println("차의 이름은 " + name + "\n차 종 : "
                + type + "\n크키: " + size + "\n색상: " + color + "\n연료: " + gas + "\n가격: " + price);
        System.out.println("--------------");
    }
}





