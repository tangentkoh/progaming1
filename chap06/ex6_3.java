// 小町算(チャレンジ問題) hori kohsuke

import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class ex6_3 {
        public static void main(String[] args) {
        List<String> results = new ArrayList<>();
        char[] opes = {'+', '-', '*', ' '}; // 4パターン
        
        genex("1", 2, opes, results); // 再帰の利用（下に関数）
        
        int count = 0;
        for (String exp : results) { // 結果の出力（下に関数）
            if (evalx(exp) == 100) {
                System.out.println(exp + " = 100");
                count++;
            }
        }
        System.out.println("全部で" + count + "個です。");
    }

    // 再帰的に式を生成する関数
    private static void genex(String cur, int num, char[] opes, List<String> results) {
        if (num > 9) {
            results.add(cur);
            return;
        }
        for (char op : opes) {
            genex(cur + op + num, num + 1, opes, results); // とりあえず文字列
        }
    }

    // 式を評価する関数
    private static int evalx(String Z) {
        String expr = Z.replaceAll(" ", ""); // 空白を除去する（置き換え）
        List<Integer> numbers = new ArrayList<>();
        List<Character> ops = new ArrayList<>();
        int num = 0;

        // 数字と演算子を分離しておく
        for (char ch : expr.toCharArray()) {
            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            } else {
                numbers.add(num);
                ops.add(ch);
                num = 0;
            }
        }
        numbers.add(num); // 最後の数字を追加（9）
        
        // 優先順位を考慮し、まず積を計算
        for (int i = 0; i < ops.size(); ) {
            if (ops.get(i) == '*') {
                int result = numbers.get(i) * numbers.get(i + 1);
                numbers.set(i, result);
                numbers.remove(i + 1);
                ops.remove(i);
            } else {
                i++;
            }
        }
        // 次に + と - を計算
        int result = numbers.get(0);
        for (int i = 0; i < ops.size(); i++) {
            char op = ops.get(i);
            int nextNum = numbers.get(i + 1);
            if (op == '+') {
                result += nextNum;
            } else if (op == '-') {
                result -= nextNum;
            }
        }
        return result;
    }
}