// 実数値の大きさ表示

import java.util.Scanner;

class text3_9 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("実数値a："); // 実数値aを入力する
        double a = stdIn.nextDouble(); // その値をaとおく
        System.out.print("実数値b："); // 実数値bを入力する
        double b = stdIn.nextDouble(); // その値をaとおく

        if (a > b) {System.out.println(a);}
        else if (a < b) {System.out.println(b);} // 結果
        else {System.out.println(a + "で同値です。");} // 例外
    }
}