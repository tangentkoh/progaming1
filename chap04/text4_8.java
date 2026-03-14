// 桁数表示

import java.util.Scanner;

class text4_8 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int x = 0;
        do{
            System.out.print("整数値："); // xを入力する
            x = stdIn.nextInt(); // その値をxとおく
        } while (x<=0);

        int ans = 0;
        for (int i=0; i<16; i++) { // intの限界
            ans++;
            x = x/10;
            if(x<1){break;}
        }
        System.out.println("その値は"+ans+"桁です。"); // 答えを表示する
    }
}