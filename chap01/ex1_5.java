// 時間表示システム hori kousuke

import java.util.Scanner;

class ex1_5 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数値で秒数を入力："); // 整数値を入力する
        int a = stdIn.nextInt(); // その値をaとおく

        int h = a / 3600;
        int m = (a % 3600) / 60;
        int s = (a % 3600) % 60; // 時間の計算

        System.out.println(h + "時間" + m + "分" + s + "秒"); // 表示
    }
}