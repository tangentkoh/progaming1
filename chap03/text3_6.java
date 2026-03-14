// 正の整数の10判定
import java.util.Scanner;

class text3_6 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("正の整数値："); // 正の整数値を入力する
        int a = stdIn.nextInt(); // その値をaとおく

        if (a <= 0) {System.out.println("正でない値が入力されました。");} // エラー文
        else if (a % 10 == 0) {System.out.println("その値は10の倍数です。");} // ok
        else {System.out.println("その値は10の倍数ではありません。");} // ng
    }
}