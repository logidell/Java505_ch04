import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class method04_ch305Q {
//    Q5. p.126 ,정수 10개를 입력받아 배열에 저장하고 증가 순으로 정렬해 출력


    public static int[] input() {
        Scanner scan = new Scanner(System.in);
        int array[] = new int[10];

        System.out.println("정수 10개의 입력이 필요합니다. ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }

        return array;
    }

    public static void output(int array[]) {
        Arrays.sort(array); // 정렬구문
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }


    public static void main(String[] args) {
//        int array[] = new int[10];
        int array[];
        array = input();
        System.out.println();

        Arrays.sort(array);

        output(array);

// 버블정렬 (배열을 전체 한번 비교한 뒤 전부 돌고 나면 처음부터 비교해 재정렬한다. )
//        이 코드는 알고리즘/자료구조 를 기반으로 돌아가는 코드이다.
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }

            }

        }
    }

}

//
//        int array[] = new int[10];
//        System.out.println("정수 10개의 입력이 필요합니다. ");
//        for (int i = 0; i < array.length; i++) {
//            array[i] = scan.nextInt();
//            System.out.println(array[i] + "");
//        }
//        Arrays.sort(array); // 정렬구문
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + "\t");
//
//        }
//        System.out.println();
//    }






