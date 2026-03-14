// 和表示2

import java.util.Scanner;

class text4_14 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

            System.out.print("nの値："); // nを入力する
            int n = stdIn.nextInt(); // その値をnとおく

        int ans = 0;
        for (int i=1; i<=n; i++) {
            ans += i;
        }

        for (int i=1; i<n; i++) {
            System.out.print(i+" + ");
        }
        System.out.print(n+" = "+ans); // 回答
        System.out.println();
    }
}