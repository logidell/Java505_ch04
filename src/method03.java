import com.sun.source.util.JavacTask;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class method03 {
    private static Scanner scanner = new Scanner(System.in);

    public static int input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("출력할 구구단 단 수를 입력하세요");
        int gugudan = scanner.nextInt();
        return gugudan;
    }


    public static void output(int gugudan) {
        for (int i = 1; i < 10; i++) {
            System.out.println(gugudan + " * " + i + " = " + gugudan * i);

        }
    }

    public static int inputScore() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("점수를 입력해 주세요");
        int score = scanner.nextInt();
        return score;

    }

    public static String calLevel(int score) {
        String level = "F";

        if (score >= 90) {
            level = "A";
        } else if (score >= 80) {
            level = "B";
        } else if (score >= 70) {
            level = "C";
        } else if (score >= 60) {
            level = "D";
        }

        return level;
    }

    public static void outputResult(int score, String level) {
        System.out.println(" your score is " + score + ", your grade is " + level);
    }


//    public static String scores(int avg) {
//
//
//        if (avg >= 90) {
//            level = "A";
//        } else if (avg >= 80) {
//            level = "B";
//        } else if (avg >= 70) {
//            level = "C";
//        } else if (avg >= 60) {
//            level = "D";
//        }
//        System.out.println(" your score is "+avg+", your grade is " +level);
//        return level;
//    }

    public static double average(int total) {
        return (double) total / 3;
    }


    public static int scoreInput(String corse) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("점수를 입력해주세요 : "); // 데이터 입력
        int score = scanner.nextInt();
        return score;
//국영수 중복코드 제거 후 함수로 3번을 실행한다.
    }

    public static int totalCal(int kor, int eng, int math) {
        return kor + eng + math; // 총점계산

    }

    public static double avgCal(int total) {
        return (double) total / 3; //강제 형변환 /  실수/3으로 나눌 시 실수형으로 나오게 됨. // 평균계산
    }

    public static String level1Cal(double avg) {
        String level1 = "F";
        if (avg >= 90) { //등급계산
            level1 = "A";
        } else if (avg >= 80) {
            level1 = "B";
        } else if (avg >= 70) {
            level1 = "C";
        } else if (avg >= 60) {
            level1 = "D";
        }
        return level1;
    }

        public static void pResult (int total, double avg, String level1) {
            System.out.println("당신의 총점은 " + total + "점이고, 평균은 " + avg + "점이며, 등급은 " + level1 + "입니다.");
            //결과 출력
        }




    public static void main(String[] args) {
        int gugudan = input();
        System.out.println(gugudan);
        output(gugudan);

        int score = inputScore();
        String level = calLevel(score);
        outputResult(score, level);


        Scanner scanner = new Scanner(System.in); //데이터 저장
        int kor = 0;
        int eng = 0;
        int math = 0;
        int total = 0;
        double avg = 0.0; // 소수점이 들어가야 함
        String level1 = "F";

        kor = scoreInput("국어");
        eng = scoreInput("영어");
        math = scoreInput("수학");

        totalCal(kor, eng, math);
        System.out.println("총합: " + total);

        avg = avgCal(total);
        System.out.println("평균"+avg);

        level1 = level1Cal(avg);
        System.out.println("등급 : " + level1);

        pResult(total,avg,level1);




//        System.out.println("\n----- 3번 문제 -----\n");
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
//        level = scores((int) avg);
//
//        System.out.println("당신의 총점은 " + total + "점이고, 평균은 " + avg + "점이며, 등급은 " + level + "입니다.");
//    }


    }
}