package subject;

import java.awt.geom.QuadCurve2D;
import java.sql.SQLOutput;
import java.util.Scanner;

public class QuestionEx {
    public static void main(String[] args) {
////        ch06 실습
////        01
//        Song mySong = new Song("Nessun Dorma");
//        Song yourSong = new Song("공주는 잠 못 이루고");
//        System.out.println("내 노래는 " + mySong.getTitle());
//        System.out.println("너 노래는 " + yourSong.getTitle());
//
//
////        02
        Scanner sc = new Scanner(System.in);
//
//        Phone phone1;
//        Phone phone2;
//
//        System.out.println("이름, 전화번호 입력 >> ");
//        phone1 = new Phone(sc.next(), sc.next());
//        System.out.println("이름, 전화번호 입력 >> ");
//        phone2 = new Phone(sc.next(), sc.next());
//        System.out.println(phone1.getName() + "의 번호 " + phone1.getTel());
//        System.out.println(phone2.getName() + "의 번호 " + phone2.getTel());
//
//
////        03
////        1. rect 클래스 배열 생성
////        2. 반복문 for문으로  4번의 입력 받기
////        3. 반복문으로 넓이의 전체 합 출력
//        Rect rectArray[] = new Rect[4];
//
//        for (int i = 0; i < rectArray.length; i++) {
//            System.out.println((i + 1) + "너비, 높이 >>  ");
//            int width = sc.nextInt();
//            int height = sc.nextInt();
//            rectArray[i] = new Rect(width, height); // width, height
//        }
//        System.out.println(" 저장 완료 ");
//        int total = 0;
//        for (int i = 0; i < rectArray.length; i++) {
//            total += rectArray[i].getArea();
//
//        }
//        System.out.println("전체 합은 " + total);


//        04
//        1. 사용자 입력을 통해서 전화번호를 저장할 배열 크기를 입력받음
//        2. 지정한 크기만큼 사용자 정보 입력 받기
//        3. 사용자가 입력한 사용자 이름이 있는지 반복문을 통해 배열 안의 내용과 비교.
//        4. 있을 시 정보 출력, 없을 시 정보가 없음을 출력
//        5. exit 입력받았을 경우 프로그램을 종료

        System.out.println();
        System.out.print("인원수 >> ");
        int size = sc.nextInt();

        Phone2 phoneBook[] = new Phone2[size];

        for (int i = 0; i < phoneBook.length; i++) {
            System.out.print("이름과 전화번호(번호는 연속적으로 입력) >> ");

            phoneBook[i] = new Phone2(sc.next(), sc.next());
        }
        System.out.println("저장되었습니다.");

        while (true) {
            System.out.print("검색할 이름 >> ");
            String searchName = sc.next();
            int index = -1;

//            입력된 문자열이 exit와 같으면 프로그램 종료
            if (searchName.equals("exit")) {
                System.out.println("시스템을 종료합니다. "
                );
                break;
            }

            for (int i = 0; i < phoneBook.length; i++) {
//                검색어로 입력한 이름과 전화번호부에 저장된 이름이 같은지 확인

                if (searchName.equals(phoneBook[i].getName())) {
                    index = i; // 해당 index번호를 변수 index에 저장
                    break;
                }
            }
//          검색어로 검색한 결과 확인
            if (index > -1) {
//                저장된 index 번호 기반으로 전화번호부의 정보 출력
                System.out.println(phoneBook[index].getName() + "의 번호 " + phoneBook[index].getTel());
            } else {
//                없는 경우 없다 출력
                System.out.println(searchName + " 이 없습니다.");
            }
        }

        //=========================================================================================================


//      Q1.사칙연산을 할 수 있는 클래스 Calculator 생성하고 정수를 2개 입력받아 계산하는 프로그램을 작성
//        member 변수 : int num1,num2, result
//        member method : sum sub multi div
//        모든 결과는 int type, method 4 형태중 아무거나





//        Q2. 1~45까지 random 함수 사용해 숫자 6개 생성, 결과 출력하는 프로그램 작성
//        배열 사용해 랜덤 생성된 데이터 저장  (중복되게 작성)

//        Q3. 문제 2 반복 실행시 배열에 저장되는 중복 숫자 발생. 그 중복숫자 제외 후 6개 숫자 저장,
//        출력하는 프로그램 작성 (중복제외)



    }
}
