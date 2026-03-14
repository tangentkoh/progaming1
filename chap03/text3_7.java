// 正の整数の3判定
import java.util.Scanner;

class text3_7 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("正の整数値："); // 正の整数値を入力する
        int a = stdIn.nextInt(); // その値をaとおく

        if (a <= 0) {System.out.println("正でない値が入力されました。");} // エラー文
        else if (a % 3 == 0) {System.out.println("その値は3で割り切れます。");}
        else if (a % 3 == 1) {System.out.println("その値を3で割った余りは1です。");}
        else {System.out.println("その値を3で割った余りは2です。");} // 結果
    }
}