// カウントダウンadit

import java.util.Scanner;

class text4_4 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("カウントダウンしマす。");
        int x = 0;
        do{
            System.out.print("正の整数値："); // xを入力する
            x = stdIn.nextInt(); // その値をxとおく
        } while (x<=0);

        while (x>=0) {
            System.out.println(x);
            x--;
        }
        System.out.println("イマのxは"+x+"デす。"); // xを表示する
    }
}