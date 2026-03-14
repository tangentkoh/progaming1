// キーボードからの整数値の計算結果を表示する

import java.util.Scanner;

class ex1_2 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数値a："); // 整数値aを入力する
        int a = stdIn.nextInt(); // その値をaとおく
        System.out.print("整数値b："); // 整数値bを入力する
        int b = stdIn.nextInt(); // その値をaとおく

        System.out.println("足し算(a+b)の結果は" + (a + b));
        System.out.println("引き算(a-b)の結果は" + (a - b));
        System.out.println("掛け算(a*b)の結果は" + (a * b));
        System.out.println("割り算(a/b)の結果は" + (a / b)); // 結果
    }
}