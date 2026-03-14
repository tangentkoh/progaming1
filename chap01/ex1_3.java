// 三角形などの面積を表示

import java.util.Scanner;

class ex1_3 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("三角形の面積を求めます。");

        System.out.print("底辺："); // 底辺の長さを入力する
        double x = stdIn.nextDouble(); // その値をxとおく
        System.out.print("高さ："); // 高さも入力する
        double y = stdIn.nextDouble(); // その値をyとおく

        System.out.println("三角形の面積は" + (x * y) / 2 + "です。");

        System.out.println("四角形の面積を求めます。");

        System.out.print("底辺："); // 底辺の長さを入力する
        double x2 = stdIn.nextDouble(); // その値をx2とおく
        System.out.print("高さ："); // 高さも入力する
        double y2 = stdIn.nextDouble(); // その値をy2とおく

        System.out.println("四角形の面積は" + (x2 * y2) + "です。");

        System.out.println("台形の面積を求めます。");

        System.out.print("下辺："); // 下辺の長さを入力する
        double x3 = stdIn.nextDouble(); // その値をx3とおく
        System.out.print("上辺："); // 上辺の長さを入力する
        double x4 = stdIn.nextDouble(); // その値をx4とおく
        System.out.print("高さ："); // 高さも入力する
        double y3 = stdIn.nextDouble(); // その値をy3とおく

        System.out.println("台形の面積は" + ((x3 + x4) * y3) / 2 + "です。");

        System.out.println("円の面積を求めます。(円周率は3.14)");

        System.out.print("半径："); // 半径の長さを入力する
        double r = stdIn.nextDouble(); // その値をrとおく

        System.out.println("円の面積は" + (r * r * 3.14) + "です。");
    }
}