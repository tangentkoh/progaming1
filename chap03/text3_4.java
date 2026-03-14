// 実数値の大小関係を表示する

import java.util.Scanner;

class text3_4 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("実数値a："); // 実数値aを入力する
        double a = stdIn.nextDouble(); // その値をaとおく
        System.out.print("実数値b："); // 実数値bを入力する
        double b = stdIn.nextDouble(); // その値をaとおく

        if (a > b) {System.out.println("aのほうが大きいです。");}
        else if (a < b) {System.out.println("bのほうが大きいです。");}
        else {System.out.println("aとbは同じ値です。");}
    }
}