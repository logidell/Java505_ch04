public class Car6 {
    public String name; // 전역변수
    public String size;

//    public void setinfo(String carName, String carSize) {
//        name = carName;
//        size = carSize;
//    }
//public void setinfo(String name, String size) {
//    name = name;
//    size = size;
//}  // 이렇게 적으면 못알아먹음.

    public void setinfo(String name, String size) {

        this.name = name; // 지역변수, class의 지역변수가 우선권이 높다.
        this.size = size;

    }

    public void getInfo() {
        System.out.println("이름 : " + name + "\n크기 : " + size);
        System.out.println("=========================");
//        ==================================================================

    }
}
