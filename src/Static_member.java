public class Static_member {

    public static void main(String[] args) {
//         static :  정적 member  / 클래스에 고정된 필드, 메소드 정적필드 (정적멤버 변수), 정적 메소드 (정적 멤베 메소드 )
//        - class에 소속된 멤버, 정적 멤버는 객체 생성을 않고 바로 접근할 수 있음
//         객체 없이 클래스 이름으로 접근
//         정적 멤버는 일반 객체 멤버 접근 불가 -> 정적 멤버는 정적 멤버끼리만 사용할 수 있다는 말

//
//       객체 생성 후 객체의 멤버 사용
        StaticClass sc1 = new StaticClass();
        sc1.getInfo();
        System.out.println("나이 : " + sc1.age);
        System.out.println("이름 : " + sc1.name);

        StaticClass.job = "가수";
        System.out.println("직업 : " + StaticClass.job);
        StaticClass.getJob();

        System.out.println("====================================");

//        Calc class member method인 abs, max, min 모두 정적 멤버라 객체생성 없이 클래스 이름으로 직접 접근 가능
        System.out.println(Calc.abs(-5));
        System.out.println(Calc.max(10,8));
        System.out.println(Calc.min(-3,-8));



        Calc c = new Calc();
        System.out.println(c.max(10,8));
        System.out.println(c.min(20,8));
        System.out.println(c.abs(10));
//        이렇게도 접근은 가능, 정적 멤버도 객체 생성 후 사용이 가능하다.
//=========================================================================
//        일반 멤버 이용한 연산
        Calc c1 = new Calc();
        Calc c2 = new Calc();

        c1.iNum1 = 10;
        c1.iNum2 = 20;
        c1.iResult = c1.iNum1+c1.iNum2;
        System.out.println("객체 c1의 iReseult : "+ c1.iResult);
        System.out.println("==================================================================");
        c2.iNum1 = 100;
        c2.iNum2 = 200;
        c2.iResult = c2.iNum1+c2.iNum2;
        System.out.println("객체 c2의 iReseult : "+ c2.iResult);


//        정적멤버 이용한 연산
        c1.sNum1 = 10;
        c1.sNum2 = 10;
        c1.sResult = c1.sNum1+c1.sNum2;
        System.out.println(c1.sResult);


        c2.sNum1 = 100;
        c2.sNum2 = 200;
        c2.sResult = c2.iNum1+c2.iNum2;
        System.out.println("객체 c2의 iReseult : "+ c2.iResult);
        System.out.println("객체 c2의 iReseult : "+ c2.iResult);
        System.out.println(" 클래스 sResult : " + Calc.sResult);

//======================================================
        System.out.println("=================================");

        System.out.println(Tv.info);

    }
//     정적 멤버는 해당 클래스를 객체화하여 사용시 객체화된 모든 객체들과 함께[ 모리를 공유
}
