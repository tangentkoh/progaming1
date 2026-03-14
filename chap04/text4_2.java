// 数当てげえむ

import java.util.Scanner;
import java.util.Random;

class text4_2 { // 二部探索ってこんな感じ

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        Random rand = new Random();

        int n = rand.nextInt(90)+10; // 0-89に10を足す

        System.out.println("数当てゲーム、");
        System.out.println("二桁の整数値(10-99)を当てよ。");

        int x=0;
        do {
            System.out.print("答えは？："); // xを入力する
            x = stdIn.nextInt(); // その値をxとおく

            if(x>n){System.out.println("その値は大き過ぎる。");}
            else if(x<n){System.out.println("その値は小さ過ぎる。");}
        } while(x!=n); // 違うならループ
        System.out.println("正解だ。");
    }
}