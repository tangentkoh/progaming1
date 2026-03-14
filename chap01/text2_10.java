// 挨拶システム

import java.util.Scanner;

class text2_10 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("姓："); // 姓を入力する
        String s = stdIn.next(); // それをsとおく
        System.out.print("名："); // 名を入力する
        String t = stdIn.next(); // それをtとおく

        System.out.println("こんにちは" + (s + t) + "さん。"); // 挨拶
    }
}