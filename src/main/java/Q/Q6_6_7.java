import java.io.*;

public class Q6_6_7 {
    public static void main(String[] args) throws IOException {
        /* 入力の準備 */
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        /* 定数と配列と変数の宣言 */
        final String VACANT = "*";                      //空き情報
        final int ELEMENT = 10;                         //配列要素数
        String[] arrayReserve = new String[ELEMENT];    //予約テーブル
        int idx;                                        //配列の指標

        /* 人数(n)の入力 */
        System.out.print("予約人数(0-10)>");
        int n = Integer.parseInt(br.readLine());

        /* 人数分の名前を設定 */
        for (idx = 0; idx < n; idx++) {
            System.out.print("予約者>");
            arrayReserve[idx] = br.readLine();          //名前の設定
        }

        /* 残りを空き情報に設定 */
        for ( idx = n; idx < arrayReserve.length; idx++) {
            arrayReserve[idx] = VACANT;                 //空き情報の設定
        }
        /* 予約者リストの表示 */
        System.out.println("予約者リスト");
        for (idx = 0; idx < arrayReserve.length; idx++) {
            System.out.print(arrayReserve[idx] + "\t");
        }
        System.out.println();
    }
}
