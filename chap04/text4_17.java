// 読み込んだ整数の約数表示

import java.util.Scanner;

class text4_17 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数値：");
        int n = stdIn.nextInt(); // その値をnとおく

        int co = 0;
        for (int i = 1;  i <= n; i++) {
            if(n%i==0){
                System.out.println(i);
                co++; // カウントする
            }
        }
        System.out.println("約数は"+co+"個です。"); // 表示
    }
}