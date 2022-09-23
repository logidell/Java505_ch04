public class Calc {
    public static int sNum1;
    public static int sNum2;
    public static int sResult;

    public int iNum1;
    public int iNum2;
    public int iResult;

    public static int sSum(){
//        정적 멤버는 일반 멤버 사용 불가능 -> 정적 멤버는 정적멤버끼리만!
//        정적 멤버가 동작하는 순간에 일반멤바가 메모리에 등록되지 않았을 수 있기 때문에 사용할 수 없음
        sResult = sNum1+ sNum2;
        return sResult;
    }

//    일반 멤버는 정적 멤버에 접근 가능
//    일반 멤버는 객체 생성 후에 사용하는 것이기 때문에 언제든지 정적 멤버에 접근이 가능함
    public int iSum(){
        iResult = sNum1+ sNum2;
        return sResult;

    }

    public static int abs(int a) {
        if (a > 0) {
            return a;
        } else {
            return -a;
        }
    }
    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static int min(int a, int b) {
        if (a > b) {
            return b;
        } else {
            return a;
        }
    }
// 인스턴스 멤버 선언 vs 정적 멤버 선언 기준
//    필드
//    객체마다(멤버변수) 가지고 있어야 할 데이터(다른 경우) => 인스턴스 필드
//    공용적 데이터 -> 정적필드

//    메소드
//    인스턴스  필드로 작업해야 할 메소드 메소드 => 인스턴스 메소드
//    인스턴스 필드로 작업하지 않는 메소드 -> 정적 메소드
//    정적 초기화 블록
//    static {....}-> 정적 멤버 전용 생성자.
//    정적 메소드와 정적 블록 작성 시 주의 점
//    객체가 없더도 실행 가능
//    블록 내부 인스턴스 필드. 인스턴스 메소드 사용불가 (일반메소드들 사용불가)
//    this 객체 자신의 참조 this도 사용 불가.

//    싱글톤 Singletone - 디자인패턴 (Gof 디자인 패턴) (에릭 감마 / 출판사 person)
//     단 하나만 생성하되는 객체
//    -> 외부에서 new  연산자로 생성자로 호출할 수 없도록 막기 private(접근제한자) 생성자를 앞에 붙인다.
//    -> 클래스 자신의 타입으로 정적필드 선언. 외부에 호출할 수 있는 정적 메소드 getInstance() 선언
//
//
//




}
