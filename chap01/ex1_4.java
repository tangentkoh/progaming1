// キーボードからの実数値の計算結果を表示する

import java.util.Scanner;

class ex1_4 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("実数値a："); // 実数値aを入力する
        double a = stdIn.nextDouble(); // その値をaとおく
        System.out.print("実数値b："); // 実数値bを入力する
        double b = stdIn.nextDouble(); // その値をbとおく

        double p = ((double)Math.round((a + b) * 1000000))/1000000;
        double q = ((double)Math.round((a - b) * 1000000))/1000000;
        double r = ((double)Math.round((a * b) * 1000000))/1000000;
        double s = ((double)Math.round((a / b) * 1000000))/1000000;
        // 計算と小数点調整(6桁)

        System.out.println("足し算(a+b)の結果は" + p);
        System.out.println("引き算(a-b)の結果は" + q);
        System.out.println("掛け算(a*b)の結果は" + r);
        System.out.println("割り算(a/b)の結果は" + s); // 結果
    }
}