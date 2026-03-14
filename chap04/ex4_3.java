// 3-27の自然数計算システム

import java.util.Scanner;

class ex4_3 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n = 0;

        do {
            System.out.print("3から27の整数："); // nを入力する
            n = stdIn.nextInt(); // その値をnとおく
        } while (n <= 2 || n >= 28); // 特定範囲を入力させる

        System.out.println("i j kを列挙します");
        for (int i=1; i<10; i++) { // 今回はijkをそのまま利用
            for (int j=1; j<10; j++) {
                for (int k=1; k<10; k++) {
                    if (i+j+k==n) {
                        System.out.println(i+" "+j+" "+k);
                    }
                }
            }
        } // 所詮9*3通りなので十分高速
    }
}