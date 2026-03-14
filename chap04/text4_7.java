// 読み込んだ個数*と+表示

import java.util.Scanner;

class text4_7 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("何個*と+を表示しますか：");
        int n = stdIn.nextInt(); // その値をnとおく

        int i = 0;
        while (i<n) {
            System.out.print('*');
            i++;
            if(i>=n){break;} // 指定した値に届いたら強制離脱
            System.out.print('+');
            i++;
        }
        System.out.println();
    }
}