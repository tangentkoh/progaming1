// 正の整数の5判定
import java.util.Scanner;

class text3_5 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("正の整数値："); // 正の整数値を入力する
        int a = stdIn.nextInt(); // その値をaとおく

        if (a <= 0) {System.out.println("正でない値が入力されました。");} // エラー文
        else if (a % 5 == 0) {System.out.println("その値は5で割り切れます。");} // ok
        else {System.out.println("その値は5で割り切れません。");} // ng
    }
}