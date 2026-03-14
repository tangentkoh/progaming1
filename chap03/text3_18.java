// 季節折々
import java.util.Scanner;

class text3_18 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("月を入力(整数)："); // 正の整数値を入力する
        int m = stdIn.nextInt(); // その値をmとおく

        if (m >= 3 && m <= 5) {System.out.println("春ですよー");}
        else if (m >= 6 && m <= 8) {System.out.println("夏です");}
        else if (m >= 9 && m <= 11) {System.out.println("秋です");}
        else if (m == 12 || m == 1 || m == 2) {System.out.println("冬です");}
        else {System.out.println("無効な入力ですよー");} // エラー文
    }
}