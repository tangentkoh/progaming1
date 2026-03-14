// 整数値の差を表示

import java.util.Scanner;

class text3_10 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数A："); // 整数値Aを入力する
        int a = stdIn.nextInt(); // その値をaとおく
        System.out.print("整数B："); // 整数値Bを入力する
        int b = stdIn.nextInt(); // その値をbとおく

        if (a > b) {System.out.println(a - b);}
        else if (a < b) {System.out.println(b - a);} // 結果
        else {System.out.println(0);} // 例外
    }
}