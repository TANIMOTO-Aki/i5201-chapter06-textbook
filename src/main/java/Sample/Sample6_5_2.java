import java.io.*;

public class Sample6_5_2 {
    public static void main(String[] args) throws IOException {
        /* 入力の準備 */
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        /* 配列と変数の宣言 */
        int[] arrayScore = new int[3];
        int total = 0;

        /* 点数の入力のループ */
        for (int i = 0; i < arrayScore.length; i++) {
            System.out.print("点数を入力＞");
            arrayScore[i] = Integer.parseInt(br.readLine());    //データ入力
            total += arrayScore[i];
        }
        System.out.println("合計：" + total);
    }
}
