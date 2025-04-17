public class ExamSwitch {
    public static void main(String[] args) {
        int i = 1;
        char c = 'A';
        switch (c) {
            case 1:
                System.out.println("i is 1");
                break;
            case 2:
                System.out.println("i is 2");
                break;
            case 65:
                System.out.println("A");
                break;
            default:
                System.out.println("i is not in [1,2]");
        }

        i = 0;
        int answer = switch (i) {
            case 1 -> 1;
            case 2 -> 2;
            default -> {
                System.out.println("i is not in [1,2]");
                yield 0;
            }
        };
        System.out.println(answer);
    }// main end
}// ExamSwitch end
