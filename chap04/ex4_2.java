// カレンダを表示する hori kousuke

import java.util.Scanner;
import java.util.Calendar; // カレンダをインポート
import java.util.Collections;

class ex4_2 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int a = 0;
        int b = 0;

        do {
            System.out.print("年を入力してください："); // 年を入力する
            a = stdIn.nextInt(); // その値をaとおく
        } while (a <= 0); // 紀元以前は例外とする
        do {
            System.out.print("月を入力してください："); // 月を入力する
            b = stdIn.nextInt(); // その値をbとおく
        } while (b <= 0 || b >= 13); // 月は範囲内で選ぶ

        String[] week = {"Su","Mo","Tu","We","Th","Fr","Sa"}; // 曜日配列
        Calendar cl = Calendar.getInstance(); // カレンダ変数
        int fD = 1; // 初日
        cl.set(a,b-1,fD);
        int fDW = cl.get(Calendar.DAY_OF_WEEK) - 1; 
		int lD = cl.getActualMaximum(Calendar.DAY_OF_MONTH); // ラストデイ

        System.out.println(a + "年" + b + "月のカレンダー");
        for (int i = 0; i < week.length; i++) {
            System.out.printf("%2s ",week[i]); // 曜日表示
        }
        System.out.println();
        System.out.print(String.join("", Collections.nCopies(fDW, "   ")));
        for (int i = fD; i <= lD; i++) { // 日付を出力
			System.out.printf("%2d ",i);
			if ((fDW + i) % 7 == 0) {
				System.out.println();
			}			
        }
        System.out.println();
    }
}