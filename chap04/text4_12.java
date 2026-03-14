// カウントup

import java.util.Scanner;

class text4_12 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("カウントアップします。");
        
        System.out.print("正の整数値："); // xを入力する
        int x = stdIn.nextInt(); // その値をxとおく

        for (int i = 0;  i <= x; i++) { // 0から
            System.out.println(i);
        }
    }
}