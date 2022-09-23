public class Singletone {

    //    private  접근 제한자 : private로 지정된 멤버는 해당 클래스 내에서만 사용이 가능
    private static Singletone singleton = new Singletone();
;
//    생성자의 접근 제한자에 private을 사용하면 객체 생성시 new 키워드를 사용할 수 없다. (메모리에 등록되지 않는다. 주소 불러올 수 없음.)
//    => 객체 생성이 불가능하게 된다.
    private Singletone() {}

    public static Singletone getInstance() {
        return singleton;
    }

}
