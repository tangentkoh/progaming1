// n段の直角三角形

import java.util.Scanner;

class text4_21 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n = 0;

        do {
            System.out.print("直角三角形の段数："); // nを入力する
            n = stdIn.nextInt(); // その値をnとおく
        } while (n<1); // 特定範囲を入力させる

        System.out.println("左上"); // 左上ver
        for (int i=n; i>0; i--) { 
            for (int j=1; j<=i; j++) {
                System.out.print('*');
            }
            System.out.println();
        } 
        System.out.println("右下"); // 右下ver
        for (int i=0; i<n; i++) { 
            for (int j=0; j+1<n-i; j++) { // 空白を出力
                System.out.print(" ");
            }
            for (int k=0; k-1<i; k++) {
                System.out.print('*');
            }
            System.out.println();
        } 
        System.out.println("右上"); // 右上ver
        for (int i=0; i<n; i++) { 
            for (int j=0; j<i; j++) {
                System.out.print(" ");
            }
            for (int k=0; k<n-i; k++) {
                System.out.print('*');
            }
            System.out.println();
        } 
    }
}