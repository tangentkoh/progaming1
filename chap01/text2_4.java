// キーボードからの整数値に加減算したものをを表示する

import java.util.Scanner;

class text2_4 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数値："); // 整数値を入力する
        int a = stdIn.nextInt(); // その値をaとおく

        System.out.println("10を加えた値は" + (a + 10) + "です。"); // 加算
        System.out.println("10を減じた値は" + (a - 10) + "です。"); // 減算
    }
}