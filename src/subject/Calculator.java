package subject;

//     member 변수 : int num1,num2, result
//        member method : sum sub multi div
//        모든 결과는 int type, method 4 형태중 아무거나

public class Calculator {
    private int num1;
    private int num2;
//    private int result;

    public Calculator(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
//        this.result = 0;
    }


//    public void sum(){
//    this.result = this.num1+this.num2;
//
//    }
    public int sum(){

        return num1+num2;
    }
    public int sub() {
        return num1 - num2;
    }
    public int mult(){
        return num1 * num2;
    }
    public int div(){
        return num1 / num2;
    }
}
