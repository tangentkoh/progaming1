// カウントダウン2

import java.util.Scanner;

class text4_11 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("カウントダウンしマす。");
        
        System.out.print("正の整数値："); // xを入力する
        int x = stdIn.nextInt(); // その値をxとおく

        for (int i = x;  i >= 0; i--) {
            System.out.println(i);
        }
    }
}