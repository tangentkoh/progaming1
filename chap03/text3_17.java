// じゃんけん生成

import java.util.Random;

class text3_17 {

    public static void main(String[] args) {
        Random rand = new Random();

        int num = rand.nextInt(3); // 乱数

        switch (num) {
            case 0: System.out.println("グー"); break;
            case 1: System.out.println("チョキ"); break;
            case 2: System.out.println("パー"); break; // ハンドを出す
        }
    }
}