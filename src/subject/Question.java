package subject;

import java.util.Random;
import java.util.Scanner;

public class Question {
    private static Scanner scanner;

    // 3장 문제 풀이
    public static void main(String[] args) {
//        01.
        Scanner scanner = new Scanner(System.in);
        System.out.print("알파벳 하나를 입력하세요");
        String str = scanner.next();
//        charAt  : 'String 타입 데이터 중 지정한 인덱스 문자를 char 타입으로 변환
        char c = str.charAt(0);
//        char 타입 데이터 a는 아스키코드 문자로 a. 정수로는  97로 표현 (결국 아스키코드로 뺑뺑돈것.
//        문자는 기본이 아스키코드 )
        for (char a = 'a'; a <= c; a++) {
            for (char b = a; b <= c; b++) {
                System.out.print(b);
            }
            System.out.println();
        }


//        02.
//        int quiz2Arr[] = new int[10]; //배열데이터 저장구문
//
//        for (int i = 0; i < quiz2Arr.length; i++) {
//            System.out.println("정수를 입력해 주세요 (현재 " + (i + 1) + " 번 ) : ");
//            quiz2Arr[i] = scanner.nextInt();
//        }
//        for (int i = 0; i < quiz2Arr.length; i++) {
//            if (quiz2Arr[i] % 3 == 0) {
//                System.out.print(quiz2Arr[i] + " ");
//            }
//        }

//        03.
//      1. eng 배열을 전체 검색하여 사용자가 입력한 단어가 있는지 확인
//      2. 있을 경우 해당 인덱스 번호 확인 후 검색 중지
//      3. kor 배열의 인덱스 번호에 있는 단어 출력
//      4. 입력된 단어가 exit 시 프로그램 종료

//
//        String eng[] = {"student", "love", "java", "happy", "future"};
//        String kor[] = {"학생", "사랑", "자바", "행복한", "미래"};
////        무한반복시에는 와일문을 자주 씀, 특히 밑의 구문
////        무한반복시에는 카운트를 주지 않거나 true 값을 주거나.
//        while (true) {
//            String qize3Str = scanner.next();
//            if (qize3Str.equals("exit")) {
//                System.out.println("종료하겠습니다. ");
//                break;
//            }
//            int index = -1; // 값을 저장할 구문이 필요함. for문에 선언한 int는 빠져나가면 값이 없음.;;
////            -1로 하는 이유는 인덱스 값은 0부터 시작하니 아예 -1로 잡아줘도 좋음
//            for (int i = 0; i < eng.length; i++) {
//                if (qize3Str.equals(eng[i])) {
//                    index = i;
//                    break;
//                }
//            }
//            if (index > -1) {
//                System.out.println(kor[index]);
//            } else {
//                System.out.println("그런 단어가 없습니다. ");
//            }
//
//        }
//for (int i = 0 ; true; i++ ){} 무한 반복이 동작한다. 조건이 없기 때문에. 나갈 수 있는 문을 작성하면 빠져나감.

//        04. open challenge
//      1. pc가 0~99 랜덤숫자를 선택, 사용자가 키보드로 입력해야함
//      2. 사용자가 입력을 통해 얻은 데이터가 높은지 낮은지 판단한다. (if ~ else). 반복실행
//      3. 정답을 맞춘 후 다시 이 게임을 할 것인지 확인해야한다.
        Random r = new Random(); // 랜덤 생성위한 클래스
        int card; //컴퓨터가 랜덤으로 생성한 데이터 저장할 부분
        int low, high; // 카드가 적힌 수의 범위 설정할 변수


//        게임의 시작 부분
        while (true) {
            int i = 1; // 몇 번째 입력인지 확인하기 위한 변수
            low = 0; //게임 시작 시 초기값을 가장 박은 0으로 설정
            high = 99; // 게임 시작시 초기 값을 가장 높은 99로 설정
            card = r.nextInt(100);
            System.out.println("up & down!, 숨겨진 수를 맞춰보세요. 범위는 0~99 까지 입니다. ");
//           사용자 입력 반복 문
            while (true) {
                System.out.println(low + " - " + high);
                System.out.print(i + " >> ");

                int count = scanner.nextInt();
                if (count > high || count < low) {
                    System.out.println("범위를 벗어남");
                } else {
                    if (count == card) {
                        System.out.println("정답");
                        break;
                    } else if (count > card) {
                        System.out.println("더 낮음");
                        high = count;
                    } else {
                        System.out.println(" 더 높게 ");

                    }

                }
                i++;

            }
            System.out.println("다시 하시겠습니까? (y/n) >> ");
            if (scanner.next().equals("n")) {
                break; // 외부 while문 종료

            }
        }


//        05.
        int intArray[][];
        intArray = new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
//                Math.random() *10 = 0.0 1.0 까지 랜덤 숫자출력. 랜덤숫자 발생시키기 위한 수학 클래스 함수
//                *10을 진행해 정수 부분 나올 수 있도록 함.
//                (int) 를 사용해 소수점 뒤 숫자 삭제 후 정수로 강제 형변환
                intArray[i][j] = (int) (Math.random() * 10);
            }
            ;
        }
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                System.out.print(intArray[i][j] + "\t");

            }
            System.out.println();
        }

        int i = 0;
        int sum = 0;
        while (i < 3) {
            for (int j = 0; j < intArray[i].length; j++) {
                sum = sum + intArray[i][j];
            }
            i++;

        }
        System.out.println("합은 : " + sum );
    }
}

