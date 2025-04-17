import java.util.Scanner;

public class VendingMachine {

    public static void main(String[] args) {
//        자판기 만들기
//        사용자에게 1.커피 / 2.콜라 / 3.사이다 / 4.금액투입 / 0.프로그램 종료
//        등의 메뉴를 만들고 제품을 구입하면 잔액과 수량이 줄어든다.
//        금액과 수량이 충분하다면 제품이 나오며 잔액 혹은 수량이 맞지 않다면 제품이 나오지 않는다.
        Scanner scanner = new Scanner(System.in);

        String[] product_name = {"커피", "콜라", "사이다"}; // 제품명
        int[] product_amount = {3,5,4}; // 제품 재고
        int[] product_price = {100,200,200}; // 제품 가격
        int money = 0; // 잔액
        int user_input = 0; // 유저 input 처리
        boolean exit = false; // 종료 flag

        while(!exit) {
            System.out.printf("\n메뉴를 선택해주세요\t잔액 : %d\n", money);
            System.out.printf("1.커피 (%d원) [%d개]\t\t2.콜라 (%d원) [%d개]\t\t3.사이다 (%d원) [%d개]\n",product_price[0], product_amount[0], product_price[1], product_amount[1], product_price[2], product_amount[2]);
            System.out.println("4.금액투입\t\t\t\t5.잔액반환\t\t\t\t0.프로그램 종료");

            if (scanner.hasNextInt()){
                user_input = scanner.nextInt();
                switch (user_input) {

                    case 1,2,3 -> {// 제품 선택
                        if (product_amount[user_input - 1] <= 0) {
                            System.out.println("재고가 부족합니다");
                            break;
                        }// if end
                        if (money < product_price[user_input - 1]) {
                            System.out.println("잔액이 부족합니다");
                            break;
                        }// if end
                        money -= product_price[user_input - 1];
                        product_amount[user_input - 1]--;
                        System.out.printf("%s가 제공됩니다\n", product_name[user_input - 1]);
                    }// case 1,2,3 end

                    case 4 -> {// 금액 투입
                        System.out.printf("현재 잔액은 %d원입니다\n추가할 금액(원)을 입력해주세요 : ", money);
                        if (scanner.hasNextInt()){
                            user_input = scanner.nextInt();
                            if (user_input < 0){
                                System.out.println("유효하지 않은 값입니다");
                                break;
                            }// if end
                        } else {
                            System.out.println("유효하지 않은 값입니다");
                            scanner.next();
                            break;
                        }
                        money += user_input;
                    }// case 4 end

                    case 5 -> {// 잔액반환
                        System.out.printf("잔액 %d원이 반환됩니다\n", money);
                        money = 0;
                    }// case 5 end

                    case 0 -> {// 종료
                        exit = true;
                    }// case 0 end

                    default -> {// 예외
                        System.out.println("잘못된 입력값입니다");
                    }// default end
                }// switch end
            } else {
                System.out.println("잘못된 입력값입니다");
                scanner.next();
            } // if else end
        }// while end
    }// main end
}// class end
