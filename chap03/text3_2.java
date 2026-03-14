// 約数を判定する

import java.util.Scanner;

class text3_2 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数A："); // 整数値Aを入力する
        int a = stdIn.nextInt(); // その値をaとおく
        System.out.print("整数B："); // 整数値Bを入力する
        int b = stdIn.nextInt(); // その値をbとおく

        if (a % b == 0) {System.out.println("BはAの約数です。");} // 余0なら正
        else {System.out.println("BはAの約数ではありません。");} // 違うなら偽
    }
}