public class GetterSetterEx {
    public static void main(String[] args) {
        BMI gildong = new BMI();
        gildong.name = "홍길동";
        gildong.heghit = 180;
        gildong.weight = 75;

//        bmi는  private으로 설정되어 있어 외부 접근 불가
//        gildong.bmi = 33;
        System.out.println(gildong.name + "의 키는" + gildong.heghit + "cn\n" + gildong.name + "의 몸무게" + gildong.weight + "kg");
        gildong.setMyInfo(180, 75);
        System.out.println(gildong.name + "의 bmi는" + gildong.getBmi());
        GetSet ggs = new GetSet();
        ggs.Value1 = "public 멤버 변수";
        System.out.println(ggs.Value1);
        ggs.setValue2("private 멤버 변수");
        System.out.println(ggs.getValue2());
    }
}
