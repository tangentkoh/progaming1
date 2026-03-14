// 素数判定

import java.util.Scanner;

class text4_24 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n = 0;
        int r = 0; // 判定用変数

        do {
            System.out.print("正の整数値："); // nを入力する
            n = stdIn.nextInt(); // その値をnとおく
        } while (n<1); // 特定範囲を入力させる

        for (int i = 2; i < n; i++) {
            if(n%i==0){r = 1;}
        }
        if(n==1){r = 1;}

        if(r==0){System.out.println(n+"は素数である。");}
        else{System.out.println(n+"は素数でない。");}
    }
}