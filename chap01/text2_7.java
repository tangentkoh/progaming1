// 条件に合う乱数を三つ表示

import java.util.Random;

class text2_7 {

    public static void main(String[] args) {
        Random rand = new Random();
        Random rand2 = new Random();
        Random rand3 = new Random(); // 乱数を準備

        int num = rand.nextInt(9) + 1; // 0から8に1を足す
        int num2 = (rand.nextInt(9) + 1) * -1; // 上記に-1をかける
        int num3 = rand.nextInt(90) + 10; // 0から89に10を足す
        
        System.out.println("ランダム整数生成");
        System.out.println("一桁の正の整数値は" + num + "です。");
        System.out.println("一桁の負の整数値は" + num2 + "です。");
        System.out.println("二桁の正の整数値は" + num3 + "です。"); // 結果
    }
}
