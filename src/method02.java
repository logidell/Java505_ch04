import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class method02 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        Q1 사칙연산을 하기 위한 메서드를 메서드의 4가지 형태로 각각 생성해 실행하는 프로그램 작성
//        1) +,-,*,/ 각각 4가지형태로 생성
//        2) 1번타입의 함수 이름 : sum1, sub1, multi1, div1
//           2번타입의 함수 이름 : sum2, sub2, multi2, div2
//           3번타입의 함수 이름 : sum3, sub3, multi3, div3
//           4번타입의 함수 이름 : sum4, sub4, multi4, div4
//        3) 각각 함수를 모두 실행해 결과 확인
        System.out.println("===================문제1=================\n");
        sum1();
        sub1();
        multi1();
        div1();
        System.out.println("----------\n");
        sum2(20, 10);
        sub2(20, 10);
        multi2(20, 10);
        div2(20, 10);
        System.out.println("----------\n");

        int result = sum3();
        System.out.println("두 수의 합 : " + result);

        result = sub3();
        System.out.println("두 수의 차 :" + result);

        result = multi3();
        System.out.println("두 수의 곱 : " + result);

        result = div3();
        System.out.println("두 수의 나눔 : " + result);


        System.out.println("--------------\n");

        double dResult = sum4(10, 3);
        System.out.println("두 수의 합 : " + dResult);
        dResult = sub4(10, 3);
        System.out.println("두 수의 차 : " + dResult);
        dResult = multi4(10, 3);
        System.out.println("두 수의 곱 : " + dResult);
        dResult = div4(10, 3);
        System.out.println("두 수의 나눔 : " + dResult);


        gugudan();
//        score();

        System.out.println("=================");
//
//        int kor = 0;
//        int eng = 0;
//        int math = 0;
//        int total = 0;
//        double avg = 0.0;
//        String level = "F";
//
//        System.out.print("국어 점수를 입력해주세요 : ");
//        kor = scanner.nextInt();
//        System.out.print("영어 점수를 입력해주세요 : ");
//        eng = scanner.nextInt();
//        System.out.print("수학 점수를 입력해주세요 : ");
//        math = scanner.nextInt();
//
//        total = kor + eng + math;
//        avg = average(total);
//        level = scores((int)avg);
//
//        System.out.println("당신의 총점은 " + total + "점이고, 평균은 " + avg + "점이며, 등급은 " + level + "입니다.");

    }


    public static void sum1() {
        int a = 10;
        int b = 20;
        int result = a + b;
        System.out.println("+ : " + result);

    }

    public static void sub1() {
        int a = 10;
        int b = 20;
        int result = a - b;
        System.out.println(" - : " + result);
    }

    public static void multi1() {
        int a = 10;
        int b = 20;
        int result = a * b;
        System.out.println("* : " + result);
    }

    public static void div1() {
        int a = 10;
        int b = 20;
        int result = a / b;
        System.out.println(" / : " + result);
    }

    public static void sum2(int a, int b) {
        int result = a + b;
        System.out.println("두 수의 합: " + result);
    }

    public static void sub2(int a, int b) {
        int result = a - b;
        System.out.println("두 수의 차: " + result);
    }

    public static void multi2(int a, int b) {
        int result = a * b;
        System.out.println("두 수의 곱: " + result);
    }

    public static void div2(int a, int b) {
        int result = a / b;
        System.out.println("두 수의 나눔: " + result);
    }

    public static int sum3() {
        int a = 10;
        int b = 20;
        return a + b;
    }

    public static int sub3() {
        int a = 10;
        int b = 20;
        return a - b;
    }

    public static int multi3() {
        int a = 10;
        int b = 20;
        return a * b;
    }

    public static int div3() {
        int a = 10;
        int b = 20;
        return a / b;
    }

    public static double sum4(int a, int b) {
        return a + b;
    }

    public static double sub4(int a, int b) {
        return a - b;
    }

    public static double multi4(int a, int b) {
        return a * b;
    }

    public static double div4(int a, int b) {
        return a / b;
    }

    public static void gugudan() {
//        Q2 사용자 입력을 통해 2~9 까지의 숫자를 입력받아 해당하는 단수의 구구단을 출력하는 프로그램을 작성
//        1) 구구단을 출력하는 부분을 함수로 구현 (함수명 : gugudan)
//        2) 사용자 입력 부분은 함수로 구현해도 되고 안해도 됨
        System.out.println("단 수를 입력해주세요.\n");
        int num = scanner.nextInt();

        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i + "*" + j + "=" + (i * j));
            }
            if (i == num) {
                break;
            }
            System.out.println();
        }
    }


    //    }
//
//    public static String scores(int avg){
//////        Q3 사용자 입력을 통해서 국어, 영어, 수학 점수 3개를 입력받고 총점과 평균, 등급을 출력하는 프로그램 작성
//////        1) 등급 계산 부분을 함수로 구현 (함수명 : scores)
//////        2) 총점과 평균 계산 부분을 함수로 구현 (함수명 : everage)
//        String level = "F";
//
//        if (avg >= 90) {
//            level = "A";
//        }
//        else if (avg >= 80) {
//            level = "B";
//        }
//        else if (avg >= 70) {
//            level = "C";
//        }
//        else if (avg >= 60) {
//            level = "D";
//        }
//
//        return level;
//    }
//
//    public static double average(int avg) {
//    return (double)total /3;
//    }
}

