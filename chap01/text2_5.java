// 二つの実数の合計と平均を表示

import java.util.Scanner;

class text2_5 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("xの値："); // 実数値を入力する
        double x = stdIn.nextDouble(); // その値をxとおく
        System.out.print("yの値：");
        double y = stdIn.nextDouble(); // その値をyとおく

        System.out.println("合計は" + (x + y) + "です。"); // 合計
        System.out.println("平均は" + (x + y) / 2 + "です。"); // 平均
    }
}