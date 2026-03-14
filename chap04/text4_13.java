// 和表示

import java.util.Scanner;

class text4_13 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

            System.out.print("nの値："); // nを入力する
            int n = stdIn.nextInt(); // その値をnとおく

        int ans = 0;
        for (int i=1; i<=n; i++) {
            ans += i;
        }
        System.out.println("1から"+n+"までの和は"+ans+"です。"); // 答え
    }
}