// 三角形の面積を表示

import java.util.Scanner;

class text2_6 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("三角形の面積を求めます。");

        System.out.print("底辺："); // 底辺の長さを入力する
        double x = stdIn.nextDouble(); // その値をxとおく
        System.out.print("高さ："); // 高さも入力する
        double y = stdIn.nextDouble(); // その値をyとおく

        System.out.println("面積は" + (x * y) / 2 + "です。"); // 結果
    }
}