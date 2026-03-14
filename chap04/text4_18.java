// 二乗表示

import java.util.Scanner;

class text4_18 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("nの値："); // nを入力する
        int n = stdIn.nextInt(); // その値をnとおく
        
        for (int i=1; i<=n; i++) {
            System.out.println(i+"の二乗は"+i*i); // 表示する
        }
    }
}