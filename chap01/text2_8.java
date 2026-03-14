// プラマイ五の生成

import java.util.Scanner;
import java.util.Random;

class text2_8 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("整数値："); // 整数値を入力する
        int a = stdIn.nextInt(); // その値をaとおく
        int num = rand.nextInt(11) - 5; // 0から10より5をひく

        System.out.println("その値の±5の乱数を生成しました。");
        System.out.println("それは" + (num + a) + "です。"); // 結果
    }
}