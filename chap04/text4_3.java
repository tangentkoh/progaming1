// 整数値列挙

import java.util.Scanner;

class text4_3 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int a = 0;
        int b = 0;

        System.out.print("整数値A："); // aを入力する
        a = stdIn.nextInt(); // その値をaとおく
        System.out.print("整数値B："); // bを入力する
        b = stdIn.nextInt(); // その値をbとおく

        int z = 0;
        if(a>b){
            z = b;
            while(z <= a){
                System.out.print(z + " ");
                z++;
            }
        }
        else{
            z = a;
            while(z <= b){
                System.out.print(z + " ");
                z++;
            }
        }
        System.out.println("以上");
    }
}