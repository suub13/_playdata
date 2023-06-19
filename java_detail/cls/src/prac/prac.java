package prac;
import java.util.Scanner;
public class prac {
    public static void main(String[] args) {
        int[][] array = {
                {95,86},
                {83,92,96},
                {78,83,93,87,88}
        };
        int sum = 0;
        double avg = 0.0;
        int count = 0;

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                sum += array[i][j];
                count++;
            }
        }
        avg = (double) sum / count;

        System.out.println("sum: "+sum);
        System.out.println("avg: "+avg);

//
//        for (int i =0; i < array.length; i++){
//            if(max < array[i]){
//                max = array[i];
//            }
//        }
//        System.out.println("max: "+max);


        boolean run = true;
        int studentNum = 0;
        int[]scores = null;
        Scanner scanner = new Scanner(System.in);

        while(run){
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
            System.out.println("----------------------------------------------------------------------------");
            System.out.print("선택> ");

            int selectNo = Integer.parseInt(scanner.nextLine());
            if (selectNo == 1) {
                System.out.print("학생수> ");
                studentNum = Integer.parseInt(scanner.nextLine());
                scores = new int[studentNum];
            } else if (selectNo == 2) {
                for (int i = 0; i < studentNum; i++){
                    System.out.print("scores["+i+"]> ");
                    scores[i] = Integer.parseInt(scanner.nextLine());
                }
            } else if (selectNo == 3) {
                for (int i = 0; i < studentNum; i++){
                    System.out.println("scores["+i+"]> "+scores[i]);
                }
            } else if (selectNo == 4) {
                int max = 0;
                int total = 0;
                double mean;
                for (int i = 0; i < studentNum; i++){
                    total += scores[i];
                    if(max < scores[i]){
                        max = scores[i];
                    }
                }
                mean = (double)total/studentNum;
                System.out.println("최고 점수: "+max);
                System.out.println("평균 점수: "+mean);
            } else if (selectNo == 5) {
                run = false;
            }
            continue;
        }
        System.out.println("프로그램 종료");

    }
}
