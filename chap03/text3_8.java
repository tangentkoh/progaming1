// 成績判定コード
import java.util.Scanner;

class text3_8 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("点数(整数)："); // 正の整数値を入力する
        int a = stdIn.nextInt(); // その値をaとおく

        if (0 <= a && a <= 59) {System.out.println("不可");}
        else if (60 <= a && a <= 69) {System.out.println("可");}
        else if (70 <= a && a <= 79) {System.out.println("良");}
        else if (80 <= a && a <= 100) {System.out.println("優");} // 結果
        else {System.out.println("無効な入力です。");} // エラー文
    }
}