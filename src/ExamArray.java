import java.util.Arrays;

public class ExamArray {
    public static void main(String[] args) {
        int[] nums = new int[3];
        nums[0] = 10000;
        nums[1] = 99;
        nums[2] = 77;
        System.out.println(nums.length);

        for (int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }
        for (int num : nums) {
            System.out.println(num);
        }

        String[] users = new String[100];

        for (int i = 0; i < users.length; i++){
            users[i] = "홍길동" + i;
        }

        for (String user : users) {
            System.out.println(user);
        }
    }// main
}// class
