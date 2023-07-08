package seven_boom;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("""
                Welcome to 7BOOM!\s
                If the following number is divisible evenly by 7 enter BOOM
                Likewise if '7' is one of the digits in the number enter BOOM
                Otherwise enter the following number as it is
                
                """);
        Scanner console = new Scanner(System.in);
        int cur_num = 0;
        while (true) {
            cur_num++;
            String ans = "0";
            if ((cur_num) % 7 == 0) {
                ans = "BOOM";
            } else if ((Integer.toString(cur_num)).contains("7")) {
                ans = "BOOM";
            } else {
                ans = Integer.toString(cur_num);
            }
            System.out.printf("%s\n", ans);
            //Computer answer above

            String usr_ans = console.nextLine();
            if ((cur_num + 1) % 7 == 0) {
                ans = "BOOM";
            } else if ((Integer.toString(cur_num + 1)).contains("7")) {
                ans = "BOOM";
            } else {
                ans = Integer.toString(cur_num + 1);
            }
            if (!usr_ans.equals(ans)) {
                System.out.printf("You Lose! Correct Answer Was: %s\n", ans);
                break;
            }
            // User answer above
            cur_num++;
        }
    }
}

