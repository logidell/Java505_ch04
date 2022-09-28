package subject;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class QuestEx2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        System.out.println("정수 두 수를 입력하세요");
//
//        Calculator calc = new Calculator(scan.nextInt(), scan.nextInt());
//        System.out.println("두 수의 합은 : " + calc.sum());
//        System.out.println("두 수의 차는 : " + calc.sub());
//        System.out.println("두 수의 차는 : " + calc.mult());
//        System.out.println("두 수의 차는 : " + calc.div());

//
//        Q2. 1~45까지 random 함수 사용해 숫자 6개 생성, 결과 출력하는 프로그램 작성
//        배열 사용해 랜덤 생성된 데이터 저장  (중복되게 작성)

//        Random r = new Random();
//        int Number = r.nextInt();
//
//        int rArray[];
//        rArray = new int[7];
//        for (int i = 0; i < rArray.length; i++) {
//                int rnd = (int) ((Math.random()*45)+1);
//                rArray[i] = rnd;
//            System.out.print(rArray[i]+"\t");
//            }


//       Q3. 문제 2 반복 실행시 배열에 저장되는 중복 숫자 발생. 그 중복숫자 제외 후 6개 숫자 저장,
//      출력하는 프로그램 작성 (중복제외)
//
        int lotto2[] = new int[7]; // 로또 번호를 저장할 배열


//      로또 번호 생성
        for (int i = 0; i < lotto2.length;i++) {
//            랜덤 숫자 생성, 1~45
            int rnd = (int)((Math.random() * 45) + 1);

//            0.0   ~ 1.0(정확히는 0.999..99)
//            Math.random() * 45 : 44.999~ int로 자름. +1

//            중복제거
            for (int j = 0; j < i; j++) {
//                  동일한 값이 있는지 확인
                if (rnd == lotto2[j]) {
//                  동일한 값이 있을 경우 현재 루프를 다시 한번 더 실행
                    i--; // 나중에 자동으로 1 증가할 카운트 변수를 먼저 1 감소시켜 동일한 값이 나올 수 있도록
//                          변경해줌, 동일한 번호의 루프를 돌 수 있게 된다.
                    break;
                }//동일한 값이 아니면 배열에 저장한다.
                lotto2[i] = rnd;
            }
//          첫번째 루프의 경우 중복제거 루틴으로 빠지지 않아 데이터 저장되는 부분이 없음.
//            0번 루프때만 동작되는 if문을 실행
            if (i == 0) {
                lotto2[i] = rnd;
            }
        }

        Arrays.sort(lotto2);
//        화면 출력
        for (int i = 0; i < lotto2.length; i++) {
            System.out.print(lotto2[i] + " ");
        }

    }

}




