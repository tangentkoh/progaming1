// n段の正方形

import java.util.Scanner;

class text4_20 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n = 0;

        do {
            System.out.print("自然数："); // nを入力する
            n = stdIn.nextInt(); // その値をnとおく
        } while (n<1); // 特定範囲を入力させる

        System.out.println(n+"段の正方形");
        for (int i=0; i<n; i++) { 
            for (int j=0; j<n; j++) {
                System.out.print('*');
            }
            System.out.println();
        } 
    }
}