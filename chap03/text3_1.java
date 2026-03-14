// 整数の絶対値を表示する

import java.util.Scanner;

class text3_1 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数値："); // 整数値を入力する
        int a = stdIn.nextInt(); // その値をaとおく

        if (a >= 0) {System.out.println("その絶対値は" + a + "です。");} // 0以上ならそのまま
        else {System.out.println("その絶対値は" + -a + "です。");} // そうでないなら逆転
    }
}