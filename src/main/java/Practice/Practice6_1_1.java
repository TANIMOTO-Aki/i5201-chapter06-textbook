import java.io.*;

public class Practice6_1_1 {
    public static void main(String[] args) throws IOException {
        /* 入力の準備 */
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        
        /* 配列と変数の宣言 */
        int[] arrayDenomi = 
            { 10000, 5000, 2000, 1000, 500, 100, 50, 10, 5, 1 };
        int[] arraySheet = new int[10];

        /* 金額入力の表示 */
        System.out.print("金額>");
        int amount = Integer.parseInt(br.readLine());

        /* 金種の計算 */
        for (int i = 0; i < arrayDenomi.length; i++) {
            arraySheet[i] = amount / arrayDenomi[i];
            amount %= arrayDenomi[i];
        }

        /* 金種の表示 */
        for (int i = 0; i < arrayDenomi.length; i++) {
            System.out.println(arrayDenomi[i] + "\t" + arraySheet[i]);
        }
    }
}
