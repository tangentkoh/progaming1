// チャレンジ問題を解く hori kousuke

import java.util.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ex5_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startA = 0;
        int startB = 0;
        int lim = 0;
        // 最上位桁を選択してもらう
        System.out.println("条件を満たす掛け算を見つけます。");
        do {
            System.out.print("最上位桁一つ目: ");
            startA = scanner.nextInt(); // Aとする
            System.out.print("最上位桁二つ目: ");
            startB = scanner.nextInt(); // Bとする
        } while(startA == startB && startA>0 && startA<10 && startB>0 && startB<10); // 同値でない一桁の自然数

        do {
            System.out.print("いくつ出力しますか: ");
            lim = scanner.nextInt();
        } while(lim<0); // 最低一つ

        List<String> results = find(startA, startB, lim);
        if (results.isEmpty()) {
            System.out.println("条件を満たす結果が見つかりません。");
        } else {
            for (String result : results) {
                System.out.println(result);
            }
        }
    }

    public static List<String> find(int startA, int startB, int lim) {
        List<String> results = new ArrayList<>();
        // Aの上位桁をstartAで固定
        for (int a = startA * 10000; a < (startA + 1) * 10000; a++) {
            if (!onlynumber(a)) continue; // Aが重複したらスキップ
            // Bの上位桁をstartBで固定
            for (int b = startB * 10000; b < (startB + 1) * 10000; b++) {
                if (!onlynumber(b)) continue; // Bが重複したらスキップ
                long c = (long) a * b;
                // Cが10桁かつ条件を満たすなら結果に追加
                if (c >= 1_000_000_000L && c < 10_000_000_000L && isOK(a, b, c)) {
                    results.add(a + " * " + b + " = " + c);
                    if (results.size() >= lim) return results; // 制限で高速化
                }
            }
        }
        return results;
    }

    // 数字が一度しか使われていないか確認(AB用)
    private static boolean onlynumber(int num) {
        Set<Character> digits = new HashSet<>();
        for (char digit : String.valueOf(num).toCharArray()) {
            if (!digits.add(digit)) return false;
        }
        return true;
    }

    // AとBまたはCで重複しないか確認
    private static boolean isOK(int a, int b, long c) {
    // AとBを連結して確認
    String abString = a + "" + b;
    if (!unique(abString)) return false;
    // Cの数字も確認
    String cString = String.valueOf(c);
    if (!unique(cString)) return false;
    // 条件をすべて満たすならtrue
    return true;
    }

    // 文字列の各桁を確認(全体用)
    private static boolean unique(String num2) {
    Set<Character> digits = new HashSet<>();
    for (char digit : num2.toCharArray()) {
        if (!digits.add(digit)) return false; // 重複あるならfalse
    }
    return true;
    }
}