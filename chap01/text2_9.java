// 条件に合う乱数を三つ表示2

import java.util.Random;

class text2_9 {

    public static void main(String[] args) {
        Random rand = new Random();
        Random rand2 = new Random();
        Random rand3 = new Random(); // 乱数を準備

        double num = rand.nextDouble(1.0); // 0.0から1.0
        double num2 = rand.nextDouble(10.0); // 0.0から10.0
        double num3 = rand.nextDouble(2.0) - 1; // 0.0から2.0より1をひく

        double xnum = ((double)Math.round(num * 10))/10;
        double xnum2 = ((double)Math.round(num2 * 10))/10;
        double xnum3 = ((double)Math.round(num3 * 10))/10; // 小数点調整(1桁)
        
        System.out.println("ランダム実数生成");
        System.out.println("0.0以上1.0未満は" + xnum + "です。");
        System.out.println("0.0以上10.0未満は" + xnum2 + "です。");
        System.out.println("-1.0以上1.0未満は" + xnum3 + "です。"); // 結果
    }
}