// キーボードからの整数値を表示する

import java.util.Scanner;

class text2_3 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数値："); // 整数値を入力する
        int a = stdIn.nextInt(); // その値をaとおく

        System.out.println(a + "と入力しましたね。"); // 結果を表示
    }
}