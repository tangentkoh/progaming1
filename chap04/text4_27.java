// 数当てげえむ2

import java.util.Scanner;
import java.util.Random;

class text4_27 { // 二部探索ってこんな感じ

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        Random rand = new Random();

        int n = rand.nextInt(100); // 0-99

        System.out.println("数当てゲーム");
        System.out.println("整数値(0-99)を当てよ。");
        System.out.println("チャンスは7回");

        int x=0;
        int c=7;
        do {
            System.out.print("答えは？："); // xを入力する
            x = stdIn.nextInt(); // その値をxとおく

            if(x>n){System.out.println("その値は大き過ぎる。");}
            else if(x<n){System.out.println("その値は小さ過ぎる。");}
            else{break;}
            c--;
            if(c<=0){break;}
        } while(x!=n); // 違うならループ
        if(c>0){System.out.println("正解だ。");}
        else{System.out.println("失敗だ。答えは"+n);}
    }
}