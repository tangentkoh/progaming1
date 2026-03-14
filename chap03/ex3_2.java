// 季節折々 hori kohsuke
import java.util.Scanner;

class ex3_2 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("西暦を入力(整数)："); // 正の整数値を入力する
        int m = stdIn.nextInt(); // その値をmとおく

        int t = 0; // 正誤判定用変数

        if (m % 4 == 0) {
            t = 1;
            if (m % 100 == 0) {
                t = 0;
                if (m % 400 == 0) {
                    t = 1;
                }
            }
        }

        if (m <= 0) {System.out.println("無効な入力です。");} // エラー文
        else if (t == 1) {System.out.println("閏年です。");}
        else if (t == 0) {System.out.println("閏年じゃないです。");} // 結果
    }
}