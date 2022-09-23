public class Person {


    //    final 필드
//    최종적 값을 가지고 있는 필드 =  값을 변경할 수 없는 필드
//    필드 딱 한번 초기값 지정


//    final : 단 한번만 데이터 저장이 가능하고 더이상 수정 불가능

    final String nation = "대한민국"; //선언과 동시에 데이터를 넣었음.
    final String ssn; // 생성자를 통해 자동초기화 들어가니 오류 해결.
    String name;

//final 변수 ssn을 생성자를 통해 한번 데이터 저장.
    public Person(String ssn, String name) {
        this.ssn = ssn; // 생성자 통한 자동 초기화
        this.name = name;

    }


}
