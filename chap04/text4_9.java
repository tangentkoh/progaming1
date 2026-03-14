// 積表示

import java.util.Scanner;

class text4_9 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n = 0;
        do{
            System.out.print("nの値："); // nを入力する
            n = stdIn.nextInt(); // その値をnとおく
        } while (n<=0);

        int ans = 1;
        for (int i=1; i<=n; i++) {
            ans = ans*i;
        }
        System.out.println("1から"+n+"までの積は"+ans+"です。"); // 答え
    }
}