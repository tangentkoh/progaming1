// 整数値のmaxminを表示

import java.util.Scanner;

class text3_14 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数a："); // 整数値aを入力する
        int a = stdIn.nextInt(); // その値をaとおく
        System.out.print("整数b："); // 整数値bを入力する
        int b = stdIn.nextInt(); // その値をbとおく

        int min = 0, max = 0;

        if (a != b){
            if (a > b) {
                min = b;
                max = a;
            }
            else if (a < b) {
                min = a;
                max = b;
            }

            System.out.println("小さいほうの値は" + min + "です。");
            System.out.println("大きいほうの値は" + max + "です。"); // 結果
        }
        else {System.out.println("二つの値は同じです。");} // 同値
    }
}