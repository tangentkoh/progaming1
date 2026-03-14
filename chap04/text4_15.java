// 標準体重

import java.util.Scanner;

class text4_15 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("何cmから："); // nを入力する
        int n = stdIn.nextInt(); // その値をnとおく
        System.out.print("何cmまで："); // uを入力する
        int u = stdIn.nextInt(); // その値をuとおく
        System.out.print("何cmごと："); // mを入力する
        int m = stdIn.nextInt(); // その値をmとおく

        System.out.println("身長 標準体重");
        for (int i=n; i<=u; i+=m) {
            System.out.print(i+" ");
            System.out.println(" "+(i-100)*0.9);
        }
    }
}