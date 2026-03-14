// 季節判定無限編

import java.util.Scanner;

class text4_19 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int m = 0;
        int r = 1; // 繰り返し用変数

        do {
            do{
            System.out.print("季節を求めます。\n何月ですか？");
            m = stdIn.nextInt(); // その値をmとおく
            } while (m<=0||m>=13);

            if (m >= 3 && m <= 5) {System.out.println("春ですよー");}
            else if (m >= 6 && m <= 8) {System.out.println("夏です");}
            else if (m >= 9 && m <= 11) {System.out.println("秋です");}
            else {System.out.println("冬です");}

            System.out.println("もう一度？ 1-yes/0-no");
            r = stdIn.nextInt(); // その値をrとおく
        } while(r==1); // 1ならばループ
    }
}