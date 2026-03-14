// 降順ソート

import java.util.Scanner;

class text3_15 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数a："); // 整数値aを入力する
        int a = stdIn.nextInt(); // その値をaとおく
        System.out.print("整数b："); // 整数値bを入力する
        int b = stdIn.nextInt(); // その値をbとおく

        if (a < b) {
            int n = a;
            a = b;
            b = n; // 値のチェンジ
        }

        System.out.println("a≧ bとなるようにソートしました。");
        System.out.println("変数aは" + a + "です。");
        System.out.println("変数bは" + b + "です。"); // 結果
    }
}