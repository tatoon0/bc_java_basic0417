import java.util.Scanner;

public class ExamA {
    public static void main(String[] args) {
//        int i = 1;
//        if (i == 1) {
//            System.out.println("i is 1");
//        } else if (i == 2){
//            System.out.println("i is 2");
//        } else {
//            System.out.println("i is not in [1,2]");
//        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("다음 문제를 보고 푸시오");
        double score = 0;
        double question = 2;

        System.out.print("2 + 3 = ");
        int answer = scanner.nextInt();

        if (answer == 2+3){
            System.out.println("정답입니다");
            score++;
        } else {
            System.out.println("오답입니다");
        }

        System.out.print("3 X 3 = ");
        answer = scanner.nextInt();

        if (answer == 3*3){
            System.out.println("정답입니다");
            score++;
        } else {
            System.out.println("오답입니다");
        }

        System.out.printf("점수 : %.1f", score/question * 100);
    }// main end
}// ExamA end
