// n段のピラミッド2

import java.util.Scanner;

class text4_23 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n = 0;

        do {
            System.out.print("自然数："); // nを入力する
            n = stdIn.nextInt(); // その値をnとおく
        } while (n<1); // 特定範囲を入力させる

        System.out.println(n+"段のピラミッド");
        for (int i=1; i<=n; i++) { 
            for (int k=1; k<=n-i; k++) {
                System.out.print(" ");
            }
            for (int j=1; j<=(i-1)*2+1; j++) {
                System.out.print(i%10); // number
            }
            for (int l=1; l<=n-i; l++) {
                System.out.print(" ");
            }
            System.out.println();
        } 
    }
}