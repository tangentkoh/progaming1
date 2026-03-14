// 整数値判定無限編

import java.util.Scanner;

class text4_1 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n = 0;
        int r = 1; // 繰り返し用変数

        do {
            System.out.print("整数値："); // nを入力する
            n = stdIn.nextInt(); // その値をnとおく

            if(n>0){System.out.println("その値は正です。");}
            else if(n<0){System.out.println("その値は負です。");}
            else{System.out.println("その値はゼロです。");}

            System.out.println("もう一度？ 1-yes/0-no");
            r = stdIn.nextInt(); // その値をrとおく
        } while(r==1); // 1ならばループ
    }
}