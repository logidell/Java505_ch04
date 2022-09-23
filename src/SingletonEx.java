public class SingletonEx {
    public static void main(String[] args) {
//        Singletone singleton1 = new Singletone();
//        Singletone singleton2 = new Singletone();
//        이 패턴은 내부에서만 사용이 가능하다.


//        싱글톤 디자인 패턴 방식 사용해 객체를 생성.
        Singletone singleton1 = Singletone.getInstance(); //output : Singletone@3ac3fd8b
        Singletone singleton2 = Singletone.getInstance(); //output : Singletone@3ac3fd8b
//        이 패턴은 외부에서 사용할 수 있다.



//        두 객체는 다르다.
        System.out.println(singleton1); //output : Singletone@3ac3fd8b
        System.out.println(singleton2); //output : Singletone@5594a1b5



        if (singleton1 == singleton2) {

            System.out.println("두 객체가 같다");

        } else {
            System.out.println("두 객체는 다르다.");
        }
    }
}
