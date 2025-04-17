import java.util.Scanner;

public class ExamDice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = (int)(Math.random() * 6 + 1);

        switch (num) {
            case 1 -> System.out.println("1");
            case 2 -> System.out.println("2");
            case 3 -> System.out.println("3");
            case 4 -> System.out.println("4");
            case 5 -> System.out.println("5");
            default -> System.out.println("6");
        }

        System.out.print("숫자를 하나 선택해주세요 (1~6) : ");
        int user_num = scanner.nextInt();

        System.out.printf("정답 번호 : %d\n", num);
        if (num == user_num) {
            System.out.println("성공");
        } else {
            System.out.println("실패");
        }
    }// main end
}// ExamDice end