// 読み込み整数加算2

import java.util.Scanner;

class text4_25_2 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("整数を加算します。");
        System.out.print("何個加算しますか："); // nを入力する
        int n = stdIn.nextInt(); // 個数

        int s = 0;
        for(int i=0;i<n;i++){
            System.out.print("整数："); // tを入力する
            int t = stdIn.nextInt();
            if(s+t>1000){
                System.out.println("合計が1000を超えました。");
                System.out.println("最後の数値は無視します。");
                break;
            }
            s += t;
        }
        System.out.println("合計は"+s+"です。");
        System.out.println("平均は"+s/n+"です。");
    }
}