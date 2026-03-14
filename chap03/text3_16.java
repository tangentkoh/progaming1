// 昇順ソートトリプル

import java.util.Scanner;

class text3_16 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数a："); // 整数値aを入力する
        int a = stdIn.nextInt(); // その値をaとおく
        System.out.print("整数b："); // 整数値bを入力する
        int b = stdIn.nextInt(); // その値をbとおく
        System.out.print("整数c："); // 整数値cを入力する
        int c = stdIn.nextInt(); // その値をcとおく

        int n = a;
        int o = b;
        int p = c;

        if (a > b && b > c) {a = p; b = o; c = n;}
        else if(a > c && c > b) {a = o; b = p; c = n;}
        else if(b > a && a > c) {a = p; b = n; c = o;}
        else if(b > c && c > a) {a = n; b = p; c = o;}
        else if(c > a && a > b) {a = o; b = n; c = p;}
        else if(c > b && b > a) {a = n; b = o; c = p;} // ソートする

        System.out.println("a≦ b≦ cとなるようにソートしました。");
        System.out.println("変数aは" + a + "です。");
        System.out.println("変数bは" + b + "です。");
        System.out.println("変数cは" + c + "です。"); // 結果
    }
}