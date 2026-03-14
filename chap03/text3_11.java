// 整数値の差を判定

import java.util.Scanner;

class text3_11 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数A："); // 整数値Aを入力する
        int a = stdIn.nextInt(); // その値をaとおく
        System.out.print("整数B："); // 整数値Bを入力する
        int b = stdIn.nextInt(); // その値をbとおく

        if (a > b) {
            if (a - b <= 10) {System.out.println("それらの差は10以下です。");} // 二重if
            else {System.out.println("それらの差は11以上です。");}
        }
        else if (a < b) {
            if (b - a <= 10) {System.out.println("それらの差は10以下です。");} // 二重if
            else {System.out.println("それらの差は11以上です。");}
        }
        else {System.out.println("それらの差は10以下です。");} // 例外
    }
}