// 整数値の中央値を表示

import java.util.Scanner;

class text3_13 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数A："); // 整数値Aを入力する
        int a = stdIn.nextInt(); // その値をaとおく
        System.out.print("整数B："); // 整数値Bを入力する
        int b = stdIn.nextInt(); // その値をbとおく
        System.out.print("整数C："); // 整数値Cを入力する
        int c = stdIn.nextInt(); // その値をcとおく

        if (a <= b && a >= c) {System.out.println(a);}
        else if (a >= b && a <= c) {System.out.println(a);}
        else if (b <= a && b >= c) {System.out.println(b);}
        else if (b >= a && b <= c) {System.out.println(b);}
        else if (c <= a && c <= b) {System.out.println(c);}
        else if (c >= a && c >= b) {System.out.println(c);}
        // 6通りしか無いため総当りで良い
    }
}