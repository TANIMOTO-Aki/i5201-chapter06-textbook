import java.io.*;

public class Q6_5_3 {
    public static void main(String[] args) throws IOException {
        /* 入力の準備 */
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        
        /* 定数と変数の定義 */
        final int N = 5;                                        //処理人数
        String[] arrayName = new String[N];                     //名前
        int[] arrayScore = new int[N];                          //点数

        /* データの入力 */
        for (int i = 0; i < arrayName.length; i++) {
            System.out.print((i+1) + "人目の名前を入力＞");
            arrayName[i] = br.readLine();                       //名前の入力
            System.out.print((i+1) + "人目の点数を入力＞");
            arrayScore[i] = Integer.parseInt(br.readLine());    //点数の入力
        }

        /* データの表示 */
        for (int i = 0; i < arrayName.length; i++) {
            System.out.print(arrayName[i] + "さん ");           //名前の表示
            System.out.println(arrayScore[i] + "点 ");          //点数の表示
        }
    }
}
