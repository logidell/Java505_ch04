public class method {
//              method : 객체의 동작 (기능) :원하는 결과를 얻기 위한 소스코드의 묶음
//              method 이름 : 식별자 규칙에 맞게 작성
//           => 메서드 함수와 동일한 개념, 클래스의 멤버로 포함되어 있으면 메서드라고 한다.
//        사용자가 원하는 특정 결과를 얻기 위한 연산 식을 하나의 이름으로 묶어둔 것
//        사용자가 원하는 결과를 얻기 위한 소스코드를 한번 입력시에는 문제가 없으나 여러번 사용할 경우 소스코드의 중복 발생

//    매개변수 : 해당 메서드의 내의 연산 시 필요한 데이터를 외부에서 전달하는 변수
//    반환값  : 해당 메서드의 연산 후 그 결과값을 메서드를 호출한 위치로 다시 되돌려주는 것 키워드 return

//    메서드 사용법
//    선언 :
//        접근 제한자 반환타입 메서드명(매개변수1, 매개변수2, /...){
//        실행할 소스 코드

//    사용 (호출):
//            메서드량 (매개변수1,매개변수2);
//            변수명 = 메서드명 (매개변수1,매개변수2);

//    메서드의 4 형태
//    1. 매개변수와 반환값이 모두 없는 형태 - 연산에 필요한 변수를 메서드 내부에서 선언, 사용, 삭제함.
//      연산 후 그 결과를 메서드 내부에서 표현한다. 연산의 결과가 동일하다.

//    2. 매개변수는 존재하고 반환값은 없는 형태 - 연산에 필요한 데이터를 메서드 외부에서 전달받음
//       연산 후 그 결과를 메서드 내부에서 표현한다. 연산의 결과가 입력되는 데이터따라 변경된다.

//    3. 매개변수는 없고 반환값은 모두 존재하는 형태 - 연산에 필요한 데이터를 메서드 내부에서 선언,사용,삭제
//        연산 후 그 결과를 메서드 외부로 되돌려준다. 연산 결과를 다른 곳에 활용할 수 있다. 연산의 결과가 동일하다.

//    4. 매개변수와 반환값이 모두 존재하는 형태  - 연산에 필요한 데이터를 메서드 외부에서 전달받는다.
//        연산 후 그 결과를 메서드 외부로 돌려줄 수 있고 연산결과를 다른 곳에서 활용할 수 있다.
//        연산 결과가 입력되는 데이터 따라 변경된다 .

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println("a+b= " + c);

        a = 20;
        b = 10;
        c = a-b;
        System.out.println("a-b="+c);


        a=100;
        b=200;
        c=a+b;
        System.out.println("a+b"+c);

        sum();
        sum();
        sum();
        sum();
        sub();
        sub();

        multi(10,20);
        div(10,3);


        sumType1();
        subType2(10,20);
        subType2(100,20);

        int result = multiType3();
        System.out.println("두 수의 곱셈은 : " +result);
        System.out.println(result+result);

        double dResult = divType4(10,3);
        System.out.println("두 수의 나눗셈은 : " + dResult);

    }

    public static void sum() {
        int a =10;
        int b =20;
        System.out.println("두 수의 합 : "+ (a+b));
    }

    public static void sub(){
        int a= 10;
        int b= 20;
        System.out.println("두 수의 차 : + (a-b)");

    }

    public static void multi(int a, int b) {
        int result = a *b;
        System.out.println("두 수의 곱셈은"+ result);


    }

    public static void div(double a, double b  ) {
        int result = (int)(a/b);
        System.out.println("두 수의 나눗셈"+result);

    }
//
//    매개변수와 반환값이 모두 없는 타입
    public static void sumType1() {
        int a = 10;
        int b= 20;
        int result = a+b;
        System.out.println("두 수의 덧셈 : " + result);

    }
//    매개변수 존재하고 반환값이 없는 타입
    public static void subType2(int a, int b) {
        int result = a-b;
        System.out.println("두 수의 뺄셈: " + result);
    }
//    매개변수는 없고 반환값이 존재하는 타입
//    return 키워드 사용시 반환되는 값의 데이터 타입은 해당 메서드에 반환타입과 일치하여야 한다.
    public static int multiType3() {
        int a = 10;
        int b= 20;
        int result = a * b;
        return result;
    }
//    매개변수, 반환값 모두 존재하는 타입
    public static double divType4(int a, int b) {
        double result = a / b;
        return result;
    }
}

