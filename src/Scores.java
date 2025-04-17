import java.util.Scanner;

public class Scores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("학생 수를 입력해주세요 : ");
        int num = scanner.nextInt();

        String[] name = new String[num];
        int[] kor = new int[num];
        int[] eng = new int[num];
        int[] math = new int[num];
        double[] sum = new double[num];
        double[] avg = new double[num];

        for (int i = 0; i < num; i++){
            System.out.printf("학생 %d의 이름, 국어, 영어, 수학 성적을 입력해주세요 : ", i + 1);
            name[i] = scanner.next();
            kor[i] = scanner.nextInt();
            eng[i] = scanner.nextInt();
            math[i] = scanner.nextInt();
            sum[i] = kor[i] + eng[i] + math[i];
            avg[i] = sum[i] / 3.0;
        }

        for (int i = 0; i < num; i++){
            System.out.printf("%s 학생의 성적\t국어 %d점\t영어 %d점\t수학 %d점\t합계 %.0f점\t평균 %.1f점\n", name[i], kor[i], eng[i], math[i], sum[i], avg[i]);
        }
    }// main
}// class
