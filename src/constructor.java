public class constructor {
//    생성자 : 클래스 기반으로 객체 생성 연산자에 의해 호출되어 객체의 초기화 담당. method와 동일하게 생겼으나 반환타입이 없다.
//            new 키워드가 객체 생성시에만 실행한다. 생성자끼리는 호출 할 수 있으나 method에서 생성자를 부를 수 없다.

//    기본 생성자 : 모든 클래스는 생성자가 반드시 존재해야 한다.
//    생성자 선언을 생략 했을 때 컴파일러가 기본생성자를 만든다.

//    생성자 오버로딩 constructor overloading
//     동일한 이름의 생성자를 여러개 선언하는 것  매개변수 타입, 개수, 순서가 다른 생성자는 생성 가능

//    생성자 this()
//    생성자 오버로딩시 여러개 발생되어 중복된 코드가 발생할 수 있다. 이것을 줄이기 위한 키워드.
//    this() 의 this가 자기 자신 , 자기 자신의 메소드 => 객체 , 내가 아닌 다른 생성자를 뜻함.


//    메소드 오버로딩 method overloading
//    생성자 오버로딩과 조건이 같다.
//    클래스 내의 같은 메소드 여러개 선언. 매개 값을 받기 위해서


    //============================================================================

//     생성자
//    01. 생성자는 new keyword가 호출하여 사용하는 일종의 method
//    02. 생성자끼리는 서로 호출하는 것이 가능.
//    03. 생성자의 이름은 class 이름과 동일해야함.
//    04. 생성자는 반환 타입이 없음
//    05. 생성자는 실행되면서 class 의 member 변수를 초기화하는데 사용한다.
//    06. class의 member method가 생성자를 호출할 수 없다.
//    07. 매개변수가 없는 형태의 생성자를 기본 생성자라고 한다.
//    08. 모든 클래스는 1개 이상의 생성자를 가지고 있음
//    09. 클래스에 생성자를 생략하면 컴파일러가 내용이 비어있는 기본 생성자를 자동생성한다.
//    10. 클래스 사용자가 생성자를 하나라도 선언시에는 기본 생성자는 자동생성 되지 않음.
//    11. 동일한 이름의 생성자를 여러개 선언하는 것을 생성자 오버로딩이라 부르고 매개변수의 개수, 타입 순서가 다른 경우에 사용 가능.

//     메서드 오버로딩 : 이름이 같은 메서드 여러개 선언 ,조건 매개변수 타입 개수 순서중 하나라도 다르면 됨
//     메서드 오버로딩을 사용하는 이유는 비슷한 기능을 제공하는 메서드를 여러개 생성 시 각각 다른 이름을 제공하는 것 보다는
//     동일한 이름을 사용하는 것이 사용자가 편리하기 때문


//    this : 클래스 내에서 객체 자기 자신을 뜻하는 키워드
//    동일한 이름의  변수가 없을 경우 객체 멤버 변수로 this를 사용하지 않아도 객체 멤버 변수를 사용할 수 있다.
//    클래스 내에서 객체 멤버 변수 사용시  매개 변수와 동일한 이름으로 인해 혼동되는 것을 방지하기 위해 사용한다, .
//    클래스 상속이 있을 경우 부모 클래스의 멤버 변수와 객체 자신의 멤버 변수를 구별하기 위해서 사용한다.

}
