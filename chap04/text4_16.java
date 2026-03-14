// 読み込んだ個数*表示3

import java.util.Scanner;

class text4_16 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("何個*を表示しますか：");
        int n = stdIn.nextInt(); // その値をnとおく

        if (n>0) {
            for (int i = 1;  i <= n; i++) {
                System.out.print('*');
                if(i%5==0){System.out.println();} // 5で改行
            }
        }
        System.out.println();
    }
}