public class method05 {
//    - 참고 Car2 sheet
//    이 곳의 class는 실행용 class다.

    public static void inCall() {
        System.out.println("method class member method call \n");
    }

    public static void Sum(int a, int b) {
        int result = a + b;
        System.out.println("두 수의 덧셈" + result + "입니다. ");
    }

    public static void Sum(double a, double b) {
        double result = a + b;
        System.out.println("두 수의 덧셈" + result + "입니다. ");

    }

    public static void Sum(double a, int b) {
    }

    public static void main(String[] args) {
//        method 호출
// 호출방식 1. 클래스 내부 사용 : 동일한 클래스의 멤버끼리 호출하는 것
//         2. 클래스 외부 호출 : 다른 클래스의 객체를 생성(선언)해 해당 객체의 멤버를 호출
        inCall(); // 클래스 내부호출

        Car2 avante; // Car2 class type의 변수 avante 선언
        avante = new Car2(); // 클래스 객체 생성
        // * new keyword :  메모리 공간에 생성자(Car2)를 통해 생성된 객체를 등록, 등록된 메모리 주소를 반환.
        // * 생성자 : 지정한 클래스를 기반으로 객체를 생성
        // Car2 class 객체가 생성되고 클래스 타입의 변수 avante 대입되어 사용 준비가 완료 (member들을 사용할 수 있게 된다. )

        // 클래스 외부 호출
//       객체 . member 가 됨.  / class.member x 객체의 멤버 호출이기 때문이다.
        avante.name = "avante ";
        avante.run();
        avante.stop();
        avante.sound();
        System.out.println("==================\n");
        Car2 sonata = new Car2(); // Car2 class type의 객체 생성
        sonata.name = "sonata ";
        sonata.run();
        sonata.stop();
        sonata.sound();

        Car3 car = new Car3();
        car.info();


        Car4 canival = new Car4();
        canival.name = "카니발";
        canival.type = "SUV";
        canival.info();

        Car5 grander1 = new Car5();
        grander1.getInfo();

        Car5 k7 = new Car5("K7", "세단", "준대형");
        k7.getInfo();
        k7.getInfo("전기");
        k7.getInfo("가솔린", 4000);
        k7.getInfo("가솔린", "4000");
        k7.getInfo(4000, "경유"); // 순서를 바꿔도 출력하는 순서가 바뀌지는 않는다.

//        iSum(10, 20);
//        dSum(3.14,5.28); // 이거 겁나 귀찮.

        Sum(10, 20);
        Sum(3.14, 5.28);
        Sum(3.14,20);

    }


}
