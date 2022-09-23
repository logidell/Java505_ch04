public class Circle { // 필드
    int radius; // 멤버 변수 상태값, 보유값 저장하는
    //선언
    //사용
//    멤버 변수는 클래스 안에 선언 (메서드 안에 포함되지 않음)
//    메서스 내애세 사용 (일반 변수 사용과 같은점은 동일)
//    클래스 멤버 선언부에서 연산은 불가, 선언하고 초기화 하는 것만 가능타.
//    해당 클래스 밖에서 클래스 통한 객체 생성후 " 객체명 .멤버변수명



    String name;


    public double getArea() { // 맴버 메서드
        return 3.14 * radius * radius;


    }

    public static void main(String[] args) {

    }
}
